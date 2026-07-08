package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$queryBillInfo$2", f = "MiniOspViewModel.kt", l = {760}, m = "invokeSuspend")
public final class C825803Km extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MiniOspViewModel LLILLJJLI;
    public final /* synthetic */ BillInfoRequest LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ ChangeInfo LLILZLL;
    public final /* synthetic */ C05XL<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825803Km(MiniOspViewModel miniOspViewModel, BillInfoRequest billInfoRequest, boolean z, boolean z2, ChangeInfo changeInfo, C05XL<Unit> c05xl, InterfaceC1364105Vn<? super C825803Km> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = miniOspViewModel;
        this.LLILLL = billInfoRequest;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = changeInfo;
        this.LLIZ = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C825803Km(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r3 = r14
            java.lang.String r5 = "MiniOspViewModel@8f4.queryBillInfo$2"
            X.C1C7U.LIZ(r5)
            java.lang.Object r4 = X.C099R.LJFF()
            r12 = r13
            int r0 = r12.LL
            r2 = 1
            r11 = 0
            if (r0 == 0) goto L59
            if (r0 != r2) goto L81
            X.C155000ia.LIZIZ(r3)
        L16:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r3 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r3
        L18:
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r1 = r12.LLILLJJLI
            if (r3 == 0) goto L57
            int r0 = r3.code
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            java.lang.String r0 = r0.toString()
        L26:
            r1.LLJ = r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r2 = r12.LLILLJJLI
            kotlin.jvm.internal.AwS580S0100000_1 r1 = new kotlin.jvm.internal.AwS580S0100000_1
            r0 = 397(0x18d, float:5.56E-43)
            r1.<init>(r2, r0)
            r2.withState(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r6 = r12.LLILLJJLI
            if (r3 == 0) goto L55
            T r7 = r3.data
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r7 = (com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData) r7
        L3c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r8 = r12.LLILLL
            r9 = 0
            if (r3 == 0) goto L43
            java.lang.Integer r11 = r3.chunkIndex
        L43:
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo r0 = r12.LLILZLL
            r10 = r11
            r11 = r0
            r6.zQ2(r7, r8, r9, r10, r11)
            X.05XL<kotlin.Unit> r1 = r12.LLIZ
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.LJIIZILJ(r0)
            X.C1C7U.LIZIZ(r5)
            return r0
        L55:
            r7 = r11
            goto L3c
        L57:
            r0 = r11
            goto L26
        L59:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r1 = r12.LLILLJJLI
            X.03WX r6 = r1.LLJJL
            if (r6 == 0) goto L7f
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest r7 = r12.LLILLL
            boolean r0 = r1.LLJJIII
            r8 = r0 ^ 1
            java.util.HashMap<java.lang.String, java.lang.Object> r9 = r1.LLJJJJ
            if (r9 != 0) goto L71
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L71:
            boolean r10 = r12.LLILZ
            r12.LL = r2
            java.lang.Object r3 = r6.LJJL(r7, r8, r9, r10, r11, r12)
            if (r3 != r4) goto L16
            X.C1C7U.LIZIZ(r5)
            return r4
        L7f:
            r3 = r11
            goto L18
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C825803Km.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
