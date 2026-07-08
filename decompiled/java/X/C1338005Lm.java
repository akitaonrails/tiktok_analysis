package X;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.api.recommend.AdaptiveParallelRequestChain$adaptiveParallelProcess$1", f = "AdaptiveParallelRequestChain.kt", l = {52, 54}, m = "invokeSuspend")
public final class C1338005Lm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1337905Ll<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338005Lm(C1337905Ll<Object> c1337905Ll, InterfaceC1364105Vn<? super C1338005Lm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1337905Ll;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1338005Lm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ;
        Object objLIZIZ2;
        C1C7U.LIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1337905Ll<Object> c1337905Ll = this.LLILLJJLI;
            if (c1337905Ll.LJFF.LIZIZ == 0) {
                this.LL = 1;
                if (c1337905Ll.LJ.size() <= 1) {
                    Iterator<InterfaceC1333005Jo<Object>> it2 = c1337905Ll.LJ.iterator();
                    while (it2.hasNext()) {
                        c1337905Ll.LIZJ((InterfaceC1333005Jo) it2.next());
                    }
                    objLIZIZ2 = Unit.LIZ;
                } else {
                    objLIZIZ2 = c1337905Ll.LIZIZ(40.0d, c1337905Ll.LJIIIIZZ, this);
                    if (objLIZIZ2 != C099R.LJFF()) {
                        objLIZIZ2 = Unit.LIZ;
                    }
                }
                if (objLIZIZ2 == objLJFF) {
                    C1C7U.LIZIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcess$1");
                    return objLJFF;
                }
            } else {
                this.LL = 2;
                Iterator<InterfaceC1333005Jo<Object>> it3 = c1337905Ll.LJ.iterator();
                boolean z = false;
                double d = 0.0d;
                double dDoubleValue = 0.0d;
                while (it3.hasNext()) {
                    Double d2 = C1337905Ll.LJIIJ.get(it3.next().getClass().getName());
                    if (d2 != null) {
                        dDoubleValue += d2.doubleValue();
                        z = true;
                    }
                }
                if (z) {
                    d = dDoubleValue;
                }
                if (c1337905Ll.LJ.size() > 1 && d >= 50.0d) {
                    objLIZIZ = c1337905Ll.LIZIZ(15.0d, c1337905Ll.LJIIIZ, this);
                    if (objLIZIZ != C099R.LJFF()) {
                        objLIZIZ = Unit.LIZ;
                    }
                } else {
                    Iterator<InterfaceC1333005Jo<Object>> it4 = c1337905Ll.LJ.iterator();
                    while (it4.hasNext()) {
                        c1337905Ll.LIZJ((InterfaceC1333005Jo) it4.next());
                    }
                    objLIZIZ = Unit.LIZ;
                }
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcess$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
