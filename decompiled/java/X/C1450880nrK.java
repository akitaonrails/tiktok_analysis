package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0nrK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450880nrK {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(float f, int i, float f2, int i2) {
        int i3;
        int iLIZJ = (i2 - C1450870nrJ.LJFF) - ((int) C12ES.LIZJ(190.0f, C0CHQ.LIZ));
        int iLIZJ2 = i - ((int) C12ES.LIZJ(32.0f, C0CHQ.LIZ));
        float f3 = iLIZJ2;
        float f4 = iLIZJ;
        if (f2 > f3 / f4) {
            i3 = (int) (f3 / f2);
        } else {
            iLIZJ2 = (int) (f4 * f2);
            i3 = iLIZJ;
        }
        if (f > f2) {
            i3 = (int) (iLIZJ2 / f);
        } else {
            iLIZJ2 = (int) (f * i3);
        }
        int i4 = (i - iLIZJ2) / 2;
        int i5 = (((iLIZJ - i3) / 2) + C1450870nrJ.LJFF) - C1450870nrJ.LJ;
        return new Rect(i4, i5, iLIZJ2 + i4, i3 + i5);
    }
}
