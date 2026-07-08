package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC461630I8j {
    public static final EnumC461630I8j ALL_VISIBLE;
    public static final EnumC461630I8j DELETE;
    public static final EnumC461630I8j FOLD;
    public static final EnumC461630I8j FRIEND_VISIBLE;
    public static final /* synthetic */ EnumC461630I8j[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC461630I8j MUTUAL_FRIEND_VISIBLE;
    public static final EnumC461630I8j PUBLISH;
    public static final EnumC461630I8j SELF_VISIBLE;
    public static final EnumC461630I8j UNKNOWN;
    public static final EnumC461630I8j UNPROCESSED;
    public final int LL;

    public static InterfaceC2044707zh<EnumC461630I8j> getEntries() {
        return LLILLL;
    }

    static {
        EnumC461630I8j enumC461630I8j = new EnumC461630I8j("UNKNOWN", 0, -1);
        UNKNOWN = enumC461630I8j;
        EnumC461630I8j enumC461630I8j2 = new EnumC461630I8j("DELETE", 1, 0);
        DELETE = enumC461630I8j2;
        EnumC461630I8j enumC461630I8j3 = new EnumC461630I8j("ALL_VISIBLE", 2, 1);
        ALL_VISIBLE = enumC461630I8j3;
        EnumC461630I8j enumC461630I8j4 = new EnumC461630I8j("SELF_VISIBLE", 3, 2);
        SELF_VISIBLE = enumC461630I8j4;
        EnumC461630I8j enumC461630I8j5 = new EnumC461630I8j("FRIEND_VISIBLE", 4, 3);
        FRIEND_VISIBLE = enumC461630I8j5;
        EnumC461630I8j enumC461630I8j6 = new EnumC461630I8j("PUBLISH", 5, 4);
        PUBLISH = enumC461630I8j6;
        EnumC461630I8j enumC461630I8j7 = new EnumC461630I8j("UNPROCESSED", 6, 7);
        UNPROCESSED = enumC461630I8j7;
        EnumC461630I8j enumC461630I8j8 = new EnumC461630I8j("MUTUAL_FRIEND_VISIBLE", 7, 10);
        MUTUAL_FRIEND_VISIBLE = enumC461630I8j8;
        EnumC461630I8j enumC461630I8j9 = new EnumC461630I8j("FOLD", 8, 11);
        FOLD = enumC461630I8j9;
        EnumC461630I8j[] enumC461630I8jArr = {enumC461630I8j, enumC461630I8j2, enumC461630I8j3, enumC461630I8j4, enumC461630I8j5, enumC461630I8j6, enumC461630I8j7, enumC461630I8j8, enumC461630I8j9};
        LLILLJJLI = enumC461630I8jArr;
        LLILLL = new C2254308sP(enumC461630I8jArr);
    }

    public static EnumC461630I8j[] values() {
        return (EnumC461630I8j[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC461630I8j valueOf(String str) {
        return (EnumC461630I8j) C08FF.LIZ(EnumC461630I8j.class, str);
    }

    public EnumC461630I8j(String str, int i, int i2) {
        this.LL = i2;
    }
}
