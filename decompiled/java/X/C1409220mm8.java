package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mm8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchCoreComponent$fetchTemplateList$1$3$1", f = "TemplateSearchCoreComponent.kt", l = {}, m = "invokeSuspend")
public final class C1409220mm8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1422350n7J LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;
    public final /* synthetic */ TemplateCategoryData LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409220mm8(C1422350n7J c1422350n7J, boolean z, Throwable th, TemplateCategoryData templateCategoryData, boolean z2, InterfaceC1364105Vn<? super C1409220mm8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1422350n7J;
        this.LLILLJJLI = z;
        this.LLILLL = th;
        this.LLILZ = templateCategoryData;
        this.LLILZIL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409220mm8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1423060n8S enumC1423060n8S;
        C1C7U.LIZ("TemplateSearchCoreComponent@b819.fetchTemplateList$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C560530Lyd<C1422880n8A> c560530Lyd = this.LL.LLJJ;
        if (this.LLILLJJLI) {
            enumC1423060n8S = EnumC1423060n8S.LOAD_MORE_TEMPLATES_ERROR;
        } else {
            enumC1423060n8S = EnumC1423060n8S.FETCH_TEMPLATE_ERROR;
        }
        String message = this.LLILLL.getMessage();
        if (message == null) {
            message = "";
        }
        c560530Lyd.LJIIJ(new C1422880n8A(enumC1423060n8S, 10008, message, this.LLILZ, this.LLILZIL, null));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSearchCoreComponent@b819.fetchTemplateList$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
