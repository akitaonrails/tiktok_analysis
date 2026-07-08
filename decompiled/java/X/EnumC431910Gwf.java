package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gwf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC431910Gwf {
    public static final EnumC431910Gwf LEFT;
    public static final EnumC431910Gwf LEFT_TOP_ONE;
    public static final EnumC431910Gwf LEFT_TOP_TWO;
    public static final /* synthetic */ EnumC431910Gwf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC431910Gwf RIGHT_TOP;
    public final int LL;

    public static InterfaceC2044707zh<EnumC431910Gwf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC431910Gwf enumC431910Gwf = new EnumC431910Gwf("LEFT_TOP_ONE", 0, 1);
        LEFT_TOP_ONE = enumC431910Gwf;
        EnumC431910Gwf enumC431910Gwf2 = new EnumC431910Gwf("LEFT_TOP_TWO", 1, 2);
        LEFT_TOP_TWO = enumC431910Gwf2;
        EnumC431910Gwf enumC431910Gwf3 = new EnumC431910Gwf("RIGHT_TOP", 2, 3);
        RIGHT_TOP = enumC431910Gwf3;
        EnumC431910Gwf enumC431910Gwf4 = new EnumC431910Gwf("LEFT", 3, 4);
        LEFT = enumC431910Gwf4;
        EnumC431910Gwf[] enumC431910GwfArr = {enumC431910Gwf, enumC431910Gwf2, enumC431910Gwf3, enumC431910Gwf4};
        LLILLJJLI = enumC431910GwfArr;
        LLILLL = new C2254308sP(enumC431910GwfArr);
    }

    public static EnumC431910Gwf[] values() {
        return (EnumC431910Gwf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC431910Gwf valueOf(String str) {
        return (EnumC431910Gwf) C08FF.LIZ(EnumC431910Gwf.class, str);
    }

    public EnumC431910Gwf(String str, int i, int i2) {
        this.LL = i2;
    }
}
