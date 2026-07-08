package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC499460JiK {
    public static final EnumC499460JiK GENERAL;
    public static final /* synthetic */ EnumC499460JiK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC499460JiK MANAGEMENT;
    public static final EnumC499460JiK PRIVILEGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC499460JiK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC499460JiK enumC499460JiK = new EnumC499460JiK("MANAGEMENT", 0, "management");
        MANAGEMENT = enumC499460JiK;
        EnumC499460JiK enumC499460JiK2 = new EnumC499460JiK("PRIVILEGE", 1, "privilege");
        PRIVILEGE = enumC499460JiK2;
        EnumC499460JiK enumC499460JiK3 = new EnumC499460JiK("GENERAL", 2, "general");
        GENERAL = enumC499460JiK3;
        EnumC499460JiK[] enumC499460JiKArr = {enumC499460JiK, enumC499460JiK2, enumC499460JiK3};
        LLILLJJLI = enumC499460JiKArr;
        LLILLL = new C2254308sP(enumC499460JiKArr);
    }

    public static EnumC499460JiK[] values() {
        return (EnumC499460JiK[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC499460JiK valueOf(String str) {
        return (EnumC499460JiK) C08FF.LIZ(EnumC499460JiK.class, str);
    }

    public EnumC499460JiK(String str, int i, String str2) {
        this.LL = str2;
    }
}
