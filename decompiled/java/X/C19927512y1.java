package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.protobuf.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.12y1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19927512y1 implements InterfaceC19928112y7 {
    public final TreeMap<Integer, C19918612wa> LL = new TreeMap<>();

    @Override // X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return true;
    }

    @Override // X.InterfaceC19928112y7
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C19927612y2 build() {
        if (this.LL.isEmpty()) {
            return C19927612y2.LLILLJJLI;
        }
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<Integer, C19918612wa> entry : this.LL.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue().LIZJ());
        }
        return new C19927612y2(treeMap);
    }

    public final Object clone() {
        C19927612y2 c19927612y2 = C19927612y2.LLILLJJLI;
        C19927512y1 c19927512y1 = new C19927512y1();
        for (Map.Entry<Integer, C19918612wa> entry : this.LL.entrySet()) {
            c19927512y1.LL.put(entry.getKey(), entry.getValue().clone());
        }
        return c19927512y1;
    }

    @Override // X.InterfaceC19928112y7
    public final InterfaceC19925612xi buildPartial() {
        return build();
    }

    public final C19918612wa LIZIZ(int i) {
        if (i == 0) {
            return null;
        }
        C19918612wa c19918612wa = this.LL.get(Integer.valueOf(i));
        if (c19918612wa == null) {
            int i2 = C19927912y5.LJFF;
            C19918612wa c19918612wa2 = new C19918612wa();
            this.LL.put(Integer.valueOf(i), c19918612wa2);
            return c19918612wa2;
        }
        return c19918612wa;
    }

    public final void LJ(AbstractC19927312xz abstractC19927312xz) {
        int iLJJIJIL;
        do {
            iLJJIJIL = abstractC19927312xz.LJJIJIL();
            if (iLJJIJIL == 0) {
                return;
            }
        } while (LIZLLL(iLJJIJIL, abstractC19927312xz));
    }

    public final void LJFF(C19927612y2 c19927612y2) {
        if (c19927612y2 != C19927612y2.LLILLJJLI) {
            for (Map.Entry<Integer, C19927912y5> entry : c19927612y2.LL.entrySet()) {
                LIZJ(entry.getKey().intValue(), entry.getValue());
            }
        }
    }

    @Override // X.InterfaceC19928112y7
    public final InterfaceC19928112y7 mergeFrom(byte[] bArr) throws C19926612xs {
        try {
            C19927212xy c19927212xyLJIIIIZZ = AbstractC19927312xz.LJIIIIZZ(bArr, 0, bArr.length, false);
            LJ(c19927212xyLJIIIIZZ);
            c19927212xyLJIIIIZZ.LIZ(0);
            return this;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", e2);
        }
    }

    @Override // X.InterfaceC19928112y7
    public final InterfaceC19928112y7 mergeFrom(InterfaceC19925612xi interfaceC19925612xi) {
        if (interfaceC19925612xi instanceof C19927612y2) {
            LJFF((C19927612y2) interfaceC19925612xi);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public final void LIZJ(int i, C19927912y5 c19927912y5) {
        if (i > 0) {
            if (this.LL.containsKey(Integer.valueOf(i))) {
                LIZIZ(i).LJ(c19927912y5);
                return;
            }
            TreeMap<Integer, C19918612wa> treeMap = this.LL;
            Integer numValueOf = Integer.valueOf(i);
            int i2 = C19927912y5.LJFF;
            C19918612wa c19918612wa = new C19918612wa();
            c19918612wa.LJ(c19927912y5);
            treeMap.put(numValueOf, c19918612wa);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" is not a valid field number.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZLLL(int i, AbstractC19927312xz abstractC19927312xz) throws C19926812xu {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 == 5) {
                                C19918612wa c19918612waLIZIZ = LIZIZ(i2);
                                int iLJIIZILJ = abstractC19927312xz.LJIIZILJ();
                                C19927912y5 c19927912y5 = c19918612waLIZIZ.LIZ;
                                if (c19927912y5.LIZIZ == null) {
                                    c19927912y5.LIZIZ = new C19889012ro();
                                }
                                c19918612waLIZIZ.LIZ.LIZIZ.LJJLL(iLJIIZILJ);
                                return true;
                            }
                            throw C19926612xs.LIZLLL();
                        }
                        abstractC19927312xz.LIZJ();
                        return false;
                    }
                    C19927612y2 c19927612y2 = C19927612y2.LLILLJJLI;
                    C19927512y1 c19927512y1 = new C19927512y1();
                    abstractC19927312xz.LJIJJ(i2, c19927512y1, y.LJII);
                    C19918612wa c19918612waLIZIZ2 = LIZIZ(i2);
                    C19927612y2 c19927612y2Build = c19927512y1.build();
                    C19927912y5 c19927912y52 = c19918612waLIZIZ2.LIZ;
                    if (c19927912y52.LJ == null) {
                        c19927912y52.LJ = new ArrayList();
                    }
                    c19918612waLIZIZ2.LIZ.LJ.add(c19927612y2Build);
                    return true;
                }
                LIZIZ(i2).LIZ(abstractC19927312xz.LJIILJJIL());
                return true;
            }
            C19918612wa c19918612waLIZIZ3 = LIZIZ(i2);
            long jLJIJ = abstractC19927312xz.LJIJ();
            C19927912y5 c19927912y53 = c19918612waLIZIZ3.LIZ;
            if (c19927912y53.LIZJ == null) {
                c19927912y53.LIZJ = new C19888812rm();
            }
            c19918612waLIZIZ3.LIZ.LIZJ.LJ(jLJIJ);
            return true;
        }
        LIZIZ(i2).LIZIZ(abstractC19927312xz.LJIL());
        return true;
    }

    public final void LJI(int i, int i2) {
        if (i > 0) {
            LIZIZ(i).LIZIZ(i2);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" is not a valid field number.");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC19928112y7
    public final InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        LJ(abstractC19927312xz);
        return this;
    }
}
