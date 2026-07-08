package X;

/* JADX INFO: renamed from: X.0IIQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public enum C0IIQ {
    CLICK("click"),
    DRAW("draw"),
    ERROR("error");

    public int detailReason;
    public String reason;

    public static C0IIQ valueOf(String str) {
        return (C0IIQ) C08FF.LIZ(C0IIQ.class, str);
    }

    C0IIQ(String str) {
        this.reason = str;
    }
}
