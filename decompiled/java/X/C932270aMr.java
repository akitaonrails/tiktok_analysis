package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiManageGuestOptSwitcherSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiPanelManageGuestOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932270aMr {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL() {
        return (!LiveSdkMultiManageGuestOptSwitcherSetting.INSTANCE.isEnable() || !C930540aK4.LIZJ() || !(MultiPanelManageGuestOptSetting.INSTANCE.getValue() >= 1) || C930540aK4.LJJIJ() || C917810ZzX.LJIIIIZZ() || C930540aK4.LJJIIZ() || C930540aK4.LJJIIJZLJL()) ? false : true;
    }

    public static final void LJFF() {
        InterfaceC2262081DgM currentUser;
        HashMap map = new HashMap();
        C01Z4.LIZ(null, map);
        map.put("control_type", "camera_no_permission");
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        map.put("guest_id", String.valueOf((interfaceC500940JkiUser == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null) ? 0L : currentUser.getId()));
        C0KX4.LIZ("livesdk_multi_guest_guest_control_apply", map, null, true);
    }

    public static boolean LIZ() {
        boolean zBooleanValue;
        if (C930540aK4.LIZJ()) {
            zBooleanValue = LiveAbLabelSetting.INSTANCE.getBooleanValue("enable_block_guest");
        } else {
            Boolean boolLIZLLL = C931820aM8.LIZLLL("enable_block_guest");
            if (boolLIZLLL == null) {
                return false;
            }
            zBooleanValue = boolLIZLLL.booleanValue();
        }
        return zBooleanValue && !C917810ZzX.LJIIIIZZ();
    }

    public static final boolean LIZIZ() {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        Integer numValueOf;
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        return multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null && (numValueOf = Integer.valueOf(multiLiveAnchorPanelSettingsLIZIZ.disableGuestOpenCamera)) != null && numValueOf.intValue() == 1 && LiveSdkMultiManageGuestOptSwitcherSetting.INSTANCE.isEnable() && LJ();
    }

    public static boolean LJ() {
        Integer numLJ;
        return (!LiveSdkMultiManageGuestOptSwitcherSetting.INSTANCE.isEnable() || !(!C930540aK4.LIZJ() ? !((numLJ = C931820aM8.LJ("ttlive_multi_setting_manage_guest_opt")) == null || numLJ.intValue() != 1) : LiveAbLabelSetting.INSTANCE.getIntValue("ttlive_multi_setting_manage_guest_opt") == 1) || C930540aK4.LJJIJ() || C930540aK4.LJJIIJZLJL() || C930540aK4.LJJIIZ()) ? false : true;
    }

    public static final boolean LIZJ(Integer num) {
        if (num != null && num.intValue() == 1 && LiveSdkMultiManageGuestOptSwitcherSetting.INSTANCE.isEnable() && LJ()) {
            return true;
        }
        return false;
    }
}
