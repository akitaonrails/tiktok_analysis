package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0p5Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1498060p5Q extends AbstractC1498070p5R {
    static {
        Arrays.sort(new String[]{"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"});
    }

    public C1498060p5Q() {
        if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
            new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), CastIntegerProtector.parseInt(System.getProperty("https.proxyPort"))));
        }
    }
}
