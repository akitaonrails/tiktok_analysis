package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.third.container.SparkThirdPopUp;

/* JADX INFO: renamed from: X.0qYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1554420qYK implements ViewTreeObserver.OnGlobalLayoutListener {
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

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1554420qYK viewTreeObserverOnGlobalLayoutListenerC1554420qYK) {
        SparkThirdPopUp sparkThirdPopUp = (SparkThirdPopUp) viewTreeObserverOnGlobalLayoutListenerC1554420qYK.l0;
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1554420qYK.l1;
        int iLIZ = C1549350qQ9.LIZ(sparkThirdPopUp.n7(), sparkThirdPopUp.getView(), sparkThirdPopUp);
        if (iLIZ != sparkThirdPopUp.LLJJIJIIJIL && !sparkThirdPopUp.LLJJIJI) {
            sparkThirdPopUp.LLJJIJIIJIL = iLIZ;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = sparkThirdPopUp.LLJJIJIL;
            if (onGlobalLayoutListener != null) {
                onGlobalLayoutListener.onGlobalLayout();
            }
            sparkThirdPopUp.LLJJIJI = true;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = sparkThirdPopUp.LLJJIJIL;
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener2, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1554420qYK viewTreeObserverOnGlobalLayoutListenerC1554420qYK) {
        SparkPopup sparkPopup = (SparkPopup) viewTreeObserverOnGlobalLayoutListenerC1554420qYK.l0;
        int iLIZ = C1549340qQ8.LIZ(sparkPopup.WR(), sparkPopup.getView(), sparkPopup);
        SparkPopup sparkPopup2 = (SparkPopup) viewTreeObserverOnGlobalLayoutListenerC1554420qYK.l0;
        if (iLIZ != sparkPopup2.LLJJJJJIL && !sparkPopup2.LLJJJJ) {
            sparkPopup2.LLJJJJJIL = iLIZ;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = sparkPopup2.LLJJJJLIIL;
            if (onGlobalLayoutListener != null) {
                onGlobalLayoutListener.onGlobalLayout();
            }
            ((SparkPopup) viewTreeObserverOnGlobalLayoutListenerC1554420qYK.l0).LLJJJJ = true;
            ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnGlobalLayoutListenerC1554420qYK.l1).getViewTreeObserver();
            if (viewTreeObserver != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = ((SparkPopup) viewTreeObserverOnGlobalLayoutListenerC1554420qYK.l0).LLJJJJLIIL;
                viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
                C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener2, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1554420qYK(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
