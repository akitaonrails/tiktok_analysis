package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n9L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateTabCategoryFetcher$canPreload$2", f = "TemplateTabCategoryFetcher.kt", l = {}, m = "invokeSuspend")
public final class C1423610n9L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1423490n99 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1423740n9Y LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423610n9L(C1423490n99 c1423490n99, String str, C1423740n9Y c1423740n9Y, InterfaceC1364105Vn<? super C1423610n9L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1423490n99;
        this.LLILLJJLI = str;
        this.LLILLL = c1423740n9Y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1423610n9L(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateTabCategoryFetcher@9acf.canPreload$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1419590n2r> listLJI = this.LL.LJI(this.LLILLJJLI, this.LLILLL, false);
        if (listLJI != null && !listLJI.isEmpty()) {
            if (this.LL.LIZJ(this.LLILLL) == null) {
                C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.canPreload$2");
                return true;
            }
            C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.canPreload$2");
            return false;
        }
        C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.canPreload$2");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
