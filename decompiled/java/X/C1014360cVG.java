package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0cVG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014360cVG {
    public final C1014410cVL LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final Rect LIZ() {
        C1014410cVL c1014410cVL = this.LIZ;
        int[] iArr = c1014410cVL.LIZ;
        int i = c1014410cVL.LIZIZ;
        int i2 = c1014410cVL.LIZJ;
        int i3 = iArr[0];
        int i4 = iArr[1];
        return new Rect(i3, i4, i + i3, i2 + i4);
    }

    public C1014360cVG(C1014410cVL c1014410cVL, String str, String str2, int i) {
        this.LIZ = c1014410cVL;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
    }
}
