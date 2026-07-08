package X;

import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.vh.InboxRecommendGroupBannerVH$dismissBannerAndReportServer$1", f = "InboxRecommendGroupBannerVH.kt", l = {153}, m = "invokeSuspend")
public final class C1411180mpI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1421930n6d LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411180mpI(C1421930n6d c1421930n6d, String str, InterfaceC1364105Vn<? super C1411180mpI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1421930n6d;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1411180mpI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("InboxRecommendGroupBannerVH@c4d.dismissBannerAndReportServer$1");
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
            TikTokImApi tikTokImApiLIZJ = C1477105qL.LIZJ();
            C1421950n6f c1421950n6f = this.LLILLJJLI.LLILLJJLI;
            if (c1421950n6f == null || (str = c1421950n6f.LL) == null) {
                str = "";
            }
            String str2 = this.LLILLL;
            this.LL = 1;
            if (tikTokImApiLIZJ.acknowledgeNoticeRead(str, "inbox", 4, null, str2, this) == objLJFF) {
                C1C7U.LIZIZ("InboxRecommendGroupBannerVH@c4d.dismissBannerAndReportServer$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxRecommendGroupBannerVH@c4d.dismissBannerAndReportServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
