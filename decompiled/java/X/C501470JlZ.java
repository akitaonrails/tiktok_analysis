package X;

/* JADX INFO: renamed from: X.0JlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C501470JlZ extends C501520Jle {
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public Object LLILZLL;
    public String LLIZ;

    @Override // X.C501520Jle, java.lang.Throwable
    public String getMessage() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" TYPE = ApiServerException, errorMsg = ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" extra = ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(" ");
        sbLIZ.append(super.getMessage());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getAlert() {
        return this.LLILZ;
    }

    public Object getData() {
        return this.LLILZLL;
    }

    public String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public String getExtra() {
        return this.LLILZIL;
    }

    public String getLogId() {
        return this.LLIZ;
    }

    public String getPrompt() {
        return this.LLILLL;
    }

    public C501470JlZ(int i) {
        super(i);
    }

    public C501470JlZ setAlert(String str) {
        this.LLILZ = str;
        return this;
    }

    public C501470JlZ setData(Object obj) {
        this.LLILZLL = obj;
        return this;
    }

    public C501470JlZ setErrorMsg(String str) {
        this.LLILLJJLI = str;
        return this;
    }

    public C501470JlZ setExtra(String str) {
        this.LLILZIL = str;
        return this;
    }

    public C501470JlZ setLogId(String str) {
        this.LLIZ = str;
        return this;
    }

    public C501470JlZ setPrompt(String str) {
        this.LLILLL = str;
        return this;
    }
}
