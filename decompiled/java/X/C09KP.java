package X;

/* JADX INFO: renamed from: X.09KP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09KP extends Exception {
    public final int LL;

    public final int getErrorCode() {
        return this.LL;
    }

    public C09KP(String str, int i) {
        super(str);
        this.LL = i;
    }
}
