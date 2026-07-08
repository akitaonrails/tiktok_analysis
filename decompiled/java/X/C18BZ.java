package X;

/* JADX INFO: renamed from: X.18BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C18BZ {
    DEFAULT(""),
    ECOMMERCE("ecommerce"),
    APP_TAB("tab");

    public final String LL;

    public static C18BZ valueOf(String str) {
        return (C18BZ) C08FF.LIZ(C18BZ.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    C18BZ(String str) {
        this.LL = str;
    }
}
