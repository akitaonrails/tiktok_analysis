package X;

import com.ss.android.ugc.aweme.exp.groupshot.AIGroupShotConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0ZpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigroupshot.AIGroupShotUtil$setTemplateForNewGroupChatCreation$1", f = "AIGroupShotUtil.kt", l = {}, m = "invokeSuspend")
public final class C911460ZpI extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911460ZpI(String str, String str2, InterfaceC1364105Vn<? super C911460ZpI> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C911460ZpI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotUtil@623c.setTemplateForNewGroupChatCreation$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C911450ZpH c911450ZpH = C911450ZpH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTemplateForNewGroupChatCreation convId:");
        sbLIZ.append(this.LL);
        sbLIZ.append(", templateId:");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        c911450ZpH.getClass();
        C911450ZpH.LJFF();
        C0YNP.LJIIIIZZ(this.LL, "KEY_AI_GROUP_SHOT_CREATE_NEW_GROUP_CHAT_PRESELECTED_TEMPLATE", this.LLILLJJLI);
        C0YNP.LJIIIIZZ(this.LL, "KEY_AI_GROUP_SHOT_CREATE_NEW_GROUP_CHAT_DISPLAY_COUNT_REMAINING", String.valueOf(((AIGroupShotConfig) C911450ZpH.LIZIZ.getValue()).createGroupBannerMaxShowCount));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGroupShotUtil@623c.setTemplateForNewGroupChatCreation$1");
        return unit;
    }
}
