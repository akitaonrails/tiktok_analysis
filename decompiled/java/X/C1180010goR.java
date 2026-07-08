package X;

import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsNpsItemCell;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0goR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.cell.PoiReviewsNpsItemCell$handleNegativeFeedback$1", f = "PoiReviewsNpsItemCell.kt", l = {303}, m = "invokeSuspend")
public final class C1180010goR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiReviewsNpsItemCell LLILLJJLI;
    public final /* synthetic */ PoiReviewsApi.PoiNpsInfo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1180010goR(PoiReviewsApi.PoiNpsInfo poiNpsInfo, PoiReviewsNpsItemCell poiReviewsNpsItemCell, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiReviewsNpsItemCell;
        this.LLILLL = poiNpsInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1180010goR(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ITEM> listListGetAll;
        String str;
        C1C7U.LIZ("PoiReviewsNpsItemCell@62d3.handleNegativeFeedback$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("PoiReviewsNpsItemCell@62d3.handleNegativeFeedback$1");
                return objLJFF;
            }
        }
        LinearLayout linearLayout = this.LLILLJJLI.LLILLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        if (this.LLILLL != null && (listListGetAll = this.LLILLJJLI.N5().listGetAll()) != 0 && listListGetAll.contains(this.LLILLL)) {
            C1185430gxB c1185430gxB = C1185430gxB.LIZ;
            this.LLILLJJLI.N5();
            String str2 = this.LLILLJJLI.N5().LL;
            String strZZ1 = this.LLILLJJLI.N5().ZZ1();
            if (this.LLILLL.getStoreNpsInfo().hasDoClick) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            PageFinder pageFinderI5 = this.LLILLJJLI.I5();
            c1185430gxB.getClass();
            C1185430gxB.LJJJJL(pageFinderI5, str2, strZZ1, "auto", str);
            this.LLILLJJLI.P5(this.LLILLL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewsNpsItemCell@62d3.handleNegativeFeedback$1");
        return unit;
    }
}
