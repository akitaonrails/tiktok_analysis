package X;

import java.net.URL;

/* JADX INFO: renamed from: X.0ozz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494690ozz extends C1494460ozc {
    public final int LL;
    public final int LLILLJJLI;
    public final C1494890p0J LLILLL;

    public C1494600ozq getRequestInfo() {
        return (C1494600ozq) this.infoObj;
    }

    public String getRequestLog() {
        return getRequestInfo().LJJIIJ;
    }

    public int getCronetInternalErrorCode() {
        return this.LLILLJJLI;
    }

    public C1494890p0J getCronetRequestExtraInfo() {
        return this.LLILLL;
    }

    public int getStatusCode() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1494690ozz(Exception exc, C1494600ozq c1494600ozq, int i) {
        Throwable cause;
        String string;
        String message = exc.getMessage();
        if (exc.getCause() == null) {
            cause = exc;
        } else {
            cause = exc.getCause();
        }
        super(message, cause);
        URL url = c1494600ozq.LJIIZILJ;
        if (url != null) {
            string = url.toString();
        } else {
            string = "";
        }
        super.setInfo(false, true, string, c1494600ozq.LJJIJIIJIL, c1494600ozq);
        this.LLILLJJLI = i;
        if (exc instanceof C1494430ozZ) {
            this.LL = ((C1494430ozZ) exc).getStatusCode();
        }
        Object obj = c1494600ozq.LIZLLL.LJLJI.LJ.LIZLLL;
        if (obj instanceof C1494890p0J) {
            this.LLILLL = (C1494890p0J) obj;
        }
    }
}
