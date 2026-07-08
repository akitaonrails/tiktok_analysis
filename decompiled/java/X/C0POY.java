package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0POY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.utils.SearchMixFeedPrefetcher$delayToCheckPressPrefetch$1$1", f = "SearchMixFeedPrefetcher.kt", l = {261}, m = "invokeSuspend")
public final class C0POY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C238400w2 LLILLJJLI;
    public final /* synthetic */ C0POK LLILLL;
    public final /* synthetic */ InterfaceC1841670y1d LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0POY(C238400w2 c238400w2, C0POK c0pok, InterfaceC1841670y1d interfaceC1841670y1d, InterfaceC1364105Vn<? super C0POY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c238400w2;
        this.LLILLL = c0pok;
        this.LLILZ = interfaceC1841670y1d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0POY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMixFeedPrefetcher@5e75.delayToCheckPressPrefetch$1$1");
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
            long j = this.LLILLJJLI.element;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("SearchMixFeedPrefetcher@5e75.delayToCheckPressPrefetch$1$1");
                return objLJFF;
            }
        }
        C0POX c0pox = C0POX.LIZ;
        C0POK c0pok = this.LLILLL;
        c0pox.getClass();
        C0POX.LIZ(c0pok);
        this.LLILZ.LIZIZ(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMixFeedPrefetcher@5e75.delayToCheckPressPrefetch$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
