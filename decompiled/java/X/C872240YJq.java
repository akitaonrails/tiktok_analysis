package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.SingleInboxMessageReceiveBuffer$processGetMsgByUserItem$2", f = "SingleInboxMessageReceiveBuffer.kt", l = {215}, m = "invokeSuspend")
public final class C872240YJq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Integer>>, Object> {
    public int LL;
    public final /* synthetic */ C872150YJh LLILLJJLI;
    public final /* synthetic */ C0YKD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C872240YJq(C872150YJh c872150YJh, C0YKD c0ykd, InterfaceC1364105Vn<? super C872240YJq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c872150YJh;
        this.LLILLL = c0ykd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C872240YJq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIILJJIL;
        C1C7U.LIZ("SingleInboxMessageReceiveBuffer@ad98.processGetMsgByUserItem$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJIILJJIL = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C872150YJh c872150YJh = this.LLILLJJLI;
            C0YKD c0ykd = this.LLILLL;
            this.LL = 1;
            objLJIILJJIL = c872150YJh.LJIILJJIL(c0ykd, this);
            if (objLJIILJJIL == objLJFF) {
                C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.processGetMsgByUserItem$2");
                return objLJFF;
            }
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLJIILJJIL);
        C1C7U.LIZIZ("SingleInboxMessageReceiveBuffer@ad98.processGetMsgByUserItem$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
