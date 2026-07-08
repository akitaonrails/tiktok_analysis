package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCacheLoader$loadInBatches$apiResult$1", f = "GHouseCacheLoader.kt", l = {}, m = "invokeSuspend")
public final class C591090NGh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends CacheEntry>>, Object> {
    public final /* synthetic */ C259800zU<List<CacheEntry>> LL;
    public final /* synthetic */ C591100NGi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591090NGh(C259800zU<List<CacheEntry>> c259800zU, C591100NGi c591100NGi, InterfaceC1364105Vn<? super C591090NGh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = c591100NGi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591090NGh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GHouseCacheLoader@5f9a.loadInBatches$apiResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.element.isEmpty()) {
            C13BV c13bv = C13BV.INSTANCE;
            C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$apiResult$1");
            return c13bv;
        }
        C591100NGi c591100NGi = this.LLILLJJLI;
        List<CacheEntry> listLIZIZ = c591100NGi.LIZIZ((C591270NGz) c591100NGi.LJI.getValue(), this.LL.element);
        List<CacheEntry> list = this.LL.element;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!listLIZIZ.contains(obj2)) {
                arrayList.add(obj2);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$apiResult$1");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends CacheEntry>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
