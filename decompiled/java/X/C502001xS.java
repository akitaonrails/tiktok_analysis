package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.EventReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base.EventReceiver$startReceiver$1", f = "EventReceiver.kt", l = {58}, m = "invokeSuspend")
public final class C502001xS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EventReceiver<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502001xS(EventReceiver<Object> eventReceiver, InterfaceC1364105Vn<? super C502001xS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eventReceiver;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C502001xS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EventReceiver@39c7.startReceiver$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            EventReceiver<Object> eventReceiver = this.LLILLJJLI;
            C01S9<Object> c01s9 = eventReceiver.LL;
            C517001zs c517001zs = new C517001zs(eventReceiver, 11);
            this.LL = 1;
            if (c01s9.collect(c517001zs, this) == objLJFF) {
                C1C7U.LIZIZ("EventReceiver@39c7.startReceiver$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
