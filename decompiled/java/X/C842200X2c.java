package X;

/* JADX INFO: renamed from: X.0X2c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842200X2c extends AbstractC842510X3h {
    public final String LL;
    public final long LLILLJJLI;
    public final InterfaceC1496620p36 LLILLL;

    @Override // X.AbstractC842510X3h
    public final C0X0P contentType() {
        String str = this.LL;
        if (str != null) {
            return C0X0P.LIZJ(str);
        }
        return null;
    }

    @Override // X.AbstractC842510X3h
    public final long contentLength() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC842510X3h
    public final InterfaceC1496620p36 source() {
        return this.LLILLL;
    }

    public C842200X2c(String str, long j, C1496670p3B c1496670p3B) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = c1496670p3B;
    }
}
