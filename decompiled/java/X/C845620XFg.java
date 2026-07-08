package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLTokenRepository$tryReportMetrics$1", f = "SOTLTokenRepository.kt", l = {}, m = "invokeSuspend")
public final class C845620XFg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C845600XFe LL;
    public final /* synthetic */ C845600XFe LLILLJJLI;
    public final /* synthetic */ EnumC845610XFf LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C845620XFg(C845600XFe c845600XFe, C845600XFe c845600XFe2, EnumC845610XFf enumC845610XFf, long j, InterfaceC1364105Vn<? super C845620XFg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c845600XFe;
        this.LLILLJJLI = c845600XFe2;
        this.LLILLL = enumC845610XFf;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C845620XFg(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SOTLTokenRepository@9bdd.tryReportMetrics$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        C845600XFe c845600XFe = this.LL;
        C845600XFe c845600XFe2 = this.LLILLJJLI;
        EnumC845610XFf enumC845610XFf = this.LLILLL;
        long j = this.LLILZ;
        jSONObject.put("error_code", C845580XFc.LIZ(c845600XFe.LIZIZ));
        jSONObject.put("duration", c845600XFe.LIZ);
        jSONObject.put("blob_enabled", 1);
        jSONObject.put("error_code_2", C845580XFc.LIZ(c845600XFe2.LIZIZ));
        jSONObject.put("duration_2", c845600XFe2.LIZ);
        jSONObject.put("blob_ahead_duration", c845600XFe.LIZ - c845600XFe2.LIZ);
        C845590XFd c845590XFd = C845590XFd.LIZ;
        int iLIZ = C845580XFc.LIZ(c845600XFe.LIZIZ);
        long j2 = c845600XFe.LIZ;
        int iLIZ2 = C845580XFc.LIZ(c845600XFe2.LIZIZ);
        long j3 = c845600XFe2.LIZ;
        c845590XFd.getClass();
        Long lLJ = C845590XFd.LJ(iLIZ, iLIZ2, j2, j3);
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
        C1C7U.LIZIZ("SOTLTokenRepository@9bdd.tryReportMetrics$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
