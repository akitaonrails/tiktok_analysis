package X;

import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.loadingformat.ui.IABEfficiencyComponentsModule$launchLoggingTask$1", f = "IABEfficiencyComponentsModule.kt", l = {}, m = "invokeSuspend")
public final class C323501Nh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323501Nh(JSONObject jSONObject, InterfaceC1364105Vn<? super C323501Nh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323501Nh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IABEfficiencyComponentsModule@88f6.launchLoggingTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            JSONObject jSONObject = this.LL;
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(jSONObject);
            Npth.reportBizException("iab_ai_banner_show_failed", new Throwable(strLJI), strLJI, (Map<String, String>) C2097608Jq.LJ(), true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IABEfficiencyComponentsModule@88f6.launchLoggingTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
