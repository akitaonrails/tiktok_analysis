package X;

/* JADX INFO: renamed from: X.0IRD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0IRD {
    IDLE,
    DELAY_AND_WAIT_READY,
    DELAY_NOT_WAIT_READY,
    WAIT_READY_WITH_TIMEOUT;

    public static C0IRD valueOf(String str) {
        return (C0IRD) C08FF.LIZ(C0IRD.class, str);
    }
}
