package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1780570wR5 {
    public static final EnumC1780570wR5 APPLE_PAY;
    public static final EnumC1780570wR5 GOOGLE_PAY;
    public static final /* synthetic */ EnumC1780570wR5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1780570wR5 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1780570wR5> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1780570wR5 enumC1780570wR5 = new EnumC1780570wR5("GOOGLE_PAY", 0, "gp");
        GOOGLE_PAY = enumC1780570wR5;
        EnumC1780570wR5 enumC1780570wR52 = new EnumC1780570wR5("APPLE_PAY", 1, "ap");
        APPLE_PAY = enumC1780570wR52;
        EnumC1780570wR5 enumC1780570wR53 = new EnumC1780570wR5("UNKNOWN", 2, "unknown");
        UNKNOWN = enumC1780570wR53;
        EnumC1780570wR5[] enumC1780570wR5Arr = {enumC1780570wR5, enumC1780570wR52, enumC1780570wR53};
        LLILLJJLI = enumC1780570wR5Arr;
        LLILLL = new C2254308sP(enumC1780570wR5Arr);
    }

    public static EnumC1780570wR5[] values() {
        return (EnumC1780570wR5[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1780570wR5 valueOf(String str) {
        return (EnumC1780570wR5) C08FF.LIZ(EnumC1780570wR5.class, str);
    }

    public EnumC1780570wR5(String str, int i, String str2) {
        this.LL = str2;
    }
}
