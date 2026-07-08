package X;

import Y.ARunnableS77S0200000_8;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC581010MqZ implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC581010MqZ viewTreeObserverOnGlobalLayoutListenerC581010MqZ) {
        C786410Ut5.C3(((RecyclerView) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC581010MqZ);
        ((C569640MVu) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l1).LLLLIL().LIZIZ.invoke(Boolean.TRUE);
        if (!((Collection) ((Pair) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l2).getFirst()).isEmpty()) {
            ((C569640MVu) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l1).LLLLIL().LIZJ.invoke(Integer.valueOf(((View) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l3).getHeight()));
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC581010MqZ viewTreeObserverOnGlobalLayoutListenerC581010MqZ) {
        FrameLayout.LayoutParams layoutParams;
        C786410Ut5.C3(((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC581010MqZ);
        double dLIZ = ((double) C1415610mwR.LIZ()) * 0.4d;
        if (((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l0).getHeight() > dLIZ) {
            ViewGroup.LayoutParams layoutParams2 = ((LinearLayout) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l0).getLayoutParams();
            if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                C0MFD c0mfd = (C0MFD) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l3;
                layoutParams.height = (int) dLIZ;
                C426750GoL.LJIIJ(layoutParams, c0mfd.getContext(), null, null, null, 0, 46);
            }
            ((C21578619ce) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l1).getLayoutParams().height = (int) dLIZ;
            LinearLayout linearLayout = (LinearLayout) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l0;
            HandlerHook.viewPost(linearLayout, new ARunnableS77S0200000_8(linearLayout, (C21578619ce) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l1, 30));
            C375780EoK.LIZJ(((View) viewTreeObserverOnGlobalLayoutListenerC581010MqZ.l2).findViewById(R.id.xpe), true);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC581010MqZ(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
