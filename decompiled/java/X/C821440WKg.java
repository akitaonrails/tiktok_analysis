package X;

import android.content.SharedPreferences;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: renamed from: X.0WKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821440WKg {
    public static final String[] LIZJ = {"*", "FCM", "GCM", ""};
    public final SharedPreferences LIZ;
    public final String LIZIZ;

    public final String LIZ() {
        String string;
        synchronized (this.LIZ) {
            try {
                string = this.LIZ.getString("|S|id", null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return string;
    }

    public final String LIZIZ() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.LIZ) {
            try {
                String strEncodeToString = null;
                String string = this.LIZ.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                try {
                    publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
                } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                    TryCatchGuardChecker.doCheck(e);
                    publicKeyGeneratePublic = null;
                }
                if (publicKeyGeneratePublic == null) {
                    return null;
                }
                try {
                    byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                    bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                    strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
                } catch (NoSuchAlgorithmException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                return strEncodeToString;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C821440WKg(X.C818880WAk r5) {
        /*
            r4 = this;
            r4.<init>()
            r5.LIZ()
            android.content.Context r2 = r5.LIZ
            java.lang.String r1 = "com.google.android.gms.appid"
            r0 = 0
            android.content.SharedPreferences r0 = X.C810670Vr7.LIZJ(r2, r0, r1)
            r4.LIZ = r0
            r5.LIZ()
            X.0W3K r0 = r5.LIZJ
            java.lang.String r2 = r0.LJ
            if (r2 != 0) goto L31
            r5.LIZ()
            X.0W3K r0 = r5.LIZJ
            java.lang.String r2 = r0.LIZIZ
            java.lang.String r0 = "1:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L34
            java.lang.String r0 = "2:"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L34
        L31:
            r4.LIZIZ = r2
            return
        L34:
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r2.split(r0)
            int r2 = r3.length
            r0 = 4
            r1 = 0
            if (r2 != r0) goto L48
            r0 = 1
            r2 = r3[r0]
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L31
        L48:
            r2 = r1
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C821440WKg.<init>(X.0WAk):void");
    }
}
