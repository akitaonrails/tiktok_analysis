package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NGF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$saveCacheEntry$1", f = "GoldenHouse.kt", l = {738}, m = "invokeSuspend")
public final class C0NGF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NH6 LLILLJJLI;
    public final /* synthetic */ CacheEntry LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NGF(C0NH6 c0nh6, CacheEntry cacheEntry, Function0<Unit> function0, InterfaceC1364105Vn<? super C0NGF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nh6;
        this.LLILLL = cacheEntry;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGF(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        Object objLJJIJIIJI;
        C1C7U.LIZ("GoldenHouse@3441.saveCacheEntry$1");
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
            C0NGO c0ngo = this.LLILLJJLI.LIZJ;
            CacheEntry cacheEntry = this.LLILLL;
            this.LL = 1;
            while (true) {
                C0NGG c0ngg = c0ngo.LIZLLL.get();
                ArrayList arrayList = new ArrayList(c0ngg.LIZIZ);
                Iterator it2 = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((CacheEntry) it2.next()).key, cacheEntry.key)) {
                        if (i2 >= 0 && i2 < arrayList.size()) {
                            if (((CacheEntry) ListProtector.get(arrayList, i2)).LIZ) {
                                ListProtector.set(arrayList, i2, cacheEntry);
                            } else {
                                unit = Unit.LIZ;
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        i2++;
                    }
                }
                Boolean.valueOf(arrayList.add(cacheEntry));
                c0ngo.LIZ.LIZ(arrayList);
                if ((!arrayList.isEmpty()) && arrayList.size() > c0ngo.LIZIZ.LIZ) {
                    objLJJIJIIJI = C19719612Di.LJJIJIIJI(arrayList);
                } else {
                    objLJJIJIIJI = null;
                }
                Pair pair = new Pair(cacheEntry, objLJJIJIIJI);
                AtomicReference<C0NGG> atomicReference = c0ngo.LIZLLL;
                C0NGG c0ngg2 = new C0NGG(c0ngg.LIZ + 1, arrayList);
                while (!atomicReference.compareAndSet(c0ngg, c0ngg2)) {
                    if (atomicReference.get() != c0ngg) {
                        break;
                    }
                }
                CacheEntry cacheEntry2 = (CacheEntry) pair.getFirst();
                CacheEntry cacheEntry3 = (CacheEntry) pair.getSecond();
                if (cacheEntry2 != null || cacheEntry3 != null) {
                    c0ngo.LJI();
                    C23250099c.LIZLLL(c0ngo.LJIIIIZZ, null, null, new C591250NGx(cacheEntry2, cacheEntry3, c0ngo, null), 3);
                }
                unit = Unit.LIZ;
            }
            if (unit == objLJFF) {
                C1C7U.LIZIZ("GoldenHouse@3441.saveCacheEntry$1");
                return objLJFF;
            }
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse@3441.saveCacheEntry$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
