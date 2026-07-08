package X;

/* JADX INFO: renamed from: X.0fkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139280fkk extends C1139250fkh {
    public final String LLILLJJLI;

    @Override // X.C1139250fkh, java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("md5:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("\n");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1139280fkk(C1139230fkf c1139230fkf, String str) {
        super(c1139230fkf);
        this.LLILLJJLI = str;
    }

    public C1139280fkk(String str, C1139230fkf c1139230fkf, String str2) {
        super(str, c1139230fkf);
        this.LLILLJJLI = str2;
    }

    public C1139280fkk(String str, Throwable th, C1139230fkf c1139230fkf, String str2) {
        super(str, th, c1139230fkf);
        this.LLILLJJLI = str2;
    }
}
