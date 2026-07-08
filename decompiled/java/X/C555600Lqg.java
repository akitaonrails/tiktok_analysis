package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Lqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C555600Lqg extends AbstractC555630Lqj {
    public final String LL;
    public final C552890LmJ<?, ?, ?, ?> LLILLJJLI;
    public final C555910LrB LLILLL;
    public final C552940LmO LLILZ;
    public final C555570Lqd LLILZIL;

    @Override // X.C1D8B
    public final boolean LIZLLL(Object obj) {
        boolean zCompareAndSet = this.LLILZIL.LIZ.compareAndSet(false, true);
        if (zCompareAndSet) {
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(this.LL);
            sbLIZ.append("] pause requested");
            C201955140j.LIZLLL(c0lx3, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zCompareAndSet;
    }

    @Override // X.C1D8B
    public final void LJ(Object obj) {
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LL);
        sbLIZ.append("] resume requested");
        C201955140j.LIZLLL(c0lx3, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ));
        C555570Lqd c555570Lqd = this.LLILZIL;
        c555570Lqd.LIZ.set(false);
        InterfaceC20236714Gf<Unit> andSet = c555570Lqd.LIZJ.getAndSet(null);
        if (andSet != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            andSet.resumeWith(unit);
        }
    }

    @Override // X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        Object obj;
        EnumC2398509aZ enumC2398509aZ;
        C1404560mec c1404560mec;
        if ((abstractC1404540mea instanceof C1404560mec) && (c1404560mec = (C1404560mec) abstractC1404540mea) != null) {
            obj = c1404560mec.LIZ;
        } else {
            obj = null;
        }
        if (!(obj instanceof EnumC2398509aZ) || (enumC2398509aZ = (EnumC2398509aZ) obj) == null) {
            enumC2398509aZ = EnumC2398509aZ.CANCEL;
        }
        C555570Lqd c555570Lqd = this.LLILZIL;
        c555570Lqd.LIZLLL = enumC2398509aZ;
        c555570Lqd.LIZIZ.set(true);
        c555570Lqd.LIZ.set(false);
        InterfaceC20236714Gf<Unit> andSet = c555570Lqd.LIZJ.getAndSet(null);
        if (andSet != null) {
            Unit unit = Unit.LIZ;
            C189200o6.m2constructorimpl(unit);
            andSet.resumeWith(unit);
        }
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(this.LL);
        sbLIZ.append("] cancel requested via checkpoint, reason=");
        sbLIZ.append(enumC2398509aZ);
        sbLIZ.append(", cause=");
        sbLIZ.append(abstractC1404540mea);
        C201955140j.LIZLLL(c0lx3, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ));
        ((C1D8A) interfaceC1434410nQl).LIZ(enumC2398509aZ);
        return true;
    }

    @Override // X.C1D8B
    public final void LJFF(C1404610meh c1404610meh, C1D85 c1d85) throws Throwable {
        try {
            Map map = (Map) C23250099c.LJ(C23271099x.INSTANCE, new C555580Lqe(this, c1d85, null));
            if (this.LLILZIL.LIZIZ.get()) {
                C0LX3 c0lx3 = C0LX3.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(this.LL);
                sbLIZ.append("] run completed but cancel was requested, skipping setSuccess");
                C201955140j.LIZLLL(c0lx3, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            c1d85.LIZJ(new C1200004mk(map), false);
        } catch (C555610Lqh e) {
            TryCatchGuardChecker.doCheck(e);
            C0LX3 c0lx32 = C0LX3.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(this.LL);
            sbLIZ2.append("] Failed by node error: ");
            sbLIZ2.append(e.getErrorMessage());
            sbLIZ2.append(", extras: ");
            sbLIZ2.append(e.getExtras());
            C201955140j.LJIIIZ(c0lx32, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ2), e);
            C23250099c.LJ(C23271099x.INSTANCE, new C555590Lqf(this, e, null));
            if (this.LLILLJJLI.LIZJ.isFailable) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append('[');
                sbLIZ3.append(this.LL);
                sbLIZ3.append("] failable node failed, skipping gracefully");
                C201955140j.LJIJJ(c0lx32, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ3));
                c1d85.LIZ(new C1902307cj(this.LL, e.getErrorCode(), e.getErrorMessage(), e.getCustomContext()), EnumC2251001D8o.OUTER);
                c1d85.LIZJ(new C1200004mk(C2097608Jq.LJ()), false);
                return;
            }
            c1d85.LJ(e.getErrorCode(), e);
        } catch (CancellationException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C0LX3 c0lx33 = C0LX3.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append('[');
            sbLIZ4.append(this.LL);
            sbLIZ4.append("] caught CancellationException");
            C201955140j.LIZLLL(c0lx33, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ4));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0LX3 c0lx34 = C0LX3.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append('[');
            sbLIZ5.append(this.LL);
            sbLIZ5.append("] Failed by unknown error: ");
            sbLIZ5.append(th.getMessage());
            C201955140j.LJIIIZ(c0lx34, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ5), th);
            if (this.LLILLJJLI.LIZJ.isFailable) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append('[');
                sbLIZ6.append(this.LL);
                sbLIZ6.append("] failable node failed, skipping gracefully");
                C201955140j.LJIJJ(c0lx34, "AIGCWorkflowWaveTask", C2188811AlT.LIZIZ(sbLIZ6));
                String str = this.LL;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                c1d85.LIZ(new C1902307cj(str, -1, message, null), EnumC2251001D8o.OUTER);
                c1d85.LIZJ(new C1200004mk(C2097608Jq.LJ()), false);
                return;
            }
            c1d85.LJ(-1, th);
        }
    }

    public C555600Lqg(String str, C552890LmJ<?, ?, ?, ?> c552890LmJ, C555910LrB c555910LrB, C552940LmO c552940LmO) {
        this.LL = str;
        this.LLILLJJLI = c552890LmJ;
        this.LLILLL = c555910LrB;
        this.LLILZ = c552940LmO;
        c552890LmJ.LIZLLL.getNodeName();
        this.LLILZIL = new C555570Lqd();
    }
}
