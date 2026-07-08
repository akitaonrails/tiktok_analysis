package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Crr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2243731Crr {
    public static final C2243821Cs0 Companion;
    public static final EnumC2243731Crr FAVOURITE;
    public static final /* synthetic */ EnumC2243731Crr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2243731Crr REPORT;
    public static final EnumC2243731Crr SEND;
    public static final EnumC2243731Crr UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2243731Crr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2243731Crr enumC2243731Crr = new EnumC2243731Crr("UNKNOWN", 0, 0);
        UNKNOWN = enumC2243731Crr;
        EnumC2243731Crr enumC2243731Crr2 = new EnumC2243731Crr("SEND", 1, 1);
        SEND = enumC2243731Crr2;
        EnumC2243731Crr enumC2243731Crr3 = new EnumC2243731Crr("FAVOURITE", 2, 2);
        FAVOURITE = enumC2243731Crr3;
        EnumC2243731Crr enumC2243731Crr4 = new EnumC2243731Crr("REPORT", 3, 3);
        REPORT = enumC2243731Crr4;
        EnumC2243731Crr[] enumC2243731CrrArr = {enumC2243731Crr, enumC2243731Crr2, enumC2243731Crr3, enumC2243731Crr4};
        LLILLJJLI = enumC2243731CrrArr;
        LLILLL = new C2254308sP(enumC2243731CrrArr);
        Companion = new C2243821Cs0();
    }

    public static EnumC2243731Crr[] values() {
        return (EnumC2243731Crr[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2243731Crr valueOf(String str) {
        return (EnumC2243731Crr) C08FF.LIZ(EnumC2243731Crr.class, str);
    }

    public EnumC2243731Crr(String str, int i, int i2) {
        this.LL = i2;
    }
}
