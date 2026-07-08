package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.rss.components.ArticleImageLoader$fetchAndCacheImages$2", f = "ArticleImageLoader.kt", l = {65}, m = "invokeSuspend")
public final class C317410CcN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C1325710kbR> LLILLL;
    public final /* synthetic */ C1321590kUn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317410CcN(C1321590kUn c1321590kUn, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1321590kUn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C317410CcN c317410CcN = new C317410CcN(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c317410CcN.LLILLJJLI = obj;
        return c317410CcN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ArticleImageLoader@71b3.fetchAndCacheImages$2");
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
            List<C1325710kbR> list = this.LLILLL;
            C1321590kUn c1321590kUn = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1325710kbR> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C445510HdV(c1321590kUn, it2.next(), null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ArticleImageLoader@71b3.fetchAndCacheImages$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ArticleImageLoader@71b3.fetchAndCacheImages$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
