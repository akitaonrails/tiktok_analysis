package X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1At5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193531At5 {
    public final C2193461Asy LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public Long LJFF;
    public String LJI;
    public String LJII;
    public Map<String, String> LJIIIIZZ;

    public final C2193521At4 LIZ() {
        return new C2193521At4(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, Collections.unmodifiableMap(this.LJIIIIZZ));
    }

    public C2193531At5(C2193461Asy c2193461Asy) {
        C20137213qk.LIZJ(c2193461Asy, "authorization request cannot be null");
        this.LIZ = c2193461Asy;
        this.LJIIIIZZ = new LinkedHashMap();
    }

    public final void LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            this.LJII = null;
            return;
        }
        String[] strArrSplit = str.split(" +");
        if (strArrSplit == null) {
            this.LJII = null;
        } else {
            this.LJII = C1742070vQz.LIZ(Arrays.asList(strArrSplit));
        }
    }
}
