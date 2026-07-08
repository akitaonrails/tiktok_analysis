package X;

/* JADX INFO: renamed from: X.06cJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1644906cJ {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static EnumC1645006cK LIZ(String str) {
        switch (str.hashCode()) {
            case -1596243243:
                if (str.equals("recommended_chat_suggested_stickers")) {
                    return EnumC1645006cK.RECOMMENDED_CHAT;
                }
                break;
            case -1240669851:
                if (str.equals("sayhi_suggested_stickers")) {
                    return EnumC1645006cK.SAY_HI;
                }
                break;
            case 1184254440:
                if (str.equals("aimoji_suggested_stickers")) {
                    return EnumC1645006cK.POST_AIMOJI_CREATION;
                }
                break;
            case 2052880889:
                if (str.equals("avatar_duo_suggested_stickers")) {
                    return EnumC1645006cK.POST_SA_DUO_CREATION;
                }
                break;
        }
        return EnumC1645006cK.OTHERS;
    }
}
