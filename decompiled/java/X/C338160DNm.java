package X;

/* JADX INFO: renamed from: X.0DNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338160DNm extends RuntimeException {
    public static final int $stable = 8;
    public final String LL;

    public C338160DNm() {
        this(null);
    }

    public final String getErrorMessage() {
        return this.LL;
    }

    public C338160DNm(String str) {
        super(str);
        this.LL = str;
    }
}
