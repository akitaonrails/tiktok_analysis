package X;

/* JADX INFO: renamed from: X.0YPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873730YPj extends C0YPQ {
    public final int code;
    public final String message;

    @Override // X.C0YPQ
    public int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public C873730YPj(String str) {
        super(str, null);
        this.message = str;
        this.code = -1043;
    }
}
