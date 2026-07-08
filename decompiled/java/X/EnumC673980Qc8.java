package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Qc8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC673980Qc8 {
    public static final EnumC673980Qc8 GUESS;
    public static final EnumC673980Qc8 HISTORY;
    public static final EnumC673980Qc8 HISTORY_REQUEST;
    public static final /* synthetic */ EnumC673980Qc8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC673980Qc8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC673980Qc8 enumC673980Qc8 = new EnumC673980Qc8("HISTORY", 0, "history");
        HISTORY = enumC673980Qc8;
        EnumC673980Qc8 enumC673980Qc82 = new EnumC673980Qc8("GUESS", 1, "guess");
        GUESS = enumC673980Qc82;
        EnumC673980Qc8 enumC673980Qc83 = new EnumC673980Qc8("HISTORY_REQUEST", 2, "history_request");
        HISTORY_REQUEST = enumC673980Qc83;
        EnumC673980Qc8[] enumC673980Qc8Arr = {enumC673980Qc8, enumC673980Qc82, enumC673980Qc83};
        LLILLJJLI = enumC673980Qc8Arr;
        LLILLL = new C2254308sP(enumC673980Qc8Arr);
    }

    public static EnumC673980Qc8[] values() {
        return (EnumC673980Qc8[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC673980Qc8 valueOf(String str) {
        return (EnumC673980Qc8) C08FF.LIZ(EnumC673980Qc8.class, str);
    }

    public EnumC673980Qc8(String str, int i, String str2) {
        this.LL = str2;
    }
}
