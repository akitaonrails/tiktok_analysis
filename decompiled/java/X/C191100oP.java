package X;

import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.CombineBadgeStruct;
import com.bytedance.android.live.base.model.user.PrivilegeLogExtra;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.00oP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C191100oP {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZIZ(BadgeStruct badgeStruct) {
        if (badgeStruct != null && badgeStruct.display && badgeStruct.badgeScene == 6) {
            return true;
        }
        return false;
    }

    public static final boolean LIZJ(BadgeStruct badgeStruct) {
        if (badgeStruct != null && badgeStruct.display && badgeStruct.badgeScene == 10) {
            return true;
        }
        return false;
    }

    public static final boolean LIZLLL(BadgeStruct badgeStruct) {
        if (badgeStruct != null && badgeStruct.display && badgeStruct.badgeScene == 2) {
            return true;
        }
        return false;
    }

    public static final void LJFF(long j, String str, boolean z) {
        int i;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_badge_click");
        c474500IjALIZ.LJIL();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
            c474500IjALIZ.LJJII(str, "show_entrance");
            if (currentUserId == j) {
                i = 1;
            } else {
                i = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_self");
            c474500IjALIZ.LJJII(String.valueOf(room.getOwnerUserId()), "anchor_id");
            if (z) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            c474500IjALIZ.LJJII(str2, "is_anchor");
            c474500IjALIZ.LJJII(room.getIdStr(), "room_id");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
            c474500IjALIZ.LJJII("2", "badge_type");
        }
        c474500IjALIZ.LIZ();
    }

    public static final void LJ(long j, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ;
        if (Intrinsics.LJFF("livesdk_top_active_user_rank_badge_show", str)) {
            c474500IjALIZ = C0IJT.LIZIZ(str, Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        } else {
            c474500IjALIZ = C0IJT.LIZ(str);
        }
        c474500IjALIZ.LJJII(str3, "user_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "to_user_id");
        c474500IjALIZ.LJJII(str2, "show_entrance");
        c474500IjALIZ.LJJII("", "privilege_id");
        c474500IjALIZ.LJJII(2, "data_version_id");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(C474500IjA c474500IjA, BadgeStruct badgeStruct, boolean z, boolean z2, Integer num, Long l, boolean z3) {
        boolean z4;
        String str;
        long j;
        int i;
        int i2;
        long jLongValue;
        boolean z5;
        long jLongValue2;
        CombineBadgeStruct combineBadgeStruct;
        String str2;
        int i3 = 1;
        if ((((int) badgeStruct.greyedByClient) & 8) == 8) {
            z4 = true;
        } else {
            z4 = false;
        }
        PrivilegeLogExtra privilegeLogExtra = badgeStruct.logExtra;
        if (privilegeLogExtra != null) {
            str = privilegeLogExtra.level;
        } else {
            str = null;
        }
        long j2 = 0;
        if (str != null) {
            try {
                j = CastLongProtector.parseLong(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                j = 0;
            }
        } else {
            j = 0;
        }
        if (j <= 0) {
            i = 0;
        } else if (!z4) {
            i = 1;
        } else {
            i = 3;
        }
        if (C1114730f79.LIZ() && (combineBadgeStruct = badgeStruct.combineBadgeStruct) != null && (str2 = combineBadgeStruct.str) != null && C500260Jjc.LJJIIZ(str2) && (!z3 || z2)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        c474500IjA.LJJII(Integer.valueOf(i2), "is_with_badge_name");
        if (!z) {
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            if (num != null && num.intValue() == 2) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (jLongValue <= 0) {
                i3 = 0;
            } else if (z5) {
                i3 = 3;
            }
            c474500IjA.LJJII(Integer.valueOf(i3), "fans_club_relation_status");
            if (l != null) {
                jLongValue2 = l.longValue();
            } else {
                jLongValue2 = 0;
            }
            c474500IjA.LJJII(Long.valueOf(jLongValue2), "fans_club_level");
        }
        if (!z2) {
            c474500IjA.LJJII(Integer.valueOf(i), "to_badge_fans_club_relation_status");
            if (j >= 0) {
                j2 = j;
            }
            c474500IjA.LJJII(Long.valueOf(j2), "to_badge_fans_club_level");
        }
    }
}
