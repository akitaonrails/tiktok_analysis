package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1591170rVb {
    public static final EnumC1591170rVb BIZ_INTERCEPTOR;
    public static final EnumC1591170rVb FRAGMENT_IS_LEAKED;
    public static final EnumC1591170rVb FRAGMENT_IS_NULL;
    public static final EnumC1591170rVb IN_WHITE_LIST;
    public static final EnumC1591170rVb IS_CURRENT_TAB;
    public static final /* synthetic */ EnumC1591170rVb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1591170rVb NOT_IN_CLEAN_LIST;
    public static final EnumC1591170rVb UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1591170rVb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1591170rVb enumC1591170rVb = new EnumC1591170rVb("UNKNOWN", 0, 0);
        UNKNOWN = enumC1591170rVb;
        EnumC1591170rVb enumC1591170rVb2 = new EnumC1591170rVb("IS_CURRENT_TAB", 1, 1);
        IS_CURRENT_TAB = enumC1591170rVb2;
        EnumC1591170rVb enumC1591170rVb3 = new EnumC1591170rVb("IN_WHITE_LIST", 2, 2);
        IN_WHITE_LIST = enumC1591170rVb3;
        EnumC1591170rVb enumC1591170rVb4 = new EnumC1591170rVb("NOT_IN_CLEAN_LIST", 3, 3);
        NOT_IN_CLEAN_LIST = enumC1591170rVb4;
        EnumC1591170rVb enumC1591170rVb5 = new EnumC1591170rVb("FRAGMENT_IS_NULL", 4, 4);
        FRAGMENT_IS_NULL = enumC1591170rVb5;
        EnumC1591170rVb enumC1591170rVb6 = new EnumC1591170rVb("FRAGMENT_IS_LEAKED", 5, 5);
        FRAGMENT_IS_LEAKED = enumC1591170rVb6;
        EnumC1591170rVb enumC1591170rVb7 = new EnumC1591170rVb("BIZ_INTERCEPTOR", 6, 6);
        BIZ_INTERCEPTOR = enumC1591170rVb7;
        EnumC1591170rVb[] enumC1591170rVbArr = {enumC1591170rVb, enumC1591170rVb2, enumC1591170rVb3, enumC1591170rVb4, enumC1591170rVb5, enumC1591170rVb6, enumC1591170rVb7};
        LLILLJJLI = enumC1591170rVbArr;
        LLILLL = new C2254308sP(enumC1591170rVbArr);
    }

    public static EnumC1591170rVb[] values() {
        return (EnumC1591170rVb[]) LLILLJJLI.clone();
    }

    public final int getMobValue() {
        return this.LL;
    }

    public static EnumC1591170rVb valueOf(String str) {
        return (EnumC1591170rVb) C08FF.LIZ(EnumC1591170rVb.class, str);
    }

    public EnumC1591170rVb(String str, int i, int i2) {
        this.LL = i2;
    }
}
