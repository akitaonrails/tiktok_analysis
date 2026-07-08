package X;

import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;

/* JADX INFO: renamed from: X.194A, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C194A {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final CMPreviewInfo LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    public C194A(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, CMPreviewInfo cMPreviewInfo, boolean z6, boolean z7) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = cMPreviewInfo;
        this.LJII = z6;
        this.LJIIIIZZ = z7;
    }

    public static C194A LIZ(C194A c194a, int i, boolean z, boolean z2, boolean z3, boolean z4, CMPreviewInfo cMPreviewInfo, boolean z5, boolean z6, int i2) {
        boolean z7;
        boolean z8 = z6;
        boolean z9 = z5;
        CMPreviewInfo cMPreviewInfo2 = cMPreviewInfo;
        boolean z10 = z4;
        boolean z11 = z3;
        boolean z12 = z2;
        boolean z13 = z;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c194a.LIZ;
        }
        if ((i2 & 2) != 0) {
            z13 = c194a.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z7 = c194a.LIZJ;
        } else {
            z7 = false;
        }
        if ((i2 & 8) != 0) {
            z12 = c194a.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            z11 = c194a.LJ;
        }
        if ((i2 & 32) != 0) {
            z10 = c194a.LJFF;
        }
        if ((i2 & 64) != 0) {
            cMPreviewInfo2 = c194a.LJI;
        }
        if ((i2 & 128) != 0) {
            z9 = c194a.LJII;
        }
        if ((i2 & 256) != 0) {
            z8 = c194a.LJIIIIZZ;
        }
        c194a.getClass();
        return new C194A(i3, z13, z7, z12, z11, z10, cMPreviewInfo2, z9, z8);
    }
}
