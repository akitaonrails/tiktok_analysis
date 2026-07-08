package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tqt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", l = {438}, m = "invokeSuspend")
public final class C1681250tqt extends C09AX implements Function2<C1395705dD, InterfaceC1364105Vn<? super C1395705dD>, Object> {
    public int LL;
    public /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1681210tqp<T> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681250tqt(C1681210tqp<T> c1681210tqp, InterfaceC1364105Vn<? super C1681250tqt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1681210tqp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLIZ;
        float fLIZIZ;
        float f;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                jLIZ = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jLIZ = this.LLILLJJLI;
            C1681210tqp<T> c1681210tqp = this.LLILLL;
            if (c1681210tqp.LLJJL == EnumC1684030tvN.Vertical) {
                fLIZIZ = C1395705dD.LIZJ(jLIZ);
            } else {
                fLIZIZ = C1395705dD.LIZIZ(jLIZ);
            }
            this.LLILLJJLI = jLIZ;
            this.LL = 1;
            obj = C1681210tqp.LLJJLIIIJLLLLLLLZ(c1681210tqp, fLIZIZ, this);
            if (obj == objLJFF) {
                return objLJFF;
            }
        }
        float fFloatValue = ((Number) obj).floatValue();
        float fLJII = this.LLILLL.LLJJJJLIIL.LJII();
        float fLIZIZ2 = this.LLILLL.LLJJJJLIIL.LIZIZ().LIZIZ();
        if (fLJII >= this.LLILLL.LLJJJJLIIL.LIZIZ().LJ() || fLJII <= fLIZIZ2) {
            EnumC1684030tvN enumC1684030tvN = this.LLILLL.LLJJL;
            if (enumC1684030tvN == EnumC1684030tvN.Horizontal) {
                f = fFloatValue;
            } else {
                f = 0.0f;
            }
            if (enumC1684030tvN != EnumC1684030tvN.Vertical) {
                fFloatValue = 0.0f;
            }
            jLIZ = C1374205Zk.LIZ(f, fFloatValue);
        }
        return new C1395705dD(jLIZ);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1681250tqt c1681250tqt = new C1681250tqt(this.LLILLL, interfaceC1364105Vn);
        c1681250tqt.LLILLJJLI = ((C1395705dD) obj).LIZ;
        return c1681250tqt;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1395705dD c1395705dD, InterfaceC1364105Vn<? super C1395705dD> interfaceC1364105Vn) {
        return ((a) create(new C1395705dD(c1395705dD.LIZ), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
