package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XFh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLTokenRepository$tryReportMetrics$2", f = "SOTLTokenRepository.kt", l = {}, m = "invokeSuspend")
public final class C845630XFh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C845600XFe LL;
    public final /* synthetic */ EnumC845610XFf LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C845630XFh(C845600XFe c845600XFe, EnumC845610XFf enumC845610XFf, long j, InterfaceC1364105Vn<? super C845630XFh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c845600XFe;
        this.LLILLJJLI = enumC845610XFf;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C845630XFh(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SOTLTokenRepository@9bdd.tryReportMetrics$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        C845600XFe c845600XFe = this.LL;
        EnumC845610XFf enumC845610XFf = this.LLILLJJLI;
        long j = this.LLILLL;
        jSONObject.put("error_code", C845580XFc.LIZ(c845600XFe.LIZIZ));
        jSONObject.put("duration", c845600XFe.LIZ);
        jSONObject.put("blob_enabled", 0);
        jSONObject.put("error_code_2", -1);
        jSONObject.put("duration_2", -1);
        jSONObject.put("blob_ahead_duration", 0);
        C845590XFd c845590XFd = C845590XFd.LIZ;
        int iLIZ = C845580XFc.LIZ(c845600XFe.LIZIZ);
        long j2 = c845600XFe.LIZ;
        c845590XFd.getClass();
        Long lLJ = C845590XFd.LJ(iLIZ, -1, j2, 0L);
        if (lLJ != null) {
            jSONObject.put("success_duration", lLJ.longValue());
        }
        Long lLIZIZ = C845580XFc.LIZIZ(c845600XFe.LIZIZ);
        if (lLIZIZ != null) {
            jSONObject.put("tt_ahead_duration", lLIZIZ.longValue());
        }
        jSONObject.put("source", enumC845610XFf.getValue());
        jSONObject.put("panel_wait_duration", j);
        C20684815ws.LJIJ("sotl_token_load_metrics", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SOTLTokenRepository@9bdd.tryReportMetrics$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
