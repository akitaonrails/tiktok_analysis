package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0i69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1229430i69 {
    public static final EnumC1229430i69 CAMPUS_GROUP;
    public static final EnumC1229430i69 CREATOR_TEAM_CHAT_ROOM;
    public static final EnumC1229430i69 EVERYONE;
    public static final EnumC1229430i69 FAN_GROUP;
    public static final EnumC1229430i69 FOLLOWERS;
    public static final EnumC1229430i69 GROUP_SHOT_GROUP;
    public static final /* synthetic */ EnumC1229430i69[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1229430i69 QR_CODE_GROUP_SHOT_GROUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1229430i69> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1229430i69 enumC1229430i69 = new EnumC1229430i69("FAN_GROUP", 0, "fan_group");
        FAN_GROUP = enumC1229430i69;
        EnumC1229430i69 enumC1229430i692 = new EnumC1229430i69("CAMPUS_GROUP", 1, "campus_group");
        CAMPUS_GROUP = enumC1229430i692;
        EnumC1229430i69 enumC1229430i693 = new EnumC1229430i69("CREATOR_TEAM_CHAT_ROOM", 2, "creator_team_chat_room");
        CREATOR_TEAM_CHAT_ROOM = enumC1229430i693;
        EnumC1229430i69 enumC1229430i694 = new EnumC1229430i69("FOLLOWERS", 3, "followers");
        FOLLOWERS = enumC1229430i694;
        EnumC1229430i69 enumC1229430i695 = new EnumC1229430i69("QR_CODE_GROUP_SHOT_GROUP", 4, "qr_code_group_shot_group");
        QR_CODE_GROUP_SHOT_GROUP = enumC1229430i695;
        EnumC1229430i69 enumC1229430i696 = new EnumC1229430i69("GROUP_SHOT_GROUP", 5, "group_shot_group");
        GROUP_SHOT_GROUP = enumC1229430i696;
        EnumC1229430i69 enumC1229430i697 = new EnumC1229430i69("EVERYONE", 6, "everyone");
        EVERYONE = enumC1229430i697;
        EnumC1229430i69[] enumC1229430i69Arr = {enumC1229430i69, enumC1229430i692, enumC1229430i693, enumC1229430i694, enumC1229430i695, enumC1229430i696, enumC1229430i697};
        LLILLJJLI = enumC1229430i69Arr;
        LLILLL = new C2254308sP(enumC1229430i69Arr);
    }

    public static EnumC1229430i69[] values() {
        return (EnumC1229430i69[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1229430i69 valueOf(String str) {
        return (EnumC1229430i69) C08FF.LIZ(EnumC1229430i69.class, str);
    }

    public EnumC1229430i69(String str, int i, String str2) {
        this.LL = str2;
    }
}
