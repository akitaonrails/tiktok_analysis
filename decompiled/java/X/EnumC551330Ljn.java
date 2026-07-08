package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ljn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC551330Ljn {
    public static final EnumC551330Ljn AUTO_SELECT;
    public static final EnumC551330Ljn KEEP_ORIGINAL;
    public static final /* synthetic */ EnumC551330Ljn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC551330Ljn MANUAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC551330Ljn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC551330Ljn enumC551330Ljn = new EnumC551330Ljn("AUTO_SELECT", 0, "auto_select");
        AUTO_SELECT = enumC551330Ljn;
        EnumC551330Ljn enumC551330Ljn2 = new EnumC551330Ljn("MANUAL", 1, "manual");
        MANUAL = enumC551330Ljn2;
        EnumC551330Ljn enumC551330Ljn3 = new EnumC551330Ljn("KEEP_ORIGINAL", 2, "keep_original");
        KEEP_ORIGINAL = enumC551330Ljn3;
        EnumC551330Ljn[] enumC551330LjnArr = {enumC551330Ljn, enumC551330Ljn2, enumC551330Ljn3};
        LLILLJJLI = enumC551330LjnArr;
        LLILLL = new C2254308sP(enumC551330LjnArr);
    }

    public static EnumC551330Ljn[] values() {
        return (EnumC551330Ljn[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static EnumC551330Ljn valueOf(String str) {
        return (EnumC551330Ljn) C08FF.LIZ(EnumC551330Ljn.class, str);
    }

    public EnumC551330Ljn(String str, int i, String str2) {
        this.LL = str2;
    }
}
