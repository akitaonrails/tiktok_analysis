package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.058G, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.ecaction.ECActionApi$Companion", f = "ECActionApi.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "getCartItemCount")
public final class C058G extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1321105Ez LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058G(C1321105Ez c1321105Ez, InterfaceC1364105Vn<? super C058G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1321105Ez;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECActionApi$Companion@b2e5.getCartItemCount$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("ECActionApi$Companion@b2e5.getCartItemCount$1");
        return objLIZ;
    }
}
