package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0quo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.repo.ExploreFeedListRepository$prefetchV3$1", f = "ExploreFeedListRepository.kt", l = {366}, m = "invokeSuspend")
public final class C1568360quo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15TX LLILLJJLI;
    public final /* synthetic */ ExploreFeedRequestOverride LLILLL;
    public final /* synthetic */ Function1<ExploreAwemeList, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1568360quo(C15TX c15tx, ExploreFeedRequestOverride exploreFeedRequestOverride, Function1<? super ExploreAwemeList, Unit> function1, InterfaceC1364105Vn<? super C1568360quo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15tx;
        this.LLILLL = exploreFeedRequestOverride;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568360quo(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreFeedListRepository@eec9.prefetchV3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C20524915Tb c20524915Tb = this.LLILLJJLI.LLILZIL;
                Integer numLJ = C2286608xc.LJ(0);
                int value = EnumC1568370qup.NORMAL_PREFETCH.getValue();
                AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this.LLILLJJLI, 1889);
                ExploreFeedRequestOverride exploreFeedRequestOverride = this.LLILLL;
                AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(762);
                this.LL = 1;
                obj = c20524915Tb.LJJJJLL(true, true, null, numLJ, value, awS568S0100000_24, exploreFeedRequestOverride, aFwS264S0000000_24, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetchV3$1");
                    return objLJFF;
                }
            }
            this.LLILZ.invoke((ExploreAwemeList) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(th, 1888);
            c2153908cD.getClass();
            C2153908cD.LIZ("ExploreFeedPrefetchV3_log", awS568S0100000_242);
            C1AF0.LJ(th);
            this.LLILZ.invoke(new ExploreAwemeList());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetchV3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
