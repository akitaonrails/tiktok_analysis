package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216940hm0 {
    public static final EnumC1216940hm0 BIO;
    public static final /* synthetic */ EnumC1216940hm0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216940hm0 NGO;
    public static final EnumC1216940hm0 NICKNAME;
    public static final EnumC1216940hm0 PHOTO_AVATAR;
    public static final EnumC1216940hm0 SOCIAL_ACCOUNT_BIND;
    public static final EnumC1216940hm0 SOCIAL_ACCOUNT_UNBIND;
    public static final EnumC1216940hm0 USERNAME;
    public static final EnumC1216940hm0 VIDEO_AVATAR;
    public static final EnumC1216940hm0 WEBSITE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1216940hm0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216940hm0 enumC1216940hm0 = new EnumC1216940hm0("PHOTO_AVATAR", 0, "photo");
        PHOTO_AVATAR = enumC1216940hm0;
        EnumC1216940hm0 enumC1216940hm02 = new EnumC1216940hm0("VIDEO_AVATAR", 1, "video");
        VIDEO_AVATAR = enumC1216940hm02;
        EnumC1216940hm0 enumC1216940hm03 = new EnumC1216940hm0("BIO", 2, "bio");
        BIO = enumC1216940hm03;
        EnumC1216940hm0 enumC1216940hm04 = new EnumC1216940hm0("WEBSITE", 3, "website");
        WEBSITE = enumC1216940hm04;
        EnumC1216940hm0 enumC1216940hm05 = new EnumC1216940hm0("NICKNAME", 4, "name");
        NICKNAME = enumC1216940hm05;
        EnumC1216940hm0 enumC1216940hm06 = new EnumC1216940hm0("USERNAME", 5, "username");
        USERNAME = enumC1216940hm06;
        EnumC1216940hm0 enumC1216940hm07 = new EnumC1216940hm0("SOCIAL_ACCOUNT_BIND", 6, "social_account_bind");
        SOCIAL_ACCOUNT_BIND = enumC1216940hm07;
        EnumC1216940hm0 enumC1216940hm08 = new EnumC1216940hm0("SOCIAL_ACCOUNT_UNBIND", 7, "social_account_unbind");
        SOCIAL_ACCOUNT_UNBIND = enumC1216940hm08;
        EnumC1216940hm0 enumC1216940hm09 = new EnumC1216940hm0("NGO", 8, "ngo");
        NGO = enumC1216940hm09;
        EnumC1216940hm0[] enumC1216940hm0Arr = {enumC1216940hm0, enumC1216940hm02, enumC1216940hm03, enumC1216940hm04, enumC1216940hm05, enumC1216940hm06, enumC1216940hm07, enumC1216940hm08, enumC1216940hm09};
        LLILLJJLI = enumC1216940hm0Arr;
        LLILLL = new C2254308sP(enumC1216940hm0Arr);
    }

    public static EnumC1216940hm0[] values() {
        return (EnumC1216940hm0[]) LLILLJJLI.clone();
    }

    public final String getStrValue() {
        return this.LL;
    }

    public static EnumC1216940hm0 valueOf(String str) {
        return (EnumC1216940hm0) C08FF.LIZ(EnumC1216940hm0.class, str);
    }

    public EnumC1216940hm0(String str, int i, String str2) {
        this.LL = str2;
    }
}
