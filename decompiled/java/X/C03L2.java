package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03L2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspCreateOrderManager$handleCreateOrderResult$9$1", f = "OspCreateOrderManager.kt", l = {153, 164, 165}, m = "invokeSuspend")
public final class C03L2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ OrderSubmitAssemViewModel LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ CreateOrderData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03L2(long j, OrderSubmitAssemViewModel orderSubmitAssemViewModel, Context context, CreateOrderData createOrderData, InterfaceC1364105Vn<? super C03L2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = orderSubmitAssemViewModel;
        this.LLILZ = context;
        this.LLILZIL = createOrderData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03L2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r8 = "OspCreateOrderManager@b17e.handleCreateOrderResult$9$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r15.LL
            r12 = 0
            r5 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L2d
            if (r0 == r6) goto L49
            if (r0 == r7) goto L5a
            if (r0 != r5) goto L74
            X.C155000ia.LIZIZ(r16)
        L1a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r9 = r15.LLILLL
            android.content.Context r10 = r15.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData r0 = r15.LLILZIL
            java.lang.String r11 = r0.comboId
            r13 = r12
            r14 = r12
            r9.aR2(r10, r11, r12, r13, r14)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r16)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.03Kv r2 = new X.03Kv
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r1 = r15.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData r0 = r15.LLILZIL
            r2.<init>(r1, r0, r12)
            r15.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r15, r3, r2)
            if (r0 != r4) goto L4c
            X.C1C7U.LIZIZ(r8)
            return r4
        L49:
            X.C155000ia.LIZIZ(r16)
        L4c:
            long r0 = r15.LLILLJJLI
            r15.LL = r7
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r15)
            if (r0 != r4) goto L5d
            X.C1C7U.LIZIZ(r8)
            return r4
        L5a:
            X.C155000ia.LIZIZ(r16)
        L5d:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.03L1 r1 = new X.03L1
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r0 = r15.LLILLL
            r1.<init>(r0, r12)
            r15.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r15, r2, r1)
            if (r0 != r4) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r4
        L74:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03L2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
