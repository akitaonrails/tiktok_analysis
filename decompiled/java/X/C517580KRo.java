package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KRo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C517580KRo {
    public static final C517480KRe LIZ = new InterfaceC513260KAy() { // from class: X.0KRe
        public final Map<String, Boolean> LIZ = new LinkedHashMap();

        @Override // X.InterfaceC513250KAx
        public final String LIZIZ(String str, String str2) {
            return str;
        }

        @Override // X.InterfaceC513250KAx
        public final Map<String, Boolean> LIZ() {
            return this.LIZ;
        }

        @Override // X.InterfaceC513260KAy
        public final void LIZLLL(String str, C517530KRj c517530KRj) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("show_entrance", c517530KRj.LIZLLL);
            linkedHashMap.put("error_code", c517530KRj.LJFF);
            linkedHashMap.put("show_result", Integer.valueOf(c517530KRj.LJ));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("show_duration", Long.valueOf(c517530KRj.LJI));
            C516900KOy.LIZ(linkedHashMap2);
            C513240KAw.LIZ(this, str, "", "ttlive_sub_perf_entrance_show", linkedHashMap, linkedHashMap2, c517530KRj.LIZIZ, c517530KRj.LIZJ);
        }
    };
    public static final C517470KRd LIZIZ = new InterfaceC517590KRp() { // from class: X.0KRd
        public final Map<Integer, C517490KRf> LIZ = new LinkedHashMap();
        public final Map<String, Boolean> LIZIZ = new LinkedHashMap();

        @Override // X.InterfaceC513250KAx
        public final Map<String, Boolean> LIZ() {
            return this.LIZIZ;
        }

        public static Map LJIIL(C517490KRf c517490KRf) {
            Object objValueOf;
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C517510KRh c517510KRh = c517490KRf.LIZIZ;
            String str2 = "";
            if (c517510KRh == null) {
                objValueOf = "";
            } else {
                objValueOf = Integer.valueOf(c517510KRh.LIZLLL);
            }
            linkedHashMap.put("link_id", objValueOf);
            C517510KRh c517510KRh2 = c517490KRf.LIZIZ;
            if (c517510KRh2 != null && (str = c517510KRh2.LJ) != null) {
                str2 = str;
            }
            linkedHashMap.put("show_entrance", str2);
            linkedHashMap.put("name", c517490KRf.LIZ);
            return linkedHashMap;
        }

        public static Map LJIILIIL(C517490KRf c517490KRf) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("stay_duration", Long.valueOf(System.currentTimeMillis() - c517490KRf.LIZJ));
            C516900KOy.LIZ(linkedHashMap);
            return linkedHashMap;
        }

        @Override // X.InterfaceC517590KRp
        public final void LJ(C0KBP c0kbp) {
            LJI(c0kbp);
        }

        @Override // X.InterfaceC517590KRp
        public final void LJFF(C517550KRl c517550KRl) {
            C517490KRf c517490KRf = (C517490KRf) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(c517550KRl.LIZ));
            if (c517490KRf != null) {
                c517490KRf.LIZJ = System.currentTimeMillis();
            }
        }

        @Override // X.InterfaceC517590KRp
        public final void LJI(C517500KRg c517500KRg) {
            String string;
            String strLIZIZ;
            C501470JlZ c501470JlZ;
            String logId;
            C517490KRf c517490KRf = (C517490KRf) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(c517500KRg.LIZ));
            if (c517490KRf == null) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C20441214yg.LJ("PcsPagePerfReporter", "You haven't initialized the report for current page.");
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = ((ArrayList) c517490KRf.LIZLLL).size();
            ((ArrayList) c517490KRf.LIZLLL).add(new Pair(Long.valueOf(jCurrentTimeMillis), c517500KRg));
            Map<Integer, C517490KRf> map2 = this.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map2).entrySet()) {
                if (Intrinsics.LJFF(((C517490KRf) entry.getValue()).LIZ, c517490KRf.LIZ)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            int size2 = linkedHashMap.size();
            String str = c517490KRf.LIZ;
            C517510KRh c517510KRh = c517490KRf.LIZIZ;
            if (c517510KRh == null || (string = Integer.valueOf(c517510KRh.LIZLLL).toString()) == null) {
                string = "";
            }
            Map mapLJIIL = LJIIL(c517490KRf);
            String str2 = c517500KRg.LJ;
            int length = str2.length();
            Object objValueOf = str2;
            if (length == 0) {
                Throwable th = c517500KRg.LJFF;
                if (th != null) {
                    objValueOf = Integer.valueOf(C512240K7a.LIZ(th));
                } else {
                    objValueOf = "-8888";
                }
            }
            mapLJIIL.put("error_code", objValueOf);
            Throwable th2 = c517500KRg.LJFF;
            if (th2 != null) {
                boolean z = th2 instanceof C501470JlZ;
                if (z) {
                    strLIZIZ = "ApiServerException";
                } else if (th2 instanceof C1811850xFX) {
                    strLIZIZ = "NetworkErrorException";
                } else if (th2 instanceof C1494690ozz) {
                    strLIZIZ = "CronetIOException";
                } else if (th2 instanceof C1494450ozb) {
                    strLIZIZ = "NetworkNotAvailableException";
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unknown:");
                    sbLIZ.append(th2.getClass().getSimpleName());
                    sbLIZ.append(' ');
                    sbLIZ.append(th2.getLocalizedMessage());
                    sbLIZ.append(' ');
                    sbLIZ.append(th2.getMessage());
                    sbLIZ.append(' ');
                    sbLIZ.append(th2);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                mapLJIIL.put("error_type", strLIZIZ);
                if (z && (c501470JlZ = (C501470JlZ) th2) != null && (logId = c501470JlZ.getLogId()) != null) {
                    mapLJIIL.put("log_id", logId);
                }
                String strLIZIZ2 = C512240K7a.LIZIZ(th2);
                if (strLIZIZ2 != null) {
                    mapLJIIL.put("server_error_message", strLIZIZ2);
                }
            }
            mapLJIIL.put("show_result", Integer.valueOf(c517500KRg.LIZLLL));
            mapLJIIL.put("repeated_count", Integer.valueOf(size2));
            mapLJIIL.put("retry_count", Integer.valueOf(size));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("fmp_duration", Long.valueOf(jCurrentTimeMillis - c517490KRf.LIZJ));
            C516900KOy.LIZ(linkedHashMap2);
            Map<String, String> map3 = c517500KRg.LIZIZ;
            Throwable th3 = c517500KRg.LJFF;
            if (th3 != null) {
                map3.put("error_message", th3.toString());
            }
            C513240KAw.LIZ(this, str, string, "ttlive_sub_perf_page_show", mapLJIIL, linkedHashMap2, map3, c517500KRg.LIZJ);
        }

        @Override // X.InterfaceC517590KRp
        public final void LJII(C0KBP c0kbp) {
            String string;
            int i;
            String str;
            C517490KRf c517490KRf = (C517490KRf) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(c0kbp.LIZ));
            if (c517490KRf == null) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C20441214yg.LJ("PcsPagePerfReporter", "You haven't initialized the report for current page.");
                return;
            }
            String str2 = c517490KRf.LIZ;
            C517510KRh c517510KRh = c517490KRf.LIZIZ;
            String str3 = "";
            if (c517510KRh == null || (string = Integer.valueOf(c517510KRh.LIZLLL).toString()) == null) {
                string = "";
            }
            Map mapLJIIL = LJIIL(c517490KRf);
            C517500KRg c517500KRgLIZ = c517490KRf.LIZ();
            if (c517500KRgLIZ != null && (str = c517500KRgLIZ.LJ) != null) {
                str3 = str;
            }
            mapLJIIL.put("error_code", str3);
            C517500KRg c517500KRgLIZ2 = c517490KRf.LIZ();
            if (c517500KRgLIZ2 != null) {
                i = c517500KRgLIZ2.LIZLLL;
            } else {
                i = 2;
            }
            mapLJIIL.put("show_result", Integer.valueOf(i));
            C513240KAw.LIZ(this, str2, string, "ttlive_pcs_page_refresh", mapLJIIL, LJIILIIL(c517490KRf), c0kbp.LIZIZ, c0kbp.LIZJ);
        }

        @Override // X.InterfaceC517590KRp
        public final void LJIIIZ(C0JOM c0jom) {
            LJI(c0jom);
        }

        @Override // X.InterfaceC517590KRp
        public final void LJIIJ(C517560KRm c517560KRm) {
            String string;
            C517490KRf c517490KRf = (C517490KRf) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(c517560KRm.LIZ));
            if (c517490KRf == null) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C20441214yg.LJ("PcsPagePerfReporter", "You haven't initialized the report for current page.");
                return;
            }
            String str = c517490KRf.LIZ;
            C517510KRh c517510KRh = c517490KRf.LIZIZ;
            if (c517510KRh == null || (string = Integer.valueOf(c517510KRh.LIZLLL).toString()) == null) {
                string = "";
            }
            Map mapLJIIL = LJIIL(c517490KRf);
            Map mapLJIILIIL = LJIILIIL(c517490KRf);
            mapLJIILIIL.put("action_name", "SubmitForm");
            C513240KAw.LIZ(this, str, string, "ttlive_pcs_page_action", mapLJIIL, mapLJIILIIL, c517560KRm.LIZIZ, c517560KRm.LIZJ);
        }

        @Override // X.InterfaceC517590KRp
        public final void LJIIJJI(C517520KRi c517520KRi) {
            String string;
            int i;
            String str;
            C517490KRf c517490KRf = (C517490KRf) ((LinkedHashMap) this.LIZ).get(Integer.valueOf(c517520KRi.LIZ));
            if (c517490KRf == null) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C20441214yg.LJ("PcsPagePerfReporter", "You haven't initialized the report for current page.");
                return;
            }
            String str2 = c517490KRf.LIZ;
            C517510KRh c517510KRh = c517490KRf.LIZIZ;
            String str3 = "";
            if (c517510KRh == null || (string = Integer.valueOf(c517510KRh.LIZLLL).toString()) == null) {
                string = "";
            }
            Map mapLJIIL = LJIIL(c517490KRf);
            C517500KRg c517500KRgLIZ = c517490KRf.LIZ();
            if (c517500KRgLIZ != null && (str = c517500KRgLIZ.LJ) != null) {
                str3 = str;
            }
            mapLJIIL.put("error_code", str3);
            C517500KRg c517500KRgLIZ2 = c517490KRf.LIZ();
            if (c517500KRgLIZ2 != null) {
                i = c517500KRgLIZ2.LIZLLL;
            } else {
                i = 2;
            }
            mapLJIIL.put("show_result", Integer.valueOf(i));
            C513240KAw.LIZ(this, str2, string, "ttlive_sub_perf_page_leave", mapLJIIL, LJIILIIL(c517490KRf), c517520KRi.LIZIZ, c517520KRi.LIZJ);
            this.LIZ.remove(Integer.valueOf(c517520KRi.LIZ));
        }

        @Override // X.InterfaceC517590KRp
        public final void onHide(int i) {
            LJIIJJI(new C517520KRi(i));
        }

        @Override // X.InterfaceC513250KAx
        public final String LIZIZ(String str, String str2) {
            if (str2.length() > 0) {
                return str2;
            }
            return str;
        }

        @Override // X.InterfaceC517590KRp
        public final void LIZJ(String str, C0KBP c0kbp) {
            c0kbp.LIZIZ.put("redirect_page_key", str);
            LJI(c0kbp);
        }

        @Override // X.InterfaceC517590KRp
        public final void LJIIIIZZ(String str, C517510KRh c517510KRh) {
            C0W0R.LIZJ();
            Map<Integer, C517490KRf> map = this.LIZ;
            Integer numValueOf = Integer.valueOf(c517510KRh.LIZ);
            C517490KRf c517490KRf = new C517490KRf(str);
            c517490KRf.LIZJ = System.currentTimeMillis();
            c517490KRf.LIZIZ = c517510KRh;
            map.put(numValueOf, c517490KRf);
            String strValueOf = String.valueOf(c517510KRh.LIZLLL);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("link_id", Integer.valueOf(c517510KRh.LIZLLL));
            linkedHashMap.put("show_entrance", c517510KRh.LJ);
            C513240KAw.LIZ(this, str, strValueOf, "ttlive_sub_perf_page_start", linkedHashMap, new LinkedHashMap(), c517510KRh.LIZIZ, c517510KRh.LIZJ);
        }
    };
}
