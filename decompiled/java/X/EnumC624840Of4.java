package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Of4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC624840Of4 {
    public static final EnumC624840Of4 CANCEL_CELLULAR_DATA_DOWNLOAD;
    public static final EnumC624840Of4 CONTINUE_CELLULAR_DATA_DOWNLOAD;
    public static final /* synthetic */ EnumC624840Of4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC624840Of4 NOT_ENOUGH_SPACE;
    public static final EnumC624840Of4 NOT_WIFI;
    public static final EnumC624840Of4 NO_INTERNET_CONNECTION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC624840Of4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC624840Of4 enumC624840Of4 = new EnumC624840Of4("NOT_ENOUGH_SPACE", 0, "not_enough_space");
        NOT_ENOUGH_SPACE = enumC624840Of4;
        EnumC624840Of4 enumC624840Of42 = new EnumC624840Of4("NO_INTERNET_CONNECTION", 1, "no_internet_connection");
        NO_INTERNET_CONNECTION = enumC624840Of42;
        EnumC624840Of4 enumC624840Of43 = new EnumC624840Of4("CANCEL_CELLULAR_DATA_DOWNLOAD", 2, "cancel_cellular_data_download");
        CANCEL_CELLULAR_DATA_DOWNLOAD = enumC624840Of43;
        EnumC624840Of4 enumC624840Of44 = new EnumC624840Of4("NOT_WIFI", 3, "no_wifi");
        NOT_WIFI = enumC624840Of44;
        EnumC624840Of4 enumC624840Of45 = new EnumC624840Of4("CONTINUE_CELLULAR_DATA_DOWNLOAD", 4, "continue_cellular_data_download");
        CONTINUE_CELLULAR_DATA_DOWNLOAD = enumC624840Of45;
        EnumC624840Of4[] enumC624840Of4Arr = {enumC624840Of4, enumC624840Of42, enumC624840Of43, enumC624840Of44, enumC624840Of45};
        LLILLJJLI = enumC624840Of4Arr;
        LLILLL = new C2254308sP(enumC624840Of4Arr);
    }

    public static EnumC624840Of4[] values() {
        return (EnumC624840Of4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC624840Of4 valueOf(String str) {
        return (EnumC624840Of4) C08FF.LIZ(EnumC624840Of4.class, str);
    }

    public EnumC624840Of4(String str, int i, String str2) {
        this.LL = str2;
    }
}
