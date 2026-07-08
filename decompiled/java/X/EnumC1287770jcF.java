package X;

/* JADX INFO: renamed from: X.0jcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1287770jcF {
    PREFETCH_ENABLED("prefetch_enabled"),
    LOADING_ENABLED("native_loading_enabled"),
    NSR_ENABLED("nsr_enabled"),
    NSR_HIT("nsr_hit"),
    SNAPSHOT_ENABLED("snapshot_enabled"),
    SNAPSHOT_HIT("snapshot_hit");

    public final String LL;

    public String getValue() {
        return this.LL;
    }

    public static EnumC1287770jcF valueOf(String str) {
        return (EnumC1287770jcF) C08FF.LIZ(EnumC1287770jcF.class, str);
    }

    EnumC1287770jcF(String str) {
        this.LL = str;
    }
}
