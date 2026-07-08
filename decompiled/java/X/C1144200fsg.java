package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: renamed from: X.0fsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1144200fsg extends C21674119s3 {
    public boolean LJIILL;

    public C1144200fsg(Context context) {
        super(context);
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        return 80.0f / displayMetrics.densityDpi;
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        int iLJIIIZ = LJIIIZ(LJIILJJIL(), view);
        int iLJIIJ = LJIIJ(LJIILL(), view);
        int iLJIIL = LJIIL((int) Math.sqrt((iLJIIIZ * iLJIIIZ) + (iLJIIJ * iLJIIJ)));
        if (this.LJIILL) {
            c21675319sF.LIZIZ(-iLJIIIZ, -iLJIIJ, null, 1);
        } else {
            if (iLJIIL <= 0) {
                return;
            }
            c21675319sF.LIZIZ(-iLJIIIZ, -iLJIIJ, this.LJIIIIZZ, iLJIIL);
        }
    }

    @Override // X.C21674119s3
    public final int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
    }
}
