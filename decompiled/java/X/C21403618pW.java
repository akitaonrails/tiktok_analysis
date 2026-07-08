package X;

import android.graphics.Typeface;

/* JADX INFO: renamed from: X.18pW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21403618pW {
    public final C20139713r9 LIZ;
    public final char[] LIZIZ;
    public final C21403918pZ LIZJ = new C21403918pZ(1024);
    public final Typeface LIZLLL;

    public C21403618pW(Typeface typeface, C20139713r9 c20139713r9) {
        int i;
        int i2;
        boolean z;
        this.LIZLLL = typeface;
        this.LIZ = c20139713r9;
        int iLIZ = c20139713r9.LIZ(6);
        if (iLIZ != 0) {
            int i3 = iLIZ + c20139713r9.LIZ;
            i = c20139713r9.LIZIZ.getInt(i3 + c20139713r9.LIZIZ.getInt(i3));
        } else {
            i = 0;
        }
        this.LIZIZ = new char[i * 2];
        int iLIZ2 = c20139713r9.LIZ(6);
        if (iLIZ2 != 0) {
            int i4 = iLIZ2 + c20139713r9.LIZ;
            int i5 = c20139713r9.LIZIZ.getInt(i4 + c20139713r9.LIZIZ.getInt(i4));
            for (int i6 = 0; i6 < i5; i6++) {
                C21403818pY c21403818pY = new C21403818pY(this, i6);
                C21404718ph c21404718phLIZJ = c21403818pY.LIZJ();
                int iLIZ3 = c21404718phLIZJ.LIZ(4);
                if (iLIZ3 != 0) {
                    i2 = c21404718phLIZJ.LIZIZ.getInt(iLIZ3 + c21404718phLIZJ.LIZ);
                } else {
                    i2 = 0;
                }
                Character.toChars(i2, this.LIZIZ, i6 * 2);
                if (c21403818pY.LIZIZ() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                C08IF.LIZ("invalid metadata codepoint length", z);
                this.LIZJ.LIZ(c21403818pY, 0, c21403818pY.LIZIZ() - 1);
            }
        }
    }
}
