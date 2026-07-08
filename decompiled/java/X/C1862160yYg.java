package X;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862160yYg {
    public static C1862200yYk LIZ(Throwable th) {
        Class<?> cls;
        String message;
        C1862200yYk c1862200yYk = new C1862200yYk();
        if (th instanceof C1494450ozb) {
            c1862200yYk.LIZ = -2;
            c1862200yYk.LIZIZ = 1;
            c1862200yYk.LIZ(th.getMessage());
        } else {
            int i = 100;
            if (th instanceof C1494690ozz) {
                C1494690ozz c1494690ozz = (C1494690ozz) th;
                int statusCode = c1494690ozz.getStatusCode();
                if (statusCode > 0) {
                    c1862200yYk.LIZ = -3;
                    c1862200yYk.LIZIZ = statusCode;
                } else {
                    c1862200yYk.LIZ = -2;
                    c1862200yYk.LIZIZ = 100;
                }
                String message2 = c1494690ozz.getMessage();
                if (message2 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('(');
                    sbLIZ.append(statusCode);
                    sbLIZ.append(')');
                    int length = message2.length();
                    if (length <= 100) {
                        i = length;
                    }
                    sbLIZ.append(message2.substring(0, i));
                    c1862200yYk.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (a0.LJJIIZI(message2, "PROXY_CONNECTION_FAILED", false)) {
                        c1862200yYk.LIZIZ = 2;
                        return c1862200yYk;
                    }
                    if (a0.LJJIIZI(message2, "HTTP2_PROTOCOL_ERROR", false)) {
                        c1862200yYk.LIZIZ = 3;
                        return c1862200yYk;
                    }
                    if (a0.LJJIIZI(message2, "TTNET_APP_TIMED_OUT", false)) {
                        c1862200yYk.LIZIZ = 4;
                        return c1862200yYk;
                    }
                }
            } else {
                if (th != null) {
                    cls = th.getClass();
                } else {
                    cls = null;
                }
                if (Intrinsics.LJFF(cls, IOException.class)) {
                    String message3 = th.getMessage();
                    if (message3 != null) {
                        if (a0.LJJIIZI(message3, "missing CR", false)) {
                            c1862200yYk.LIZ = -4;
                            c1862200yYk.LIZIZ = 3;
                        } else if (a0.LJJIIZI(message3, "Premature EOF", false)) {
                            c1862200yYk.LIZ = -4;
                            c1862200yYk.LIZIZ = 2;
                        } else {
                            c1862200yYk.LIZ = -2;
                            c1862200yYk.LIZIZ = 101;
                        }
                    }
                    c1862200yYk.LIZ(th.getMessage());
                    return c1862200yYk;
                }
                if (th instanceof C2329809Ay) {
                    c1862200yYk.LIZ = -4;
                    c1862200yYk.LIZIZ = 1;
                    c1862200yYk.LIZ(th.getMessage());
                    return c1862200yYk;
                }
                if (th instanceof C501470JlZ) {
                    c1862200yYk.LIZ = -5;
                    C501470JlZ c501470JlZ = (C501470JlZ) th;
                    c1862200yYk.LIZIZ = c501470JlZ.getErrorCode();
                    c1862200yYk.LIZ(c501470JlZ.getMessage());
                    return c1862200yYk;
                }
                c1862200yYk.LIZ = -2;
                if (th != null && (message = th.getMessage()) != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(th.getClass().getName());
                    sbLIZ2.append('(');
                    int length2 = message.length();
                    if (length2 <= 100) {
                        i = length2;
                    }
                    sbLIZ2.append(message.substring(0, i));
                    sbLIZ2.append(')');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c1862200yYk.LIZ(strLIZIZ);
                    if (a0.LJJIIZI(strLIZIZ, "TTNET_APP_TIMED_OUT", false)) {
                        c1862200yYk.LIZ = -4;
                        return c1862200yYk;
                    }
                }
            }
        }
        return c1862200yYk;
    }
}
