package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0h4Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.reviews.PoiDetailReviewsViewModel$delete$1", f = "PoiDetailReviewsViewModel.kt", l = {599}, m = "invokeSuspend")
public final class C1190000h4Y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ PoiReviewsApi.PoiReviewModel LLILZ;
    public final /* synthetic */ PoiDetailReviewsViewModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190000h4Y(String str, String str2, PoiReviewsApi.PoiReviewModel poiReviewModel, PoiDetailReviewsViewModel poiDetailReviewsViewModel, InterfaceC1364105Vn<? super C1190000h4Y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = poiReviewModel;
        this.LLILZIL = poiDetailReviewsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1190000h4Y(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiDetailReviewsViewModel@8a8c.delete$1");
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
            PoiReviewsApi.LIZ.getClass();
            PoiReviewsApi poiReviewsApiLIZ = C1172760gck.LIZ();
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            int value = EnumC1190080h4g.DELETE.getValue();
            String serverParam = this.LLILZ.getServerParam();
            this.LL = 1;
            obj = poiReviewsApiLIZ.doPoiReviewInteract(str, str2, value, serverParam, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiDetailReviewsViewModel@8a8c.delete$1");
                return objLJFF;
            }
        }
        if (((BaseResponse) obj).status_code == 0) {
            PoiDetailReviewsViewModel poiDetailReviewsViewModel = this.LLILZIL;
            PoiReviewsApi.PoiReviewModel poiReviewModel = this.LLILZ;
            poiDetailReviewsViewModel.getClass();
            poiDetailReviewsViewModel.withState(new AwS384S0200000_18(poiDetailReviewsViewModel, poiReviewModel, 215));
            if (C1184990gwT.LIZ()) {
                C1440005kM.LIZ(new C1187180h00(this.LLILLJJLI, this.LLILLL));
            }
            PoiDetailReviewsViewModel poiDetailReviewsViewModel2 = this.LLILZIL;
            poiDetailReviewsViewModel2.withState(new AwS597S0100000_18(poiDetailReviewsViewModel2, 356));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailReviewsViewModel@8a8c.delete$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
