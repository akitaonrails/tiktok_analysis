package X;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: X.0XIw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846560XIw {
    public static int LIZIZ(int i) {
        if (i < 1000) {
            return 30196;
        }
        if (i < 1100) {
            return 30103;
        }
        return (i < 1100 || i < 1200 || i >= 1300) ? 30196 : 30102;
    }

    public static int LIZ(Throwable th) {
        if (th == null) {
            return -1;
        }
        if (th instanceof ConnectTimeoutException) {
            return 1101;
        }
        if (th instanceof SocketTimeoutException) {
            return 1102;
        }
        if (th instanceof ConnectException) {
            return 1103;
        }
        if (th instanceof BindException) {
            return 1104;
        }
        if (th instanceof NoRouteToHostException) {
            return 1105;
        }
        if (th instanceof PortUnreachableException) {
            return 1106;
        }
        if (th instanceof UnknownHostException) {
            return 1107;
        }
        if (th instanceof SocketException) {
            return 1108;
        }
        if (th instanceof IllegalArgumentException) {
            return 1201;
        }
        if (th instanceof IllegalStateException) {
            return 1202;
        }
        if (th instanceof RuntimeException) {
            return 1203;
        }
        if (th instanceof InterruptedException) {
            return 1204;
        }
        if (th instanceof FileNotFoundException) {
            return 1205;
        }
        if (!(th instanceof IOException)) {
            return -1;
        }
        String message = th.getMessage();
        if (message != null && message.length() != 0) {
            if (!message.contains("canceled") && !message.contains("Canceled")) {
                if (message.contains("network not available")) {
                    return 1002;
                }
                return 1206;
            }
            return 1001;
        }
        return 1206;
    }
}
