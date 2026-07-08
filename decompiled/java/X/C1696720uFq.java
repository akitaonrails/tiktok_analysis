package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0uFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696720uFq extends AbstractC1696830uG1 {
    public float[] LIZIZ;
    public C1695950uEb LJII;
    public Function1<? super AbstractC1696830uG1, Unit> LJIIIIZZ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float LJIILLIIL;
    public float LJIIZILJ;
    public final List<AbstractC1696830uG1> LIZJ = new ArrayList();
    public boolean LIZLLL = true;
    public long LJ = C1685910tyP.LJIIJ;
    public List<? extends AbstractC1776680wKo> LJFF = C1696220uF2.LIZ;
    public boolean LJI = true;
    public final AwS604S0100000_25 LJIIIZ = new AwS604S0100000_25(this, 513);
    public String LJIIJ = "";
    public float LJIILJJIL = 1.0f;
    public float LJIILL = 1.0f;
    public boolean LJIJ = true;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.LJIIJ);
        List<AbstractC1696830uG1> list = this.LIZJ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(list, i);
            sb.append("\t");
            sb.append(obj.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // X.AbstractC1696830uG1
    public final Function1<AbstractC1696830uG1, Unit> LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.AbstractC1696830uG1
    public final void LIZ(InterfaceC1675870tiD interfaceC1675870tiD) {
        if (this.LJIJ) {
            float[] fArrLIZ = this.LIZIZ;
            if (fArrLIZ == null) {
                fArrLIZ = C1696000uEg.LIZ();
                this.LIZIZ = fArrLIZ;
            } else {
                C1696000uEg.LIZLLL(fArrLIZ);
            }
            C1696000uEg.LJI(this.LJIIL + this.LJIILLIIL, this.LJIILIIL + this.LJIIZILJ, 0.0f, fArrLIZ);
            float f = this.LJIIJJI;
            if (fArrLIZ.length >= 16) {
                double d = ((double) f) * 0.017453292519943295d;
                float fSin = (float) Math.sin(d);
                float fCos = (float) Math.cos(d);
                float f2 = fArrLIZ[0];
                float f3 = fArrLIZ[4];
                float f4 = (fCos * f2) + (fSin * f3);
                float f5 = -fSin;
                float f6 = (f2 * f5) + (f3 * fCos);
                float f7 = fArrLIZ[1];
                float f8 = fArrLIZ[5];
                float f9 = (fCos * f7) + (fSin * f8);
                float f10 = (f7 * f5) + (f8 * fCos);
                float f11 = fArrLIZ[2];
                float f12 = fArrLIZ[6];
                float f13 = (fCos * f11) + (fSin * f12);
                float f14 = (f11 * f5) + (f12 * fCos);
                float f15 = fArrLIZ[3];
                float f16 = fArrLIZ[7];
                fArrLIZ[0] = f4;
                fArrLIZ[1] = f9;
                fArrLIZ[2] = f13;
                fArrLIZ[3] = (fCos * f15) + (fSin * f16);
                fArrLIZ[4] = f6;
                fArrLIZ[5] = f10;
                fArrLIZ[6] = f14;
                fArrLIZ[7] = (f5 * f15) + (fCos * f16);
            }
            C1696000uEg.LJ(this.LJIILJJIL, this.LJIILL, 1.0f, fArrLIZ);
            C1696000uEg.LJI(-this.LJIIL, -this.LJIILIIL, 0.0f, fArrLIZ);
            this.LJIJ = false;
        }
        if (this.LJI) {
            if (!this.LJFF.isEmpty()) {
                C1695950uEb c1695950uEbLIZ = this.LJII;
                if (c1695950uEbLIZ == null) {
                    c1695950uEbLIZ = C1695940uEa.LIZ();
                    this.LJII = c1695950uEbLIZ;
                }
                C1776700wKq.LIZIZ(this.LJFF, c1695950uEbLIZ);
            }
            this.LJI = false;
        }
        C1695230uDR c1695230uDRLJLJI = interfaceC1675870tiD.LJLJI();
        long jLIZIZ = c1695230uDRLJLJI.LIZIZ();
        c1695230uDRLJLJI.LIZ().save();
        try {
            C1686260tyy c1686260tyy = c1695230uDRLJLJI.LIZ;
            float[] fArr = this.LIZIZ;
            if (fArr != null) {
                c1686260tyy.LJI(fArr);
            }
            C1695950uEb c1695950uEb = this.LJII;
            if ((!this.LJFF.isEmpty()) && c1695950uEb != null) {
                c1686260tyy.LIZIZ(c1695950uEb, 1);
            }
            ArrayList arrayList = (ArrayList) this.LIZJ;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1696830uG1) arrayList.get(i)).LIZ(interfaceC1675870tiD);
            }
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1695230uDRLJLJI.LIZ().LJIIJ();
            c1695230uDRLJLJI.LIZJ(jLIZIZ);
            throw th;
        }
    }

    @Override // X.AbstractC1696830uG1
    public final void LIZLLL(AwS604S0100000_25 awS604S0100000_25) {
        this.LJIIIIZZ = awS604S0100000_25;
    }

    public final void LJFF(long j) {
        if (this.LIZLLL && j != 16) {
            long j2 = this.LJ;
            if (j2 == 16) {
                this.LJ = j;
                return;
            }
            C13BV c13bv = C1696220uF2.LIZ;
            if (C1685910tyP.LJIIIZ(j2) == C1685910tyP.LJIIIZ(j) && C1685910tyP.LJIIIIZZ(j2) == C1685910tyP.LJIIIIZZ(j) && C1685910tyP.LJI(j2) == C1685910tyP.LJI(j)) {
                return;
            }
            this.LIZLLL = false;
            this.LJ = C1685910tyP.LJIIJ;
        }
    }

    public final void LJI(AbstractC1696830uG1 abstractC1696830uG1) {
        if (abstractC1696830uG1 instanceof C1696740uFs) {
            C1696740uFs c1696740uFs = (C1696740uFs) abstractC1696830uG1;
            AbstractC1668700tWe abstractC1668700tWe = c1696740uFs.LIZIZ;
            if (this.LIZLLL && abstractC1668700tWe != null) {
                if (abstractC1668700tWe instanceof C1680950tqP) {
                    LJFF(((C1680950tqP) abstractC1668700tWe).LIZIZ);
                } else {
                    this.LIZLLL = false;
                    this.LJ = C1685910tyP.LJIIJ;
                }
            }
            AbstractC1668700tWe abstractC1668700tWe2 = c1696740uFs.LJI;
            if (this.LIZLLL && abstractC1668700tWe2 != null) {
                if (abstractC1668700tWe2 instanceof C1680950tqP) {
                    LJFF(((C1680950tqP) abstractC1668700tWe2).LIZIZ);
                    return;
                } else {
                    this.LIZLLL = false;
                    this.LJ = C1685910tyP.LJIIJ;
                    return;
                }
            }
            return;
        }
        if (!(abstractC1696830uG1 instanceof C1696720uFq)) {
            return;
        }
        C1696720uFq c1696720uFq = (C1696720uFq) abstractC1696830uG1;
        if (c1696720uFq.LIZLLL && this.LIZLLL) {
            LJFF(c1696720uFq.LJ);
        } else {
            this.LIZLLL = false;
            this.LJ = C1685910tyP.LJIIJ;
        }
    }

    public final void LJ(int i, AbstractC1696830uG1 abstractC1696830uG1) {
        if (i < ((ArrayList) this.LIZJ).size()) {
            ListProtector.set(this.LIZJ, i, abstractC1696830uG1);
        } else {
            ((ArrayList) this.LIZJ).add(abstractC1696830uG1);
        }
        LJI(abstractC1696830uG1);
        abstractC1696830uG1.LIZLLL(this.LJIIIZ);
        LIZJ();
    }
}
