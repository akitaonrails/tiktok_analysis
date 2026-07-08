package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS553S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$init$3", f = "GoldenHouse.kt", l = {209}, m = "invokeSuspend")
public final class C591230NGv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NH6 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591230NGv(C0NH6 c0nh6, InterfaceC1364105Vn<? super C591230NGv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nh6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591230NGv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoldenHouse@3441.init$3");
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
            this.LL = 1;
            c0ngo.getClass();
            C591100NGi c591100NGi = new C591100NGi(c0ngo, c0ngo.LIZIZ, c0ngo.LJIIL, c0ngo);
            c0ngo.LJIIJJI = c591100NGi;
            ArrayList arrayList = (ArrayList) c591100NGi.LJ;
            arrayList.add(new InterfaceC591200NGs() { // from class: X.0NGw
                @Override // X.InterfaceC591200NGs
                public final C591190NGr LIZ(List<? extends CacheEntry> list) {
                    ArrayList arrayList2 = new ArrayList();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (CacheEntry cacheEntry : list) {
                        if (jCurrentTimeMillis - cacheEntry.creationDate <= C0NH4.LIZIZ(cacheEntry)) {
                            arrayList2.add(cacheEntry);
                        } else {
                            cacheEntry.LIZ = true;
                            arrayList2.add(cacheEntry);
                        }
                    }
                    return new C591190NGr("video_expired", arrayList2, list.size() - arrayList2.size());
                }
            });
            arrayList.add(new InterfaceC591200NGs() { // from class: X.0NGu
                @Override // X.InterfaceC591200NGs
                public final C591190NGr LIZ(List<? extends CacheEntry> list) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    for (CacheEntry cacheEntry : list) {
                        C591050NGd c591050NGd = C591050NGd.LIZ;
                        String str = cacheEntry.videoFilePath;
                        c591050NGd.getClass();
                        try {
                            if (new C0VSJ(str).exists()) {
                                arrayList2.add(cacheEntry);
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C0NH6.LJIILLIIL.LJII(new C5182020e(e, 358));
                        }
                    }
                    return new C591190NGr("video_file_missing", arrayList2, list.size() - arrayList2.size());
                }
            });
            Object objLIZJ = c591100NGi.LIZJ(this);
            if (objLIZJ != C099R.LJFF()) {
                objLIZJ = Unit.LIZ;
            }
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("GoldenHouse@3441.init$3");
                return objLJFF;
            }
        }
        C0NJD<C0NHK> c0njd = this.LLILLJJLI.LJIILL;
        C0NHK c0nhk = C0NHK.LOADING;
        C0NHK c0nhk2 = C0NHK.CACHE_AVAILABLE;
        AtomicReference<C0NHK> atomicReference = c0njd.LIZ;
        while (!atomicReference.compareAndSet(c0nhk, c0nhk2) && atomicReference.get() == c0nhk) {
        }
        C0NH6.LJIILLIIL.LJIIJJI(new AwS553S0100000_9(this.LLILLJJLI, 1764));
        C1DFK c1dfk = this.LLILLJJLI.LJIIJ;
        if (c1dfk != null) {
            Boolean.valueOf(c1dfk.LJFF());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse@3441.init$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
