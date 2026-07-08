package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession$doUpload$2$tmpFiles$1", f = "ReportSession.kt", l = {}, m = "invokeSuspend")
public final class C507201yI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends File>>, Object> {
    public final /* synthetic */ C508401yU LL;
    public final /* synthetic */ List<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507201yI(C508401yU c508401yU, List<String> list, InterfaceC1364105Vn<? super C507201yI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c508401yU;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C507201yI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLIZIZ;
        C1C7U.LIZ("ReportSession@cd97.doUpload$2$tmpFiles$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C508401yU c508401yU = this.LL;
            List<String> list = this.LLILLJJLI;
            c508401yU.getClass();
            objLIZIZ = C508401yU.LIZIZ(list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decodeAndWriteFiles failed: ");
            sbLIZ.append(e.getMessage());
            C1720106oR.LIZ("minis-ReportSession", C2188811AlT.LIZIZ(sbLIZ));
            objLIZIZ = C13BV.INSTANCE;
        }
        C1C7U.LIZIZ("ReportSession@cd97.doUpload$2$tmpFiles$1");
        return objLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends File>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
