package X;

import Y.AComparatorS21S0000000_2;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05kf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds.WHFeedsBridgeModel$parallelFetchAwemeList$2", f = "WHFeedsBridgeModel.kt", l = {487}, m = "invokeSuspend")
public final class C1441905kf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ C1884130z87 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1441905kf(C1884130z87 c1884130z87, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c1884130z87;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1441905kf c1441905kf = new C1441905kf(this.LLILZ, this.LLILLL, interfaceC1364105Vn);
        c1441905kf.LLILLJJLI = obj;
        return c1441905kf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WHFeedsBridgeModel@17b3.parallelFetchAwemeList$2");
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
            List listLJJJIL = C13LP.LJJJIL(this.LLILLL, 12);
            C1884130z87 c1884130z87 = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJIL, 10));
            int i2 = 0;
            for (Object obj2 : listLJJJIL) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C1442005kg(i2, c1884130z87, (List) obj2, null), 2));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.parallelFetchAwemeList$2");
                return objLJFF;
            }
        }
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS21S0000000_2(0), (Iterable) obj);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI((Iterable) ((IndexedValue) it2.next()).LIZIZ, arrayList2);
        }
        C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.parallelFetchAwemeList$2");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Aweme>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
