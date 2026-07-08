package X;

import com.bytedance.android.livesdk.adminsetting.LiveMuteSuggestFragmentSheet;
import com.bytedance.android.livesdk.function.MuteRuleApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.MuteRule;

/* JADX INFO: renamed from: X.0Tcj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteSuggestFragmentSheet$addMuteRule$1", f = "LiveMuteSuggestFragmentSheet.kt", l = {142}, m = "invokeSuspend")
public final class C750790Tcj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveMuteSuggestFragmentSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750790Tcj(LiveMuteSuggestFragmentSheet liveMuteSuggestFragmentSheet, InterfaceC1364105Vn<? super C750790Tcj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveMuteSuggestFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750790Tcj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMuteSuggestFragmentSheet@8f5b.addMuteRule$1");
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
                C480460Ism.LIZ().getClass();
                MuteRuleApi muteRuleApi = (MuteRuleApi) C480460Ism.LIZLLL(MuteRuleApi.class);
                long jLongValue = ((Number) this.LLILLJJLI.LLLI.getValue()).longValue();
                long jLongValue2 = ((Number) this.LLILLJJLI.LLLII.getValue()).longValue();
                MuteRule muteRule = this.LLILLJJLI.LLLFFI;
                String str = muteRule.content;
                long j = muteRule.durationSecond;
                this.LL = 1;
                if (muteRuleApi.addMuteRule(jLongValue, jLongValue2, str, 0L, j, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveMuteSuggestFragmentSheet@8f5b.addMuteRule$1");
                    return objLJFF;
                }
            }
            this.LLILLJJLI.close(1);
            C766270U4b.LIZLLL(2131837807);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LiveMuteSuggestFragmentSheet liveMuteSuggestFragmentSheet = this.LLILLJJLI;
            liveMuteSuggestFragmentSheet.getClass();
            if ((e instanceof C477520Io2) && ((C501520Jle) e).getErrorCode() == liveMuteSuggestFragmentSheet.LLLIIII) {
                C766270U4b.LIZLLL(2131837807);
            } else {
                C766270U4b.LIZLLL(2131841122);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMuteSuggestFragmentSheet@8f5b.addMuteRule$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
