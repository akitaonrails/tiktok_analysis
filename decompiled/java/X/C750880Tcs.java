package X;

import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet;
import com.bytedance.android.livesdk.function.MuteRuleApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.MuteRule;

/* JADX INFO: renamed from: X.0Tcs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet$MuteRuleAdapter$removeItemAt$1", f = "LiveMuteRulesFragmentSheet.kt", l = {267, 275}, m = "invokeSuspend")
public final class C750880Tcs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveMuteRulesFragmentSheet LLILLJJLI;
    public final /* synthetic */ C745200TLa LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750880Tcs(LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet, C745200TLa c745200TLa, int i, InterfaceC1364105Vn<? super C750880Tcs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveMuteRulesFragmentSheet;
        this.LLILLL = c745200TLa;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750880Tcs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMuteRulesFragmentSheet$MuteRuleAdapter@f720.removeItemAt$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.getClass();
            C766270U4b.LIZLLL(2131837817);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveMuteRulesFragmentSheet$MuteRuleAdapter@f720.removeItemAt$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C480460Ism.LIZ().getClass();
            MuteRuleApi muteRuleApi = (MuteRuleApi) C480460Ism.LIZLLL(MuteRuleApi.class);
            long jLongValue = ((Number) this.LLILLJJLI.LLLI.getValue()).longValue();
            long jLongValue2 = ((Number) this.LLILLJJLI.LLLII.getValue()).longValue();
            long j = ((MuteRule) ((ArrayList) this.LLILLL.LLILLJJLI).get(this.LLILZ)).id;
            this.LL = 1;
            if (muteRuleApi.deleteMuteRule(jLongValue, jLongValue2, j, this) == objLJFF) {
                C1C7U.LIZIZ("LiveMuteRulesFragmentSheet$MuteRuleAdapter@f720.removeItemAt$1");
                return objLJFF;
            }
        }
        LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet = this.LLILLJJLI;
        this.LL = 2;
        String str = LiveMuteRulesFragmentSheet._pnsPageId;
        if (liveMuteRulesFragmentSheet.zS(true, this) == objLJFF) {
            C1C7U.LIZIZ("LiveMuteRulesFragmentSheet$MuteRuleAdapter@f720.removeItemAt$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveMuteRulesFragmentSheet$MuteRuleAdapter@f720.removeItemAt$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
