package X;

import Y.ARunnableS0S1000000_2;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.experiment.ColdBootAppLogReportConfig;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.INewUserApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.145w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202098145w {
    public static final C01GW<C202098145w> LJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AnonymousClass1461());
    public boolean LJJIJIIJI;
    public boolean LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public boolean LJJJI;
    public boolean LJJJIL;
    public volatile boolean LJJJJ;
    public boolean LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public volatile boolean LJJJJZ;
    public long LJJJLL;
    public long LJJJLZIJ;
    public long LJJJZ;
    public long LJJL;
    public long LJJLI;
    public long LJJLIIIIJ;
    public int LJJLIIIJ;
    public int LJJLIIIJILLIZJL;
    public int LJJLIIIJJI;
    public C798360VTm LJJLIIIJJIZ;
    public long LJJLIIIJL;
    public long LJJLIIIJLJLI;
    public final Map<String, Long> LIZ = new ConcurrentHashMap();
    public final Map<String, Long> LIZIZ = new ConcurrentHashMap();
    public final Map<String, Long> LIZJ = new ConcurrentHashMap();
    public final Map<String, Long> LIZLLL = new ConcurrentHashMap();
    public final Map<String, Long> LJ = new ConcurrentHashMap();
    public final Map<String, Long> LJFF = new ConcurrentHashMap();
    public final Map<String, Long> LJI = new ConcurrentHashMap();
    public final Map<String, C202100145y> LJII = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue<C1869680yko> LJIIIIZZ = new ConcurrentLinkedQueue<>();
    public final Map<String, Long> LJIIIZ = new ConcurrentHashMap();
    public final Map<String, Long> LJIIJ = new ConcurrentHashMap();
    public final Map<String, Long> LJIIJJI = new ConcurrentHashMap();
    public final Map<String, Long> LJIIL = new ConcurrentHashMap();
    public final Map<String, Long> LJIILIIL = new ConcurrentHashMap();
    public final Map<String, Long> LJIILJJIL = new ConcurrentHashMap();
    public final Map<String, Long> LJIILL = new ConcurrentHashMap();
    public final Map<String, Long> LJIILLIIL = new ConcurrentHashMap();
    public final Map<String, Long> LJIIZILJ = new ConcurrentHashMap();
    public final Map<String, Long> LJIJ = new ConcurrentHashMap();
    public final Map<String, Long> LJIJI = new ConcurrentHashMap();
    public final Map<String, Long> LJIJJ = new ConcurrentHashMap();
    public final Map<String, Long> LJIJJLI = new ConcurrentHashMap();
    public final Map<String, Long> LJIL = new ConcurrentHashMap();
    public final Map<String, Long> LJJ = new ConcurrentHashMap();
    public final List<String> LJJI = Collections.synchronizedList(new ArrayList());
    public final Map<String, Long> LJJIFFI = new ConcurrentHashMap();
    public final Map<String, Long> LJJII = new ConcurrentHashMap();
    public final Map<String, Long> LJJIII = new ConcurrentHashMap();
    public final Map<String, Long> LJJIIJ = new ConcurrentHashMap();
    public final Map<String, Long> LJJIIJZLJL = new ConcurrentHashMap();
    public final Map<String, Integer> LJJIIZ = new ConcurrentHashMap(12);
    public final Map<Integer, String> LJJIIZI = new HashMap();
    public final Map<String, Integer> LJJIJ = new ConcurrentHashMap();
    public boolean LJJIJIIJIL = true;
    public final C01GW LJJJJLL = C452501pT.LIZIZ(new C202101145z());
    public EnumC1609850rzj LJJJJZI = EnumC1609850rzj.APPLICATION_ATTACH;
    public EnumC1609840rzi LJJJLIIL = EnumC1609840rzi.APPLICATION_ATTACH;

    public final synchronized void LJIIL() {
        if (this.LJJIZ) {
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                this.LJJLIIIJ++;
                Map<String, Integer> map = this.LJJIIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("main_");
                sbLIZ.append(this.LJJJJZI.getValue());
                Integer num = (Integer) ((ConcurrentHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
                if (num == null) {
                    Map<String, Integer> map2 = this.LJJIIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("main_");
                    sbLIZ2.append(this.LJJJJZI.getValue());
                    ((ConcurrentHashMap) map2).put(C2188811AlT.LIZIZ(sbLIZ2), 1);
                } else {
                    Map<String, Integer> map3 = this.LJJIIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("main_");
                    sbLIZ3.append(this.LJJJJZI.getValue());
                    ((ConcurrentHashMap) map3).put(C2188811AlT.LIZIZ(sbLIZ3), Integer.valueOf(num.intValue() + 1));
                }
            } else {
                this.LJJLIIIJILLIZJL++;
                Map<String, Integer> map4 = this.LJJIIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("background_");
                sbLIZ4.append(this.LJJJJZI.getValue());
                Integer num2 = (Integer) ((ConcurrentHashMap) map4).get(C2188811AlT.LIZIZ(sbLIZ4));
                if (num2 == null) {
                    Map<String, Integer> map5 = this.LJJIIZ;
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("background_");
                    sbLIZ5.append(this.LJJJJZI.getValue());
                    ((ConcurrentHashMap) map5).put(C2188811AlT.LIZIZ(sbLIZ5), 1);
                } else {
                    Map<String, Integer> map6 = this.LJJIIZ;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("background_");
                    sbLIZ6.append(this.LJJJJZI.getValue());
                    ((ConcurrentHashMap) map6).put(C2188811AlT.LIZIZ(sbLIZ6), Integer.valueOf(num2.intValue() + 1));
                }
            }
        }
    }

    public final void LJJIJIIJIL() {
        this.LJJIL = false;
        ((ConcurrentHashMap) this.LIZ).clear();
        ((ConcurrentHashMap) this.LJI).clear();
    }

    public final void LJJIJIL() {
        this.LJJJ = false;
        ((ConcurrentHashMap) this.LJIIJ).clear();
        if (this.LJJJI) {
            ((ConcurrentHashMap) this.LJIIJJI).clear();
            ((ConcurrentHashMap) this.LJIIL).clear();
            ((ConcurrentHashMap) this.LJIILIIL).clear();
            ((ConcurrentHashMap) this.LJIILJJIL).clear();
            ((ConcurrentHashMap) this.LJIILL).clear();
            ((ConcurrentHashMap) this.LJIILLIIL).clear();
            ((ConcurrentHashMap) this.LJIIZILJ).clear();
            ((ConcurrentHashMap) this.LJIJ).clear();
            ((ConcurrentHashMap) this.LJIJI).clear();
            ((ConcurrentHashMap) this.LJIJJ).clear();
        }
        if (this.LJJJIL) {
            ((ConcurrentHashMap) this.LJIJJLI).clear();
        }
    }

    public final void LJJIJLIJ() {
        this.LJJJJ = false;
        ((ConcurrentHashMap) this.LJIL).clear();
    }

    public final void LJJIL() {
        this.LJJJJI = false;
        ((ConcurrentHashMap) this.LJJII).clear();
    }

    public final void LJJIZ() {
        this.LJJIZ = false;
        ((ConcurrentHashMap) this.LIZIZ).clear();
        ((ConcurrentHashMap) this.LJII).clear();
    }

    public final boolean LJIILIIL() {
        return this.LJJIJIIJI || ((Boolean) this.LJJJJLL.getValue()).booleanValue();
    }

    public final boolean LJIILJJIL() {
        return this.LJJJJZI.ordinal() == EnumC1609850rzj.MAIN_FRAME.ordinal();
    }

    public final void LJJ() {
        if (this.LJJIL) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                ArrayList<C1909907dx> arrayList = new ArrayList<>();
                boolean z = this.LJJIJL && C202103146b.LIZ(0, "feed_total").LJ();
                List listLJLIL = C13LP.LJLIL(C1488250opb.LIZ, C1488250opb.LIZIZ);
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJI).entrySet()) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    if (this.LJJIJIL || this.LJJIJLIJ) {
                        jSONObject2.put(str, l);
                    }
                    if (z && l != null) {
                        l.longValue();
                        z = true;
                        arrayList.add(new C1909907dx(str, l.longValue()));
                    }
                    if (((ArrayList) listLJLIL).contains(str)) {
                        jSONObject4.put(str, l);
                    }
                }
                if (z) {
                    C202103146b.LIZ(0, "feed_total").LJFF("boot_event", arrayList);
                }
                jSONObject.put("metric", jSONObject2);
                jSONObject3.put("metric", jSONObject4);
                if (this.LJJIJIL || this.LJJIJLIJ) {
                    C793770VBv.LJFF("boot_core_event_v3", null, jSONObject);
                    C793770VBv.LJFF("boot_daily_check", null, jSONObject3);
                    C793770VBv.LJFF("cold_boot_libra_event_name", null, jSONObject);
                    LJIL();
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            LJJIJIIJIL();
        }
    }

    public final void LJJI() {
        if (this.LJJIJIIJIL) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                ArrayList<C1909907dx> arrayList = new ArrayList<>();
                boolean z = this.LJJIJL && C202103146b.LIZ(0, "feed_total").LJ();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIIZ).entrySet()) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    if (this.LJJIJIL) {
                        jSONObject2.put(str, l);
                    }
                    if (z && l != null) {
                        l.longValue();
                        arrayList.add(new C1909907dx(str, l.longValue()));
                    }
                }
                if (z) {
                    C202103146b.LIZ(0, "feed_total").LJFF("custom_event", arrayList);
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJJIJIL) {
                    C793770VBv.LJFF("custom_event_name_v3", null, jSONObject);
                    C793770VBv.LJFF("cold_boot_libra_event_name", null, jSONObject);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            LJJIJL();
        }
    }

    public final void LJJII() {
        if (this.LJJJJ) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIL).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                C793770VBv.LJFF("memory_info_event_name", null, jSONObject);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            LJJIJLIJ();
        }
    }

    public final void LJJIJ() {
        if (this.LJJIJIIJIL) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                ((ConcurrentHashMap) this.LJII).put("main_task_cpu_duration", new C202100145y(0L, this.LJJLI, "null"));
                ((ConcurrentHashMap) this.LJII).put("background_task_cpu_duration", new C202100145y(0L, this.LJJLIIIIJ, "null"));
                ((ConcurrentHashMap) this.LJII).put("main_task_duration", new C202100145y(0L, this.LJJJZ, "null"));
                ((ConcurrentHashMap) this.LJII).put("background_task_duration", new C202100145y(0L, this.LJJL, "null"));
                ArrayList<C1909907dx> arrayList = new ArrayList<>();
                ArrayList<C1909907dx> arrayList2 = new ArrayList<>();
                boolean z = this.LJJIJL && C202103146b.LIZ(0, "feed_total").LJ();
                ColdBootAppLogReportConfig coldBootAppLogReportConfig = (ColdBootAppLogReportConfig) AnonymousClass1463.LIZIZ.getValue();
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJII).entrySet()) {
                    String str = (String) entry.getKey();
                    C202100145y c202100145y = (C202100145y) entry.getValue();
                    if (this.LJJIJIL) {
                        jSONObject2.put(str, c202100145y.LIZIZ);
                    }
                    if (z) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('(');
                        sbLIZ.append(LJJJJJ(c202100145y.LIZJ));
                        sbLIZ.append(')');
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        arrayList.add(new C1909907dx(strLIZIZ, c202100145y.LIZIZ));
                        z = true;
                        arrayList2.add(new C1909907dx(strLIZIZ, c202100145y.LIZ));
                        if (coldBootAppLogReportConfig != null && coldBootAppLogReportConfig.enable) {
                            Iterator<String> it2 = coldBootAppLogReportConfig.bootTaskList.iterator();
                            while (it2.hasNext()) {
                                if (Intrinsics.LJFF(it2.next(), str)) {
                                    String strReplace = new Regex("[^a-zA-Z0-9_]").replace(str, "");
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(strReplace);
                                    sbLIZ2.append("_cost");
                                    jSONObject3.put(C2188811AlT.LIZIZ(sbLIZ2), c202100145y.LIZIZ);
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append(strReplace);
                                    sbLIZ3.append("_start_time");
                                    jSONObject3.put(C2188811AlT.LIZIZ(sbLIZ3), c202100145y.LIZ);
                                }
                            }
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C202103146b.LIZ(0, "feed_total").LJFF("boot_task_cost", arrayList);
                    C202103146b.LIZ(0, "feed_total").LJFF("boot_task_time", arrayList2);
                }
                if (this.LJJIJIL) {
                    LJJJJLI(this.LJIIIIZZ, jSONObject2);
                    jSONObject.put("metric", jSONObject2);
                    C793770VBv.LJFF("boot_task_event_v5", null, jSONObject);
                    C793770VBv.LJFF("boot_task_event_v5_temp", null, jSONObject);
                    C793770VBv.LJFF("cold_boot_libra_event_name", null, jSONObject);
                }
                if (jSONObject3.length() > 0) {
                    AppLogNewUtils.onEventV3("perf_cold_boot_task_info", jSONObject3);
                }
                LJJIIZI();
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            LJJIZ();
        }
    }

    public final void LJJIJIIJI() {
        if (this.LJJIJIIJIL) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                Map mapLIZ = C08M6.LIZ(3L);
                ArrayList<C1909907dx> arrayList = new ArrayList<>();
                boolean z = this.LJJIJL && C202103146b.LIZ(0, "feed_total").LJ();
                for (Map.Entry entry : ((HashMap) mapLIZ).entrySet()) {
                    String str = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    if (new Regex("(?i).*binder.*").matches(str)) {
                        LIZLLL(jLongValue, "binder");
                    } else if (u.LJJIIJZLJL(str, "tp-io", false)) {
                        LIZLLL(jLongValue, "tp-io");
                    } else if (u.LJJIIJZLJL(str, "tp-default", false)) {
                        LIZLLL(jLongValue, "tp-default");
                    } else if (u.LJJIIJZLJL(str, "tp-background", false)) {
                        LIZLLL(jLongValue, "tp-background");
                    } else if (u.LJJIIJZLJL(str, "tp-fixed", false)) {
                        LIZLLL(jLongValue, "tp-fixed");
                    } else if (u.LJJIIJZLJL(str, "tp-scheduled", false)) {
                        LIZLLL(jLongValue, "tp-scheduled");
                    } else {
                        if (this.LJJIJIL) {
                            jSONObject2.put(str, jLongValue);
                        }
                        if (z) {
                            arrayList.add(new C1909907dx(str, jLongValue));
                        }
                    }
                }
                LJIJ("feed_total_thread_count");
                LJIJI("feed_total_");
                for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJJ).entrySet()) {
                    String str2 = (String) entry2.getKey();
                    Long l = (Long) entry2.getValue();
                    if (this.LJJIJIL) {
                        jSONObject2.put(str2, l);
                    }
                    if (z && l != null) {
                        l.longValue();
                        arrayList.add(new C1909907dx(str2, l.longValue()));
                    }
                }
                if (this.LJJIJIL) {
                    jSONObject.put("metric", jSONObject2);
                    C793770VBv.LJFF("thread_info_event_name_v3", null, jSONObject);
                }
                if (z) {
                    C202103146b.LIZ(0, "feed_total").LJFF("thread_info", arrayList);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJJIJL() {
        ((ConcurrentHashMap) this.LIZJ).clear();
        ((ConcurrentHashMap) this.LJIIIZ).clear();
    }

    public final void LJJJ() {
        ((ConcurrentHashMap) this.LJJIFFI).clear();
    }

    public C202098145w() {
        C1697810uHb.LJ(C0CAJ.FEED_UI_TO_VIDEO.getValue());
    }

    public final void LJIJJ() {
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIJJI).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                C793770VBv.LJFF("assem_dsl_event_name", null, jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject3 = new JSONObject();
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJIIL).entrySet()) {
                    jSONObject4.put((String) entry2.getKey(), (Long) entry2.getValue());
                }
                jSONObject3.put("metric", jSONObject4);
                C793770VBv.LJFF("assem_on_parent_set_event_name", null, jSONObject3);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject5 = new JSONObject();
                JSONObject jSONObject6 = new JSONObject();
                for (Map.Entry entry3 : ((ConcurrentHashMap) this.LJIILIIL).entrySet()) {
                    jSONObject6.put((String) entry3.getKey(), (Long) entry3.getValue());
                }
                jSONObject5.put("metric", jSONObject6);
                C793770VBv.LJFF("assem_on_create_event_name", null, jSONObject5);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject7 = new JSONObject();
                JSONObject jSONObject8 = new JSONObject();
                for (Map.Entry entry4 : ((ConcurrentHashMap) this.LJIILJJIL).entrySet()) {
                    jSONObject8.put((String) entry4.getKey(), (Long) entry4.getValue());
                }
                jSONObject7.put("metric", jSONObject8);
                C793770VBv.LJFF("assem_on_create_view_event_name", null, jSONObject7);
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject9 = new JSONObject();
                JSONObject jSONObject10 = new JSONObject();
                for (Map.Entry entry5 : ((ConcurrentHashMap) this.LJIILL).entrySet()) {
                    jSONObject10.put((String) entry5.getKey(), (Long) entry5.getValue());
                }
                jSONObject9.put("metric", jSONObject10);
                C793770VBv.LJFF("assem_on_view_created_event_name", null, jSONObject9);
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject11 = new JSONObject();
                JSONObject jSONObject12 = new JSONObject();
                for (Map.Entry entry6 : ((ConcurrentHashMap) this.LJIIZILJ).entrySet()) {
                    jSONObject12.put((String) entry6.getKey(), (Long) entry6.getValue());
                }
                jSONObject11.put("metric", jSONObject12);
                C793770VBv.LJFF("assem_on_start_event_name", null, jSONObject11);
            } catch (Throwable th6) {
                TryCatchGuardChecker.doCheck(th6);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject13 = new JSONObject();
                JSONObject jSONObject14 = new JSONObject();
                for (Map.Entry entry7 : ((ConcurrentHashMap) this.LJIILLIIL).entrySet()) {
                    jSONObject14.put((String) entry7.getKey(), (Long) entry7.getValue());
                }
                jSONObject13.put("metric", jSONObject14);
                C793770VBv.LJFF("assem_on_resume_event_name", null, jSONObject13);
            } catch (Throwable th7) {
                TryCatchGuardChecker.doCheck(th7);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject15 = new JSONObject();
                JSONObject jSONObject16 = new JSONObject();
                for (Map.Entry entry8 : ((ConcurrentHashMap) this.LJIJ).entrySet()) {
                    jSONObject16.put((String) entry8.getKey(), (Long) entry8.getValue());
                }
                jSONObject15.put("metric", jSONObject16);
                C793770VBv.LJFF("assem_on_pause_event_name", null, jSONObject15);
            } catch (Throwable th8) {
                TryCatchGuardChecker.doCheck(th8);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject17 = new JSONObject();
                JSONObject jSONObject18 = new JSONObject();
                for (Map.Entry entry9 : ((ConcurrentHashMap) this.LJIJI).entrySet()) {
                    jSONObject18.put((String) entry9.getKey(), (Long) entry9.getValue());
                }
                jSONObject17.put("metric", jSONObject18);
                C793770VBv.LJFF("assem_on_stop_event_name", null, jSONObject17);
            } catch (Throwable th9) {
                TryCatchGuardChecker.doCheck(th9);
            }
        }
        if (LJIILIIL() && this.LJJJI) {
            try {
                JSONObject jSONObject19 = new JSONObject();
                JSONObject jSONObject20 = new JSONObject();
                for (Map.Entry entry10 : ((ConcurrentHashMap) this.LJIJJ).entrySet()) {
                    jSONObject20.put((String) entry10.getKey(), (Long) entry10.getValue());
                }
                jSONObject19.put("metric", jSONObject20);
                C793770VBv.LJFF("assem_on_destroy_event_name", null, jSONObject19);
            } catch (Throwable th10) {
                TryCatchGuardChecker.doCheck(th10);
            }
        }
        if (LJIILIIL() && this.LJJJIL) {
            try {
                JSONObject jSONObject21 = new JSONObject();
                JSONObject jSONObject22 = new JSONObject();
                for (Map.Entry entry11 : ((ConcurrentHashMap) this.LJIJJLI).entrySet()) {
                    jSONObject22.put((String) entry11.getKey(), (Long) entry11.getValue());
                }
                jSONObject21.put("metric", jSONObject22);
                C793770VBv.LJFF("assem_total_cost_event_name", null, jSONObject21);
            } catch (Throwable th11) {
                TryCatchGuardChecker.doCheck(th11);
            }
        }
    }

    public final void LJIJJLI() {
        if (LJIILIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJIIJ).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJJJ) {
                    C793770VBv.LJFF("assem_event_name", null, jSONObject);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJIL() {
        if (LJIILIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, ?> entry : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getAll().entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof Boolean) {
                        jSONObject2.put(key, ((Boolean) value).booleanValue() ? 1 : 0);
                    }
                }
                for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJJIJ).entrySet()) {
                    jSONObject2.put((String) entry2.getKey(), (Integer) entry2.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                C793770VBv.LJFF("cold_boot_libra_event_name", null, jSONObject);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final void LJJIFFI() {
        if (LJIILIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJJIII).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJJJJIZL) {
                    C793770VBv.LJFF("load_so_event_name", null, jSONObject);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.LJJJJIZL = false;
        }
    }

    public final void LJJIII() {
        if (LJIILIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJJIIJ).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (Long) entry.getValue());
                }
                jSONObject2.put("from_icon", this.LJJJJLI ? 1 : 0);
                jSONObject.put("metric", jSONObject2);
                if (this.LJJJJJ) {
                    C793770VBv.LJFF("network_request_event_name", null, jSONObject);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.LJJJJJ = false;
        }
    }

    public final void LJJIIJ() {
        if (LJIILIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJJII).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJJJJI) {
                    C793770VBv.LJFF("repo_loaded_event_name", null, jSONObject);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            LJJIL();
        }
    }

    public final void LJJIIZI() {
        List listLL;
        if (LJIILIIL()) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                for (String str : this.LJJI) {
                    List<String> listSplit = new Regex(":").split(str, 0);
                    if (listSplit.isEmpty()) {
                        listLL = C13BV.INSTANCE;
                    } else {
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        listLL = C13BV.INSTANCE;
                    }
                    String[] strArr = (String[]) listLL.toArray(new String[0]);
                    if (strArr.length == 2) {
                        C202100145y c202100145y = (C202100145y) ((ConcurrentHashMap) this.LJII).remove(strArr[1]);
                        if (c202100145y != null) {
                            jSONObject2.put(str, c202100145y);
                        }
                    }
                }
                for (Map.Entry entry : ((ConcurrentHashMap) this.LJJIFFI).entrySet()) {
                    jSONObject2.put((String) entry.getKey(), ((Number) entry.getValue()).longValue());
                }
                jSONObject.put("metric", jSONObject2);
                if (this.LJJIZ) {
                    C793770VBv.LJFF("boot_task_coordinate_event_v4", null, jSONObject);
                }
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            LJJJ();
        }
    }

    public static String LJJJJJ(String str) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            str.charAt(i);
            char cCharAt = str.charAt(i);
            if (!Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public final void LIZJ(String str) {
        if (!this.LJJJJZ && !((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            if (C1488250opb.LIZ.contains(str) || C1488250opb.LIZIZ.contains(str)) {
                ((ConcurrentHashMap) this.LIZ).put("(cpu)".concat(str), Long.valueOf(SystemClock.currentThreadTimeMillis()));
            }
            C1488250opb.LIZJ.contains(str);
            ((ConcurrentHashMap) this.LIZ).put(str, Long.valueOf(SystemClock.uptimeMillis()));
        }
    }

    public final void LJI(String str) {
        if (!((ConcurrentHashMap) this.LIZJ).containsKey(str)) {
            return;
        }
        Map<String, Long> map = this.LIZJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(cpu)");
        sbLIZ.append(str);
        Long l = (Long) ((ConcurrentHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
        if (l != null) {
            Map<String, Long> map2 = this.LJIIIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("(cpu)");
            sbLIZ2.append(str);
            if (((ConcurrentHashMap) map2).get(C2188811AlT.LIZIZ(sbLIZ2)) == null) {
                Map<String, Long> map3 = this.LJIIIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("(cpu)");
                sbLIZ3.append(str);
                ((ConcurrentHashMap) map3).put(C2188811AlT.LIZIZ(sbLIZ3), Long.valueOf(SystemClock.currentThreadTimeMillis() - l.longValue()));
            }
        }
        Long l2 = (Long) ((ConcurrentHashMap) this.LIZJ).get(str);
        if (l2 != null && ((ConcurrentHashMap) this.LJIIIZ).get(str) == null) {
            ((ConcurrentHashMap) this.LJIIIZ).put(str, Long.valueOf(SystemClock.uptimeMillis() - l2.longValue()));
        }
    }

    public final void LJIIIZ(String str) {
        if (!this.LJJJJZ && ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            C1488250opb.LIZJ.contains(str);
            LJIIIIZZ(SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis(), str);
        }
    }

    public final void LJIILL(String str) {
        if (!Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("coordinate:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!this.LJJJJZ && !((ConcurrentHashMap) this.LJJIFFI).containsKey(strLIZIZ)) {
                ((ConcurrentHashMap) this.LJJIFFI).put(strLIZIZ, Long.valueOf(SystemClock.uptimeMillis() - C202094145s.LJII));
            }
        }
    }

    public final void LJIIZILJ(String str) {
        if (!this.LJJJJZ && ((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            List<String> list = this.LJJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LJJJJZI.getValue());
            sbLIZ.append(':');
            sbLIZ.append(str);
            list.add(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIJ(String str) {
        if (this.LJJIJIIJIL && !this.LJJJJZ && !((ConcurrentHashMap) this.LJJ).containsKey(str)) {
            Map mapLIZ = C08M6.LIZ(3L);
            ((ConcurrentHashMap) this.LJJ).put(str, Long.valueOf(((HashMap) mapLIZ).size()));
        }
    }

    public final void LJIJI(String str) {
        C798350VTl c798350VTl;
        C798360VTm c798360VTm = this.LJJLIIIJJIZ;
        if (c798360VTm != null) {
            c798360VTm.LIZ();
            C798360VTm c798360VTm2 = this.LJJLIIIJJIZ;
            Long l = null;
            if (c798360VTm2 != null && (c798350VTl = c798360VTm2.LJI) != null) {
                long j = c798350VTl.LJI;
                Map<Integer, Long> map = c798350VTl.LJIIIIZZ;
                if (map != null) {
                    l = map.get(Integer.valueOf(this.LJJLIIIJJI));
                }
                Long lValueOf = Long.valueOf(j);
                Map<String, Long> map2 = this.LJJ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("main_process_cup_duration");
                ((ConcurrentHashMap) map2).put(C2188811AlT.LIZIZ(sbLIZ), lValueOf);
                if (l != null) {
                    Map<String, Long> map3 = this.LJJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("main_thread_cup_duration");
                    ((ConcurrentHashMap) map3).put(C2188811AlT.LIZIZ(sbLIZ2), l);
                    Map<String, Long> map4 = this.LJJ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append("other_thread_cup_duration");
                    ((ConcurrentHashMap) map4).put(C2188811AlT.LIZIZ(sbLIZ3), Long.valueOf(j - l.longValue()));
                }
            }
        }
    }

    public final void LJJIIJZLJL(final String str) {
        if (this.LJJJJJL && !this.LJJJJZ) {
            C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0Myg
                public final void LIZ() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(str, 1);
                        jSONObject.put("metric", jSONObject2);
                        C793770VBv.LJFF("cold_boot_reset_core_reason_name", null, jSONObject);
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    this.LJJJJJL = false;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ColdBootTaskLogger@5929.reportResetCoreReason$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportResetCoreReason$1");
                }
            });
        }
    }

    public final void LJJIIZ(String str) {
        if (!this.LJJJJZ) {
            C823050WQl.LIZLLL().execute(new ARunnableS0S1000000_2(str, 0));
        }
    }

    public final void LJJJI(int i) {
        try {
            if (((HashMap) this.LJJIIZI).isEmpty()) {
                return;
            }
            String str = (String) ((HashMap) this.LJJIIZI).get(Integer.valueOf(i));
            if (str == null || ((ConcurrentHashMap) this.LIZLLL).containsKey(str)) {
                return;
            }
            ((ConcurrentHashMap) this.LIZLLL).put(str, Long.valueOf(SystemClock.uptimeMillis()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJJJIL(int i) {
        Long l;
        try {
            if (((HashMap) this.LJJIIZI).isEmpty()) {
                return;
            }
            final String str = (String) ((HashMap) this.LJJIIZI).get(Integer.valueOf(i));
            if (str != null && ((ConcurrentHashMap) this.LIZLLL).containsKey(str) && (l = (Long) ((ConcurrentHashMap) this.LIZLLL).get(str)) != null) {
                final long jUptimeMillis = SystemClock.uptimeMillis() - l.longValue();
                C823050WQl.LJFF().execute(new Runnable() { // from class: X.05wS
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ColdBootTaskLogger@5929.reportSatellite$1");
                        try {
                            C202098145w c202098145w = this.LL;
                            String str2 = str;
                            long j = jUptimeMillis;
                            if (c202098145w.LJIILIIL()) {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(str2, j);
                                    jSONObject.put("metric", jSONObject2);
                                    C793770VBv.LJFF("satellite_event_name_v3", null, jSONObject);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ColdBootTaskLogger@5929.reportSatellite$1");
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void LJJJJ(boolean z) {
        INewUserApi iNewUserApi = (INewUserApi) PluggableExtentionKt.pluggableSpi$default(INewUserApi.class, false, false, false, 14, null);
        if (iNewUserApi != null && iNewUserApi.isNewUser()) {
            this.LJJIJLIJ = z;
        }
    }

    public final void LJJJJI(String str) {
        if (this.LJJIJIIJIL && !this.LJJJJZ && !((ConcurrentHashMap) this.LIZIZ).containsKey(str)) {
            ((ConcurrentHashMap) this.LIZIZ).put(str, Long.valueOf(SystemClock.uptimeMillis()));
            Map<String, Long> map = this.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(cpu)");
            sbLIZ.append(str);
            ((ConcurrentHashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(SystemClock.currentThreadTimeMillis()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[PHI: r7
      0x0044: PHI (r7v3 long) = (r7v1 long), (r7v5 long) binds: [B:14:0x0042, B:12:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJIZL(java.lang.String r19) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202098145w.LJJJJIZL(java.lang.String):void");
    }

    public final void LJJJJL(EnumC1609850rzj enumC1609850rzj) {
        if (enumC1609850rzj != null && enumC1609850rzj.ordinal() > this.LJJJJZI.ordinal()) {
            this.LJJJJZI = enumC1609850rzj;
            try {
                Map<String, Long> map = this.LJI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LJJJJZI.name());
                sbLIZ.append(":priority");
                ((ConcurrentHashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(Process.getThreadPriority(Process.myTid())));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public static String LJIIJ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(long j, String str) {
        ((ConcurrentHashMap) this.LJJIIJZLJL).put(str, Long.valueOf(j));
    }

    public final void LIZIZ(long j, String str) {
        if (!this.LJJJIL) {
            return;
        }
        if (((ConcurrentHashMap) this.LJIJJLI).containsKey(str)) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.LJIJJLI;
            Long l = (Long) concurrentHashMap.get(str);
            if (l != null) {
                j += l.longValue();
            }
            concurrentHashMap.put(str, Long.valueOf(j));
            return;
        }
        ((ConcurrentHashMap) this.LJIJJLI).put(str, Long.valueOf(j));
    }

    public final void LIZLLL(long j, String str) {
        if (((ConcurrentHashMap) this.LJJ).containsKey(str)) {
            Long l = (Long) ((ConcurrentHashMap) this.LJJ).get(str);
            if (l != null) {
                ((ConcurrentHashMap) this.LJJ).put(str, Long.valueOf(l.longValue() + j));
                return;
            }
            return;
        }
        ((ConcurrentHashMap) this.LJJ).put(str, Long.valueOf(j));
    }

    public final void LJ(String str, boolean z) {
        if (((ConcurrentHashMap) this.LIZJ).containsKey(str)) {
            return;
        }
        ((ConcurrentHashMap) this.LIZJ).put(str, Long.valueOf(SystemClock.uptimeMillis()));
        if (z) {
            Map<String, Long> map = this.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(cpu)");
            sbLIZ.append(str);
            ((ConcurrentHashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(SystemClock.currentThreadTimeMillis()));
        }
    }

    public final void LJFF(long j, String str) {
        if (((ConcurrentHashMap) this.LJIIIZ).containsKey(str)) {
            return;
        }
        ((ConcurrentHashMap) this.LJIIIZ).put(str, Long.valueOf(j));
    }

    public final void LJII(long j, String str) {
        if (!this.LJJJJZ && !((ConcurrentHashMap) this.LJI).containsKey(str)) {
            ((ConcurrentHashMap) this.LJI).put(str, Long.valueOf(j));
        }
    }

    public final void LJJJJJL(long j, String str) {
        if (!this.LJJJJ || ((ConcurrentHashMap) this.LJIL).containsKey(str)) {
            return;
        }
        ((ConcurrentHashMap) this.LJIL).put(str, Long.valueOf(j));
    }

    public final void LJJJJLI(ConcurrentLinkedQueue<C1869680yko> concurrentLinkedQueue, JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        for (C1869680yko c1869680yko : concurrentLinkedQueue) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('(');
            sbLIZ.append(LJJJJJ(c1869680yko.LIZIZ));
            sbLIZ.append(')');
            sbLIZ.append(c1869680yko.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Integer num = (Integer) map.get(strLIZIZ);
            if (num == null) {
                map.put(strLIZIZ, Integer.valueOf(c1869680yko.LJ));
            } else {
                map.put(strLIZIZ, Integer.valueOf(c1869680yko.LJ + num.intValue()));
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Number) entry.getValue()).intValue());
        }
        this.LJIIIIZZ.clear();
    }

    public final void LJIIIIZZ(long j, long j2, String str) {
        if (!this.LJJJJZ && ((ConcurrentHashMap) this.LIZ).containsKey(str)) {
            Map<String, Long> map = this.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(cpu)");
            sbLIZ.append(str);
            Long l = (Long) ((ConcurrentHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
            if (l != null && (C1488250opb.LIZ.contains(str) || C1488250opb.LIZIZ.contains(str))) {
                Map<String, Long> map2 = this.LJI;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("(cpu)");
                sbLIZ2.append(str);
                ((ConcurrentHashMap) map2).put(C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(j2 - l.longValue()));
            }
            Long l2 = (Long) ((ConcurrentHashMap) this.LIZ).get(str);
            if (l2 != null && ((ConcurrentHashMap) this.LJI).get(str) == null) {
                ((ConcurrentHashMap) this.LJI).put(str, Long.valueOf(j - l2.longValue()));
            }
        }
    }

    public final void LJIILLIIL(String str, C1494570ozn c1494570ozn, long j, long j2, long j3) {
        if (!this.LJJJJZ && !((ConcurrentHashMap) this.LJJIIJ).containsKey(str)) {
            ((ConcurrentHashMap) this.LJJIIJ).put(str, Long.valueOf(j));
            Long lValueOf = Long.valueOf(j2);
            Map<String, Long> map = this.LJJIIJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("(cpu)");
            sbLIZ.append(str);
            ((ConcurrentHashMap) map).put(C2188811AlT.LIZIZ(sbLIZ), lValueOf);
            if (c1494570ozn != null) {
                Map<String, Long> map2 = this.LJJIIJ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("request:");
                sbLIZ2.append(str);
                ((ConcurrentHashMap) map2).put(C2188811AlT.LIZIZ(sbLIZ2), Long.valueOf(c1494570ozn.LJJIJIIJI - c1494570ozn.LJJIJ));
                Map<String, Long> map3 = this.LJJIIJ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("response:");
                sbLIZ3.append(str);
                ((ConcurrentHashMap) map3).put(C2188811AlT.LIZIZ(sbLIZ3), Long.valueOf(c1494570ozn.LJJIJLIJ - c1494570ozn.LJJIJL));
            }
            Long lValueOf2 = Long.valueOf(j3);
            Map<String, Long> map4 = this.LJJIIJ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("coordinate:");
            sbLIZ4.append(str);
            ((ConcurrentHashMap) map4).put(C2188811AlT.LIZIZ(sbLIZ4), lValueOf2);
        }
    }
}
