package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS553S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NVV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", l = {1125}, m = "invokeSuspend")
public final class C0NVV extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C594920NVa<Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<C0NVR, InterfaceC594940NVc<Object>, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NVV(C594920NVa c594920NVa, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c594920NVa;
        this.LLILLL = interfaceC1631620sYq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NVV(this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
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
            AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(this.LLILLJJLI, 1720);
            C0NVU c0nvu = new C0NVU(this.LLILLJJLI, null, this.LLILLL);
            this.LL = 1;
            if (C1677950tlZ.LIZLLL(awS553S0100000_9, c0nvu, this) == objLJFF) {
                return objLJFF;
            }
        }
        Object objLIZ = this.LLILLJJLI.LIZIZ().LIZ(this.LLILLJJLI.LIZLLL());
        if (objLIZ != null) {
            if (Math.abs(this.LLILLJJLI.LIZLLL() - this.LLILLJJLI.LIZIZ().LIZLLL(objLIZ)) < 0.5f && this.LLILLJJLI.LIZ.invoke(objLIZ).booleanValue()) {
                ((C13FE) this.LLILLJJLI.LJII).setValue(objLIZ);
                this.LLILLJJLI.LJIIIIZZ(objLIZ);
            }
        }
        return Unit.LIZ;
    }
}
