package X;

/* JADX INFO: renamed from: X.0YPQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public abstract class C0YPQ extends Exception {
    public static final C0YPP Companion = new C0YPP();

    public static final C0YPQ from(C0YMW c0ymw) {
        Companion.getClass();
        return C0YPP.LIZIZ(c0ymw);
    }

    public static final C0YPQ from(Exception exc) {
        Companion.getClass();
        return C0YPP.LIZ(exc);
    }

    public abstract int getCode();

    public C0YMW toIMError() {
        C0YMX c0ymxNewBuilder = C0YMW.newBuilder();
        c0ymxNewBuilder.LIZ.code = getCode();
        if (this instanceof C0YPR) {
            C0YPR c0ypr = (C0YPR) this;
            c0ymxNewBuilder.LIZ.status = c0ypr.getStatus();
            c0ymxNewBuilder.LIZ.statusMsg = c0ypr.getStatusMsg();
            c0ymxNewBuilder.LIZ.check = c0ypr.getCheck();
            c0ymxNewBuilder.LIZ.checkMsg = c0ypr.getCheckMsg();
            c0ymxNewBuilder.LIZ.logId = c0ypr.getLogId();
        } else if (this instanceof C0YPY) {
            c0ymxNewBuilder.LIZ.statusMsg = ((C0YPY) this).getMessage();
        } else {
            String message = getMessage();
            if (message == null) {
                message = "";
            }
            c0ymxNewBuilder.LIZ.statusMsg = message;
        }
        Throwable cause = getCause();
        if (cause != null) {
            c0ymxNewBuilder.LIZ.throwable = cause;
        }
        return c0ymxNewBuilder.LIZ;
    }

    public C0YPQ(String str, Throwable th) {
        super(str, th);
    }
}
