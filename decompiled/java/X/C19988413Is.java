package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.13Is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19988413Is {
    public static final Object LIZ(AbstractC19987213Ig abstractC19987213Ig, InterfaceC19984213Hc interfaceC19984213Hc, final C1336140ksG c1336140ksG) {
        C19987813Im c19987813Im;
        final char[] cArrLIZ = C13JO.LIZJ.LIZ(16384);
        if (!abstractC19987213Ig.LIZ.LJIILJJIL) {
            c19987813Im = new C19987813Im(c1336140ksG, cArrLIZ);
        } else {
            c19987813Im = new C19987813Im(c1336140ksG, cArrLIZ) { // from class: X.13Ip
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
                
                    r10.LIZ = r9;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
                
                    return r9;
                 */
                @Override // X.C19987813Im, X.AbstractC19987713Il
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final int LJJI() {
                    /*
                        Method dump skipped, instruction units count: 225
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C19988113Ip.LJJI():int");
                }

                @Override // X.C19987813Im, X.AbstractC19987713Il
                public final boolean LIZJ() {
                    LJIILIIL();
                    int iLJJI = LJJI();
                    C13EK c13ek = this.LJII;
                    if (iLJJI >= c13ek.LLILLJJLI || iLJJI == -1) {
                        return false;
                    }
                    return AbstractC19987713Il.LJIJI(c13ek.LL[iLJJI]);
                }

                @Override // X.C19987813Im, X.AbstractC19987713Il
                public final byte LJFF() {
                    LJIILIIL();
                    C13EK c13ek = this.LJII;
                    int iLJJI = LJJI();
                    if (iLJJI >= c13ek.LLILLJJLI || iLJJI == -1) {
                        return (byte) 10;
                    }
                    this.LIZ = iLJJI + 1;
                    return C13JC.LIZ(c13ek.LL[iLJJI]);
                }

                @Override // X.AbstractC19987713Il
                public final byte LJIJJLI() {
                    LJIILIIL();
                    C13EK c13ek = this.LJII;
                    int iLJJI = LJJI();
                    if (iLJJI >= c13ek.LLILLJJLI || iLJJI == -1) {
                        return (byte) 10;
                    }
                    this.LIZ = iLJJI;
                    return C13JC.LIZ(c13ek.LL[iLJJI]);
                }

                @Override // X.C19987813Im, X.AbstractC19987713Il
                public final void LJII(char c) {
                    LJIILIIL();
                    C13EK c13ek = this.LJII;
                    int iLJJI = LJJI();
                    if (iLJJI < c13ek.LLILLJJLI && iLJJI != -1) {
                        char c2 = c13ek.LL[iLJJI];
                        this.LIZ = iLJJI + 1;
                        if (c2 == c) {
                            return;
                        }
                        LJJIIJ(c);
                        throw null;
                    }
                    this.LIZ = -1;
                    LJJIIJ(c);
                    throw null;
                }
            };
        }
        try {
            Object objLIZLLL = new C19987413Ii(abstractC19987213Ig, EnumC19987013Ie.OBJ, c19987813Im, interfaceC19984213Hc.getDescriptor(), null).LIZLLL(interfaceC19984213Hc);
            c19987813Im.LJIILJJIL();
            c19987813Im.LJJIIZ();
            return objLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c19987813Im.LJJIIZ();
            throw th;
        }
    }
}
