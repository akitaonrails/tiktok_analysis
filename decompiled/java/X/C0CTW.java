package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CTW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CTW extends C09AY implements Function0<TabConfig> {
    public C0CTW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final TabConfig invoke() {
        try {
            C0CXN.LIZ.getClass();
            TabConfig tabConfig = (TabConfig) C0CXN.LIZLLL.getValue();
            Boolean bool = tabConfig.isJsonIllegal;
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool, bool2)) {
                tabConfig = (TabConfig) C08JS.LIZ(((Keva) C0CXN.LIZJ.getValue()).getString("tab_fcp_config_v2", C0CXN.LIZIZ.toString()), TabConfig.class);
            }
            if (Intrinsics.LJFF(tabConfig.isJsonIllegal, bool2)) {
                return tabConfig;
            }
            C0CXN.LIZ(tabConfig);
            return tabConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getValue exception: ");
            sbLIZ.append(e);
            C1720106oR.LIZ("tab_fcp_config_v2", C2188811AlT.LIZIZ(sbLIZ));
            return C0CXN.LIZIZ;
        }
    }
}
