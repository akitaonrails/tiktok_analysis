package X;

import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0azm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C956400azm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(DataChannel dataChannel, String str) {
        if (dataChannel == null) {
            C20441214yg.LJ("TakeStageGiftUtil", "changeGiftTraySizeNormalWithCheck, return by dataChannel == null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeGiftTraySizeNormalWithCheck, source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("TakeStageGiftUtil", C2188811AlT.LIZIZ(sbLIZ));
        C938200aWQ c938200aWQ = (C938200aWQ) dataChannel.gg0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class);
        if (c938200aWQ != null && c938200aWQ.LIZ == EnumC476080Ili.NORMAL_TRAY.getValue()) {
            return;
        }
        dataChannel.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, C956580b04.LIZ(EnumC476080Ili.NORMAL_TRAY.getValue()));
    }

    public static void LIZIZ(DataChannel dataChannel, String str) {
        if (dataChannel == null) {
            C20441214yg.LJ("TakeStageGiftUtil", "changeGiftTraySizeSmallWithCheck, return by dataChannel == null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeGiftTraySizeSmallWithCheck, source=");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("TakeStageGiftUtil", C2188811AlT.LIZIZ(sbLIZ));
        C938200aWQ c938200aWQ = (C938200aWQ) dataChannel.gg0(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class);
        if (c938200aWQ != null && c938200aWQ.LIZ == EnumC476080Ili.SMALL_TRAY_ON_WINDOW.getValue()) {
            return;
        }
        dataChannel.zW(CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, C956580b04.LIZ(EnumC476080Ili.SMALL_TRAY_ON_WINDOW.getValue()));
    }
}
