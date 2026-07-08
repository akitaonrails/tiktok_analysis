package X;

import com.bytedance.ies.ugc.statisticlogger.btm.FixErrorModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571250qzT extends C09AY implements Function0<FixErrorModel> {
    public C1571250qzT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final FixErrorModel invoke() {
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            FixErrorModel fixErrorModel = C1571240qzS.LIZ;
            FixErrorModel fixErrorModel2 = (FixErrorModel) c0c59LJ.LJIILIIL(FixErrorModel.class, fixErrorModel, "fix_ttbtm_pre_error", true);
            return fixErrorModel2 != null ? fixErrorModel2 : fixErrorModel;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1571240qzS.LIZ;
        }
    }
}
