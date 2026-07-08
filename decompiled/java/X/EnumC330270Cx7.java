package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC330270Cx7 {
    public static final EnumC330270Cx7 LL;
    public static final EnumC330270Cx7 LLILLJJLI;
    public static final EnumC330270Cx7 LLILLL;
    public static final EnumC330270Cx7 LLILZ;
    public static final EnumC330270Cx7 LLILZIL;
    public static final /* synthetic */ EnumC330270Cx7[] LLILZLL;

    static {
        EnumC330270Cx7 enumC330270Cx7 = new EnumC330270Cx7("IDLE", 0);
        LL = enumC330270Cx7;
        EnumC330270Cx7 enumC330270Cx72 = new EnumC330270Cx7("FAIL", 1);
        LLILLJJLI = enumC330270Cx72;
        EnumC330270Cx7 enumC330270Cx73 = new EnumC330270Cx7("LOADING", 2);
        LLILLL = enumC330270Cx73;
        EnumC330270Cx7 enumC330270Cx74 = new EnumC330270Cx7("HAS_RESULT", 3);
        LLILZ = enumC330270Cx74;
        EnumC330270Cx7 enumC330270Cx75 = new EnumC330270Cx7("NO_RESULT", 4);
        LLILZIL = enumC330270Cx75;
        EnumC330270Cx7[] enumC330270Cx7Arr = {enumC330270Cx7, enumC330270Cx72, enumC330270Cx73, enumC330270Cx74, enumC330270Cx75};
        LLILZLL = enumC330270Cx7Arr;
        new C2254308sP(enumC330270Cx7Arr);
    }

    public static EnumC330270Cx7[] values() {
        return (EnumC330270Cx7[]) LLILZLL.clone();
    }

    public static EnumC330270Cx7 valueOf(String str) {
        return (EnumC330270Cx7) C08FF.LIZ(EnumC330270Cx7.class, str);
    }

    public EnumC330270Cx7(String str, int i) {
    }
}
