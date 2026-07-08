package X;

import java.util.List;

/* JADX INFO: renamed from: X.05dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1397905dZ {
    public final List<AbstractC677840QiM> LIZ;
    public final boolean LIZIZ;
    public final C1422405hW LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public C1397905dZ() {
        this(null, false, null, 0, false, false, 127);
    }

    public C1397905dZ(List list, boolean z, C1422405hW c1422405hW, int i, boolean z2, boolean z3, int i2) {
        list = (i2 & 1) != 0 ? C13BV.INSTANCE : list;
        z = (i2 & 2) != 0 ? false : z;
        c1422405hW = (i2 & 4) != 0 ? null : c1422405hW;
        i = (i2 & 8) != 0 ? EnumC1396905dP.UNKNOWN.getValue() : i;
        z2 = (i2 & 16) != 0 ? false : z2;
        z3 = (i2 & 32) != 0 ? false : z3;
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = c1422405hW;
        this.LIZLLL = i;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
