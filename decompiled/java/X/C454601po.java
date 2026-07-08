package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.ToastContent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$handleAddCartResult$1", f = "PdpViewModel.kt", l = {2854}, m = "invokeSuspend")
public final class C454601po extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Object LLILZIL;
    public final /* synthetic */ ExceptionUX LLILZLL;
    public final /* synthetic */ View LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C454601po(PdpViewModel pdpViewModel, View view, Object obj, ExceptionUX exceptionUX, View view2, InterfaceC1364105Vn<? super C454601po> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pdpViewModel;
        this.LLILZ = view;
        this.LLILZIL = obj;
        this.LLILZLL = exceptionUX;
        this.LLIZ = view2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C454601po c454601po = new C454601po(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c454601po.LLILLJJLI = obj;
        return c454601po;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        ToastContent toastContent;
        ExceptionUX exceptionUX;
        SkuPanelState skuPanelState;
        SkuPanelState skuPanelState2;
        ExceptionUX exceptionUX2;
        ToastContent toastContent2;
        Object objLJLIIIL = obj;
        C1C7U.LIZ("PdpViewModel@6cb1.handleAddCartResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJLIIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJLIIIL);
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C454701pp(this.LLILLL, this.LLILZ, this.LLIZ, null), 3);
            this.LL = 1;
            objLJLIIIL = c099gLIZIZ.LJLIIIL(this);
            if (objLJLIIIL == objLJFF) {
                C1C7U.LIZIZ("PdpViewModel@6cb1.handleAddCartResult$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) objLJLIIIL).booleanValue();
        PdpViewModel pdpViewModel = this.LLILLL;
        pdpViewModel.LLJJJ = true;
        Context context = this.LLILZ.getContext();
        View view = this.LLILZ;
        Object obj2 = this.LLILZIL;
        boolean z = obj2 instanceof SkuPanelState;
        if (!z || (skuPanelState2 = (SkuPanelState) obj2) == null || (exceptionUX2 = skuPanelState2.exceptionUX) == null || (toastContent2 = exceptionUX2.toastContent) == null || (str = toastContent2.message) == null) {
            ExceptionUX exceptionUX3 = this.LLILZLL;
            if (exceptionUX3 != null && (toastContent = exceptionUX3.toastContent) != null) {
                str = toastContent.message;
            } else {
                str = "";
            }
        }
        if (!z || (skuPanelState = (SkuPanelState) obj2) == null || (exceptionUX = skuPanelState.exceptionUX) == null) {
            exceptionUX = this.LLILZLL;
        }
        pdpViewModel.qR2(context, view, str, obj2, zBooleanValue, exceptionUX);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PdpViewModel@6cb1.handleAddCartResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
