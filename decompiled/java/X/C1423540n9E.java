package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n9E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.favorite.TemplateFavoriteServiceKt$fetchTemplateTabFavoriteDataList$2", f = "TemplateFavoriteService.kt", l = {}, m = "invokeSuspend")
public final class C1423540n9E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1423630n9N LL;
    public final /* synthetic */ C1423690n9T LLILLJJLI;
    public final /* synthetic */ C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> LLILLL;
    public final /* synthetic */ TemplateCategoryData LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423540n9E(C1423630n9N c1423630n9N, C1423690n9T c1423690n9T, C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n94, TemplateCategoryData templateCategoryData, int i, int i2, InterfaceC1364105Vn<? super C1423540n9E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1423630n9N;
        this.LLILLJJLI = c1423690n9T;
        this.LLILLL = c1423440n94;
        this.LLILZ = templateCategoryData;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423540n9E(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1423060n8S enumC1423060n8S;
        C1C7U.LIZ("TemplateFavoriteServiceKt@c1e0.fetchTemplateTabFavoriteDataList$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n94 = this.LLILLL;
        int i = this.LLILZIL;
        int i2 = this.LLILZLL;
        TemplateCategoryData templateCategoryData = this.LLILZ;
        C1423690n9T c1423690n9T = this.LLILLJJLI;
        C1423630n9N c1423630n9N = this.LL;
        C1423570n9H.LIZIZ(c1423440n94, i, i2, templateCategoryData, c1423690n9T, c1423630n9N);
        if (c1423630n9N == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateFavoriteServiceKt@c1e0.fetchTemplateTabFavoriteDataList$2");
            return unit;
        }
        if (c1423630n9N.LIZ == EnumC1423670n9R.SUCCESS) {
            C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n942 = this.LLILLL;
            int i3 = this.LLILZIL;
            int i4 = this.LLILZLL;
            TemplateCategoryData templateCategoryData2 = this.LLILZ;
            C1423690n9T c1423690n9T2 = this.LLILLJJLI;
            List<C1419590n2r> list = c1423630n9N.LIZIZ;
            C1423570n9H.LIZIZ(c1423440n942, i3, i4, templateCategoryData2, c1423690n9T2, list);
            if (list == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TemplateFavoriteServiceKt@c1e0.fetchTemplateTabFavoriteDataList$2");
                return unit2;
            }
            C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n943 = this.LLILLL;
            int i5 = this.LLILZIL;
            int i6 = this.LLILZLL;
            TemplateCategoryData templateCategoryData3 = this.LLILZ;
            C1423690n9T c1423690n9T3 = this.LLILLJJLI;
            C1422890n8B c1422890n8B = c1423630n9N.LIZJ;
            C1423570n9H.LIZIZ(c1423440n943, i5, i6, templateCategoryData3, c1423690n9T3, c1422890n8B);
            if (c1422890n8B == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("TemplateFavoriteServiceKt@c1e0.fetchTemplateTabFavoriteDataList$2");
                return unit3;
            }
            boolean z = c1422890n8B.LIZ;
            C1423690n9T c1423690n9T4 = this.LLILLJJLI;
            if (c1423690n9T4.LIZIZ) {
                if (C1423860n9k.LIZIZ(list, c1423690n9T4.LJFF)) {
                    this.LLILLL.LIZ(new C1422880n8A(EnumC1423060n8S.REFRESH_SAME, 10003, "", this.LLILZ, this.LLILLJJLI.LIZ, null));
                } else {
                    this.LLILLL.LIZIZ(C1422890n8B.LIZ(c1422890n8B, z, false), list);
                }
            } else if (c1423690n9T4.LIZJ) {
                this.LLILLL.LIZIZ(C1422890n8B.LIZ(c1422890n8B, z, true), C13LP.LJLIL(list, c1423690n9T4.LJFF));
            } else {
                this.LLILLL.LIZIZ(C1422890n8B.LIZ(c1422890n8B, z, false), list);
            }
        } else {
            C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n944 = this.LLILLL;
            int i7 = this.LLILZIL;
            int i8 = this.LLILZLL;
            TemplateCategoryData templateCategoryData4 = this.LLILZ;
            C1423690n9T c1423690n9T5 = this.LLILLJJLI;
            C1422880n8A c1422880n8A = c1423630n9N.LJ;
            C1423570n9H.LIZIZ(c1423440n944, i7, i8, templateCategoryData4, c1423690n9T5, c1422880n8A);
            if (c1422880n8A == null) {
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("TemplateFavoriteServiceKt@c1e0.fetchTemplateTabFavoriteDataList$2");
                return unit4;
            }
            C1423440n94<C1419590n2r, C1422880n8A, C1422890n8B> c1423440n945 = this.LLILLL;
            C1423690n9T c1423690n9T6 = this.LLILLJJLI;
            if (c1423690n9T6.LIZJ) {
                enumC1423060n8S = EnumC1423060n8S.LOAD_MORE_TEMPLATES_ERROR;
            } else if (c1423690n9T6.LIZIZ) {
                enumC1423060n8S = EnumC1423060n8S.REFRESH_TEMPLATES_ERROR;
            } else {
                enumC1423060n8S = EnumC1423060n8S.FETCH_TEMPLATE_ERROR;
            }
            c1423440n945.LIZ(new C1422880n8A(enumC1423060n8S, c1422880n8A.LIZIZ, c1422880n8A.LIZJ, c1422880n8A.LIZLLL, c1422880n8A.LJ, c1422880n8A.LJFF));
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateFavoriteServiceKt@c1e0.fetchTemplateTabFavoriteDataList$2");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
