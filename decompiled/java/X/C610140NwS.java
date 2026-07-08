package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM$feedReachUpdate$1", f = "EcVideoGuideVM.kt", l = {534, 534}, m = "invokeSuspend")
public final class C610140NwS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ReachCfg LLILLJJLI;
    public final /* synthetic */ EcVideoGuideVM LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C610140NwS(ReachCfg reachCfg, EcVideoGuideVM ecVideoGuideVM, int i, int i2, InterfaceC1364105Vn<? super C610140NwS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = reachCfg;
        this.LLILLL = ecVideoGuideVM;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C610140NwS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcVideoGuideVM@7136.feedReachUpdate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    C189200o6.m2constructorimpl((C0X52) obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    C189200o6.m2constructorimpl(obj);
                }
            } else {
                C155000ia.LIZIZ(obj);
                ReachCfg reachCfg = this.LLILLJJLI;
                EcVideoGuideVM ecVideoGuideVM = this.LLILLL;
                int i2 = this.LLILZ;
                int i3 = this.LLILZIL;
                if (C7879035x.LIZLLL()) {
                    List listSingletonList = Collections.singletonList(reachCfg);
                    String str = ecVideoGuideVM.LLILZLL;
                    Map mapLIZJ = C2097908Jt.LIZJ(new Pair("mall_request_scene", C2286608xc.LJ(i2)));
                    C610130NwR c610130NwR = new C610130NwR(ecVideoGuideVM, i3, listSingletonList, i2, null);
                    this.LL = 1;
                    obj = C2381909Uz.LIZJ(str, mapLIZJ, this, c610130NwR);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("EcVideoGuideVM@7136.feedReachUpdate$1");
                        return objLJFF;
                    }
                    C189200o6.m2constructorimpl(obj);
                } else {
                    List listSingletonList2 = Collections.singletonList(reachCfg);
                    String str2 = ecVideoGuideVM.LLILZLL;
                    Map mapLIZJ2 = C2097908Jt.LIZJ(new Pair("mall_request_scene", C2286608xc.LJ(i2)));
                    C610130NwR c610130NwR2 = new C610130NwR(ecVideoGuideVM, i3, listSingletonList2, i2, null);
                    this.LL = 2;
                    obj = C2381909Uz.LIZJ(str2, mapLIZJ2, this, c610130NwR2);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("EcVideoGuideVM@7136.feedReachUpdate$1");
                        return objLJFF;
                    }
                    C189200o6.m2constructorimpl((C0X52) obj);
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcVideoGuideVM@7136.feedReachUpdate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
