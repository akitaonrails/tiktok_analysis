package X;

import java.util.List;

/* JADX INFO: renamed from: X.05dO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1396805dO extends AbstractC1396705dN {
    public final C1422405hW LIZ;
    public final boolean LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<Integer> LJFF;

    public /* synthetic */ C1396805dO(C1422405hW c1422405hW, boolean z, int i, C675150Qe1 c675150Qe1, int i2) {
        this(c1422405hW, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? EnumC1396905dP.REFRESH_FULL_PAGE.getValue() : i, 0, (i2 & 16) != 0 ? null : c675150Qe1, 0, null);
    }

    public C1396805dO(C1422405hW c1422405hW, boolean z, int i, int i2, C675270QeD c675270QeD, int i3, List<Integer> list) {
        this.LIZ = c1422405hW;
        this.LIZIZ = z;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = list;
    }
}
