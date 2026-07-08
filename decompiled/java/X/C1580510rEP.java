package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0rEP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sidebar.data.SidebarRepository", f = "SidebarRepository.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "fetchSidebarConfig")
public final class C1580510rEP extends AbstractC23140094w {
    public EnumC1580500rEO LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1580480rEM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1580510rEP(C1580480rEM c1580480rEM, InterfaceC1364105Vn<? super C1580510rEP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1580480rEM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SidebarRepository@9a90.fetchSidebarConfig$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("SidebarRepository@9a90.fetchSidebarConfig$1");
        return objLIZ;
    }
}
