package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0NWc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {408}, m = "invokeSuspend")
public final class C595200NWc extends C09AX implements InterfaceC1631620sYq<C0NVR, InterfaceC594940NVc<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ C0NVR LLILLJJLI;
    public final /* synthetic */ Function2<Function1<? super C1394605d2, Unit>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final /* synthetic */ C1681210tqp<Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C595200NWc(Function2<? super Function1<? super C1394605d2, Unit>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, C1681210tqp<Object> c1681210tqp, InterfaceC1364105Vn<? super C595200NWc> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = function2;
        this.LLILZ = c1681210tqp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            C0NVR c0nvr = this.LLILLJJLI;
            Function2<Function1<? super C1394605d2, Unit>, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLL;
            AwS391S0200000_25 awS391S0200000_25 = new AwS391S0200000_25((C1681210tqp) this.LLILZ, (C1681210tqp<Object>) c0nvr, (C0NVR) 216);
            this.LL = 1;
            if (function2.invoke(awS391S0200000_25, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C0NVR c0nvr, InterfaceC594940NVc<Object> interfaceC594940NVc, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C595200NWc c595200NWc = new C595200NWc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c595200NWc.LLILLJJLI = c0nvr;
        return c595200NWc.invokeSuspend(Unit.LIZ);
    }
}
