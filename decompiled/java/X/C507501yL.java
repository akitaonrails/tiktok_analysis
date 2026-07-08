package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.session.ReportSession$handleImageUpload$1", f = "ReportSession.kt", l = {91}, m = "invokeSuspend")
public final class C507501yL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C508401yU LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507501yL(C508401yU c508401yU, List<String> list, InterfaceC1364105Vn<? super C507501yL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c508401yU;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C507501yL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReportSession@cd97.handleImageUpload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C508401yU c508401yU = this.LLILLJJLI;
                    List<String> list = this.LLILLL;
                    this.LL = 1;
                    c508401yU.getClass();
                    if (C2296808zG.LJ(new C507401yK(c508401yU, list, null), this) == objLJFF) {
                        C1C7U.LIZIZ("ReportSession@cd97.handleImageUpload$1");
                        return objLJFF;
                    }
                }
                int i2 = C2187451AjH.LIZ;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Background upload failed: ");
                sbLIZ.append(e.getMessage());
                C1720106oR.LIZ("minis-ReportSession", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LLILLJJLI.LJII = false;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ReportSession@cd97.handleImageUpload$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJII = false;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
