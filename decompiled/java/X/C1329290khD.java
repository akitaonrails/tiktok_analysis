package X;

/* JADX INFO: renamed from: X.0khD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1329290khD extends IllegalStateException implements InterfaceC1331300kkS {
    public final int LL;
    public final String LLILLJJLI;

    public int getErrorCode() {
        return this.LL;
    }

    @Override // X.InterfaceC1331300kkS
    public String getErrorMessage() {
        return this.LLILLJJLI;
    }

    public C1329290khD(int i, String str) {
        super(str);
        this.LL = i;
        this.LLILLJJLI = str;
    }

    public C1329290khD(int i, String str, Throwable th) {
        super(str, th);
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
