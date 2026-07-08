package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.054f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12931054f {
    public static final EnumC12931054f ACTION_BAR_AUTO_RETRY;
    public static final EnumC12931054f BIRTHDAY;
    public static final EnumC12931054f CUSTOM_BUBBLE_INLINE_COUNT_LIMIT;
    public static final EnumC12931054f CUSTOM_BUBBLE_INLINE_INTERVAL_LIMIT;
    public static final EnumC12931054f GALLERY_SEND_GUIDE_COUNT_LIMIT;
    public static final EnumC12931054f GALLERY_SEND_GUIDE_CYCLES_LIMIT;
    public static final EnumC12931054f GALLERY_SEND_GUIDE_INTERVAL_LIMIT;
    public static final /* synthetic */ EnumC12931054f[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC12931054f NULL;
    public static final EnumC12931054f TRANSLATION_GUIDE_FAKE_MESSAGE;
    public static final EnumC12931054f UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P2;
    public static final EnumC12931054f UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P3;
    public static final EnumC12931054f UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P2;
    public static final EnumC12931054f UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P3;
    public static final EnumC12931054f UNIFY_LIKE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC12931054f> getEntries() {
        return LLILLL;
    }

    static {
        EnumC12931054f enumC12931054f = new EnumC12931054f("NULL", 0, "null");
        NULL = enumC12931054f;
        EnumC12931054f enumC12931054f2 = new EnumC12931054f("BIRTHDAY", 1, "birthday_info_multi_check_network_request");
        BIRTHDAY = enumC12931054f2;
        EnumC12931054f enumC12931054f3 = new EnumC12931054f("UNIFY_LIKE", 2, "light_interaction_unify_like");
        UNIFY_LIKE = enumC12931054f3;
        EnumC12931054f enumC12931054f4 = new EnumC12931054f("UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P2", 3, "chatroom_prompts_unified_frequency_control_daily_limit_p2");
        UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P2 = enumC12931054f4;
        EnumC12931054f enumC12931054f5 = new EnumC12931054f("UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P3", 4, "chatroom_prompts_unified_frequency_control_daily_limit_p3");
        UNIFY_CHATROOM_PROMPTS_DAILY_LIMIT_P3 = enumC12931054f5;
        EnumC12931054f enumC12931054f6 = new EnumC12931054f("UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P2", 5, "chatroom_prompts_unified_frequency_control_recent_limit_p2");
        UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P2 = enumC12931054f6;
        EnumC12931054f enumC12931054f7 = new EnumC12931054f("UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P3", 6, "chatroom_prompts_unified_frequency_control_recent_limit_p3");
        UNIFY_CHATROOM_PROMPTS_RECENT_LIMIT_P3 = enumC12931054f7;
        EnumC12931054f enumC12931054f8 = new EnumC12931054f("ACTION_BAR_AUTO_RETRY", 7, "action_bar_auto_retry");
        ACTION_BAR_AUTO_RETRY = enumC12931054f8;
        EnumC12931054f enumC12931054f9 = new EnumC12931054f("GALLERY_SEND_GUIDE_INTERVAL_LIMIT", 8, "chatroom_gallery_send_guide_interval_limit");
        GALLERY_SEND_GUIDE_INTERVAL_LIMIT = enumC12931054f9;
        EnumC12931054f enumC12931054f10 = new EnumC12931054f("GALLERY_SEND_GUIDE_COUNT_LIMIT", 9, "chatroom_gallery_send_guide_count_limit");
        GALLERY_SEND_GUIDE_COUNT_LIMIT = enumC12931054f10;
        EnumC12931054f enumC12931054f11 = new EnumC12931054f("GALLERY_SEND_GUIDE_CYCLES_LIMIT", 10, "chatroom_gallery_send_guide_cycles_limit");
        GALLERY_SEND_GUIDE_CYCLES_LIMIT = enumC12931054f11;
        EnumC12931054f enumC12931054f12 = new EnumC12931054f("CUSTOM_BUBBLE_INLINE_INTERVAL_LIMIT", 11, "custom_message_bubble_interval_limit");
        CUSTOM_BUBBLE_INLINE_INTERVAL_LIMIT = enumC12931054f12;
        EnumC12931054f enumC12931054f13 = new EnumC12931054f("CUSTOM_BUBBLE_INLINE_COUNT_LIMIT", 12, "custom_message_bubble_count_limit");
        CUSTOM_BUBBLE_INLINE_COUNT_LIMIT = enumC12931054f13;
        EnumC12931054f enumC12931054f14 = new EnumC12931054f("TRANSLATION_GUIDE_FAKE_MESSAGE", 13, "im_translation_guide_fake_message");
        TRANSLATION_GUIDE_FAKE_MESSAGE = enumC12931054f14;
        EnumC12931054f[] enumC12931054fArr = {enumC12931054f, enumC12931054f2, enumC12931054f3, enumC12931054f4, enumC12931054f5, enumC12931054f6, enumC12931054f7, enumC12931054f8, enumC12931054f9, enumC12931054f10, enumC12931054f11, enumC12931054f12, enumC12931054f13, enumC12931054f14};
        LLILLJJLI = enumC12931054fArr;
        LLILLL = new C2254308sP(enumC12931054fArr);
    }

    public static EnumC12931054f[] values() {
        return (EnumC12931054f[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC12931054f valueOf(String str) {
        return (EnumC12931054f) C08FF.LIZ(EnumC12931054f.class, str);
    }

    public EnumC12931054f(String str, int i, String str2) {
        this.LL = str2;
    }
}
