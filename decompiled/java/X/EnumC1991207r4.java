package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07r4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1991207r4 {
    public static final EnumC1991207r4 IMAGE_ANCHOR;
    public static final /* synthetic */ EnumC1991207r4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1991207r4 TEXT_ANCHOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1991207r4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1991207r4 enumC1991207r4 = new EnumC1991207r4("TEXT_ANCHOR", 0, "1");
        TEXT_ANCHOR = enumC1991207r4;
        EnumC1991207r4 enumC1991207r42 = new EnumC1991207r4("IMAGE_ANCHOR", 1, "2");
        IMAGE_ANCHOR = enumC1991207r42;
        EnumC1991207r4[] enumC1991207r4Arr = {enumC1991207r4, enumC1991207r42};
        LLILLJJLI = enumC1991207r4Arr;
        LLILLL = new C2254308sP(enumC1991207r4Arr);
    }

    public static EnumC1991207r4[] values() {
        return (EnumC1991207r4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1991207r4 valueOf(String str) {
        return (EnumC1991207r4) C08FF.LIZ(EnumC1991207r4.class, str);
    }

    public EnumC1991207r4(String str, int i, String str2) {
        this.LL = str2;
    }
}
