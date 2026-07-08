package X;

import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u6Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690960u6Y implements InterfaceC1690440u5i {
    public final C1690050u55 LIZ;
    public final C1690990u6b LIZIZ;
    public final InterfaceC1691130u6p LIZJ;

    @Override // X.InterfaceC1690440u5i
    public final C1688450u2V LIZJ() {
        this.LIZIZ.getClass();
        return C1689960u4w.LIZ;
    }

    @Override // X.InterfaceC1690440u5i
    public final C1690940u6W LJFF() {
        return this.LIZIZ.LIZ;
    }

    @Override // X.InterfaceC1690480u5m
    public final int getItemCount() {
        return this.LIZIZ.LJFF().LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    @Override // X.InterfaceC1690440u5i
    public final InterfaceC1691130u6p LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1690480u5m
    public final int LIZ(Object obj) {
        return this.LIZJ.LIZ(obj);
    }

    @Override // X.InterfaceC1690480u5m
    public final Object LIZLLL(int i) {
        Object objLIZLLL = this.LIZJ.LIZLLL(i);
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
        if (!(obj instanceof C1690960u6Y)) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZIZ, ((C1690960u6Y) obj).LIZIZ);
    }

    public C1690960u6Y(C1690050u55 c1690050u55, C1690990u6b c1690990u6b, C1691070u6j c1691070u6j) {
        this.LIZ = c1690050u55;
        this.LIZIZ = c1690990u6b;
        this.LIZJ = c1691070u6j;
    }

    @Override // X.InterfaceC1690480u5m
    public final void LJI(int i, Object obj, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(1493551140);
        C1697340uGq.LIZ(obj, i, this.LIZ.LJIILLIIL, C13Z4.LIZJ(726189336, new AwS181S0101000_25(this, i, 80), interfaceC1680500tpg), interfaceC1680500tpg, 3072);
        interfaceC1680500tpg.LJ();
    }
}
