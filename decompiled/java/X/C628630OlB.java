package X;

import android.util.LruCache;
import com.ss.android.ugc.aweme.search.pages.result.entitycard.config.CacheConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0OlB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.entitycard.api.SearchEntityCardCacheManager$get$2$3", f = "SearchEntityCardCacheManager.kt", l = {}, m = "invokeSuspend")
public final class C628630OlB extends C09AX implements Function2<C0O7A<C628380Okm>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628630OlB(String str, InterfaceC1364105Vn<? super C628630OlB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C628630OlB c628630OlB = new C628630OlB(this.LLILLJJLI, interfaceC1364105Vn);
        c628630OlB.LL = obj;
        return c628630OlB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchEntityCardCacheManager@717d.get$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0O7A c0o7a = (C0O7A) this.LL;
        if (c0o7a instanceof C0O79) {
            C01GW c01gw = C628640OlC.LIZ;
            String str = this.LLILLJJLI;
            if (((CacheConfig) C628660OlE.LIZIZ.getValue()).enableCache) {
                C01GW c01gw2 = C628640OlC.LIZ;
                if (((LruCache) c01gw2.getValue()).get(str) == null) {
                    ((LruCache) c01gw2.getValue()).put(str, new C628650OlD(c0o7a, System.currentTimeMillis()));
                }
            }
        } else if (c0o7a instanceof C0O78) {
            C628640OlC.LIZJ.remove(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchEntityCardCacheManager@717d.get$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0O7A<C628380Okm> c0o7a, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0o7a, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
