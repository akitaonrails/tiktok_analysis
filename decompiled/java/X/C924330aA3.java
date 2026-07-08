package X;

import com.bytedance.android.live.liveinteract.api.event.GuestSettingChangeEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPreviewPanelOptimizeConfigSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924330aA3 {
    public static void LIZ(DataChannel dataChannel, LiveEffect liveEffect, Boolean bool, EnumC924320aA2 enumC924320aA2) {
        if (!MultiGuestPreviewPanelOptimizeConfigSetting.INSTANCE.enableVideoAudioMemory()) {
            return;
        }
        C924340aA4 c924340aA4 = new C924340aA4(liveEffect, bool, enumC924320aA2);
        if (dataChannel != null) {
            dataChannel.LC0(GuestSettingChangeEvent.class, c924340aA4);
        }
    }
}
