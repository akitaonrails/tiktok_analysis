package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03S1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel$handleBillInfoChunkAsync$2", f = "OrderSubmitAssemViewModel.kt", l = {1759}, m = "invokeSuspend")
public final class C03S1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03S1(OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i, InterfaceC1364105Vn<? super C03S1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orderSubmitAssemViewModel;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03S1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "OrderSubmitAssemViewModel@f79d.handleBillInfoChunkAsync$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 0
            r1 = 1
            if (r0 == 0) goto L57
            if (r0 != r1) goto L72
            X.C155000ia.LIZIZ(r7)
        L14:
            X.11NZ r7 = (X.C11NZ) r7
        L16:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r6.LLILLJJLI
            com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager r3 = r0.LLZIL
            if (r3 == 0) goto L23
            r2 = 0
            r1 = 6
            java.lang.String r0 = "t_module_data_begin"
            com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager.LJI(r3, r0, r4, r2, r1)
        L23:
            if (r7 == 0) goto L4c
            X.03S2 r0 = X.C03S2.LIZ
            r0.getClass()
            boolean r0 = X.C03S2.LIZ()
            if (r0 == 0) goto L52
            X.11RO r0 = X.C11S5.LIZ()
        L34:
            X.11O8 r4 = r7.LJJJLZIJ(r0)
            Y.AfS76S0101000_1 r3 = new Y.AfS76S0101000_1
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r2 = r6.LLILLJJLI
            int r1 = r6.LLILLL
            r0 = 1
            r3.<init>(r2, r1, r0)
            Y.AfS170S0100000_1 r1 = new Y.AfS170S0100000_1
            r0 = 26
            r1.<init>(r2, r0)
            r4.LJJLL(r3, r1)
        L4c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L52:
            X.11RO r0 = X.C1701940uOG.LIZIZ()
            goto L34
        L57:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r6.LLILLJJLI
            X.03WX r0 = r0.LLLJIL
            if (r0 == 0) goto L70
            X.0957<? extends X.11NZ<com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse>> r0 = r0.LJIIIIZZ
            if (r0 == 0) goto L70
            r6.LL = r1
            java.lang.Object r7 = r0.LJLIIIL(r6)
            if (r7 != r2) goto L14
            X.C1C7U.LIZIZ(r5)
            return r2
        L70:
            r7 = r4
            goto L16
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03S1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
