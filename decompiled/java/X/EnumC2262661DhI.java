package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1DhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class EnumC2262661DhI {
    public static final EnumC2262661DhI LL;
    public static final EnumC2262661DhI LLILLJJLI;
    public static final EnumC2262661DhI LLILLL;
    public static final EnumC2262661DhI LLILZ;
    public static final EnumC2262661DhI LLILZIL;
    public static final EnumC2262661DhI LLILZLL;
    public static final EnumC2262661DhI LLIZ;
    public static final /* synthetic */ EnumC2262661DhI[] LLIZLLLIL;

    static {
        EnumC2262661DhI enumC2262661DhI = new EnumC2262661DhI("STATE_IDLE", 0);
        LL = enumC2262661DhI;
        EnumC2262661DhI enumC2262661DhI2 = new EnumC2262661DhI("STATE_PREPARING", 1);
        EnumC2262661DhI enumC2262661DhI3 = new EnumC2262661DhI("STATE_PREPARED", 2);
        LLILLJJLI = enumC2262661DhI3;
        EnumC2262661DhI enumC2262661DhI4 = new EnumC2262661DhI("STATE_RUNNING", 3);
        LLILLL = enumC2262661DhI4;
        EnumC2262661DhI enumC2262661DhI5 = new EnumC2262661DhI("STATE_PAUSED", 4);
        LLILZ = enumC2262661DhI5;
        EnumC2262661DhI enumC2262661DhI6 = new EnumC2262661DhI("STATE_STOPPED", 5);
        LLILZIL = enumC2262661DhI6;
        EnumC2262661DhI enumC2262661DhI7 = new EnumC2262661DhI("STATE_RELEASED", 6);
        LLILZLL = enumC2262661DhI7;
        EnumC2262661DhI enumC2262661DhI8 = new EnumC2262661DhI("STATE_ERROR", 7);
        LLIZ = enumC2262661DhI8;
        EnumC2262661DhI[] enumC2262661DhIArr = {enumC2262661DhI, enumC2262661DhI2, enumC2262661DhI3, enumC2262661DhI4, enumC2262661DhI5, enumC2262661DhI6, enumC2262661DhI7, enumC2262661DhI8};
        LLIZLLLIL = enumC2262661DhIArr;
        new C2254308sP(enumC2262661DhIArr);
    }

    public static EnumC2262661DhI[] values() {
        return (EnumC2262661DhI[]) LLIZLLLIL.clone();
    }

    public static EnumC2262661DhI valueOf(String str) {
        return (EnumC2262661DhI) C08FF.LIZ(EnumC2262661DhI.class, str);
    }

    public EnumC2262661DhI(String str, int i) {
    }
}
