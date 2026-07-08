package X;

/* JADX INFO: renamed from: X.0WNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public enum EnumC822340WNs {
    URL("url"),
    URL_HOST("url_host"),
    URL_PATH("url_path"),
    OWNERSHIP("ownership"),
    DATAFLOW_ID("dfid"),
    UNKNOWN("unknown");

    public static final C0WO3 Companion = new Object() { // from class: X.0WO3
    };
    public final String LL;

    public static EnumC822340WNs valueOf(String str) {
        return (EnumC822340WNs) C08FF.LIZ(EnumC822340WNs.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    EnumC822340WNs(String str) {
        this.LL = str;
    }
}
