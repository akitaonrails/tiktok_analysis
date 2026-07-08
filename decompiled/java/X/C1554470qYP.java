package X;

import android.view.View;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.hybrid.spark.third.container.SparkThirdPopUp;

/* JADX INFO: renamed from: X.0qYP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1554470qYP implements C0TVI {
    public final int $t;
    public Object l0;

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        switch (this.$t) {
            case 0:
                return onApplyWindowInsets$0(this, view, c20246014Ju);
            case 1:
                return onApplyWindowInsets$1(this, view, c20246014Ju);
            case 2:
                return onApplyWindowInsets$2(this, view, c20246014Ju);
            default:
                return null;
        }
    }

    public C1554470qYP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final C20246014Ju onApplyWindowInsets$0(C1554470qYP c1554470qYP, View view, C20246014Ju c20246014Ju) {
        SparkPopup sparkPopup = (SparkPopup) c1554470qYP.l0;
        sparkPopup.LLJLL = c20246014Ju;
        return sparkPopup.OR(view, c20246014Ju);
    }

    public static final C20246014Ju onApplyWindowInsets$1(C1554470qYP c1554470qYP, View view, C20246014Ju c20246014Ju) {
        SparkThirdPopUp sparkThirdPopUp = (SparkThirdPopUp) c1554470qYP.l0;
        sparkThirdPopUp.LLJJJJ = c20246014Ju;
        return sparkThirdPopUp.MR(view, c20246014Ju);
    }

    public static final C20246014Ju onApplyWindowInsets$2(C1554470qYP c1554470qYP, View view, C20246014Ju c20246014Ju) {
        C1541970qEF c1541970qEF = (C1541970qEF) c1554470qYP.l0;
        int i = c20246014Ju.LIZ(2).LIZLLL;
        if (i < 0) {
            i = 0;
        }
        c1541970qEF.LJII = Integer.valueOf(i);
        ((C1541970qEF) c1554470qYP.l0).LIZIZ();
        return c20246014Ju;
    }
}
