package X;

import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.044W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.ISeaSkuPanelViewModel$refreshSkuInfoV2$1", f = "ISeaSkuPanelViewModel.kt", l = {2125}, m = "invokeSuspend")
public final class C044W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C044Z LL;
    public Object LLILLJJLI;
    public SkuItem LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C044Z<ViewModel> LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C044W(C044Z<ViewModel> c044z, boolean z, InterfaceC1364105Vn<? super C044W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c044z;
        this.LLIZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C044W(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0211, code lost:
    
        if (r3 != null) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C044W.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
