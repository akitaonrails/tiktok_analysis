package X;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1494940p0O {
    public static final AbstractC1494940p0O NONE = new AbstractC1494940p0O() { // from class: X.0p0W
    };

    public void callEnd(InterfaceC1495580p1Q interfaceC1495580p1Q) {
    }

    public void callFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, IOException iOException) {
    }

    public void callInSecureRedirect(InterfaceC1495580p1Q interfaceC1495580p1Q, JSONObject jSONObject) {
    }

    public C0XLQ callRedirectDispatch(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLQ c0xlq, String str, C0XLQ c0xlq2) {
        return null;
    }

    public void callStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
    }

    public void connectEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi) {
    }

    public void connectFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi, IOException iOException) {
    }

    public void connectFailed(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy, EnumC847200XLi enumC847200XLi, IOException iOException, String str) {
    }

    public void connectStart(InterfaceC1495580p1Q interfaceC1495580p1Q, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(InterfaceC1495580p1Q interfaceC1495580p1Q, InterfaceC1495030p0X interfaceC1495030p0X) {
    }

    public void connectionReleased(InterfaceC1495580p1Q interfaceC1495580p1Q, InterfaceC1495030p0X interfaceC1495030p0X) {
    }

    public void dnsEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, String str, List<InetAddress> list) {
    }

    public void dnsEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, String str, List<InetAddress> list, String str2) {
    }

    public void dnsStart(InterfaceC1495580p1Q interfaceC1495580p1Q, String str) {
    }

    public void requestBodyEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, long j) {
    }

    public void requestBodyStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
    }

    public void requestHeadersEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, Request request) {
    }

    public void requestHeadersStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
    }

    public void responseBodyEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, long j) {
    }

    public void responseBodyStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
    }

    public void responseHeadersEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, C0XLY c0xly) {
    }

    public void responseHeadersStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
    }

    public void secureConnectEnd(InterfaceC1495580p1Q interfaceC1495580p1Q, C1495740p1g c1495740p1g) {
    }

    public void secureConnectStart(InterfaceC1495580p1Q interfaceC1495580p1Q) {
    }

    public static InterfaceC1494090oz1 factory(final AbstractC1494940p0O abstractC1494940p0O) {
        return new InterfaceC1494090oz1() { // from class: X.0p0V
            @Override // X.InterfaceC1494090oz1
            public final AbstractC1494940p0O create(InterfaceC1495580p1Q interfaceC1495580p1Q) {
                return this.LIZ;
            }
        };
    }
}
