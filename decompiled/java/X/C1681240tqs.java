package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", l = {434, 436}, m = "invokeSuspend")
public final class C1681240tqs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1681210tqp<T> LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681240tqs(C1681210tqp<T> c1681210tqp, long j, InterfaceC1364105Vn<? super C1681240tqs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1681210tqp;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1681240tqs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
        float fLIZIZ;
        float f2;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1681210tqp<T> c1681210tqp = this.LLILLJJLI;
            long j = this.LLILLL;
            if (c1681210tqp.LLJLIL()) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            long jLJFF = C1395705dD.LJFF(f, j);
            EnumC1684030tvN enumC1684030tvN = c1681210tqp.LLJJL;
            EnumC1684030tvN enumC1684030tvN2 = EnumC1684030tvN.Vertical;
            if (enumC1684030tvN == enumC1684030tvN2) {
                fLIZIZ = C1395705dD.LIZJ(jLJFF);
            } else {
                fLIZIZ = C1395705dD.LIZIZ(jLJFF);
            }
            C1681210tqp<T> c1681210tqp2 = this.LLILLJJLI;
            InterfaceC1681290tqx interfaceC1681290tqx = c1681210tqp2.LLJL;
            if (interfaceC1681290tqx == null) {
                this.LL = 1;
                if (C1681210tqp.LLJJLIIIJLLLLLLLZ(c1681210tqp2, fLIZIZ, this) == objLJFF) {
                    return objLJFF;
                }
            } else {
                EnumC1684030tvN enumC1684030tvN3 = c1681210tqp2.LLJJL;
                if (enumC1684030tvN3 == EnumC1684030tvN.Horizontal) {
                    f2 = fLIZIZ;
                } else {
                    f2 = 0.0f;
                }
                if (enumC1684030tvN3 != enumC1684030tvN2) {
                    fLIZIZ = 0.0f;
                }
                long jLIZ = C1374205Zk.LIZ(f2, fLIZIZ);
                C1681250tqt c1681250tqt = new C1681250tqt(this.LLILLJJLI, null);
                this.LL = 2;
                if (interfaceC1681290tqx.LJIL(jLIZ, c1681250tqt, this) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
