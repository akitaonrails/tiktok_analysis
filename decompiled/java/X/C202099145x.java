package X;

import Y.ACallableS420S0100000_13;
import Y.ARunnableS104S0100000_4;
import Y.ARunnableS83S0000000_3;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IDramaLandingTabApi;
import com.ss.android.ugc.aweme.classopt.ColdBootClassPreloader;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.logger.ColdBootLoggerAppDiffProtocol;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.145x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202099145x {
    public static final C01GW<C202099145x> LJJIJIIJIL = C452501pT.LIZIZ(new AnonymousClass1460());
    public Intent LIZ;
    public boolean LJIIIZ;
    public int LJIIJJI;
    public int LJIILIIL;
    public int LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJJ;
    public Integer LJIL;
    public int LJJ;
    public volatile long LJJII;
    public long LJJIII;
    public long LJJIIJZLJL;
    public Boolean LJJIIZ;
    public Boolean LJJIIZI;
    public boolean LJJIJ;
    public final Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public final Map<String, Long> LIZJ = new ConcurrentHashMap();
    public final Map<String, Long> LIZLLL = new ConcurrentHashMap();
    public final Map<String, Integer> LJ = new ConcurrentHashMap();
    public final Map<String, Long> LJFF = new ConcurrentHashMap();
    public final Map<String, Long> LJI = new ConcurrentHashMap();
    public boolean LJII = true;
    public boolean LJIIIIZZ = true;
    public int LJIIJ = 1;
    public int LJIIL = -1;
    public int LJIILJJIL = -1;
    public String LJIJI = "default";
    public boolean LJIJJLI = true;
    public volatile EnumC1589930rTb LJJI = EnumC1589930rTb.DEFAULT;
    public C0NEV LJJIFFI = C0NEV.DEFAULT;
    public long LJJIIJ = -1;
    public final C01GW LJJIJIIJI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 67));

    public static boolean LJIILL() {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        String str = C844470XAv.LJII;
        if (str == null) {
            str = null;
        }
        String strLJFF = C813020Vuu.LJIIL().LJFF(contextLIZ, "log_release_build_version_v4");
        if (str.length() == 0) {
            str = "default_version";
        }
        if (Intrinsics.LJFF(strLJFF, str)) {
            return false;
        }
        C813020Vuu.LJIIL().LJIIJJI(contextLIZ, "log_release_build_version_v4", str);
        return true;
    }

    public final boolean LJIIJJI() {
        Long l = (Long) ((ConcurrentHashMap) this.LIZLLL).get("cold_boot_application_to_main");
        if (l != null && l.longValue() > 1000) {
            LJIILJJIL(EnumC1589930rTb.VALID_APP_TO_MAIN);
            return false;
        }
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZLLL).get("cold_boot_main_create_to_resume");
        if (l2 == null || l2.longValue() <= 1000) {
            return true;
        }
        LJIILJJIL(EnumC1589930rTb.VALID_MAIN_CREATE_TO_RESUME);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL() {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202099145x.LJIIL():void");
    }

    public final void LIZ(JSONObject jSONObject) throws JSONException {
        C0NEV c0nev;
        int i;
        String str;
        if (this.LJIIIZ) {
            c0nev = C0NEV.HAD_CACHE;
        } else {
            c0nev = this.LJJIFFI;
        }
        LIZIZ(c0nev.getType(), "feed_no_cold_cache_reason");
        int i2 = 1;
        if (this.LJIIIZ) {
            i = 1;
        } else {
            i = 2;
        }
        LIZIZ(i, "cold_boot_use_cache");
        LIZIZ(this.LJIIJ, "cold_boot_from_type");
        LIZIZ(this.LJIIJJI, "cold_boot_feed_type");
        LIZIZ(this.LJIIL, "aweme_type");
        LIZIZ(this.LJIILL, "cold_boot_aweme_cache_type");
        LIZIZ(this.LJIILIIL, "aweme_is_paid_content");
        LIZIZ(this.LJIILJJIL, "cold_boot_use_surface_view");
        LIZIZ(C1103004Tc.LIZ.LIZIZ() ? 1 : 0, "cold_boot_storage_state");
        try {
            C844470XAv.LIZ.getClass();
            str = C844470XAv.LJII;
            if (str == null) {
                str = null;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (!Intrinsics.LJFF(C813020Vuu.LJIIL().LJFF(C844470XAv.LIZ(), "last_version"), str)) {
            C813020Vuu.LJIIL().LJIIJJI(C844470XAv.LIZ(), "last_version", str);
        } else {
            i2 = 0;
        }
        LIZIZ(i2, "is_first_launch_after_update");
        for (Map.Entry entry : ((ConcurrentHashMap) this.LJ).entrySet()) {
            String str2 = (String) entry.getKey();
            if (((Integer) entry.getValue()) != null) {
                jSONObject.put(str2, r3.intValue());
                C08TN.LIZ().LIZ(r3.intValue(), str2);
            }
        }
        C202098145w c202098145wLIZ = C08TN.LIZ();
        c202098145wLIZ.getClass();
        for (Map.Entry entry2 : new HashMap(c202098145wLIZ.LJJIIJZLJL).entrySet()) {
            jSONObject.put((String) entry2.getKey(), ((Number) entry2.getValue()).longValue());
        }
    }

    public final boolean LJIIIIZZ(String str) {
        if (((ConcurrentHashMap) this.LIZIZ).get(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIZ(String str) {
        if (((ConcurrentHashMap) this.LIZLLL).get(str) != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ(String str) {
        if (this.LJIJJ) {
            if (C1488250opb.LIZ.contains(str) || C1488250opb.LIZIZ.contains(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIILIIL(String str) {
        int i;
        Intent intent;
        Object action;
        boolean z = this.LJIJJLI;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        try {
            jSONObject.put("app2main5s", 1);
            ColdBootLoggerAppDiffProtocol.LIZ.getClass();
            C1495320p10.LIZIZ.getValue().LIZJ();
            boolean z2 = this.LJIIIIZZ;
            if (!Intrinsics.LJFF(str, "first_feed_show_time_new_user") || (z2 && LJIIJJI())) {
                for (Map.Entry entry : ((ConcurrentHashMap) this.LIZLLL).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
            } else {
                LIZIZ(1, "new_user_report_bad_case");
            }
            if (Intrinsics.LJFF(str, "first_feed_show_time_new_user_v4")) {
                i = 3;
            } else if (z) {
                i = 1;
            } else {
                i = 2;
            }
            LIZIZ(i, "is_new_user");
            int i2 = this.LJJ;
            if (i2 > 0) {
                LIZIZ(i2, "show_slogan_page_duration");
            }
            LIZ(jSONObject2);
            jSONObject2.put("has_dex2oat", this.LJIJ);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                C844470XAv.LIZ.getClass();
                jSONObject2.put("dex_image_size_kb", C2114808Qg.LIZIZ(C844470XAv.LIZ()));
                C844470XAv.LIZ();
                String str2 = C2114808Qg.LIZ;
                C2114808Qg.LIZ = null;
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject2.put("df_oat_flags", str2);
                }
            }
            Object obj = this.LJIL;
            if (obj != null) {
                jSONObject2.put("nu_trigger_scene", obj);
            }
            int i4 = this.LJJ;
            if (i4 > 0) {
                jSONObject2.put("show_slogan_page_duration", i4);
            }
            jSONObject2.put("cold_boot_preload_class_count", C202094145s.LJIJI);
            int i5 = this.LJIILLIIL;
            if (i5 != 0) {
                jSONObject2.put("lite_mode", i5);
            }
            if (this.LJJIJ) {
                C2837017z c2837017z = C1484940okG.LIZ;
                C1484950okH c1484950okHLIZ = C1484940okG.LIZ(jSONObject2);
                if (c1484950okHLIZ != null) {
                    jSONObject2.put("feed_total_abnormal_reason", c1484950okHLIZ.LIZ);
                    jSONObject2.put("feed_total_abnormal_sub_reason", c1484950okHLIZ.LIZIZ);
                }
            }
            Intent intent2 = this.LIZ;
            if (intent2 != null) {
                ComponentName component = intent2.getComponent();
                if ((component == null || (action = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOanZJjLznyOM8GonQYuKCBwqQwjJw==", null))) == null) && ((intent = this.LIZ) == null || (action = intent.getAction()) == null)) {
                    action = "unknown";
                }
                jSONObject2.put("feed_total_launch_reason", action);
            }
            if (i3 >= 33) {
                try {
                    long startRequestedUptimeMillis = Process.getStartRequestedUptimeMillis();
                    long j = C202094145s.LJFF - startRequestedUptimeMillis;
                    long j2 = C202094145s.LJIIZILJ - startRequestedUptimeMillis;
                    jSONObject2.put("app_start_to_main_focus_sys", j);
                    jSONObject2.put("feed_total_sys", j2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            long j3 = C202094145s.LIZLLL;
            if (j3 != 0) {
                jSONObject2.put("app_start_to_report_first_draw", j3 - C202094145s.LJIILL);
            }
            jSONObject2.put("feed_total_v3", (C202094145s.LJIIZILJ - C202094145s.LJII) + (C202094145s.LJIIIZ - C202094145s.LIZIZ));
            jSONObject3.put("category", jSONObject);
            jSONObject3.put("metric", jSONObject2);
            jSONObject4.put("placeHolder", "1");
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Long l = (Long) ((ConcurrentHashMap) this.LIZLLL).get("app_start_to_main_focus");
        if (l != null || (l = (Long) ((ConcurrentHashMap) this.LJFF).get("app_start_to_main_focus")) != null) {
            ((ConcurrentHashMap) this.LJI).put("app_start_to_main_focus", Long.valueOf(l.longValue()));
        }
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZLLL).get("feed_total");
        if (l2 != null || (l2 = (Long) ((ConcurrentHashMap) this.LJFF).get("feed_total")) != null) {
            ((ConcurrentHashMap) this.LJI).put("feed_total", Long.valueOf(l2.longValue()));
        }
        final C202098145w c202098145wLIZ = C08TN.LIZ();
        c202098145wLIZ.LJJJJZ = true;
        for (Map.Entry entry2 : new HashMap(c202098145wLIZ.LJJIIJZLJL).entrySet()) {
            Object key = entry2.getKey();
            long jLongValue = ((Number) entry2.getValue()).longValue();
            ((ConcurrentHashMap) c202098145wLIZ.LJI).put(key, Long.valueOf(jLongValue));
            ((ConcurrentHashMap) c202098145wLIZ.LJII).put(key, new C202100145y(0L, jLongValue, "null"));
            ((ConcurrentHashMap) c202098145wLIZ.LJIIIZ).put(key, Long.valueOf(jLongValue));
            ((ConcurrentHashMap) c202098145wLIZ.LJJ).put(key, Long.valueOf(jLongValue));
            ((ConcurrentHashMap) c202098145wLIZ.LJIIJ).put(key, Long.valueOf(jLongValue));
            if (c202098145wLIZ.LJJJI) {
                ((ConcurrentHashMap) c202098145wLIZ.LJIIJJI).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIIL).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIILIIL).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIILJJIL).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIILL).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIILLIIL).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIIZILJ).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIJ).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIJI).put(key, Long.valueOf(jLongValue));
                ((ConcurrentHashMap) c202098145wLIZ.LJIJJ).put(key, Long.valueOf(jLongValue));
            }
            if (c202098145wLIZ.LJJJIL) {
                ((ConcurrentHashMap) c202098145wLIZ.LJIJJLI).put(key, Long.valueOf(jLongValue));
            }
            ((ConcurrentHashMap) c202098145wLIZ.LJJIFFI).put(key, Long.valueOf(jLongValue));
            ((ConcurrentHashMap) c202098145wLIZ.LJJIII).put(key, Long.valueOf(jLongValue));
        }
        synchronized (c202098145wLIZ) {
            ((ConcurrentHashMap) c202098145wLIZ.LJII).put("main_task_count", new C202100145y(0L, c202098145wLIZ.LJJLIIIJ, "null"));
            ((ConcurrentHashMap) c202098145wLIZ.LJII).put("background_task_count", new C202100145y(0L, c202098145wLIZ.LJJLIIIJILLIZJL, "null"));
            for (Map.Entry entry3 : ((ConcurrentHashMap) c202098145wLIZ.LJJIIZ).entrySet()) {
                String str3 = (String) entry3.getKey();
                int iIntValue = ((Number) entry3.getValue()).intValue();
                Map<String, C202100145y> map = c202098145wLIZ.LJII;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str3);
                sbLIZ.append("_task_count");
                ((ConcurrentHashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), new C202100145y(0L, iIntValue, "null"));
            }
        }
        for (String str4 : C1488250opb.LIZ) {
            Long l3 = (Long) ((ConcurrentHashMap) c202098145wLIZ.LJI).get(str4);
            if (l3 != null) {
                ((ConcurrentHashMap) c202098145wLIZ.LJFF).put(str4, Long.valueOf(l3.longValue()));
            }
        }
        if (((Boolean) c202098145wLIZ.LJJJJLL.getValue()).booleanValue()) {
            C823050WQl.LIZJ().execute(new ARunnableS104S0100000_4(c202098145wLIZ, 99));
        } else {
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0BwM
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportCore$1");
                    try {
                        c202098145wLIZ.LJJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportCore$1");
                }
            });
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.08ZH
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportTask$1");
                    try {
                        c202098145wLIZ.LJJIJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportTask$1");
                }
            });
            C823050WQl.LJ().execute(new Runnable() { // from class: X.0BwR
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportAssem$1");
                    try {
                        c202098145wLIZ.LJIJJLI();
                        c202098145wLIZ.LJIJJ();
                        c202098145wLIZ.LJJIJIL();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportAssem$1");
                }
            });
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0BwN
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportCustom$1");
                    try {
                        c202098145wLIZ.LJJI();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportCustom$1");
                }
            });
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0BwS
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportRepoLoaded$1");
                    try {
                        c202098145wLIZ.LJJIIJ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportRepoLoaded$1");
                }
            });
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0BwT
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportThreadInfo$1");
                    try {
                        c202098145wLIZ.LJJIJIIJI();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportThreadInfo$1");
                }
            });
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0BwO
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportLoadSo$1");
                    try {
                        c202098145wLIZ.LJJIFFI();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportLoadSo$1");
                }
            });
            C823050WQl.LIZJ().execute(new Runnable() { // from class: X.0BwQ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportNetworkRequest$1");
                    try {
                        c202098145wLIZ.LJJIII();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportNetworkRequest$1");
                }
            });
            C823050WQl.LJ().execute(new Runnable() { // from class: X.0BwP
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportMemory$1");
                    try {
                        c202098145wLIZ.LJJII();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportMemory$1");
                }
            });
        }
        C793770VBv.LJFF(str, jSONObject4, jSONObject3);
        if (!z) {
            C793770VBv.LJFF("first_feed_show_time_v3_all", jSONObject4, jSONObject3);
        }
        try {
            IDramaLandingTabApi iDramaLandingTabApi = (IDramaLandingTabApi) PluggableExtentionKt.pluggableSpi$default(IDramaLandingTabApi.class, false, false, false, 14, null);
            if (iDramaLandingTabApi != null) {
                iDramaLandingTabApi.LIZIZ();
                jSONObject2.put("landing_tab", "");
                iDramaLandingTabApi.LIZ();
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        C15O7.LIZJ(new ACallableS420S0100000_13(jSONObject2, 2));
    }

    public final void LJIILJJIL(EnumC1589930rTb enumC1589930rTb) {
        String str;
        if (enumC1589930rTb == EnumC1589930rTb.BOTTOM_TAB) {
            IDramaLandingTabApi iDramaLandingTabApi = (IDramaLandingTabApi) PluggableExtentionKt.pluggableSpi$default(IDramaLandingTabApi.class, false, false, false, 14, null);
            if (iDramaLandingTabApi != null) {
                iDramaLandingTabApi.LIZIZ();
                str = "";
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "discover")) {
                return;
            }
        }
        EnumC1589930rTb enumC1589930rTb2 = this.LJJI;
        EnumC1589930rTb enumC1589930rTb3 = EnumC1589930rTb.DEFAULT;
        if (enumC1589930rTb2 == enumC1589930rTb3 && enumC1589930rTb != enumC1589930rTb3) {
            this.LJJI = enumC1589930rTb;
        }
        this.LJII = false;
    }

    public final void LIZIZ(int i, String str) {
        ((ConcurrentHashMap) this.LJ).put(str, Integer.valueOf(i));
    }

    public final void LIZLLL(String str, boolean z) {
        LIZJ(SystemClock.uptimeMillis(), str, z);
    }

    public final void LJ(long j, String str) {
        if (this.LJIJJ) {
            if (((ConcurrentHashMap) this.LIZLLL).get(str) != null) {
                if (LJIIJ(str)) {
                    if (this.LJII) {
                        LJIILJJIL(EnumC1589930rTb.CORE);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Duration:");
                        sbLIZ.append(str);
                        this.LJIJI = C2188811AlT.LIZIZ(sbLIZ);
                        C202098145w c202098145wLIZ = C08TN.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("D:");
                        sbLIZ2.append(str);
                        c202098145wLIZ.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    C202098145w c202098145wLIZ2 = C08TN.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("D:");
                    sbLIZ3.append(str);
                    c202098145wLIZ2.LJJIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                C08TN.LIZ().LJJIIZ("Duration");
                return;
            }
        } else if (((ConcurrentHashMap) this.LIZLLL).get(str) != null) {
            return;
        }
        ((ConcurrentHashMap) this.LIZLLL).put(str, Long.valueOf(j));
    }

    public final void LJI(String str, boolean z) {
        LJFF(SystemClock.uptimeMillis(), str, z);
    }

    public final void LIZJ(long j, String str, boolean z) {
        if (this.LJIJJ) {
            if (((ConcurrentHashMap) this.LIZIZ).get(str) != null) {
                if (LJIIJ(str)) {
                    if (this.LJII) {
                        LJIILJJIL(EnumC1589930rTb.CORE);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Begin:");
                        sbLIZ.append(str);
                        this.LJIJI = C2188811AlT.LIZIZ(sbLIZ);
                        C202098145w c202098145wLIZ = C08TN.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("B:");
                        sbLIZ2.append(str);
                        c202098145wLIZ.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    C202098145w c202098145wLIZ2 = C08TN.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("B:");
                    sbLIZ3.append(str);
                    c202098145wLIZ2.LJJIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                C08TN.LIZ().LJJIIZ("Begin");
                return;
            }
        } else if (((ConcurrentHashMap) this.LIZIZ).get(str) != null) {
            if (z && this.LJII) {
                LJIILJJIL(EnumC1589930rTb.CORE);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Begin:");
                sbLIZ4.append(str);
                this.LJIJI = C2188811AlT.LIZIZ(sbLIZ4);
                C202098145w c202098145wLIZ3 = C08TN.LIZ();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("B:");
                sbLIZ5.append(str);
                c202098145wLIZ3.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            return;
        }
        ((ConcurrentHashMap) this.LIZIZ).put(str, Long.valueOf(j));
        if (z) {
            ((ConcurrentHashMap) this.LIZJ).put(str, Long.valueOf(j));
        }
    }

    public final void LJFF(long j, String str, boolean z) {
        C0CMU c0cmu = C0CMU.LIZ;
        C0CBL c0cbl = C0CMU.LIZIZ;
        C0CBL c0cbl2 = C0CBL.IDLE;
        if (c0cbl == c0cbl2 && "cold_boot_start_to_tryplay".equals(str)) {
            synchronized (c0cmu) {
                try {
                    if (C0CMU.LIZIZ == c0cbl2) {
                        C0CMU.LIZIZ = C0CBL.ENTERED;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Iterator<C0CMV> it2 = C0CMU.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ();
            }
        }
        if ("cold_boot_start_to_tryplay".equals(str)) {
            if (!C592890NNf.LIZIZ().LIZIZ) {
                C592890NNf.LIZIZ().LIZJ();
            }
            if (((Number) C277800Aug.LIZ.getValue()).intValue() == 0 && ColdBootClassPreloader.LIZIZ.get()) {
                C823050WQl.LIZLLL().execute(new ARunnableS83S0000000_3(45));
            }
        }
        Long l = (Long) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (this.LJIJJ) {
            if (l == null) {
                if (LJIIJ(str)) {
                    if (this.LJII) {
                        LJIILJJIL(EnumC1589930rTb.CORE);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("End:");
                        sbLIZ.append(str);
                        this.LJIJI = C2188811AlT.LIZIZ(sbLIZ);
                        C202098145w c202098145wLIZ = C08TN.LIZ();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("E:");
                        sbLIZ2.append(str);
                        c202098145wLIZ.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                } else {
                    C202098145w c202098145wLIZ2 = C08TN.LIZ();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("E:");
                    sbLIZ3.append(str);
                    c202098145wLIZ2.LJJIIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                C08TN.LIZ().LJJIIZ("End");
                return;
            }
        } else if (l == null) {
            if (z) {
                if (!this.LJII) {
                    return;
                }
                LJIILJJIL(EnumC1589930rTb.CORE);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("End:");
                sbLIZ4.append(str);
                this.LJIJI = C2188811AlT.LIZIZ(sbLIZ4);
                C202098145w c202098145wLIZ3 = C08TN.LIZ();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("E:");
                sbLIZ5.append(str);
                c202098145wLIZ3.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
            ((ConcurrentHashMap) this.LIZLLL).put(str, 0L);
            return;
        }
        if (((ConcurrentHashMap) this.LIZLLL).get(str) == null) {
            ((ConcurrentHashMap) this.LIZLLL).put(str, Long.valueOf(j - l.longValue()));
        }
        if (z) {
            ((ConcurrentHashMap) this.LIZJ).remove(str);
        }
        if (C202094145s.LJIIZILJ != 0 || !Intrinsics.LJFF("feed_total", str)) {
            return;
        }
        C202094145s.LJIIZILJ = j;
    }
}
