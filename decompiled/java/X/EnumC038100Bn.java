package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC038100Bn {
    public static final EnumC038100Bn DELETED;
    public static final EnumC038100Bn HIDDEN;
    public static final EnumC038100Bn IN_STORE;
    public static final /* synthetic */ EnumC038100Bn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC038100Bn MODERATED;
    public static final EnumC038100Bn REPORTED;
    public static final EnumC038100Bn UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC038100Bn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC038100Bn enumC038100Bn = new EnumC038100Bn("UNKNOWN", 0, 0);
        UNKNOWN = enumC038100Bn;
        EnumC038100Bn enumC038100Bn2 = new EnumC038100Bn("HIDDEN", 1, 1);
        HIDDEN = enumC038100Bn2;
        EnumC038100Bn enumC038100Bn3 = new EnumC038100Bn("IN_STORE", 2, 2);
        IN_STORE = enumC038100Bn3;
        EnumC038100Bn enumC038100Bn4 = new EnumC038100Bn("DELETED", 3, 3);
        DELETED = enumC038100Bn4;
        EnumC038100Bn enumC038100Bn5 = new EnumC038100Bn("REPORTED", 4, 4);
        REPORTED = enumC038100Bn5;
        EnumC038100Bn enumC038100Bn6 = new EnumC038100Bn("MODERATED", 5, 5);
        MODERATED = enumC038100Bn6;
        EnumC038100Bn[] enumC038100BnArr = {enumC038100Bn, enumC038100Bn2, enumC038100Bn3, enumC038100Bn4, enumC038100Bn5, enumC038100Bn6};
        LLILLJJLI = enumC038100BnArr;
        LLILLL = new C2254308sP(enumC038100BnArr);
    }

    public static EnumC038100Bn[] values() {
        return (EnumC038100Bn[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC038100Bn valueOf(String str) {
        return (EnumC038100Bn) C08FF.LIZ(EnumC038100Bn.class, str);
    }

    public EnumC038100Bn(String str, int i, int i2) {
        this.LL = i2;
    }
}
