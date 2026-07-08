package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1588650rRX {
    public static final EnumC1588650rRX LIVE;
    public static final /* synthetic */ EnumC1588650rRX[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC1588650rRX NONE;
    public static final EnumC1588650rRX NUMBER;
    public static final EnumC1588650rRX RED_DOT;
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<EnumC1588650rRX> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC1588650rRX enumC1588650rRX = new EnumC1588650rRX("NONE", 0, 0, -1, "");
        NONE = enumC1588650rRX;
        EnumC1588650rRX enumC1588650rRX2 = new EnumC1588650rRX("RED_DOT", 1, 1, 40, "red_dot");
        RED_DOT = enumC1588650rRX2;
        EnumC1588650rRX enumC1588650rRX3 = new EnumC1588650rRX("NUMBER", 2, 2, 41, "number");
        NUMBER = enumC1588650rRX3;
        EnumC1588650rRX enumC1588650rRX4 = new EnumC1588650rRX("LIVE", 3, 3, 38, "live");
        LIVE = enumC1588650rRX4;
        EnumC1588650rRX[] enumC1588650rRXArr = {enumC1588650rRX, enumC1588650rRX2, enumC1588650rRX3, enumC1588650rRX4};
        LLILZ = enumC1588650rRXArr;
        LLILZIL = new C2254308sP(enumC1588650rRXArr);
    }

    public static EnumC1588650rRX[] values() {
        return (EnumC1588650rRX[]) LLILZ.clone();
    }

    public final String getDesc() {
        return this.LLILLL;
    }

    public final int getGroup() {
        return this.LLILLJJLI;
    }

    public final int getState() {
        return this.LL;
    }

    public static EnumC1588650rRX valueOf(String str) {
        return (EnumC1588650rRX) C08FF.LIZ(EnumC1588650rRX.class, str);
    }

    public EnumC1588650rRX(String str, int i, int i2, int i3, String str2) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = str2;
    }
}
