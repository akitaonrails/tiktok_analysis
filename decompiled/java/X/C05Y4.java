package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Y4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
public final class C05Y4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC1369205Xm LLILLJJLI;
    public final /* synthetic */ C05ZY LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05Y4(InterfaceC1369205Xm interfaceC1369205Xm, C05ZY c05zy, InterfaceC1364105Vn<? super C05Y4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1369205Xm;
        this.LLILLL = c05zy;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05Y4 c05y4 = new C05Y4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c05y4.LL = obj;
        return c05y4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C099V c099v = C099V.UNDISPATCHED;
        C23250099c.LIZLLL(interfaceC497601wk, null, c099v, new C05Y3(this.LLILLJJLI, this.LLILLL, null), 1);
        return C23250099c.LIZLLL(interfaceC497601wk, null, c099v, new C05ZX(this.LLILLJJLI, this.LLILLL, null), 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
