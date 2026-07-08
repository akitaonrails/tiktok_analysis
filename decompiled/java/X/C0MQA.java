package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.story.forward.ICelebrationCreateService;
import com.ss.android.ugc.aweme.story.celebration.CelebrationExitStrategy;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MQA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.inbox.view.StoryCelebrationEntranceInterceptor$onClickIntercept$2", f = "StoryCelebrationEntranceInterceptor.kt", l = {73, 77}, m = "invokeSuspend")
public final class C0MQA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0MTI LLILLJJLI;
    public final /* synthetic */ C0MTL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MQA(C0MTI c0mti, C0MTL c0mtl, InterfaceC1364105Vn<? super C0MQA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mti;
        this.LLILLL = c0mtl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MQA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        CelebrationExitStrategy celebrationExitStrategyLJI;
        List<Integer> list;
        C1C7U.LIZ("StoryCelebrationEntranceInterceptor@4e21.onClickIntercept$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = false;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryCelebrationEntranceInterceptor@4e21.onClickIntercept$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C0MTE c0mte = C0MTE.LIZ;
            C0MTI c0mti = this.LLILLJJLI;
            int i2 = c0mti.LIZJ;
            String str = c0mti.LIZIZ;
            c0mte.getClass();
            try {
                String strLIZ = C0MTE.LIZ(i2);
                C01GW c01gw = C0MTE.LIZJ;
                if (((Keva) c01gw.getValue()).getLong(strLIZ, -1L) == -1) {
                    ((Keva) c01gw.getValue()).storeLong(strLIZ, System.currentTimeMillis());
                    if (str != null) {
                        ((Keva) C0MTE.LIZLLL.getValue()).storeString(strLIZ, str);
                    }
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            InterfaceC567940MPg interfaceC567940MPg = C0MLA.LIZ;
            if (interfaceC567940MPg != null && (celebrationExitStrategyLJI = interfaceC567940MPg.LJI(this.LLILLJJLI.LIZJ)) != null && (list = celebrationExitStrategyLJI.exitScenes) != null && list.contains(C2286608xc.LJ(1))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                ICelebrationCreateService iCelebrationCreateService = (ICelebrationCreateService) ServiceManager.get().getService(ICelebrationCreateService.class);
                int i3 = this.LLILLJJLI.LIZJ;
                this.LL = 1;
                if (iCelebrationCreateService.reportCelebrationEvent(i3, 1, this) == objLJFF) {
                    C1C7U.LIZIZ("StoryCelebrationEntranceInterceptor@4e21.onClickIntercept$2");
                    return objLJFF;
                }
            }
        }
        InterfaceC567940MPg interfaceC567940MPg2 = C0MLA.LIZ;
        if (interfaceC567940MPg2 != null && interfaceC567940MPg2.LJII(this.LLILLJJLI.LIZJ, 1, false)) {
            z2 = true;
        }
        if (z2) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0MTH c0mth = new C0MTH(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0mth) == objLJFF) {
                C1C7U.LIZIZ("StoryCelebrationEntranceInterceptor@4e21.onClickIntercept$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryCelebrationEntranceInterceptor@4e21.onClickIntercept$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
