package X;

import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690970u6Z implements InterfaceC1690430u5h {
    public final C1690080u58 LIZ;
    public final C1691000u6c LIZIZ;
    public final C1689780u4e LIZJ;
    public final InterfaceC1691130u6p LIZLLL;

    @Override // X.InterfaceC1690430u5h
    public final C1688450u2V LIZJ() {
        C1688450u2V c1688450u2V = this.LIZIZ.LIZIZ;
        return c1688450u2V == null ? C1689960u4w.LIZ : c1688450u2V;
    }

    @Override // X.InterfaceC1690480u5m
    public final int getItemCount() {
        return this.LIZIZ.LJFF().LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    @Override // X.InterfaceC1690430u5h
    public final InterfaceC1691130u6p LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1690430u5h
    public final C1689780u4e LJII() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1690480u5m
    public final int LIZ(Object obj) {
        return this.LIZLLL.LIZ(obj);
    }

    @Override // X.InterfaceC1690480u5m
    public final Object LIZLLL(int i) {
        Object objLIZLLL = this.LIZLLL.LIZLLL(i);
        if (objLIZLLL == null) {
            return this.LIZIZ.LJI(i);
        }
        return objLIZLLL;
    }

    @Override // X.InterfaceC1690480u5m
    public final Object LJ(int i) {
        C1691050u6h c1691050u6hLIZJ = this.LIZIZ.LJFF().LIZJ(i);
        return ((InterfaceC1691090u6l) c1691050u6hLIZJ.LIZJ).getType().invoke(Integer.valueOf(i - c1691050u6hLIZJ.LIZ));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1690970u6Z)) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZIZ, ((C1690970u6Z) obj).LIZIZ);
    }

    @Override // X.InterfaceC1690480u5m
    public final void LJI(int i, Object obj, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(-462424778);
        C1697340uGq.LIZ(obj, i, this.LIZ.LJIILLIIL, C13Z4.LIZJ(-824725566, new AwS181S0101000_25(this, i, 76), interfaceC1680500tpg), interfaceC1680500tpg, 3072);
        interfaceC1680500tpg.LJ();
    }

    public C1690970u6Z(C1690080u58 c1690080u58, C1691000u6c c1691000u6c, C1689780u4e c1689780u4e, C1691070u6j c1691070u6j) {
        this.LIZ = c1690080u58;
        this.LIZIZ = c1691000u6c;
        this.LIZJ = c1689780u4e;
        this.LIZLLL = c1691070u6j;
    }
}
