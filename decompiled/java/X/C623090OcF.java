package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;

/* JADX INFO: renamed from: X.0OcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.repository.BulletinPreviewRepository$bulletinPreviewRepoOperator$1", f = "BulletinPreviewRepository.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "getNewsDomainAllowlist")
public final class C623090OcF extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C623080OcE LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C623090OcF(C623080OcE c623080OcE, InterfaceC1364105Vn<? super C623090OcF> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c623080OcE;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinPreviewRepository@40af.bulletinPreviewRepoOperator$1$getNewsDomainAllowlist$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILLJJLI.LJIIJJI(null, this);
        C1C7U.LIZIZ("BulletinPreviewRepository@40af.bulletinPreviewRepoOperator$1$getNewsDomainAllowlist$1");
        return objLJIIJJI;
    }
}
