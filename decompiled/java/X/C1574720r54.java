package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.series.serieslist.assem.SeriesListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0r54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1574720r54 extends C2217421BqW implements Function0<Unit> {
    public C1574720r54(SeriesListAssem seriesListAssem) {
        super(0, seriesListAssem, SeriesListAssem.class, "navigateToPromotionPage", "navigateToPromotionPage()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SeriesListAssem seriesListAssem = (SeriesListAssem) this.receiver;
        seriesListAssem.getClass();
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(C724240Sb0.LJI(seriesListAssem), "aweme://paidcontent/promote");
        smartRouteBuildRoute.withParam("enter_from", seriesListAssem.Lo().LLILLL);
        smartRouteBuildRoute.open();
        return Unit.LIZ;
    }
}
