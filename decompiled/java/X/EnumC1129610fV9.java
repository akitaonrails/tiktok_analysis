package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fV9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1129610fV9 {
    public static final EnumC1129610fV9 LL;
    public static final EnumC1129610fV9 LLILLJJLI;
    public static final EnumC1129610fV9 LLILLL;
    public static final EnumC1129610fV9 LLILZ;
    public static final /* synthetic */ EnumC1129610fV9[] LLILZIL;

    static {
        EnumC1129610fV9 enumC1129610fV9 = new EnumC1129610fV9("NONE", 0);
        LL = enumC1129610fV9;
        EnumC1129610fV9 enumC1129610fV92 = new EnumC1129610fV9("EMPTY", 1);
        LLILLJJLI = enumC1129610fV92;
        EnumC1129610fV9 enumC1129610fV93 = new EnumC1129610fV9("DISPLAY_FREQ", 2);
        LLILLL = enumC1129610fV93;
        EnumC1129610fV9 enumC1129610fV94 = new EnumC1129610fV9("DISPLAY_FAV", 3);
        LLILZ = enumC1129610fV94;
        EnumC1129610fV9[] enumC1129610fV9Arr = {enumC1129610fV9, enumC1129610fV92, enumC1129610fV93, enumC1129610fV94};
        LLILZIL = enumC1129610fV9Arr;
        new C2254308sP(enumC1129610fV9Arr);
    }

    public static EnumC1129610fV9[] values() {
        return (EnumC1129610fV9[]) LLILZIL.clone();
    }

    public static EnumC1129610fV9 valueOf(String str) {
        return (EnumC1129610fV9) C08FF.LIZ(EnumC1129610fV9.class, str);
    }

    public EnumC1129610fV9(String str, int i) {
    }
}
