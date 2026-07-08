package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC683940QsC {
    public static final EnumC683940QsC BTM_CODE_NULL;
    public static final EnumC683940QsC FRAGMENT_NULL;
    public static final /* synthetic */ EnumC683940QsC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC683940QsC VIEW_NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC683940QsC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC683940QsC enumC683940QsC = new EnumC683940QsC("FRAGMENT_NULL", 0, "fragment_null");
        FRAGMENT_NULL = enumC683940QsC;
        EnumC683940QsC enumC683940QsC2 = new EnumC683940QsC("VIEW_NULL", 1, "view_null");
        VIEW_NULL = enumC683940QsC2;
        EnumC683940QsC enumC683940QsC3 = new EnumC683940QsC("BTM_CODE_NULL", 2, "btm_code_null");
        BTM_CODE_NULL = enumC683940QsC3;
        EnumC683940QsC[] enumC683940QsCArr = {enumC683940QsC, enumC683940QsC2, enumC683940QsC3};
        LLILLJJLI = enumC683940QsCArr;
        LLILLL = new C2254308sP(enumC683940QsCArr);
    }

    public static EnumC683940QsC[] values() {
        return (EnumC683940QsC[]) LLILLJJLI.clone();
    }

    public final String getMsg() {
        return this.LL;
    }

    public static EnumC683940QsC valueOf(String str) {
        return (EnumC683940QsC) C08FF.LIZ(EnumC683940QsC.class, str);
    }

    public EnumC683940QsC(String str, int i, String str2) {
        this.LL = str2;
    }
}
