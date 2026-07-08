package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1760270vuL {
    public static final /* synthetic */ EnumC1760270vuL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1760270vuL LYNX;
    public static final EnumC1760270vuL MYNA;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1760270vuL> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1760270vuL enumC1760270vuL = new EnumC1760270vuL("LYNX", 0, 1);
        LYNX = enumC1760270vuL;
        EnumC1760270vuL enumC1760270vuL2 = new EnumC1760270vuL("MYNA", 1, 2);
        MYNA = enumC1760270vuL2;
        EnumC1760270vuL[] enumC1760270vuLArr = {enumC1760270vuL, enumC1760270vuL2};
        LLILLJJLI = enumC1760270vuLArr;
        LLILLL = new C2254308sP(enumC1760270vuLArr);
    }

    public static EnumC1760270vuL[] values() {
        return (EnumC1760270vuL[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1760270vuL valueOf(String str) {
        return (EnumC1760270vuL) C08FF.LIZ(EnumC1760270vuL.class, str);
    }

    public EnumC1760270vuL(String str, int i, int i2) {
        this.LL = i2;
    }
}
