package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.pns.activitycenter.watchhistory.feeds.WHFeedsBridgeModel$parallelFetchAwemeList$2$result$1$1", f = "WHFeedsBridgeModel.kt", l = {}, m = "invokeSuspend")
public final class C1442005kg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super IndexedValue<? extends List<? extends Aweme>>>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1884130z87 LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1442005kg(int i, C1884130z87 c1884130z87, List<String> list, InterfaceC1364105Vn<? super C1442005kg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = c1884130z87;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1442005kg(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WHFeedsBridgeModel@17b3.parallelFetchAwemeList$2$result$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        C1884130z87 c1884130z87 = this.LLILLJJLI;
        List<String> list = this.LLILLL;
        c1884130z87.getClass();
        IndexedValue indexedValue = new IndexedValue(i, C1884130z87.LJIIJJI(list));
        C1C7U.LIZIZ("WHFeedsBridgeModel@17b3.parallelFetchAwemeList$2$result$1$1");
        return indexedValue;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super IndexedValue<? extends List<? extends Aweme>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
