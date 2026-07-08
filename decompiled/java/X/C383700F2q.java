package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0F2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383700F2q {
    public static final void LIZ(C370690Eg7 c370690Eg7, C1331670kl3 c1331670kl3) {
        Integer num = c370690Eg7.LIZ;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = c370690Eg7.LIZIZ;
            if (num2 != null) {
                int iIntValue2 = num2.intValue();
                c1331670kl3.LJIIIIZZ = iIntValue;
                c1331670kl3.LJIIIZ = iIntValue2;
            }
        }
        Bitmap.Config config = c370690Eg7.LIZJ;
        if (config != null) {
            c1331670kl3.LJIL = config;
        }
        if (c370690Eg7.LJ > 0) {
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C366700EZg.LIZ(r0);
            c1331670kl3.LJJI = new C1331730kl9(c1331750klB);
        }
        c1331670kl3.LIZLLL = true;
        Integer num3 = c370690Eg7.LIZLLL;
        if (num3 != null) {
            c1331670kl3.LJJIIZ(num3.intValue());
        }
        c1331670kl3.LJJIIZ = EnumC714850S2h.SMALL;
        c1331670kl3.LJFF = 0;
    }
}
