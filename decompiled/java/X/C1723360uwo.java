package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.pipo.hybrid.settings.PipoContainerWebAnalysisSettingInfo;

/* JADX INFO: renamed from: X.0uwo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723360uwo {
    public static final PipoContainerWebAnalysisSettingInfo LIZ = new PipoContainerWebAnalysisSettingInfo(0, null, null, 2500L, 0, null);

    public static final PipoContainerWebAnalysisSettingInfo LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoContainerWebAnalysisSettingInfo pipoContainerWebAnalysisSettingInfo = LIZ;
        PipoContainerWebAnalysisSettingInfo pipoContainerWebAnalysisSettingInfo2 = (PipoContainerWebAnalysisSettingInfo) settingsManagerLIZLLL.LJIIIIZZ("pipo_container_web_analysis_settings", PipoContainerWebAnalysisSettingInfo.class, pipoContainerWebAnalysisSettingInfo);
        return pipoContainerWebAnalysisSettingInfo2 != null ? pipoContainerWebAnalysisSettingInfo2 : pipoContainerWebAnalysisSettingInfo;
    }
}
