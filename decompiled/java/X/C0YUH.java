package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YUH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.ies.im.core.sdk.SDKManagerV2$waitForDelay$1", f = "SDKManagerV2.kt", l = {237}, m = "invokeSuspend")
public final class C0YUH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C883100Yke LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YUH(long j, C883100Yke c883100Yke, InterfaceC1364105Vn<? super C0YUH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c883100Yke;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YUH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("SDKManagerV2@3636.waitForDelay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C882400YjW.LIZ.getClass();
            if ((((C883390Yl7) C882400YjW.LJI()).isDebug() || ((C883390Yl7) C882400YjW.LJI()).isLocalTest()) && C0YHJ.LIZ().debugDelayMs > 0) {
                j = C0YHJ.LIZ().debugDelayMs;
            } else {
                j = this.LLILLJJLI;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SDKManagerV2@3636.waitForDelay$1");
                return objLJFF;
            }
        }
        this.LLILLL.LJIILJJIL(C0YUJ.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SDKManagerV2@3636.waitForDelay$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
