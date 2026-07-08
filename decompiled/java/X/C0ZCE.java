package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics;

/* JADX INFO: renamed from: X.0ZCE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMNewMessageAnalytics", f = "IMNewMessageAnalytics.kt", l = {500, 537, 553}, m = "constructConversationLevelParams")
public final class C0ZCE extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C0ZCG LLILLL;
    public C0Y8T LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ IMNewMessageAnalytics LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZCE(IMNewMessageAnalytics iMNewMessageAnalytics, InterfaceC1364105Vn<? super C0ZCE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = iMNewMessageAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMNewMessageAnalytics@f8bf.constructConversationLevelParams$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLJ.LIZIZ(null, null, null, this);
        C1C7U.LIZIZ("IMNewMessageAnalytics@f8bf.constructConversationLevelParams$1");
        return objLIZIZ;
    }
}
