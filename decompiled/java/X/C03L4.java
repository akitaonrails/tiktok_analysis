package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03L4, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.OspCreateOrderManager$handleCreateOrderResultForMini$8$1", f = "OspCreateOrderManager.kt", l = {682, 693, 694}, m = "invokeSuspend")
public final class C03L4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ MiniOspViewModel LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ CreateOrderData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03L4(long j, MiniOspViewModel miniOspViewModel, Context context, CreateOrderData createOrderData, InterfaceC1364105Vn<? super C03L4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = miniOspViewModel;
        this.LLILZ = context;
        this.LLILZIL = createOrderData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03L4(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "OspCreateOrderManager@b17e.handleCreateOrderResultForMini$8$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 0
            r4 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L2e
            if (r0 == r7) goto L4a
            if (r0 == r8) goto L5b
            if (r0 != r4) goto L75
            X.C155000ia.LIZIZ(r11)
        L1a:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r1 = r10.LLILLL
            android.content.Context r2 = r10.LLILZ
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData r0 = r10.LLILZIL
            java.lang.String r3 = r0.comboId
            r4 = 0
            r5 = r4
            r6 = r4
            r1.FQ2(r2, r3, r4, r5, r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L2e:
            X.C155000ia.LIZIZ(r11)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.03Kx r2 = new X.03Kx
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r1 = r10.LLILLL
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData r0 = r10.LLILZIL
            r2.<init>(r1, r0, r6)
            r10.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r10, r3, r2)
            if (r0 != r5) goto L4d
            X.C1C7U.LIZIZ(r9)
            return r5
        L4a:
            X.C155000ia.LIZIZ(r11)
        L4d:
            long r0 = r10.LLILLJJLI
            r10.LL = r8
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r5) goto L5e
            X.C1C7U.LIZIZ(r9)
            return r5
        L5b:
            X.C155000ia.LIZIZ(r11)
        L5e:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.03L6 r1 = new X.03L6
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r0 = r10.LLILLL
            r1.<init>(r0, r6)
            r10.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r10, r2, r1)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r5
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03L4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
