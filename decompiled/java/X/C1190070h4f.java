package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsLandingViewModel;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0h4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel$delete$1", f = "PoiReviewsListViewModel.kt", l = {1077, 1099}, m = "invokeSuspend")
public final class C1190070h4f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public PoiReviewsApi.PoiReviewModel LLILLL;
    public PoiReviewsListViewModel LLILZ;
    public int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LLIZLLLIL;
    public final /* synthetic */ PoiReviewsListViewModel LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190070h4f(String str, String str2, PoiReviewsApi.PoiReviewModel poiReviewModel, PoiReviewsListViewModel poiReviewsListViewModel, InterfaceC1364105Vn<? super C1190070h4f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = poiReviewModel;
        this.LLJ = poiReviewsListViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1190070h4f(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        PoiReviewsListViewModel poiReviewsListViewModel;
        String str3;
        PoiReviewsLandingViewModel poiReviewsLandingViewModel;
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.delete$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        boolean z = true;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                C189200o6.m2constructorimpl(Unit.LIZ);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.delete$1");
                return unit;
            }
            poiReviewsListViewModel = this.LLILZ;
            poiReviewModel = this.LLILLL;
            str2 = (String) this.LLILLJJLI;
            str = (String) this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            str = this.LLILZLL;
            str2 = this.LLIZ;
            poiReviewModel = this.LLIZLLLIL;
            poiReviewsListViewModel = this.LLJ;
            PoiReviewsApi.LIZ.getClass();
            PoiReviewsApi poiReviewsApiLIZ = C1172760gck.LIZ();
            int value = EnumC1190080h4g.DELETE.getValue();
            String serverParam = poiReviewModel.getServerParam();
            this.LL = str;
            this.LLILLJJLI = str2;
            this.LLILLL = poiReviewModel;
            this.LLILZ = poiReviewsListViewModel;
            this.LLILZIL = 1;
            obj = poiReviewsApiLIZ.doPoiReviewInteract(str, str2, value, serverParam, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.delete$1");
                return objLJFF;
            }
        }
        if (((BaseResponse) obj).status_code == 0) {
            poiReviewsListViewModel.listRemoveItem(poiReviewModel);
            if (C1184990gwT.LIZ()) {
                C1440005kM.LIZ(new C1187180h00(str, str2));
            }
            PoiReviewsApi.PoiReviewUserModel author = poiReviewModel.getAuthor();
            if (author != null) {
                str3 = author.userId;
            } else {
                str3 = null;
            }
            if (Intrinsics.LJFF(str3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()) && (poiReviewsLandingViewModel = poiReviewsListViewModel.LLJJL) != null) {
                if (str == null) {
                    str = "";
                }
                PoiReviewsLandingViewModel.vQ2(poiReviewsLandingViewModel, str);
            }
            List<InterfaceC1891350zJl> list = ((C1190250h4x) poiReviewsListViewModel.getState()).LLJ.LLILZ;
            if (list == null || list.size() != 0) {
                z = false;
            }
            if (z) {
                this.LL = null;
                this.LLILLJJLI = null;
                this.LLILLL = null;
                this.LLILZ = null;
                this.LLILZIL = 2;
                if (poiReviewsListViewModel.onRefresh(this) == objLJFF) {
                    C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.delete$1");
                    return objLJFF;
                }
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.delete$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
