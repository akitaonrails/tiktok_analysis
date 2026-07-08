package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eM3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1085530eM3 {
    public static final EnumC1085530eM3 BOTTOM;
    public static final EnumC1085530eM3 CENTER;
    public static final /* synthetic */ EnumC1085530eM3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1085530eM3 TOP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1085530eM3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1085530eM3 enumC1085530eM3 = new EnumC1085530eM3("TOP", 0, "top");
        TOP = enumC1085530eM3;
        EnumC1085530eM3 enumC1085530eM32 = new EnumC1085530eM3("CENTER", 1, "center");
        CENTER = enumC1085530eM32;
        EnumC1085530eM3 enumC1085530eM33 = new EnumC1085530eM3("BOTTOM", 2, "bottom");
        BOTTOM = enumC1085530eM33;
        EnumC1085530eM3[] enumC1085530eM3Arr = {enumC1085530eM3, enumC1085530eM32, enumC1085530eM33};
        LLILLJJLI = enumC1085530eM3Arr;
        LLILLL = new C2254308sP(enumC1085530eM3Arr);
    }

    public static EnumC1085530eM3[] values() {
        return (EnumC1085530eM3[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1085530eM3 valueOf(String str) {
        return (EnumC1085530eM3) C08FF.LIZ(EnumC1085530eM3.class, str);
    }

    public EnumC1085530eM3(String str, int i, String str2) {
        this.LL = str2;
    }
}
