package X;

/* JADX INFO: renamed from: X.1DJ5, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public enum C1DJ5 {
    DYNAMIC_FRAMERATE,
    FIXED_FRAMERATE_FOR_ALL,
    FIXED_FRAMERATE_FOR_REAR,
    DYNAMIC_FRAMERATE_WITHOUT_SELECT;

    public static C1DJ5 valueOf(String str) {
        return (C1DJ5) C08FF.LIZ(C1DJ5.class, str);
    }
}
