package X;

/* JADX INFO: renamed from: X.0jb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1287080jb8 {
    EXCEPTION("exception"),
    PV("pv"),
    NSR_PERFORMANCE("nsr_worker_performance");

    public final String LL;

    public String getValue() {
        return this.LL;
    }

    public static EnumC1287080jb8 valueOf(String str) {
        return (EnumC1287080jb8) C08FF.LIZ(EnumC1287080jb8.class, str);
    }

    EnumC1287080jb8(String str) {
        this.LL = str;
    }
}
