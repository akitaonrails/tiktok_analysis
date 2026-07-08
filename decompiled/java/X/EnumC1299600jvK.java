package X;

/* JADX INFO: renamed from: X.0jvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1299600jvK {
    CUSTOM("custom"),
    TIMER("timer"),
    EXPERIMENT("experiment");

    public final String LL;

    public static EnumC1299600jvK valueOf(String str) {
        return (EnumC1299600jvK) C08FF.LIZ(EnumC1299600jvK.class, str);
    }

    EnumC1299600jvK(String str) {
        this.LL = str;
    }
}
