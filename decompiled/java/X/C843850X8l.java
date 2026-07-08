package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.utils.GameAttributionReportHelper$reportC2SIfNecessary$1$1$1", f = "GameAttributionReportHelper.kt", l = {284}, m = "invokeSuspend")
public final class C843850X8l extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ HashMap<String, String> LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ long LLJILJIL;
    public final /* synthetic */ C0JT6<Map<String, String>> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843850X8l(JSONObject jSONObject, String str, String str2, int i, String str3, String str4, String str5, String str6, HashMap<String, String> map, String str7, long j, C0JT6<Map<String, String>> c0jt6, InterfaceC1364105Vn<? super C843850X8l> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = map;
        this.LLJIJIL = str7;
        this.LLJILJIL = j;
        this.LLJILJILJ = c0jt6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C843850X8l(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GameAttributionReportHelper@2972.reportC2SIfNecessary$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_attributing_mmp_report_trace");
            c474500IjALIZ.LJJII("report_begin", "step");
            c474500IjALIZ.LJJIIJZLJL(this.LLILLJJLI);
            c474500IjALIZ.LIZ();
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            int i2 = this.LLILZIL;
            String str3 = this.LLILZLL;
            String str4 = this.LLIZ;
            String str5 = this.LLIZLLLIL;
            String str6 = this.LLJ;
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str2, "__DOMAIN__", str4, false), "__PARAMS__", str5, false), "__UA__", (String) C843880X8o.LIZLLL.getValue(), false), "__ADID__", (String) C843880X8o.LJ.getValue(), false), "__TS__", String.valueOf(System.currentTimeMillis()), false), "__EF__", String.valueOf(C843880X8o.LIZIZ(str3)), false), "__PT__", String.valueOf(i2), false);
            if (str6 == null) {
                str6 = "";
            }
            String strLJJIFFI2 = u.LJJIFFI(strLJJIFFI, "__AT__", str6, false);
            C843840X8k c843840X8k = new C843840X8k(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLILLJJLI);
            this.LL = 1;
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0X8R(strLJJIFFI2, str, null, c843840X8k));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportC2SIfNecessary$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportC2SIfNecessary$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
