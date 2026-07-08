package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS125S1200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OBK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.iap.infra.legacy.utils.IAPLegacyAppEventStream$observeEvent$1", f = "IAPLegacyAppEventStream.kt", l = {31}, m = "invokeSuspend")
public final class C0OBK extends C09AX implements Function2<C094D<? super C1882807Za>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0OBM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OBK(String str, C0OBM c0obm, InterfaceC1364105Vn<? super C0OBK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c0obm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0OBK c0obk = new C0OBK(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0obk.LLILLJJLI = obj;
        return c0obk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IAPLegacyAppEventStream@b34c.observeEvent$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            C1548820qPI.LIZLLL(this.LLILLL, this.LLILZ);
            AwS125S1200000_9 awS125S1200000_9 = new AwS125S1200000_9(this.LLILLL, this.LLILZ, C23250099c.LIZLLL(c094d, null, null, new C0OBL(this.LLILZ, this.LLILLL, c094d, null), 3), 21);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS125S1200000_9, this) == objLJFF) {
                C1C7U.LIZIZ("IAPLegacyAppEventStream@b34c.observeEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAPLegacyAppEventStream@b34c.observeEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C1882807Za> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
