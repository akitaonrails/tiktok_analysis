package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC330310CxB {
    public static final EnumC330310CxB FAIL;
    public static final /* synthetic */ EnumC330310CxB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC330310CxB SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC330310CxB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC330310CxB enumC330310CxB = new EnumC330310CxB("SUCCESS", 0, "success");
        SUCCESS = enumC330310CxB;
        EnumC330310CxB enumC330310CxB2 = new EnumC330310CxB("FAIL", 1, "fail");
        FAIL = enumC330310CxB2;
        EnumC330310CxB[] enumC330310CxBArr = {enumC330310CxB, enumC330310CxB2};
        LLILLJJLI = enumC330310CxBArr;
        LLILLL = new C2254308sP(enumC330310CxBArr);
    }

    public static EnumC330310CxB[] values() {
        return (EnumC330310CxB[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static EnumC330310CxB valueOf(String str) {
        return (EnumC330310CxB) C08FF.LIZ(EnumC330310CxB.class, str);
    }

    public EnumC330310CxB(String str, int i, String str2) {
        this.LL = str2;
    }
}
