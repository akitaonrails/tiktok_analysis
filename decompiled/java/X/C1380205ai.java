package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {309}, m = "invokeSuspend")
public final class C1380205ai extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1380605am LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380205ai(C1380605am c1380605am, long j, InterfaceC1364105Vn<? super C1380205ai> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1380605am;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1380205ai c1380205ai = new C1380205ai(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1380205ai.LLILLJJLI = obj;
        return c1380205ai;
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
            Object obj2 = this.LLILLJJLI;
            InterfaceC1631620sYq<? super InterfaceC497601wk, ? super C1378605aS, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq = this.LLILLL.LLJL;
            C1378605aS c1378605aS = new C1378605aS(this.LLILZ);
            this.LL = 1;
            if (interfaceC1631620sYq.invoke(obj2, c1378605aS, this) == objLJFF) {
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
