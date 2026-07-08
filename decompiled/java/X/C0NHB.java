package X;

import com.ss.android.ugc.aweme.feed.ghouse.CacheEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NHB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GoldenHouse$asyncPoll$1$1", f = "GoldenHouse.kt", l = {}, m = "invokeSuspend")
public final class C0NHB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0NH6 LL;
    public final /* synthetic */ CacheEntry LLILLJJLI;
    public final /* synthetic */ C0NEK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NHB(C0NH6 c0nh6, CacheEntry cacheEntry, C0NEK c0nek, InterfaceC1364105Vn<? super C0NHB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0nh6;
        this.LLILLJJLI = cacheEntry;
        this.LLILLL = c0nek;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NHB(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GoldenHouse@3441.asyncPoll$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0NH6.LJIILIIL(this.LL, this.LLILLJJLI);
        CacheEntry cacheEntry = this.LLILLJJLI;
        if (cacheEntry == null) {
            this.LLILLL.LIZ(new C591480NHu(false, (C0NHH) null, "empty", 8));
        } else {
            this.LLILLL.LIZ(new C591480NHu(true, C0NHG.LIZ(cacheEntry), (String) null, 12));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GoldenHouse@3441.asyncPoll$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
