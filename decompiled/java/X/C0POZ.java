package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0POZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.utils.SearchMixFeedPrefetcher$delayToCheckPressPrefetch$1", f = "SearchMixFeedPrefetcher.kt", l = {260}, m = "invokeSuspend")
public final class C0POZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C0POK LLILLL;
    public final /* synthetic */ InterfaceC1841670y1d LLILZ;
    public final /* synthetic */ C238400w2 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0POZ(long j, C0POK c0pok, InterfaceC1841670y1d interfaceC1841670y1d, C238400w2 c238400w2, InterfaceC1364105Vn<? super C0POZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c0pok;
        this.LLILZ = interfaceC1841670y1d;
        this.LLILZIL = c238400w2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0POZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchMixFeedPrefetcher@5e75.delayToCheckPressPrefetch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                long j = this.LLILLJJLI;
                C0POY c0poy = new C0POY(this.LLILZIL, this.LLILLL, this.LLILZ, null);
                this.LL = 1;
                if (C099A.LIZIZ(j, c0poy, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchMixFeedPrefetcher@5e75.delayToCheckPressPrefetch$1");
                    return objLJFF;
                }
            }
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            C0POX c0pox = C0POX.LIZ;
            C0POK c0pok = this.LLILLL;
            c0pox.getClass();
            C0POX.LIZ(c0pok);
            this.LLILZ.LIZIZ(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMixFeedPrefetcher@5e75.delayToCheckPressPrefetch$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
