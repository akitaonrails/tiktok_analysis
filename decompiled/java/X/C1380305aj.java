package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05aj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {316}, m = "invokeSuspend")
public final class C1380305aj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1380605am LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380305aj(C1380605am c1380605am, long j, InterfaceC1364105Vn<? super C1380305aj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1380605am;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1380305aj c1380305aj = new C1380305aj(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1380305aj.LLILLJJLI = obj;
        return c1380305aj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
        float fLIZIZ;
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
            C1380605am c1380605am = this.LLILLL;
            InterfaceC1631620sYq<? super InterfaceC497601wk, ? super Float, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq = c1380605am.LLJLIL;
            long j = this.LLILZ;
            if (c1380605am.LLJLILLLLZIIL) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            long jLJFF = C1395705dD.LJFF(f, j);
            EnumC1684030tvN enumC1684030tvN = this.LLILLL.LLJJL;
            C05PL c05pl = C1380805ao.LIZ;
            if (enumC1684030tvN == EnumC1684030tvN.Vertical) {
                fLIZIZ = C1395705dD.LIZJ(jLJFF);
            } else {
                fLIZIZ = C1395705dD.LIZIZ(jLJFF);
            }
            Float fLIZLLL = C2286608xc.LIZLLL(fLIZIZ);
            this.LL = 1;
            if (interfaceC1631620sYq.invoke(obj2, fLIZLLL, this) == objLJFF) {
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
