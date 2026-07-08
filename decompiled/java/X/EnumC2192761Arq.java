package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Arq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2192761Arq {
    public static final EnumC2192761Arq Active;
    public static final C2192781Ars Companion;
    public static final /* synthetic */ EnumC2192761Arq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2192761Arq Passive;
    public static final EnumC2192761Arq Unknown;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2192761Arq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2192761Arq enumC2192761Arq = new EnumC2192761Arq("Unknown", 0, -1);
        Unknown = enumC2192761Arq;
        EnumC2192761Arq enumC2192761Arq2 = new EnumC2192761Arq("Passive", 1, 0);
        Passive = enumC2192761Arq2;
        EnumC2192761Arq enumC2192761Arq3 = new EnumC2192761Arq("Active", 2, 1);
        Active = enumC2192761Arq3;
        EnumC2192761Arq[] enumC2192761ArqArr = {enumC2192761Arq, enumC2192761Arq2, enumC2192761Arq3};
        LLILLJJLI = enumC2192761ArqArr;
        LLILLL = new C2254308sP(enumC2192761ArqArr);
        Companion = new C2192781Ars();
    }

    public static EnumC2192761Arq[] values() {
        return (EnumC2192761Arq[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C2192771Arr.LIZ[ordinal()];
        if (i == 1) {
            return "passive";
        }
        if (i == 2) {
            return "active";
        }
        if (i == 3) {
            return "unknown";
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2192761Arq valueOf(String str) {
        return (EnumC2192761Arq) C08FF.LIZ(EnumC2192761Arq.class, str);
    }

    public EnumC2192761Arq(String str, int i, int i2) {
        this.LL = i2;
    }
}
