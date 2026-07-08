package X;

/* JADX INFO: renamed from: X.0CR1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CR1 extends Exception {
    public String message;
    public int statusCode;

    public String getMsg() {
        return this.message;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public C0CR1(int i, String str) {
        this.statusCode = i;
        this.message = str;
    }
}
