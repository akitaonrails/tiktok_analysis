package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993330bxL {
    public static final EnumC993330bxL BG_LOW_MEMORY;
    public static final EnumC993330bxL BG_PUSH_ANR;
    public static final EnumC993330bxL FORE_LOW_MEMORY;
    public static final EnumC993330bxL FORE_SIGNALED;
    public static final /* synthetic */ EnumC993330bxL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC993330bxL UNKNOWN;

    public static InterfaceC2044707zh<EnumC993330bxL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC993330bxL enumC993330bxL = new EnumC993330bxL("FORE_LOW_MEMORY", 0);
        FORE_LOW_MEMORY = enumC993330bxL;
        EnumC993330bxL enumC993330bxL2 = new EnumC993330bxL("FORE_SIGNALED", 1);
        FORE_SIGNALED = enumC993330bxL2;
        EnumC993330bxL enumC993330bxL3 = new EnumC993330bxL("BG_LOW_MEMORY", 2);
        BG_LOW_MEMORY = enumC993330bxL3;
        EnumC993330bxL enumC993330bxL4 = new EnumC993330bxL("BG_PUSH_ANR", 3);
        BG_PUSH_ANR = enumC993330bxL4;
        EnumC993330bxL enumC993330bxL5 = new EnumC993330bxL("UNKNOWN", 4);
        UNKNOWN = enumC993330bxL5;
        EnumC993330bxL[] enumC993330bxLArr = {enumC993330bxL, enumC993330bxL2, enumC993330bxL3, enumC993330bxL4, enumC993330bxL5};
        LL = enumC993330bxLArr;
        LLILLJJLI = new C2254308sP(enumC993330bxLArr);
    }

    public static EnumC993330bxL[] values() {
        return (EnumC993330bxL[]) LL.clone();
    }

    public static EnumC993330bxL valueOf(String str) {
        return (EnumC993330bxL) C08FF.LIZ(EnumC993330bxL.class, str);
    }

    public EnumC993330bxL(String str, int i) {
    }
}
