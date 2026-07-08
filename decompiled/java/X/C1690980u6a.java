package X;

import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690980u6a implements InterfaceC1690480u5m {
    public final AbstractC1690640u62 LIZ;
    public final AbstractC1691020u6e<C1691030u6f> LIZIZ;
    public final InterfaceC1691130u6p LIZJ;
    public final C1691170u6t LIZLLL = C1691170u6t.LIZ;

    @Override // X.InterfaceC1690480u5m
    public final /* synthetic */ Object LJ(int i) {
        return null;
    }

    @Override // X.InterfaceC1690480u5m
    public final int getItemCount() {
        return this.LIZIZ.LJFF().LIZIZ;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1690980u6a)) {
            return false;
        }
        return Intrinsics.LJFF(this.LIZIZ, ((C1690980u6a) obj).LIZIZ);
    }

    public C1690980u6a(AbstractC1690640u62 abstractC1690640u62, C1691010u6d c1691010u6d, C1691070u6j c1691070u6j) {
        this.LIZ = abstractC1690640u62;
        this.LIZIZ = c1691010u6d;
        this.LIZJ = c1691070u6j;
    }

    @Override // X.InterfaceC1690480u5m
    public final void LJI(int i, Object obj, InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIIJZLJL(-1201380429);
        C1697340uGq.LIZ(obj, i, this.LIZ.LJJIIJ, C13Z4.LIZJ(1142237095, new AwS181S0101000_25(this, i, 92), interfaceC1680500tpg), interfaceC1680500tpg, 3072);
        interfaceC1680500tpg.LJ();
    }
}
