package X;

/* JADX INFO: renamed from: X.0Tfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752620Tfg {
    public static C760160Trq LIZ(String str, Throwable th) {
        C760160Trq c760160TrqLIZIZ = C759970TrX.LIZIZ(str);
        if (th instanceof C477520Io2) {
            C477520Io2 c477520Io2 = (C477520Io2) th;
            c760160TrqLIZIZ.LIZLLL("url", c477520Io2.getUrl());
            c760160TrqLIZIZ.LIZIZ(Integer.valueOf(c477520Io2.getErrorCode()), "error_code");
            c760160TrqLIZIZ.LIZLLL("error_msg", c477520Io2.getErrorMsg());
            c760160TrqLIZIZ.LIZLLL("error_alert", c477520Io2.getAlert());
            c760160TrqLIZIZ.LIZLLL("error_prompt", c477520Io2.getPrompt());
            return c760160TrqLIZIZ;
        }
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            c760160TrqLIZIZ.LIZIZ(Integer.valueOf(c501470JlZ.getErrorCode()), "error_code");
            c760160TrqLIZIZ.LIZLLL("error_msg", c501470JlZ.getErrorMsg());
            c760160TrqLIZIZ.LIZLLL("error_alert", c501470JlZ.getAlert());
            c760160TrqLIZIZ.LIZLLL("error_prompt", c501470JlZ.getPrompt());
            return c760160TrqLIZIZ;
        }
        if (th instanceof C501500Jlc) {
            c760160TrqLIZIZ.LIZIZ(1, "error_code");
            c760160TrqLIZIZ.LIZLLL("error_msg", ((C501500Jlc) th).getMessage());
            return c760160TrqLIZIZ;
        }
        C20441214yg.LJI("LiveBroadcastBusinessLog", th);
        c760160TrqLIZIZ.LIZIZ(1, "error_code");
        c760160TrqLIZIZ.LIZLLL("error_msg", th.getMessage());
        return c760160TrqLIZIZ;
    }
}
