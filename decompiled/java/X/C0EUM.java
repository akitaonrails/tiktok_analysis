package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EUM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EUM {
    public final int LIZ;
    public final int LIZIZ;
    public final C0EF5 LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;

    public C0EUM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EUM)) {
            return false;
        }
        C0EUM c0eum = (C0EUM) obj;
        return this.LIZ == c0eum.LIZ && this.LIZIZ == c0eum.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0eum.LIZJ) && this.LIZLLL == c0eum.LIZLLL && this.LJ == c0eum.LJ && this.LJFF == c0eum.LJFF && this.LJI == c0eum.LJI && this.LJII == c0eum.LJII && this.LJIIIIZZ == c0eum.LJIIIIZZ && this.LJIIIZ == c0eum.LJIIIZ;
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        C0EF5 c0ef5 = this.LIZJ;
        return ((((((((((((((i + (c0ef5 == null ? 0 : c0ef5.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AdjustFilterPanelSceneState(scrollPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectItemPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slideBarData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showRetry=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showAdjustPreview=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", resetEnable=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", showAdjustSlide=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", adjustSlideEnable=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", scrollPositionWithOffset=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0EUM(int i) {
        this(-1, -1, null, false, false, false, false, false, false, -1);
    }

    public C0EUM(int i, int i2, C0EF5 c0ef5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = c0ef5;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
        this.LJI = z4;
        this.LJII = z5;
        this.LJIIIIZZ = z6;
        this.LJIIIZ = i3;
    }

    public static C0EUM LIZ(C0EUM c0eum, int i, int i2, C0EF5 c0ef5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, int i4) {
        int i5 = i3;
        boolean z7 = z6;
        boolean z8 = z5;
        boolean z9 = z4;
        boolean z10 = z3;
        boolean z11 = z2;
        boolean z12 = z;
        C0EF5 c0ef52 = c0ef5;
        int i6 = i2;
        int i7 = i;
        if ((i4 & 1) != 0) {
            i7 = c0eum.LIZ;
        }
        if ((i4 & 2) != 0) {
            i6 = c0eum.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            c0ef52 = c0eum.LIZJ;
        }
        if ((i4 & 8) != 0) {
            z12 = c0eum.LIZLLL;
        }
        if ((i4 & 16) != 0) {
            z11 = c0eum.LJ;
        }
        if ((i4 & 32) != 0) {
            z10 = c0eum.LJFF;
        }
        if ((i4 & 64) != 0) {
            z9 = c0eum.LJI;
        }
        if ((i4 & 128) != 0) {
            z8 = c0eum.LJII;
        }
        if ((i4 & 256) != 0) {
            z7 = c0eum.LJIIIIZZ;
        }
        if ((i4 & 512) != 0) {
            i5 = c0eum.LJIIIZ;
        }
        c0eum.getClass();
        return new C0EUM(i7, i6, c0ef52, z12, z11, z10, z9, z8, z7, i5);
    }
}
