package X;

import com.bytedance.ies.ugc.statisticlogger.btm.BackupConfigData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0p7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1499540p7o extends C09AY implements Function0<BackupConfigData> {
    public C1499540p7o() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final BackupConfigData invoke() {
        try {
            C0C59 c0c59LJ = C0C59.LJ();
            BackupConfigData backupConfigData = C1499530p7n.LIZ;
            BackupConfigData backupConfigData2 = (BackupConfigData) c0c59LJ.LJIILIIL(BackupConfigData.class, backupConfigData, "bcm_chain_fallback_config", true);
            return backupConfigData2 != null ? backupConfigData2 : backupConfigData;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C1499530p7n.LIZ;
        }
    }
}
