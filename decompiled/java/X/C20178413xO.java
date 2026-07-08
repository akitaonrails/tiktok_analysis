package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS431S0200000_30;
import njp.a;

/* JADX INFO: renamed from: X.13xO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.CoverExtractionManager$extractCover$1", f = "CoverExtractionManager.kt", l = {192}, m = "invokeSuspend")
public final class C20178413xO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1457070o1J LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20178413xO(C1457070o1J c1457070o1J, InterfaceC1364105Vn<? super C20178413xO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1457070o1J;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20178413xO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String message;
        C1C7U.LIZ("CoverExtractionManager@18bd.extractCover$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C20178213xM c20178213xM = C20178213xM.LIZ;
                C20178213xM.LIZJ(this.LLILLJJLI);
                C1457070o1J c1457070o1J = this.LLILLJJLI;
                this.LL = 1;
                obj = c20178213xM.LIZ(c1457070o1J, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CoverExtractionManager@18bd.extractCover$1");
                    return objLJFF;
                }
            }
            C20178713xR c20178713xR = (C20178713xR) obj;
            if (c20178713xR.LIZ) {
                C201955140j.LIZLLL(C0MHB.LIZIZ, "CoverExtractionManager", "Cover extraction completed successfully");
            } else {
                C0MHB c0mhb = C0MHB.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cover extraction failed: ");
                Throwable th = c20178713xR.LIZJ;
                if (th == null || (message = th.getMessage()) == null) {
                    Object obj2 = c20178713xR.LIZIZ.get("error");
                    if (obj2 instanceof String) {
                        message = (String) obj2;
                    } else {
                        message = null;
                    }
                }
                sbLIZ.append(message);
                C201955140j.LJIIIIZZ(c0mhb, "CoverExtractionManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LIZLLL(C0MHB.LIZIZ, "CoverExtractionManager", "Cover extraction cancelled");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C201955140j.LJIIIZ(C0MHB.LIZIZ, "CoverExtractionManager", "Cover extraction error", e2);
            InterfaceC1457180o1U interfaceC1457180o1U = this.LLILLJJLI.LJIJJLI;
            if (interfaceC1457180o1U != null) {
                C01TT.LIZLLL(new AwS431S0200000_30(interfaceC1457180o1U, e2, 10));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CoverExtractionManager@18bd.extractCover$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
