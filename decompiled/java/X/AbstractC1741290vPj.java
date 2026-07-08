package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1741290vPj {
    public volatile boolean LIZIZ;
    public CopyOnWriteArrayList<C1741320vPm> LIZJ;
    public final C1741310vPl LIZ = new C1741310vPl();
    public final C1741300vPk LIZLLL = new C1741300vPk();

    public abstract List<InterfaceC1741330vPn> LIZJ();

    public final C1741260vPg LIZIZ() {
        C1741260vPg c1741260vPg = (C1741260vPg) C13LP.LJJLIIIJL(this.LIZ.LIZIZ);
        if (c1741260vPg != null) {
            return c1741260vPg;
        }
        EnumC1741180vPY enumC1741180vPY = EnumC1741180vPY.OUT_OF_MALL;
        return new C1741260vPg(enumC1741180vPY, enumC1741180vPY, new C1741150vPV(EnumC1741200vPa.UNEXPECTED, false, 6));
    }

    public final void LIZLLL(C1741260vPg c1741260vPg) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        AwS570S0100000_26 awS570S0100000_26 = new AwS570S0100000_26(c1741260vPg, 1543);
        c2341109Fh.getClass();
        C2341109Fh.LJFF(awS570S0100000_26);
        for (InterfaceC1741330vPn interfaceC1741330vPn : LIZJ()) {
            if (C7879035x.LIZLLL()) {
                interfaceC1741330vPn.LIZ(c1741260vPg);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } else {
                try {
                    interfaceC1741330vPn.LIZ(c1741260vPg);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (CancellationException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public final void LIZ(EnumC1741180vPY enumC1741180vPY, C1741150vPV c1741150vPV) {
        C1741320vPm c1741320vPm;
        C1741320vPm c1741320vPm2;
        C1741320vPm c1741320vPm3;
        C1741320vPm c1741320vPm4;
        try {
            if (this.LIZIZ) {
                CopyOnWriteArrayList<C1741320vPm> copyOnWriteArrayList = this.LIZJ;
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                }
                copyOnWriteArrayList.add(new C1741320vPm(enumC1741180vPY, c1741150vPV));
                this.LIZJ = copyOnWriteArrayList;
                this.LIZIZ = false;
                CopyOnWriteArrayList<C1741320vPm> copyOnWriteArrayList2 = this.LIZJ;
                if (copyOnWriteArrayList2 != null && (c1741320vPm4 = (C1741320vPm) C19719612Di.LJJIIZI(copyOnWriteArrayList2)) != null) {
                    LIZ(c1741320vPm4.LIZ, c1741320vPm4.LIZIZ);
                    return;
                }
                return;
            }
            this.LIZIZ = true;
            EnumC1741180vPY enumC1741180vPY2 = LIZIZ().LIZIZ;
            C1741260vPg c1741260vPg = new C1741260vPg(enumC1741180vPY2, enumC1741180vPY, c1741150vPV);
            if (enumC1741180vPY2 == enumC1741180vPY && (enumC1741180vPY != EnumC1741180vPY.IN_MALL_HOMEPAGE || c1741150vPV.LIZ != EnumC1741200vPa.IN_MALL_HOMEPAGE_SPIN)) {
                C1741370vPr.LIZ(C1741370vPr.LIZ, "changeMallStatus", "unexpected self trans", c1741260vPg, 56);
                this.LIZIZ = false;
                CopyOnWriteArrayList<C1741320vPm> copyOnWriteArrayList3 = this.LIZJ;
                if (copyOnWriteArrayList3 != null && (c1741320vPm3 = (C1741320vPm) C19719612Di.LJJIIZI(copyOnWriteArrayList3)) != null) {
                    LIZ(c1741320vPm3.LIZ, c1741320vPm3.LIZIZ);
                    return;
                }
                return;
            }
            C1741310vPl c1741310vPl = this.LIZ;
            if (c1741310vPl.LIZIZ.size() >= c1741310vPl.LIZ) {
                C19719612Di.LJJIIZI(c1741310vPl.LIZIZ);
            }
            c1741310vPl.LIZIZ.add(c1741260vPg);
            C1741310vPl.LIZJ = c1741260vPg;
            C1741420vPw.LIZ.getClass();
            C0NOF.LIZ.getClass();
            LIZLLL(c1741260vPg);
            this.LIZIZ = false;
            CopyOnWriteArrayList<C1741320vPm> copyOnWriteArrayList4 = this.LIZJ;
            if (copyOnWriteArrayList4 != null && (c1741320vPm2 = (C1741320vPm) C19719612Di.LJJIIZI(copyOnWriteArrayList4)) != null) {
                LIZ(c1741320vPm2.LIZ, c1741320vPm2.LIZIZ);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ = false;
            CopyOnWriteArrayList<C1741320vPm> copyOnWriteArrayList5 = this.LIZJ;
            if (copyOnWriteArrayList5 != null && (c1741320vPm = (C1741320vPm) C19719612Di.LJJIIZI(copyOnWriteArrayList5)) != null) {
                LIZ(c1741320vPm.LIZ, c1741320vPm.LIZIZ);
            }
            throw th;
        }
    }
}
