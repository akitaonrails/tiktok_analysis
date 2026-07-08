package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NGE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$deleteCacheByAweme$1", f = "GoldenHouse.kt", l = {653, 656}, m = "invokeSuspend")
public final class C0NGE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NH6 LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0NGE(C0NH6 c0nh6, Aweme aweme, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C0NGE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nh6;
        this.LLILLL = aweme;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGE(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CacheEntry next;
        Boolean boolValueOf;
        C1C7U.LIZ("GoldenHouse@3441.deleteCacheByAweme$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GoldenHouse@3441.deleteCacheByAweme$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0NGO c0ngo = this.LLILLJJLI.LIZJ;
            String aid = this.LLILLL.getAid();
            if (aid == null) {
                aid = "";
            }
            this.LL = 1;
            c0ngo.getClass();
            boolean zBooleanValue = false;
            if (aid.length() == 0) {
                obj = false;
            } else if (!c0ngo.LJI) {
                C823170WQx c823170WQx = c0ngo.LJII;
                if (c823170WQx != null) {
                    Boolean.valueOf(c823170WQx.add(aid));
                }
                obj = false;
            } else {
                Iterator<CacheEntry> it2 = c0ngo.LIZLLL.get().LIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.key, aid)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                CacheEntry cacheEntry = next;
                if (cacheEntry == null) {
                    obj = false;
                } else {
                    loop1: while (true) {
                        C0NGG c0ngg = c0ngo.LIZLLL.get();
                        ArrayList arrayList = new ArrayList(c0ngg.LIZIZ);
                        boolValueOf = Boolean.valueOf(arrayList.remove(cacheEntry));
                        AtomicReference<C0NGG> atomicReference = c0ngo.LIZLLL;
                        C0NGG c0ngg2 = new C0NGG(c0ngg.LIZ + 1, arrayList);
                        while (!atomicReference.compareAndSet(c0ngg, c0ngg2)) {
                            if (atomicReference.get() != c0ngg) {
                                break;
                            }
                        }
                    }
                    if (boolValueOf != null && (zBooleanValue = boolValueOf.booleanValue())) {
                        C23250099c.LIZLLL(c0ngo.LJIIIIZZ, null, null, new C0NGU(c0ngo, cacheEntry, null), 3);
                        c0ngo.LJI();
                    }
                    obj = Boolean.valueOf(zBooleanValue);
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GoldenHouse@3441.deleteCacheByAweme$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
        Function1<Boolean, Unit> function1 = this.LLILZ;
        if (function1 == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GoldenHouse@3441.deleteCacheByAweme$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C496501wZ c496501wZ = new C496501wZ(null, function1, zBooleanValue2);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c496501wZ) == objLJFF) {
            C1C7U.LIZIZ("GoldenHouse@3441.deleteCacheByAweme$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse@3441.deleteCacheByAweme$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
