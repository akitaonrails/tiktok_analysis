package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowRealTimeReadExp;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.service.FollowReadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.service.FollowReadService$deleteExpiredEntities$1", f = "FollowReadService.kt", l = {}, m = "invokeSuspend")
public final class C607910Nsr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ FollowReadService LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607910Nsr(FollowReadService followReadService, InterfaceC1364105Vn<? super C607910Nsr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = followReadService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C607910Nsr c607910Nsr = new C607910Nsr(this.LLILLJJLI, interfaceC1364105Vn);
        c607910Nsr.LL = obj;
        return c607910Nsr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("FollowReadService@b5d1.deleteExpiredEntities$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!FollowRealTimeReadExp.LIZ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FollowReadService@b5d1.deleteExpiredEntities$1");
            return unit;
        }
        FollowReadService followReadService = this.LLILLJJLI;
        try {
            C1595060rbs.LIZIZ.LJIILLIIL(((InterfaceC607930Nst) followReadService.LIZIZ.getValue()).LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()), ((InterfaceC607930Nst) followReadService.LIZIZ.getValue()).LIZLLL(System.currentTimeMillis() - (((Number) FollowRealTimeReadExp.LJIIIIZZ.getValue()).longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FollowReadService@b5d1.deleteExpiredEntities$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
