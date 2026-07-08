package X;

/* JADX INFO: renamed from: X.0T5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741250T5v extends RuntimeException {
    public C741250T5v() {
        this(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C741250T5v(String str) {
        if (str != null) {
            str.toString();
        } else {
            str = "The operation has been canceled.";
        }
        super(str);
    }
}
