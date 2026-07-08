package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0pCc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.action.biz.SeaPdpDelayExecuteAction", f = "SeaPdpDelayExecuteAction.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "handle")
public final class C1502520pCc extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1502510pCb LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1502520pCc(C1502510pCb c1502510pCb, InterfaceC1364105Vn<? super C1502520pCc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1502510pCb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpDelayExecuteAction@2a15.handle$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, null, this);
        C1C7U.LIZIZ("SeaPdpDelayExecuteAction@2a15.handle$1");
        return objLIZ;
    }
}
