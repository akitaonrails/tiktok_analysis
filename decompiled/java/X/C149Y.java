package X;

/* JADX INFO: renamed from: X.149Y, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C149Y {
    SDK_INIT_ADD_RETRY_FILTER_ERROR(1001),
    SDK_INIT_CHECK_CONFIG_ERROR(1002);

    public final int LL;

    public int getCode() {
        return this.LL;
    }

    public static C149Y valueOf(String str) {
        return (C149Y) C08FF.LIZ(C149Y.class, str);
    }

    C149Y(int i) {
        this.LL = i;
    }
}
