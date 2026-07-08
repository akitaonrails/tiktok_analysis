package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1874000yrm {
    public static final C1872210yot Companion;
    public static final EnumC1874000yrm DELETE;
    public static final EnumC1874000yrm GET;
    public static final /* synthetic */ EnumC1874000yrm[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1874000yrm POST;
    public static final EnumC1874000yrm PUT;
    public static final EnumC1874000yrm UNSUPPORTED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1874000yrm> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0yot] */
    static {
        EnumC1874000yrm enumC1874000yrm = new EnumC1874000yrm("GET", 0, "get");
        GET = enumC1874000yrm;
        EnumC1874000yrm enumC1874000yrm2 = new EnumC1874000yrm("POST", 1, "post");
        POST = enumC1874000yrm2;
        EnumC1874000yrm enumC1874000yrm3 = new EnumC1874000yrm("PUT", 2, "put");
        PUT = enumC1874000yrm3;
        EnumC1874000yrm enumC1874000yrm4 = new EnumC1874000yrm("DELETE", 3, "delete");
        DELETE = enumC1874000yrm4;
        EnumC1874000yrm enumC1874000yrm5 = new EnumC1874000yrm("UNSUPPORTED", 4, "unsupported");
        UNSUPPORTED = enumC1874000yrm5;
        EnumC1874000yrm[] enumC1874000yrmArr = {enumC1874000yrm, enumC1874000yrm2, enumC1874000yrm3, enumC1874000yrm4, enumC1874000yrm5};
        LLILLJJLI = enumC1874000yrmArr;
        LLILLL = new C2254308sP(enumC1874000yrmArr);
        Companion = new Object() { // from class: X.0yot
        };
    }

    public static EnumC1874000yrm[] values() {
        return (EnumC1874000yrm[]) LLILLJJLI.clone();
    }

    public final String getMethod() {
        return this.LL;
    }

    public static EnumC1874000yrm valueOf(String str) {
        return (EnumC1874000yrm) C08FF.LIZ(EnumC1874000yrm.class, str);
    }

    public EnumC1874000yrm(String str, int i, String str2) {
        this.LL = str2;
    }
}
