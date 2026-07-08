package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.template.card.InteractionCardTemplate;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0I24, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel$send$1", f = "GreetingCardViewModel.kt", l = {205}, m = "invokeSuspend")
public final class C0I24 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SessionInfo LLILLJJLI;
    public final /* synthetic */ InteractionCardTemplate LLILLL;
    public final /* synthetic */ Map<String, String> LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0I24(SessionInfo sessionInfo, InteractionCardTemplate interactionCardTemplate, Map<String, String> map, Map<String, String> map2, InterfaceC1364105Vn<? super C0I24> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = sessionInfo;
        this.LLILLL = interactionCardTemplate;
        this.LLILZ = map;
        this.LLILZIL = map2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0I24(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        C1C7U.LIZ("GreetingCardViewModel@d8e.send$1");
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
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                C0YP2 c0yp2 = new C0YP2(new C1265504xJ(this.LLILLJJLI.getConversationId()), this.LLILLL.getMessageType(), new C460190I2v(this.LLILLL.encode()), "greeting_card", null, null, this.LLILZ, null, null, C901060ZWm.LJ(this.LLILZIL), null, null, 15792);
                this.LL = 1;
                if (c0yozLJFF.LJFF(c0yp2, new C0IC5(null, 3), this) == objLJFF) {
                    C1C7U.LIZIZ("GreetingCardViewModel@d8e.send$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GreetingCardViewModel@d8e.send$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardViewModel@d8e.send$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
