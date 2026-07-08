package X;

import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1874080yru implements InterfaceC1891350zJl {
    public static final EnumC1874080yru DM_BA_MSG_TONE_ALERT_BANNER;
    public static final EnumC1874080yru DM_TRY_AI_GROUP_SHOT;
    public static final EnumC1874080yru DM_TURN_ON_PERMISSION_CREATOR_OTHERS_ONLY;
    public static final EnumC1874080yru DM_TURN_ON_PERMISSION_CREATOR_REVAMP;
    public static final EnumC1874080yru DM_TURN_ON_PERMISSION_FRIENDS_REVAMP;
    public static final EnumC1874080yru DM_UNIFIED_AGE_SERVICE_AGE_DOWN_BANNER;
    public static final EnumC1874080yru EmptyTopNoticeView;
    public static final EnumC1874080yru FilteredMessageRequestOptIn;
    public static final /* synthetic */ EnumC1874080yru[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1874080yru PERMISSION_UPDATED_SHEET;
    public static final EnumC1874080yru PermissionUpdatedNoticeView;
    public static final EnumC1874080yru RECOMMEND_CREATE_GROUP_BANNER;
    public static final EnumC1874080yru STREAK_RECOMMEND_GUIDE_BANNER;
    public static final EnumC1874080yru TURN_ON_NOTIFICATION_VIEW_V2;
    public static final EnumC1874080yru TurnOnMessagePreview;
    public static final EnumC1874080yru UPDATES_TO_DIRECT_MESSAGE_SETTINGS;
    public final String LL;
    public final InterfaceC1868680yjC LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1874080yru> getEntries() {
        return LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    static {
        C1868690yjD c1868690yjD = C1868690yjD.LIZ;
        EnumC1874080yru enumC1874080yru = new EnumC1874080yru("EmptyTopNoticeView", 0, "empty_item", c1868690yjD);
        EmptyTopNoticeView = enumC1874080yru;
        EnumC1874080yru enumC1874080yru2 = new EnumC1874080yru("TURN_ON_NOTIFICATION_VIEW_V2", 1, "dm_turn_on_notification_bar_v2", c1868690yjD);
        TURN_ON_NOTIFICATION_VIEW_V2 = enumC1874080yru2;
        EnumC1874080yru enumC1874080yru3 = new EnumC1874080yru("TurnOnMessagePreview", 2, "im_push_preview", new C1868660yjA(new C1868640yj8(2131833920), new C1868640yj8(2131833919), new C1868640yj8(2131833918), "preview_message"));
        TurnOnMessagePreview = enumC1874080yru3;
        EnumC1874080yru enumC1874080yru4 = new EnumC1874080yru("PermissionUpdatedNoticeView", 3, "permission_updated_notice", new C1868660yjA(new C1868640yj8(2131839206), new C1868640yj8(2131839205), C1868710yjF.LIZ, "empty"));
        PermissionUpdatedNoticeView = enumC1874080yru4;
        EnumC1874080yru enumC1874080yru5 = new EnumC1874080yru("PERMISSION_UPDATED_SHEET", 4, "suggested_friends_updated", c1868690yjD);
        PERMISSION_UPDATED_SHEET = enumC1874080yru5;
        EnumC1874080yru enumC1874080yru6 = new EnumC1874080yru("FilteredMessageRequestOptIn", 5, "filtered_request_intro", c1868690yjD);
        FilteredMessageRequestOptIn = enumC1874080yru6;
        EnumC1874080yru enumC1874080yru7 = new EnumC1874080yru("DM_TURN_ON_PERMISSION_FRIENDS_REVAMP", 6, "turn_on_permission_friends_v2", new C1868650yj9(new C1868640yj8(2131830780), new C1868640yj8(2131831901), "turn_on_permission_inbox"));
        DM_TURN_ON_PERMISSION_FRIENDS_REVAMP = enumC1874080yru7;
        EnumC1874080yru enumC1874080yru8 = new EnumC1874080yru("DM_TURN_ON_PERMISSION_CREATOR_REVAMP", 7, "turn_on_permission_creator_v2", new C1868650yj9(new C1868640yj8(2131830779), new C1868640yj8(2131830777), "turn_on_permission_request"));
        DM_TURN_ON_PERMISSION_CREATOR_REVAMP = enumC1874080yru8;
        EnumC1874080yru enumC1874080yru9 = new EnumC1874080yru("DM_TURN_ON_PERMISSION_CREATOR_OTHERS_ONLY", 8, "turn_on_permission_creator_v2_others_only", new C1868650yj9(new C1868640yj8(2131830778), new C1868640yj8(2131830777), "turn_on_permission_request"));
        DM_TURN_ON_PERMISSION_CREATOR_OTHERS_ONLY = enumC1874080yru9;
        EnumC1874080yru enumC1874080yru10 = new EnumC1874080yru("UPDATES_TO_DIRECT_MESSAGE_SETTINGS", 9, "updates_to_direct_message_settings", c1868690yjD);
        UPDATES_TO_DIRECT_MESSAGE_SETTINGS = enumC1874080yru10;
        EnumC1874080yru enumC1874080yru11 = new EnumC1874080yru("DM_TRY_AI_GROUP_SHOT", 10, "try_aigroupshot_banner", c1868690yjD);
        DM_TRY_AI_GROUP_SHOT = enumC1874080yru11;
        EnumC1874080yru enumC1874080yru12 = new EnumC1874080yru("RECOMMEND_CREATE_GROUP_BANNER", 11, "inbox_recom_group_banner", c1868690yjD);
        RECOMMEND_CREATE_GROUP_BANNER = enumC1874080yru12;
        EnumC1874080yru enumC1874080yru13 = new EnumC1874080yru("DM_BA_MSG_TONE_ALERT_BANNER", 12, "inbox_business_alert_banner", c1868690yjD);
        DM_BA_MSG_TONE_ALERT_BANNER = enumC1874080yru13;
        EnumC1874080yru enumC1874080yru14 = new EnumC1874080yru("STREAK_RECOMMEND_GUIDE_BANNER", 13, "streak_recommend_guide_banner", c1868690yjD);
        STREAK_RECOMMEND_GUIDE_BANNER = enumC1874080yru14;
        EnumC1874080yru enumC1874080yru15 = new EnumC1874080yru("DM_UNIFIED_AGE_SERVICE_AGE_DOWN_BANNER", 14, "disable_dm_by_age_restriction", new C1868720yjG(AFwS187S0000000_2.get$arr$(350), AFwS187S0000000_2.get$arr$(351), AFwS229S0000000_2.get$arr$(248)));
        DM_UNIFIED_AGE_SERVICE_AGE_DOWN_BANNER = enumC1874080yru15;
        EnumC1874080yru[] enumC1874080yruArr = {enumC1874080yru, enumC1874080yru2, enumC1874080yru3, enumC1874080yru4, enumC1874080yru5, enumC1874080yru6, enumC1874080yru7, enumC1874080yru8, enumC1874080yru9, enumC1874080yru10, enumC1874080yru11, enumC1874080yru12, enumC1874080yru13, enumC1874080yru14, enumC1874080yru15};
        LLILLL = enumC1874080yruArr;
        LLILZ = new C2254308sP(enumC1874080yruArr);
    }

    public static EnumC1874080yru[] values() {
        return (EnumC1874080yru[]) LLILLL.clone();
    }

    public final InterfaceC1868680yjC getConfig() {
        return this.LLILLJJLI;
    }

    public final String getNoticeCode() {
        return this.LL;
    }

    public static EnumC1874080yru valueOf(String str) {
        return (EnumC1874080yru) C08FF.LIZ(EnumC1874080yru.class, str);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        EnumC1874080yru enumC1874080yru;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof EnumC1874080yru) && (enumC1874080yru = (EnumC1874080yru) interfaceC1891350zJl) != null) {
            str2 = enumC1874080yru.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        EnumC1874080yru enumC1874080yru;
        InterfaceC1868680yjC interfaceC1868680yjC = this.LLILLJJLI;
        InterfaceC1868680yjC interfaceC1868680yjC2 = null;
        if ((interfaceC1891350zJl instanceof EnumC1874080yru) && (enumC1874080yru = (EnumC1874080yru) interfaceC1891350zJl) != null) {
            interfaceC1868680yjC2 = enumC1874080yru.LLILLJJLI;
        }
        return Intrinsics.LJFF(interfaceC1868680yjC, interfaceC1868680yjC2);
    }

    public EnumC1874080yru(String str, int i, String str2, InterfaceC1868680yjC interfaceC1868680yjC) {
        this.LL = str2;
        this.LLILLJJLI = interfaceC1868680yjC;
    }
}
