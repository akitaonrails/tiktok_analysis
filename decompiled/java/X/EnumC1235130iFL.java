package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235130iFL {
    public static final EnumC1235130iFL CHANGE;
    public static final /* synthetic */ EnumC1235130iFL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235130iFL UNLINK;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235130iFL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235130iFL enumC1235130iFL = new EnumC1235130iFL("CHANGE", 0, "change");
        CHANGE = enumC1235130iFL;
        EnumC1235130iFL enumC1235130iFL2 = new EnumC1235130iFL("UNLINK", 1, "unlink");
        UNLINK = enumC1235130iFL2;
        EnumC1235130iFL[] enumC1235130iFLArr = {enumC1235130iFL, enumC1235130iFL2};
        LLILLJJLI = enumC1235130iFLArr;
        LLILLL = new C2254308sP(enumC1235130iFLArr);
    }

    public static EnumC1235130iFL[] values() {
        return (EnumC1235130iFL[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235130iFL valueOf(String str) {
        return (EnumC1235130iFL) C08FF.LIZ(EnumC1235130iFL.class, str);
    }

    public EnumC1235130iFL(String str, int i, String str2) {
        this.LL = str2;
    }
}
