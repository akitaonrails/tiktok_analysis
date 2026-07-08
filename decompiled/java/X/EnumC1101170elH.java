package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0elH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1101170elH {
    public static final EnumC1101170elH CRITICAL;
    public static final EnumC1101170elH GOOD;
    public static final /* synthetic */ EnumC1101170elH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1101170elH MEDIUM;
    public static final EnumC1101170elH PERFECT;
    public static final EnumC1101170elH POOR;
    public static final EnumC1101170elH UNKNOWN;

    public static InterfaceC2044707zh<EnumC1101170elH> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1101170elH enumC1101170elH = new EnumC1101170elH("UNKNOWN", 0);
        UNKNOWN = enumC1101170elH;
        EnumC1101170elH enumC1101170elH2 = new EnumC1101170elH("CRITICAL", 1);
        CRITICAL = enumC1101170elH2;
        EnumC1101170elH enumC1101170elH3 = new EnumC1101170elH("POOR", 2);
        POOR = enumC1101170elH3;
        EnumC1101170elH enumC1101170elH4 = new EnumC1101170elH("MEDIUM", 3);
        MEDIUM = enumC1101170elH4;
        EnumC1101170elH enumC1101170elH5 = new EnumC1101170elH("GOOD", 4);
        GOOD = enumC1101170elH5;
        EnumC1101170elH enumC1101170elH6 = new EnumC1101170elH("PERFECT", 5);
        PERFECT = enumC1101170elH6;
        EnumC1101170elH[] enumC1101170elHArr = {enumC1101170elH, enumC1101170elH2, enumC1101170elH3, enumC1101170elH4, enumC1101170elH5, enumC1101170elH6};
        LL = enumC1101170elHArr;
        LLILLJJLI = new C2254308sP(enumC1101170elHArr);
    }

    public static EnumC1101170elH[] values() {
        return (EnumC1101170elH[]) LL.clone();
    }

    public static EnumC1101170elH valueOf(String str) {
        return (EnumC1101170elH) C08FF.LIZ(EnumC1101170elH.class, str);
    }

    public EnumC1101170elH(String str, int i) {
    }
}
