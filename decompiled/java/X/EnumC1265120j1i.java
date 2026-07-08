package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0j1i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1265120j1i {
    public static final EnumC1265120j1i API_ERROR;
    public static final EnumC1265120j1i EMPTY;
    public static final EnumC1265120j1i INACCESSIBLE;
    public static final /* synthetic */ EnumC1265120j1i[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1265120j1i NETWORK_ERROR;
    public static final EnumC1265120j1i SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1265120j1i> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1265120j1i enumC1265120j1i = new EnumC1265120j1i("SUCCESS", 0, "success");
        SUCCESS = enumC1265120j1i;
        EnumC1265120j1i enumC1265120j1i2 = new EnumC1265120j1i("EMPTY", 1, "empty");
        EMPTY = enumC1265120j1i2;
        EnumC1265120j1i enumC1265120j1i3 = new EnumC1265120j1i("INACCESSIBLE", 2, "inaccessible");
        INACCESSIBLE = enumC1265120j1i3;
        EnumC1265120j1i enumC1265120j1i4 = new EnumC1265120j1i("API_ERROR", 3, "api_error");
        API_ERROR = enumC1265120j1i4;
        EnumC1265120j1i enumC1265120j1i5 = new EnumC1265120j1i("NETWORK_ERROR", 4, "network_error");
        NETWORK_ERROR = enumC1265120j1i5;
        EnumC1265120j1i[] enumC1265120j1iArr = {enumC1265120j1i, enumC1265120j1i2, enumC1265120j1i3, enumC1265120j1i4, enumC1265120j1i5};
        LLILLJJLI = enumC1265120j1iArr;
        LLILLL = new C2254308sP(enumC1265120j1iArr);
    }

    public static EnumC1265120j1i[] values() {
        return (EnumC1265120j1i[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1265120j1i valueOf(String str) {
        return (EnumC1265120j1i) C08FF.LIZ(EnumC1265120j1i.class, str);
    }

    public EnumC1265120j1i(String str, int i, String str2) {
        this.LL = str2;
    }
}
