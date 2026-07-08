package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hYT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1208550hYT {
    public static final EnumC1208550hYT AlreadyConsented;
    public static final EnumC1208550hYT Denied;
    public static final EnumC1208550hYT Granted;
    public static final /* synthetic */ EnumC1208550hYT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1208550hYT Shown;
    public static final EnumC1208550hYT Unknown;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1208550hYT> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1208550hYT enumC1208550hYT = new EnumC1208550hYT("Unknown", 0, -1);
        Unknown = enumC1208550hYT;
        EnumC1208550hYT enumC1208550hYT2 = new EnumC1208550hYT("Shown", 1, 0);
        Shown = enumC1208550hYT2;
        EnumC1208550hYT enumC1208550hYT3 = new EnumC1208550hYT("Granted", 2, 1);
        Granted = enumC1208550hYT3;
        EnumC1208550hYT enumC1208550hYT4 = new EnumC1208550hYT("Denied", 3, 2);
        Denied = enumC1208550hYT4;
        EnumC1208550hYT enumC1208550hYT5 = new EnumC1208550hYT("AlreadyConsented", 4, 3);
        AlreadyConsented = enumC1208550hYT5;
        EnumC1208550hYT[] enumC1208550hYTArr = {enumC1208550hYT, enumC1208550hYT2, enumC1208550hYT3, enumC1208550hYT4, enumC1208550hYT5};
        LLILLJJLI = enumC1208550hYTArr;
        LLILLL = new C2254308sP(enumC1208550hYTArr);
    }

    public static EnumC1208550hYT[] values() {
        return (EnumC1208550hYT[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C1798430wtt.LIZ[ordinal()];
        if (i == 1) {
            return "Unknown";
        }
        if (i == 2) {
            return "Shown";
        }
        if (i == 3) {
            return "Granted";
        }
        if (i == 4) {
            return "Denied";
        }
        if (i == 5) {
            return "AlreadyConsented";
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1208550hYT valueOf(String str) {
        return (EnumC1208550hYT) C08FF.LIZ(EnumC1208550hYT.class, str);
    }

    public EnumC1208550hYT(String str, int i, int i2) {
        this.LL = i2;
    }
}
