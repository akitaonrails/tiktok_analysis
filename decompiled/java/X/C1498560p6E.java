package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* JADX INFO: renamed from: X.0p6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498560p6E {
    public static final Map<String, Map<String, Integer>> LIZ = new HashMap();

    public static int LIZJ(Throwable th) {
        int iIntValue = -1;
        if (th == null) {
            return -1;
        }
        Map<String, Map<String, Integer>> map = LIZ;
        HashMap map2 = (HashMap) map;
        if (map2.isEmpty()) {
            HashMap map3 = new HashMap();
            map3.put(" Bad Request", 101);
            map3.put(" Connection timed out", 102);
            map3.put(" Forbidden", 103);
            map3.put(" Gateway Time-out", 104);
            map3.put(" Internal Server Error", 105);
            map3.put(" Not Found", 106);
            map3.put(" Request Time-out", 107);
            map3.put(" Request-URI Too Large", 108);
            map2.put(C1494430ozZ.class.getSimpleName(), map3);
            HashMap map4 = new HashMap();
            map4.put("Content-Type: text/html", 201);
            map4.put("http/1.0 do not support range request", 202);
            map4.put("response code: 403 Error extra", 203);
            map4.put("response code: 504 Error extra", 204);
            map2.put("RequestException", map4);
            HashMap map5 = new HashMap();
            map5.put("ERR_ABORTED", 301);
            map5.put("ERR_ADDRESS_UNREACHABLE", 302);
            map5.put("ERR_CERT_AUTHORITY_INVALID", 303);
            map5.put("ERR_CERT_COMMON_NAME_INVALID", 304);
            map5.put("ERR_CERT_DATE_INVALID", 305);
            map5.put("ERR_CONNECTION_ABORTED", 306);
            map5.put("ERR_CONNECTION_CLOSED", 307);
            map5.put("ERR_CONNECTION_REFUSED", 308);
            map5.put("ERR_CONNECTION_RESET", 309);
            map5.put("ERR_CONNECTION_TIMED_OUT", 310);
            map5.put("ERR_EMPTY_RESPONSE", 311);
            map5.put("ERR_HTTP2_PING_FAILED", 312);
            map5.put("ERR_INCOMPLETE_CHUNKED_ENCODING", 313);
            map5.put("ERR_INTERNET_DISCONNECTED", 314);
            map5.put("ERR_NAME_NOT_RESOLVED", 315);
            map5.put("ERR_NETWORK_ACCESS_DENIED", 316);
            map5.put("ERR_PROXY_CONNECTION_FAILED", 317);
            map5.put("ERR_SOCKET_NOT_CONNECTED", 318);
            map5.put("ERR_SSL_BAD_RECORD_MAC_ALERT", 319);
            map5.put("ERR_SSL_PROTOCOL_ERROR", 320);
            map5.put("ERR_TIMED_OUT", 321);
            map5.put("ERR_TTNET_APP_TIMED_OUT", 322);
            map5.put("ERR_TTNET_APP_UPLOAD_EXCEPTION", 323);
            map5.put("ERR_TUNNEL_CONNECTION_FAILED", 324);
            map2.put("NetworkExceptionImpl", map5);
            HashMap map6 = new HashMap();
            map6.put("ERR_NETWORK_CHANGED", 401);
            map2.put("QuicExceptionImpl", map6);
            HashMap map7 = new HashMap();
            map7.put(" Unexpected end of ZLIB input stream", 501);
            map2.put(EOFException.class.getSimpleName(), map7);
            HashMap map8 = new HashMap();
            map8.put(" unexpected end of stream on Connection", 601);
            map8.put(" Unexpected request usage", 602);
            map2.put(IOException.class.getSimpleName(), map8);
            HashMap map9 = new HashMap();
            map9.put("Cronet internal request fail", 701);
            map2.put(Exception.class.getSimpleName(), map9);
            HashMap map10 = new HashMap();
            map10.put(" Content received is less than Content-Length", 801);
            map10.put(" expected bytes but received", 802);
            map10.put(" unexpected end of stream", 803);
            map2.put(ProtocolException.class.getSimpleName(), map10);
            HashMap map11 = new HashMap();
            map11.put(" Connection closed by peer", 901);
            map11.put(" Read error", 902);
            map11.put(" SSL handshake aborted", 903);
            map2.put(SSLException.class.getSimpleName(), map11);
            HashMap map12 = new HashMap();
            map12.put(" Connection closed by peer", 1001);
            map12.put(" Handshake failed", 1002);
            map12.put(" SSL handshake aborted", 1003);
            map2.put(SSLHandshakeException.class.getSimpleName(), map12);
            HashMap map13 = new HashMap();
            map13.put(" Hostname not verified", 1101);
            map2.put(SSLPeerUnverifiedException.class.getSimpleName(), map13);
            HashMap map14 = new HashMap();
            map14.put(" Read error", 1201);
            map2.put(SSLProtocolException.class.getSimpleName(), map14);
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return -1;
        }
        int iIndexOf = message.indexOf(44);
        if (iIndexOf > 0) {
            message = message.substring(0, iIndexOf);
        }
        Map map15 = (Map) ((HashMap) map).get(th.getClass().getSimpleName());
        if (map15 != null && !map15.isEmpty()) {
            Iterator it2 = map15.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (message.contains((CharSequence) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (num != null && (iIntValue = num.intValue()) >= 0) {
                        return iIntValue;
                    }
                }
            }
        }
        if (th instanceof C1494430ozZ) {
            return 199;
        }
        if (th instanceof EOFException) {
            return 599;
        }
        if (!(th instanceof IOException)) {
            return iIntValue;
        }
        return 699;
    }

    public static boolean LIZLLL(Context context) {
        try {
            NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ((ConnectivityManager) C786410Ut5.H2(context, "connectivity"));
            if (networkInfoLJIJ == null) {
                return false;
            }
            if (!networkInfoLJIJ.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r4, java.lang.Throwable r5) {
        /*
            boolean r0 = r5 instanceof org.apache.http.conn.ConnectTimeoutException
            r3 = 14
            r2 = 15
            if (r0 == 0) goto L19
            r1 = 13
        La:
            if (r4 == 0) goto L18
            if (r1 == r2) goto L10
            if (r1 != r3) goto L18
        L10:
            boolean r0 = LIZLLL(r4)
            if (r0 != 0) goto L18
            r1 = 12
        L18:
            return r1
        L19:
            boolean r0 = r5 instanceof java.net.SocketTimeoutException
            if (r0 == 0) goto L20
            r1 = 14
            goto La
        L20:
            boolean r0 = r5 instanceof java.net.SocketException
            if (r0 != 0) goto L46
            boolean r0 = r5 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r0 == 0) goto L2b
            r1 = 21
            goto La
        L2b:
            boolean r0 = r5 instanceof X.C1494430ozZ
            if (r0 == 0) goto L3f
            X.0ozZ r5 = (X.C1494430ozZ) r5
            int r1 = r5.getStatusCode()
            r0 = 503(0x1f7, float:7.05E-43)
            if (r1 != r0) goto L3c
            r1 = 19
            goto La
        L3c:
            r1 = 16
            goto La
        L3f:
            boolean r0 = r5 instanceof java.io.IOException
            if (r0 != 0) goto L46
            r1 = 18
            goto La
        L46:
            r1 = 15
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1498560p6E.LIZ(android.content.Context, java.lang.Throwable):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec A[Catch: Exception -> 0x01c0, TryCatch #0 {Exception -> 0x01c0, blocks: (B:84:0x00de, B:87:0x00ec, B:89:0x00f0, B:91:0x00f8, B:93:0x0100, B:95:0x0108, B:97:0x0110, B:100:0x011a, B:103:0x0124), top: B:159:0x00de }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(java.lang.Throwable r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1498560p6E.LIZIZ(java.lang.Throwable, java.lang.String[]):int");
    }
}
