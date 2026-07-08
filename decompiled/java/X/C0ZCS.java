package X;

import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics;

/* JADX INFO: renamed from: X.0ZCS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMMessageAnalytics", f = "IMMessageAnalytics.kt", l = {1045}, m = "addExtraB2CParams")
public final class C0ZCS extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMMessageAnalytics LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZCS(IMMessageAnalytics iMMessageAnalytics, InterfaceC1364105Vn<? super C0ZCS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iMMessageAnalytics;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMessageAnalytics@7084.addExtraB2CParams$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, this);
        C1C7U.LIZIZ("IMMessageAnalytics@7084.addExtraB2CParams$1");
        return objLJI;
    }
}
