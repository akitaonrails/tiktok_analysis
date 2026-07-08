package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.analytics.IMAnalyticsHelper;

/* JADX INFO: renamed from: X.058C, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.analytics.IMAnalyticsHelper", f = "IMAnalyticsHelper.kt", l = {28}, m = "getGroupOwner")
public final class C058C extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ IMAnalyticsHelper LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C058C(IMAnalyticsHelper iMAnalyticsHelper, InterfaceC1364105Vn<? super C058C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = iMAnalyticsHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMAnalyticsHelper@4eb9.getGroupOwner$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("IMAnalyticsHelper@4eb9.getGroupOwner$1");
        return objLIZJ;
    }
}
