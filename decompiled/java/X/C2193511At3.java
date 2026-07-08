package X;

import android.net.Uri;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1At3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193511At3 {
    public C2193451Asx LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Uri LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public Map<String, String> LJIIIIZZ;

    public final C2193501At2 LIZ() {
        String str = this.LIZJ;
        if (str == null) {
            if (this.LJFF != null) {
                str = "authorization_code";
            } else {
                if (this.LJI == null) {
                    throw new IllegalStateException("grant type not specified and cannot be inferred");
                }
                str = "refresh_token";
            }
        }
        if ("authorization_code".equals(str)) {
            C20137213qk.LIZJ(this.LJFF, "authorization code must be specified for grant_type = authorization_code");
        }
        if ("refresh_token".equals(str)) {
            C20137213qk.LIZJ(this.LJI, "refresh token must be specified for grant_type = refresh_token");
        }
        if (str.equals("authorization_code") && this.LIZLLL == null) {
            throw new IllegalStateException("no redirect URI specified on token request for code exchange");
        }
        return new C2193501At2(this.LIZ, this.LIZIZ, str, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, Collections.unmodifiableMap(this.LJIIIIZZ));
    }

    public C2193511At3(C2193451Asx c2193451Asx, String str) {
        c2193451Asx.getClass();
        this.LIZ = c2193451Asx;
        C20137213qk.LIZIZ("clientId cannot be null or empty", str);
        this.LIZIZ = str;
        this.LJIIIIZZ = new LinkedHashMap();
    }
}
