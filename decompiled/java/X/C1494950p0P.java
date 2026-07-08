package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* JADX INFO: renamed from: X.0p0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494950p0P {
    public static int LIZJ(IOException iOException) {
        Throwable cause;
        if (iOException instanceof SSLHandshakeException) {
            return -148;
        }
        if (iOException instanceof SSLKeyException) {
            return -149;
        }
        if (iOException instanceof SSLProtocolException) {
            return -107;
        }
        if (iOException instanceof SSLPeerUnverifiedException) {
            return -153;
        }
        if (iOException instanceof UnknownHostException) {
            return -105;
        }
        if (iOException instanceof ConnectException) {
            return LIZ(iOException, -104);
        }
        if (iOException instanceof PortUnreachableException) {
            return -108;
        }
        if (iOException instanceof NoRouteToHostException) {
            return -109;
        }
        if (iOException instanceof BindException) {
            return -147;
        }
        if (iOException instanceof SocketException) {
            return LIZ(iOException, -15);
        }
        if (iOException instanceof MalformedURLException) {
            return -300;
        }
        if (iOException instanceof SocketTimeoutException) {
            return -118;
        }
        if (iOException instanceof ProtocolException) {
            return -901;
        }
        if (iOException instanceof HttpRetryException) {
            String message = iOException.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains("Too many follow-up requests")) {
                return -310;
            }
            return -196;
        }
        if (iOException instanceof UnknownServiceException) {
            return -902;
        }
        if (iOException != null) {
            if ("Canceled#Reason=-199".equals(iOException.getMessage())) {
                return -199;
            }
            if (iOException != null) {
                if (!"Canceled#Reason=-192".equals(iOException.getMessage())) {
                    if ((iOException instanceof InterruptedIOException) && (cause = iOException.getCause()) != null && !TextUtils.isEmpty(cause.getMessage()) && "Canceled#Reason=-192".equals(cause.getMessage())) {
                        return -192;
                    }
                    return -1;
                }
                return -192;
            }
            return -1;
        }
        return -1;
    }

    public static int LIZ(IOException iOException, int i) {
        if (iOException == null) {
            return i;
        }
        try {
            int iLIZIZ = LIZIZ(i, iOException.getMessage());
            if (iLIZIZ != i) {
                return iLIZIZ;
            }
            try {
                Throwable cause = iOException.getCause();
                if (cause == null) {
                    return iLIZIZ;
                }
                String message = cause.getMessage();
                if (TextUtils.isEmpty(message)) {
                    return iLIZIZ;
                }
                return LIZIZ(i, message);
            } catch (Throwable th) {
                th = th;
                i = iLIZIZ;
                TryCatchGuardChecker.doCheck(th);
                return i;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static int LIZIZ(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        if (!str.contains("ECONNRESET") && !str.contains("Connection reset") && !str.contains("reset by peer")) {
            if (str.contains("ECONNREFUSED")) {
                return -102;
            }
            if (!str.contains("CONNECTION_ABORTED") && !str.contains("connection abort")) {
                if (!str.contains("ENETDOWN") && !str.contains("Network is unreachable")) {
                    if (!str.contains("EHOSTUNREACH") && !str.contains("ENETUNREACH")) {
                        if (str.contains("EADDRNOTAVAIL")) {
                            return -108;
                        }
                        if (!str.contains("EADDRINUSE")) {
                            return i;
                        }
                        return -147;
                    }
                    return -109;
                }
                return -106;
            }
            return -103;
        }
        return -101;
    }
}
