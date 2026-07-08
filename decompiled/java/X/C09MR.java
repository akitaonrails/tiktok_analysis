package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.TnsBannerAssemTrigger;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09MR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.tns.banner.TnsBannerAssemTrigger$onReceiveJsEvent$1$aweme$1", f = "TnSBannerAssem.kt", l = {}, m = "invokeSuspend")
public final class C09MR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Aweme>, Object> {
    public final /* synthetic */ TnsBannerAssemTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09MR(TnsBannerAssemTrigger tnsBannerAssemTrigger, InterfaceC1364105Vn<? super C09MR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tnsBannerAssemTrigger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09MR(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        Aweme aweme;
        C1C7U.LIZ("TnsBannerAssemTrigger@99d3.onReceiveJsEvent$1$aweme$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme awemeLJIIJ = null;
        try {
            DetailFeedService detailFeedService = (DetailFeedService) PluggableExtentionKt.pluggableSpi$default(DetailFeedService.class, false, false, false, 14, null);
            if (detailFeedService != null) {
                VideoItemParams videoItemParams = (VideoItemParams) C631370Opb.LIZ(this.LL);
                if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                awemeLJIIJ = detailFeedService.LJIIJ(aid, "");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1C7U.LIZIZ("TnsBannerAssemTrigger@99d3.onReceiveJsEvent$1$aweme$1");
        return awemeLJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
