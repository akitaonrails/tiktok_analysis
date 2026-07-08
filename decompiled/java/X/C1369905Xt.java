package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05Xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend")
public final class C1369905Xt extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, Float, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ InterfaceC497601wk LL;
    public /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ C1381605aw<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1369905Xt(C1381605aw<Object> c1381605aw, InterfaceC1364105Vn<? super C1369905Xt> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c1381605aw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C23250099c.LIZLLL(this.LL, null, null, new C1370005Xu(this.LLILLL, this.LLILLJJLI, null), 3);
        return Unit.LIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, Float f, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        float fFloatValue = f.floatValue();
        C1369905Xt c1369905Xt = new C1369905Xt(this.LLILLL, interfaceC1364105Vn);
        c1369905Xt.LL = interfaceC497601wk;
        c1369905Xt.LLILLJJLI = fFloatValue;
        return c1369905Xt.invokeSuspend(Unit.LIZ);
    }
}
