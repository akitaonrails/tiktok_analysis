package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.cashier.agentbridge.PIPOCashierAgentBridgeImpl$handlePaymentInfoStringResult$1", f = "PIPOCashierAgentBridgeServiceImpl.kt", l = {494}, m = "invokeSuspend")
public final class C336170DFv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1631620sYq<EnumC336190DFx, C0DD3, String, Unit> LLILLJJLI;
    public final /* synthetic */ C1712870uft LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C336170DFv(InterfaceC1631620sYq<? super EnumC336190DFx, ? super C0DD3, ? super String, Unit> interfaceC1631620sYq, C1712870uft c1712870uft, String str, boolean z, InterfaceC1364105Vn<? super C336170DFv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = c1712870uft;
        this.LLILZ = str;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C336170DFv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("PIPOCashierAgentBridgeImpl@ef2c.handlePaymentInfoStringResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1712830ufp c1712830ufp = new C1712830ufp(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1712830ufp);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.handlePaymentInfoStringResult$1");
                return objLJFF;
            }
        }
        C336160DFu c336160DFu = (C336160DFu) objLJI;
        String str = c336160DFu.LJII;
        if (str != null) {
            this.LLILLJJLI.invoke(EnumC336190DFx.EXCEPTION_ERROR, null, str);
        } else {
            this.LLILLJJLI.invoke(EnumC336190DFx.SUCCESS, new C0DD3(c336160DFu.LIZ, c336160DFu.LIZIZ, c336160DFu.LIZJ, c336160DFu.LIZLLL, c336160DFu.LJ), null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PIPOCashierAgentBridgeImpl@ef2c.handlePaymentInfoStringResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
