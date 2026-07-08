package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC110300bN {
    public static final EnumC110300bN FAIL;
    public static final /* synthetic */ EnumC110300bN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC110300bN SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC110300bN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC110300bN enumC110300bN = new EnumC110300bN("SUCCESS", 0, "success");
        SUCCESS = enumC110300bN;
        EnumC110300bN enumC110300bN2 = new EnumC110300bN("FAIL", 1, "fail");
        FAIL = enumC110300bN2;
        EnumC110300bN[] enumC110300bNArr = {enumC110300bN, enumC110300bN2};
        LLILLJJLI = enumC110300bNArr;
        LLILLL = new C2254308sP(enumC110300bNArr);
    }

    public static EnumC110300bN[] values() {
        return (EnumC110300bN[]) LLILLJJLI.clone();
    }

    public final String getStatus() {
        return this.LL;
    }

    public static EnumC110300bN valueOf(String str) {
        return (EnumC110300bN) C08FF.LIZ(EnumC110300bN.class, str);
    }

    public EnumC110300bN(String str, int i, String str2) {
        this.LL = str2;
    }
}
