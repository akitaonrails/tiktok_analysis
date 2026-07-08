package X;

import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.screenshot.ScreenShotContent;
import com.ss.android.ugc.aweme.screenshot.ScreenShotShareMobParam;
import com.ss.android.ugc.aweme.setting.model.ShareConfig;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jh8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C498720Jh8 {
    public static final C498720Jh8 LIZ = new C498720Jh8();
    public static final IScreenshotService LIZIZ = (IScreenshotService) PluggableExtentionKt.pluggableSpi$default(IScreenshotService.class, false, false, false, 14, null);
    public static WeakReference<TuxSheet> LIZJ;

    public static void LIZ(DataChannel dataChannel) {
        boolean zBooleanValue;
        Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_share_panel_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII("shot_auto_guide", "panel_source");
        c474500IjALIZ.LJJII("self_guide", "is_bubble_enter");
        if (zBooleanValue) {
            c474500IjALIZ.LJJII("camera", "enter_from_merge");
            c474500IjALIZ.LJJII("live_take_detail", "event_page");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(DataChannel dataChannel) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        sbLIZ.append(System.currentTimeMillis());
        HashMap map = new HashMap(C2097608Jq.LJIIIIZZ(new Pair("creation_id", C2188811AlT.LIZIZ(sbLIZ)), new Pair("is_preview_card", CardStruct.IStatusCode.DEFAULT)));
        if (Intrinsics.LJFF(dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
            str = "anchor";
        } else {
            str = "user";
        }
        map.put("user_type", str);
        map.put("user_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screen_shot");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public static boolean LIZLLL(C19EG c19eg, String str, C1106210etP c1106210etP, Room room) {
        IScreenshotService iScreenshotService = LIZIZ;
        Integer numValueOf = null;
        if (iScreenshotService != null) {
            String strValueOf = String.valueOf(room.getId());
            EnumC1373410lqN enumC1373410lqN = ShareConfig.LIZ.getValue().get("live");
            if (enumC1373410lqN != null) {
                numValueOf = Integer.valueOf(enumC1373410lqN.getNum());
            }
            TuxSheet tuxSheetLJ = iScreenshotService.LJ(c19eg, new ScreenShotContent(str, c1106210etP, new ScreenShotShareMobParam("live", strValueOf, String.valueOf(numValueOf))));
            if (tuxSheetLJ != null) {
                LIZJ = new WeakReference<>(tuxSheetLJ);
                if (Unit.LIZ != null) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(X.C1106210etP r8, com.bytedance.ies.sdk.datachannel.DataChannel r9, com.bytedance.android.livesdkapi.depend.model.live.Room r10, java.lang.String r11, android.os.Bundle r12) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C498720Jh8.LIZJ(X.0etP, com.bytedance.ies.sdk.datachannel.DataChannel, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, android.os.Bundle):void");
    }
}
