package X;

import Y.ACListenerS156S0100000_22;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0oGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1466720oGs implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1466720oGs viewTreeObserverOnGlobalLayoutListenerC1466720oGs) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1466720oGs);
        C1414440muY c1414440muY = (C1414440muY) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l0;
        c1414440muY.getClass();
        if (C1414440muY.LIZ(view)) {
            C1414440muY c1414440muY2 = (C1414440muY) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1;
            if (!c1414440muY2.LIZ) {
                c1414440muY2.LIZ = true;
                ((InterfaceC1414430muX) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l2).LJI();
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1466720oGs viewTreeObserverOnGlobalLayoutListenerC1466720oGs) {
        ViewGroup viewGroup;
        C786410Ut5.C3(((RelativeLayout) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1466720oGs);
        C1443060nei c1443060nei = (C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1;
        if (c1443060nei.LLJJ) {
            RelativeLayout relativeLayout = (RelativeLayout) c1443060nei.LLILZ.findViewById(R.id.y5_);
            if (relativeLayout.getHeight() <= ((C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1).LLIZ.getHeight()) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.addRule(15);
                C786410Ut5.e6(relativeLayout, layoutParams);
            }
            if (C123100dR.LIZ(((C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1).LLILZLL.publishFailedString)) {
                C786410Ut5.LJLLLLLL(8, ((View) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l2).findViewById(R.id.xdq));
                return;
            }
            RelativeLayout relativeLayout2 = new RelativeLayout(((C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1).LL);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(relativeLayout.getWidth(), ((C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1).LLILZ.getHeight());
            ImageView imageView = ((C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1).LLIZ;
            if (imageView != null) {
                layoutParams2.addRule(21, imageView.getId());
                C786410Ut5.e6(relativeLayout2, layoutParams2);
                View view = ((C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1).LLILZ;
                if ((view instanceof RelativeLayout) && (viewGroup = (ViewGroup) view) != null) {
                    viewGroup.addView(relativeLayout2, layoutParams2);
                }
                C786410Ut5.S7(relativeLayout2, new ACListenerS156S0100000_22((C1443060nei) viewTreeObserverOnGlobalLayoutListenerC1466720oGs.l1, 67));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1466720oGs(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
