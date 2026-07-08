package X;

/* JADX INFO: renamed from: X.0ppq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526840ppq extends Exception implements InterfaceC1526740ppg {
    public int LL;

    @Override // X.InterfaceC1526740ppg
    public String getErrorMsg() {
        return getMessage();
    }

    @Override // X.InterfaceC1526740ppg
    public int getErrorCode() {
        return this.LL;
    }

    public void setErrorCode(int i) {
        this.LL = i;
    }

    public C1526840ppq(int i, String str) {
        super(str);
        this.LL = i;
    }
}
