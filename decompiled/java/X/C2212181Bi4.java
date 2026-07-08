package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Bi4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212181Bi4 {
    public static volatile C2212181Bi4 LJIILIIL;
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public C2212201Bi6 LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public final List<Runnable> LJIIJJI = Collections.synchronizedList(new ArrayList());
    public final List<Runnable> LJIIL = Collections.synchronizedList(new ArrayList());

    public final C2212741Biy LIZLLL() {
        C2212201Bi6 c2212201Bi6;
        this.LJIIIZ = false;
        if (C2212231Bi9.LJIIIIZZ().LIZJ) {
            C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
            c2212141Bi0LJIIIIZZ.getClass();
            this.LJIIIIZZ = C2212141Bi0.LIZLLL() != c2212141Bi0LJIIIIZZ.LIZJ.LIZIZ("show_splash_ad_day");
        }
        C2212741Biy c2212741Biy = new C2212741Biy();
        C2212601Bik c2212601BikLIZ = C2212601Bik.LIZ();
        c2212601BikLIZ.getClass();
        if (Math.abs(System.currentTimeMillis() - c2212601BikLIZ.LIZIZ) <= 10000) {
            c2212201Bi6 = c2212601BikLIZ.LIZ;
        } else {
            c2212601BikLIZ.LIZ = null;
            c2212201Bi6 = null;
        }
        if (c2212201Bi6 != null) {
            C2212601Bik c2212601BikLIZ2 = C2212601Bik.LIZ();
            c2212601BikLIZ2.LIZ = null;
            c2212601BikLIZ2.LIZIZ = 0L;
            c2212741Biy.LIZ = c2212201Bi6;
        } else {
            this.LJII = !C2212141Bi0.LJIIIIZZ().LJII();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last pick ad time is：");
            sbLIZ.append(C2211531Bh1.LIZ(C2212141Bi0.LJIIIIZZ().LJI()));
            C2212381BiO.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<C2212201Bi6> list = C2212061Bhs.LIZIZ().LIZ;
            if (!this.LJIIL.isEmpty()) {
                synchronized (this.LJIIL) {
                    try {
                        Iterator<Runnable> it2 = this.LJIIL.iterator();
                        while (it2.hasNext()) {
                            it2.next().run();
                        }
                        this.LJIIL.clear();
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            }
            List<C2212201Bi6> list2 = list;
            if (C2212231Bi9.LJJIJLIJ) {
                list2 = list;
                if (this.LJII) {
                    ArrayList arrayList = list == null ? new ArrayList() : new ArrayList(list);
                    arrayList.addAll(LJIIJJI());
                    list2 = arrayList;
                }
            }
            LJJII(list2, c2212741Biy);
            if (C2212231Bi9.LJJJJ) {
                C2211961Bhi.LIZ().LJII = true;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", jCurrentTimeMillis2);
            } catch (JSONException e) {
            }
            C2212291BiF.LIZLLL().LJI("service_get_available_ad_duration", jSONObject, null);
        }
        if (c2212741Biy.LIZIZ != 0) {
            C2212381BiO.LJFF("Record the time of the first brushing of the logo by time period");
            C2212141Bi0 c2212141Bi0LJIIIIZZ2 = C2212141Bi0.LJIIIIZZ();
            c2212141Bi0LJIIIIZZ2.LIZJ.LJFF(c2212741Biy.LIZIZ, "key_splash_ad_showed_time");
            c2212141Bi0LJIIIIZZ2.LIZJ();
        }
        return c2212741Biy;
    }

    public static C2212181Bi4 LJ() {
        if (LJIILIIL == null) {
            synchronized (C2212181Bi4.class) {
                try {
                    if (LJIILIIL == null) {
                        LJIILIIL = new C2212181Bi4();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIILIIL;
    }

    public static List LJIIJJI() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = C2212061Bhs.LIZIZ().LIZIZ != null ? new ArrayList(C2212061Bhs.LIZIZ().LIZIZ) : null;
        if (!C2212081Bhu.LIZ(arrayList2)) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C2212201Bi6 c2212201Bi6 = (C2212201Bi6) it2.next();
                if (c2212201Bi6.LJIIJ()) {
                    arrayList.add(c2212201Bi6);
                    C2212381BiO.LJ(c2212201Bi6.LLJI, "retrieved first show ad");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", c2212201Bi6.LLJJIJI).putOpt("ad_fetch_time", Long.valueOf(c2212201Bi6.LLILLJJLI));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C2212051Bhr.LIZJ().LJFF("splash_ad", "launch_miss", jSONObject, c2212201Bi6.LLJI);
                    C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
                    c2212141Bi0LJIIIIZZ.LIZJ.LIZ.LIZIZ.putBoolean("key_splash_ad_empty", false);
                    c2212141Bi0LJIIIIZZ.LIZJ();
                    break;
                }
                C2212381BiO.LJ(c2212201Bi6.LLJI, "retrieve first show ad failed with showtime expired");
            }
        } else {
            C2212381BiO.LJFF("retrieve first show ad failed with empty array");
        }
        if (arrayList.size() > 0) {
            ListProtector.get(arrayList, 0).getClass();
        }
        return arrayList;
    }

    public final void LIZJ() {
        boolean z = C2212231Bi9.LJIIIIZZ ? this.LJII : this.LJIIIIZZ;
        if (this.LJIIIZ || z || !C2212231Bi9.LJIIIIZZ().LIZJ) {
            return;
        }
        C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
        c2212141Bi0LJIIIIZZ.LIZ(null);
        c2212141Bi0LJIIIIZZ.LIZJ();
        HashMap<String, Object> map = new HashMap<>(1);
        map.put("is_emptyround", 1);
        LJIJJLI(map);
        HashMap<String, Object> map2 = new HashMap<>(1);
        map2.put("log_extra", C2212141Bi0.LJIIIIZZ().LJFF());
        C2212051Bhr.LIZJ().LJIIIIZZ(null, 84378473382L, "showlimit", map2, map);
        C2212381BiO.LJFF("empty list, add show count");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1 A[Catch: NumberFormatException -> 0x00cc, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00cc, blocks: (B:14:0x004e, B:16:0x006f, B:18:0x0077, B:20:0x007a, B:21:0x0094, B:23:0x0097, B:25:0x009c, B:31:0x00b2, B:34:0x00c1, B:30:0x00af), top: B:57:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd A[EDGE_INSN: B:60:0x00dd->B:39:0x00dd BREAK  A[LOOP:0: B:10:0x0036->B:62:0x0036], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair LJII() {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212181Bi4.LJII():android.util.Pair");
    }

    public static boolean LJJ() {
        boolean zLJI = MethodIDManager.LJI(202093);
        if (C2211961Bhi.LIZ().LIZ != -1) {
            long j = C2211961Bhi.LIZ().LJFF;
            if (C2211961Bhi.LIZ().LIZ == 1) {
                LJIIZILJ(j, true, false, true);
                C2212381BiO.LJFF(" receiving stop-show order success, stop selecting ad ");
                C2212061Bhs.LIZIZ().LIZ(1003, 84378473382L);
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return false;
            }
            if (C2211961Bhi.LIZ().LIZ == 2) {
                C2212381BiO.LJFF(" receiving stop-show order success, continue to selecting ad ");
                LJIIZILJ(j, true, false, false);
            }
        } else {
            C2212381BiO.LJFF(" receiving stop-show order failed, fallback to preloaded stop-show period ");
            long j2 = C2212061Bhs.LIZIZ().LJ;
            long j3 = C2212061Bhs.LIZIZ().LJFF;
            if (j3 > j2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis >= j2 && jCurrentTimeMillis <= j3) {
                    if (C2212231Bi9.LJJIIZ) {
                        LJIIZILJ(0L, false, true, false);
                    }
                    C2212381BiO.LJFF(" current time is in stop-show period, stop selecting ad ");
                    C2212061Bhs.LIZIZ().LIZ(1004, 84378473382L);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return false;
                }
            }
            if (C2212231Bi9.LJJIIZ) {
                LJIIZILJ(0L, false, false, false);
            }
            C2212381BiO.LJFF(" current time is not in stop-show period, continue to selecting ad ");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return true;
    }

    public static long LIZ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C2212231Bi9.LJJJJ && (C2212231Bi9.LJJJJI / 100000) % 10 != 1) {
            C2212381BiO.LIZ(j, "ad enable valid time");
            return C2212161Bi2.LJII();
        }
        return jCurrentTimeMillis;
    }

    public static boolean LJI(C2212201Bi6 c2212201Bi6) {
        int i = c2212201Bi6.LLJL;
        if (i != 0) {
            if (i != 2) {
                return false;
            }
            C2212151Bi1 c2212151Bi1 = c2212201Bi6.LLJLIL;
            C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
            if (c2212151Bi1 != null && c2212151Bi1.LIZJ() && C2212161Bi2.LJIJ(c2212151Bi1.LIZLLL, c2212141Bi0LJIIIIZZ)) {
                return true;
            }
            LJIILIIL(2, c2212201Bi6);
            return false;
        }
        C2212321BiI c2212321BiI = c2212201Bi6.LL;
        C2212141Bi0 c2212141Bi0LJIIIIZZ2 = C2212141Bi0.LJIIIIZZ();
        if (c2212321BiI != null && c2212321BiI.LIZJ() && C2212161Bi2.LJIJ(c2212321BiI.LIZLLL, c2212141Bi0LJIIIIZZ2)) {
            return true;
        }
        LJIILIIL(1, c2212201Bi6);
        return false;
    }

    public static void LJIIIIZZ(int i) {
        C2212441BiU.LIZ().getClass();
        C2212291BiF.LIZLLL().LJIIIZ("service_splash_ad_show_result", i, null);
    }

    public static void LJIJJLI(HashMap map) {
        int i = C2212231Bi9.LJJIJIIJI;
        if (i != -1) {
            map.put("is_cold_start", Integer.valueOf(i));
        }
    }

    public final void LJIIIZ(boolean z) {
        this.LJIIJ = false;
        if (C2212231Bi9.LJIIIIZZ().LJIILLIIL) {
            boolean z2 = C2212231Bi9.LJJIIZ;
            if (C2212231Bi9.LJIIIIZZ().LJIILLIIL) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (z2) {
                    if (Math.abs(jCurrentTimeMillis - this.LIZLLL) < C2212061Bhs.LIZIZ().LJI) {
                        return;
                    }
                } else if (Math.abs(jCurrentTimeMillis - C2212231Bi9.LJII) < C2212061Bhs.LIZIZ().LIZLLL || Math.abs(jCurrentTimeMillis - this.LIZIZ) < C2212061Bhs.LIZIZ().LIZJ) {
                    return;
                }
            } else {
                return;
            }
        }
        C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
        c2212141Bi0LJIIIIZZ.LIZJ.LJ(c2212141Bi0LJIIIIZZ.LJIIJJI() + 1, "key_splash_ad_show_sequence");
        c2212141Bi0LJIIIIZZ.LIZJ();
        HashMap<String, Object> map = new HashMap<>(1);
        map.put("ad_sequence", Integer.valueOf(C2212141Bi0.LJIIIIZZ().LJIIJJI()));
        map.put("show_limit", Integer.valueOf(z ? 1 : 0));
        LJIJJLI(map);
        HashMap<String, Object> map2 = new HashMap<>(1);
        map2.put("log_extra", C2212141Bi0.LJIIIIZZ().LJFF());
        C2212051Bhr.LIZJ().LJIIIIZZ(null, 84378473382L, "valid_stock", map2, map);
        C2212381BiO.LJFF("sending stock request");
        C2212391BiP.LIZ(z, false);
        C2212141Bi0 c2212141Bi0LJIIIIZZ2 = C2212141Bi0.LJIIIIZZ();
        c2212141Bi0LJIIIIZZ2.LIZJ.LJFF(System.currentTimeMillis(), "splash_last_stock_time");
        c2212141Bi0LJIIIIZZ2.LIZJ();
        this.LIZIZ = System.currentTimeMillis();
        if (this.LJII && C2212231Bi9.LJJJJZI) {
            C2212381BiO.LJFF(" consuming first-show ad opportunity ");
            C2212141Bi0 c2212141Bi0LJIIIIZZ3 = C2212141Bi0.LJIIIIZZ();
            c2212141Bi0LJIIIIZZ3.LIZJ.LIZ.LIZIZ.putBoolean("splash_ad_has_first_refresh", true);
            c2212141Bi0LJIIIIZZ3.LIZJ();
        }
        this.LJIIJ = true;
    }

    public final void LJIILLIIL(int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("today_show_count", Integer.valueOf(C2212141Bi0.LJIIIIZZ().LJIILIIL()));
        map.put("failed_reason", Integer.valueOf(i));
        map.put("stock_time_interval_valid", Integer.valueOf(this.LJIIJ ? 1 : 0));
        LJIJJLI(map);
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("log_extra", C2212141Bi0.LJIIIIZZ().LJFF());
        C2212051Bhr.LIZJ().LJIIIIZZ(null, 84378473382L, "splash_show_failed", map2, map);
    }

    public final void LJIL(long j) {
        this.LIZ = j;
        if (C2212231Bi9.LJIIIIZZ().LJII) {
            C2212141Bi0 c2212141Bi0LJIIIIZZ = C2212141Bi0.LJIIIIZZ();
            c2212141Bi0LJIIIIZZ.LIZJ.LJFF(j, "splash_ad_last_show_time");
            c2212141Bi0LJIIIIZZ.LIZJ();
        }
    }

    public static int LJFF(C2212201Bi6 c2212201Bi6, boolean z) {
        long j = c2212201Bi6.LLJI;
        String strValueOf = String.valueOf(j);
        long jLIZ = LIZ(j);
        if (c2212201Bi6.LJI() > jLIZ) {
            LJIJI(17, "ad not reached show time, use device time.", strValueOf, z);
            return 10009;
        }
        if (c2212201Bi6.LJFF() < jLIZ) {
            LJIJI(18, "ad show time expired, use device time.", strValueOf, z);
            return 10008;
        }
        if (C2212231Bi9.LJJJJ && (C2212231Bi9.LJJJJI / 100000) % 10 == 1) {
            long jLJII = C2212161Bi2.LJII();
            if (c2212201Bi6.LJI() > jLJII) {
                LJIJI(17, "ad not reached show time, use valid time.", strValueOf, z);
                return 10021;
            }
            if (c2212201Bi6.LJFF() < jLJII) {
                LJIJI(18, "ad show time expired, use valid time.", strValueOf, z);
                return 10020;
            }
            return 5000;
        }
        return 5000;
    }

    public static void LJIIL(String str, int[] iArr) {
        if (iArr != null) {
            try {
                if (iArr.length == 2) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i : iArr) {
                        jSONArray.put(i);
                    }
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject.put("log_extra", C2212061Bhs.LIZIZ().LIZJ());
                    jSONObject2.put("first_show_period", jSONArray);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("is_ad_event", "1");
                    C2212051Bhr.LIZJ().LJFF("splash_ad", str, jSONObject, 84378473382L);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJIILIIL(int i, C2212201Bi6 c2212201Bi6) {
        String str;
        String strLJIIJJI;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1").putOpt("log_extra", c2212201Bi6.LLJJIJI);
            JSONObject jSONObject2 = new JSONObject();
            if (i != 1) {
                if (i != 2) {
                    str = "";
                    strLJIIJJI = "";
                } else {
                    str = "not_download_video";
                    strLJIIJJI = C2212161Bi2.LJIIZILJ(c2212201Bi6.LLJLIL);
                }
            } else {
                str = "not_download_image";
                strLJIIJJI = C2212161Bi2.LJIIJJI(c2212201Bi6.LL);
            }
            jSONObject2.putOpt("reason", str);
            jSONObject2.putOpt("url", strLJIIJJI);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(c2212201Bi6.LLILLJJLI));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2212051Bhr.LIZJ().LJFF("splash_ad", "not_showing_reason", jSONObject, c2212201Bi6.LLJI);
    }

    public final boolean LIZIZ(boolean z, boolean z2) {
        long j;
        long j2;
        if (!C2212231Bi9.LJIIIIZZ().LJIILLIIL) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            long j3 = C2212061Bhs.LIZIZ().LJI;
            if (z2) {
                j2 = this.LIZLLL;
            } else {
                j2 = this.LJ;
            }
            if (Math.abs(jCurrentTimeMillis - j2) < j3) {
                return false;
            }
            return true;
        }
        if (Math.abs(jCurrentTimeMillis - C2212231Bi9.LJII) < C2212061Bhs.LIZIZ().LIZLLL) {
            return false;
        }
        if (z2) {
            j = this.LIZIZ;
        } else {
            j = this.LIZJ;
        }
        if (Math.abs(jCurrentTimeMillis - j) < C2212061Bhs.LIZIZ().LIZJ) {
            return false;
        }
        return true;
    }

    public final void LJIIJ(final int i, final C2212201Bi6 c2212201Bi6) {
        final long jLIZ = LIZ(0L);
        final boolean z = C2212231Bi9.LJJIIZ;
        final C2212051Bhr c2212051BhrLIZJ = C2212051Bhr.LIZJ();
        final long j = this.LIZ;
        c2212051BhrLIZJ.getClass();
        final InterfaceC20685715x1 interfaceC20685715x1 = C2212231Bi9.LIZIZ;
        if (interfaceC20685715x1 != null) {
            c2212051BhrLIZJ.LJIIJ(new Runnable() { // from class: X.1Bhn
                @Override // java.lang.Runnable
                public final void run() {
                    C2212051Bhr c2212051Bhr = c2212051BhrLIZJ;
                    C2212201Bi6 c2212201Bi62 = c2212201Bi6;
                    long j2 = jLIZ;
                    boolean z2 = z;
                    long j3 = j;
                    int i2 = i;
                    InterfaceC20685715x1 interfaceC20685715x12 = interfaceC20685715x1;
                    c2212051Bhr.getClass();
                    C1C7U.LIZ("SplashAdEventLogManager@2beb.sendSplashFilterAd$1L");
                    C20685515wz c20685515wz = (C20685515wz) interfaceC20685715x12;
                    c20685515wz.LIZ("splash_ad", "splash_filter_ad", C2212051Bhr.LIZLLL(c2212201Bi62), C2212051Bhr.LIZIZ(c2212201Bi62, j2, z2, j3, i2, null));
                    C1C7U.LIZIZ("SplashAdEventLogManager@2beb.sendSplashFilterAd$1L");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02dc A[PHI: r0 r7
      0x02dc: PHI (r0v41 X.1Bi6) = (r0v40 X.1Bi6), (r0v53 X.1Bi6) binds: [B:123:0x02da, B:116:0x02aa] A[DONT_GENERATE, DONT_INLINE]
      0x02dc: PHI (r7v3 int[]) = (r7v2 int[]), (r7v9 int[]) binds: [B:123:0x02da, B:116:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0238 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(java.util.List<X.C2212201Bi6> r25, X.C2212741Biy r26) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212181Bi4.LJJII(java.util.List, X.1Biy):void");
    }

    public static void LJIILL(int i, int i2, C2212201Bi6 c2212201Bi6) {
        HashMap<String, Object> map = new HashMap<>();
        LJIJJLI(map);
        map.put("total_count", Integer.valueOf(i));
        map.put("finish_index", Integer.valueOf(i2));
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, "pick_finish", null, map);
    }

    public final void LJIILJJIL(final int i, final int i2, final C2212201Bi6 c2212201Bi6) {
        final long jLIZ = LIZ(0L);
        final boolean z = C2212231Bi9.LJJIIZ;
        final C2212051Bhr c2212051BhrLIZJ = C2212051Bhr.LIZJ();
        final long j = this.LIZ;
        c2212051BhrLIZJ.getClass();
        final InterfaceC20685715x1 interfaceC20685715x1 = C2212231Bi9.LIZIZ;
        if (interfaceC20685715x1 != null) {
            c2212051BhrLIZJ.LJIIJ(new Runnable() { // from class: X.1Bhm
                @Override // java.lang.Runnable
                public final void run() {
                    C2212051Bhr c2212051Bhr = c2212051BhrLIZJ;
                    int i3 = i2;
                    C2212201Bi6 c2212201Bi62 = c2212201Bi6;
                    long j2 = jLIZ;
                    boolean z2 = z;
                    long j3 = j;
                    int i4 = i;
                    InterfaceC20685715x1 interfaceC20685715x12 = interfaceC20685715x1;
                    c2212051Bhr.getClass();
                    C1C7U.LIZ("SplashAdEventLogManager@2beb.sendSplashIsOriginOperation$1L");
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("pickResult", i3);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C20685515wz c20685515wz = (C20685515wz) interfaceC20685715x12;
                    c20685515wz.LIZ("splash_ad", "splash_is_origin_operation", C2212051Bhr.LIZLLL(c2212201Bi62), C2212051Bhr.LIZIZ(c2212201Bi62, j2, z2, j3, i4, jSONObject));
                    C1C7U.LIZIZ("SplashAdEventLogManager@2beb.sendSplashIsOriginOperation$1L");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x023e A[PHI: r0 r2 r17
      0x023e: PHI (r0v25 int[]) = (r0v24 int[]), (r0v41 int[]) binds: [B:80:0x023c, B:73:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r2v5 X.1Bi6) = (r2v4 X.1Bi6), (r2v9 X.1Bi6) binds: [B:80:0x023c, B:73:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x023e: PHI (r17v2 boolean) = (r17v1 boolean), (r17v6 boolean) binds: [B:80:0x023c, B:73:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0244 A[PHI: r0 r2 r17
      0x0244: PHI (r0v26 int[]) = (r0v24 int[]), (r0v41 int[]) binds: [B:80:0x023c, B:73:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r2v6 X.1Bi6) = (r2v4 X.1Bi6), (r2v9 X.1Bi6) binds: [B:80:0x023c, B:73:0x0206] A[DONT_GENERATE, DONT_INLINE]
      0x0244: PHI (r17v3 boolean) = (r17v1 boolean), (r17v6 boolean) binds: [B:80:0x023c, B:73:0x0206] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ(java.util.List<X.C2212201Bi6> r26, X.C2212741Biy r27, boolean r28) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212181Bi4.LJJIIJ(java.util.List, X.1Biy, boolean):void");
    }

    public static void LJIIZILJ(long j, boolean z, boolean z2, boolean z3) {
        Object obj;
        String str = "1";
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.putOpt("is_ad_event", "1");
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            jSONObject2.putOpt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, obj);
            jSONObject.putOpt("log_extra", C2212061Bhs.LIZIZ().LIZJ());
            if (z) {
                jSONObject2.putOpt("duration", Long.valueOf(j));
                if (!z3) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject2.putOpt("stop_show", str);
            } else {
                if (!z2) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject2.putOpt("is_penalty_period", str);
            }
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C2212051Bhr.LIZJ().LJFF("splash_ad", "stop_showing_monitor", jSONObject, 84378473382L);
    }

    public static void LJIJI(int i, String str, String str2, boolean z) {
        InterfaceC2213231Bjl interfaceC2213231Bjl = C2212231Bi9.LJJL;
        if (!z && interfaceC2213231Bjl != null) {
            boolean z2 = C2212231Bi9.LJJIIZ;
            C1031060cwC.LIZ.getClass();
            C1031060cwC.LIZJ().LJFF(i, str, str2, z2, true, false);
        }
    }

    public static void LJIJJ(C2212201Bi6 c2212201Bi6, int i, int i2, int i3) {
        HashMap<String, Object> map = new HashMap<>();
        LJIJJLI(map);
        map.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
        map.put("error_code", Integer.valueOf(i2));
        map.put("index", Integer.valueOf(i3));
        map.put("load_type", Integer.valueOf(c2212201Bi6.LLJLILLLLZIIL));
        C2212051Bhr.LIZJ().LJIIIIZZ(c2212201Bi6, 0L, "pick_model", null, map);
    }

    public static void LJIJ(C2349409Im c2349409Im, int[] iArr, int i, boolean z, long j) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("log_extra", C2212061Bhs.LIZIZ().LIZJ());
        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("has_chance", Integer.valueOf(z ? 1 : 0));
        if (iArr != null) {
            map2.put("period_time", e3.e + iArr[0] + "," + iArr[1] + e3.f);
        }
        if (c2349409Im != null && !TextUtils.isEmpty(c2349409Im.LIZIZ)) {
            map2.put("period_first_map", c2349409Im.LIZIZ);
        }
        map2.put("latest_period_first_show_time", Long.valueOf(j / 1000));
        map2.put("type", Integer.valueOf(i));
        C2212051Bhr.LIZJ().LJIIIIZZ(null, 84378473382L, "has_period_first_chance", map, map2);
    }

    public final C2212201Bi6 LJJI(List<C2212201Bi6> list, int[] iArr, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        return LJJIFFI(list, iArr, i, z, z2, z3, z4, -1, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2212201Bi6 LJJIII(java.util.List r23, int[] r24, boolean r25, boolean r26, int r27, boolean r28, final boolean r29) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212181Bi4.LJJIII(java.util.List, int[], boolean, boolean, int, boolean, boolean):X.1Bi6");
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b A[PHI: r16
      0x006b: PHI (r16v2 X.1Bi6) = (r16v0 X.1Bi6), (r16v0 X.1Bi6), (r16v4 X.1Bi6) binds: [B:41:0x0082, B:42:0x0084, B:30:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2212201Bi6 LJJIFFI(java.util.List<X.C2212201Bi6> r27, int[] r28, int r29, boolean r30, boolean r31, boolean r32, boolean r33, int r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212181Bi4.LJJIFFI(java.util.List, int[], int, boolean, boolean, boolean, boolean, int, boolean):X.1Bi6");
    }
}
