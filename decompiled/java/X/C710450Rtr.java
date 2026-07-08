package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.series.commonfeed.component.preload.SeriesVideoPreloadComponent;
import com.ss.android.ugc.aweme.service.ISeriesInnerFeedPreloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Rtr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.commonfeed.component.preload.SeriesVideoPreloadComponent$onBind$3$1", f = "SeriesVideoPreloadComponent.kt", l = {55}, m = "invokeSuspend")
public final class C710450Rtr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeriesVideoPreloadComponent LLILLJJLI;
    public final /* synthetic */ VideoItemParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710450Rtr(SeriesVideoPreloadComponent seriesVideoPreloadComponent, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C710450Rtr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seriesVideoPreloadComponent;
        this.LLILLL = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C710450Rtr(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SeriesVideoPreloadComponent@8aab.onBind$3$1");
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
            long jIntValue = ((Number) C1EE4.LIZJ.getValue()).intValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("SeriesVideoPreloadComponent@8aab.onBind$3$1");
                return objLJFF;
            }
        }
        Context context = this.LLILLJJLI.getContext();
        if (context != null) {
            SeriesVideoPreloadComponent seriesVideoPreloadComponent = this.LLILLJJLI;
            VideoItemParams videoItemParams = this.LLILLL;
            if (((ISeriesInnerFeedPreloadService) seriesVideoPreloadComponent.LLJJIJIIJIL.getValue()).LIZ()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SeriesVideoPreloadComponent@8aab.onBind$3$1");
                return unit;
            }
            Intent intentLIZIZ = ((ISeriesInnerFeedPreloadService) seriesVideoPreloadComponent.LLJJIJIIJIL.getValue()).LIZIZ(context, videoItemParams.getAweme(), SeriesVideoPreloadComponent.Bo(videoItemParams.getAweme()));
            if (intentLIZIZ == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("SeriesVideoPreloadComponent@8aab.onBind$3$1");
                return unit2;
            }
            C20152913tH.LIZLLL.getClass();
            C20152113t9 c20152113t9LIZIZ = C20153113tJ.LIZIZ();
            if (c20152113t9LIZIZ != null) {
                c20152113t9LIZIZ.LIZIZ(intentLIZIZ);
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("SeriesVideoPreloadComponent@8aab.onBind$3$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
