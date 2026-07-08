package X;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1892890zMF extends AbstractC1542200qEc {
    public boolean LLILLJJLI = true;
    public String LLILLL = "";
    public boolean LLILZ = true;
    public PoiThirdPartyViewModel LLILZIL;
    public SparkContext LLILZLL;
    public String LLIZ;
    public Long LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public Long LLJIJIL;
    public boolean LLJILJIL;
    public String LLJILJILJ;

    /* JADX WARN: Can't wrap try/catch for region: R(36:0|2|(1:4)(1:23)|5|(6:7|(2:9|(1:13))|14|(1:22)(1:18)|19|(1:21))|24|(32:26|(1:28)|29|(27:(0)(1:59)|60|(4:(1:63)(1:83)|64|(3:67|(1:69)|70)|71)|72|(1:82)(1:76)|77|(1:79)(1:81)|80|171|84|(2:86|(1:88)(1:89))(1:92)|173|93|(1:95)(1:97)|96|100|(1:102)|103|(1:170)(1:107)|108|(1:110)|111|(1:113)(1:169)|114|(14:116|(1:118)(1:168)|119|(1:121)|122|(1:124)(1:167)|125|(1:127)(1:166)|128|(1:130)|131|(1:133)(1:165)|134|(8:136|(1:164)(1:146)|147|(1:163)(1:151)|152|(1:154)(1:162)|155|(2:157|(1:159)))(0))|160|161)(2:32|(3:38|(2:39|(2:41|(2:180|178)(5:177|45|(4:48|(3:181|50|185)(1:184)|183|46)|182|55))(1:175))|56))|57|(0)|60|(0)|72|(2:74|82)(0)|77|(0)(0)|80|171|84|(0)(0)|173|93|(0)(0)|96|100|(0)|103|(2:105|170)(0)|108|(0)|111|(0)(0)|114|(0)|160|161)(1:51)|52|29|(1:(0)(2:57|(0)))(0)|60|(0)|72|(0)(0)|77|(0)(0)|80|171|84|(0)(0)|173|93|(0)(0)|96|100|(0)|103|(0)(0)|108|(0)|111|(0)(0)|114|(0)|160|161) */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013d, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x013e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x015a, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x015b, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3);
        r7 = new X.C098200Yq(r3);
        X.C189200o6.m2constructorimpl(r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147 A[Catch: all -> 0x015a, TryCatch #1 {all -> 0x015a, blocks: (B:93:0x0143, B:95:0x0147, B:96:0x0154), top: B:173:0x0143 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0158  */
    /* JADX WARN: Type inference failed for: r7v18, types: [T, java.lang.CharSequence, java.lang.String] */
    @Override // X.AbstractC1537870q7d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLIIIL(X.InterfaceC1541990qEH r23) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1892890zMF.LJLIIIL(X.0qEH):void");
    }

    @Override // X.AbstractC1542100qES
    public final void LJLJLLL(SparkContext sparkContext) {
        SparkActivity sparkActivityLIZ;
        this.LLILZLL = sparkContext;
        PoiThirdPartyViewModel poiThirdPartyViewModel = null;
        if (sparkContext != null) {
            sparkActivityLIZ = C1893200zMk.LIZ(sparkContext);
        } else {
            sparkActivityLIZ = null;
        }
        if ((sparkActivityLIZ instanceof C19EG) && sparkActivityLIZ != null) {
            poiThirdPartyViewModel = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ).get(PoiThirdPartyViewModel.class);
        }
        this.LLILZIL = poiThirdPartyViewModel;
    }

    public static void LJLLLL(SparkContext sparkContext, C1548490qOl c1548490qOl) {
        AbstractC1539010q9T abstractC1539010q9T;
        C1893220zMm c1893220zMm;
        C1892890zMF c1892890zMF;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        SparkContext sparkContext2;
        String string;
        String string2;
        Long lValueOf;
        SparkContext sparkContext3;
        InterfaceC2217701Bqy interfaceC2217701Bqy;
        C1892870zMD c1892870zMD;
        SparkActivity sparkActivityLIZ;
        PoiThirdPartyViewModel poiThirdPartyViewModel;
        SparkActivity sparkActivityLIZ2;
        PoiThirdPartyViewModel poiThirdPartyViewModel2;
        List<InterfaceC2217701Bqy> list;
        InterfaceC2217701Bqy next;
        WebView webView;
        InterfaceC1892990zMP interfaceC1892990zMP;
        final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1548490qOl.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
            SparkContext sparkContext4 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext();
            if (sparkContext4 != null && (interfaceC1892990zMP = (InterfaceC1892990zMP) sparkContext4.LJFF(InterfaceC1892990zMP.class)) != null) {
                interfaceC1892990zMP.setTitle("");
                interfaceC1892990zMP.setSubTitle("");
            }
            Object kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView();
            if ((kitView instanceof WebView) && (webView = (WebView) kitView) != null) {
                webView.setWebChromeClient(new WebChromeClient() { // from class: X.0zMI
                    @Override // android.webkit.WebChromeClient
                    public final void onReceivedTitle(WebView webView2, String str) {
                        InterfaceC1892990zMP interfaceC1892990zMP2;
                        String url;
                        String url2;
                        AbstractC1893000zMQ abstractC1893000zMQ;
                        super.onReceivedTitle(webView2, str);
                        SparkContext sparkContext5 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getSparkContext();
                        if (sparkContext5 != null && (interfaceC1892990zMP2 = (InterfaceC1892990zMP) sparkContext5.LJFF(InterfaceC1892990zMP.class)) != null) {
                            if ((webView2 instanceof InterfaceC1541990qEH) && webView2 != null) {
                                C1529870puj.LIZ.getClass();
                                ConcurrentHashMap<String, WeakReference<InterfaceC1541990qEH>> concurrentHashMap = C1529870puj.LIZJ;
                                if ((concurrentHashMap instanceof ConcurrentHashMap) && concurrentHashMap != null) {
                                    concurrentHashMap.put(sparkContext5.containerId, new WeakReference<>(webView2));
                                }
                            }
                            if ((interfaceC1892990zMP2 instanceof AbstractC1893000zMQ) && (abstractC1893000zMQ = (AbstractC1893000zMQ) interfaceC1892990zMP2) != null) {
                                abstractC1893000zMQ.LIZ(sparkContext5);
                            }
                            if (str == null || str.length() == 0 || (webView2 != null && (url2 = webView2.getUrl()) != null && a0.LJJIIZI(url2, str, false))) {
                                interfaceC1892990zMP2.setTitle("");
                            } else {
                                interfaceC1892990zMP2.setTitle(str);
                            }
                            if (webView2 != null && (url = webView2.getUrl()) != null) {
                                interfaceC1892990zMP2.setSubTitle(url);
                            }
                        }
                    }
                });
            }
        }
        if (sparkContext != null) {
            abstractC1539010q9T = (AbstractC1539010q9T) sparkContext.LJFF(AbstractC1539010q9T.class);
        } else {
            abstractC1539010q9T = null;
        }
        if ((abstractC1539010q9T instanceof C1893220zMm) && (c1893220zMm = (C1893220zMm) abstractC1539010q9T) != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c1548490qOl.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (sparkContext3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getSparkContext()) != null) {
                C1545810qKR c1545810qKR = (C1545810qKR) sparkContext3.LJFF(C1545810qKR.class);
                if (c1545810qKR != null && (list = c1545810qKR.LL) != null) {
                    Iterator<InterfaceC2217701Bqy> it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next instanceof C1892870zMD) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    interfaceC2217701Bqy = next;
                } else {
                    interfaceC2217701Bqy = null;
                }
                if ((interfaceC2217701Bqy instanceof C1892870zMD) && (c1892870zMD = (C1892870zMD) interfaceC2217701Bqy) != null) {
                    SparkContext sparkContext5 = c1892870zMD.LLILZLL;
                    if (sparkContext5 != null) {
                        sparkActivityLIZ = C1893200zMk.LIZ(sparkContext5);
                    } else {
                        sparkActivityLIZ = null;
                    }
                    if ((sparkActivityLIZ instanceof C19EG) && sparkActivityLIZ != null) {
                        poiThirdPartyViewModel = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ).get(PoiThirdPartyViewModel.class);
                    } else {
                        poiThirdPartyViewModel = null;
                    }
                    c1893220zMm.LLILLJJLI = poiThirdPartyViewModel;
                    C1893180zMi c1893180zMi = c1893220zMm.LLILLL;
                    if (c1893180zMi != null) {
                        c1893180zMi.LIZJ = c1892870zMD;
                        SparkContext sparkContextLLIILZL = c1892870zMD.LLIILZL();
                        if (sparkContextLLIILZL != null) {
                            sparkActivityLIZ2 = C1893200zMk.LIZ(sparkContextLLIILZL);
                        } else {
                            sparkActivityLIZ2 = null;
                        }
                        if ((sparkActivityLIZ2 instanceof C19EG) && sparkActivityLIZ2 != null) {
                            poiThirdPartyViewModel2 = (PoiThirdPartyViewModel) ViewModelProviders.of(sparkActivityLIZ2).get(PoiThirdPartyViewModel.class);
                        } else {
                            poiThirdPartyViewModel2 = null;
                        }
                        c1893180zMi.LIZLLL = poiThirdPartyViewModel2;
                    }
                }
            }
            Object objLJFF = sparkContext.LJFF(AbstractC1542200qEc.class);
            if ((objLJFF instanceof C1892890zMF) && (c1892890zMF = (C1892890zMF) objLJFF) != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ) != null && (sparkContext2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getSparkContext()) != null) {
                Bundle bundle = sparkContext2.bundle;
                if (bundle != null) {
                    string = bundle.getString("origin_url");
                } else {
                    string = null;
                }
                Bundle bundle2 = sparkContext2.bundle;
                if (bundle2 != null) {
                    string2 = bundle2.getString("hybrid_session_id");
                } else {
                    string2 = null;
                }
                Bundle bundle3 = sparkContext2.bundle;
                if (bundle3 != null) {
                    lValueOf = Long.valueOf(bundle3.getLong("container_create_ts"));
                } else {
                    lValueOf = null;
                }
                c1892890zMF.LLJI = string;
                c1892890zMF.LLJ = string2;
                if (lValueOf != null) {
                    c1892890zMF.LLJIJIL = Long.valueOf(lValueOf.longValue());
                }
                c1892890zMF.LLILLJJLI = true;
                c1892890zMF.LLILLL = "";
                c1892890zMF.LLILZ = true;
                c1892890zMF.LLIZLLLIL = null;
            }
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        this.LLILZ = true;
        if (this.LLILLL.length() == 0) {
            this.LLILLL = str;
            this.LLIZLLLIL = Long.valueOf(System.currentTimeMillis());
            PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLILZIL;
            if (poiThirdPartyViewModel != null) {
                poiThirdPartyViewModel.LLIZLLLIL = this.LLILLL;
            }
        }
    }

    @Override // X.AbstractC1542100qES
    public final void LJLLJ(SparkContext sparkContext, C1548490qOl c1548490qOl) throws JSONException {
        String url;
        String url2;
        int i = c1548490qOl.LIZIZ;
        if (i == 2) {
            LJLLLL(sparkContext, c1548490qOl);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (url2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getUrl()) != null) {
                this.LLJILJIL = true;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1548490qOl.LIZ;
                if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                    sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJIJLIJ(null, url2, false);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        LJLLLL(sparkContext, c1548490qOl);
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = c1548490qOl.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 == null || (url = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getUrl()) == null) {
            return;
        }
        this.LLJILJIL = true;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = c1548490qOl.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4.LJJIJLIJ(null, url, false);
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
        LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        PoiThirdPartyViewModel poiThirdPartyViewModel = this.LLILZIL;
        if (poiThirdPartyViewModel != null) {
            poiThirdPartyViewModel.LLILZ = c1542120qEU.LIZ;
            poiThirdPartyViewModel.LLILZIL = c1542120qEU.LIZIZ;
            poiThirdPartyViewModel.LLILZLL = c1542120qEU.LIZJ;
            poiThirdPartyViewModel.LLIZ = c1542120qEU.LIZLLL;
        }
    }

    @Override // X.AbstractC1537870q7d
    public final void LJLI(InterfaceC1541990qEH interfaceC1541990qEH, String str, String str2) {
        this.LLILZ = false;
        this.LLIZ = str2;
    }
}
