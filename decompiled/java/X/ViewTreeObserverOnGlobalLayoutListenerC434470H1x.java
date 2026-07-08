package X;

import Y.ARunnableS75S0200000_6;
import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0H1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC434470H1x extends C214906198m implements ViewTreeObserver.OnGlobalLayoutListener {
    public final Activity LL;
    public final Function0<Integer> LLILLJJLI;
    public final View LLILLL;
    public int LLILZ;
    public final ArrayList<InterfaceC434480H1y> LLILZIL;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.LLILLL.getWindowVisibleDisplayFrame(rect);
        int iIntValue = this.LLILLJJLI.invoke().intValue();
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        int i = iIntValue - rect.bottom;
        if (i < 0) {
            i = 0;
        }
        boolean z = i > Math.max((int) (((float) iIntValue) * 0.15f), (int) (this.LL.getResources().getDisplayMetrics().density * ((float) 100)));
        if (i != this.LLILZ) {
            Iterator<InterfaceC434480H1y> it2 = this.LLILZIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(i, z);
            }
        }
        this.LLILZ = i;
    }

    public final void onResume() {
        View viewFindViewById = this.LL.findViewById(R.id.content);
        if (viewFindViewById != null) {
            HandlerHook.viewPost(viewFindViewById, new ARunnableS75S0200000_6(viewFindViewById, this, 100));
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC434470H1x(Activity activity, Function0<Integer> function0) {
        super(activity);
        this.LL = activity;
        this.LLILLJJLI = function0;
        View view = new View(activity);
        this.LLILLL = view;
        this.LLILZ = -1;
        this.LLILZIL = new ArrayList<>();
        setContentView(view);
        setSoftInputMode(21);
        setInputMethodMode(1);
        setWidth(0);
        setHeight(-1);
        setWindowLayoutType(1003);
    }
}
