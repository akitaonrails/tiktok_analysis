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

/* JADX INFO: renamed from: X.0459, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel$addCart$1", f = "SeaPdpViewModel.kt", l = {3113, 3114}, m = "invokeSuspend")
public final class AnonymousClass0459 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ SeaPdpViewModel LLILZIL;
    public final /* synthetic */ C259800zU<ExceptionUX> LLILZLL;
    public final /* synthetic */ View LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;
    public final /* synthetic */ C259800zU<Object> LLJ;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLJI;
    public final /* synthetic */ View LLJIJIL;
    public final /* synthetic */ SkuItem LLJILJIL;
    public final /* synthetic */ SeaPdpFragment LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ Integer LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ Map<String, Object> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnonymousClass0459(String str, SeaPdpViewModel seaPdpViewModel, C259800zU<ExceptionUX> c259800zU, View view, C259800zU<String> c259800zU2, C259800zU<Object> c259800zU3, Function2<? super Boolean, ? super String, Unit> function2, View view2, SkuItem skuItem, SeaPdpFragment seaPdpFragment, String str2, Integer num, String str3, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super AnonymousClass0459> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = seaPdpViewModel;
        this.LLILZLL = c259800zU;
        this.LLIZ = view;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = c259800zU3;
        this.LLJI = function2;
        this.LLJIJIL = view2;
        this.LLJILJIL = skuItem;
        this.LLJILJILJ = seaPdpFragment;
        this.LLJILLL = str2;
        this.LLJJ = num;
        this.LLJJI = str3;
        this.LLJJIII = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0459 anonymousClass0459 = new AnonymousClass0459(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
        anonymousClass0459.LLILLL = obj;
        return anonymousClass0459;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e8 A[PHI: r3
      0x00e8: PHI (r3v13 java.lang.Object) = (r3v12 java.lang.Object), (r3v17 java.lang.Object) binds: [B:40:0x00e5, B:33:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec A[PHI: r2 r3
      0x00ec: PHI (r2v7 java.lang.Object) = (r2v6 java.lang.Object), (r2v9 java.lang.Object) binds: [B:43:0x00e9, B:36:0x00c1] A[DONT_GENERATE, DONT_INLINE]
      0x00ec: PHI (r3v14 java.lang.Object) = (r3v13 java.lang.Object), (r3v16 java.lang.Object) binds: [B:43:0x00e9, B:36:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r27v1, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0459.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
