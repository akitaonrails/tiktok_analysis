package X;

import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.MuteRule;

/* JADX INFO: renamed from: X.0Tcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteRulesFragmentSheet$updateRules$1", f = "LiveMuteRulesFragmentSheet.kt", l = {190}, m = "invokeSuspend")
public final class C750900Tcu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveMuteRulesFragmentSheet LLILLJJLI;
    public final /* synthetic */ MuteRule LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750900Tcu(LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet, MuteRule muteRule, InterfaceC1364105Vn<? super C750900Tcu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveMuteRulesFragmentSheet;
        this.LLILLL = muteRule;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750900Tcu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMuteRulesFragmentSheet@5c14.updateRules$1");
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
            LiveMuteRulesFragmentSheet liveMuteRulesFragmentSheet = this.LLILLJJLI;
            MuteRule muteRule = this.LLILLL;
            this.LL = 1;
            if (liveMuteRulesFragmentSheet.uS(muteRule, this) == objLJFF) {
                C1C7U.LIZIZ("LiveMuteRulesFragmentSheet@5c14.updateRules$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMuteRulesFragmentSheet@5c14.updateRules$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
