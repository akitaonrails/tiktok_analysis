package X;

import android.net.Uri;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.1Asz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193471Asz {
    public C2193451Asx LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public Uri LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public Map<String, String> LJIILIIL = new HashMap();

    public final C2193461Asy LIZ() {
        return new C2193461Asy(this.LIZ, this.LIZIZ, this.LJFF, this.LJI, this.LIZJ, this.LIZLLL, this.LJ, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, Collections.unmodifiableMap(new HashMap(this.LJIILIIL)));
    }

    public final void LIZJ(String... strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        this.LJII = C1742070vQz.LIZ(Arrays.asList(strArr));
    }

    public final void LIZIZ(String str, String str2, String str3) {
        boolean z;
        if (str != null) {
            C20137313ql.LIZ(str);
            C20137213qk.LIZIZ("code verifier challenge cannot be null or empty if verifier is set", str2);
            C20137213qk.LIZIZ("code verifier challenge method cannot be null or empty if verifier is set", str3);
        } else {
            boolean z2 = true;
            if (str2 == null) {
                z = true;
            } else {
                z = false;
            }
            C20137213qk.LIZ("code verifier challenge must be null if verifier is null", z);
            if (str3 != null) {
                z2 = false;
            }
            C20137213qk.LIZ("code verifier challenge method must be null if verifier is null", z2);
        }
        this.LJIIIZ = str;
        this.LJIIJ = str2;
        this.LJIIJJI = str3;
    }

    public C2193471Asz(C2193451Asx c2193451Asx, String str, String str2, Uri uri) {
        String str3;
        C20137213qk.LIZJ(c2193451Asx, "configuration cannot be null");
        this.LIZ = c2193451Asx;
        C20137213qk.LIZIZ("client ID cannot be null or empty", str);
        this.LIZIZ = str;
        C20137213qk.LIZIZ("expected response type cannot be null or empty", str2);
        this.LJFF = str2;
        C20137213qk.LIZJ(uri, "redirect URI cannot be null or empty");
        this.LJI = uri;
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        String strEncodeToString = Base64.encodeToString(bArr, 11);
        if (strEncodeToString != null) {
            C20137213qk.LIZIZ("state cannot be empty if defined", strEncodeToString);
        }
        this.LJIIIIZZ = strEncodeToString;
        Pattern pattern = C20137313ql.LIZ;
        byte[] bArr2 = new byte[64];
        new SecureRandom().nextBytes(bArr2);
        String strEncodeToString2 = Base64.encodeToString(bArr2, 11);
        if (strEncodeToString2 != null) {
            C20137313ql.LIZ(strEncodeToString2);
            this.LJIIIZ = strEncodeToString2;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(strEncodeToString2.getBytes("ISO_8859_1"));
                strEncodeToString2 = Base64.encodeToString(messageDigest.digest(), 11);
            } catch (UnsupportedEncodingException e) {
                TryCatchGuardChecker.doCheck(e);
                C0WWL.LIZIZ().LIZJ(6, "ISO-8859-1 encoding not supported on this device!", null, e);
                throw new IllegalStateException("ISO-8859-1 encoding not supported", e);
            } catch (NoSuchAlgorithmException e2) {
                TryCatchGuardChecker.doCheck(e2);
                C0WWL.LIZLLL("SHA-256 is not supported on this device! Using plain challenge", e2);
            }
            this.LJIIJ = strEncodeToString2;
            try {
                MessageDigest.getInstance("SHA-256");
                str3 = "S256";
            } catch (NoSuchAlgorithmException e3) {
                TryCatchGuardChecker.doCheck(e3);
                str3 = "plain";
            }
            this.LJIIJJI = str3;
            return;
        }
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIIJJI = null;
    }
}
