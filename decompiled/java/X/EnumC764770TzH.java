package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC764770TzH {
    public static final EnumC764770TzH CREATOR_SINGS;
    public static final /* synthetic */ EnumC764770TzH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC764770TzH NORMAL;
    public static final EnumC764770TzH OTHER;
    public static final EnumC764770TzH QUEUE;
    public static final EnumC764770TzH REQUESTS;
    public static final EnumC764770TzH SEARCH;
    public static final EnumC764770TzH VIEWER_SINGS;
    public final String LL;

    public static InterfaceC2044707zh<EnumC764770TzH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC764770TzH enumC764770TzH = new EnumC764770TzH("NORMAL", 0, "normal");
        NORMAL = enumC764770TzH;
        EnumC764770TzH enumC764770TzH2 = new EnumC764770TzH("SEARCH", 1, "search");
        SEARCH = enumC764770TzH2;
        EnumC764770TzH enumC764770TzH3 = new EnumC764770TzH("REQUESTS", 2, "requests");
        REQUESTS = enumC764770TzH3;
        EnumC764770TzH enumC764770TzH4 = new EnumC764770TzH("CREATOR_SINGS", 3, "request_viewer_listen");
        CREATOR_SINGS = enumC764770TzH4;
        EnumC764770TzH enumC764770TzH5 = new EnumC764770TzH("VIEWER_SINGS", 4, "request_viewer_sing");
        VIEWER_SINGS = enumC764770TzH5;
        EnumC764770TzH enumC764770TzH6 = new EnumC764770TzH("QUEUE", 5, "queue");
        QUEUE = enumC764770TzH6;
        EnumC764770TzH enumC764770TzH7 = new EnumC764770TzH("OTHER", 6, "other");
        OTHER = enumC764770TzH7;
        EnumC764770TzH[] enumC764770TzHArr = {enumC764770TzH, enumC764770TzH2, enumC764770TzH3, enumC764770TzH4, enumC764770TzH5, enumC764770TzH6, enumC764770TzH7};
        LLILLJJLI = enumC764770TzHArr;
        LLILLL = new C2254308sP(enumC764770TzHArr);
    }

    public static EnumC764770TzH[] values() {
        return (EnumC764770TzH[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC764770TzH valueOf(String str) {
        return (EnumC764770TzH) C08FF.LIZ(EnumC764770TzH.class, str);
    }

    public EnumC764770TzH(String str, int i, String str2) {
        this.LL = str2;
    }
}
