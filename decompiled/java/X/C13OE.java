package X;

/* JADX INFO: renamed from: X.13OE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public abstract class C13OE<T> {
    public abstract T getResponseData();

    public abstract String getResponseMessage();

    public abstract int getStatusCode();

    public final boolean checkStatusCode() {
        return getStatusCode() == 0;
    }

    public boolean checkValue() {
        return getResponseData() != null;
    }
}
