package X;

import com.bytedance.crash.Npth;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.DialogChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.model.PopupBlockConfig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C7P, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C7P {
    public static void LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PopupBlockConfig popupBlockConfig = C0C7R.LIZ;
        PopupBlockConfig popupBlockConfig2 = (PopupBlockConfig) settingsManagerLIZLLL.LJIIIIZZ("popup_block_config", PopupBlockConfig.class, popupBlockConfig);
        if (popupBlockConfig2 != null) {
            popupBlockConfig = popupBlockConfig2;
        }
        long j = C202094145s.LJII;
        DialogChecker.CheckerCallback checkerCallback = new DialogChecker.CheckerCallback() { // from class: X.0C7Q
            @Override // com.bytedance.tt.reliability.monitor.viewchecker.DialogChecker.CheckerCallback
            public final void onEvent(String str, JSONObject jSONObject) {
                C20684815ws.LJIJ(str, jSONObject);
            }

            @Override // com.bytedance.tt.reliability.monitor.viewchecker.DialogChecker.CheckerCallback
            public final void onPopupTraceException(Throwable th, Map<String, String> map) {
                if (th == null) {
                    return;
                }
                try {
                    Npth.reportBizException("PopupTraceException", th, "PopupBlockReporter", map, true);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        };
        boolean zBooleanValue = ((Boolean) C256920A5a.LIZ.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) C0A4U.LIZ.getValue()).booleanValue();
        C844470XAv.LIZ.getClass();
        DialogChecker.init(zBooleanValue, zBooleanValue2, C844470XAv.LIZ(), popupBlockConfig, j, checkerCallback);
    }
}
