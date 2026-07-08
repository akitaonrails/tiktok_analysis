package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.OrderData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel$getPudoAddress$2", f = "DeliveryPanelViewModel.kt", l = {1332}, m = "invokeSuspend")
public final class C965703q3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderData LLILLJJLI;
    public final /* synthetic */ DeliveryPanelViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965703q3(OrderData orderData, DeliveryPanelViewModel deliveryPanelViewModel, InterfaceC1364105Vn<? super C965703q3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderData;
        this.LLILLL = deliveryPanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C965703q3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:13:0x004b, B:14:0x004e, B:16:0x005c, B:18:0x006b, B:20:0x0070, B:25:0x007b, B:27:0x0089, B:28:0x008f, B:30:0x0095, B:32:0x009d, B:34:0x00ab, B:36:0x00af, B:40:0x00c1, B:38:0x00b5, B:42:0x00c5, B:43:0x00c8, B:44:0x00c9, B:46:0x00cd, B:47:0x00d4, B:48:0x00e1, B:9:0x001d), top: B:53:0x000d }] */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, X.03F3, java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C965703q3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
