package X;

/* JADX INFO: renamed from: X.19AU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public enum C19AU {
    NONE,
    ACTIVITY_CREATED,
    START,
    RESUME,
    PAUSE,
    STOP;

    public static C19AU valueOf(String str) {
        return (C19AU) C08FF.LIZ(C19AU.class, str);
    }
}
