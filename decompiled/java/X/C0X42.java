package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: X.0X42, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X42 extends C842670X3x {
    public static C0X42 LJIILIIL() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new C0X42();
            }
            return null;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C842670X3x
    public final SSLContext LJII() {
        try {
            return SSLContext.getInstance("TLSv1.3", LJIILJJIL());
        } catch (NoSuchAlgorithmException e) {
            TryCatchGuardChecker.doCheck(e);
            try {
                return SSLContext.getInstance("TLS", LJIILJJIL());
            } catch (NoSuchAlgorithmException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    public static Provider LJIILJJIL() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // X.C842670X3x
    public final void LJ(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // X.C842670X3x
    public final String LJIIIIZZ(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // X.C842670X3x
    public final void LJFF(SSLSocket sSLSocket, String str, List<EnumC847200XLi> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ((ArrayList) C842670X3x.LIZIZ(list)).toArray(new String[0]));
        }
    }
}
