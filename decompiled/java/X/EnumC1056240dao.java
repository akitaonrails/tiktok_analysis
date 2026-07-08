package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1056240dao {
    public static final EnumC1056240dao FAIL;
    public static final /* synthetic */ EnumC1056240dao[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1056240dao NONE;
    public static final EnumC1056240dao REQ;
    public static final EnumC1056240dao SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1056240dao> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1056240dao enumC1056240dao = new EnumC1056240dao("NONE", 0, -2);
        NONE = enumC1056240dao;
        EnumC1056240dao enumC1056240dao2 = new EnumC1056240dao("REQ", 1, 0);
        REQ = enumC1056240dao2;
        EnumC1056240dao enumC1056240dao3 = new EnumC1056240dao("SUCCESS", 2, 1);
        SUCCESS = enumC1056240dao3;
        EnumC1056240dao enumC1056240dao4 = new EnumC1056240dao("FAIL", 3, -1);
        FAIL = enumC1056240dao4;
        EnumC1056240dao[] enumC1056240daoArr = {enumC1056240dao, enumC1056240dao2, enumC1056240dao3, enumC1056240dao4};
        LLILLJJLI = enumC1056240daoArr;
        LLILLL = new C2254308sP(enumC1056240daoArr);
    }

    public static EnumC1056240dao[] values() {
        return (EnumC1056240dao[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1056240dao valueOf(String str) {
        return (EnumC1056240dao) C08FF.LIZ(EnumC1056240dao.class, str);
    }

    public EnumC1056240dao(String str, int i, int i2) {
        this.LL = i2;
    }
}
