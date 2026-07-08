package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC939370aYJ {
    public static final EnumC939370aYJ BOTTOM_EXTERNAL;
    public static final EnumC939370aYJ LEFT_EXTERNAL;
    public static final /* synthetic */ EnumC939370aYJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC939370aYJ RIGHT_INTERNAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC939370aYJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC939370aYJ enumC939370aYJ = new EnumC939370aYJ("BOTTOM_EXTERNAL", 0, "bottom_external");
        BOTTOM_EXTERNAL = enumC939370aYJ;
        EnumC939370aYJ enumC939370aYJ2 = new EnumC939370aYJ("RIGHT_INTERNAL", 1, "right_internal");
        RIGHT_INTERNAL = enumC939370aYJ2;
        EnumC939370aYJ enumC939370aYJ3 = new EnumC939370aYJ("LEFT_EXTERNAL", 2, "left_external");
        LEFT_EXTERNAL = enumC939370aYJ3;
        EnumC939370aYJ[] enumC939370aYJArr = {enumC939370aYJ, enumC939370aYJ2, enumC939370aYJ3};
        LLILLJJLI = enumC939370aYJArr;
        LLILLL = new C2254308sP(enumC939370aYJArr);
    }

    public static EnumC939370aYJ[] values() {
        return (EnumC939370aYJ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC939370aYJ valueOf(String str) {
        return (EnumC939370aYJ) C08FF.LIZ(EnumC939370aYJ.class, str);
    }

    public EnumC939370aYJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
