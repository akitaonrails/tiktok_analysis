package X;

/* JADX INFO: renamed from: X.0fkh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1139250fkh extends RuntimeException {
    public final C1139230fkf LL;

    public long getResourceId() {
        return this.LL.LIZIZ;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.toString());
        sbLIZ.append("\navailable disk space:");
        sbLIZ.append(C2193608ic.LIZ());
        sbLIZ.append("KB\n");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String string = super.toString();
        Throwable cause = getCause();
        if (cause == null || cause == this) {
            return string;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(string);
        sbLIZ.append("\n");
        sbLIZ.append(cause.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1139230fkf getResourceRequest() {
        return this.LL;
    }

    public C1139250fkh(C1139230fkf c1139230fkf) {
        this.LL = c1139230fkf;
    }

    public C1139250fkh(String str, C1139230fkf c1139230fkf) {
        super(str);
        this.LL = c1139230fkf;
    }

    public C1139250fkh(String str, Throwable th, C1139230fkf c1139230fkf) {
        super(str, th);
        this.LL = c1139230fkf;
    }
}
