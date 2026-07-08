package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0jaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1286590jaL {
    public static final EnumC1286590jaL BAD;
    public static final EnumC1286590jaL DOWN;
    public static final EnumC1286590jaL EXCELLENT;
    public static final EnumC1286590jaL GOOD;
    public static final /* synthetic */ EnumC1286590jaL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1286590jaL POOR;
    public static final EnumC1286590jaL UNDEFINED;
    public static final EnumC1286590jaL VBAD;

    public static InterfaceC2044707zh<EnumC1286590jaL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1286590jaL enumC1286590jaL = new EnumC1286590jaL("UNDEFINED", 0);
        UNDEFINED = enumC1286590jaL;
        EnumC1286590jaL enumC1286590jaL2 = new EnumC1286590jaL("EXCELLENT", 1);
        EXCELLENT = enumC1286590jaL2;
        EnumC1286590jaL enumC1286590jaL3 = new EnumC1286590jaL("GOOD", 2);
        GOOD = enumC1286590jaL3;
        EnumC1286590jaL enumC1286590jaL4 = new EnumC1286590jaL("POOR", 3);
        POOR = enumC1286590jaL4;
        EnumC1286590jaL enumC1286590jaL5 = new EnumC1286590jaL("BAD", 4);
        BAD = enumC1286590jaL5;
        EnumC1286590jaL enumC1286590jaL6 = new EnumC1286590jaL("VBAD", 5);
        VBAD = enumC1286590jaL6;
        EnumC1286590jaL enumC1286590jaL7 = new EnumC1286590jaL("DOWN", 6);
        DOWN = enumC1286590jaL7;
        EnumC1286590jaL[] enumC1286590jaLArr = {enumC1286590jaL, enumC1286590jaL2, enumC1286590jaL3, enumC1286590jaL4, enumC1286590jaL5, enumC1286590jaL6, enumC1286590jaL7};
        LL = enumC1286590jaLArr;
        LLILLJJLI = new C2254308sP(enumC1286590jaLArr);
    }

    public static EnumC1286590jaL[] values() {
        return (EnumC1286590jaL[]) LL.clone();
    }

    public static EnumC1286590jaL valueOf(String str) {
        return (EnumC1286590jaL) C08FF.LIZ(EnumC1286590jaL.class, str);
    }

    public EnumC1286590jaL(String str, int i) {
    }
}
