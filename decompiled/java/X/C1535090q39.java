package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0q39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535090q39 extends C09AY implements Function1 {
    public final /* synthetic */ C1533790q13 LL;
    public final /* synthetic */ AbstractC1535150q3F<Object, ?> LLILLJJLI;
    public final /* synthetic */ Iterator<AbstractC1535150q3F<?, ?>> LLILLL;
    public final /* synthetic */ C1535040q34 LLILZ;
    public final /* synthetic */ CountDownLatch LLILZIL;
    public final /* synthetic */ Function1<C1534360q1y<?>, Unit> LLILZLL;
    public final /* synthetic */ Class<?> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Thread LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ LinkedList<Class<?>> LLJIJIL;
    public final /* synthetic */ LinkedList<String> LLJILJIL;
    public final /* synthetic */ AbstractC1534220q1k<Object> LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1535090q39(C1533790q13 c1533790q13, AbstractC1535150q3F<Object, ?> abstractC1535150q3F, Iterator<? extends AbstractC1535150q3F<?, ?>> it2, C1535040q34 c1535040q34, CountDownLatch countDownLatch, Function1<? super C1534360q1y<?>, Unit> function1, Class<?> cls, boolean z, Thread thread, boolean z2, LinkedList<Class<?>> linkedList, LinkedList<String> linkedList2, AbstractC1534220q1k<Object> abstractC1534220q1k, boolean z3) {
        super(1);
        this.LL = c1533790q13;
        this.LLILLJJLI = abstractC1535150q3F;
        this.LLILLL = it2;
        this.LLILZ = c1535040q34;
        this.LLILZIL = countDownLatch;
        this.LLILZLL = function1;
        this.LLIZ = cls;
        this.LLIZLLLIL = z;
        this.LLJ = thread;
        this.LLJI = z2;
        this.LLJIJIL = linkedList;
        this.LLJILJIL = linkedList2;
        this.LLJILJILJ = abstractC1534220q1k;
        this.LLJILLL = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        C1534360q1y<?> c1534360q1y;
        C1534360q1y<?> c1534360q1y2;
        boolean z;
        boolean z2;
        C1535110q3B<?> c1535110q3BLIZ;
        C1535110q3B<?> c1535110q3BLIZ2;
        AbstractC1534220q1k abstractC1534220q1k = (AbstractC1534220q1k) obj;
        C1492150ovt c1492150ovt = this.LL.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI.getName());
        sbLIZ.append("_cost");
        c1492150ovt.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("process finished, type: ");
        AbstractC1534220q1k abstractC1534220q1k2 = null;
        if (abstractC1534220q1k != null) {
            obj2 = abstractC1534220q1k.LIZ;
        } else {
            obj2 = null;
        }
        sbLIZ2.append(obj2);
        C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "processProcessors", C2188811AlT.LIZIZ(sbLIZ2), null, null, false, null, 120);
        C1533790q13 c1533790q13 = this.LL;
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        c1534250q1n.LJIIJ(new AwS567S0100000_23(c1535250q3P, 32));
        c1533790q13.LJIILIIL(c1535250q3P);
        if (abstractC1534220q1k != null) {
            AbstractC1534220q1k<Object> abstractC1534220q1k3 = this.LLJILJILJ;
            boolean z3 = this.LLJILLL;
            InterfaceC1535380q3c interfaceC1535380q3c = abstractC1534220q1k.LIZIZ;
            if (interfaceC1535380q3c == null) {
                interfaceC1535380q3c = abstractC1534220q1k3.LIZIZ;
            }
            abstractC1534220q1k.LIZIZ = interfaceC1535380q3c;
            c1534360q1y = new C1534360q1y<>(abstractC1534220q1k, z3);
        } else {
            c1534360q1y = null;
        }
        boolean zHasNext = this.LLILLL.hasNext();
        C1535040q34 c1535040q34 = this.LLILZ;
        AbstractC1535150q3F<Object, ?> abstractC1535150q3F = this.LLILLJJLI;
        if (c1534360q1y == null) {
            c1534360q1y2 = null;
        } else {
            c1534360q1y2 = c1534360q1y;
        }
        C1533790q13 c1533790q132 = this.LL;
        if (abstractC1534220q1k != null && zHasNext) {
            z = true;
        } else {
            z = false;
        }
        if (c1535040q34.LJII(abstractC1535150q3F, c1534360q1y2, c1533790q132, z)) {
            CountDownLatch countDownLatch = this.LLILZIL;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
            C1535250q3P c1535250q3P2 = new C1535250q3P("ResourceProcessChain", "processProcessors", "process chain intercepted", null, null, false, null, 120);
            C1533790q13 c1533790q133 = this.LL;
            c1534250q1n.LJIIJ(new AwS567S0100000_23(c1535250q3P2, 33));
            c1533790q133.LJIILIIL(c1535250q3P2);
            if (zHasNext) {
                Iterator<AbstractC1535150q3F<?, ?>> it2 = this.LLILLL;
                C1535040q34 c1535040q342 = this.LLILZ;
                while (it2.hasNext()) {
                    C1535180q3I<C1535110q3B<?>> c1535180q3I = c1535040q342.LJIILL.get(it2.next().LIZIZ);
                    if (c1535180q3I != null) {
                        c1535110q3BLIZ2 = c1535180q3I.LIZ();
                    } else {
                        c1535110q3BLIZ2 = null;
                    }
                    if ((c1535110q3BLIZ2 instanceof C1535110q3B) && c1535110q3BLIZ2 != null) {
                        c1535110q3BLIZ2.LIZIZ(null, false, null);
                    }
                }
            }
            this.LLILZLL.invoke(c1534360q1y);
        } else if (abstractC1534220q1k == null) {
            CountDownLatch countDownLatch2 = this.LLILZIL;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
            if (zHasNext) {
                Iterator<AbstractC1535150q3F<?, ?>> it3 = this.LLILLL;
                C1535040q34 c1535040q343 = this.LLILZ;
                while (it3.hasNext()) {
                    C1535180q3I<C1535110q3B<?>> c1535180q3I2 = c1535040q343.LJIILL.get(it3.next().LIZIZ);
                    if (c1535180q3I2 != null) {
                        c1535110q3BLIZ = c1535180q3I2.LIZ();
                    } else {
                        c1535110q3BLIZ = null;
                    }
                    if ((c1535110q3BLIZ instanceof C1535110q3B) && c1535110q3BLIZ != null) {
                        c1535110q3BLIZ.LIZIZ(null, false, null);
                    }
                }
            }
            this.LLILZLL.invoke(null);
        } else {
            C1535040q34 c1535040q344 = this.LLILZ;
            C1533790q13 c1533790q134 = this.LL;
            if (!c1533790q134.LIZ.LJJIIZ) {
                abstractC1534220q1k2 = abstractC1534220q1k;
            }
            Class<?> cls = this.LLIZ;
            boolean z4 = this.LLIZLLLIL;
            Thread thread = this.LLJ;
            if (!this.LLJI && this.LLILZIL == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            c1535040q344.LJIIJ(abstractC1534220q1k2, c1534360q1y, cls, z4, thread, z2, c1533790q134, this.LLILLL, this.LLILZLL, this.LLJIJIL, this.LLJILJIL);
            CountDownLatch countDownLatch3 = this.LLILZIL;
            if (countDownLatch3 != null) {
                countDownLatch3.countDown();
            }
        }
        return Unit.LIZ;
    }
}
