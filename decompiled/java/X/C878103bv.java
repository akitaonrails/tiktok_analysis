package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03bv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.page.TransparentLoadingOSPActivity$tryFetchBillInfoForCart$1$1", f = "TransparentLoadingOSPActivity.kt", l = {178}, m = "invokeSuspend")
public final class C878103bv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitRequestParam LLILLJJLI;
    public final /* synthetic */ TransparentLoadingOSPActivity LLILLL;
    public final /* synthetic */ HashMap<String, Object> LLILZ;
    public final /* synthetic */ OrderSubmitRequestParam LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878103bv(OrderSubmitRequestParam orderSubmitRequestParam, TransparentLoadingOSPActivity transparentLoadingOSPActivity, HashMap<String, Object> map, OrderSubmitRequestParam orderSubmitRequestParam2, InterfaceC1364105Vn<? super C878103bv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitRequestParam;
        this.LLILLL = transparentLoadingOSPActivity;
        this.LLILZ = map;
        this.LLILZIL = orderSubmitRequestParam2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C878103bv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r67) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878103bv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
