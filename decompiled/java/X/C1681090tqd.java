package X;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", l = {379, 380}, m = "invokeSuspend")
public final class C1681090tqd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AE LLILLJJLI;
    public final /* synthetic */ C1681100tqe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1681090tqd(C09AE c09ae, C1681100tqe c1681100tqe, InterfaceC1364105Vn<? super C1681090tqd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09ae;
        this.LLILLL = c1681100tqe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1681090tqd(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJI;
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    return Unit.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C09AE c09ae = this.LLILLJJLI;
            if (c09ae != null) {
                this.LL = 1;
                if (c09ae.LJJZ(this) == objLJFF) {
                    return objLJFF;
                }
            }
        }
        C1681100tqe c1681100tqe = this.LLILLL;
        this.LL = 2;
        if (c1681100tqe.LLJJ <= 0 || (objLJI = C23250099c.LJI(this, new InterfaceC1677690tl9() { // from class: X.0xwn
            @Override // X.InterfaceC1677690tl9
            public final float LJLJI() {
                return 1.0f;
            }

            @Override // kotlin.coroutines.CoroutineContext.Element
            public final InterfaceC23272099y getKey() {
                return InterfaceC1677690tl9.LJLJJI;
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
                return (E) C09A1.LIZIZ(this, interfaceC23272099y);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
                return C09A1.LIZJ(this, interfaceC23272099y);
            }

            @Override // kotlin.coroutines.CoroutineContext
            public final CoroutineContext plus(CoroutineContext coroutineContext) {
                return C09A1.LIZLLL(this, coroutineContext);
            }

            @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
            public final <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
                return (R) C09A1.LIZ(this, r, function2);
            }
        }, new C1681080tqc(c1681100tqe, null))) != C099R.LJFF()) {
            objLJI = Unit.LIZ;
        }
        if (objLJI == objLJFF) {
            return objLJFF;
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
