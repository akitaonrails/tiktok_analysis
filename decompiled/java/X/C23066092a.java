package X;

/* JADX INFO: renamed from: X.092a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23066092a extends Exception {
    public final int LL;

    public int getResponseCode() {
        return this.LL;
    }

    public C23066092a(int i, String str) {
        super(str);
        this.LL = i;
    }

    public C23066092a(int i, Throwable th) {
        super(th);
        this.LL = i;
    }
}
