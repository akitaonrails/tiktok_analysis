package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC939380aYK {
    public static final EnumC939380aYK BOTTOM_EXTERNAL;
    public static final EnumC939380aYK LEFT_EXTERNAL;
    public static final /* synthetic */ EnumC939380aYK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC939380aYK RIGHT_INTERNAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC939380aYK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC939380aYK enumC939380aYK = new EnumC939380aYK("BOTTOM_EXTERNAL", 0, "bottom_external");
        BOTTOM_EXTERNAL = enumC939380aYK;
        EnumC939380aYK enumC939380aYK2 = new EnumC939380aYK("RIGHT_INTERNAL", 1, "right_internal");
        RIGHT_INTERNAL = enumC939380aYK2;
        EnumC939380aYK enumC939380aYK3 = new EnumC939380aYK("LEFT_EXTERNAL", 2, "left_external");
        LEFT_EXTERNAL = enumC939380aYK3;
        EnumC939380aYK[] enumC939380aYKArr = {enumC939380aYK, enumC939380aYK2, enumC939380aYK3};
        LLILLJJLI = enumC939380aYKArr;
        LLILLL = new C2254308sP(enumC939380aYKArr);
    }

    public static EnumC939380aYK[] values() {
        return (EnumC939380aYK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC939380aYK valueOf(String str) {
        return (EnumC939380aYK) C08FF.LIZ(EnumC939380aYK.class, str);
    }

    public EnumC939380aYK(String str, int i, String str2) {
        this.LL = str2;
    }
}
