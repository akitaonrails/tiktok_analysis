package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JRz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC492210JRz {
    public static final EnumC492210JRz CLOSE;
    public static final /* synthetic */ EnumC492210JRz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC492210JRz OPEN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC492210JRz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC492210JRz enumC492210JRz = new EnumC492210JRz("CLOSE", 0, 0);
        CLOSE = enumC492210JRz;
        EnumC492210JRz enumC492210JRz2 = new EnumC492210JRz("OPEN", 1, 1);
        OPEN = enumC492210JRz2;
        EnumC492210JRz[] enumC492210JRzArr = {enumC492210JRz, enumC492210JRz2};
        LLILLJJLI = enumC492210JRzArr;
        LLILLL = new C2254308sP(enumC492210JRzArr);
    }

    public static EnumC492210JRz[] values() {
        return (EnumC492210JRz[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC492210JRz valueOf(String str) {
        return (EnumC492210JRz) C08FF.LIZ(EnumC492210JRz.class, str);
    }

    public EnumC492210JRz(String str, int i, int i2) {
        this.LL = i2;
    }
}
