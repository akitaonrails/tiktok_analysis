package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.popupclean.tool.PopupMonitorSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15sX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20657915sX extends C09AY implements Function0<PopupMonitorSetting.PopupMonitorData> {
    public C20657915sX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.popupclean.tool.PopupMonitorSetting$PopupMonitorData, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final PopupMonitorSetting.PopupMonitorData invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("ttk_cd_monitor_popup_configuration", PopupMonitorSetting.PopupMonitorData.class, null);
    }
}
