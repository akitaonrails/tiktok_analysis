package X;

/* JADX INFO: renamed from: X.0Mx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC585000Mx0 {
    STATELESS("stateless"),
    COLD_STARTUP("cold_startup"),
    COLD_STARTUP_COMPLETED("cold_startup_completed"),
    FIRST_FEED_COMPLETED("first_feed_completed"),
    WARM_STARTUP("warm_startup");

    public final String label;

    public static EnumC585000Mx0 valueOf(String str) {
        return (EnumC585000Mx0) C08FF.LIZ(EnumC585000Mx0.class, str);
    }

    EnumC585000Mx0(String str) {
        this.label = str;
    }
}
