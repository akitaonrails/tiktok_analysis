package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.bottom.BottomTabManager$handleBottomTabIndexChangeEvent$1", f = "BottomTabManager.kt", l = {414}, m = "invokeSuspend")
public final class C592460NLo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1653290t7n LLILLJJLI;
    public final /* synthetic */ C259800zU<C1653090t7T> LLILLL;
    public final /* synthetic */ C259800zU<C1653090t7T> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592460NLo(AbstractC1653290t7n abstractC1653290t7n, C259800zU<C1653090t7T> c259800zU, C259800zU<C1653090t7T> c259800zU2, InterfaceC1364105Vn<? super C592460NLo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1653290t7n;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592460NLo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1653180t7c abstractC1653180t7c;
        C1C7U.LIZ("BottomTabManager@2e67.handleBottomTabIndexChangeEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        AbstractC1653180t7c abstractC1653180t7c2 = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1DFK c1dfk = this.LLILLJJLI.LJIILIIL;
            if (c1dfk == null || !c1dfk.isCompleted()) {
                C1DFB c1dfb = C0PEM.LIZJ;
                C592450NLn c592450NLn = new C592450NLn(this.LLILLJJLI, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c1dfb, c592450NLn) == objLJFF) {
                    C1C7U.LIZIZ("BottomTabManager@2e67.handleBottomTabIndexChangeEvent$1");
                    return objLJFF;
                }
            }
        }
        AbstractC1653290t7n abstractC1653290t7n = this.LLILLJJLI;
        C1653090t7T c1653090t7T = this.LLILLL.element;
        if (c1653090t7T != null) {
            abstractC1653180t7c = c1653090t7T.LIZIZ;
        } else {
            abstractC1653180t7c = null;
        }
        C1653090t7T c1653090t7T2 = this.LLILZ.element;
        if (c1653090t7T2 != null) {
            abstractC1653180t7c2 = c1653090t7T2.LIZIZ;
        }
        abstractC1653290t7n.LJIIJ(abstractC1653180t7c, abstractC1653180t7c2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomTabManager@2e67.handleBottomTabIndexChangeEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
