package X;

/* JADX INFO: renamed from: X.0WKO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WKO {
    TUDP(0),
    TLS(1),
    HTTP2(2),
    TUDP_PROXY(3),
    TLS_PROXY(4);

    public final int LL;

    public static C0WKO convertToMode() {
        return null;
    }

    public int getTypeValue() {
        return this.LL;
    }

    public static C0WKO valueOf(String str) {
        return (C0WKO) C08FF.LIZ(C0WKO.class, str);
    }

    C0WKO(int i) {
        this.LL = i;
    }
}
