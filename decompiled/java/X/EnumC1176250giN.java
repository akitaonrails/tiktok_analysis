package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0giN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1176250giN {
    public static final EnumC1176250giN ACC;
    public static final EnumC1176250giN DISTRICT;
    public static final EnumC1176250giN LANDMARK;
    public static final /* synthetic */ EnumC1176250giN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1176250giN TRANSPORTATION;
    public static final EnumC1176250giN UNKNOWN;
    public static final EnumC1176250giN USER_NEARBY;
    public static final EnumC1176250giN WINDOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1176250giN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1176250giN enumC1176250giN = new EnumC1176250giN("UNKNOWN", 0, 0);
        UNKNOWN = enumC1176250giN;
        EnumC1176250giN enumC1176250giN2 = new EnumC1176250giN("USER_NEARBY", 1, 1);
        USER_NEARBY = enumC1176250giN2;
        EnumC1176250giN enumC1176250giN3 = new EnumC1176250giN("LANDMARK", 2, 2);
        LANDMARK = enumC1176250giN3;
        EnumC1176250giN enumC1176250giN4 = new EnumC1176250giN("TRANSPORTATION", 3, 3);
        TRANSPORTATION = enumC1176250giN4;
        EnumC1176250giN enumC1176250giN5 = new EnumC1176250giN("DISTRICT", 4, 4);
        DISTRICT = enumC1176250giN5;
        EnumC1176250giN enumC1176250giN6 = new EnumC1176250giN("WINDOW", 5, 5);
        WINDOW = enumC1176250giN6;
        EnumC1176250giN enumC1176250giN7 = new EnumC1176250giN("ACC", 6, 6);
        ACC = enumC1176250giN7;
        EnumC1176250giN[] enumC1176250giNArr = {enumC1176250giN, enumC1176250giN2, enumC1176250giN3, enumC1176250giN4, enumC1176250giN5, enumC1176250giN6, enumC1176250giN7};
        LLILLJJLI = enumC1176250giNArr;
        LLILLL = new C2254308sP(enumC1176250giNArr);
    }

    public static EnumC1176250giN[] values() {
        return (EnumC1176250giN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1176250giN valueOf(String str) {
        return (EnumC1176250giN) C08FF.LIZ(EnumC1176250giN.class, str);
    }

    public EnumC1176250giN(String str, int i, int i2) {
        this.LL = i2;
    }
}
