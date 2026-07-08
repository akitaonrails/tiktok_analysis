package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zHD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1889770zHD {
    public static final EnumC1889770zHD EMPTY;
    public static final EnumC1889770zHD FAIL;
    public static final /* synthetic */ EnumC1889770zHD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1889770zHD NO_NEED_SHOW;
    public static final EnumC1889770zHD SUCCESS;
    public static final EnumC1889770zHD UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1889770zHD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1889770zHD enumC1889770zHD = new EnumC1889770zHD("UNKNOWN", 0, "Unknown");
        UNKNOWN = enumC1889770zHD;
        EnumC1889770zHD enumC1889770zHD2 = new EnumC1889770zHD("SUCCESS", 1, "Success");
        SUCCESS = enumC1889770zHD2;
        EnumC1889770zHD enumC1889770zHD3 = new EnumC1889770zHD("FAIL", 2, "Fail");
        FAIL = enumC1889770zHD3;
        EnumC1889770zHD enumC1889770zHD4 = new EnumC1889770zHD("EMPTY", 3, "Empty");
        EMPTY = enumC1889770zHD4;
        EnumC1889770zHD enumC1889770zHD5 = new EnumC1889770zHD("NO_NEED_SHOW", 4, "Unnecessary");
        NO_NEED_SHOW = enumC1889770zHD5;
        EnumC1889770zHD[] enumC1889770zHDArr = {enumC1889770zHD, enumC1889770zHD2, enumC1889770zHD3, enumC1889770zHD4, enumC1889770zHD5};
        LLILLJJLI = enumC1889770zHDArr;
        LLILLL = new C2254308sP(enumC1889770zHDArr);
    }

    public static EnumC1889770zHD[] values() {
        return (EnumC1889770zHD[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1889770zHD valueOf(String str) {
        return (EnumC1889770zHD) C08FF.LIZ(EnumC1889770zHD.class, str);
    }

    public EnumC1889770zHD(String str, int i, String str2) {
        this.LL = str2;
    }
}
