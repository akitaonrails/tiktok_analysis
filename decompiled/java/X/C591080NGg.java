package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ghouse.GHouseCacheLoader$loadInBatches$5", f = "GHouseCacheLoader.kt", l = {}, m = "invokeSuspend")
public final class C591080NGg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C591100NGi LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591080NGg(C591100NGi c591100NGi, InterfaceC1364105Vn<? super C591080NGg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c591100NGi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591080NGg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GHouseCacheLoader@5f9a.loadInBatches$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GHouseCacheLoader@5f9a.loadInBatches$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
