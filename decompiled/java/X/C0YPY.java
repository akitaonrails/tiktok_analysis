package X;

/* JADX INFO: renamed from: X.0YPY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPY extends C0YPQ {
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalIMException(code=");
        sbLIZ.append(getCode());
        sbLIZ.append(", message=");
        sbLIZ.append(getMessage());
        sbLIZ.append(", detail=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0YPQ
    public int getCode() {
        return this.LL;
    }

    public final String getDetail() {
        return this.LLILLL;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LLILLJJLI;
    }

    public C0YPY(int i, String str, Throwable th) {
        this(i, str, null, th);
    }

    public C0YPY(int i, String str, String str2, Throwable th) {
        super(str, th);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
