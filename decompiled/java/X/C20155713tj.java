package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.image.EcomImageXConfigModel;
import com.ss.android.ugc.aweme.ecommerce.image.TemplateParamBean;
import com.ss.android.ugc.aweme.ecommerce.image.adapt.EcomImageAdaptSizeConfigModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS13S3100000_30;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.13tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20155713tj {
    public Uri LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public List<String> LJI;
    public String LJII;
    public C1334140kp2 LJIIIIZZ;
    public String LJIIIZ;
    public final C20155113td LJIIJ;
    public EcomImageXConfigModel LJIIJJI;
    public EcomImageAdaptSizeConfigModel LJIIL;
    public final Map<String, String> LJIILIIL;

    public final void LJIIIZ() {
        if (this.LIZIZ || (!this.LJIILIIL.isEmpty())) {
            Uri.Builder builderBuildUpon = this.LIZ.buildUpon();
            if (this.LIZIZ) {
                String strLIZIZ = LIZIZ();
                String encodedPath = this.LIZ.getEncodedPath();
                String encodedPath2 = this.LIZ.getEncodedPath();
                String strLJJIFFI = encodedPath2 != null ? u.LJJIFFI(encodedPath2, this.LJIIIZ, strLIZIZ, false) : null;
                if (Intrinsics.LJFF(strLJJIFFI, encodedPath)) {
                    C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                    AwS13S3100000_30 awS13S3100000_30 = new AwS13S3100000_30(this, encodedPath, strLIZIZ, strLJJIFFI, 1);
                    c2341109Fh.getClass();
                    C2341109Fh.LIZIZ(awS13S3100000_30);
                }
                builderBuildUpon.encodedPath(strLJJIFFI);
                this.LJIIIZ = strLIZIZ;
                this.LIZIZ = false;
            }
            if (!this.LJIILIIL.isEmpty()) {
                for (Map.Entry entry : ((LinkedHashMap) this.LJIILIIL).entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                ((LinkedHashMap) this.LJIILIIL).clear();
            }
            this.LIZ = builderBuildUpon.build();
        }
    }

    public final void LIZJ() {
        String encodedPath = this.LIZ.getEncodedPath();
        if (encodedPath != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(a0.LJJZ(encodedPath, "~~tplv-", encodedPath));
            sbLIZ.append("~~tplv-");
            sbLIZ.append(this.LJ);
            sbLIZ.append('-');
            sbLIZ.append(this.LJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZJ) {
                return;
            }
            this.LIZLLL = strLIZIZ;
            this.LIZIZ = true;
        }
    }

    public final boolean LJIIJ() {
        return this.LIZLLL.length() > 0 && this.LJ.length() > 0 && this.LJFF.length() > 0 && this.LJII.length() > 0;
    }

    public final C20155613ti LIZ() {
        if (!LJIIJ()) {
            return null;
        }
        LJIIIZ();
        return new C20155613ti(this.LIZ, this.LIZLLL, this.LJ, this.LJFF, C13LP.LLIIII(this.LJI), this.LJII, this.LIZJ, this.LJIIJJI, this.LJIIL, this.LJIIIIZZ);
    }

    public final String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("~tplv-");
        sbLIZ.append(this.LJ);
        sbLIZ.append('-');
        sbLIZ.append(LJFF());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LJFF() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJFF);
        if (this.LJI.isEmpty()) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(':');
            sbLIZ2.append(C13LP.LJJLIIIJ(this.LJI, ":", null, null, 0, null, null, 62));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append('.');
        sbLIZ.append(this.LJII);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        if (!LJIIJ()) {
            return "";
        }
        LJIIIZ();
        return this.LIZ.toString();
    }

    public C20155713tj(Uri uri) {
        int i;
        this(uri, "", "", "", new ArrayList(), "", C1334150kp3.LIZLLL(uri));
        try {
            String encodedPath = uri.getEncodedPath();
            if (encodedPath != null) {
                String strLJJLIL = a0.LJJLIL(encodedPath, "~tplv-", encodedPath);
                String strLJJZ = a0.LJJZ(strLJJLIL, "?", strLJJLIL);
                int iLJJJ = a0.LJJJ(strLJJZ, "-", 0, false, 6);
                int iLJJJ2 = a0.LJJJ(strLJJZ, ":", 0, false, 6);
                int iLJJJ3 = a0.LJJJ(strLJJZ, e3.d, 0, false, 6);
                if (iLJJJ != -1 && iLJJJ3 != -1) {
                    String strSubstring = strLJJZ.substring(0, iLJJJ);
                    if (!this.LIZJ) {
                        this.LJ = strSubstring;
                        this.LIZIZ = true;
                    }
                    int i2 = iLJJJ + 1;
                    if (iLJJJ2 == -1) {
                        i = iLJJJ3;
                    } else {
                        i = iLJJJ2;
                    }
                    LJI(strLJJZ.substring(i2, i));
                    if (iLJJJ2 != -1) {
                        ArrayList arrayList = new ArrayList(a0.LJJLIIIJILLIZJL(strLJJZ.substring(iLJJJ2 + 1, iLJJJ3), new String[]{":"}, 0, 6));
                        if (!this.LIZJ) {
                            this.LJI = arrayList;
                            this.LIZIZ = true;
                        }
                    }
                    String strSubstring2 = strLJJZ.substring(iLJJJ3 + 1, strLJJZ.length());
                    if (!this.LIZJ) {
                        this.LJII = strSubstring2;
                        this.LIZIZ = true;
                    }
                    this.LJIIIZ = LIZIZ();
                    LIZJ();
                    this.LIZIZ = false;
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("invalid url ");
                sbLIZ.append(uri);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            throw new IllegalArgumentException("invalid url path empty");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1019103yf.LIZ(EnumC1014603xw.ERR2, th, null);
            C1018703yb.LIZLLL("rd_tiktokec_image_invalid_template", new AwS599S0100000_20(uri, 36));
        }
    }

    public final void LIZLLL(String str) {
        ConcurrentHashMap<String, C20155613ti> concurrentHashMap = C20155613ti.LJIILIIL;
        C20155613ti c20155613ti = concurrentHashMap.get(str);
        if (c20155613ti != null) {
            LJI(c20155613ti.LIZLLL);
            ArrayList arrayList = new ArrayList(c20155613ti.LJ);
            boolean z = this.LIZJ;
            if (!z) {
                this.LJI = arrayList;
                this.LIZIZ = true;
            }
            String str2 = c20155613ti.LJFF;
            if (!z) {
                this.LJII = str2;
                this.LIZIZ = true;
            }
            LIZJ();
            this.LIZIZ = true;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("~tplv-");
        sbLIZ.append(this.LJ);
        sbLIZ.append('-');
        sbLIZ.append(str);
        C20155613ti c20155613tiLIZIZ = C1334160kp4.LIZIZ(C1946007jm.LJ(u.LJJIFFI(toString(), this.LJIIIZ, C2188811AlT.LIZIZ(sbLIZ), false)));
        if (c20155613tiLIZIZ == null) {
            return;
        }
        LJI(c20155613tiLIZIZ.LIZLLL);
        String str3 = c20155613tiLIZIZ.LIZIZ;
        if (!this.LIZJ) {
            this.LIZLLL = str3;
            this.LIZIZ = true;
        }
        ArrayList arrayList2 = new ArrayList(c20155613tiLIZIZ.LJ);
        boolean z2 = this.LIZJ;
        if (!z2) {
            this.LJI = arrayList2;
            this.LIZIZ = true;
        }
        String str4 = c20155613tiLIZIZ.LJFF;
        if (!z2) {
            this.LJII = str4;
            this.LIZIZ = true;
        }
        this.LIZIZ = true;
        concurrentHashMap.put(str, c20155613tiLIZIZ);
    }

    public final void LJI(String str) {
        if (!this.LIZJ) {
            this.LJFF = str;
            this.LIZIZ = true;
        }
    }

    public final void LJIIIIZZ(String str) {
        C20157013tw.LIZIZ.getClass();
        TemplateParamBean templateParamBean = (TemplateParamBean) ((Map) C20157013tw.LJI.getValue()).get(this.LJFF);
        if (templateParamBean != null) {
            try {
                LJII(templateParamBean.quality, str);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } else if (!this.LJI.isEmpty()) {
            List<String> list = this.LJI;
            ListProtector.set(list, list.size() - 1, str);
        }
        this.LIZIZ = true;
    }

    public final void LJ(C20155613ti c20155613ti, String str) {
        Uri uriBuild;
        this.LIZJ = false;
        if (str != null) {
            uriBuild = c20155613ti.LIZ.buildUpon().encodedQuery(str).build();
        } else {
            uriBuild = c20155613ti.LIZ;
        }
        this.LIZ = uriBuild;
        String str2 = c20155613ti.LIZIZ;
        boolean z = this.LIZJ;
        if (!z) {
            this.LIZLLL = str2;
            this.LIZIZ = true;
        }
        String str3 = c20155613ti.LIZJ;
        if (!z) {
            this.LJ = str3;
            this.LIZIZ = true;
        }
        LJI(c20155613ti.LIZLLL);
        ArrayList arrayList = new ArrayList(c20155613ti.LJ);
        boolean z2 = this.LIZJ;
        if (!z2) {
            this.LJI = arrayList;
            this.LIZIZ = true;
        }
        String str4 = c20155613ti.LJFF;
        if (!z2) {
            this.LJII = str4;
            this.LIZIZ = true;
        }
        this.LJIIIZ = LIZIZ();
        this.LJIIIIZZ = c20155613ti.LJIIIZ;
        this.LIZJ = a0.LJJIIZI(this.LIZ.toString(), "signature", false);
        this.LIZIZ = false;
        this.LJIIJJI = c20155613ti.LJII;
        this.LJIIL = c20155613ti.LJIIIIZZ;
    }

    public final void LJII(int i, String str) {
        if (i >= this.LJI.size()) {
            List<String> list = this.LJI;
            int size = (i - list.size()) + 1;
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = "";
            }
            C19719612Di.LJJII(list, strArr);
        }
        ListProtector.set(this.LJI, i, str);
    }

    public C20155713tj(Uri uri, String str, String str2, String str3, List list, String str4, C1334140kp2 c1334140kp2) {
        this.LIZ = uri;
        this.LIZIZ = false;
        this.LIZJ = a0.LJJIIZI(uri.toString(), "signature", false);
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = list;
        this.LJII = str4;
        this.LJIIIIZZ = c1334140kp2;
        this.LJIIIZ = LIZIZ();
        this.LJIIJ = new C20155113td();
        this.LJIILIIL = new LinkedHashMap();
    }
}
