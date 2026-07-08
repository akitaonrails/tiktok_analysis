package X;

import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0x3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.wallet.service.recharge.impl.RechargeService$queryDiamond$1$1", f = "RechargeService.kt", l = {131}, m = "invokeSuspend")
public final class C1804250x3H extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1804210x3D LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC1284030jWD LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ RecommendStrategyParam LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ C09AJ<C1804840x4E> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804250x3H(C1804210x3D c1804210x3D, int i, InterfaceC1284030jWD interfaceC1284030jWD, long j, long j2, RecommendStrategyParam recommendStrategyParam, boolean z, int i2, C09AJ<C1804840x4E> c09aj, InterfaceC1364105Vn<? super C1804250x3H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1804210x3D;
        this.LLILZ = i;
        this.LLILZIL = interfaceC1284030jWD;
        this.LLILZLL = j;
        this.LLIZ = j2;
        this.LLIZLLLIL = recommendStrategyParam;
        this.LLJ = z;
        this.LLJI = i2;
        this.LLJIJIL = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1804250x3H c1804250x3H = new C1804250x3H(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1804250x3H.LLILLJJLI = obj;
        return c1804250x3H;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        Object objLJ = obj;
        C1C7U.LIZ("RechargeService@2914.queryDiamond$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJ);
            } else {
                C155000ia.LIZIZ(objLJ);
                C1804210x3D c1804210x3D = this.LLILLL;
                int i2 = this.LLILZ;
                InterfaceC1284030jWD interfaceC1284030jWD = this.LLILZIL;
                long j = this.LLILZLL;
                long j2 = this.LLIZ;
                RecommendStrategyParam recommendStrategyParam = this.LLIZLLLIL;
                boolean z2 = this.LLJ;
                int i3 = this.LLJI;
                InterfaceC1804490x3f interfaceC1804490x3fLJIJ = c1804210x3D.LJIJ();
                EnumC587980N4i enumC587980N4i = EnumC587980N4i.STRATEGY_TASK;
                Long lLIZ = C1804180x3A.LIZ();
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                C1804420x3Y c1804420x3Y = new C1804420x3Y(i2, interfaceC1284030jWD, j, j2, false, recommendStrategyParam, z, lLIZ, enumC587980N4i, i3);
                this.LL = 1;
                objLJ = interfaceC1804490x3fLJIJ.LJ(c1804420x3Y, this);
                if (objLJ == objLJFF) {
                    C1C7U.LIZIZ("RechargeService@2914.queryDiamond$1$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1781150wS1) objLJ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C09AJ<C1804840x4E> c09aj = this.LLJIJIL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            c09aj.onNext(((C1781150wS1) c098200Yq).LIZ);
            c09aj.onComplete();
        }
        C09AJ<C1804840x4E> c09aj2 = this.LLJIJIL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (c09aj2.isDisposed()) {
                C20441214yg.LJFF("RechargeService", " queryDiamond disposed", thM5exceptionOrNullimpl);
            } else {
                c09aj2.onError(thM5exceptionOrNullimpl);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RechargeService@2914.queryDiamond$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
