package X;

import Y.ARunnableS82S0200000_13;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.19Id, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21515719Id {
    public static final /* synthetic */ int LJFF = 0;
    public final C19EG LIZ;
    public final View LIZIZ;
    public int LIZJ;
    public final CopyOnWriteArrayList<InterfaceC21515819Ie> LIZLLL;
    public C21516219Ii LJ;

    public final void LIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("height update: ");
        sbLIZ.append(i);
        C1706630uVp.LIZ("KeyBoardUtils", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<InterfaceC21515819Ie> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ();
        }
    }

    public C21515719Id(C19EG c19eg, Lifecycle lifecycle) {
        this.LIZ = c19eg;
        View view = new View(c19eg);
        this.LIZIZ = view;
        this.LIZLLL = new CopyOnWriteArrayList<>();
        int i = c19eg.getWindow().getAttributes().softInputMode & 240;
        if (i != 16 && i != 32) {
            final PopupWindow popupWindow = new PopupWindow(c19eg);
            popupWindow.setWidth(0);
            C786410Ut5.W5(this.LIZIZ, new ViewGroup.LayoutParams(0, -1));
            popupWindow.setContentView(view);
            popupWindow.setSoftInputMode(21);
            popupWindow.setInputMethodMode(1);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setTouchable(false);
            HandlerHook.viewPost(c19eg.getWindow().getDecorView(), new ARunnableS82S0200000_13(this, popupWindow, 13));
            if (lifecycle != null) {
                lifecycle.addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.effectcreatormobile.infrastructure.utils.KeyboardUtils$1$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            onDestroy();
                        }
                    }

                    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                    private final void onDestroy() {
                        popupWindow.dismiss();
                        this.getClass();
                    }
                });
            }
            C786410Ut5.x3(view.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC21523919Lh(this, new C118300cf(), 0));
        }
    }
}
