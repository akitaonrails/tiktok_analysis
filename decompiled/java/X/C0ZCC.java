package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatAnalytics;

/* JADX INFO: renamed from: X.0ZCC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatAnalytics", f = "IMChatAnalytics.kt", l = {150, 167}, m = "addExtraB2CParamsWithSessionAndUser")
public final class C0ZCC extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ IMChatAnalytics LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZCC(IMChatAnalytics iMChatAnalytics, InterfaceC1364105Vn<? super C0ZCC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = iMChatAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMChatAnalytics@92d.addExtraB2CParamsWithSessionAndUser$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLL.LJI(null, null, this);
        C1C7U.LIZIZ("IMChatAnalytics@92d.addExtraB2CParamsWithSessionAndUser$1");
        return objLJI;
    }
}
