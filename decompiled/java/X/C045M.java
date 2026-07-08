package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.045M, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$addCart$1", f = "PdpViewModel.kt", l = {2766, 2767}, m = "invokeSuspend")
public final class C045M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PdpViewModel LLILZ;
    public final /* synthetic */ C259800zU<ExceptionUX> LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;
    public final /* synthetic */ C259800zU<Object> LLIZLLLIL;
    public final /* synthetic */ View LLJ;
    public final /* synthetic */ SkuItem LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C045M(PdpViewModel pdpViewModel, C259800zU<ExceptionUX> c259800zU, View view, C259800zU<String> c259800zU2, C259800zU<Object> c259800zU3, View view2, SkuItem skuItem, String str, InterfaceC1364105Vn<? super C045M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = pdpViewModel;
        this.LLILZIL = c259800zU;
        this.LLILZLL = view;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = c259800zU3;
        this.LLJ = view2;
        this.LLJI = skuItem;
        this.LLJIJIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C045M c045m = new C045M(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c045m.LLILLL = obj;
        return c045m;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1 A[PHI: r15
      0x00f1: PHI (r15v2 java.lang.String) = (r15v1 java.lang.String), (r15v5 java.lang.String) binds: [B:41:0x00ee, B:34:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C045M.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
