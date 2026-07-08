package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13Br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19970113Br extends AbstractC19984113Hb {
    public final AbstractC19987713Il LIZIZ;
    public final AbstractC19984913Hj LIZJ;

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final short LJIIL() {
        AbstractC19987713Il abstractC19987713Il = this.LIZIZ;
        String strLJIIJJI = abstractC19987713Il.LJIIJJI();
        try {
            C1507240pKE c1507240pKELIZLLL = C19970013Bq.LIZLLL(strLJIIJJI);
            if (c1507240pKELIZLLL != null) {
                int i = c1507240pKELIZLLL.LL;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) <= 0) {
                    return new C1507270pKH((short) i).LL;
                }
            }
            C2095008Iq.LJIIIZ(strLJIIJJI);
            throw null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse type '");
            sbLIZ.append("UShort");
            sbLIZ.append("' for input '");
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('\'');
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final byte LJJI() {
        AbstractC19987713Il abstractC19987713Il = this.LIZIZ;
        String strLJIIJJI = abstractC19987713Il.LJIIJJI();
        try {
            C1507240pKE c1507240pKELIZLLL = C19970013Bq.LIZLLL(strLJIIJJI);
            if (c1507240pKELIZLLL != null) {
                int i = c1507240pKELIZLLL.LL;
                if (Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) <= 0) {
                    return new C19969613Bm((byte) i).LL;
                }
            }
            C2095008Iq.LJIIIZ(strLJIIJJI);
            throw null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse type '");
            sbLIZ.append("UByte");
            sbLIZ.append("' for input '");
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('\'');
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final long LJJIFFI() {
        AbstractC19987713Il abstractC19987713Il = this.LIZIZ;
        String strLJIIJJI = abstractC19987713Il.LJIIJJI();
        try {
            C19969813Bo c19969813BoLJ = C19970013Bq.LJ(strLJIIJJI);
            if (c19969813BoLJ != null) {
                return c19969813BoLJ.LL;
            }
            C2095008Iq.LJIIIZ(strLJIIJJI);
            throw null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse type '");
            sbLIZ.append("ULong");
            sbLIZ.append("' for input '");
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('\'');
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
    }

    @Override // X.AbstractC19984113Hb, X.C13HB
    public final int LJJIIZ() {
        AbstractC19987713Il abstractC19987713Il = this.LIZIZ;
        String strLJIIJJI = abstractC19987713Il.LJIIJJI();
        try {
            C1507240pKE c1507240pKELIZLLL = C19970013Bq.LIZLLL(strLJIIJJI);
            if (c1507240pKELIZLLL != null) {
                return c1507240pKELIZLLL.LL;
            }
            C2095008Iq.LJIIIZ(strLJIIJJI);
            throw null;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to parse type '");
            sbLIZ.append("UInt");
            sbLIZ.append("' for input '");
            sbLIZ.append(strLJIIJJI);
            sbLIZ.append('\'');
            AbstractC19987713Il.LJIILLIIL(abstractC19987713Il, C2188811AlT.LIZIZ(sbLIZ), 0, null, 6);
            throw null;
        }
    }

    @Override // X.InterfaceC19986313Hx
    public final AbstractC19984913Hj LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC19986313Hx
    public final int LJIJJ(InterfaceC19983313Gt interfaceC19983313Gt) {
        "unsupported".toString();
        throw new IllegalStateException("unsupported");
    }

    public C19970113Br(AbstractC19987713Il abstractC19987713Il, AbstractC19987213Ig abstractC19987213Ig) {
        this.LIZIZ = abstractC19987713Il;
        this.LIZJ = abstractC19987213Ig.LIZIZ;
    }
}
