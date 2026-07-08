package X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kbQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325700kbQ {
    public static InterfaceC1325750kbV LJJIJLIJ;
    public static InterfaceC1325740kbU LJJIL;
    public static boolean LJJIZ;
    public Uri LIZ;
    public C1324630kZh LIZJ;
    public C1318160kPG LIZLLL;
    public C1324670kZl LJ;
    public InterfaceC1325670kbN LJIIZILJ;
    public Map<String, String> LJIJJ;
    public Map<String, String> LJIL;
    public String LJJ;
    public String LJJI;
    public EnumC1320950kTl LIZIZ = EnumC1320950kTl.FULL_FETCH;
    public C1329360khK LJFF = C1329360khK.LJIIZILJ;
    public EnumC1325560kbC LJI = EnumC1325560kbC.DEFAULT;
    public boolean LJII = false;
    public boolean LJIIIIZZ = false;
    public boolean LJIIIZ = false;
    public boolean LJIIJ = false;
    public boolean LJIIJJI = false;
    public EnumC1331380kka LJIIL = EnumC1331380kka.MEDIUM;
    public InterfaceC1291910jiv LJIILIIL = null;
    public boolean LJIILJJIL = true;
    public boolean LJIILL = false;
    public boolean LJIILLIIL = true;
    public C1328000kf8 LJIJ = null;
    public String LJIJI = null;
    public int LJIJJLI = 1;
    public boolean LJJIFFI = false;
    public boolean LJJII = false;
    public boolean LJJIII = false;
    public boolean LJJIIJ = true;
    public boolean LJJIIJZLJL = false;
    public int LJJIIZ = -1;
    public int LJJIIZI = -1;
    public int LJJIJ = -1;
    public boolean LJJIJIIJI = false;
    public String LJJIJIIJIL = null;
    public String LJJIJIL = null;
    public String LJJIJL = null;

    public final C1325710kbR LIZ() {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400600, "com/facebook/imagepipeline/request/ImageRequestBuilder", "build", this, new Object[0], "com.facebook.imagepipeline.request.ImageRequest", new C0WZW(false, "()Lcom/facebook/imagepipeline/request/ImageRequest;", new C0WZX("dzBzEgQ7XM/eWlgqCxuJZ9R1iSH8CvqoEW3Sbrh3dTq+4h3t/XXvm/73uYvFYY6TAceS6hLU", new String[]{"019e5"})));
        if (c0wsuLIZIZ.LIZ) {
            return (C1325710kbR) c0wsuLIZIZ.LIZIZ;
        }
        Uri uri = this.LIZ;
        if (uri == null) {
            final String str = "Source must be set!";
            throw new RuntimeException(str) { // from class: X.0HdM
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid request builder: ");
                    sbLIZ.append(str);
                    super(C2188811AlT.LIZIZ(sbLIZ));
                }
            };
        }
        if ("res".equals(C1325880kbi.LIZ(uri))) {
            if (!this.LIZ.isAbsolute()) {
                final String str2 = "Resource URI path must be absolute.";
                throw new RuntimeException(str2) { // from class: X.0HdM
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid request builder: ");
                        sbLIZ.append(str2);
                        super(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
            if (this.LIZ.getPath().isEmpty()) {
                final String str3 = "Resource URI must not be empty";
                throw new RuntimeException(str3) { // from class: X.0HdM
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid request builder: ");
                        sbLIZ.append(str3);
                        super(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
            try {
                Integer.parseInt(this.LIZ.getPath().substring(1));
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                final String str4 = "Resource URI path must be a resource id.";
                throw new RuntimeException(str4) { // from class: X.0HdM
                    /* JADX WARN: Illegal instructions before constructor call */
                    {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Invalid request builder: ");
                        sbLIZ.append(str4);
                        super(C2188811AlT.LIZIZ(sbLIZ));
                    }
                };
            }
        }
        if ("asset".equals(C1325880kbi.LIZ(this.LIZ)) && !this.LIZ.isAbsolute()) {
            final String str5 = "Asset URI path must be absolute.";
            throw new RuntimeException(str5) { // from class: X.0HdM
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Invalid request builder: ");
                    sbLIZ.append(str5);
                    super(C2188811AlT.LIZIZ(sbLIZ));
                }
            };
        }
        Map<String, String> map = C1328730kgJ.LJI;
        if (map != null) {
            if (this.LJIL == null) {
                this.LJIL = new HashMap();
            }
            Uri uri2 = this.LIZ;
            Map<String, String> map2 = this.LJIL;
            if (uri2 != null) {
                try {
                    for (String str6 : map.keySet()) {
                        String str7 = map.get(str6);
                        String queryParameter = uri2.getQueryParameter(str6);
                        if (!TextUtils.isEmpty(queryParameter)) {
                            map2.put(str7, queryParameter);
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1328570kg3.LJFF("ImageRequestBuilder", "updateCustomParam failed");
                }
            }
        }
        return new C1325710kbR(this);
    }

    public static C1325700kbQ LIZIZ(C1325710kbR c1325710kbR) {
        boolean z;
        C1325700kbQ c1325700kbQLIZLLL = LIZLLL(c1325710kbR.LIZIZ);
        c1325700kbQLIZLLL.LJFF = c1325710kbR.LJIIJ;
        c1325700kbQLIZLLL.LJIJ = c1325710kbR.LJIILJJIL;
        c1325700kbQLIZLLL.LJI = c1325710kbR.LIZ;
        c1325700kbQLIZLLL.LJIIJ = c1325710kbR.LJIIIIZZ;
        if (Build.VERSION.SDK_INT >= 29 && c1325710kbR.LJIIIZ) {
            z = true;
        } else {
            z = false;
        }
        c1325700kbQLIZLLL.LJIIJJI = z;
        c1325700kbQLIZLLL.LIZIZ = c1325710kbR.LJIILLIIL;
        c1325700kbQLIZLLL.LJIILIIL = c1325710kbR.LJIJJ;
        c1325700kbQLIZLLL.LJII = c1325710kbR.LJFF;
        c1325700kbQLIZLLL.LJIIL = c1325710kbR.LJIILL;
        c1325700kbQLIZLLL.LIZJ = c1325710kbR.LJIIJJI;
        c1325700kbQLIZLLL.LJIIZILJ = c1325710kbR.LJIJJLI;
        c1325700kbQLIZLLL.LJ = c1325710kbR.LJIILIIL;
        return c1325700kbQLIZLLL;
    }

    public static C1325700kbQ LIZJ(int i) {
        return LIZLLL(C1325880kbi.LIZIZ(i));
    }

    public static C1325700kbQ LIZLLL(Uri uri) {
        C1325700kbQ c1325700kbQ = new C1325700kbQ();
        uri.getClass();
        InterfaceC1325750kbV interfaceC1325750kbV = LJJIJLIJ;
        if (interfaceC1325750kbV != null) {
            uri = C1290290jgJ.LIZ(uri, ((C1325730kbT) interfaceC1325750kbV).LIZ);
        }
        c1325700kbQ.LIZ = uri;
        return c1325700kbQ;
    }

    public C1325700kbQ LJ(Map<String, String> map) {
        this.LJIL = map;
        return this;
    }

    public final void LJFF(Map map) {
        Map<String, String> map2 = this.LJIJJ;
        if (map2 == null) {
            this.LJIJJ = new HashMap();
        } else {
            map2.clear();
        }
        boolean z = false;
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            if ((LJJIZ || this.LJJIFFI) && !TextUtils.isEmpty((CharSequence) entry.getKey()) && ((String) entry.getKey()).contains("x-security-argus")) {
                if (entry.getValue() != null && !((String) entry.getValue()).contains("StaticResource/")) {
                    Map<String, String> map3 = this.LJIJJ;
                    Object key = entry.getKey();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) entry.getValue());
                    sbLIZ.append(" StaticResource/img/BDFresco");
                    map3.put((String) key, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    this.LJIJJ.put((String) entry.getKey(), (String) entry.getValue());
                }
                z = true;
            } else {
                this.LJIJJ.put((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if ((LJJIZ || this.LJJIFFI) && !z) {
            this.LJIJJ.put("x-security-argus", "StaticResource/img/BDFresco");
        }
    }

    public C1325700kbQ LJI(boolean z) {
        this.LJIIIIZZ = z;
        return this;
    }

    public C1325700kbQ LJII(boolean z) {
        this.LJIIIZ = z;
        return this;
    }

    public C1325700kbQ LJIIIIZZ(int i) {
        this.LJJIJ = i;
        return this;
    }

    public C1325700kbQ LJIIIZ(int i) {
        this.LJJIIZI = i;
        return this;
    }
}
