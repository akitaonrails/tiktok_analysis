package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0f8w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1115840f8w {
    public static final EnumC1115840f8w BUSINESS_PRIORITY;
    public static final EnumC1115840f8w CONFLICT;
    public static final EnumC1115840f8w FREQUENCY;
    public static final /* synthetic */ EnumC1115840f8w[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1115840f8w MANUALLY_CLOSE;
    public static final EnumC1115840f8w NO_BEHAVIOR;
    public static final EnumC1115840f8w OTHERS;
    public static final EnumC1115840f8w TIME_OUT;

    public static InterfaceC2044707zh<EnumC1115840f8w> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1115840f8w enumC1115840f8w = new EnumC1115840f8w("NO_BEHAVIOR", 0);
        NO_BEHAVIOR = enumC1115840f8w;
        EnumC1115840f8w enumC1115840f8w2 = new EnumC1115840f8w("MANUALLY_CLOSE", 1);
        MANUALLY_CLOSE = enumC1115840f8w2;
        EnumC1115840f8w enumC1115840f8w3 = new EnumC1115840f8w("FREQUENCY", 2);
        FREQUENCY = enumC1115840f8w3;
        EnumC1115840f8w enumC1115840f8w4 = new EnumC1115840f8w("CONFLICT", 3);
        CONFLICT = enumC1115840f8w4;
        EnumC1115840f8w enumC1115840f8w5 = new EnumC1115840f8w("BUSINESS_PRIORITY", 4);
        BUSINESS_PRIORITY = enumC1115840f8w5;
        EnumC1115840f8w enumC1115840f8w6 = new EnumC1115840f8w("TIME_OUT", 5);
        TIME_OUT = enumC1115840f8w6;
        EnumC1115840f8w enumC1115840f8w7 = new EnumC1115840f8w("OTHERS", 6);
        OTHERS = enumC1115840f8w7;
        EnumC1115840f8w[] enumC1115840f8wArr = {enumC1115840f8w, enumC1115840f8w2, enumC1115840f8w3, enumC1115840f8w4, enumC1115840f8w5, enumC1115840f8w6, enumC1115840f8w7};
        LL = enumC1115840f8wArr;
        LLILLJJLI = new C2254308sP(enumC1115840f8wArr);
    }

    public static EnumC1115840f8w[] values() {
        return (EnumC1115840f8w[]) LL.clone();
    }

    public static EnumC1115840f8w valueOf(String str) {
        return (EnumC1115840f8w) C08FF.LIZ(EnumC1115840f8w.class, str);
    }

    public EnumC1115840f8w(String str, int i) {
    }
}
