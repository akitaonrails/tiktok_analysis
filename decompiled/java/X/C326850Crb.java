package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Crb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel$deleteReviewLocally$1", f = "PoiReviewsListViewModel.kt", l = {681}, m = "invokeSuspend")
public final class C326850Crb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiReviewsListViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326850Crb(PoiReviewsListViewModel poiReviewsListViewModel, String str, String str2, InterfaceC1364105Vn<? super C326850Crb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiReviewsListViewModel;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326850Crb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.deleteReviewLocally$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                PoiReviewsListViewModel poiReviewsListViewModel = this.LLILLJJLI;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                List<ITEM> listListGetAll = poiReviewsListViewModel.listGetAll();
                if (listListGetAll != 0) {
                    for (ITEM item : listListGetAll) {
                        if ((item instanceof PoiReviewsApi.PoiReviewModel) && Intrinsics.LJFF(((PoiReviewsApi.PoiReviewModel) item).getReviewId(), str2)) {
                            poiReviewsListViewModel.listRemoveItem(item);
                        }
                    }
                }
                PoiReviewsLandingViewModel poiReviewsLandingViewModel = poiReviewsListViewModel.LLJJL;
                if (poiReviewsLandingViewModel != null) {
                    if (str == null) {
                        str = "";
                    }
                    PoiReviewsLandingViewModel.vQ2(poiReviewsLandingViewModel, str);
                }
                List<InterfaceC1891350zJl> list = ((C1190250h4x) poiReviewsListViewModel.getState()).LLJ.LLILZ;
                if (list == null || list.size() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    this.LL = 1;
                    if (poiReviewsListViewModel.onRefresh(this) == objLJFF) {
                        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.deleteReviewLocally$1");
                        return objLJFF;
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.deleteReviewLocally$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
