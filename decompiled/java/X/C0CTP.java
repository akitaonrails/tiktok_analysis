package X;

import com.bytedance.android.livesdk.livesetting.feed.LiveSkylightComprehensionSetting;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0CTP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nuj.HomeTabNujLaunchHelper$getConfigurationSaveCallback$configurationSaveCallback$1$save$1$1", f = "HomeTabNujLaunchHelper.kt", l = {}, m = "invokeSuspend")
public final class C0CTP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TabConfig LL;
    public final /* synthetic */ n LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CTP(TabConfig tabConfig, n nVar, InterfaceC1364105Vn<? super C0CTP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = tabConfig;
        this.LLILLJJLI = nVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CTP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        q qVarLJJIJIIJI;
        Boolean boolValueOf;
        C1C7U.LIZ("HomeTabNujLaunchHelper@afd.getConfigurationSaveCallback$configurationSaveCallback$1$save$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CUA c0cua = C0CUA.LIZ;
        if (!C0CUA.LIZJ()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationSaveCallback try update tab config but nuj finished");
            C0CUA.LIZLLL(false, C0CTS.LLILZIL);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.getConfigurationSaveCallback$configurationSaveCallback$1$save$1$1");
            return unit;
        }
        TabConfig tabConfig = this.LL;
        if (tabConfig != null && !Intrinsics.LJFF(tabConfig.isJsonIllegal, true)) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("HomeTabNujLaunchHelper", "ConfigurationSaveCallback tab config legal, updateTabConfig");
            TabConfig tabConfig2 = this.LL;
            n nVar = this.LLILLJJLI;
            long jCurrentTimeMillis = System.currentTimeMillis();
            n nVarLJJIJ = nVar.LJJIJ("enable_skylight_fyp_only");
            if (nVarLJJIJ != null && (qVarLJJIJIIJI = nVarLJJIJ.LJJIJIIJI("val")) != null && (boolValueOf = Boolean.valueOf(qVarLJJIJIIJI.LJ())) != null) {
                LiveSkylightComprehensionSetting.INSTANCE.setDynamicValue(boolValueOf.booleanValue());
            }
            C293120BeI.LIZIZ(C293120BeI.LIZ, nVar);
            C293120BeI.LIZIZ(C293120BeI.LIZIZ, nVar);
            C293120BeI.LIZIZ(C293120BeI.LIZJ, nVar);
            for (Map.Entry<String, Object> entry : C293120BeI.LJ.entrySet()) {
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateABValues ");
                sbLIZ.append(entry.getKey());
                sbLIZ.append(" = ");
                sbLIZ.append(entry.getValue());
                C1720106oR.LJI("HomeTabNujLaunchHelper", C2188811AlT.LIZIZ(sbLIZ));
            }
            int i4 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateExperimentVal biz keys: ");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ2);
            C0CUA.LJ(tabConfig2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateExperimentVal total keys: ");
            sbLIZ3.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ3);
        } else {
            C0CUA.LIZLLL(false, C0CTS.LLILZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("HomeTabNujLaunchHelper@afd.getConfigurationSaveCallback$configurationSaveCallback$1$save$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
