package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.preview.preload.dto.PreloadBillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import njp.a;

/* JADX INFO: renamed from: X.03W7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.repository.OrderSubmitRepository$tryPreloadBillInfoWithTask$2$taskAction$1$execute$1", f = "OrderSubmitRepository.kt", l = {352}, m = "invokeSuspend")
public final class C03W7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C03WX LLILLJJLI;
    public final /* synthetic */ C03R6 LLILLL;
    public final /* synthetic */ InterfaceC1748810vbr LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ C03RX LLILZLL;
    public final /* synthetic */ C03RW LLIZ;
    public final /* synthetic */ EnumC840403Qc LLIZLLLIL;
    public final /* synthetic */ C03W6 LLJ;
    public final /* synthetic */ InterfaceC1364105Vn<BillInfoResponse> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03W7(C03WX c03wx, C03R6 c03r6, InterfaceC1748810vbr interfaceC1748810vbr, Integer num, C03RX c03rx, C03RW c03rw, EnumC840403Qc enumC840403Qc, C03W6 c03w6, InterfaceC1364105Vn<? super BillInfoResponse> interfaceC1364105Vn, InterfaceC1364105Vn<? super C03W7> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = c03wx;
        this.LLILLL = c03r6;
        this.LLILZ = interfaceC1748810vbr;
        this.LLILZIL = num;
        this.LLILZLL = c03rx;
        this.LLIZ = c03rw;
        this.LLIZLLLIL = enumC840403Qc;
        this.LLJ = c03w6;
        this.LLJI = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03W7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BillInfoRequest billInfoRequest;
        Integer flowType;
        Object objLJJJJL = obj;
        C1C7U.LIZ("OrderSubmitRepository@9af5.tryPreloadBillInfoWithTask$2$taskAction$1$execute$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJJJJL);
            } else {
                C155000ia.LIZIZ(objLJJJJL);
                C03WX c03wx = this.LLILLJJLI;
                C03R6 c03r6 = this.LLILLL;
                InterfaceC1748810vbr interfaceC1748810vbr = this.LLILZ;
                Integer num = this.LLILZIL;
                C03RX c03rx = this.LLILZLL;
                C03RW c03rw = this.LLIZ;
                EnumC840403Qc enumC840403Qc = this.LLIZLLLIL;
                C03W6 c03w6 = this.LLJ;
                this.LL = 1;
                objLJJJJL = c03wx.LJJJJL(c03rx, enumC840403Qc, c03rw, c03r6, c03w6, interfaceC1748810vbr, num, this);
                if (objLJJJJL == objLJFF) {
                    C1C7U.LIZIZ("OrderSubmitRepository@9af5.tryPreloadBillInfoWithTask$2$taskAction$1$execute$1");
                    return objLJFF;
                }
            }
            BillInfoResponse billInfoResponse = (BillInfoResponse) objLJJJJL;
            C03R6 c03r62 = this.LLILLL;
            if (c03r62 instanceof PreloadBillInfoRequest) {
                flowType = ((PreloadBillInfoRequest) c03r62).flowType;
            } else {
                if (c03r62 instanceof BillInfoRequest) {
                    billInfoRequest = (BillInfoRequest) c03r62;
                } else {
                    billInfoRequest = null;
                }
                if (billInfoRequest != null) {
                    flowType = billInfoRequest.getFlowType();
                } else {
                    flowType = null;
                }
            }
            C035Q.LIZ(new AwS367S0200000_1(billInfoResponse, flowType, 4));
            InterfaceC1364105Vn<BillInfoResponse> interfaceC1364105Vn = this.LLJI;
            C189200o6.m2constructorimpl(billInfoResponse);
            interfaceC1364105Vn.resumeWith(billInfoResponse);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            EnumC1014603xw enumC1014603xw = EnumC1014603xw.ERR23;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryPreloadBillInfo excetpion: ");
            sbLIZ.append(th.getMessage());
            RuntimeException runtimeException = new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
            C03O0.LIZ.getClass();
            C1019103yf.LIZ(enumC1014603xw, runtimeException, C03O0.LIZIZ);
            InterfaceC1364105Vn<BillInfoResponse> interfaceC1364105Vn2 = this.LLJI;
            C189200o6.m2constructorimpl(null);
            interfaceC1364105Vn2.resumeWith(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrderSubmitRepository@9af5.tryPreloadBillInfoWithTask$2$taskAction$1$execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
