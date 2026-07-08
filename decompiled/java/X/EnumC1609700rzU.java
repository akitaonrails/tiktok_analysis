package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1609700rzU {
    public static final EnumC1609700rzU AVATAR_300;
    public static final EnumC1609700rzU AVATAR_LARGE;
    public static final EnumC1609700rzU AVATAR_MEDIUM;
    public static final EnumC1609700rzU AVATAR_THUMB;
    public static final /* synthetic */ EnumC1609700rzU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1609700rzU SOCIAL_AVATAR;
    public static final EnumC1609700rzU SOCIAL_DYNAMIC_AVATAR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1609700rzU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1609700rzU enumC1609700rzU = new EnumC1609700rzU("AVATAR_THUMB", 0, "avatar_thumb");
        AVATAR_THUMB = enumC1609700rzU;
        EnumC1609700rzU enumC1609700rzU2 = new EnumC1609700rzU("AVATAR_MEDIUM", 1, "avatar_medium");
        AVATAR_MEDIUM = enumC1609700rzU2;
        EnumC1609700rzU enumC1609700rzU3 = new EnumC1609700rzU("AVATAR_300", 2, "avatar_300");
        AVATAR_300 = enumC1609700rzU3;
        EnumC1609700rzU enumC1609700rzU4 = new EnumC1609700rzU("AVATAR_LARGE", 3, "avatar_large");
        AVATAR_LARGE = enumC1609700rzU4;
        EnumC1609700rzU enumC1609700rzU5 = new EnumC1609700rzU("SOCIAL_AVATAR", 4, "social_avatar");
        SOCIAL_AVATAR = enumC1609700rzU5;
        EnumC1609700rzU enumC1609700rzU6 = new EnumC1609700rzU("SOCIAL_DYNAMIC_AVATAR", 5, "social_dynamic_avatar");
        SOCIAL_DYNAMIC_AVATAR = enumC1609700rzU6;
        EnumC1609700rzU[] enumC1609700rzUArr = {enumC1609700rzU, enumC1609700rzU2, enumC1609700rzU3, enumC1609700rzU4, enumC1609700rzU5, enumC1609700rzU6};
        LLILLJJLI = enumC1609700rzUArr;
        LLILLL = new C2254308sP(enumC1609700rzUArr);
    }

    public static EnumC1609700rzU[] values() {
        return (EnumC1609700rzU[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static EnumC1609700rzU valueOf(String str) {
        return (EnumC1609700rzU) C08FF.LIZ(EnumC1609700rzU.class, str);
    }

    public EnumC1609700rzU(String str, int i, String str2) {
        this.LL = str2;
    }
}
