package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WLp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC821790WLp implements InterfaceC821860WLw {
    public static final EnumC821790WLp ACTION_DEFAULT;
    public static final EnumC821790WLp ACTION_NETWORK_INNER_TEST;
    public static final EnumC821790WLp ACTION_NO;
    public static final EnumC821790WLp ACTION_UNKNOWN;
    public static final /* synthetic */ EnumC821790WLp[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public final int LL;
    public final String LLILLJJLI;
    public Boolean LLILLL;

    public static InterfaceC2044707zh<EnumC821790WLp> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC821790WLp enumC821790WLp = new EnumC821790WLp("ACTION_NETWORK_INNER_TEST", 0, 99999, "network_test_action", Boolean.TRUE);
        ACTION_NETWORK_INNER_TEST = enumC821790WLp;
        Boolean bool = Boolean.FALSE;
        EnumC821790WLp enumC821790WLp2 = new EnumC821790WLp("ACTION_DEFAULT", 1, -10000, "default", bool);
        ACTION_DEFAULT = enumC821790WLp2;
        EnumC821790WLp enumC821790WLp3 = new EnumC821790WLp("ACTION_UNKNOWN", 2, -20000, "Unknown Action", bool);
        ACTION_UNKNOWN = enumC821790WLp3;
        EnumC821790WLp enumC821790WLp4 = new EnumC821790WLp("ACTION_NO", 3, -30000, "No Action", bool);
        ACTION_NO = enumC821790WLp4;
        EnumC821790WLp[] enumC821790WLpArr = {enumC821790WLp, enumC821790WLp2, enumC821790WLp3, enumC821790WLp4};
        LLILZ = enumC821790WLpArr;
        LLILZIL = new C2254308sP(enumC821790WLpArr);
    }

    public static EnumC821790WLp[] values() {
        return (EnumC821790WLp[]) LLILZ.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("code:");
        sbLIZ.append(getCode());
        sbLIZ.append("; message:");
        sbLIZ.append(getDescription());
        sbLIZ.append("; intercept:");
        sbLIZ.append(getIntercept());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC821860WLw
    public int getCode() {
        return this.LL;
    }

    @Override // X.InterfaceC821860WLw
    public String getDescription() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC821860WLw
    public Boolean getIntercept() {
        return this.LLILLL;
    }

    public static EnumC821790WLp valueOf(String str) {
        return (EnumC821790WLp) C08FF.LIZ(EnumC821790WLp.class, str);
    }

    public void setIntercept(Boolean bool) {
        this.LLILLL = bool;
    }

    public EnumC821790WLp(String str, int i, int i2, String str2, Boolean bool) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
    }
}
