package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$onCacheApiVerifyFailed$2", f = "GoldenHouse.kt", l = {}, m = "invokeSuspend")
public final class C0NGI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NH6 LL;
    public final /* synthetic */ List<CacheEntry> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NGI(C0NH6 c0nh6, List<? extends CacheEntry> list, InterfaceC1364105Vn<? super C0NGI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0nh6;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoldenHouse@3441.onCacheApiVerifyFailed$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList = new ArrayList(this.LL.LJIILIIL);
        List<CacheEntry> list = this.LLILLJJLI;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C0NGJ) it2.next()).LIZ(list);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse@3441.onCacheApiVerifyFailed$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
