package X;

/* JADX INFO: renamed from: X.1DIT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DIT {
    NONE,
    DEFAULT_PRIMARY,
    FRONT_PRIMARY,
    BACK_PRIMARY,
    FRONT_PRIMARY_MULTI_RENDER,
    BACK_PRIMARY_MULTI_RENDER;

    public static C1DIT valueOf(String str) {
        return (C1DIT) C08FF.LIZ(C1DIT.class, str);
    }
}
