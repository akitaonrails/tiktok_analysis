package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.082d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC20521082d {
    public static final EnumC20521082d FALSE;
    public static final /* synthetic */ EnumC20521082d[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20521082d TRUE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20521082d> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20521082d enumC20521082d = new EnumC20521082d("FALSE", 0, "false");
        FALSE = enumC20521082d;
        EnumC20521082d enumC20521082d2 = new EnumC20521082d("TRUE", 1, "true");
        TRUE = enumC20521082d2;
        EnumC20521082d[] enumC20521082dArr = {enumC20521082d, enumC20521082d2};
        LLILLJJLI = enumC20521082dArr;
        LLILLL = new C2254308sP(enumC20521082dArr);
    }

    public static EnumC20521082d[] values() {
        return (EnumC20521082d[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20521082d valueOf(String str) {
        return (EnumC20521082d) C08FF.LIZ(EnumC20521082d.class, str);
    }

    public EnumC20521082d(String str, int i, String str2) {
        this.LL = str2;
    }
}
