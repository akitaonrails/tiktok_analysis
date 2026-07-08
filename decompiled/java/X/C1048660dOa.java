package X;

import Y.AfS185S0100000_16;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.ad.network.ScoreApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM$sendScoreRequest$1", f = "AdFollowUpAceSurveyVM.kt", l = {}, m = "invokeSuspend")
public final class C1048660dOa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1048700dOe LL;
    public final /* synthetic */ AdFollowUpAceSurveyVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1048660dOa(C1048700dOe c1048700dOe, AdFollowUpAceSurveyVM adFollowUpAceSurveyVM, InterfaceC1364105Vn<? super C1048660dOa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1048700dOe;
        this.LLILLJJLI = adFollowUpAceSurveyVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1048660dOa(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdFollowUpAceSurveyVM@3980.sendScoreRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ScoreApi.LIZ.getClass();
        ScoreApi scoreApi = (ScoreApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(ScoreApi.class);
        String itemId = this.LL.LIZ.getItemId();
        String advId = this.LL.LIZ.getAdvId();
        String adId = this.LL.LIZ.getAdId();
        String cid = this.LL.LIZ.getCid();
        C1048700dOe c1048700dOe = this.LL;
        scoreApi.sendScoreOption(itemId, advId, adId, cid, c1048700dOe.LIZIZ, c1048700dOe.LIZJ, c1048700dOe.LIZLLL, c1048700dOe.LIZ.getAdExtraMsg()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0dOd
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj2) {
                C1C7U.LIZ("AdFollowUpAceSurveyVM@3980.sendScoreRequest$1$result$1");
                C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.sendScoreRequest$1$result$1");
            }
        }, new AfS185S0100000_16(this.LLILLJJLI, 49));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdFollowUpAceSurveyVM@3980.sendScoreRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
