package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0iwV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.frequency.BigCardFrequencyService$reportNegativeFeedbackToServer$1", f = "BigCardFrequencyService.kt", l = {308}, m = "invokeSuspend")
public final class C1261890iwV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1261890iwV(InterfaceC1364105Vn<? super C1261890iwV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1261890iwV(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BigCardFrequencyService@a1ad.reportNegativeFeedbackToServer$1");
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
                InterfaceC1263910izl interfaceC1263910izlLJIIIIZZ = C2277891EDz.LIZIZ.LJIIIIZZ(EnumC1262370ixH.FEED_REC_USER_BIG_CARD);
                C1261860iwS c1261860iwS = new C1261860iwS(-1);
                int value = EnumC2010007u6.SCENE_BIG_CARDS.getValue();
                int value2 = EnumC587510N2n.DISLIKE_FEATURE.getValue();
                this.LL = 1;
                if (interfaceC1263910izlLJIIIIZZ.LIZJ(c1261860iwS, value, value2, this) == objLJFF) {
                    C1C7U.LIZIZ("BigCardFrequencyService@a1ad.reportNegativeFeedbackToServer$1");
                    return objLJFF;
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("BigCardFrequencyService", "coroutines updateNegativeActionTimes fail", thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BigCardFrequencyService@a1ad.reportNegativeFeedbackToServer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1261890iwV(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
