package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10pU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19365010pU {
    public static final /* synthetic */ EnumC19365010pU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19365010pU MULTI_PROCESS;
    public static final EnumC19365010pU SINGLE_PROCESS;
    public int LL;

    public static InterfaceC2044707zh<EnumC19365010pU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19365010pU enumC19365010pU = new EnumC19365010pU("SINGLE_PROCESS", 0, 1);
        SINGLE_PROCESS = enumC19365010pU;
        EnumC19365010pU enumC19365010pU2 = new EnumC19365010pU("MULTI_PROCESS", 1, 2);
        MULTI_PROCESS = enumC19365010pU2;
        EnumC19365010pU[] enumC19365010pUArr = {enumC19365010pU, enumC19365010pU2};
        LLILLJJLI = enumC19365010pUArr;
        LLILLL = new C2254308sP(enumC19365010pUArr);
    }

    public static EnumC19365010pU[] values() {
        return (EnumC19365010pU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19365010pU valueOf(String str) {
        return (EnumC19365010pU) C08FF.LIZ(EnumC19365010pU.class, str);
    }

    public final void setValue(int i) {
        this.LL = i;
    }

    public EnumC19365010pU(String str, int i, int i2) {
        this.LL = i2;
    }
}
