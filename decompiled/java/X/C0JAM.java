package X;

import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0JAM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JAM {
    public static final C01GW<C0JAM> LJII = C452501pT.LIZIZ(new C0JAQ());
    public static final C01GW<C0JAM> LJIIIIZZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(415));
    public static final C01GW<C0JAM> LJIIIZ = C452501pT.LIZIZ(new C0JAO());
    public static final C01GW<C0JAM> LJIIJ = C452501pT.LIZIZ(new C0JAP());
    public static final C01GW<C0JAM> LJIIJJI = C452501pT.LIZIZ(new C0JAN());
    public static final C01GW<C0JAM> LJIIL = C452501pT.LIZIZ(new C0JAT());
    public static final C01GW<C0JAM> LJIILIIL = C452501pT.LIZIZ(new C0JAR());
    public static final C01GW<C0JAM> LJIILJJIL = C452501pT.LIZIZ(new C0JAS());
    public final HashMap<String, String> LIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0JAX());
    public final C01GW LJFF = C452501pT.LIZIZ(new C0JAW());
    public final C01GW LJI = C452501pT.LIZIZ(new C0JAV());

    public final void LIZIZ() {
        if (this.LIZJ == 1 && !this.LIZLLL) {
            HashMap<String, String> map = new HashMap<>();
            LJ();
            LJIIJ(null, null, null, map, false);
        }
        LIZJ();
    }

    public final void LIZJ() {
        this.LIZJ = 0;
        C0JAY c0jayLIZLLL = LIZLLL();
        c0jayLIZLLL.LIZ = -1L;
        c0jayLIZLLL.LIZIZ = -1L;
        c0jayLIZLLL.LIZJ = -1L;
        c0jayLIZLLL.LIZLLL = -1L;
    }

    public final boolean LIZ() {
        return this.LIZJ > 0 && !this.LIZLLL;
    }

    public final C0JAY LIZLLL() {
        return (C0JAY) this.LIZIZ.getValue();
    }

    public final HashMap<String, String> LJ() {
        HashMap<String, String> map = new HashMap<>();
        if (((List) this.LJFF.getValue()).size() > 0) {
            map.put("room_cnt", String.valueOf(((List) this.LJFF.getValue()).size()));
            map.put("room_id_list", this.LJFF.getValue().toString());
            map.put("anchor_id_list", this.LJI.getValue().toString());
            ((List) this.LJFF.getValue()).clear();
            ((List) this.LJI.getValue()).clear();
        }
        return map;
    }

    public final void LJFF() {
        if (this.LIZJ > 0) {
            return;
        }
        this.LIZJ = 1;
        this.LIZLLL = false;
        this.LJ = false;
    }

    public final void LJI() {
        if (!LIZ() || LIZLLL().LIZLLL > 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0JAY c0jayLIZLLL = LIZLLL();
        if (c0jayLIZLLL.LIZIZ < 0 && c0jayLIZLLL.LIZJ < 0) {
            c0jayLIZLLL.LIZIZ = jCurrentTimeMillis;
            c0jayLIZLLL.LIZJ = jCurrentTimeMillis;
        }
        LIZLLL().LIZLLL = jCurrentTimeMillis;
    }

    public final void LJIIIZ() {
        if (!LIZ() || LIZLLL().LIZJ > 0) {
            return;
        }
        LIZLLL().LIZJ = System.currentTimeMillis();
    }

    public C0JAM(HashMap<String, String> map) {
        this.LIZ = map;
    }

    public final void LJII(long j) {
        if (LIZ() && LIZLLL().LIZ <= 0) {
            if (j > 0) {
                LIZLLL().LIZ = j;
            } else {
                LIZLLL().LIZ = System.currentTimeMillis();
            }
        }
    }

    public final void LJIIIIZZ(long j) {
        if (LIZ() && LIZLLL().LIZIZ <= 0) {
            if (j > 0) {
                LIZLLL().LIZIZ = j;
            } else {
                LIZLLL().LIZIZ = System.currentTimeMillis();
            }
        }
    }

    public final void LJIIJ(String str, String str2, String str3, HashMap<String, String> map, boolean z) {
        if (this.LIZJ == 1) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJI(this.LIZ);
            C0JAY c0jayLIZLLL = LIZLLL();
            c0jayLIZLLL.getClass();
            HashMap map2 = new HashMap();
            long j = c0jayLIZLLL.LIZ;
            if (j >= 0) {
                map2.put("enter_timestamp", String.valueOf(j));
            }
            long j2 = c0jayLIZLLL.LIZ;
            if (j2 >= 0) {
                long j3 = c0jayLIZLLL.LIZIZ;
                if (j3 >= 0) {
                    long j4 = j3 - j2;
                    Long lValueOf = Long.valueOf(j4);
                    if (lValueOf.longValue() >= 0) {
                        lValueOf.longValue();
                        map2.put("request_start_timestamp", String.valueOf(c0jayLIZLLL.LIZIZ));
                        map2.put("enter2request_duration", String.valueOf(j4));
                    }
                }
            }
            if (c0jayLIZLLL.LIZ >= 0) {
                long j5 = c0jayLIZLLL.LIZIZ;
                if (j5 >= 0) {
                    long j6 = c0jayLIZLLL.LIZJ;
                    if (j6 >= 0) {
                        long j7 = j6 - j5;
                        Long lValueOf2 = Long.valueOf(j7);
                        if (lValueOf2.longValue() >= 0) {
                            lValueOf2.longValue();
                            map2.put("respond_timestamp", String.valueOf(c0jayLIZLLL.LIZJ));
                            map2.put("request2respond_duration", String.valueOf(j7));
                        }
                    }
                }
            }
            if (c0jayLIZLLL.LIZ >= 0 && c0jayLIZLLL.LIZIZ >= 0) {
                long j8 = c0jayLIZLLL.LIZJ;
                if (j8 >= 0) {
                    long j9 = c0jayLIZLLL.LIZLLL;
                    if (j9 >= 0) {
                        long j10 = j9 - j8;
                        Long lValueOf3 = Long.valueOf(j10);
                        if (lValueOf3.longValue() >= 0) {
                            lValueOf3.longValue();
                            map2.put("draw_over_timestamp", String.valueOf(c0jayLIZLLL.LIZLLL));
                            map2.put("draw_duration", String.valueOf(j10));
                        }
                    }
                }
            }
            if ((c0jayLIZLLL.LIZ < 0 || c0jayLIZLLL.LIZIZ < 0 || c0jayLIZLLL.LIZJ < 0 || c0jayLIZLLL.LIZLLL < 0) && !z) {
                map2.put("is_left_page", "1");
                long jCurrentTimeMillis = System.currentTimeMillis() - c0jayLIZLLL.LIZ;
                Long lValueOf4 = Long.valueOf(jCurrentTimeMillis);
                if (lValueOf4.longValue() >= 0) {
                    lValueOf4.longValue();
                    map2.put("enter2leave_duration", String.valueOf(jCurrentTimeMillis));
                }
            }
            c2344009Gk.LJII(map2);
            if (str != null) {
                c2344009Gk.LJFF("enter_from_merge", str);
            }
            if (str2 != null) {
                c2344009Gk.LJFF("enter_method", str2);
            }
            if (str3 != null) {
                c2344009Gk.LJFF("action_type", str3);
            }
            if (map != null) {
                c2344009Gk.LJI(map);
            }
            C20684815ws.LJIILLIIL("livesdk_entrance_impr_duration", c2344009Gk.LIZ);
            this.LIZJ = 2;
            this.LIZLLL = true;
            this.LJ = true;
        }
    }
}
