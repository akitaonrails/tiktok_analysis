package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.AbstractClickableNode$emitHoverEnter$1$1", f = "Clickable.kt", l = {1298}, m = "invokeSuspend")
public final class C594990NVh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC595010NVj LLILLJJLI;
    public final /* synthetic */ C595170NVz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594990NVh(InterfaceC595010NVj interfaceC595010NVj, C595170NVz c595170NVz, InterfaceC1364105Vn<? super C594990NVh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC595010NVj;
        this.LLILLL = c595170NVz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594990NVh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            InterfaceC595010NVj interfaceC595010NVj = this.LLILLJJLI;
            C595170NVz c595170NVz = this.LLILLL;
            this.LL = 1;
            if (interfaceC595010NVj.LIZ(c595170NVz, this) == objLJFF) {
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
