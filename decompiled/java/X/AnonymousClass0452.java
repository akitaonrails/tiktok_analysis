package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0452, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$addCart$1$addToCart$1", f = "SeaPdpViewModel.kt", l = {3099}, m = "invokeSuspend")
public final class AnonymousClass0452 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public final /* synthetic */ SeaPdpViewModel LLIZLLLIL;
    public final /* synthetic */ SkuItem LLJ;
    public final /* synthetic */ SeaPdpFragment LLJI;
    public final /* synthetic */ View LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Integer LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ Map<String, Object> LLJJI;
    public final /* synthetic */ C259800zU<ExceptionUX> LLJJIII;
    public final /* synthetic */ C259800zU<String> LLJJIJI;
    public final /* synthetic */ C259800zU<Object> LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0452(SeaPdpViewModel seaPdpViewModel, SkuItem skuItem, SeaPdpFragment seaPdpFragment, View view, String str, Integer num, String str2, String str3, Map<String, ? extends Object> map, C259800zU<ExceptionUX> c259800zU, C259800zU<String> c259800zU2, C259800zU<Object> c259800zU3, InterfaceC1364105Vn<? super AnonymousClass0452> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = seaPdpViewModel;
        this.LLJ = skuItem;
        this.LLJI = seaPdpFragment;
        this.LLJIJIL = view;
        this.LLJILJIL = str;
        this.LLJILJILJ = num;
        this.LLJILLL = str2;
        this.LLJJ = str3;
        this.LLJJI = map;
        this.LLJJIII = c259800zU;
        this.LLJJIJI = c259800zU2;
        this.LLJJIJIIJIL = c259800zU3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0452(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARN: Type inference failed for: r2v13, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v57, types: [T, java.util.Map] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r58) {
        /*
            Method dump skipped, instruction units count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0452.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
