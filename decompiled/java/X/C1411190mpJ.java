package X;

import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.model.GroupRecShowInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.im.model.NoticeAckPayload;
import com.ss.android.ugc.aweme.notification.banner.protocol.InboxRecommendGroupBannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.InboxRecommendGroupBannerAssem$onViewHolderAttachedToWindow$1", f = "InboxRecommendGroupBannerAssem.kt", l = {138}, m = "invokeSuspend")
public final class C1411190mpJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InboxRecommendGroupBannerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411190mpJ(InboxRecommendGroupBannerAssem inboxRecommendGroupBannerAssem, InterfaceC1364105Vn<? super C1411190mpJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = inboxRecommendGroupBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411190mpJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxRecommendGroupBannerAssem@8552.onViewHolderAttachedToWindow$1");
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
            C1227904rF c1227904rF = C1227904rF.LIZ;
            NoticeAckPayload noticeAckPayload = new NoticeAckPayload(null, null, new GroupRecShowInfo(this.LLILLJJLI.LLILZ.LLILZIL));
            c1227904rF.getClass();
            String strLJI = C1227904rF.LJI(noticeAckPayload);
            TikTokImApi tikTokImApiLIZJ = C1477105qL.LIZJ();
            String str = this.LLILLJJLI.LLILZ.LL;
            this.LL = 1;
            if (tikTokImApiLIZJ.acknowledgeNoticeRead(str, "inbox", 2, null, strLJI, this) == objLJFF) {
                C1C7U.LIZIZ("InboxRecommendGroupBannerAssem@8552.onViewHolderAttachedToWindow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxRecommendGroupBannerAssem@8552.onViewHolderAttachedToWindow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
