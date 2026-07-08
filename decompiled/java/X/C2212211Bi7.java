package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212211Bi7 {
    public InterfaceC2213131Bjb LIZ;
    public C2212931BjH LIZIZ;
    public C2212861BjA LIZJ;
    public boolean LIZLLL;

    public static void LIZIZ(C2212201Bi6 c2212201Bi6) {
        C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
        c2212141Bi0LJIIIIZZ.LIZ(c2212201Bi6);
        c2212141Bi0LJIIIIZZ.LIZJ();
        HashMap<String, Object> map = new HashMap<>(1);
        map.put("is_emptyround", 0);
        int i = C2212231Bi9.LJJIJIIJI;
        if (i != -1) {
            map.put("is_cold_start", Integer.valueOf(i));
        }
        HashMap<String, Object> map2 = new HashMap<>(1);
        map2.put("log_extra", C2212141Bi0.LJIIIIZZ().LJFF());
        C2212051Bhr.LIZJ().LJIIIIZZ(null, 84378473382L, "showlimit", map2, map);
    }

    /* JADX WARN: Type inference failed for: r0v40, types: [X.1BjA] */
    public final C2212931BjH LIZ(Context context) {
        if (context != null) {
            if ("ContextImpl".equals(context.getClass().getSimpleName())) {
                C2212381BiO.LJFF(" illegal context ");
            }
            C2212191Bi5.LIZJ().getClass();
            C2212931BjH c2212931BjH = null;
            if (!C2212191Bi5.LJFF()) {
                return null;
            }
            if (this.LIZ != null) {
                final C2212201Bi6 c2212201Bi6 = C2212181Bi4.LJ().LIZLLL().LIZ;
                if (c2212201Bi6 == null) {
                    if (C2212231Bi9.LJIIIIZZ() != null && C2212231Bi9.LJIIIIZZ().LIZLLL) {
                        C2212221Bi8.LIZIZ().LIZLLL();
                    }
                    C2212381BiO.LJFF(" there is no suitable ad this time ");
                } else {
                    C2212061Bhs.LIZIZ().LIZ(1006, c2212201Bi6.LLJI);
                    if (c2212201Bi6.LJIIIIZZ() && C2212231Bi9.LJJIIZI != null) {
                        C2212381BiO.LJ(c2212201Bi6.LLJI, " selecting a topview ad, we depend on you now ");
                        if (this.LIZJ == null) {
                            this.LIZJ = new Object() { // from class: X.1BjA
                            };
                        }
                        getClass();
                        C19GQ.LIZ("service_splash_origin_operation", "duration_is_origin_splash_ad_play_ready", new InterfaceC2287108xh<Object, Boolean>() { // from class: X.0cvh
                            @Override // X.InterfaceC2287108xh
                            public final Boolean apply(Object obj) {
                                InterfaceC1018310cbd interfaceC1018310cbd = C2212231Bi9.LJJIIZI;
                                return Boolean.valueOf(C1030730cvf.LIZ(c2212201Bi6, true));
                            }
                        });
                        if (C2212231Bi9.LJJIJ) {
                            C2212391BiP.LIZIZ();
                            this.LIZLLL = true;
                        }
                        LIZIZ(c2212201Bi6);
                        C2212191Bi5.LIZJ().getClass();
                    } else {
                        C2212381BiO.LJ(c2212201Bi6.LLJI, "prepare to bind splash data, building view which is new style");
                        C2212931BjH c2212931BjH2 = new C2212931BjH(context);
                        c2212931BjH2.setSplashAdInteraction(new C2212921BjG(c2212931BjH2, this.LIZ));
                        if (!c2212931BjH2.LIZ(c2212201Bi6)) {
                            C2212441BiU.LIZ().getClass();
                            C2212291BiF.LIZLLL().LJIIIZ("service_splash_ad_show_result", 7, null);
                            if (C2212231Bi9.LJIIIIZZ() != null && C2212231Bi9.LJIIIIZZ().LIZLLL) {
                                C2212221Bi8.LIZIZ().LIZLLL();
                            }
                        } else {
                            this.LIZIZ = c2212931BjH2;
                            C2212931BjH c2212931BjH3 = this.LIZIZ;
                            if (c2212931BjH3 != null) {
                                ((ArrayList) C1212240heQ.LIZ).add(new WeakReference(c2212931BjH3));
                            }
                            C2212191Bi5.LIZJ().getClass();
                            LIZIZ(c2212201Bi6);
                            C2212391BiP.LIZIZ();
                            this.LIZLLL = true;
                            C2212441BiU c2212441BiULIZ = C2212441BiU.LIZ();
                            c2212441BiULIZ.getClass();
                            c2212441BiULIZ.LIZJ = System.currentTimeMillis();
                            if (C2212441BiU.LIZ().LIZIZ) {
                                try {
                                    long j = c2212441BiULIZ.LIZJ - c2212441BiULIZ.LIZ;
                                    if (j > 0) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.putOpt("duration_init_to_show_ad", Long.valueOf(j));
                                        C2212291BiF.LIZLLL().LJI("service_init_to_show_ad", jSONObject, null);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                            C2212441BiU.LIZ().getClass();
                            C2212291BiF.LIZLLL().LJIIIZ("service_splash_ad_show_result", 0, null);
                            c2212931BjH = c2212931BjH2;
                        }
                    }
                }
                boolean z = C2212231Bi9.LJIIIIZZ().LIZLLL;
                if (c2212931BjH == null && !z) {
                    C2212221Bi8.LIZIZ().LIZLLL();
                }
                if (!this.LIZLLL) {
                    C2212391BiP.LIZIZ();
                }
                return c2212931BjH;
            }
            throw new IllegalStateException("SplashAdActionListener is null! please set it in SplashAdNative!");
        }
        throw new IllegalArgumentException("context is null");
    }
}
