package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b7N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC961110b7N {
    public static final EnumC961110b7N INVITING_USER_IDS;
    public static final EnumC961110b7N IS_OFFICIAL_CHANNEL;
    public static final /* synthetic */ EnumC961110b7N[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC961110b7N NONE;
    public static final EnumC961110b7N OTHER;
    public static final EnumC961110b7N TOP_LIVING_FRIEND_UID;
    public static final EnumC961110b7N TOP_LIVING_SUGGEST_UID;

    public static InterfaceC2044707zh<EnumC961110b7N> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC961110b7N enumC961110b7N = new EnumC961110b7N("NONE", 0);
        NONE = enumC961110b7N;
        EnumC961110b7N enumC961110b7N2 = new EnumC961110b7N("TOP_LIVING_FRIEND_UID", 1);
        TOP_LIVING_FRIEND_UID = enumC961110b7N2;
        EnumC961110b7N enumC961110b7N3 = new EnumC961110b7N("TOP_LIVING_SUGGEST_UID", 2);
        TOP_LIVING_SUGGEST_UID = enumC961110b7N3;
        EnumC961110b7N enumC961110b7N4 = new EnumC961110b7N("INVITING_USER_IDS", 3);
        INVITING_USER_IDS = enumC961110b7N4;
        EnumC961110b7N enumC961110b7N5 = new EnumC961110b7N("IS_OFFICIAL_CHANNEL", 4);
        IS_OFFICIAL_CHANNEL = enumC961110b7N5;
        EnumC961110b7N enumC961110b7N6 = new EnumC961110b7N("OTHER", 5);
        OTHER = enumC961110b7N6;
        EnumC961110b7N[] enumC961110b7NArr = {enumC961110b7N, enumC961110b7N2, enumC961110b7N3, enumC961110b7N4, enumC961110b7N5, enumC961110b7N6};
        LL = enumC961110b7NArr;
        LLILLJJLI = new C2254308sP(enumC961110b7NArr);
    }

    public static EnumC961110b7N[] values() {
        return (EnumC961110b7N[]) LL.clone();
    }

    public static EnumC961110b7N valueOf(String str) {
        return (EnumC961110b7N) C08FF.LIZ(EnumC961110b7N.class, str);
    }

    public EnumC961110b7N(String str, int i) {
    }
}
