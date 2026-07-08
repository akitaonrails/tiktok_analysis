package X;

import java.util.List;

/* JADX INFO: renamed from: X.0tev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673830tev {
    public final List<C1673800tes> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final List<C1673800tes> LIZLLL;
    public final EnumC992200bvW LJ;

    public C1673830tev(List<C1673800tes> list, int i, boolean z, List<C1673800tes> list2, EnumC992200bvW enumC992200bvW) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = list2;
        this.LJ = enumC992200bvW;
    }

    public static C1673830tev LIZ(C1673830tev c1673830tev, List list, int i, List list2, EnumC992200bvW enumC992200bvW, int i2) {
        boolean z;
        EnumC992200bvW enumC992200bvW2 = enumC992200bvW;
        List list3 = list2;
        int i3 = i;
        List list4 = list;
        if ((i2 & 1) != 0) {
            list4 = c1673830tev.LIZ;
        }
        if ((i2 & 2) != 0) {
            i3 = c1673830tev.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z = c1673830tev.LIZJ;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            list3 = c1673830tev.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            enumC992200bvW2 = c1673830tev.LJ;
        }
        return new C1673830tev(list4, i3, z, list3, enumC992200bvW2);
    }
}
