package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.affinity.api.SocialAffinityResponse;
import com.ss.android.ugc.aweme.affinity.model.SingleSiteAffinity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08kJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.affinity.SocialAffinityManager$runColdBootTask$1", f = "SocialAffinityManager.kt", l = {88, 92}, m = "invokeSuspend")
public final class C2204108kJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2204508kN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204108kJ(C2204508kN c2204508kN, InterfaceC1364105Vn<? super C2204108kJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2204508kN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2204108kJ c2204108kJ = new C2204108kJ(this.LLILLL, interfaceC1364105Vn);
        c2204108kJ.LLILLJJLI = obj;
        return c2204108kJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object c098200Yq;
        C1C7U.LIZ("SocialAffinityManager@25b4.runColdBootTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c098200Yq = this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SocialAffinityManager@25b4.runColdBootTask$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2204508kN c2204508kN = this.LLILLL;
            this.LL = 1;
            c2204508kN.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2203908kH(c2204508kN, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialAffinityManager@25b4.runColdBootTask$1");
                return objLJFF;
            }
        }
        c098200Yq = (SocialAffinityResponse) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        C2204508kN c2204508kN2 = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            SocialAffinityResponse socialAffinityResponse = (SocialAffinityResponse) c098200Yq;
            C2204308kL c2204308kL = C2204308kL.LIZ;
            String str = c2204508kN2.LIZ;
            c2204308kL.getClass();
            System.currentTimeMillis();
            C2204308kL.LIZ().storeLong(C2204308kL.LIZIZ(str, "affinity_ttl"), System.currentTimeMillis());
            List<SingleSiteAffinity> list = socialAffinityResponse.siteAffinityList;
            if (list != null && !list.isEmpty()) {
                z = false;
            }
            if (!z) {
                this.LLILLJJLI = c098200Yq;
                this.LL = 2;
                C1DFH c1dfh = C0PEM.LIZ;
                Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C2204208kK(socialAffinityResponse, c2204508kN2, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("SocialAffinityManager@25b4.runColdBootTask$1");
                    return objLJFF;
                }
            }
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SocialAffinityManager@25b4.runColdBootTask$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
