package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.verify.ab.PipoVeriCenterAnalysisUpgradeSettings;

/* JADX INFO: renamed from: X.0ui6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714240ui6 {
    public static final C1714240ui6 LIZ = new C1714240ui6();

    public static final boolean LIZ() {
        Boolean bool;
        LIZ.getClass();
        PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel pipoVeriCenterAnalysisUpgradeModelLJ = LJ();
        if (pipoVeriCenterAnalysisUpgradeModelLJ == null || (bool = pipoVeriCenterAnalysisUpgradeModelLJ.enable) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static final boolean LIZIZ() {
        Boolean bool;
        if (!LIZ()) {
            return false;
        }
        LIZ.getClass();
        PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel pipoVeriCenterAnalysisUpgradeModelLJ = LJ();
        return pipoVeriCenterAnalysisUpgradeModelLJ == null || (bool = pipoVeriCenterAnalysisUpgradeModelLJ.enableBackgroundSnapshot) == null || bool.booleanValue();
    }

    public static final boolean LIZJ() {
        Boolean bool;
        if (!LIZ()) {
            return false;
        }
        LIZ.getClass();
        PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel pipoVeriCenterAnalysisUpgradeModelLJ = LJ();
        return pipoVeriCenterAnalysisUpgradeModelLJ == null || (bool = pipoVeriCenterAnalysisUpgradeModelLJ.enableInputQualityFields) == null || bool.booleanValue();
    }

    public static final boolean LIZLLL() {
        Boolean bool;
        if (!LIZ()) {
            return false;
        }
        LIZ.getClass();
        PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel pipoVeriCenterAnalysisUpgradeModelLJ = LJ();
        return pipoVeriCenterAnalysisUpgradeModelLJ == null || (bool = pipoVeriCenterAnalysisUpgradeModelLJ.enableNetworkMonitor) == null || bool.booleanValue();
    }

    public static PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel LJ() {
        Object c098200Yq;
        try {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            c098200Yq = PipoVeriCenterAnalysisUpgradeSettings.LIZ;
            PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel pipoVeriCenterAnalysisUpgradeModel = (PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_veri_center_analysis_upgrade", PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel.class, c098200Yq);
            if (pipoVeriCenterAnalysisUpgradeModel != null) {
                c098200Yq = pipoVeriCenterAnalysisUpgradeModel;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (PipoVeriCenterAnalysisUpgradeSettings.PipoVeriCenterAnalysisUpgradeModel) c098200Yq;
    }
}
