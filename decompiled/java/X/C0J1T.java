package X;

/* JADX INFO: renamed from: X.0J1T, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0J1T {
    ATTACH,
    CREATE,
    CREATE_VIEW,
    START,
    RESUME,
    PAUSE,
    STOP,
    DESTROY_VIEW,
    DESTROY,
    DETACH;

    public static C0J1T valueOf(String str) {
        return (C0J1T) C08FF.LIZ(C0J1T.class, str);
    }
}
