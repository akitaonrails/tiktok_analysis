package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0xIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingRepository", f = "AutoPostLivingRepository.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "fetchAutoPostLivingList")
public final class C1813600xIM extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1813610xIN LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813600xIM(C1813610xIN c1813610xIN, InterfaceC1364105Vn<? super C1813600xIM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1813610xIN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPostLivingRepository@5ac3.fetchAutoPostLivingList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, this);
        C1C7U.LIZIZ("AutoPostLivingRepository@5ac3.fetchAutoPostLivingList$1");
        return objLIZIZ;
    }
}
