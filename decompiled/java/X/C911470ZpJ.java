package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ZpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigroupshot.AIGroupShotUtil$updateTemplateForNewGroupChatCreation$1", f = "AIGroupShotUtil.kt", l = {}, m = "invokeSuspend")
public final class C911470ZpJ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C911480ZpK LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911470ZpJ(String str, C911480ZpK c911480ZpK, InterfaceC1364105Vn<? super C911470ZpJ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c911480ZpK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C911470ZpJ(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotUtil@623c.updateTemplateForNewGroupChatCreation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YNP.LJIIIIZZ(this.LL, "KEY_AI_GROUP_SHOT_CREATE_NEW_GROUP_CHAT_PRESELECTED_TEMPLATE", this.LLILLJJLI.LIZ);
        C0YNP.LJIIIIZZ(this.LL, "KEY_AI_GROUP_SHOT_CREATE_NEW_GROUP_CHAT_DISPLAY_COUNT_REMAINING", String.valueOf(this.LLILLJJLI.LIZIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGroupShotUtil@623c.updateTemplateForNewGroupChatCreation$1");
        return unit;
    }
}
