package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OUd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC620170OUd {
    public static final EnumC620170OUd FAIL;
    public static final /* synthetic */ EnumC620170OUd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC620170OUd SUCCESS;
    public static final EnumC620170OUd UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC620170OUd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC620170OUd enumC620170OUd = new EnumC620170OUd("SUCCESS", 0, "Success");
        SUCCESS = enumC620170OUd;
        EnumC620170OUd enumC620170OUd2 = new EnumC620170OUd("FAIL", 1, "Fail");
        FAIL = enumC620170OUd2;
        EnumC620170OUd enumC620170OUd3 = new EnumC620170OUd("UNKNOWN", 2, "Unknown");
        UNKNOWN = enumC620170OUd3;
        EnumC620170OUd[] enumC620170OUdArr = {enumC620170OUd, enumC620170OUd2, enumC620170OUd3};
        LLILLJJLI = enumC620170OUdArr;
        LLILLL = new C2254308sP(enumC620170OUdArr);
    }

    public static EnumC620170OUd[] values() {
        return (EnumC620170OUd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC620170OUd valueOf(String str) {
        return (EnumC620170OUd) C08FF.LIZ(EnumC620170OUd.class, str);
    }

    public EnumC620170OUd(String str, int i, String str2) {
        this.LL = str2;
    }
}
