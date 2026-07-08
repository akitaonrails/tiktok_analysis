package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCachePool$onCacheApiVerifyFailed$1", f = "GHouseCachePool.kt", l = {}, m = "invokeSuspend")
public final class C0NGK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NGO LL;
    public final /* synthetic */ List<CacheEntry> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NGK(C0NGO c0ngo, List<? extends CacheEntry> list, InterfaceC1364105Vn<? super C0NGK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ngo;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("GHouseCachePool@3638.onCacheApiVerifyFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NGO c0ngo = this.LL;
        List<CacheEntry> list = this.LLILLJJLI;
        loop0: while (true) {
            C0NGG c0ngg = c0ngo.LIZLLL.get();
            ArrayList arrayList = new ArrayList(c0ngg.LIZIZ);
            boolValueOf = Boolean.valueOf(arrayList.removeAll(list));
            AtomicReference<C0NGG> atomicReference = c0ngo.LIZLLL;
            C0NGG c0ngg2 = new C0NGG(c0ngg.LIZ + 1, arrayList);
            while (!atomicReference.compareAndSet(c0ngg, c0ngg2)) {
                if (atomicReference.get() != c0ngg) {
                    break;
                }
            }
        }
        if (boolValueOf != null && boolValueOf.booleanValue()) {
            this.LL.LJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GHouseCachePool@3638.onCacheApiVerifyFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
