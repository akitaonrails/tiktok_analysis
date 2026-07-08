package X;

import com.bytedance.analytics.util.SwitchToBDBTMModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0w54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766920w54 extends C09AY implements Function0<SwitchToBDBTMModel> {
    public C1766920w54() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SwitchToBDBTMModel invoke() {
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            SwitchToBDBTMModel switchToBDBTMModel = C1766910w53.LIZ;
            SwitchToBDBTMModel switchToBDBTMModel2 = (SwitchToBDBTMModel) c0c59LJ.LJIILIIL(SwitchToBDBTMModel.class, switchToBDBTMModel, "ttbtm_switch_to_bdbtm_config", true);
            return switchToBDBTMModel2 != null ? switchToBDBTMModel2 : switchToBDBTMModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1766910w53.LIZ;
        }
    }
}
