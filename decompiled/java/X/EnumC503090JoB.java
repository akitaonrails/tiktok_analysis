package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC503090JoB {
    public static final /* synthetic */ EnumC503090JoB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC503090JoB POLL;
    public static final EnumC503090JoB SUB_VIDEO;
    public static final EnumC503090JoB TEXT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC503090JoB> getEntries() {
        return LLILLL;
    }

    static {
        EnumC503090JoB enumC503090JoB = new EnumC503090JoB("TEXT", 0, 0);
        TEXT = enumC503090JoB;
        EnumC503090JoB enumC503090JoB2 = new EnumC503090JoB("POLL", 1, 1);
        POLL = enumC503090JoB2;
        EnumC503090JoB enumC503090JoB3 = new EnumC503090JoB("SUB_VIDEO", 2, 2);
        SUB_VIDEO = enumC503090JoB3;
        EnumC503090JoB[] enumC503090JoBArr = {enumC503090JoB, enumC503090JoB2, enumC503090JoB3};
        LLILLJJLI = enumC503090JoBArr;
        LLILLL = new C2254308sP(enumC503090JoBArr);
    }

    public static EnumC503090JoB[] values() {
        return (EnumC503090JoB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC503090JoB valueOf(String str) {
        return (EnumC503090JoB) C08FF.LIZ(EnumC503090JoB.class, str);
    }

    public EnumC503090JoB(String str, int i, int i2) {
        this.LL = i2;
    }
}
