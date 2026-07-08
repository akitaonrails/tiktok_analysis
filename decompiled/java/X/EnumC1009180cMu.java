package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1009180cMu {
    public static final EnumC1009180cMu ANOLE_RIGHT_INTERACT_SUB_AVATAR;
    public static final EnumC1009180cMu ANOLE_RIGHT_INTERACT_SUB_COMMENT;
    public static final EnumC1009180cMu ANOLE_RIGHT_INTERACT_SUB_FAV;
    public static final EnumC1009180cMu ANOLE_RIGHT_INTERACT_SUB_LIKE;
    public static final EnumC1009180cMu ANOLE_RIGHT_INTERACT_SUB_MUSIC;
    public static final EnumC1009180cMu ANOLE_RIGHT_INTERACT_SUB_SHARE;
    public static final /* synthetic */ EnumC1009180cMu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1009180cMu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1009180cMu enumC1009180cMu = new EnumC1009180cMu("ANOLE_RIGHT_INTERACT_SUB_AVATAR", 0, "tt_user_avatar_interactive");
        ANOLE_RIGHT_INTERACT_SUB_AVATAR = enumC1009180cMu;
        EnumC1009180cMu enumC1009180cMu2 = new EnumC1009180cMu("ANOLE_RIGHT_INTERACT_SUB_LIKE", 1, "tt_like_interactive");
        ANOLE_RIGHT_INTERACT_SUB_LIKE = enumC1009180cMu2;
        EnumC1009180cMu enumC1009180cMu3 = new EnumC1009180cMu("ANOLE_RIGHT_INTERACT_SUB_COMMENT", 2, "tt_comment_interactive");
        ANOLE_RIGHT_INTERACT_SUB_COMMENT = enumC1009180cMu3;
        EnumC1009180cMu enumC1009180cMu4 = new EnumC1009180cMu("ANOLE_RIGHT_INTERACT_SUB_SHARE", 3, "tt_share_interactive");
        ANOLE_RIGHT_INTERACT_SUB_SHARE = enumC1009180cMu4;
        EnumC1009180cMu enumC1009180cMu5 = new EnumC1009180cMu("ANOLE_RIGHT_INTERACT_SUB_MUSIC", 4, "tt_music_interactive");
        ANOLE_RIGHT_INTERACT_SUB_MUSIC = enumC1009180cMu5;
        EnumC1009180cMu enumC1009180cMu6 = new EnumC1009180cMu("ANOLE_RIGHT_INTERACT_SUB_FAV", 5, "tt_favorite_interactive");
        ANOLE_RIGHT_INTERACT_SUB_FAV = enumC1009180cMu6;
        EnumC1009180cMu[] enumC1009180cMuArr = {enumC1009180cMu, enumC1009180cMu2, enumC1009180cMu3, enumC1009180cMu4, enumC1009180cMu5, enumC1009180cMu6};
        LLILLJJLI = enumC1009180cMuArr;
        LLILLL = new C2254308sP(enumC1009180cMuArr);
    }

    public static EnumC1009180cMu[] values() {
        return (EnumC1009180cMu[]) LLILLJJLI.clone();
    }

    public final String getInteractName() {
        return this.LL;
    }

    public static EnumC1009180cMu valueOf(String str) {
        return (EnumC1009180cMu) C08FF.LIZ(EnumC1009180cMu.class, str);
    }

    public EnumC1009180cMu(String str, int i, String str2) {
        this.LL = str2;
    }
}
