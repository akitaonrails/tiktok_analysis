package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wVH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1783170wVH {
    public static final EnumC1783170wVH BUSINESS;
    public static final EnumC1783170wVH HANDLER;
    public static final /* synthetic */ EnumC1783170wVH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1783170wVH MANAGER;
    public static final EnumC1783170wVH STRATEGY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1783170wVH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1783170wVH enumC1783170wVH = new EnumC1783170wVH("MANAGER", 0, "manager");
        MANAGER = enumC1783170wVH;
        EnumC1783170wVH enumC1783170wVH2 = new EnumC1783170wVH("STRATEGY", 1, "strategy");
        STRATEGY = enumC1783170wVH2;
        EnumC1783170wVH enumC1783170wVH3 = new EnumC1783170wVH("HANDLER", 2, "handler");
        HANDLER = enumC1783170wVH3;
        EnumC1783170wVH enumC1783170wVH4 = new EnumC1783170wVH("BUSINESS", 3, "Business");
        BUSINESS = enumC1783170wVH4;
        EnumC1783170wVH[] enumC1783170wVHArr = {enumC1783170wVH, enumC1783170wVH2, enumC1783170wVH3, enumC1783170wVH4};
        LLILLJJLI = enumC1783170wVHArr;
        LLILLL = new C2254308sP(enumC1783170wVHArr);
    }

    public static EnumC1783170wVH[] values() {
        return (EnumC1783170wVH[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static EnumC1783170wVH valueOf(String str) {
        return (EnumC1783170wVH) C08FF.LIZ(EnumC1783170wVH.class, str);
    }

    public EnumC1783170wVH(String str, int i, String str2) {
        this.LL = str2;
    }
}
