package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mQ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1395590mQ9 {
    public static final EnumC1395590mQ9 AUTH_KEY;
    public static final EnumC1395590mQ9 CREATE_REPORT;
    public static final /* synthetic */ EnumC1395590mQ9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1395590mQ9 OPEN_TNS;
    public static final EnumC1395590mQ9 SCREENSHOT;
    public static final EnumC1395590mQ9 START;
    public static final EnumC1395590mQ9 UPDATE_REPORT;
    public static final EnumC1395590mQ9 UPLOAD_IMAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1395590mQ9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1395590mQ9 enumC1395590mQ9 = new EnumC1395590mQ9("START", 0, "start");
        START = enumC1395590mQ9;
        EnumC1395590mQ9 enumC1395590mQ92 = new EnumC1395590mQ9("CREATE_REPORT", 1, "create_report");
        CREATE_REPORT = enumC1395590mQ92;
        EnumC1395590mQ9 enumC1395590mQ93 = new EnumC1395590mQ9("OPEN_TNS", 2, "open_tns");
        OPEN_TNS = enumC1395590mQ93;
        EnumC1395590mQ9 enumC1395590mQ94 = new EnumC1395590mQ9("SCREENSHOT", 3, "screenshot");
        SCREENSHOT = enumC1395590mQ94;
        EnumC1395590mQ9 enumC1395590mQ95 = new EnumC1395590mQ9("AUTH_KEY", 4, "auth_key");
        AUTH_KEY = enumC1395590mQ95;
        EnumC1395590mQ9 enumC1395590mQ96 = new EnumC1395590mQ9("UPLOAD_IMAGE", 5, "upload_image");
        UPLOAD_IMAGE = enumC1395590mQ96;
        EnumC1395590mQ9 enumC1395590mQ97 = new EnumC1395590mQ9("UPDATE_REPORT", 6, "update_report");
        UPDATE_REPORT = enumC1395590mQ97;
        EnumC1395590mQ9[] enumC1395590mQ9Arr = {enumC1395590mQ9, enumC1395590mQ92, enumC1395590mQ93, enumC1395590mQ94, enumC1395590mQ95, enumC1395590mQ96, enumC1395590mQ97};
        LLILLJJLI = enumC1395590mQ9Arr;
        LLILLL = new C2254308sP(enumC1395590mQ9Arr);
    }

    public static EnumC1395590mQ9[] values() {
        return (EnumC1395590mQ9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1395590mQ9 valueOf(String str) {
        return (EnumC1395590mQ9) C08FF.LIZ(EnumC1395590mQ9.class, str);
    }

    public EnumC1395590mQ9(String str, int i, String str2) {
        this.LL = str2;
    }
}
