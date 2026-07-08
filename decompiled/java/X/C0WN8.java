package X;

/* JADX INFO: renamed from: X.0WN8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public enum C0WN8 {
    ROUTER("web_router"),
    NAVIGATION("web_navigation"),
    NETWORK("network"),
    JSInterface("js_interface"),
    JSInjection("js_injection"),
    JSBridge("js_bridge"),
    CSP("csp"),
    UNKNOWN("unknown");

    public static final C0WNQ Companion = new Object() { // from class: X.0WNQ
    };
    public final String LL;

    public static C0WN8 valueOf(String str) {
        return (C0WN8) C08FF.LIZ(C0WN8.class, str);
    }

    public final String getValue() {
        return this.LL;
    }

    C0WN8(String str) {
        this.LL = str;
    }
}
