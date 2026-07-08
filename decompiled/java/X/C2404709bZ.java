package X;

/* JADX INFO: renamed from: X.09bZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2404709bZ extends Exception {
    public final String LL;

    public C2404709bZ() {
        this(null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    public C2404709bZ(String str) {
        this.LL = str;
    }
}
