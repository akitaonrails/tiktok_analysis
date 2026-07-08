package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pa7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC647250Pa7 {
    public static final EnumC647250Pa7 GET;
    public static final /* synthetic */ EnumC647250Pa7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC647250Pa7 POST;
    public final String LL;

    public static InterfaceC2044707zh<EnumC647250Pa7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC647250Pa7 enumC647250Pa7 = new EnumC647250Pa7("GET", 0, "GET");
        GET = enumC647250Pa7;
        EnumC647250Pa7 enumC647250Pa72 = new EnumC647250Pa7("POST", 1, "POST");
        POST = enumC647250Pa72;
        EnumC647250Pa7[] enumC647250Pa7Arr = {enumC647250Pa7, enumC647250Pa72};
        LLILLJJLI = enumC647250Pa7Arr;
        LLILLL = new C2254308sP(enumC647250Pa7Arr);
    }

    public static EnumC647250Pa7[] values() {
        return (EnumC647250Pa7[]) LLILLJJLI.clone();
    }

    public final String getMethod() {
        return this.LL;
    }

    public static EnumC647250Pa7 valueOf(String str) {
        return (EnumC647250Pa7) C08FF.LIZ(EnumC647250Pa7.class, str);
    }

    public EnumC647250Pa7(String str, int i, String str2) {
        this.LL = str2;
    }
}
