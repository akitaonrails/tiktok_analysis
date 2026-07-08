package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n7K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchCoreComponent$fetchTemplateList$1", f = "TemplateSearchCoreComponent.kt", l = {139, 174, 182}, m = "invokeSuspend")
public final class C1422360n7K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TemplateSearchNetApi LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1422350n7J LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ InterfaceC816210W0d<TemplateSearchNetApi> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ TemplateCategoryData LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ long LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422360n7K(TemplateSearchNetApi templateSearchNetApi, String str, C1422350n7J c1422350n7J, int i, InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0d, boolean z, TemplateCategoryData templateCategoryData, boolean z2, int i2, boolean z3, long j, InterfaceC1364105Vn<? super C1422360n7K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = templateSearchNetApi;
        this.LLILZ = str;
        this.LLILZIL = c1422350n7J;
        this.LLILZLL = i;
        this.LLIZ = interfaceC816210W0d;
        this.LLIZLLLIL = z;
        this.LLJ = templateCategoryData;
        this.LLJI = z2;
        this.LLJIJIL = i2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1422360n7K c1422360n7K = new C1422360n7K(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
        c1422360n7K.LLILLJJLI = obj;
        return c1422360n7K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8  */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422360n7K.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
