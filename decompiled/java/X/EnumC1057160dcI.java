package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dcI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1057160dcI {
    public static final EnumC1057160dcI CPU_BUSY;
    public static final EnumC1057160dcI IDLE;
    public static final /* synthetic */ EnumC1057160dcI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1057160dcI MAIN_THREAD_BUSY;
    public static final EnumC1057160dcI SCROLLING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1057160dcI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1057160dcI enumC1057160dcI = new EnumC1057160dcI("IDLE", 0, 0);
        IDLE = enumC1057160dcI;
        EnumC1057160dcI enumC1057160dcI2 = new EnumC1057160dcI("CPU_BUSY", 1, 1);
        CPU_BUSY = enumC1057160dcI2;
        EnumC1057160dcI enumC1057160dcI3 = new EnumC1057160dcI("MAIN_THREAD_BUSY", 2, 16);
        MAIN_THREAD_BUSY = enumC1057160dcI3;
        EnumC1057160dcI enumC1057160dcI4 = new EnumC1057160dcI("SCROLLING", 3, 256);
        SCROLLING = enumC1057160dcI4;
        EnumC1057160dcI[] enumC1057160dcIArr = {enumC1057160dcI, enumC1057160dcI2, enumC1057160dcI3, enumC1057160dcI4};
        LLILLJJLI = enumC1057160dcIArr;
        LLILLL = new C2254308sP(enumC1057160dcIArr);
    }

    public static EnumC1057160dcI[] values() {
        return (EnumC1057160dcI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1057160dcI valueOf(String str) {
        return (EnumC1057160dcI) C08FF.LIZ(EnumC1057160dcI.class, str);
    }

    public EnumC1057160dcI(String str, int i, int i2) {
        this.LL = i2;
    }
}
