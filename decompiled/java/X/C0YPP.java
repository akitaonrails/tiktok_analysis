package X;

/* JADX INFO: renamed from: X.0YPP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YPP {
    public static C0YPQ LIZ(Exception exc) {
        if (exc instanceof C0YPQ) {
            return (C0YPQ) exc;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        return new C0YPY(-9999, message, exc);
    }

    public static C0YPR LIZIZ(C0YMW c0ymw) {
        int code = c0ymw.getCode();
        int status = c0ymw.getStatus();
        String statusMsg = c0ymw.getStatusMsg();
        String str = "";
        if (statusMsg == null) {
            statusMsg = "";
        }
        long check = c0ymw.getCheck();
        String checkMsg = c0ymw.getCheckMsg();
        if (checkMsg == null) {
            checkMsg = "";
        }
        String logId = c0ymw.getLogId();
        if (logId != null) {
            str = logId;
        }
        return new C0YPR(code, status, statusMsg, check, checkMsg, str, c0ymw.getThrowable());
    }
}
