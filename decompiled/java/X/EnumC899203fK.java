package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03fK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC899203fK {
    public static final EnumC899203fK FAIL;
    public static final /* synthetic */ EnumC899203fK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC899203fK PAYING;
    public static final EnumC899203fK PENDING;
    public static final EnumC899203fK SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC899203fK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC899203fK enumC899203fK = new EnumC899203fK("FAIL", 0, "fail");
        FAIL = enumC899203fK;
        EnumC899203fK enumC899203fK2 = new EnumC899203fK("PENDING", 1, "pending");
        PENDING = enumC899203fK2;
        EnumC899203fK enumC899203fK3 = new EnumC899203fK("SUCCESS", 2, "success");
        SUCCESS = enumC899203fK3;
        EnumC899203fK enumC899203fK4 = new EnumC899203fK("PAYING", 3, "paying");
        PAYING = enumC899203fK4;
        EnumC899203fK[] enumC899203fKArr = {enumC899203fK, enumC899203fK2, enumC899203fK3, enumC899203fK4};
        LLILLJJLI = enumC899203fKArr;
        LLILLL = new C2254308sP(enumC899203fKArr);
    }

    public static EnumC899203fK[] values() {
        return (EnumC899203fK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC899203fK valueOf(String str) {
        return (EnumC899203fK) C08FF.LIZ(EnumC899203fK.class, str);
    }

    public EnumC899203fK(String str, int i, String str2) {
        this.LL = str2;
    }
}
