package X;

import Y.AgS171S0300000_22;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateTabCategoryFetcher$fetchCategoryList$1", f = "TemplateTabCategoryFetcher.kt", l = {185}, m = "invokeSuspend")
public final class C1423590n9J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C1423660n9Q> LLILLJJLI;
    public final /* synthetic */ C1423490n99 LLILLL;
    public final /* synthetic */ C1423740n9Y LLILZ;
    public final /* synthetic */ InterfaceC1423360n8w<TemplateCategoryData, C1419590n2r, C1422880n8A, C1423470n97, C1422890n8B> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423590n9J(InterfaceC346201Wa<C1423660n9Q> interfaceC346201Wa, C1423490n99 c1423490n99, C1423740n9Y c1423740n9Y, InterfaceC1423360n8w<TemplateCategoryData, C1419590n2r, C1422880n8A, C1423470n97, C1422890n8B> interfaceC1423360n8w, InterfaceC1364105Vn<? super C1423590n9J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c1423490n99;
        this.LLILZ = c1423740n9Y;
        this.LLILZIL = interfaceC1423360n8w;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423590n9J(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateTabCategoryFetcher@9acf.fetchCategoryList$1");
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
            InterfaceC346201Wa<C1423660n9Q> interfaceC346201Wa = this.LLILLJJLI;
            AgS171S0300000_22 agS171S0300000_22 = new AgS171S0300000_22(this.LLILLL, this.LLILZ, this.LLILZIL, 1);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS171S0300000_22, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.fetchCategoryList$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.fetchCategoryList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
