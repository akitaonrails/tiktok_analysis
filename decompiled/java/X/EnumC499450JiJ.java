package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0JiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC499450JiJ {
    public static final EnumC499450JiJ GENERAL;
    public static final /* synthetic */ EnumC499450JiJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC499450JiJ MANAGEMENT;
    public static final EnumC499450JiJ PRIVILEGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC499450JiJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC499450JiJ enumC499450JiJ = new EnumC499450JiJ("MANAGEMENT", 0, "management");
        MANAGEMENT = enumC499450JiJ;
        EnumC499450JiJ enumC499450JiJ2 = new EnumC499450JiJ("PRIVILEGE", 1, "privilege");
        PRIVILEGE = enumC499450JiJ2;
        EnumC499450JiJ enumC499450JiJ3 = new EnumC499450JiJ("GENERAL", 2, "general");
        GENERAL = enumC499450JiJ3;
        EnumC499450JiJ[] enumC499450JiJArr = {enumC499450JiJ, enumC499450JiJ2, enumC499450JiJ3};
        LLILLJJLI = enumC499450JiJArr;
        LLILLL = new C2254308sP(enumC499450JiJArr);
    }

    public static EnumC499450JiJ[] values() {
        return (EnumC499450JiJ[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC499450JiJ valueOf(String str) {
        return (EnumC499450JiJ) C08FF.LIZ(EnumC499450JiJ.class, str);
    }

    public EnumC499450JiJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
