package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC437610HDz {
    public static final EnumC437610HDz BIG;
    public static final /* synthetic */ EnumC437610HDz[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC437610HDz MID_A;
    public static final EnumC437610HDz MID_B;
    public static final EnumC437610HDz SMALL;

    public static InterfaceC2044707zh<EnumC437610HDz> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC437610HDz enumC437610HDz = new EnumC437610HDz("BIG", 0);
        BIG = enumC437610HDz;
        EnumC437610HDz enumC437610HDz2 = new EnumC437610HDz("MID_A", 1);
        MID_A = enumC437610HDz2;
        EnumC437610HDz enumC437610HDz3 = new EnumC437610HDz("MID_B", 2);
        MID_B = enumC437610HDz3;
        EnumC437610HDz enumC437610HDz4 = new EnumC437610HDz("SMALL", 3);
        SMALL = enumC437610HDz4;
        EnumC437610HDz[] enumC437610HDzArr = {enumC437610HDz, enumC437610HDz2, enumC437610HDz3, enumC437610HDz4};
        LL = enumC437610HDzArr;
        LLILLJJLI = new C2254308sP(enumC437610HDzArr);
    }

    public static EnumC437610HDz[] values() {
        return (EnumC437610HDz[]) LL.clone();
    }

    public static EnumC437610HDz valueOf(String str) {
        return (EnumC437610HDz) C08FF.LIZ(EnumC437610HDz.class, str);
    }

    public EnumC437610HDz(String str, int i) {
    }
}
