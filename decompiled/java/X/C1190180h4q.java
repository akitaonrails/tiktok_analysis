package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0h4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel$highlightDisappearOnTime$2", f = "PoiReviewsListViewModel.kt", l = {1126}, m = "invokeSuspend")
public final class C1190180h4q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PoiReviewsListViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190180h4q(PoiReviewsListViewModel poiReviewsListViewModel, int i, InterfaceC1364105Vn<? super C1190180h4q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = poiReviewsListViewModel;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1190180h4q(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1891350zJl interfaceC1891350zJlLJI;
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.highlightDisappearOnTime$2");
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
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.highlightDisappearOnTime$2");
                return objLJFF;
            }
        }
        C20600815jK<ITEM> c20600815jK = this.LLILLJJLI.state;
        if (c20600815jK != 0 && (interfaceC1891350zJlLJI = c20600815jK.LJI(this.LLILLL)) != null) {
            PoiReviewsListViewModel poiReviewsListViewModel = this.LLILLJJLI;
            int i2 = this.LLILLL;
            if (interfaceC1891350zJlLJI instanceof PoiReviewsApi.PoiReviewModel) {
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJlLJI;
                poiReviewsListViewModel.listSetItemAt(i2, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, EnumC1191110h6L.HIGHLIGHT_DISSAPPEAR, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.highlightDisappearOnTime$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
