package X;

import android.text.TextUtils;
import com.ttnet.org.chromium.net.impl.o0;
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

/* JADX INFO: renamed from: X.0p6F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498570p6F {
    public static final Map<String, Map<String, Integer>> LIZ = new HashMap();

    public static int LIZ(Throwable th) {
        HashMap map = (HashMap) LIZ;
        if (map.isEmpty()) {
            HashMap map2 = new HashMap();
            map2.put(" Bad Request", 101);
            map2.put(" Connection timed out", 102);
            map2.put(" Forbidden", 103);
            map2.put(" Gateway Time-out", 104);
            map2.put(" Internal Server Error", 105);
            map2.put(" Not Found", 106);
            map2.put(" Request Time-out", 107);
            map2.put(" Request-URI Too Large", 108);
            map.put(C1494430ozZ.class.getSimpleName(), map2);
            HashMap map3 = new HashMap();
            map3.put("ERR_ABORTED", 301);
            map3.put("ERR_ADDRESS_UNREACHABLE", 302);
            map3.put("ERR_CERT_AUTHORITY_INVALID", 303);
            map3.put("ERR_CERT_COMMON_NAME_INVALID", 304);
            map3.put("ERR_CERT_DATE_INVALID", 305);
            map3.put("ERR_CONNECTION_ABORTED", 306);
            map3.put("ERR_CONNECTION_CLOSED", 307);
            map3.put("ERR_CONNECTION_REFUSED", 308);
            map3.put("ERR_CONNECTION_RESET", 309);
            map3.put("ERR_CONNECTION_TIMED_OUT", 310);
            map3.put("ERR_EMPTY_RESPONSE", 311);
            map3.put("ERR_HTTP2_PING_FAILED", 312);
            map3.put("ERR_INCOMPLETE_CHUNKED_ENCODING", 313);
            map3.put("ERR_INTERNET_DISCONNECTED", 314);
            map3.put("ERR_NAME_NOT_RESOLVED", 315);
            map3.put("ERR_NETWORK_ACCESS_DENIED", 316);
            map3.put("ERR_PROXY_CONNECTION_FAILED", 317);
            map3.put("ERR_SOCKET_NOT_CONNECTED", 318);
            map3.put("ERR_SSL_BAD_RECORD_MAC_ALERT", 319);
            map3.put("ERR_SSL_PROTOCOL_ERROR", 320);
            map3.put("ERR_TIMED_OUT", 321);
            map3.put("ERR_TTNET_APP_TIMED_OUT", 322);
            map3.put("ERR_TTNET_APP_UPLOAD_EXCEPTION", 323);
            map3.put("ERR_TUNNEL_CONNECTION_FAILED", 324);
            map.put("NetworkExceptionImpl", map3);
            HashMap map4 = new HashMap();
            map4.put("ERR_NETWORK_CHANGED", 401);
            map.put(o0.class.getSimpleName(), map4);
            HashMap map5 = new HashMap();
            map5.put(" Unexpected end of ZLIB input stream", 501);
            map.put(EOFException.class.getSimpleName(), map5);
            HashMap map6 = new HashMap();
            map6.put(" unexpected end of stream on Connection", 601);
            map6.put(" Unexpected request usage", 602);
            map.put(IOException.class.getSimpleName(), map6);
            HashMap map7 = new HashMap();
            map7.put("Cronet internal request fail", 701);
            map.put(Exception.class.getSimpleName(), map7);
            HashMap map8 = new HashMap();
            map8.put(" Content received is less than Content-Length", 801);
            map8.put(" expected bytes but received", 802);
            map8.put(" unexpected end of stream", 803);
            map.put(ProtocolException.class.getSimpleName(), map8);
            HashMap map9 = new HashMap();
            map9.put(" Connection closed by peer", 901);
            map9.put(" Read error", 902);
            map9.put(" SSL handshake aborted", 903);
            map.put(SSLException.class.getSimpleName(), map9);
            HashMap map10 = new HashMap();
            map10.put(" Connection closed by peer", 1001);
            map10.put(" Handshake failed", 1002);
            map10.put(" SSL handshake aborted", 1003);
            map.put(SSLHandshakeException.class.getSimpleName(), map10);
            HashMap map11 = new HashMap();
            map11.put(" Hostname not verified", 1101);
            map.put(SSLPeerUnverifiedException.class.getSimpleName(), map11);
            HashMap map12 = new HashMap();
            map12.put(" Read error", 1201);
            map.put(SSLProtocolException.class.getSimpleName(), map12);
        }
        String message = th.getMessage();
        int iIntValue = -1;
        if (TextUtils.isEmpty(message)) {
            return -1;
        }
        int iIndexOf = message.indexOf(44);
        if (iIndexOf > 0) {
            message = message.substring(0, iIndexOf);
        }
        Map map13 = (Map) map.get(th.getClass().getSimpleName());
        if (map13 != null && !map13.isEmpty()) {
            Iterator it2 = map13.entrySet().iterator();
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
}
