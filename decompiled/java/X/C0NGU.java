package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCachePool$deleteAweme$2", f = "GHouseCachePool.kt", l = {}, m = "invokeSuspend")
public final class C0NGU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NGO LL;
    public final /* synthetic */ CacheEntry LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NGU(C0NGO c0ngo, CacheEntry cacheEntry, InterfaceC1364105Vn<? super C0NGU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ngo;
        this.LLILLJJLI = cacheEntry;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GHouseCachePool@3638.deleteAweme$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJIIL.LIZ(this.LLILLJJLI.key);
        C591050NGd c591050NGd = C591050NGd.LIZ;
        String str = this.LLILLJJLI.videoFilePath;
        c591050NGd.getClass();
        C591050NGd.LIZ(str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GHouseCachePool@3638.deleteAweme$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
