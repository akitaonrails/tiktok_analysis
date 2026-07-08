package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QiQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC677880QiQ {
    public static final EnumC677880QiQ BFF_TECH_TYPE_LYNX;
    public static final EnumC677880QiQ BFF_TECH_TYPE_NATIVE;
    public static final EnumC677880QiQ BFF_TECH_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC677880QiQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC677880QiQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC677880QiQ enumC677880QiQ = new EnumC677880QiQ("BFF_TECH_TYPE_UNKNOWN", 0, 0);
        BFF_TECH_TYPE_UNKNOWN = enumC677880QiQ;
        EnumC677880QiQ enumC677880QiQ2 = new EnumC677880QiQ("BFF_TECH_TYPE_NATIVE", 1, 1);
        BFF_TECH_TYPE_NATIVE = enumC677880QiQ2;
        EnumC677880QiQ enumC677880QiQ3 = new EnumC677880QiQ("BFF_TECH_TYPE_LYNX", 2, 2);
        BFF_TECH_TYPE_LYNX = enumC677880QiQ3;
        EnumC677880QiQ[] enumC677880QiQArr = {enumC677880QiQ, enumC677880QiQ2, enumC677880QiQ3};
        LLILLJJLI = enumC677880QiQArr;
        LLILLL = new C2254308sP(enumC677880QiQArr);
    }

    public static EnumC677880QiQ[] values() {
        return (EnumC677880QiQ[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC677880QiQ valueOf(String str) {
        return (EnumC677880QiQ) C08FF.LIZ(EnumC677880QiQ.class, str);
    }

    public EnumC677880QiQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
