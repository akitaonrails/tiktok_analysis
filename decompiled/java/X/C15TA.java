package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS1S4100000_11;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.explore.monitor.ff.Explore0VVTrackerMonitor;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootManager;
import com.ss.android.ugc.aweme.explore.monitor.ff.ExploreCustomFeedColdBootMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15TA, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TA {
    public static int LIZLLL;
    public static boolean LJII;
    public static String LJIILLIIL;
    public static Long LJIIZILJ;
    public static String LJIJ;
    public static int LJIJI;
    public static String LJIJJLI;
    public static String LJIL;
    public static String LJJ;
    public static String LJJI;
    public static String LJJIFFI;
    public static String LJJII;
    public static String LJJIII;
    public static String LJJIIJ;
    public static String LJJIIJZLJL;
    public static String LJJIIZ;
    public static String LJJIIZI;
    public static Long LJJIJ;
    public static String LJJIJIIJI;
    public static String LJJIJIIJIL;
    public static String LJJIJIL;
    public static boolean LJJIJL;
    public static String LJJIJLIJ;
    public static boolean LJJIL;
    public static long LJJIZ;
    public static long LJJJ;
    public static final C15TA LIZ = new C15TA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20522615Se());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C15TO());
    public static long LJ = SystemClock.elapsedRealtime();
    public static final Map<String, Set<String>> LJFF = new LinkedHashMap();
    public static final Set<String> LJI = new LinkedHashSet();
    public static final List<Long> LJIIIIZZ = new ArrayList();
    public static final List<Long> LJIIIZ = new ArrayList();
    public static final Map<Long, C09AE> LJIIJ = new LinkedHashMap();
    public static boolean LJIIJJI = true;
    public static volatile boolean LJIIL = true;
    public static final AtomicBoolean LJIILIIL = new AtomicBoolean(false);
    public static String LJIILJJIL = "";
    public static String LJIILL = "";
    public static String LJIJJ = EnumC1845820y8K.OTHER.getValue();
    public static boolean LJJJI = true;

    public static String LIZ() {
        String strLJJLIIIJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : ((LinkedHashMap) LJFF).keySet()) {
            Set set = (Set) ((LinkedHashMap) LJFF).get(obj);
            if (set == null || (strLJJLIIIJ = C13LP.LJJLIIIJ(set, null, null, null, 0, null, null, 63)) == null) {
                strLJJLIIIJ = "";
            }
            linkedHashMap.put(obj, strLJJLIIIJ);
        }
        return GsonProtectorUtils.toJson(C08JS.LIZIZ(), linkedHashMap);
    }

    public static void LJIIIZ() {
        C20523715Sp.LIZ.getClass();
        C20523715Sp.LIZIZ = SystemClock.elapsedRealtime();
    }

    public static void LJIIIIZZ(final boolean z) {
        C15TP c15tp = (C15TP) LIZJ.getValue();
        final long j = 0;
        if (c15tp.LIZ != 0) {
            final String str = c15tp.LIZIZ;
            final long jElapsedRealtime = SystemClock.elapsedRealtime() - c15tp.LIZ;
            final int i = 0;
            C20532515Vz.LIZ(new C15W0(i, i, jElapsedRealtime, j, str, z) { // from class: X.0C9p
                public final String LIZ;
                public final boolean LIZIZ;
                public final long LIZJ;
                public final long LIZLLL;
                public final int LJ;
                public final int LJFF;

                @Override // X.C15W0
                public final Map<String, String> LIZ() {
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = new Pair("enter_method", this.LIZ);
                    pairArr[1] = new Pair("is_success", this.LIZIZ ? "1" : CardStruct.IStatusCode.DEFAULT);
                    pairArr[2] = new Pair("api_duration", String.valueOf(this.LIZJ));
                    pairArr[3] = new Pair("insert_duration", String.valueOf(this.LIZLLL));
                    pairArr[4] = new Pair("insert_size", String.valueOf(this.LJ));
                    pairArr[5] = new Pair("total_size", String.valueOf(this.LJFF));
                    pairArr[6] = new Pair("refresh_count", String.valueOf(((Number) C276660Asq.LIZ.getValue()).intValue()));
                    return C2097608Jq.LJIIIIZZ(pairArr);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C309070C9p)) {
                        return false;
                    }
                    C309070C9p c309070C9p = (C309070C9p) obj;
                    return Intrinsics.LJFF(this.LIZ, c309070C9p.LIZ) && this.LIZIZ == c309070C9p.LIZIZ && this.LIZJ == c309070C9p.LIZJ && this.LIZLLL == c309070C9p.LIZLLL && this.LJ == c309070C9p.LJ && this.LJFF == c309070C9p.LJFF;
                }

                @Override // X.C15W0
                public final String getEventName() {
                    return "explore_optimize_feed";
                }

                public final int hashCode() {
                    return (((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF;
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ExploreOptimizeFeedET(enterMethod=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", isSuccess=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", duration=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(", insertDuration=");
                    sbLIZ.append(this.LIZLLL);
                    sbLIZ.append(", insertSize=");
                    sbLIZ.append(this.LJ);
                    sbLIZ.append(", totalSize=");
                    sbLIZ.append(this.LJFF);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = z;
                    this.LIZJ = jElapsedRealtime;
                    this.LIZLLL = j;
                    this.LJ = i;
                    this.LJFF = i;
                }
            });
            c15tp.LIZ = 0L;
        }
    }

    public static void LJIIL(Integer num) {
        final int value;
        if (LJII) {
            return;
        }
        if (num != null) {
            value = num.intValue();
        } else {
            value = C15TI.UNKNOWN.getValue();
        }
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - LJJIZ;
        final String str = LJIILJJIL;
        C20532515Vz.LIZ(new C15W0(value, str, jElapsedRealtime) { // from class: X.0qne
            public final int LIZ;
            public final String LIZIZ;
            public final long LIZJ;

            @Override // X.C15W0
            public final Map<String, String> LIZ() {
                return C2097608Jq.LJIIIIZZ(new Pair("model_source", String.valueOf(this.LIZ)), new Pair("enterFrom", this.LIZIZ), new Pair("duration", String.valueOf(this.LIZJ)), new Pair("is_top_tab", String.valueOf(C1583440rJ8.LIZIZ())));
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1563920qne)) {
                    return false;
                }
                C1563920qne c1563920qne = (C1563920qne) obj;
                return this.LIZ == c1563920qne.LIZ && Intrinsics.LJFF(this.LIZIZ, c1563920qne.LIZIZ) && this.LIZJ == c1563920qne.LIZJ;
            }

            @Override // X.C15W0
            public final String getEventName() {
                return "explore_page_time_to_latest_content";
            }

            public final int hashCode() {
                return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ExplorePageTime2LatestContentET(modelSource=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", enterFrom=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", duration=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = value;
                this.LIZIZ = str;
                this.LIZJ = jElapsedRealtime;
            }
        });
        LJII = true;
    }

    public static void LJIILL(final Runnable runnable) {
        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.0T3c
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                C20684815ws.LJFF().execute(new ARunnableS112S0100000_12(runnable, 504));
                return false;
            }
        }, Looper.getMainLooper().getQueue());
    }

    public static String LIZIZ(String str, String str2) {
        if (Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT)) {
            return "all";
        }
        return str2;
    }

    public static void LJIILJJIL(int i, List list) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        c2344009Gk.LIZJ(i, "video_num");
        c2344009Gk.LIZJ(4 - i, "empty_num");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        sbLIZ.append('}');
        c2344009Gk.LJIIIIZZ("aweme_type", C2188811AlT.LIZIZ(sbLIZ));
        C20684815ws.LJIILLIIL("video_show_cnt", c2344009Gk.LIZ);
    }

    public static void LJIILLIIL(String str, String str2) {
        Map<String, Set<String>> map = LJFF;
        if (!map.containsKey(str)) {
            map.put(str, new LinkedHashSet());
        }
        Set set = (Set) ((LinkedHashMap) map).get(str);
        if (set != null) {
            set.add(str2);
        }
    }

    public static void LJIIJ(String str, boolean z, boolean z2) {
        C20523715Sp.LIZ.getClass();
        if (C20523715Sp.LIZJ != 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - C20523715Sp.LIZJ;
            Map<String, String> map = C20523715Sp.LIZLLL;
            C20532515Vz.LIZ(new C20532415Vy("refresh", false, jElapsedRealtime, z, new LinkedHashMap(map), str, z2));
            C20523715Sp.LIZJ = 0L;
            ((LinkedHashMap) map).clear();
        }
        TabSwitchMetricService.LIZ.getClass();
        TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
        if (tabSwitchMetricServiceLIZ != null) {
            tabSwitchMetricServiceLIZ.LJIIJ("homepage_explore", EnumC1593290rZ1.VIEW);
        }
    }

    public static void LJ(final int i, final Long l, final String str, final String str2) {
        List<Long> list = LJIIIIZZ;
        if (!C13LP.LJJJJ(l, list)) {
            if (Intrinsics.LJFF(str, EnumC696460RTo.TAB_BUTTON.getType()) && l == null) {
                return;
            }
            LJIILL(new Runnable() { // from class: X.0RTj
                public final void LIZ() {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                    c2344009Gk.LJIIIIZZ("element_type", str);
                    Long l2 = l;
                    String str3 = str2;
                    int i2 = i;
                    if (l2 != null) {
                        c2344009Gk.LIZLLL(l2.longValue(), "explore_topic_id");
                        C15TA c15ta = C15TA.LIZ;
                        String string = l2.toString();
                        c15ta.getClass();
                        c2344009Gk.LJFF("explore_topic", C15TA.LIZIZ(string, str3));
                        c2344009Gk.LIZJ(i2, "subtab_position");
                    }
                    C20684815ws.LJIILLIIL("ttexp_subtab_bar_element_show", c2344009Gk.LIZ);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ExploreMobUtils@18af.logSubtabElementShow$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ExploreMobUtils@18af.logSubtabElementShow$1");
                }
            });
            if (l == null) {
                return;
            }
            ((ArrayList) list).add(Long.valueOf(l.longValue()));
        }
    }

    public static void LJFF(Long l, String str, String str2, String str3) {
        LJIILL(new ARunnableS1S4100000_11(l, str, str3, str2, 1));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJIILIIL(Long l, String str, String str2, String str3) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append('-');
        sbLIZ.append(l);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set<String> set = LJI;
        if (!set.contains(strLIZIZ)) {
            if (str.length() == 0) {
                str = LJIILJJIL;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
            c2344009Gk.LJIIIIZZ("pre_enter_from", str);
            c2344009Gk.LJIIIIZZ("pre_enter_method", LJIILL);
            c2344009Gk.LIZJ(C1583440rJ8.LIZIZ() ? 1 : 0, "is_top_tab");
            c2344009Gk.LJIIIIZZ("explore_session_id", C15UA.LIZJ());
            C15WT.LIZIZ.LJIILIIL(c2344009Gk, "homepage_explore", l, str3, str2);
            C20684815ws.LJIILLIIL("explore_tab_slide", c2344009Gk.LIZ);
            set.add(strLIZIZ);
        }
    }

    public static void LIZJ(final Long l, final String str, String str2, String str3, String str4) {
        String string;
        final String str5 = str4;
        final String str6 = str3;
        if (str6 == null) {
            str6 = LJIL;
        }
        if (str5 == null) {
            str5 = LJJ;
        }
        if (l != null) {
            string = l.toString();
        } else {
            string = null;
        }
        final String strLIZIZ = LIZIZ(string, str2);
        final String str7 = LJIILL;
        final String str8 = LJIJJ;
        LJIILL(new Runnable() { // from class: X.0SCW
            public final void LIZ() {
                String str9 = str;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                c2344009Gk.LJIIIIZZ("event_element", "explore_more_interests");
                C0SAI.LIZ(c2344009Gk, "group_id", str6);
                C0SAI.LIZ(c2344009Gk, "request_id", str5);
                Long l2 = l;
                C0SAI.LIZ(c2344009Gk, "interest_id", l2 != null ? l2.toString() : null);
                C0SAI.LIZ(c2344009Gk, "interest_name", strLIZIZ);
                c2344009Gk.LJIIIIZZ("curr_page_enter_method", str7);
                c2344009Gk.LJIIIIZZ("subtab_enter_method", str8);
                C20684815ws.LJIILLIIL(str9, c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExploreMobUtils@18af.logEndOfFeedButton$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExploreMobUtils@18af.logEndOfFeedButton$1");
            }
        });
    }

    public static void LJI(final int i, final Long l, final String str, final String str2, final boolean z) {
        boolean z2;
        final boolean z3;
        LJIIZILJ = l;
        LJIJ = str;
        LJIJI = i;
        LJIJJ = str2;
        ExploreCustomFeedColdBootManager.LIZ.getClass();
        if (l != null && l.longValue() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2 && l != null) {
            l.longValue();
            ExploreCustomFeedColdBootMonitor exploreCustomFeedColdBootMonitor = (ExploreCustomFeedColdBootMonitor) ((LinkedHashMap) ExploreCustomFeedColdBootManager.LIZIZ).get(l);
            if (exploreCustomFeedColdBootMonitor != null) {
                exploreCustomFeedColdBootMonitor.enterMethod(str2);
            }
        }
        final String str3 = LJJIIZ;
        LJJIIZ = null;
        final String str4 = LJJIIZI;
        LJJIIZI = null;
        LJIL = str3;
        LJJ = str4;
        final Long l2 = LJJIJ;
        LJJIJ = null;
        final String str5 = LJJIJIIJI;
        LJJIJIIJI = null;
        final String str6 = LJJIJIIJIL;
        LJJIJIIJIL = null;
        LJIJJLI = str6;
        final String str7 = LJJIJIL;
        LJJIJIL = null;
        final boolean z4 = LJJIJL;
        LJJIJL = false;
        if (l != null && l.longValue() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        LJIILL(new Runnable() { // from class: X.0SCV
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                boolean z5 = z3;
                Long l3 = l;
                String str8 = str;
                boolean z6 = z4;
                Long l4 = l2;
                String str9 = str5;
                if (!z5) {
                    c2344009Gk.LIZLLL(l3.longValue(), "explore_topic_id");
                    C15TA c15ta = C15TA.LIZ;
                    String string = l3.toString();
                    c15ta.getClass();
                    c2344009Gk.LJFF("explore_topic", C15TA.LIZIZ(string, str8));
                    c2344009Gk.LIZLLL(l3.longValue(), "interest_id");
                    c2344009Gk.LJFF("interest_name", C15TA.LIZIZ(l3.toString(), str8));
                } else if (z6) {
                    C0SAI.LIZ(c2344009Gk, "interest_id", l4 != null ? l4.toString() : null);
                    C0SAI.LIZ(c2344009Gk, "interest_name", str9);
                }
                c2344009Gk.LIZJ(i, "subtab_position");
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LIZJ(z ? 1 : 0, "has_red_dot");
                C0SAI.LIZ(c2344009Gk, "group_id", str3);
                c2344009Gk.LJIIIIZZ("request_id", str4);
                c2344009Gk.LJIIIIZZ("sub_enter_method", str6);
                C0SAI.LIZ(c2344009Gk, "special_shaped_card_trigger_type", str7);
                C20684815ws.LJIILLIIL("ttinter_topic_subtab_enter", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExploreMobUtils@18af.logTopicSubtabEnter$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicSubtabEnter$1");
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJJI(C15TA c15ta, String str, String str2, String str3, int i) {
        boolean zLIZIZ;
        String str4;
        String str5 = str3;
        if ((i & 4) != 0) {
            zLIZIZ = C1583440rJ8.LIZIZ();
        } else {
            zLIZIZ = false;
        }
        if ((i & 8) != 0) {
            str5 = null;
        }
        c15ta.getClass();
        LJIILJJIL = str2;
        LJIILL = str;
        LJJIIJZLJL = null;
        LJJII = null;
        LJJIII = null;
        LJJIIJ = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - LJ;
        C1EE2.LIZIZ.LJIILJJIL();
        boolean z = LJJJI;
        boolean zLIZ = C15TL.LIZ();
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        String str7 = "homepage_explore";
        if (LJJJI && (str4 = LJJIJLIJ) != null) {
            str6 = str4;
        }
        C20525415Tg c20525415Tg = new C20525415Tg(str, str2, z, zLIZ, jElapsedRealtime, zLIZIZ, str5, str7, str6, null, 0 == true ? 1 : 0, 32256);
        Explore0VVTrackerMonitor.INSTANCE.start(str);
        C20532515Vz.LIZ(c20525415Tg);
        LJJJI = false;
    }

    public static void LJII(final int i, final long j, final Long l, final String str, final String str2, final String str3) {
        LJIILL(new Runnable() { // from class: X.0RTi
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                c2344009Gk.LJ(l, "explore_topic_id");
                C15TA c15ta = C15TA.LIZ;
                String strValueOf = String.valueOf(l);
                String str4 = str;
                c15ta.getClass();
                c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(strValueOf, str4));
                c2344009Gk.LIZLLL(j, "duration");
                c2344009Gk.LIZJ(i, "subtab_position");
                c2344009Gk.LJIIIIZZ("enter_method", str2);
                c2344009Gk.LJIIIIZZ("exit_method", str3);
                C20684815ws.LJIILLIIL("ttexp_topic_subtab_exit", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExploreMobUtils@18af.logTopicSubtabExit$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicSubtabExit$1");
            }
        });
    }

    public static void LIZLLL(final Boolean bool, final Integer num, final Integer num2, final Integer num3, final Long l, final String str, final String str2, final String str3, final String str4, final String str5) {
        LJIILL(new Runnable() { // from class: X.0RTm
            public final void LIZ() {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
                c2344009Gk.LJ(l, "explore_topic_id");
                C15TA c15ta = C15TA.LIZ;
                String strValueOf = String.valueOf(l);
                String str6 = str;
                c15ta.getClass();
                c2344009Gk.LJIIIIZZ("explore_topic", C15TA.LIZIZ(strValueOf, str6));
                c2344009Gk.LJIIIIZZ("pin_from", str3);
                String str7 = str3;
                String str8 = str2;
                Integer num4 = num;
                Boolean bool2 = bool;
                String str9 = str4;
                if (!Intrinsics.LJFF(str7, EnumC696450RTn.MANAGE.getValue())) {
                    c2344009Gk.LJFF("post_num", str8);
                    c2344009Gk.LIZJ((num4 != null ? num4.intValue() : 0) + 1, "topic_position");
                    c2344009Gk.LIZJ(Intrinsics.LJFF(bool2, Boolean.TRUE) ? 1 : 0, "is_first_screen");
                    if (str9 == null) {
                        str9 = "";
                    }
                    c2344009Gk.LJFF("is_first_refresh", C15UA.LIZIZ(str9));
                }
                c2344009Gk.LJ(num3, "total_subtab_num");
                c2344009Gk.LJ(num2, "subtab_position");
                c2344009Gk.LJIIIIZZ("action_type", str5);
                C20684815ws.LJIILLIIL("ttexp_topic_pin_btn_click", c2344009Gk.LIZ);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ExploreMobUtils@18af.logPinClick$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ExploreMobUtils@18af.logPinClick$1");
            }
        });
        if (Intrinsics.LJFF(str5, EnumC1841610y1X.PIN.getValue())) {
            if (l != null) {
                l.longValue();
                Map<Long, C09AE> map = LJIIJ;
                C09AE c09ae = (C09AE) ((LinkedHashMap) map).get(l);
                if (c09ae != null) {
                    c09ae.LIZIZ(null);
                }
                map.put(l, C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C696430RTl(l, str, str2, str3, bool, str4, num, num3, num2, null), 3));
                return;
            }
            return;
        }
        Map<Long, C09AE> map2 = LJIIJ;
        C09AE c09ae2 = (C09AE) ((LinkedHashMap) map2).get(l);
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
        C19719512Dh.LIZJ(map2).remove(l);
    }
}
