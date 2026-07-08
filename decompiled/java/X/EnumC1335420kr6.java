package X;

/* JADX INFO: renamed from: X.0kr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1335420kr6 {
    CACHE("CACHE"),
    RESOURCE("RESOURCE"),
    DRAFT("DRAFT"),
    DATA("DATA");

    public final String LL;

    public static EnumC1335420kr6 valueOf(String str) {
        return (EnumC1335420kr6) C08FF.LIZ(EnumC1335420kr6.class, str);
    }

    public final String getModule() {
        return this.LL;
    }

    EnumC1335420kr6(String str) {
        this.LL = str;
    }
}
