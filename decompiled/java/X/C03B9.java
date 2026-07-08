package X;

import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.03B9, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03B9 {
    public static final void LIZ(SpannableStringBuilder spannableStringBuilder, C03B3 c03b3, int i, int i2) {
        ColorDrawable colorDrawable;
        int iLIZ;
        int iLIZ2;
        Integer num = c03b3.LIZJ;
        if (num != null) {
            colorDrawable = new ColorDrawable(num.intValue());
        } else {
            colorDrawable = new ColorDrawable();
        }
        if (c03b3.LIZ != null) {
            iLIZ = C0H9I.LIZ(r0.intValue());
        } else {
            iLIZ = 0;
        }
        if (c03b3.LIZIZ != null) {
            iLIZ2 = C0H9I.LIZ(r0.intValue());
        } else {
            iLIZ2 = 0;
        }
        colorDrawable.setBounds(0, 0, iLIZ, iLIZ2);
        C786410Ut5.q2(spannableStringBuilder, new C419890GdH(colorDrawable, c03b3.LIZLLL), i, i2, 33);
    }
}
