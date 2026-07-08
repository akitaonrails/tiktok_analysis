package X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1At2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193501At2 {
    public static final Set<String> LJIIIZ = Collections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope")));
    public final C2193451Asx LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Uri LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final Map<String, String> LJIIIIZZ;

    public final Map<String, String> LIZ() {
        HashMap map = new HashMap();
        map.put("grant_type", this.LIZJ);
        Uri uri = this.LIZLLL;
        if (uri != null) {
            map.put("redirect_uri", uri.toString());
        }
        String str = this.LJ;
        if (str != null) {
            str.toString();
            map.put("code", str);
        }
        String str2 = this.LJI;
        if (str2 != null) {
            str2.toString();
            map.put("refresh_token", str2);
        }
        String str3 = this.LJII;
        if (str3 != null) {
            str3.toString();
            map.put("code_verifier", str3);
        }
        String str4 = this.LJFF;
        if (str4 != null) {
            str4.toString();
            map.put("scope", str4);
        }
        for (Map.Entry<String, String> entry : this.LJIIIIZZ.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public C2193501At2(C2193451Asx c2193451Asx, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, Map map) {
        this.LIZ = c2193451Asx;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = uri;
        this.LJFF = str3;
        this.LJ = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = map;
    }
}
