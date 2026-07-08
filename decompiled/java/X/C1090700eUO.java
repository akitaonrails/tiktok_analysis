package X;

import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.barrage.BarragePrivilegeTrackingConfig;
import com.bytedance.android.livesdk.livesetting.barrage.BarragePrivilegeTrackingEnabled;
import com.bytedance.android.livesdk.model.message.BarrageMessage;
import com.bytedance.android.livesdk.model.message.BarrageTypeFansLevelParam;
import com.bytedance.android.livesdk.model.message.BarrageTypeUserGradeParam;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eUO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090700eUO {
    public static final /* synthetic */ int LIZ = 0;

    public static C1090650eUJ LIZ(BarrageMessage barrageMessage) {
        if (barrageMessage != null) {
            if (barrageMessage.msgType == 100) {
                return new C1090650eUJ("barrage_message", barrageMessage.scene);
            }
            try {
                for (Map.Entry<String, Map<String, String>> entry : BarragePrivilegeTrackingConfig.INSTANCE.getValue().entrySet()) {
                    if (Intrinsics.LJFF(entry.getKey(), String.valueOf(barrageMessage.msgType))) {
                        String str = entry.getValue().get("type");
                        String str2 = "";
                        if (str == null) {
                            str = "";
                        }
                        String str3 = entry.getValue().get("scenario");
                        if (str3 != null) {
                            str2 = str3;
                        }
                        return new C1090650eUJ(str, str2);
                    }
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZIZ(BarrageMessage barrageMessage) {
        String str = barrageMessage.subType;
        if (str == null) {
            return "";
        }
        switch (str.hashCode()) {
            case -543728725:
                if (!str.equals("BecomingSuperFanLv1")) {
                    return "";
                }
                return "become_superfan";
            case -387942868:
                if (!str.equals("super_fan_upgrade")) {
                    return "";
                }
                return "superfan_level_up";
            case 324278757:
                if (!str.equals("BecomingSuperFanLv10")) {
                    return "";
                }
                return "become_superfan";
            case 324278788:
                if (!str.equals("BecomingSuperFanLv20")) {
                    return "";
                }
                return "become_superfan";
            case 324278819:
                if (!str.equals("BecomingSuperFanLv30")) {
                    return "";
                }
                return "become_superfan";
            case 324278850:
                if (!str.equals("BecomingSuperFanLv40")) {
                    return "";
                }
                return "become_superfan";
            case 324278881:
                if (!str.equals("BecomingSuperFanLv50")) {
                    return "";
                }
                return "become_superfan";
            case 1635659942:
                if (!str.equals("super_fan_entrance")) {
                    return "";
                }
                return "superfan_enter_room";
            default:
                return "";
        }
    }

    public static String LIZJ(BarrageMessage barrageMessage) {
        User user;
        Map<String, String> map;
        Long lValueOf = null;
        str = null;
        String str = null;
        lValueOf = null;
        switch (barrageMessage.msgType) {
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                BarrageTypeUserGradeParam barrageTypeUserGradeParam = barrageMessage.userGradeParam;
                if (barrageTypeUserGradeParam == null) {
                    return null;
                }
                return barrageTypeUserGradeParam.userId;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                BarrageTypeFansLevelParam barrageTypeFansLevelParam = barrageMessage.fansLevelParam;
                if (barrageTypeFansLevelParam != null && (user = barrageTypeFansLevelParam.user) != null) {
                    lValueOf = Long.valueOf(user.getId());
                }
                return String.valueOf(lValueOf);
            default:
                if (a0.LJJIIZI(barrageMessage.scene, "vault_gloves_user", false)) {
                    BarrageMessage.BarrageEvent barrageEvent = barrageMessage.event;
                    if (barrageEvent != null && (map = barrageEvent.params) != null) {
                        str = map.get("vault_shop");
                    }
                    if (str != null) {
                        try {
                            return new JSONObject(str).optString("to_user_id", "");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                return "";
        }
    }

    public static void LIZLLL(BarrageMessage barrageMessage, boolean z) {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!BarragePrivilegeTrackingEnabled.INSTANCE.getValue() || barrageMessage == null) {
            return;
        }
        try {
            C1090650eUJ c1090650eUJLIZ = LIZ(barrageMessage);
            if (c1090650eUJLIZ == null) {
                return;
            }
            if (z) {
                str = "anchor";
            } else {
                str = "user";
            }
            String strLIZJ = LIZJ(barrageMessage);
            C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_barrage_message_click", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
            c474500IjALIZIZ.LJIIIIZZ();
            C1090630eUH.LIZ(c474500IjALIZIZ, barrageMessage, c1090650eUJLIZ);
            c474500IjALIZIZ.LJJII(str, "user_type");
            c474500IjALIZIZ.LJJII(strLIZJ, "to_user_id");
            c474500IjALIZIZ.LJJII(Integer.valueOf(C1090780eUW.LJI(barrageMessage)), "barrage_grade");
            c474500IjALIZIZ.LJJII(Long.valueOf(System.currentTimeMillis() - barrageMessage.receiveTime), "duration");
            String str6 = "";
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            if (Intrinsics.LJFF(strLIZJ, String.valueOf(UserService.getInstance().user().getCurrentUserId()))) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZIZ.LJJII(Integer.valueOf(i), "is_own_send");
            PrivilegeLogExtra privilegeLogExtra = barrageMessage.privilegeLogExtra;
            if (privilegeLogExtra == null || (str2 = privilegeLogExtra.privilege_id) == null) {
                str2 = "";
            }
            c474500IjALIZIZ.LJJII(str2, "privilege_id");
            PrivilegeLogExtra privilegeLogExtra2 = barrageMessage.privilegeLogExtra;
            if (privilegeLogExtra2 == null || (str3 = privilegeLogExtra2.privilege_order_id) == null) {
                str3 = "";
            }
            c474500IjALIZIZ.LJJII(str3, "privilege_order_id");
            PrivilegeLogExtra privilegeLogExtra3 = barrageMessage.privilegeLogExtra;
            if (privilegeLogExtra3 == null || (str4 = privilegeLogExtra3.privilege_version) == null) {
                str4 = "";
            }
            c474500IjALIZIZ.LJJII(str4, "privilege_version_id");
            PrivilegeLogExtra privilegeLogExtra4 = barrageMessage.privilegeLogExtra;
            if (privilegeLogExtra4 != null && (str5 = privilegeLogExtra4.data_version) != null) {
                str6 = str5;
            }
            c474500IjALIZIZ.LJJII(str6, "data_version_id");
            c474500IjALIZIZ.LJJII("room_left", "show_place");
            c474500IjALIZIZ.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
