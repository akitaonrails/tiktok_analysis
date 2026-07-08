package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18dB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC21327118dB {
    public static final EnumC21327118dB LL;
    public static final EnumC21327118dB LLILLJJLI;
    public static final EnumC21327118dB LLILLL;
    public static final EnumC21327118dB LLILZ;
    public static final EnumC21327118dB LLILZIL;
    public static final /* synthetic */ EnumC21327118dB[] LLILZLL;

    static {
        EnumC21327118dB enumC21327118dB = new EnumC21327118dB("INIT", 0);
        LL = enumC21327118dB;
        EnumC21327118dB enumC21327118dB2 = new EnumC21327118dB("LOADING", 1);
        LLILLJJLI = enumC21327118dB2;
        EnumC21327118dB enumC21327118dB3 = new EnumC21327118dB("READY", 2);
        LLILLL = enumC21327118dB3;
        EnumC21327118dB enumC21327118dB4 = new EnumC21327118dB("LOADED", 3);
        LLILZ = enumC21327118dB4;
        EnumC21327118dB enumC21327118dB5 = new EnumC21327118dB("ERROR", 4);
        LLILZIL = enumC21327118dB5;
        EnumC21327118dB[] enumC21327118dBArr = {enumC21327118dB, enumC21327118dB2, enumC21327118dB3, enumC21327118dB4, enumC21327118dB5};
        LLILZLL = enumC21327118dBArr;
        new C2254308sP(enumC21327118dBArr);
    }

    public static EnumC21327118dB[] values() {
        return (EnumC21327118dB[]) LLILZLL.clone();
    }

    public static EnumC21327118dB valueOf(String str) {
        return (EnumC21327118dB) C08FF.LIZ(EnumC21327118dB.class, str);
    }

    public EnumC21327118dB(String str, int i) {
    }
}
