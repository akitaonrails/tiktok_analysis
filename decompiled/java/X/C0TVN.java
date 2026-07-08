package X;

/* JADX INFO: renamed from: X.0TVN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public enum C0TVN {
    PLAIN_TEXT,
    PHONE_NUMBER,
    EMAIL;

    public static C0TVN valueOf(String str) {
        return (C0TVN) C08FF.LIZ(C0TVN.class, str);
    }
}
