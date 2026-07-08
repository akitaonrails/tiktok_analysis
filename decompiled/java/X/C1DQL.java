package X;

/* JADX INFO: renamed from: X.1DQL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DQL {
    AUTO("auto"),
    LIGHT("light"),
    DARK("dark");

    public static final C1DQM Companion = new C1DQM();
    public final String LL;

    public static C1DQL valueOf(String str) {
        return (C1DQL) C08FF.LIZ(C1DQL.class, str);
    }

    public final String getVALUE() {
        return this.LL;
    }

    C1DQL(String str) {
        this.LL = str;
    }
}
