package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC372730EjP {
    public static final EnumC372730EjP FIXED;
    public static final /* synthetic */ EnumC372730EjP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC372730EjP NO_VARIABLE;
    public static final EnumC372730EjP VARIABLE;

    public static InterfaceC2044707zh<EnumC372730EjP> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC372730EjP enumC372730EjP = new EnumC372730EjP("FIXED", 0);
        FIXED = enumC372730EjP;
        EnumC372730EjP enumC372730EjP2 = new EnumC372730EjP("VARIABLE", 1);
        VARIABLE = enumC372730EjP2;
        EnumC372730EjP enumC372730EjP3 = new EnumC372730EjP("NO_VARIABLE", 2);
        NO_VARIABLE = enumC372730EjP3;
        EnumC372730EjP[] enumC372730EjPArr = {enumC372730EjP, enumC372730EjP2, enumC372730EjP3};
        LL = enumC372730EjPArr;
        LLILLJJLI = new C2254308sP(enumC372730EjPArr);
    }

    public static EnumC372730EjP[] values() {
        return (EnumC372730EjP[]) LL.clone();
    }

    public final boolean needGrabber$tools_creative_ui_release() {
        return this == VARIABLE;
    }

    public static EnumC372730EjP valueOf(String str) {
        return (EnumC372730EjP) C08FF.LIZ(EnumC372730EjP.class, str);
    }

    public EnumC372730EjP(String str, int i) {
    }
}
