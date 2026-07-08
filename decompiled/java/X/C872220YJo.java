package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$scheduleDelayedPull$1", f = "SingleInboxMessageReceiveBuffer.kt", l = {416}, m = "invokeSuspend")
public final class C872220YJo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C872150YJh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872220YJo(long j, C872150YJh c872150YJh, InterfaceC1364105Vn<? super C872220YJo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c872150YJh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872220YJo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.scheduleDelayedPull$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.scheduleDelayedPull$1");
                return objLJFF;
            }
        }
        C868780Y6i.LJIILJJIL(this.LLILLL.LIZ.LIZLLL(), this.LLILLL.LJIILL, "Out-of-order: Pulling after retry timeout", 4);
        C872150YJh c872150YJh = this.LLILLL;
        c872150YJh.LIZJ.LJIIJ(c872150YJh.LIZIZ, 2, false, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.scheduleDelayedPull$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
