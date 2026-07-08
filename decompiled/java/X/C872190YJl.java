package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$enqueueWsNotify$2", f = "SingleInboxMessageReceiveBuffer.kt", l = {173, 174}, m = "invokeSuspend")
public final class C872190YJl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C872150YJh LLILLJJLI;
    public final /* synthetic */ C0YKK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872190YJl(C872150YJh c872150YJh, C0YKK c0ykk, InterfaceC1364105Vn<? super C872190YJl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c872150YJh;
        this.LLILLL = c0ykk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872190YJl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jIntValue;
        Pair<Boolean, Integer> pairLIZIZ;
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.enqueueWsNotify$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.enqueueWsNotify$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0YKM c0ykmLIZJ = this.LLILLJJLI.LIZ.LJ().LIZJ();
            if (c0ykmLIZJ != null && (pairLIZIZ = c0ykmLIZJ.LIZIZ()) != null) {
                jIntValue = pairLIZIZ.getSecond().intValue();
            } else {
                jIntValue = 0;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jIntValue, this) == objLJFF) {
                C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.enqueueWsNotify$2");
                return objLJFF;
            }
        }
        C872150YJh c872150YJh = this.LLILLJJLI;
        C0YKH c0ykh = new C0YKH(this.LLILLL);
        this.LL = 2;
        if (c872150YJh.LJFF(c0ykh, this) == objLJFF) {
            C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.enqueueWsNotify$2");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.enqueueWsNotify$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
