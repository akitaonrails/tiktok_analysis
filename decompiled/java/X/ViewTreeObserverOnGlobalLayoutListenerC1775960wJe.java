package X;

import Y.ALAdapterS21S0100000_26;
import Y.AUListenerS274S0100000_26;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;

/* JADX INFO: renamed from: X.0wJe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1775960wJe implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

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

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1775960wJe viewTreeObserverOnGlobalLayoutListenerC1775960wJe) {
        View view;
        TuxSheet tuxSheet = ((C1765350w2X) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0).LLILZLL;
        if (tuxSheet != null && (view = tuxSheet.getView()) != null) {
            int measuredHeight = view.getMeasuredHeight();
            Integer numLIZIZ = ((C1765350w2X) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0).LIZIZ();
            if (numLIZIZ != null) {
                int iIntValue = numLIZIZ.intValue();
                if (measuredHeight > 0 && iIntValue > 0) {
                    C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775960wJe);
                    C1765350w2X c1765350w2X = (C1765350w2X) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0;
                    c1765350w2X.LLIZ = measuredHeight;
                    c1765350w2X.LLIZLLLIL = iIntValue;
                    c1765350w2X.LLJILJIL = c1765350w2X.LIZJ(measuredHeight, iIntValue);
                    C1765350w2X c1765350w2X2 = (C1765350w2X) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0;
                    c1765350w2X2.LLJIJIL = C814420VxA.LIZIZ(c1765350w2X2.LLIZ * c1765350w2X2.LLJI);
                    C1765350w2X c1765350w2X3 = (C1765350w2X) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0;
                    c1765350w2X3.getClass();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.setInterpolator(c1765350w2X3.LL);
                    C1765350w2X c1765350w2X4 = (C1765350w2X) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0;
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS274S0100000_26(c1765350w2X4, 12));
                    valueAnimatorOfFloat.addListener(new ALAdapterS21S0100000_26(c1765350w2X4, 9));
                    valueAnimatorOfFloat.start();
                }
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1775960wJe viewTreeObserverOnGlobalLayoutListenerC1775960wJe) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0).isAttachedToWindow() && ((View) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0).getWidth() > 0 && ((View) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0).getHeight() > 0) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775960wJe);
            ((PdpFragment) viewTreeObserverOnGlobalLayoutListenerC1775960wJe.l1).ZS();
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1775960wJe(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
