package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCachePool$onAllCacheLoadDone$2", f = "GHouseCachePool.kt", l = {}, m = "invokeSuspend")
public final class C0NGN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NGO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NGN(C0NGO c0ngo, InterfaceC1364105Vn<? super C0NGN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0ngo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NGN(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GHouseCachePool@3638.onAllCacheLoadDone$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NGM c0ngm = this.LL.LIZJ;
        if (c0ngm != null) {
            c0ngm.LIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GHouseCachePool@3638.onAllCacheLoadDone$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
