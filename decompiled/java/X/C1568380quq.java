package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import njp.a;

/* JADX INFO: renamed from: X.0quq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.repo.ExploreFeedListRepository$prefetch$1", f = "ExploreFeedListRepository.kt", l = {334}, m = "invokeSuspend")
public final class C1568380quq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15TX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568380quq(C15TX c15tx, InterfaceC1364105Vn<? super C1568380quq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15tx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568380quq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("ExploreFeedListRepository@eec9.prefetch$1");
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
                if (!C15T8.LL.LJIIL(false)) {
                    C20524315Sv c20524315Sv = C20524315Sv.LL;
                    if (!C20524315Sv.LIZJ()) {
                        if (((Number) C04WX.LIZ.getValue()).intValue() != 1) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && C20524315Sv.LIZJ()) {
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetch$1");
                            return unit;
                        }
                        C20524915Tb c20524915Tb = this.LLILLJJLI.LLILZIL;
                        Integer numLJ = C2286608xc.LJ(0);
                        int value = EnumC1568370qup.NORMAL_PREFETCH.getValue();
                        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(this.LLILLJJLI, 1886);
                        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(761);
                        this.LL = 1;
                        if (c20524915Tb.LJJJJLL(true, true, null, numLJ, value, awS568S0100000_24, null, aFwS264S0000000_24, this) == objLJFF) {
                            C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetch$1");
                            return objLJFF;
                        }
                    }
                }
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetch$1");
                return unit2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24(th, 1887);
            c2153908cD.getClass();
            C2153908cD.LIZ("ExploreFeedPrefetch_log", awS568S0100000_242);
            C1AF0.LJ(th);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreFeedListRepository@eec9.prefetch$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
