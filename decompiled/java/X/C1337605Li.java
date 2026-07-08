package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.api.recommend.AdaptiveParallelRequestChain$adaptiveParallelProcessInternal$4", f = "AdaptiveParallelRequestChain.kt", l = {135}, m = "invokeSuspend")
public final class C1337605Li extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1333005Jo<Object>> LLILLL;
    public final /* synthetic */ List<InterfaceC1333005Jo<Object>> LLILZ;
    public final /* synthetic */ InterfaceC1337805Lk LLILZIL;
    public final /* synthetic */ C1337905Ll<Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1337605Li(List<? extends InterfaceC1333005Jo<Object>> list, List<? extends InterfaceC1333005Jo<Object>> list2, InterfaceC1337805Lk interfaceC1337805Lk, C1337905Ll<Object> c1337905Ll, InterfaceC1364105Vn<? super C1337605Li> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = interfaceC1337805Lk;
        this.LLILZLL = c1337905Ll;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1337605Li c1337605Li = new C1337605Li(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1337605Li.LLILLJJLI = obj;
        return c1337605Li;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcessInternal$4");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL.isEmpty()) {
                pair = new Pair(C13LP.LJJJJZI(this.LLILZ), C13LP.LJJJJIZL(this.LLILZ, 1));
            } else {
                pair = new Pair(null, this.LLILZ);
            }
            InterfaceC1333005Jo<?> interfaceC1333005Jo = (InterfaceC1333005Jo) pair.getFirst();
            List list = (List) pair.getSecond();
            InterfaceC1337805Lk interfaceC1337805Lk = this.LLILZIL;
            C1337905Ll<Object> c1337905Ll = this.LLILZLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C1337705Lj(interfaceC1337805Lk, c1337905Ll, (InterfaceC1333005Jo) it2.next(), null), 2));
            }
            if (interfaceC1333005Jo != null) {
                this.LLILZLL.LIZJ(interfaceC1333005Jo);
            }
            List<InterfaceC1333005Jo<Object>> list2 = this.LLILLL;
            C1337905Ll<Object> c1337905Ll2 = this.LLILZLL;
            Iterator<InterfaceC1333005Jo<Object>> it3 = list2.iterator();
            while (it3.hasNext()) {
                c1337905Ll2.LIZJ(it3.next());
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcessInternal$4");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AdaptiveParallelRequestChain@f94f.adaptiveParallelProcessInternal$4");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
