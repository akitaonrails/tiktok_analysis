package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wO2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1778680wO2 {
    public static final /* synthetic */ EnumC1778680wO2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1778680wO2 PAD;
    public static final EnumC1778680wO2 RECTANGLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1778680wO2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1778680wO2 enumC1778680wO2 = new EnumC1778680wO2("RECTANGLE", 0, 4);
        RECTANGLE = enumC1778680wO2;
        EnumC1778680wO2 enumC1778680wO22 = new EnumC1778680wO2("PAD", 1, 5);
        PAD = enumC1778680wO22;
        EnumC1778680wO2[] enumC1778680wO2Arr = {enumC1778680wO2, enumC1778680wO22};
        LLILLJJLI = enumC1778680wO2Arr;
        LLILLL = new C2254308sP(enumC1778680wO2Arr);
    }

    public static EnumC1778680wO2[] values() {
        return (EnumC1778680wO2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1778680wO2 valueOf(String str) {
        return (EnumC1778680wO2) C08FF.LIZ(EnumC1778680wO2.class, str);
    }

    public EnumC1778680wO2(String str, int i, int i2) {
        this.LL = i2;
    }
}
