package X;

import com.ss.android.ugc.aweme.ecommerce.base.review.repo.ReviewApi;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel$translateTextV2$2$1$response$1", f = "GalleryViewerViewModel.kt", l = {318}, m = "invokeSuspend")
public final class C1407070mif extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ReviewApi.ReviewTransResponse>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C259800zU<EnumC1407150min> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1407070mif(String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407070mif(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("GalleryViewerViewModel@cd31.translateTextV2$2$1$response$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1760770vv9 c1760770vv9 = ReviewApi.LIZ;
            C13BV c13bv = C13BV.INSTANCE;
            String str = this.LLILLJJLI;
            if (this.LLILLL.element == EnumC1407150min.SHOW_ORIGINAL) {
                i = 1;
            } else {
                i = 0;
            }
            List listSingletonList = Collections.singletonList(new ReviewApi.TransUnit(str, C2286608xc.LJ(i)));
            this.LL = 1;
            c1760770vv9.getClass();
            obj = ((ReviewApi) C1760770vv9.LIZIZ.create(ReviewApi.class)).LIZLLL(new ReviewApi.ReviewTransRequest(c13bv, listSingletonList), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GalleryViewerViewModel@cd31.translateTextV2$2$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("GalleryViewerViewModel@cd31.translateTextV2$2$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ReviewApi.ReviewTransResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
