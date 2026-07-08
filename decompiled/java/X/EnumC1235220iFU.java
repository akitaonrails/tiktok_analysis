package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235220iFU {
    public static final EnumC1235220iFU DIGITAL_0;
    public static final EnumC1235220iFU DIGITAL_1;
    public static final /* synthetic */ EnumC1235220iFU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1235220iFU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235220iFU enumC1235220iFU = new EnumC1235220iFU("DIGITAL_0", 0, 0);
        DIGITAL_0 = enumC1235220iFU;
        EnumC1235220iFU enumC1235220iFU2 = new EnumC1235220iFU("DIGITAL_1", 1, 1);
        DIGITAL_1 = enumC1235220iFU2;
        EnumC1235220iFU[] enumC1235220iFUArr = {enumC1235220iFU, enumC1235220iFU2};
        LLILLJJLI = enumC1235220iFUArr;
        LLILLL = new C2254308sP(enumC1235220iFUArr);
    }

    public static EnumC1235220iFU[] values() {
        return (EnumC1235220iFU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1235220iFU valueOf(String str) {
        return (EnumC1235220iFU) C08FF.LIZ(EnumC1235220iFU.class, str);
    }

    public EnumC1235220iFU(String str, int i, int i2) {
        this.LL = i2;
    }
}
