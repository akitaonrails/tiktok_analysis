package X;

import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.00xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C249600xq {
    public static final void LIZ(String str, String str2, String str3, DataChannel dataChannel, C20743716Ff c20743716Ff) {
        Long lValueOf;
        String str4;
        String str5;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_setting_panel_component");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        Boolean boolValueOf = null;
        if (dataChannel != null) {
            lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel));
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LJJII(str2, "setting_type");
        c474500IjALIZ.LJJII(str3, "event_page");
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null) {
            str4 = liveMode.logStreamingType;
        } else {
            str4 = null;
        }
        c474500IjALIZ.LJJII(str4, "live_type");
        if (c20743716Ff != null) {
            boolValueOf = Boolean.valueOf(C500260Jjc.LJJJJIZL(c20743716Ff));
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            if (c20743716Ff != null && c20743716Ff.isChecked()) {
                str5 = "on";
            } else {
                str5 = "off";
            }
            c474500IjALIZ.LJJII(str5, "state");
        }
        c474500IjALIZ.LIZ();
    }
}
