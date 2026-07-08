package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1914030zuL {
    public static final EnumC1914030zuL EU;
    public static final EnumC1914030zuL KR;
    public static final /* synthetic */ EnumC1914030zuL[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1914030zuL ROW;
    public static final EnumC1914030zuL UNKNOWN;
    public static final EnumC1914030zuL US;

    public static InterfaceC2044707zh<EnumC1914030zuL> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1914030zuL enumC1914030zuL = new EnumC1914030zuL("US", 0);
        US = enumC1914030zuL;
        EnumC1914030zuL enumC1914030zuL2 = new EnumC1914030zuL("EU", 1);
        EU = enumC1914030zuL2;
        EnumC1914030zuL enumC1914030zuL3 = new EnumC1914030zuL("KR", 2);
        KR = enumC1914030zuL3;
        EnumC1914030zuL enumC1914030zuL4 = new EnumC1914030zuL("ROW", 3);
        ROW = enumC1914030zuL4;
        EnumC1914030zuL enumC1914030zuL5 = new EnumC1914030zuL("UNKNOWN", 4);
        UNKNOWN = enumC1914030zuL5;
        EnumC1914030zuL[] enumC1914030zuLArr = {enumC1914030zuL, enumC1914030zuL2, enumC1914030zuL3, enumC1914030zuL4, enumC1914030zuL5};
        LL = enumC1914030zuLArr;
        LLILLJJLI = new C2254308sP(enumC1914030zuLArr);
    }

    public static EnumC1914030zuL[] values() {
        return (EnumC1914030zuL[]) LL.clone();
    }

    public static EnumC1914030zuL valueOf(String str) {
        return (EnumC1914030zuL) C08FF.LIZ(EnumC1914030zuL.class, str);
    }

    public EnumC1914030zuL(String str, int i) {
    }
}
