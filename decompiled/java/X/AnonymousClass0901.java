package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.mixediting.cache.MixEditingCache;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0901, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.cache.MixEditingRecommendListCacheHelper$getCache$2", f = "MixEditingRecommendListCacheHelper.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0901 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1412860ms0>>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0901(int i, InterfaceC1364105Vn<? super AnonymousClass0901> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new AnonymousClass0901(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("MixEditingRecommendListCacheHelper@f5e3.getCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String string = AnonymousClass0902.LIZ().getString(String.valueOf(this.LL), null);
        if (string == null) {
            C201955140j.LIZLLL(C0MJ8.LIZIZ, "CacheHelper", "useCache -> false, cache is null");
            C1C7U.LIZIZ("MixEditingRecommendListCacheHelper@f5e3.getCache$2");
            return null;
        }
        try {
            c098200Yq = (MixEditingCache) C2292508yZ.LIZ(string, MixEditingCache.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        MixEditingCache mixEditingCache = (MixEditingCache) c098200Yq;
        if (mixEditingCache != null) {
            List<C1412860ms0> list = mixEditingCache.itemList;
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (!z && mixEditingCache.timestamp != null) {
                if (System.currentTimeMillis() - mixEditingCache.timestamp.longValue() > ((long) (((Number) AnonymousClass0904.LIZ.getValue()).intValue() * 60 * 60)) * 1000) {
                    C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                    C201955140j.LIZLLL(c0mj8, "CacheHelper", "getCache -> cache is expired");
                    AnonymousClass0902.LIZ().erase(String.valueOf(this.LL));
                    if (((Boolean) AnonymousClass0903.LIZ.getValue()).booleanValue()) {
                        C201955140j.LIZLLL(c0mj8, "CacheHelper", "useCache -> false, cache is expired");
                        C1C7U.LIZIZ("MixEditingRecommendListCacheHelper@f5e3.getCache$2");
                        return null;
                    }
                }
                C201955140j.LIZLLL(C0MJ8.LIZIZ, "CacheHelper", "useCache -> true");
                List<C1412860ms0> list2 = mixEditingCache.itemList;
                C1C7U.LIZIZ("MixEditingRecommendListCacheHelper@f5e3.getCache$2");
                return list2;
            }
        }
        C201955140j.LIZLLL(C0MJ8.LIZIZ, "CacheHelper", "useCache -> false, invalid cache date");
        AnonymousClass0902.LIZ().erase(String.valueOf(this.LL));
        C1C7U.LIZIZ("MixEditingRecommendListCacheHelper@f5e3.getCache$2");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C1412860ms0>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
