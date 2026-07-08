package X;

/* JADX INFO: renamed from: X.1DF9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DF9 {
    CPU_ACQUIRED,
    BLOCKING,
    PARKING,
    DORMANT,
    TERMINATED;

    public static C1DF9 valueOf(String str) {
        return (C1DF9) C08FF.LIZ(C1DF9.class, str);
    }
}
