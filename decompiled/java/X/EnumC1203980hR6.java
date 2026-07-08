package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hR6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1203980hR6 {
    public static final /* synthetic */ EnumC1203980hR6[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1203980hR6 REFRESH_END;
    public static final EnumC1203980hR6 REQUEST_FAIL;
    public static final EnumC1203980hR6 REQUEST_START;
    public static final EnumC1203980hR6 REQUEST_SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1203980hR6> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1203980hR6 enumC1203980hR6 = new EnumC1203980hR6("REQUEST_START", 0, "request_start");
        REQUEST_START = enumC1203980hR6;
        EnumC1203980hR6 enumC1203980hR62 = new EnumC1203980hR6("REQUEST_SUCCESS", 1, "request_success");
        REQUEST_SUCCESS = enumC1203980hR62;
        EnumC1203980hR6 enumC1203980hR63 = new EnumC1203980hR6("REQUEST_FAIL", 2, "request_fail");
        REQUEST_FAIL = enumC1203980hR63;
        EnumC1203980hR6 enumC1203980hR64 = new EnumC1203980hR6("REFRESH_END", 3, "refresh_end");
        REFRESH_END = enumC1203980hR64;
        EnumC1203980hR6[] enumC1203980hR6Arr = {enumC1203980hR6, enumC1203980hR62, enumC1203980hR63, enumC1203980hR64};
        LLILLJJLI = enumC1203980hR6Arr;
        LLILLL = new C2254308sP(enumC1203980hR6Arr);
    }

    public static EnumC1203980hR6[] values() {
        return (EnumC1203980hR6[]) LLILLJJLI.clone();
    }

    public final String getStr() {
        return this.LL;
    }

    public static EnumC1203980hR6 valueOf(String str) {
        return (EnumC1203980hR6) C08FF.LIZ(EnumC1203980hR6.class, str);
    }

    public EnumC1203980hR6(String str, int i, String str2) {
        this.LL = str2;
    }
}
