package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.utils.GameAttributionReportHelper$reportS2SIfNecessary$1$1$1", f = "GameAttributionReportHelper.kt", l = {164}, m = "invokeSuspend")
public final class C843820X8i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ JSONObject LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ HashMap<String, String> LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ long LLJILLL;
    public final /* synthetic */ C0JT6<Map<String, String>> LLJJ;
    public final /* synthetic */ int LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C843820X8i(JSONObject jSONObject, int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, HashMap<String, String> map, String str8, long j, C0JT6<Map<String, String>> c0jt6, int i3, InterfaceC1364105Vn<? super C843820X8i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = jSONObject;
        this.LLILLL = i;
        this.LLILZ = str;
        this.LLILZIL = i2;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = str7;
        this.LLJILJIL = map;
        this.LLJILJILJ = str8;
        this.LLJILLL = j;
        this.LLJJ = c0jt6;
        this.LLJJI = i3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C843820X8i(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GameAttributionReportHelper@2972.reportS2SIfNecessary$1$1$1");
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
            int i2 = this.LLILLL;
            String str = this.LLILZ;
            int i3 = this.LLILZIL;
            int iLIZIZ = C843880X8o.LIZIZ(this.LLILZLL);
            String str2 = this.LLIZ;
            String str3 = this.LLIZLLLIL;
            String str4 = this.LLJ;
            String str5 = this.LLJI;
            String str6 = this.LLJIJIL;
            C843830X8j c843830X8j = new C843830X8j(this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLILLL, this.LLILZ, str4, str2, str3, this.LLILZIL, this.LLJJI, this.LLILLJJLI);
            this.LL = 1;
            Object objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C843810X8h(i2, iLIZIZ, i3, str2, str, str4, str3, str5, str6, null, c843830X8j));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportS2SIfNecessary$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportS2SIfNecessary$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
