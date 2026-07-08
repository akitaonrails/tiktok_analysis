package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03fJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC899103fJ {
    public static final EnumC899103fJ ERROR;
    public static final /* synthetic */ EnumC899103fJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC899103fJ PENDING;
    public static final EnumC899103fJ REDIRECT;
    public static final EnumC899103fJ SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC899103fJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC899103fJ enumC899103fJ = new EnumC899103fJ("SUCCESS", 0, "success");
        SUCCESS = enumC899103fJ;
        EnumC899103fJ enumC899103fJ2 = new EnumC899103fJ("REDIRECT", 1, "redirect");
        REDIRECT = enumC899103fJ2;
        EnumC899103fJ enumC899103fJ3 = new EnumC899103fJ("ERROR", 2, "error");
        ERROR = enumC899103fJ3;
        EnumC899103fJ enumC899103fJ4 = new EnumC899103fJ("PENDING", 3, "pending");
        PENDING = enumC899103fJ4;
        EnumC899103fJ[] enumC899103fJArr = {enumC899103fJ, enumC899103fJ2, enumC899103fJ3, enumC899103fJ4};
        LLILLJJLI = enumC899103fJArr;
        LLILLL = new C2254308sP(enumC899103fJArr);
    }

    public static EnumC899103fJ[] values() {
        return (EnumC899103fJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC899103fJ valueOf(String str) {
        return (EnumC899103fJ) C08FF.LIZ(EnumC899103fJ.class, str);
    }

    public EnumC899103fJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
