package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tp5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1680130tp5 implements InterfaceC1680320tpO {
    public final boolean LIZ;
    public final float LIZIZ;
    public final C05P1<C1685910tyP> LIZJ;

    public AbstractC1680130tp5() {
        throw null;
    }

    public abstract AbstractC1683020ttk LIZJ(C0NV4 c0nv4, boolean z, float f, C05P0 c05p0, C05P0 c05p02, InterfaceC1680500tpg interfaceC1680500tpg);

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC1680130tp5)) {
            return false;
        }
        AbstractC1680130tp5 abstractC1680130tp5 = (AbstractC1680130tp5) obj;
        if (this.LIZ == abstractC1680130tp5.LIZ && C1668650tWZ.LIZJ(this.LIZIZ, abstractC1680130tp5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, abstractC1680130tp5.LIZJ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1680320tpO
    public final InterfaceC1680330tpP LIZ(C0NV4 c0nv4, InterfaceC1680500tpg interfaceC1680500tpg) {
        long jLIZIZ;
        interfaceC1680500tpg.LJJIJIIJIL(988743187);
        InterfaceC1680120tp4 interfaceC1680120tp4 = (InterfaceC1680120tp4) interfaceC1680500tpg.LJJIL(C1680110tp3.LIZ);
        interfaceC1680500tpg.LJJIJIIJIL(-1524341038);
        if (this.LIZJ.getValue().LIZ != C1685910tyP.LJIIJ) {
            jLIZIZ = this.LIZJ.getValue().LIZ;
        } else {
            jLIZIZ = interfaceC1680120tp4.LIZIZ(interfaceC1680500tpg);
        }
        interfaceC1680500tpg.LJJIJLIJ();
        AbstractC1683020ttk abstractC1683020ttkLIZJ = LIZJ(c0nv4, this.LIZ, this.LIZIZ, C20028913Yh.LJIIIIZZ(new C1685910tyP(jLIZIZ), interfaceC1680500tpg), C20028913Yh.LJIIIIZZ(interfaceC1680120tp4.LIZ(interfaceC1680500tpg), interfaceC1680500tpg), interfaceC1680500tpg);
        C1680540tpk.LJ(abstractC1683020ttkLIZJ, c0nv4, new C0NVA(c0nv4, abstractC1683020ttkLIZJ, null), interfaceC1680500tpg);
        interfaceC1680500tpg.LJJIJLIJ();
        return abstractC1683020ttkLIZJ;
    }

    public AbstractC1680130tp5(boolean z, float f, C05P0 c05p0) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = c05p0;
    }
}
