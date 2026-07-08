package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS458S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535050q35 extends C09AY implements Function1<AbstractC1534220q1k<?>, Unit> {
    public final /* synthetic */ C1533490q0Z LL;
    public final /* synthetic */ LinkedList<String> LLILLJJLI;
    public final /* synthetic */ AbstractC1534540q2G LLILLL;
    public final /* synthetic */ C1535040q34 LLILZ;
    public final /* synthetic */ Class<?> LLILZIL;
    public final /* synthetic */ C1533790q13 LLILZLL;
    public final /* synthetic */ Thread LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Function1<C1534360q1y<?>, Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1535050q35(C1533490q0Z c1533490q0Z, LinkedList<String> linkedList, AbstractC1534540q2G abstractC1534540q2G, C1535040q34 c1535040q34, Class<?> cls, C1533790q13 c1533790q13, Thread thread, boolean z, Function1<? super C1534360q1y<?>, Unit> function1) {
        super(1);
        this.LL = c1533490q0Z;
        this.LLILLJJLI = linkedList;
        this.LLILLL = abstractC1534540q2G;
        this.LLILZ = c1535040q34;
        this.LLILZIL = cls;
        this.LLILZLL = c1533790q13;
        this.LLIZ = thread;
        this.LLIZLLLIL = z;
        this.LLJ = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1534220q1k<?> abstractC1534220q1k) {
        C1535110q3B<?> c1535110q3BLIZIZ;
        AbstractC1534220q1k<?> abstractC1534220q1k2 = abstractC1534220q1k;
        C1533910q1F c1533910q1F = this.LL.LJJJLZIJ;
        if (c1533910q1F != null) {
            c1533910q1F.LIZJ();
        }
        this.LLILLJJLI.add(this.LLILLL.getName());
        if (abstractC1534220q1k2 == null) {
            C1535250q3P c1535250q3P = new C1535250q3P("ResourceProcessChain", "processDataProvider", "failed to get Data from dataProvider", null, null, false, null, 120);
            C1533790q13 c1533790q13 = this.LLILZLL;
            C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P, 27));
            c1533790q13.LJIILIIL(c1535250q3P);
            this.LLILZ.LJ(this.LLILZIL, this.LL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, true, this.LLILLJJLI, this.LLJ);
        } else {
            C1492150ovt c1492150ovt = this.LLILZLL.LIZJ;
            boolean z = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL.getName());
            sbLIZ.append("_cost");
            c1492150ovt.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZLL.LIZJ.LIZLLL("prepare_processors");
            boolean z2 = this.LLILZLL.LIZ.LJJIIZ;
            C1534360q1y<?> c1534360q1y = new C1534360q1y<>(abstractC1534220q1k2, z2);
            this.LLILZ.LJIILJJIL = c1534360q1y;
            HashSet<AbstractC1535150q3F<?, ?>> hashSet = C1535040q34.LJIIZILJ;
            C1535040q34 c1535040q34 = this.LLILZ;
            for (AbstractC1535150q3F<?, ?> abstractC1535150q3F : hashSet) {
                c1535040q34.getClass();
                C1535110q3B c1535110q3B = (C1535110q3B) c1535040q34.LIZJ(abstractC1535150q3F.LIZ).LIZ();
                if (c1535110q3B != null) {
                    HashMap map = c1535110q3B.LIZIZ;
                    HashMap map2 = map;
                    if (map == null) {
                        map2 = new HashMap();
                    }
                    c1535110q3B.LIZIZ = map2;
                    if (map2.get(abstractC1535150q3F.LIZIZ) == null) {
                        map2.put(abstractC1535150q3F.LIZIZ, abstractC1535150q3F);
                    }
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("cannot set processor, name: ");
                    sbLIZ2.append(abstractC1535150q3F.getName());
                    C1533880q1C.LIZ("ResourceProcessChain", "setCorrespondingProcessorIfAbsent", C2188811AlT.LIZIZ(sbLIZ2), null, null);
                }
            }
            C1535040q34 c1535040q342 = this.LLILZ;
            Class<?> cls = abstractC1534220q1k2.LIZ;
            c1535040q342.getClass();
            C1535040q34.LIZIZ(c1535040q342, cls, new HashSet());
            C259800zU c259800zU = new C259800zU();
            C259800zU c259800zU2 = new C259800zU();
            C1535040q34 c1535040q343 = this.LLILZ;
            Class<?> cls2 = this.LLILZIL;
            C1533790q13 c1533790q132 = this.LLILZLL;
            if (!c1535040q343.LIZLLL(cls2, c1533790q132, c1533790q132.LIZ.LJJJJJL, null, null, new AwS458S0200000_23(c259800zU, (C259800zU<LinkedList<AbstractC1535150q3F<?, ?>>>) c259800zU2, (C259800zU<C1534360q1y<?>>) 0))) {
                C1535250q3P c1535250q3P2 = new C1535250q3P("ResourceProcessChain", "fetch", "failed to get processor chain", null, null, false, null, 120);
                C1533790q13 c1533790q133 = this.LLILZLL;
                C1534250q1n.LIZ.LJIIJ(new AwS567S0100000_23(c1535250q3P2, 28));
                c1533790q133.LJIILIIL(c1535250q3P2);
                try {
                    abstractC1534220q1k2.LIZJ();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                this.LLILZ.LJ(this.LLILZIL, this.LL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, true, this.LLILLJJLI, this.LLJ);
            } else {
                if (c259800zU2.element != this.LLILZ.LJIILJJIL) {
                    C1533880q1C.LIZ("ResourceProcessChain", "processDataProvider", "tmpDataWrapper differs from dataWrapper", null, null);
                }
                LinkedList linkedList = (LinkedList) c259800zU.element;
                if (linkedList == null) {
                    C1533880q1C.LIZ("ResourceProcessChain", "processDataProvider", "nonNullProcessorChain is null", null, null);
                } else {
                    LinkedList linkedList2 = new LinkedList();
                    Iterator it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        linkedList2.add(((AbstractC1535150q3F) it2.next()).LIZIZ);
                    }
                    Iterator it3 = linkedList.iterator();
                    while (it3.hasNext()) {
                        it3.next().getClass();
                    }
                    this.LLILZ.LJIIJJI.countDown();
                    C1534320q1u<C1535200q3K<Runnable>> c1534320q1u = this.LLILZ.LJIIL;
                    c1534320q1u.LIZIZ = true;
                    while (c1534320q1u.LIZJ.get() > 0) {
                    }
                    if (!this.LLILZ.LJIIL.LIZIZ()) {
                        C086F c086f = C086F.LIZ;
                        AwS567S0100000_23 awS567S0100000_23 = new AwS567S0100000_23(this.LLILZ, 29);
                        c086f.getClass();
                        C086F.LJI(awS567S0100000_23);
                    }
                    if (linkedList.isEmpty() || !Intrinsics.LJFF(((AbstractC1535150q3F) linkedList.getFirst()).LIZIZ, abstractC1534220q1k2.LIZ)) {
                        C1535180q3I<C1535110q3B<?>> c1535180q3I = this.LLILZ.LJIILL.get(abstractC1534220q1k2.LIZ);
                        if (c1535180q3I != null) {
                            c1535110q3BLIZIZ = c1535180q3I.LIZIZ();
                        } else {
                            c1535110q3BLIZIZ = null;
                        }
                        if ((c1535110q3BLIZIZ instanceof C1535110q3B) && c1535110q3BLIZIZ != null) {
                            if (this.LLILLL.LIZJ() == EnumC1528510psX.NO_REUSE) {
                                z = false;
                            }
                            c1535110q3BLIZIZ.LIZIZ(c1534360q1y, z, this.LLILZLL);
                        }
                    }
                    this.LLILZLL.LIZJ.LIZJ("prepare_processors");
                    C1535040q34 c1535040q344 = this.LLILZ;
                    if (z2) {
                        abstractC1534220q1k2 = null;
                    } else {
                        c1534360q1y = null;
                    }
                    c1535040q344.LJIIJ(abstractC1534220q1k2, c1534360q1y, this.LLILZIL, this.LL.LJJJJJL, this.LLIZ, this.LLIZLLLIL, this.LLILZLL, linkedList.iterator(), this.LLJ, linkedList2, this.LLILLJJLI);
                }
            }
        }
        return Unit.LIZ;
    }
}
