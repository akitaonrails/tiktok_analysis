package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vnp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1756230vnp {
    public static final EnumC1756230vnp BLOCK;
    public static final /* synthetic */ EnumC1756230vnp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1756230vnp NOT_EXIST;
    public static final EnumC1756230vnp OTHER_ERROR;
    public static final EnumC1756230vnp REGION_ERROR;
    public static final EnumC1756230vnp REGION_UNAVAILABLE;
    public static final EnumC1756230vnp UNDER_AGE_GATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1756230vnp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1756230vnp enumC1756230vnp = new EnumC1756230vnp("OTHER_ERROR", 0, "other_error");
        OTHER_ERROR = enumC1756230vnp;
        EnumC1756230vnp enumC1756230vnp2 = new EnumC1756230vnp("REGION_ERROR", 1, "region_error");
        REGION_ERROR = enumC1756230vnp2;
        EnumC1756230vnp enumC1756230vnp3 = new EnumC1756230vnp("NOT_EXIST", 2, "not_exist");
        NOT_EXIST = enumC1756230vnp3;
        EnumC1756230vnp enumC1756230vnp4 = new EnumC1756230vnp("REGION_UNAVAILABLE", 3, "region_unavailable");
        REGION_UNAVAILABLE = enumC1756230vnp4;
        EnumC1756230vnp enumC1756230vnp5 = new EnumC1756230vnp("BLOCK", 4, "block");
        BLOCK = enumC1756230vnp5;
        EnumC1756230vnp enumC1756230vnp6 = new EnumC1756230vnp("UNDER_AGE_GATE", 5, "under_age_gate");
        UNDER_AGE_GATE = enumC1756230vnp6;
        EnumC1756230vnp[] enumC1756230vnpArr = {enumC1756230vnp, enumC1756230vnp2, enumC1756230vnp3, enumC1756230vnp4, enumC1756230vnp5, enumC1756230vnp6};
        LLILLJJLI = enumC1756230vnpArr;
        LLILLL = new C2254308sP(enumC1756230vnpArr);
    }

    public static EnumC1756230vnp[] values() {
        return (EnumC1756230vnp[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1756230vnp valueOf(String str) {
        return (EnumC1756230vnp) C08FF.LIZ(EnumC1756230vnp.class, str);
    }

    public EnumC1756230vnp(String str, int i, String str2) {
        this.LL = str2;
    }
}
