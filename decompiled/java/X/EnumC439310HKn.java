package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439310HKn {
    public static final /* synthetic */ EnumC439310HKn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC439310HKn METHOD_SHOOT;
    public static final EnumC439310HKn METHOD_UPLOAD;
    public static final EnumC439310HKn RETRY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC439310HKn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC439310HKn enumC439310HKn = new EnumC439310HKn("METHOD_SHOOT", 0, "manual_shoot");
        METHOD_SHOOT = enumC439310HKn;
        EnumC439310HKn enumC439310HKn2 = new EnumC439310HKn("METHOD_UPLOAD", 1, "upload_image");
        METHOD_UPLOAD = enumC439310HKn2;
        EnumC439310HKn enumC439310HKn3 = new EnumC439310HKn("RETRY", 2, "retry");
        RETRY = enumC439310HKn3;
        EnumC439310HKn[] enumC439310HKnArr = {enumC439310HKn, enumC439310HKn2, enumC439310HKn3};
        LLILLJJLI = enumC439310HKnArr;
        LLILLL = new C2254308sP(enumC439310HKnArr);
    }

    public static EnumC439310HKn[] values() {
        return (EnumC439310HKn[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC439310HKn valueOf(String str) {
        return (EnumC439310HKn) C08FF.LIZ(EnumC439310HKn.class, str);
    }

    public EnumC439310HKn(String str, int i, String str2) {
        this.LL = str2;
    }
}
