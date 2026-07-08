package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.api.recommend.ParallelRequestChain$parallelProcessInternal$2", f = "ParallelRequestChain.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1332405Ji extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends Unit>>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1333005Jo<?>> LLILLL;
    public final /* synthetic */ List<InterfaceC1333005Jo<?>> LLILZ;
    public final /* synthetic */ C1332905Jn<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1332405Ji(C1332905Jn c1332905Jn, List list, List list2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = c1332905Jn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1332405Ji c1332405Ji = new C1332405Ji(this.LLILZIL, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1332405Ji.LLILLJJLI = obj;
        return c1332405Ji;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ParallelRequestChain@7b5a.parallelProcessInternal$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                List<InterfaceC1333005Jo<?>> list = this.LLILLL;
                List<InterfaceC1333005Jo<?>> list2 = this.LLILZ;
                C1332905Jn<Object> c1332905Jn = this.LLILZIL;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<InterfaceC1333005Jo<?>> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1332505Jj(c1332905Jn, it2.next(), null), 3));
                }
                Iterator<InterfaceC1333005Jo<?>> it3 = list2.iterator();
                while (it3.hasNext()) {
                    c1332905Jn.LIZIZ(it3.next());
                }
                this.LL = 1;
                obj = C1D9F.LIZ(arrayList, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ParallelRequestChain@7b5a.parallelProcessInternal$2");
                    return objLJFF;
                }
            }
            c098200Yq = (List) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("ParallelRequestChain@7b5a.parallelProcessInternal$2");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends List<? extends Unit>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
