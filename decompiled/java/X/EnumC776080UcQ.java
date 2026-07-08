package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776080UcQ {
    public static final EnumC776080UcQ ANIM_BLOCK;
    public static final EnumC776080UcQ BADGE_EMOJI_BLOCK;
    public static final EnumC776080UcQ FADING_EDGE_BLOCK;
    public static final EnumC776080UcQ HOT_COMMENT_TRAY_EFFECT_BLOCK;
    public static final EnumC776080UcQ ICON_PRELOAD_BLOCK;
    public static final EnumC776080UcQ IM_TRAFFIC_LIMIT;
    public static final EnumC776080UcQ LIKE_FPS_REDUCE;
    public static final EnumC776080UcQ LIKE_RATE_INTERVAL_INCREASE;
    public static final /* synthetic */ EnumC776080UcQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC776080UcQ MESSAGE_QUEUE_LENGTH_REDUCE;
    public static final EnumC776080UcQ REFRESH_INTERVAL_INCREASE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC776080UcQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC776080UcQ enumC776080UcQ = new EnumC776080UcQ("REFRESH_INTERVAL_INCREASE", 0, "refresh_interval_increase");
        REFRESH_INTERVAL_INCREASE = enumC776080UcQ;
        EnumC776080UcQ enumC776080UcQ2 = new EnumC776080UcQ("MESSAGE_QUEUE_LENGTH_REDUCE", 1, "message_queue_length_reduce");
        MESSAGE_QUEUE_LENGTH_REDUCE = enumC776080UcQ2;
        EnumC776080UcQ enumC776080UcQ3 = new EnumC776080UcQ("FADING_EDGE_BLOCK", 2, "fading_edge_block");
        FADING_EDGE_BLOCK = enumC776080UcQ3;
        EnumC776080UcQ enumC776080UcQ4 = new EnumC776080UcQ("ANIM_BLOCK", 3, "anim_block");
        ANIM_BLOCK = enumC776080UcQ4;
        EnumC776080UcQ enumC776080UcQ5 = new EnumC776080UcQ("BADGE_EMOJI_BLOCK", 4, "badge_emoji_block");
        BADGE_EMOJI_BLOCK = enumC776080UcQ5;
        EnumC776080UcQ enumC776080UcQ6 = new EnumC776080UcQ("HOT_COMMENT_TRAY_EFFECT_BLOCK", 5, "hot_comment_tray_effect_block");
        HOT_COMMENT_TRAY_EFFECT_BLOCK = enumC776080UcQ6;
        EnumC776080UcQ enumC776080UcQ7 = new EnumC776080UcQ("LIKE_FPS_REDUCE", 6, "like_fps_reduce");
        LIKE_FPS_REDUCE = enumC776080UcQ7;
        EnumC776080UcQ enumC776080UcQ8 = new EnumC776080UcQ("LIKE_RATE_INTERVAL_INCREASE", 7, "like_rate_interval_increase");
        LIKE_RATE_INTERVAL_INCREASE = enumC776080UcQ8;
        EnumC776080UcQ enumC776080UcQ9 = new EnumC776080UcQ("ICON_PRELOAD_BLOCK", 8, "icon_preload_block");
        ICON_PRELOAD_BLOCK = enumC776080UcQ9;
        EnumC776080UcQ enumC776080UcQ10 = new EnumC776080UcQ("IM_TRAFFIC_LIMIT", 9, "im_traffic_limit");
        IM_TRAFFIC_LIMIT = enumC776080UcQ10;
        EnumC776080UcQ[] enumC776080UcQArr = {enumC776080UcQ, enumC776080UcQ2, enumC776080UcQ3, enumC776080UcQ4, enumC776080UcQ5, enumC776080UcQ6, enumC776080UcQ7, enumC776080UcQ8, enumC776080UcQ9, enumC776080UcQ10};
        LLILLJJLI = enumC776080UcQArr;
        LLILLL = new C2254308sP(enumC776080UcQArr);
    }

    public static EnumC776080UcQ[] values() {
        return (EnumC776080UcQ[]) LLILLJJLI.clone();
    }

    public final String getFeatureName() {
        return this.LL;
    }

    public static EnumC776080UcQ valueOf(String str) {
        return (EnumC776080UcQ) C08FF.LIZ(EnumC776080UcQ.class, str);
    }

    public EnumC776080UcQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
