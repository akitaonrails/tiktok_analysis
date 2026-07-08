package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0kbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1325710kbR {
    public final EnumC1325560kbC LIZ;
    public final Uri LIZIZ;
    public final List<Uri> LIZJ;
    public final int LIZLLL;
    public C0VSJ LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C1329360khK LJIIJ;
    public final C1324630kZh LJIIJJI;
    public final C1318160kPG LJIIL;
    public final C1324670kZl LJIILIIL;
    public final C1328000kf8 LJIILJJIL;
    public final EnumC1331380kka LJIILL;
    public final EnumC1320950kTl LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final boolean LJIJI;
    public final InterfaceC1291910jiv LJIJJ;
    public final InterfaceC1325670kbN LJIJJLI;
    public final String LJIL;
    public C1322050kVX LJJ;
    public final boolean LJJI;
    public final boolean LJJIFFI;
    public boolean LJJII;
    public final Map<String, String> LJJIII;
    public final int LJJIIJ;
    public final Map<String, String> LJJIIJZLJL;
    public final String LJJIIZ;
    public final String LJJIIZI;
    public boolean LJJIJ;
    public int LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public String LJJIJL;
    public final int LJJIJLIJ;
    public final int LJJIL;
    public final int LJJIZ;
    public final boolean LJJJ;
    public final boolean LJJJI;
    public final boolean LJJJIL;
    public final String LJJJJ;
    public final String LJJJJI;
    public final String LJJJJIZL;
    public boolean LJJJJJ;

    public final synchronized File LIZJ() {
        if (this.LJ == null) {
            this.LJ = new C0VSJ(this.LIZIZ.getPath());
        }
        return this.LJ;
    }

    public final boolean LIZLLL() {
        return this.LJIJ && this.LJIIJJI != null;
    }

    public final int hashCode() {
        InterfaceC1291910jiv interfaceC1291910jiv = this.LJIJJ;
        InterfaceC1324680kZm postprocessorCacheKey = interfaceC1291910jiv != null ? interfaceC1291910jiv.getPostprocessorCacheKey() : null;
        return postprocessorCacheKey != null ? Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ, this.LJ, this.LJIILJJIL, null, this.LJIIJJI, this.LJIILIIL, postprocessorCacheKey, Boolean.valueOf(this.LJIIIZ)}) : Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ, this.LJ, this.LJIILJJIL, this.LJIIJ, this.LJIIJJI, this.LJIILIIL, postprocessorCacheKey, Boolean.valueOf(this.LJIIIZ)});
    }

    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(this.LIZIZ, "uri");
        c1320100kSOLIZIZ.LIZIZ(this.LIZ, "cacheChoice");
        c1320100kSOLIZIZ.LIZIZ(this.LJIIJ, "decodeOptions");
        c1320100kSOLIZIZ.LIZIZ(this.LJIJJ, "postprocessor");
        c1320100kSOLIZIZ.LIZIZ(this.LJIILL, "priority");
        c1320100kSOLIZIZ.LIZIZ(this.LJIIJJI, "resizeOptions");
        c1320100kSOLIZIZ.LIZIZ(this.LJIILIIL, "rotationOptions");
        c1320100kSOLIZIZ.LIZIZ(this.LJIILJJIL, "bytesRange");
        return c1320100kSOLIZIZ.toString();
    }

    public C1325710kbR(C1325700kbQ c1325700kbQ) {
        boolean z;
        boolean z2;
        String strSubstring;
        String lowerCase;
        String mimeTypeFromExtension;
        this.LIZ = c1325700kbQ.LJI;
        Uri uri = c1325700kbQ.LIZ;
        this.LIZIZ = uri;
        this.LIZJ = null;
        int i = -1;
        if (uri != null) {
            if (C1325880kbi.LJ(uri)) {
                i = 0;
            } else if ("file".equals(C1325880kbi.LIZ(uri))) {
                String path = uri.getPath();
                int iLastIndexOf = path.lastIndexOf(46);
                i = (iLastIndexOf < 0 || iLastIndexOf == path.length() + (-1) || (strSubstring = path.substring(iLastIndexOf + 1)) == null || ((mimeTypeFromExtension = C1325760kbW.LIZJ.get((lowerCase = strSubstring.toLowerCase(Locale.US)))) == null && (mimeTypeFromExtension = C1325760kbW.LIZ.getMimeTypeFromExtension(lowerCase)) == null && (mimeTypeFromExtension = C1325720kbS.LIZ.get(lowerCase)) == null) || !mimeTypeFromExtension.startsWith("video/")) ? 3 : 2;
            } else if (C1325880kbi.LIZLLL(uri)) {
                TextUtils.isEmpty(null);
                i = 4;
            } else if ("asset".equals(C1325880kbi.LIZ(uri))) {
                i = 5;
            } else if ("res".equals(C1325880kbi.LIZ(uri))) {
                i = 6;
            } else if ("data".equals(C1325880kbi.LIZ(uri))) {
                i = 7;
            } else if ("android.resource".equals(C1325880kbi.LIZ(uri))) {
                i = 8;
            }
        }
        this.LIZLLL = i;
        this.LJFF = c1325700kbQ.LJII;
        this.LJII = c1325700kbQ.LJIIIIZZ;
        this.LJI = c1325700kbQ.LJIIIZ;
        this.LJIIIIZZ = c1325700kbQ.LJIIJ;
        this.LJIIIZ = c1325700kbQ.LJIIJJI;
        this.LJIIJ = c1325700kbQ.LJFF;
        this.LJIIJJI = c1325700kbQ.LIZJ;
        this.LJIIL = c1325700kbQ.LIZLLL;
        C1324670kZl c1324670kZl = c1325700kbQ.LJ;
        this.LJIILIIL = c1324670kZl == null ? C1324670kZl.LIZJ : c1324670kZl;
        this.LJIILJJIL = c1325700kbQ.LJIJ;
        this.LJIILL = c1325700kbQ.LJIIL;
        this.LJIILLIIL = c1325700kbQ.LIZIZ;
        if (c1325700kbQ.LJIILJJIL && C1325880kbi.LJ(c1325700kbQ.LIZ)) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIZILJ = z;
        this.LJIJ = c1325700kbQ.LJIILL;
        this.LJIJI = c1325700kbQ.LJIILLIIL;
        this.LJIJJ = c1325700kbQ.LJIILIIL;
        this.LJIJJLI = c1325700kbQ.LJIIZILJ;
        this.LJIL = c1325700kbQ.LJIJI;
        this.LJJI = c1325700kbQ.LJJIIJ;
        this.LJJIFFI = c1325700kbQ.LJJIIJZLJL;
        if ((C1325700kbQ.LJJIZ || c1325700kbQ.LJJIFFI) && c1325700kbQ.LJIJJ == null) {
            HashMap map = new HashMap();
            c1325700kbQ.LJIJJ = map;
            map.put("x-security-argus", "StaticResource/img/BDFresco");
        }
        if (C1325700kbQ.LJJIL != null) {
            Uri uri2 = c1325700kbQ.LIZ;
            Map<String, String> map2 = c1325700kbQ.LJIJJ;
            C01GW c01gw = C04V4.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                map2 = map2 == null ? new HashMap<>() : map2;
                map2.put("x-metasec-bypass-ttnet-features", "1");
                map2.put("x-metasec-bypass-mssdk", "1");
            } else if (((Number) c01gw.getValue()).intValue() == 2) {
                if (map2 == null) {
                    try {
                        map2 = new HashMap();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                if (uri2 != null && uri2.getPath() != null && uri2.getPath().contains("photomode")) {
                    map2.put("x-metasec-bypass-ttnet-features", "1");
                    map2.put("x-metasec-bypass-mssdk", "1");
                }
            }
            c1325700kbQ.LJIJJ = map2;
        }
        this.LJJIII = c1325700kbQ.LJIJJ;
        this.LJJIIJ = c1325700kbQ.LJIJJLI;
        this.LJJIIJZLJL = c1325700kbQ.LJIL;
        this.LJJIIZ = c1325700kbQ.LJJ;
        this.LJJIIZI = c1325700kbQ.LJJI;
        int i2 = c1325700kbQ.LJJIIZ;
        this.LJJIJLIJ = i2;
        this.LJJIJLIJ = i2;
        this.LJJIL = c1325700kbQ.LJJIIZI;
        this.LJJIZ = c1325700kbQ.LJJIJ;
        this.LJJJ = c1325700kbQ.LJJII;
        this.LJJJI = c1325700kbQ.LJJIII;
        this.LJJJIL = c1325700kbQ.LJJIJIIJI;
        this.LJJJJ = c1325700kbQ.LJJIJIIJIL;
        this.LJJJJI = c1325700kbQ.LJJIJIL;
        this.LJJJJIZL = c1325700kbQ.LJJIJL;
    }

    public static C1325710kbR LIZ(Uri uri) {
        if (uri == null) {
            return null;
        }
        return C1325700kbQ.LIZLLL(uri).LIZ();
    }

    public static C1325710kbR LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            return LIZ(Uri.parse(str));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        InterfaceC1324680kZm postprocessorCacheKey;
        if (!(obj instanceof C1325710kbR)) {
            return false;
        }
        C1325710kbR c1325710kbR = (C1325710kbR) obj;
        if (!C1320090kSN.LIZ(this.LIZIZ, c1325710kbR.LIZIZ) || !C1320090kSN.LIZ(this.LIZ, c1325710kbR.LIZ) || !C1320090kSN.LIZ(this.LJ, c1325710kbR.LJ) || !C1320090kSN.LIZ(this.LJIILJJIL, c1325710kbR.LJIILJJIL) || !C1320090kSN.LIZ(this.LJIIJ, c1325710kbR.LJIIJ) || !C1320090kSN.LIZ(this.LJIIJJI, c1325710kbR.LJIIJJI) || !C1320090kSN.LIZ(this.LJIILIIL, c1325710kbR.LJIILIIL) || this.LJIIIZ != c1325710kbR.LJIIIZ) {
            return false;
        }
        InterfaceC1291910jiv interfaceC1291910jiv = this.LJIJJ;
        InterfaceC1324680kZm postprocessorCacheKey2 = null;
        if (interfaceC1291910jiv != null) {
            postprocessorCacheKey = interfaceC1291910jiv.getPostprocessorCacheKey();
        } else {
            postprocessorCacheKey = null;
        }
        InterfaceC1291910jiv interfaceC1291910jiv2 = c1325710kbR.LJIJJ;
        if (interfaceC1291910jiv2 != null) {
            postprocessorCacheKey2 = interfaceC1291910jiv2.getPostprocessorCacheKey();
        }
        return C1320090kSN.LIZ(postprocessorCacheKey, postprocessorCacheKey2);
    }
}
