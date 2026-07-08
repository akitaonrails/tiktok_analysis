package X;

import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AwS567S0100000_23;
import org.apache.http.conn.ConnectTimeoutException;

/* JADX INFO: renamed from: X.0pBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1501910pBd {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            return 13;
        }
        if (th instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    return 21;
                }
                if (th instanceof C1500760p9m) {
                    if (((C1500760p9m) th).code() == 503) {
                        return 19;
                    }
                    return 16;
                }
                if (!(th instanceof IOException)) {
                    return 18;
                }
            }
            i = 15;
        }
        C1518550pcT.LIZ.getClass();
        AwS567S0100000_23 awS567S0100000_23 = C1518550pcT.LJ;
        if (awS567S0100000_23 != null && ((Boolean) awS567S0100000_23.invoke()).booleanValue()) {
            return i;
        }
        return 12;
    }
}
