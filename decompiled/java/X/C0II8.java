package X;

/* JADX INFO: renamed from: X.0II8, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0II8 {
    FEED_LIVE(1),
    INNER_LIVE(2),
    PIP_LIVE(3);

    public final int value;

    public static C0II8 valueOf(String str) {
        return (C0II8) C08FF.LIZ(C0II8.class, str);
    }

    C0II8(int i) {
        this.value = i;
    }
}
