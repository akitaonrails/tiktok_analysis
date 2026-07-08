package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0W8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC818290W8d {
    public static final EnumC818290W8d DEBUG;
    public static final EnumC818290W8d ERROR;
    public static final EnumC818290W8d INFO;
    public static final /* synthetic */ EnumC818290W8d[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC818290W8d WARNING;

    public static InterfaceC2044707zh<EnumC818290W8d> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC818290W8d enumC818290W8d = new EnumC818290W8d("INFO", 0);
        INFO = enumC818290W8d;
        EnumC818290W8d enumC818290W8d2 = new EnumC818290W8d("DEBUG", 1);
        DEBUG = enumC818290W8d2;
        EnumC818290W8d enumC818290W8d3 = new EnumC818290W8d("WARNING", 2);
        WARNING = enumC818290W8d3;
        EnumC818290W8d enumC818290W8d4 = new EnumC818290W8d("ERROR", 3);
        ERROR = enumC818290W8d4;
        EnumC818290W8d[] enumC818290W8dArr = {enumC818290W8d, enumC818290W8d2, enumC818290W8d3, enumC818290W8d4};
        LL = enumC818290W8dArr;
        LLILLJJLI = new C2254308sP(enumC818290W8dArr);
    }

    public static EnumC818290W8d[] values() {
        return (EnumC818290W8d[]) LL.clone();
    }

    public static EnumC818290W8d valueOf(String str) {
        return (EnumC818290W8d) C08FF.LIZ(EnumC818290W8d.class, str);
    }

    public EnumC818290W8d(String str, int i) {
    }
}
