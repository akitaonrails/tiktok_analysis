package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import r4m.i;

/* JADX INFO: renamed from: X.0n9I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateDataListFetcher$fetchList$2", f = "TemplateDataListFetcher.kt", l = {143}, m = "invokeSuspend")
public final class C1423580n9I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ i LLILLJJLI;
    public final /* synthetic */ TemplateCategoryData LLILLL;
    public final /* synthetic */ C1423690n9T LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423580n9I(i iVar, TemplateCategoryData templateCategoryData, C1423690n9T c1423690n9T, int i, C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n94, InterfaceC1364105Vn<? super C1423580n9I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iVar;
        this.LLILLL = templateCategoryData;
        this.LLILZ = c1423690n9T;
        this.LLILZIL = i;
        this.LLILZLL = c1423440n94;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423580n9I(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateDataListFetcher@94de.fetchList$2");
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
            i iVar = this.LLILLJJLI;
            C1423810n9f c1423810n9f = iVar.LIZJ;
            if (c1423810n9f != null) {
                TemplateCategoryData templateCategoryData = this.LLILLL;
                C1423690n9T c1423690n9T = this.LLILZ;
                int i2 = this.LLILZIL;
                int i3 = c1423690n9T.LIZLLL;
                C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n94 = this.LLILZLL;
                C1423680n9S c1423680n9S = new C1423680n9S(iVar, i2);
                this.LL = 1;
                if (C1423570n9H.LIZ(c1423810n9f, templateCategoryData, c1423690n9T, i2, i3, c1423440n94, c1423680n9S, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateDataListFetcher@94de.fetchList$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateDataListFetcher@94de.fetchList$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
