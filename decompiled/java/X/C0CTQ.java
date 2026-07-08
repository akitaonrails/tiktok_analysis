package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CTQ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nuj.HomeTabNujLaunchHelper$getConfigurationSaveCallback$configurationSaveCallback$1$save$1", f = "HomeTabNujLaunchHelper.kt", l = {163}, m = "invokeSuspend")
public final class C0CTQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C307980C5k LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTQ(C307980C5k c307980C5k, InterfaceC1364105Vn<? super C0CTQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c307980C5k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        n nVarLJJIJ;
        Object c098200Yq;
        n nVarLJJIJ2;
        C1C7U.LIZ("HomeTabNujLaunchHelper@afd.getConfigurationSaveCallback$configurationSaveCallback$1$save$1");
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
                n nVar = this.LLILLJJLI.LIZ;
                if (nVar == null) {
                    int i2 = C2187451AjH.LIZ;
                    C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationSaveCallback save but updateData is null");
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.getConfigurationSaveCallback$configurationSaveCallback$1$save$1");
                    return unit;
                }
                int i3 = C2187451AjH.LIZ;
                C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationSaveCallback save");
                n nVar2 = this.LLILLJJLI.LIZ;
                if (nVar2 != null && (nVarLJJIJ2 = nVar2.LJJIJ("tab_fcp_config_v2")) != null) {
                    nVarLJJIJ = nVarLJJIJ2.LJJIJ("val");
                } else {
                    nVarLJJIJ = null;
                }
                try {
                    C1227904rF.LIZ.getClass();
                    c098200Yq = (TabConfig) C1227904rF.LIZ(nVarLJJIJ, TabConfig.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                int i4 = C2187451AjH.LIZ;
                C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationSaveCallback: parse tab_fcp_config_v2, " + nVarLJJIJ);
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C0CTP c0ctp = new C0CTP((TabConfig) c098200Yq, nVar, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c0ctp) == objLJFF) {
                    C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.getConfigurationSaveCallback$configurationSaveCallback$1$save$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C0CUA c0cua = C0CUA.LIZ;
            C0CUA.LIZLLL(false, C0CTS.LLILLL);
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ConfigurationSaveCallback save error, ");
            sbLIZ.append(C13SZ.LIZIZ(th2));
            C1720106oR.LIZ("HomeTabNujLaunchHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.getConfigurationSaveCallback$configurationSaveCallback$1$save$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
