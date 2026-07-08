package X;

import Y.ARunnableS1S1400000_3;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821540WKq {
    public static final PublicKey LIZ(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "\n", "", false), "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String LIZIZ(String str) {
        URL url = new URL("https", Intrinsics.LJIIJJI(FacebookSdk.LJIILLIIL, "www."), "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        C259800zU c259800zU = new C259800zU();
        FacebookSdk.LJ().execute(new ARunnableS1S1400000_3(url, c259800zU, str, reentrantLock, conditionNewCondition, 0));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
            reentrantLock.unlock();
            return (String) c259800zU.element;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final boolean LIZJ(PublicKey publicKey, String str, String str2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes(Charsets.UTF_8));
            return signature.verify(Base64.decode(str2, 8));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
