package X;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0dFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043270dFt extends AbstractC1043470dGD {
    public static boolean LJIILIIL;
    public final String LIZIZ;
    public final String LIZJ;
    public Map<String, C1043350dG1> LIZLLL;
    public C1043260dFs LJ;
    public String LJFF;
    public final C01GW LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;

    @Override // X.AbstractC1043470dGD
    public final InputStream LIZIZ(String str) {
        return null;
    }

    @Override // X.AbstractC1043470dGD
    public final String LIZLLL() {
        return "";
    }

    @Override // X.AbstractC1043470dGD, X.InterfaceC1041260dCe
    public final WebResourceResponse LIZ(String str) {
        boolean z;
        boolean z2;
        String strLJ;
        boolean z3;
        Pair<String, Integer> pairLIZIZ;
        boolean z4;
        WebResourceResponse webResourceResponseLJ;
        C1043260dFs c1043260dFs;
        String strOptString;
        InputStream c0vsp;
        JSONObject jSONObjectW0;
        C1043260dFs c1043260dFs2;
        String str2 = this.LIZIZ;
        int length = 0;
        int i = 1;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        WebResourceResponse webResourceResponseLJ2 = null;
        if (!z) {
            if (str2 != null && !a0.LJJJIL(str2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (C1043370dG3.LIZ().enableCacheChannelPath) {
                    strLJ = (String) this.LJI.getValue();
                } else {
                    String str3 = this.LIZJ;
                    IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (iAdLandPagePreloadService != null) {
                        String strK0 = iAdLandPagePreloadService.K0(str3);
                        this.LJFF = strK0;
                        strLJ = C1552050qUV.LJ(strK0, str2);
                    } else {
                        strLJ = null;
                    }
                }
                this.LJII += System.currentTimeMillis() - jCurrentTimeMillis;
                if (strLJ != null && !a0.LJJJIL(strLJ)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    return null;
                }
                String str4 = this.LJFF;
                if (str4 != null && (c1043260dFs2 = this.LJ) != null) {
                    String str5 = this.LIZJ;
                    if (c1043260dFs2.LIZ == null) {
                        c1043260dFs2.LIZIZ = str4;
                        c1043260dFs2.LIZJ = strLJ;
                        c1043260dFs2.LIZ = str2;
                        c1043260dFs2.LIZLLL = str5;
                    }
                }
                String strLIZJ = C1043460dGC.LIZJ(str);
                String strLIZJ2 = LIZJ(strLIZJ);
                C1043260dFs c1043260dFs3 = this.LJ;
                if (c1043260dFs3 != null) {
                    pairLIZIZ = c1043260dFs3.LIZIZ(str, strLIZJ, strLJ);
                } else {
                    pairLIZIZ = null;
                }
                if (pairLIZIZ != null && pairLIZIZ.getSecond().intValue() == 1) {
                    String first = pairLIZIZ.getFirst();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    IAdLandPagePreloadService iAdLandPagePreloadService2 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                    if (this.LIZLLL == null) {
                        if (C1043370dG3.LIZ().enableParseManifest && iAdLandPagePreloadService2 != null) {
                            iAdLandPagePreloadService2.O0(strLJ, null);
                        }
                        if (iAdLandPagePreloadService2 != null) {
                            jSONObjectW0 = iAdLandPagePreloadService2.w0(strLJ);
                        } else {
                            jSONObjectW0 = null;
                        }
                        this.LIZLLL = C1043290dFv.LIZ(jSONObjectW0);
                    }
                    this.LJIIIIZZ += System.currentTimeMillis() - jCurrentTimeMillis2;
                    Map<String, C1043350dG1> map = this.LIZLLL;
                    if (map != null) {
                        this.LJIIIZ += System.currentTimeMillis() - System.currentTimeMillis();
                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                        C1043350dG1 c1043350dG1 = (C1043350dG1) ((LinkedHashMap) map).get(first);
                        if (c1043350dG1 != null) {
                            System.currentTimeMillis();
                            String str6 = c1043350dG1.LIZ;
                            C0VSJ c0vsj = new C0VSJ(strLJ, str6);
                            if (c0vsj.exists()) {
                                Iterator<? extends AbstractC1043430dG9> it2 = c1043350dG1.LIZJ.iterator();
                                boolean z5 = true;
                                while (it2.hasNext()) {
                                    if (it2.next().LIZ()) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z5) {
                                        break;
                                    }
                                }
                                if (z5) {
                                    JSONObject jSONObject = c1043350dG1.LIZIZ;
                                    if (jSONObject != null) {
                                        strOptString = jSONObject.optString("content-type");
                                    } else {
                                        strOptString = null;
                                    }
                                    Pair<String, String> pairLJIIIIZZ = C1043460dGC.LJIIIIZZ(strOptString);
                                    String first2 = pairLJIIIIZZ.getFirst();
                                    String second = pairLJIIIIZZ.getSecond();
                                    if (C1043370dG3.LIZ().enableResourceToMem) {
                                        try {
                                            byte[] bArrLIZ = C361401am.LIZ(c0vsj, str6);
                                            if (bArrLIZ != null) {
                                                c0vsp = new ByteArrayInputStream(bArrLIZ);
                                            } else {
                                                c0vsp = new C0VSP(c0vsj);
                                            }
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            c0vsp = new C0VSP(c0vsj);
                                        }
                                    } else {
                                        c0vsp = new C0VSP(c0vsj);
                                    }
                                    webResourceResponseLJ2 = AbstractC1043470dGD.LJ(first2, second, c0vsp, null);
                                    List<? extends AbstractC1043430dG9> list = c1043350dG1.LIZJ;
                                    if (webResourceResponseLJ2 != null && !list.isEmpty() && (ListProtector.get(list, 0) instanceof C1043410dG7)) {
                                        Map<String, String> responseHeaders = webResourceResponseLJ2.getResponseHeaders();
                                        if (responseHeaders != null) {
                                            responseHeaders.put("hit_once", "1");
                                        }
                                        C1043260dFs c1043260dFs4 = this.LJ;
                                        if (c1043260dFs4 != null) {
                                            c1043260dFs4.LJIIL = true;
                                        }
                                    }
                                }
                            }
                            C1043460dGC.LIZ.getClass();
                            C1043460dGC.LIZ(webResourceResponseLJ2, c1043350dG1);
                        } else {
                            this.LJIIJ += System.currentTimeMillis() - jCurrentTimeMillis3;
                        }
                    } else {
                        String strLIZJ3 = LIZJ(strLIZJ);
                        System.currentTimeMillis();
                        IAdLandPagePreloadService iAdLandPagePreloadService3 = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                        if (iAdLandPagePreloadService3 != null) {
                            iAdLandPagePreloadService3.C0();
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!a0.LJJJIL(strLIZJ3) || !z4) {
                            try {
                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                if (first != null) {
                                    C0VSJ c0vsj2 = new C0VSJ(strLJ, first);
                                    this.LJIIJJI += System.currentTimeMillis() - jCurrentTimeMillis4;
                                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                                    if (c0vsj2.exists()) {
                                        webResourceResponseLJ = AbstractC1043470dGD.LJ(strLIZJ3, "", new C0VSP(c0vsj2), null);
                                    } else {
                                        webResourceResponseLJ = null;
                                    }
                                    this.LJIIL += System.currentTimeMillis() - jCurrentTimeMillis5;
                                    webResourceResponseLJ2 = webResourceResponseLJ;
                                }
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                            }
                        }
                    }
                    if (webResourceResponseLJ2 != null) {
                        C1043260dFs c1043260dFs5 = this.LJ;
                        if (c1043260dFs5 != null) {
                            long jCurrentTimeMillis6 = System.currentTimeMillis();
                            if (LJIILIIL && ((u.LJJIIJZLJL(a0.LJLIIIL(str).toString(), "http://", false) || u.LJJIIJZLJL(a0.LJLIIIL(str).toString(), "https://", false)) && !C1043260dFs.LIZJ(str) && !C1043260dFs.LIZLLL(str))) {
                                if (c1043260dFs5.LJFF.size() > 10000) {
                                    c1043260dFs5.LJFF.clear();
                                }
                                c1043260dFs5.LJFF.add(new C1043320dFy(C1043460dGC.LIZJ(str), i, 2));
                                if (c1043260dFs5.LJII == 0 && new C0VSJ(c1043260dFs5.LIZJ).exists() && new C0VSJ(c1043260dFs5.LIZJ).isDirectory()) {
                                    File[] fileArrListFiles = new C0VSJ(c1043260dFs5.LIZJ).listFiles();
                                    if (fileArrListFiles != null) {
                                        length = fileArrListFiles.length;
                                    }
                                    c1043260dFs5.LJII = length;
                                }
                                String str7 = c1043260dFs5.LIZIZ;
                                if (str7 != null && c1043260dFs5.LJ == 0) {
                                    Context context = C1552050qUV.LIZ;
                                    C1553670qX7.LIZ.getClass();
                                    c1043260dFs5.LJ = C1552050qUV.LJIIL(str7, c1043260dFs5.LIZ).longValue();
                                }
                                c1043260dFs5.LJIILL += System.currentTimeMillis() - jCurrentTimeMillis6;
                            }
                        }
                    } else {
                        AdLandPageResourceOptimizeExperiment.LIZ.getClass();
                        if (!AdLandPageResourceOptimizeExperiment.LIZ().enableConsumePrefetch && (c1043260dFs = this.LJ) != null) {
                            c1043260dFs.LIZ(str, strLIZJ2, EnumC1043330dFz.NONE);
                            return webResourceResponseLJ2;
                        }
                    }
                    return webResourceResponseLJ2;
                }
                C1043260dFs c1043260dFs6 = this.LJ;
                if (c1043260dFs6 != null) {
                    c1043260dFs6.LIZ(str, strLIZJ2, EnumC1043330dFz.NONE);
                }
            }
        }
        return null;
    }

    @Override // X.AbstractC1043470dGD
    public final String LIZJ(String str) {
        int iLJJJ;
        if (str != null) {
            if (!u.LJIIZILJ(str, ".shtml", false) && !u.LJIIZILJ(str, ".do", false)) {
                if (a0.LJJIIZI(str, e3.d, false) && (iLJJJ = a0.LJJJ(str.substring(a0.LJJJJI(str, e3.d, 0, 6)), "/", 0, false, 6)) > -1) {
                    return super.LIZJ(str.substring(0, iLJJJ + a0.LJJJJI(str, e3.d, 0, 6)));
                }
            } else {
                return "text/html";
            }
        }
        return super.LIZJ(str);
    }

    public C1043270dFt(String str, String str2) {
        super(true);
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 739));
    }
}
