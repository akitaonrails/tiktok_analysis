package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0h4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.reviews.landing.viewmodel.PoiReviewsListViewModel$highlightItemToNormal$1", f = "PoiReviewsListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1190170h4p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiReviewsListViewModel LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1190170h4p(PoiReviewsListViewModel poiReviewsListViewModel, int i, InterfaceC1364105Vn<? super C1190170h4p> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiReviewsListViewModel;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1190170h4p(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
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
        C1C7U.LIZ("PoiReviewsListViewModel@e0d9.highlightItemToNormal$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20600815jK<ITEM> c20600815jK = this.LL.state;
        if (c20600815jK != 0 && (interfaceC1891350zJlLJI = c20600815jK.LJI(this.LLILLJJLI)) != null) {
            PoiReviewsListViewModel poiReviewsListViewModel = this.LL;
            int i = this.LLILLJJLI;
            if (interfaceC1891350zJlLJI instanceof PoiReviewsApi.PoiReviewModel) {
                PoiReviewsApi.PoiReviewModel poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJlLJI;
                poiReviewsListViewModel.listSetItemAt(i, poiReviewModel.copy(poiReviewModel.poiId, poiReviewModel.reviewId, poiReviewModel.author, poiReviewModel.content, poiReviewModel.basicInfo, poiReviewModel.statistics, poiReviewModel.userStatus, poiReviewModel.source, poiReviewModel.brandName, poiReviewModel.brandLogo, poiReviewModel.darkModeBrandLogo, poiReviewModel.externalUrl, poiReviewModel.status, poiReviewModel.serverParam, poiReviewModel.isAnonymous, poiReviewModel.hasFoldedReviews, poiReviewModel.verifiedDisplay, poiReviewModel.LL, poiReviewModel.LLILLJJLI, poiReviewModel.LLILLL, poiReviewModel.LLILZ, poiReviewModel.LLILZIL, EnumC1191110h6L.DEFAULT, poiReviewModel.LLIZ, poiReviewModel.LLIZLLLIL, poiReviewModel.LLJ, poiReviewModel.LLJI));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReviewsListViewModel@e0d9.highlightItemToNormal$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
