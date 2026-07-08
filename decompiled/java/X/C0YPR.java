package X;

/* JADX INFO: renamed from: X.0YPR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPR extends C0YPQ {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemoteIMException(code=");
        sbLIZ.append(getCode());
        sbLIZ.append(", status=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", statusMsg=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long getCheck() {
        return this.LLILZ;
    }

    public final String getCheckMsg() {
        return this.LLILZIL;
    }

    @Override // X.C0YPQ
    public int getCode() {
        return this.LL;
    }

    public final String getLogId() {
        return this.LLILZLL;
    }

    public final int getStatus() {
        return this.LLILLJJLI;
    }

    public final String getStatusMsg() {
        return this.LLILLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0YPR(int i, int i2, String str, long j, String str2, String str3, Throwable th) {
        String strLIZIZ;
        if (str.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Remote error: code=");
            sbLIZ.append(i);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = str;
        }
        super(strLIZIZ, th);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = str;
        this.LLILZ = j;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
    }
}
