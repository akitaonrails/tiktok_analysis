package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Crd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel$deleteReviewLocally$1", f = "PoiDetailReviewsViewModel.kt", l = {}, m = "invokeSuspend")
public final class C326870Crd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiDetailReviewsViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326870Crd(PoiDetailReviewsViewModel poiDetailReviewsViewModel, String str, String str2, InterfaceC1364105Vn<? super C326870Crd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiDetailReviewsViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326870Crd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("PoiDetailReviewsViewModel@8a8c.deleteReviewLocally$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PoiDetailReviewsViewModel poiDetailReviewsViewModel = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        try {
            C20600815jK<PoiReviewsApi.PoiReviewModel> c20600815jK = poiDetailReviewsViewModel.LLILLJJLI;
            if (c20600815jK != null) {
                for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) c20600815jK.LJII()) {
                    if ((interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) && Intrinsics.LJFF(((PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl).getReviewId(), str) && Intrinsics.LJFF(((PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl).getPoiId(), str2)) {
                        poiDetailReviewsViewModel.withState(new AwS384S0200000_18(poiDetailReviewsViewModel, (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl, 215));
                    }
                }
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailReviewsViewModel@8a8c.deleteReviewLocally$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
