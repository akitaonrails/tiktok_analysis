package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS651S0100000_2;
import njp.a;

/* JADX INFO: renamed from: X.05ZX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {78}, m = "invokeSuspend")
public final class C05ZX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1369205Xm LLILLJJLI;
    public final /* synthetic */ C05ZY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZX(InterfaceC1369205Xm interfaceC1369205Xm, C05ZY c05zy, InterfaceC1364105Vn<? super C05ZX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1369205Xm;
        this.LLILLL = c05zy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05ZX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            InterfaceC1369205Xm interfaceC1369205Xm = this.LLILLJJLI;
            C05ZY c05zy = this.LLILLL;
            this.LL = 1;
            AwS581S0100000_2 awS581S0100000_2 = new AwS581S0100000_2(c05zy, 690);
            AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c05zy, 1205);
            Object objLIZLLL = C05ZZ.LIZLLL(interfaceC1369205Xm, new AwS651S0100000_2(awS581S0100000_2, 3), new AwS581S0100000_2(awS546S0100000_2, 490), new AwS546S0100000_2(c05zy, 1206), AFwS187S0000000_2.get$arr$(994), null, new AwS616S0100000_2(c05zy, 153), this);
            if (objLIZLLL != C099R.LJFF()) {
                objLIZLLL = Unit.LIZ;
            }
            if (objLIZLLL != C099R.LJFF()) {
                objLIZLLL = Unit.LIZ;
            }
            if (objLIZLLL == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
