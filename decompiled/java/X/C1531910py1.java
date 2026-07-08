package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0py1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531910py1 extends Exception implements InterfaceC1532190pyT {
    public final int LL;
    public final Integer LLILLJJLI;
    public final Map<String, String> LLILLL;
    public String LLILZ;

    @Override // X.InterfaceC1532190pyT
    public String getFilepath() {
        return null;
    }

    @Override // X.InterfaceC1532190pyT
    public Integer getResourceSize() {
        return null;
    }

    @Override // X.InterfaceC1532190pyT
    public String getResourceUniqueId() {
        return null;
    }

    @Override // X.InterfaceC1532190pyT
    public Long getVersion() {
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("errorCode: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", http code: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", errorMessage: ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMessage() {
        return this.LLILZ;
    }

    public final Map<String, String> getHeaders() {
        return this.LLILLL;
    }

    public final Integer getHttpResponseCode() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1532190pyT
    public Map<String, String> getHttpResponseHeaders() {
        return this.LLILLL;
    }

    public final void setErrorMessage$forestx_release(String str) {
        this.LLILZ = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1531910py1(int i, Integer num, String str, Map<String, String> map) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str);
        super(C2188811AlT.LIZIZ(sbLIZ));
        this.LL = i;
        this.LLILLJJLI = num;
        this.LLILLL = map;
        this.LLILZ = str;
    }
}
