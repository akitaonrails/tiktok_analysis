package X;

import Y.ARunnableS17S0201000_10;
import Y.ARunnableS78S0200000_9;
import android.content.Context;
import android.net.Uri;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.AwS659S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qC4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1540620qC4 {
    public static final C01GW<C1537720q7O> LJJJJIZL;
    public static final ExecutorService LJJJJJ;
    public final Context LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final ConcurrentHashMap<String, String> LJIILIIL;
    public C1161430gKT LJIILJJIL;
    public final String LJIILL;
    public final C0OV2 LJIILLIIL;
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<C1537720q7O>> LJIIZILJ;
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<C1537720q7O>> LJIJ;
    public final ConcurrentHashMap<String, C1168250gVT> LJIJI;
    public final C01GW LJIJJ;
    public final ConcurrentHashMap<String, Integer> LJIJJLI;
    public final ConcurrentHashMap<String, Integer> LJIL;
    public C678350QjB LJJ;
    public boolean LJJI;
    public final ConcurrentHashMap<String, String> LJJIFFI;
    public final ConcurrentHashMap<String, InterfaceC1141530foN> LJJII;
    public final ConcurrentLinkedQueue<Pair<String, InterfaceC1141530foN>> LJJIII;
    public final boolean LJJIIJ;
    public final Map<String, Integer> LJJIIJZLJL;
    public final C01GW LJJIIZ;
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<Integer>> LJJIIZI;
    public final C01GW LJJIJ;
    public C1537720q7O LJJIJIIJI;
    public final CopyOnWriteArraySet<C1537720q7O> LJJIJIIJIL;
    public final ConcurrentHashMap<String, CopyOnWriteArrayList<Pair<String, Object>>> LJJIJIL;
    public final CopyOnWriteArrayList<String> LJJIJL;
    public C1540540qBw LJJIJLIJ;
    public int LJJIL;
    public final CopyOnWriteArrayList<C1540660qC8> LJJIZ;
    public final ConcurrentHashMap<String, C1540670qC9> LJJJ;
    public final C620250OUl LJJJI;
    public final ConcurrentHashMap<String, Integer> LJJJIL;
    public final ConcurrentHashMap<String, Long> LJJJJ;
    public final ConcurrentHashMap<String, C1537720q7O> LJJJJI;

    public C1540620qC4() {
        throw null;
    }

    public final void LJII() {
        this.LJJI = true;
        C1520360pfO c1520360pfO = new C1520360pfO("spark_multi_views_perf");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("page_id", this.LJIILL);
        jSONObject.put("biz", this.LIZJ);
        jSONObject.put("first_render_count", this.LJJJI.LIZ);
        jSONObject.put("render_hit_count", this.LJJJI.LIZIZ);
        jSONObject.put("prerender_hit_count", this.LJJJI.LJI);
        jSONObject.put("prelayout_hit_count", this.LJJJI.LIZJ);
        jSONObject.put("precreate_hit_count", this.LJJJI.LJ);
        jSONObject.put("prelayout_trigger_count", this.LJJJI.LJFF);
        jSONObject.put("precreate_trigger_count", this.LJJJI.LJII);
        jSONObject.put("container_create_count", this.LJJJI.LIZLLL);
        jSONObject.put("total_render_count", this.LJJJJI.size());
        long j = this.LJJJI.LJIIIIZZ;
        if (j > 0) {
            jSONObject.put("first_screen_duration", j);
        }
        c1520360pfO.LIZLLL = jSONObject;
        c1520360pfO.LIZIZ(0);
        c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
        C1520080pew.LIZ("", c1520360pfO.LIZ());
        Iterator<Map.Entry<String, CopyOnWriteArrayList<C1537720q7O>>> it2 = this.LJIIZILJ.entrySet().iterator();
        while (it2.hasNext()) {
            for (C1537720q7O c1537720q7O : it2.next().getValue()) {
                if (C1535880q4Q.LIZ) {
                    LJJIFFI(c1537720q7O.getHybridContext().containerId);
                } else if (c1537720q7O != null) {
                }
                c1537720q7O.LLD(true);
            }
        }
        Iterator<Map.Entry<String, CopyOnWriteArrayList<C1537720q7O>>> it3 = this.LJIJ.entrySet().iterator();
        while (it3.hasNext()) {
            for (C1537720q7O c1537720q7O2 : it3.next().getValue()) {
                if (C1535880q4Q.LIZ) {
                    LJJIFFI(c1537720q7O2.getHybridContext().containerId);
                }
                c1537720q7O2.LLD(true);
            }
        }
        this.LJIIZILJ.clear();
        this.LJIJ.clear();
        this.LJIJI.clear();
        this.LJIJJLI.clear();
        this.LJIL.clear();
        this.LJJIIZI.clear();
        this.LJJ = null;
        ((C2250481D6o) this.LJIJJ.getValue()).LIZ();
        C1537720q7O c1537720q7O3 = this.LJJIJIIJI;
        if (c1537720q7O3 != null) {
            c1537720q7O3.LLD(true);
        }
        this.LJJIJIIJI = null;
        C1540540qBw c1540540qBw = this.LJJIJLIJ;
        if (c1540540qBw != null) {
            c1540540qBw.LIZIZ();
        }
        this.LJJIJLIJ = null;
        this.LJJIZ.clear();
        this.LJJIJIIJIL.clear();
        this.LJJIJIL.clear();
        this.LJJJJ.clear();
        this.LJJJJI.clear();
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIILL(this.LIZLLL);
        if (C1535880q4Q.LIZ) {
            LJIIIIZZ();
        } else {
            this.LJJII.clear();
        }
    }

    static {
        new C679810QlX();
        LJJJJIZL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(242));
        LJJJJJ = C786410Ut5.d4(Runtime.getRuntime().availableProcessors());
        C1543490qGh.LIZIZ(C0OV1.class, null, 6);
        C1543490qGh.LIZIZ(C1548310qOT.class, null, 6);
        C1543490qGh.LIZIZ(C1548250qON.class, null, 6);
    }

    public static void LJ() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1161970gLL.LIZIZ();
    }

    public static void LJIIIZ() {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            Trace.endSection();
        }
    }

    @InterfaceC1294060jmO
    public final void LJIIIIZZ() {
        if (!C1535880q4Q.LIZ) {
            for (Map.Entry<String, InterfaceC1141530foN> entry : this.LJJII.entrySet()) {
                C1548820qPI.LJIIIIZZ(entry.getKey(), entry.getValue());
            }
            return;
        }
        for (Pair<String, InterfaceC1141530foN> pair : this.LJJIII) {
            C1548820qPI.LJIIIIZZ(pair.getFirst(), pair.getSecond());
        }
        this.LJJIII.clear();
    }

    public final void LJIJJ() {
        Iterator<T> it2 = this.LJIIZILJ.values().iterator();
        int size = 0;
        String strLIZIZ = "";
        int size2 = 0;
        String strLIZIZ2 = "";
        while (it2.hasNext()) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) it2.next();
            size2 += copyOnWriteArrayList.size();
            for (Object obj : copyOnWriteArrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ2);
                sbLIZ.append(obj);
                sbLIZ.append(", ");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        Iterator<T> it3 = this.LJIJ.values().iterator();
        int size3 = 0;
        while (it3.hasNext()) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) it3.next();
            size3 += copyOnWriteArrayList2.size();
            for (Object obj2 : copyOnWriteArrayList2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(obj2);
                sbLIZ2.append(", ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        Iterator<T> it4 = this.LJJIIZI.values().iterator();
        while (it4.hasNext()) {
            size += ((CopyOnWriteArrayList) it4.next()).size();
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Cache snapshot: onScreenSize = ");
        sbLIZ3.append(size2);
        sbLIZ3.append(", offScreenSize = ");
        sbLIZ3.append(size3);
        sbLIZ3.append(", preLayoutCacheSize = ");
        sbLIZ3.append(size);
        sbLIZ3.append(" , total = ");
        sbLIZ3.append(size2 + size3 + size);
        sbLIZ3.append(", extra info : jsRuntimeReadyKitViewsSize = ");
        sbLIZ3.append(this.LJJIJIIJIL.size());
        sbLIZ3.append(", totalCreateViewCount: ");
        sbLIZ3.append(this.LJJIL);
        LJIJJLI(C2188811AlT.LIZIZ(sbLIZ3));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Cache snapshot: ons = ");
        sbLIZ4.append(strLIZIZ2);
        sbLIZ4.append(", offs = ");
        sbLIZ4.append(strLIZIZ);
        LJIJJLI(C2188811AlT.LIZIZ(sbLIZ4));
    }

    public static void LIZ(String str) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            Trace.beginSection(str);
        }
    }

    public final void LIZIZ(SparkContext sparkContext) {
        Map<String, String> map;
        Uri.Builder builderBuildUpon = C1946007jm.LJ(sparkContext.LJJIL()).buildUpon();
        C678350QjB c678350QjB = this.LJJ;
        if (c678350QjB != null && (map = c678350QjB.LJIJJLI) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
        }
        sparkContext.LJJLIIJ(builderBuildUpon.build().toString());
        sparkContext.LJJJZ("group", this.LIZLLL);
        if (this.LJIIIIZZ) {
            sparkContext.LJJJZ("enable_extra_info", "1");
        }
        sparkContext.LJJJZ("enable_template_bundle_cache", "1");
        if (this.LJFF) {
            sparkContext.LJJJLZIJ(1, "enable_storage_group");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, X.0q7O, android.view.View] */
    public final C1537720q7O LJI(final C679540Ql6 c679540Ql6) {
        HybridSchemaParam hybridSchemaParamLIZJ;
        int iId;
        ?? r1;
        List<Function1<SparkContext, Unit>> list;
        List<Function1<SparkContext, Unit>> list2;
        final C259800zU c259800zU = new C259800zU();
        LJIIZILJ(c679540Ql6);
        final SparkContext sparkContext = new SparkContext();
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJIILIIL;
        if (concurrentHashMap == null) {
            concurrentHashMap = this.LJJIFFI;
        }
        sparkContext.shortLinkUrlCacheMap = concurrentHashMap;
        String str = c679540Ql6.LJIJJLI;
        if (str != null) {
            sparkContext.LJJLIIJ(C1946007jm.LJ(str).buildUpon().appendQueryParameter("spark_perf_biz", this.LIZJ).build().toString());
            sparkContext.LJJJZ("enable_extra_info", "1");
            sparkContext.LJJJZ("enable_template_bundle_cache", "1");
        }
        C1312970kGt c1312970kGt = c679540Ql6.LJIJI;
        if (c1312970kGt != null) {
            sparkContext.lynxViewGroupWrapper = c1312970kGt;
        }
        Map<String, String> map = c679540Ql6.LJIILIIL;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sparkContext.LJJJZ(entry.getKey(), entry.getValue());
            }
        }
        final TemplateData templateData = c679540Ql6.LJIIL;
        if (templateData != null) {
            sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0Ql7
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    C1537910q7h c1537910q7h;
                    if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                        TemplateData templateData2 = templateData;
                        C1540620qC4 c1540620qC4 = this;
                        C679540Ql6 c679540Ql62 = c679540Ql6;
                        c1537910q7h.LJIJJ = templateData2;
                        if (c1540620qC4.LJII) {
                            c1537910q7h.LJIIZILJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(c1540620qC4.LJIIL(c679540Ql62.LJIILLIIL, c679540Ql62.LJIIJJI, C621700Oa0.LIZ(c679540Ql62)), 1073741824));
                            c1537910q7h.LJIJ = Integer.valueOf(View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
                        }
                    }
                }
            });
        }
        sparkContext.LJJIJIIJIL(new AbstractC1538740q92() { // from class: X.0qC5
            public boolean LLILLJJLI;

            @Override // X.AbstractC1537870q7d
            public final void LJJZZI() throws JSONException {
                C1537720q7O c1537720q7O = c259800zU.element;
                Object tag = c1537720q7O != null ? c1537720q7O.getTag(R.id.vs8) : null;
                C679540Ql6 c679540Ql62 = tag instanceof C679540Ql6 ? (C679540Ql6) tag : null;
                C1540620qC4 c1540620qC4 = this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("EffectiveDrawCallback#");
                sbLIZ.append(c679540Ql62 != null ? c679540Ql62.LJIIJJI : null);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c1540620qC4.getClass();
                C1540620qC4.LIZ(strLIZIZ);
                C1540620qC4 c1540620qC42 = this;
                if (c1540620qC42.LJIIIZ) {
                    c1540620qC42.LJJ(c259800zU.element, c679540Ql62 != null ? c679540Ql62.LJIIJJI : null, Long.valueOf(System.currentTimeMillis()), "succeed");
                }
                C1540620qC4 c1540620qC43 = this;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onEffectiveDrawCallback targetLynxKitView: ");
                sbLIZ2.append(c259800zU.element);
                sbLIZ2.append(", configuration: ");
                sbLIZ2.append(c679540Ql62);
                c1540620qC43.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
                this.getClass();
                C1540620qC4.LJIIIZ();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
                Object tag;
                C679540Ql6 c679540Ql62;
                String str2;
                Object tag2;
                C679540Ql6 c679540Ql63;
                View view;
                if (this.LLILLJJLI) {
                    C1537720q7O c1537720q7O = c259800zU.element;
                    String str3 = null;
                    if (c1537720q7O != null) {
                        tag = c1537720q7O.getTag(R.id.vs8);
                    } else {
                        tag = null;
                    }
                    if (tag instanceof C679540Ql6) {
                        c679540Ql62 = (C679540Ql6) tag;
                    } else {
                        c679540Ql62 = null;
                    }
                    C1540620qC4 c1540620qC4 = this;
                    C1537720q7O c1537720q7O2 = c259800zU.element;
                    if (c679540Ql62 != null) {
                        str2 = c679540Ql62.LJIIJJI;
                    } else {
                        str2 = null;
                    }
                    c1540620qC4.LJJ(c1537720q7O2, str2, null, "fail");
                    if ((interfaceC1541990qEH instanceof C1537720q7O) && (view = (View) interfaceC1541990qEH) != null) {
                        tag2 = view.getTag(R.id.vs8);
                    } else {
                        tag2 = null;
                    }
                    if (tag2 instanceof C679540Ql6) {
                        c679540Ql63 = (C679540Ql6) tag2;
                    } else {
                        c679540Ql63 = null;
                    }
                    C1540620qC4 c1540620qC42 = this;
                    if (c679540Ql63 != null) {
                        str3 = c679540Ql63.LJIIJJI;
                    }
                    if (!c1540620qC42.LJJI && str3 != null) {
                        for (C1540660qC8 c1540660qC8 : c1540620qC42.LJJIZ) {
                            int i = 0;
                            for (Map.Entry<String, C1540670qC9> entry2 : c1540660qC8.LIZIZ.entrySet()) {
                                if (Intrinsics.LJFF(entry2.getKey(), str3)) {
                                    entry2.getValue().LIZJ = Boolean.FALSE;
                                }
                                if (Intrinsics.LJFF(entry2.getValue().LIZJ, Boolean.FALSE)) {
                                    i++;
                                }
                            }
                            if (i == c1540660qC8.LIZIZ.size() && !c1540660qC8.LJFF) {
                                C1540620qC4.LIZ("onPageGroupLoadFail");
                                InterfaceC1540710qCD interfaceC1540710qCD = c1540660qC8.LIZJ;
                                if (interfaceC1540710qCD != null) {
                                    interfaceC1540710qCD.Ka(c1540660qC8);
                                }
                                C1540620qC4.LJIIIZ();
                                c1540660qC8.LJFF = true;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onPageGroupLoadFail , firstScreenMaxDrawEnd: ");
                                sbLIZ.append(c1540660qC8.LIZLLL);
                                c1540620qC42.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str2, C1542120qEU c1542120qEU) {
                this.LLILLJJLI = true;
            }
        });
        sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0gVU
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                final C1537830q7Z c1537830q7Z;
                if ((interfaceC1531560pxS instanceof C1537830q7Z) && (c1537830q7Z = (C1537830q7Z) interfaceC1531560pxS) != null) {
                    C679540Ql6 c679540Ql62 = c679540Ql6;
                    final C259800zU<C1537720q7O> c259800zU2 = c259800zU;
                    final C1540620qC4 c1540620qC4 = this;
                    C1162570gMJ c1162570gMJ = c679540Ql62.LJIJ;
                    if (c1162570gMJ != null) {
                        Integer num = c1162570gMJ.LIZ;
                        if (num != null) {
                            c1537830q7Z.LJIILL = Integer.valueOf(num.intValue());
                        }
                        Integer num2 = c1162570gMJ.LIZIZ;
                        if (num2 != null) {
                            c1537830q7Z.LJIILLIIL = Integer.valueOf(num2.intValue());
                        }
                    }
                    Iterator<LynxViewClient> it2 = c679540Ql62.LJII.iterator();
                    while (it2.hasNext()) {
                        c1537830q7Z.LJIIIIZZ(it2.next());
                    }
                    c1537830q7Z.LJIIIIZZ(new LynxViewClient() { // from class: X.0qC2
                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJII() throws JSONException {
                            C1537720q7O c1537720q7O = c259800zU2.element;
                            Object tag = c1537720q7O != null ? c1537720q7O.getTag(R.id.vs8) : null;
                            C679540Ql6 c679540Ql63 = tag instanceof C679540Ql6 ? (C679540Ql6) tag : null;
                            C1540620qC4 c1540620qC42 = c1540620qC4;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onDataUpdated#");
                            sbLIZ.append(c679540Ql63 != null ? c679540Ql63.LJIIJJI : null);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c1540620qC42.getClass();
                            C1540620qC4.LIZ(strLIZIZ);
                            C1540620qC4 c1540620qC43 = c1540620qC4;
                            if (!c1540620qC43.LJIIIZ) {
                                c1540620qC43.LJJ(c259800zU2.element, c679540Ql63 != null ? c679540Ql63.LJIIJJI : null, Long.valueOf(System.currentTimeMillis()), "succeed");
                            }
                            C1540620qC4 c1540620qC44 = c1540620qC4;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onDataUpdated targetLynxKitView: ");
                            sbLIZ2.append(c259800zU2.element);
                            sbLIZ2.append(", configuration: ");
                            sbLIZ2.append(c679540Ql63);
                            c1540620qC44.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
                            c1540620qC4.getClass();
                            C1540620qC4.LJIIIZ();
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJIILLIIL() {
                            C1537720q7O c1537720q7O = c259800zU2.element;
                            if (c1537720q7O != null) {
                                C1540620qC4 c1540620qC42 = c1540620qC4;
                                C1537830q7Z c1537830q7Z2 = c1537830q7Z;
                                c1540620qC42.LJJIJIIJIL.remove(c1537720q7O);
                                c1540620qC42.LJJIJIL.remove(c1537830q7Z2.LJJJLIIL.containerId);
                            }
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJJIFFI() {
                            InterfaceC1540590qC1 interfaceC1540590qC1;
                            CopyOnWriteArrayList<Pair<String, Object>> copyOnWriteArrayList;
                            CopyOnWriteArrayList<Pair<String, Object>> copyOnWriteArrayList2;
                            C1537720q7O c1537720q7O = c259800zU2.element;
                            if (c1537720q7O != null) {
                                C1540620qC4 c1540620qC42 = c1540620qC4;
                                C1537830q7Z c1537830q7Z2 = c1537830q7Z;
                                c1540620qC42.LJJIJIIJIL.add(c1537720q7O);
                                String str2 = c1537830q7Z2.LJJJLIIL.containerId;
                                C1529870puj.LIZ.getClass();
                                InterfaceC1541990qEH interfaceC1541990qEHLJFF = C1529870puj.LJFF(str2);
                                if (interfaceC1541990qEHLJFF != null && (copyOnWriteArrayList2 = c1540620qC42.LJJIJIL.get(str2)) != null) {
                                    for (Pair<String, Object> pair : copyOnWriteArrayList2) {
                                        String first = pair.getFirst();
                                        Object second = pair.getSecond();
                                        interfaceC1541990qEHLJFF.LIZ(first, second instanceof JSONObject ? (JSONObject) second : null);
                                    }
                                }
                                Reference reference = (Reference) ((LinkedHashMap) C586180Myu.LIZ).get(str2);
                                if (reference == null || (interfaceC1540590qC1 = (InterfaceC1540590qC1) reference.get()) == null || (copyOnWriteArrayList = c1540620qC42.LJJIJIL.get(str2)) == null) {
                                    return;
                                }
                                for (Pair<String, Object> pair2 : copyOnWriteArrayList) {
                                    String first2 = pair2.getFirst();
                                    Object second2 = pair2.getSecond();
                                    interfaceC1540590qC1.LIZ(first2, second2 instanceof JSONObject ? (JSONObject) second2 : null);
                                }
                            }
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJJIIZI() throws JSONException {
                            C1537720q7O c1537720q7O = c259800zU2.element;
                            Object tag = c1537720q7O != null ? c1537720q7O.getTag(R.id.vs8) : null;
                            C679540Ql6 c679540Ql63 = tag instanceof C679540Ql6 ? (C679540Ql6) tag : null;
                            C1540620qC4 c1540620qC42 = c1540620qC4;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onUpdateDataWithoutChange#");
                            sbLIZ.append(c679540Ql63 != null ? c679540Ql63.LJIIJJI : null);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c1540620qC42.getClass();
                            C1540620qC4.LIZ(strLIZIZ);
                            C1540620qC4 c1540620qC43 = c1540620qC4;
                            if (!c1540620qC43.LJIIJ) {
                                c1540620qC43.LJJ(c259800zU2.element, c679540Ql63 != null ? c679540Ql63.LJIIJJI : null, Long.valueOf(System.currentTimeMillis()), "succeed");
                            }
                            C1540620qC4 c1540620qC44 = c1540620qC4;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onUpdateDataWithoutChange targetLynxKitView: ");
                            sbLIZ2.append(c259800zU2.element);
                            sbLIZ2.append(", configuration: ");
                            sbLIZ2.append(c679540Ql63);
                            c1540620qC44.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
                            c1540620qC4.getClass();
                            C1540620qC4.LJIIIZ();
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void onTimingSetup(Map<String, Object> map2) throws JSONException {
                            Object tag;
                            C679540Ql6 c679540Ql63;
                            String str2;
                            Object obj;
                            Map map3;
                            long jLongValue;
                            Long l;
                            super.onTimingSetup(map2);
                            C1537720q7O c1537720q7O = c259800zU2.element;
                            String str3 = null;
                            if (c1537720q7O != null) {
                                tag = c1537720q7O.getTag(R.id.vs8);
                            } else {
                                tag = null;
                            }
                            if (tag instanceof C679540Ql6) {
                                c679540Ql63 = (C679540Ql6) tag;
                            } else {
                                c679540Ql63 = null;
                            }
                            C1540620qC4 c1540620qC42 = c1540620qC4;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onTimingSetup#");
                            if (c679540Ql63 != null) {
                                str2 = c679540Ql63.LJIIJJI;
                            } else {
                                str2 = null;
                            }
                            sbLIZ.append(str2);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c1540620qC42.getClass();
                            C1540620qC4.LIZ(strLIZIZ);
                            if (map2 != null) {
                                obj = map2.get("setup_timing");
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof Map) && (map3 = (Map) obj) != null) {
                                C1540620qC4 c1540620qC43 = c1540620qC4;
                                C259800zU<C1537720q7O> c259800zU3 = c259800zU2;
                                Object obj2 = map3.get("draw_end");
                                if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
                                    jLongValue = l.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                if (!c1540620qC43.LJIIIZ) {
                                    C1537720q7O c1537720q7O2 = c259800zU3.element;
                                    if (c679540Ql63 != null) {
                                        str3 = c679540Ql63.LJIIJJI;
                                    }
                                    c1540620qC43.LJJ(c1537720q7O2, str3, Long.valueOf(jLongValue), "succeed");
                                }
                            }
                            C1540620qC4 c1540620qC44 = c1540620qC4;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onTimingSetup targetLynxKitView: ");
                            sbLIZ2.append(c259800zU2.element);
                            sbLIZ2.append(", configuration: ");
                            sbLIZ2.append(c679540Ql63);
                            c1540620qC44.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
                            c1540620qC4.getClass();
                            C1540620qC4.LJIIIZ();
                        }

                        @Override // com.lynx.tasm.LynxViewClient
                        public final void LJJIIZ(String str2, Map map2, Map map3) throws JSONException {
                            Object tag;
                            C679540Ql6 c679540Ql63;
                            String str3;
                            Object obj;
                            Map map4;
                            Map map5;
                            C1537720q7O c1537720q7O = c259800zU2.element;
                            String str4 = null;
                            if (c1537720q7O != null) {
                                tag = c1537720q7O.getTag(R.id.vs8);
                            } else {
                                tag = null;
                            }
                            if (tag instanceof C679540Ql6) {
                                c679540Ql63 = (C679540Ql6) tag;
                            } else {
                                c679540Ql63 = null;
                            }
                            C1540620qC4 c1540620qC42 = c1540620qC4;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onTimingUpdate#");
                            if (c679540Ql63 != null) {
                                str3 = c679540Ql63.LJIIJJI;
                            } else {
                                str3 = null;
                            }
                            sbLIZ.append(str3);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c1540620qC42.getClass();
                            C1540620qC4.LIZ(strLIZIZ);
                            C1540620qC4 c1540620qC43 = c1540620qC4;
                            C259800zU<C1537720q7O> c259800zU3 = c259800zU2;
                            if (map2 != null) {
                                obj = map2.get("update_timings");
                            } else {
                                obj = null;
                            }
                            if ((obj instanceof Map) && (map4 = (Map) obj) != null) {
                                Iterator it3 = map4.entrySet().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        break;
                                    }
                                    Map.Entry entry2 = (Map.Entry) it3.next();
                                    if (Intrinsics.LJFF(entry2.getKey(), "_update_timing_from_server")) {
                                        Object value = entry2.getValue();
                                        if ((value instanceof Map) && (map5 = (Map) value) != null) {
                                            for (Map.Entry entry3 : map5.entrySet()) {
                                                if (Intrinsics.LJFF(entry3.getKey(), "draw_end")) {
                                                    long j = CastLongProtector.parseLong(String.valueOf(entry3.getValue()));
                                                    if (!c1540620qC43.LJIIIZ) {
                                                        C1537720q7O c1537720q7O2 = c259800zU3.element;
                                                        if (c679540Ql63 != null) {
                                                            str4 = c679540Ql63.LJIIJJI;
                                                        }
                                                        c1540620qC43.LJJ(c1537720q7O2, str4, Long.valueOf(j), "succeed");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C1540620qC4 c1540620qC44 = c1540620qC4;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("onTimingUpdate targetLynxKitView: ");
                            sbLIZ2.append(c259800zU2.element);
                            sbLIZ2.append(", configuration: ");
                            sbLIZ2.append(c679540Ql63);
                            c1540620qC44.LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
                            c1540620qC4.getClass();
                            C1540620qC4.LJIIIZ();
                        }
                    });
                    c1537830q7Z.LJJJJI = c679540Ql62.LJIIIIZZ;
                }
            }
        });
        sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0Ql4
            @Override // X.C1543000qFu
            public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                List list3 = c679540Ql6.LJIIZILJ;
                return list3 == null ? C13BV.INSTANCE : list3;
            }

            @Override // X.C1543000qFu
            public final Map<Class<?>, C1544630qIX<?>> LJII() {
                Map<Class<?>, ? extends Object> map2;
                HashMap map3 = new HashMap();
                C1540620qC4 c1540620qC4 = this;
                C679540Ql6 c679540Ql62 = c679540Ql6;
                final SparkContext sparkContext2 = sparkContext;
                C678350QjB c678350QjB = c1540620qC4.LJJ;
                if (c678350QjB != null && (map2 = c678350QjB.LJJI) != null) {
                    for (Map.Entry<Class<?>, ? extends Object> entry2 : map2.entrySet()) {
                        map3.put(entry2.getKey(), new C1544630qIX(entry2.getValue()));
                    }
                }
                Map<Class<?>, ? extends Object> map4 = c679540Ql62.LJJIFFI;
                if (map4 != null) {
                    for (Map.Entry<Class<?>, ? extends Object> entry3 : map4.entrySet()) {
                        map3.put(entry3.getKey(), new C1544630qIX(entry3.getValue()));
                    }
                }
                map3.put(C1540620qC4.class, new C1544630qIX(c1540620qC4));
                map3.put(InterfaceC1548390qOb.class, new C1544630qIX(new InterfaceC1548390qOb() { // from class: X.0Ql5
                    @Override // X.InterfaceC1548390qOb
                    public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str2) {
                        JSONObject jSONObject;
                        if (interfaceC1107590evd != null) {
                            C1872780ypo.LIZ.getClass();
                            jSONObject = C1872780ypo.LIZIZ(interfaceC1107590evd);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        C1075770e6J c1075770e6J = (C1075770e6J) sparkContext2.LJFF(C1075770e6J.class);
                        if (c1075770e6J != null) {
                            c1075770e6J.sendEvent(str2, jSONObject);
                        }
                    }
                }));
                return map3;
            }
        });
        LIZIZ(sparkContext);
        if (this.LJIIL && (list2 = c679540Ql6.LJIIIZ) != null) {
            Iterator it2 = ((CopyOnWriteArrayList) list2).iterator();
            while (it2.hasNext()) {
                ((Function1) it2.next()).invoke(sparkContext);
            }
        }
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZ = true;
        c1538590q8n.LIZLLL = false;
        c1538590q8n.LJ = false;
        c1538590q8n.LJIIIZ = true;
        List<Function1<C1538590q8n, Unit>> list3 = c679540Ql6.LJIIJ;
        if (list3 != null) {
            Iterator it3 = ((CopyOnWriteArrayList) list3).iterator();
            while (it3.hasNext()) {
                ((Function1) it3.next()).invoke(c1538590q8n);
            }
        }
        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
        Map<String, ? extends Object> map2 = c679540Ql6.LJIILL;
        if (map2 != null) {
            sparkContext.LJJLIIIJILLIZJL(map2);
        }
        if (!this.LJIIL && (list = c679540Ql6.LJIIIZ) != null) {
            Iterator it4 = ((CopyOnWriteArrayList) list).iterator();
            while (it4.hasNext()) {
                ((Function1) it4.next()).invoke(sparkContext);
            }
        }
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
            Integer num = c679540Ql6.LJFF;
            if (num != null) {
                iId = num.intValue();
            } else {
                iId = EnumC665490Q8l.MOST_ON_TASM.id();
            }
            hybridSchemaParamLIZJ.setThreadStrategy(iId);
            this.LJJIL++;
            InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContext, this.LIZ, null);
            if ((interfaceC1541990qEHLIZIZ instanceof C1537720q7O) && (r1 = (C1537720q7O) interfaceC1541990qEHLIZIZ) != 0) {
                c259800zU.element = r1;
                r1.setTag(R.id.vs8, c679540Ql6);
                LJIIJ(r1, false);
                LJIIJ(r1, true);
                return r1;
            }
        }
        return LJJJJIZL.getValue();
    }

    public final int LJIIJJI(C679540Ql6 c679540Ql6) {
        int size;
        int size2;
        c679540Ql6.getClass();
        String strLIZ = C621700Oa0.LIZ(c679540Ql6);
        CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList = this.LJIJ.get(strLIZ);
        int size3 = 0;
        if (copyOnWriteArrayList != null) {
            size = copyOnWriteArrayList.size();
        } else {
            size = 0;
        }
        CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList2 = this.LJIIZILJ.get(strLIZ);
        if (copyOnWriteArrayList2 != null) {
            size2 = copyOnWriteArrayList2.size();
        } else {
            size2 = 0;
        }
        int i = size + size2;
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList3 = this.LJJIIZI.get(strLIZ);
        if (copyOnWriteArrayList3 != null) {
            size3 = copyOnWriteArrayList3.size();
        }
        return i + size3;
    }

    public final void LJIILJJIL(C678350QjB c678350QjB) {
        this.LJJ = c678350QjB;
        C1536940q68 c1536940q68 = new C1536940q68();
        c1536940q68.LIZ = this.LIZJ;
        c1536940q68.LIZ(c678350QjB.LJIIJJI);
        C683880Qs6.LIZIZ(c1536940q68);
    }

    public final void LJIILL(List<C1168250gVT> list) {
        for (C1168250gVT c1168250gVT : (ArrayList) list) {
            c1168250gVT.getClass();
            this.LJIJI.put(C621700Oa0.LIZ(c1168250gVT), c1168250gVT);
        }
    }

    public final void LJIIZILJ(C679540Ql6 c679540Ql6) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList;
        Function1<? super C1538590q8n, Unit> function1;
        Function1<? super SparkContext, Unit> function12;
        Function1<? super C1537720q7O, Unit> function13;
        Integer num;
        List<C1311670kEn> list;
        List<C1311670kEn> list2;
        LynxViewClient lynxViewClient;
        LynxViewClient lynxViewClient2;
        C1168250gVT c1168250gVT;
        C1168250gVT c1168250gVT2;
        C1168250gVT c1168250gVT3;
        C1168250gVT c1168250gVT4;
        List<? extends Class<? extends InterfaceC1063710dmr>> list3;
        Map<String, String> map;
        Map<String, ? extends Object> map2;
        if (c679540Ql6.LJIL) {
            return;
        }
        String strLIZ = C621700Oa0.LIZ(c679540Ql6);
        C678350QjB c678350QjB = this.LJJ;
        if (c678350QjB != null && (map2 = c678350QjB.LJIILIIL) != null) {
            linkedHashMap = new LinkedHashMap(map2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        C1168250gVT c1168250gVT5 = this.LJIJI.get(strLIZ);
        if (c1168250gVT5 != null) {
            Object linkedHashMap3 = c1168250gVT5.LJIIJJI;
            if (linkedHashMap3 == null) {
                linkedHashMap3 = new LinkedHashMap();
            }
            linkedHashMap.putAll(linkedHashMap3);
        }
        Map<String, ? extends Object> map3 = c679540Ql6.LJIILL;
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        c679540Ql6.LJIILL = linkedHashMap;
        C678350QjB c678350QjB2 = this.LJJ;
        Function1<? super C1537720q7O, Unit> function14 = null;
        if (c678350QjB2 != null && (map = c678350QjB2.LJIIL) != null) {
            linkedHashMap2 = new LinkedHashMap(map);
        } else {
            linkedHashMap2 = null;
        }
        Map<String, String> map4 = c679540Ql6.LJIILIIL;
        if (map4 != null && linkedHashMap2 != null) {
            linkedHashMap2.putAll(map4);
        }
        c679540Ql6.LJIILIIL = linkedHashMap2;
        C678350QjB c678350QjB3 = this.LJJ;
        if (c678350QjB3 != null && (list3 = c678350QjB3.LJIILJJIL) != null) {
            arrayList = new ArrayList(list3);
        } else {
            arrayList = new ArrayList();
        }
        C1168250gVT c1168250gVT6 = this.LJIJI.get(strLIZ);
        if (c1168250gVT6 != null) {
            Collection arrayList2 = c1168250gVT6.LJIIL;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            }
            arrayList.addAll(arrayList2);
        }
        List<? extends Class<? extends InterfaceC1063710dmr>> list4 = c679540Ql6.LJIIZILJ;
        if (list4 != null) {
            arrayList.addAll(list4);
        }
        c679540Ql6.LJIIZILJ = arrayList;
        C1162570gMJ c1162570gMJ = c679540Ql6.LJIJ;
        if (c1162570gMJ == null && ((c1168250gVT4 = this.LJIJI.get(strLIZ)) == null || (c1162570gMJ = c1168250gVT4.LJIILIIL) == null)) {
            C678350QjB c678350QjB4 = this.LJJ;
            if (c678350QjB4 != null) {
                c1162570gMJ = c678350QjB4.LJIILL;
            } else {
                c1162570gMJ = null;
            }
        }
        c679540Ql6.LJIJ = c1162570gMJ;
        Integer num2 = c679540Ql6.LJIILLIIL;
        if (num2 == null && ((c1168250gVT3 = this.LJIJI.get(strLIZ)) == null || (num2 = c1168250gVT3.LJIILJJIL) == null)) {
            C678350QjB c678350QjB5 = this.LJJ;
            if (c678350QjB5 != null) {
                num2 = c678350QjB5.LJIILLIIL;
            } else {
                num2 = null;
            }
        }
        c679540Ql6.LJIILLIIL = num2;
        C1312970kGt c1312970kGt = c679540Ql6.LJIJI;
        if (c1312970kGt == null && ((c1168250gVT2 = this.LJIJI.get(strLIZ)) == null || (c1312970kGt = c1168250gVT2.LJIILL) == null)) {
            C678350QjB c678350QjB6 = this.LJJ;
            if (c678350QjB6 != null) {
                c1312970kGt = c678350QjB6.LJIIZILJ;
            } else {
                c1312970kGt = null;
            }
        }
        c679540Ql6.LJIJI = c1312970kGt;
        Function2<? super C1537720q7O, ? super Integer, Unit> function2 = c679540Ql6.LIZJ;
        if (function2 == null && ((c1168250gVT = this.LJIJI.get(strLIZ)) == null || (function2 = c1168250gVT.LIZJ) == null)) {
            C678350QjB c678350QjB7 = this.LJJ;
            if (c678350QjB7 != null) {
                function2 = c678350QjB7.LIZJ;
            } else {
                function2 = null;
            }
        }
        c679540Ql6.LIZJ = function2;
        String str = c679540Ql6.LJIJJLI;
        if (str == null) {
            C1168250gVT c1168250gVT7 = this.LJIJI.get(strLIZ);
            if (c1168250gVT7 != null) {
                str = c1168250gVT7.LJIIZILJ;
            } else {
                str = null;
            }
        }
        c679540Ql6.LJIJJLI = str;
        String str2 = c679540Ql6.LJIJJ;
        if (str2 == null) {
            C1168250gVT c1168250gVT8 = this.LJIJI.get(strLIZ);
            if (c1168250gVT8 != null) {
                str2 = c1168250gVT8.LJIILLIIL;
            } else {
                str2 = null;
            }
        }
        c679540Ql6.LJIJJ = str2;
        c679540Ql6.LJIL = true;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        C678350QjB c678350QjB8 = this.LJJ;
        if (c678350QjB8 != null && (lynxViewClient2 = c678350QjB8.LIZLLL) != null) {
            copyOnWriteArrayList.add(lynxViewClient2);
        }
        C1168250gVT c1168250gVT9 = this.LJIJI.get(strLIZ);
        if (c1168250gVT9 != null && (lynxViewClient = c1168250gVT9.LIZLLL) != null) {
            copyOnWriteArrayList.add(lynxViewClient);
        }
        LynxViewClient lynxViewClient3 = c679540Ql6.LIZLLL;
        if (lynxViewClient3 != null) {
            copyOnWriteArrayList.add(lynxViewClient3);
        }
        c679540Ql6.LJII = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        C678350QjB c678350QjB9 = this.LJJ;
        if (c678350QjB9 != null && (list2 = c678350QjB9.LJ) != null) {
            copyOnWriteArrayList2.addAll(list2);
        }
        C1168250gVT c1168250gVT10 = this.LJIJI.get(strLIZ);
        if (c1168250gVT10 != null && (list = c1168250gVT10.LJ) != null) {
            copyOnWriteArrayList2.addAll(list);
        }
        List<C1311670kEn> list5 = c679540Ql6.LJ;
        if (list5 != null) {
            copyOnWriteArrayList2.addAll(list5);
        }
        c679540Ql6.LJIIIIZZ = copyOnWriteArrayList2;
        if (c679540Ql6.LJFF == null) {
            C1168250gVT c1168250gVT11 = this.LJIJI.get(strLIZ);
            if (c1168250gVT11 == null || (num = c1168250gVT11.LJFF) == null) {
                C678350QjB c678350QjB10 = this.LJJ;
                if (c678350QjB10 != null) {
                    num = c678350QjB10.LJFF;
                } else {
                    num = null;
                }
            }
            c679540Ql6.LJFF = num;
        }
        if (c679540Ql6.LJI == null) {
            C1168250gVT c1168250gVT12 = this.LJIJI.get(strLIZ);
            if (c1168250gVT12 != null && (function13 = c1168250gVT12.LJI) != null) {
                function14 = function13;
            } else {
                C678350QjB c678350QjB11 = this.LJJ;
                if (c678350QjB11 != null) {
                    function14 = c678350QjB11.LJI;
                }
            }
            c679540Ql6.LJI = function14;
        }
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        C678350QjB c678350QjB12 = this.LJJ;
        if (c678350QjB12 != null && (function12 = c678350QjB12.LJIL) != null) {
            copyOnWriteArrayList3.add(function12);
        }
        Function1<? super SparkContext, Unit> function15 = c679540Ql6.LJJ;
        if (function15 != null) {
            copyOnWriteArrayList3.add(function15);
        }
        c679540Ql6.LJIIIZ = copyOnWriteArrayList3;
        CopyOnWriteArrayList copyOnWriteArrayList4 = new CopyOnWriteArrayList();
        C678350QjB c678350QjB13 = this.LJJ;
        if (c678350QjB13 != null && (function1 = c678350QjB13.LJJ) != null) {
            copyOnWriteArrayList4.add(function1);
        }
        Function1<? super C1538590q8n, Unit> function16 = c679540Ql6.LJJI;
        if (function16 != null) {
            copyOnWriteArrayList4.add(function16);
        }
        c679540Ql6.LJIIJ = copyOnWriteArrayList4;
    }

    public final void LJIJJLI(String str) {
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ && this.LJJIIJ && str.length() > 4000) {
            int iMin = 0;
            while (iMin < str.length()) {
                iMin = Math.min(iMin + 4000, str.length());
            }
        }
    }

    public final void LJJI(C1537720q7O c1537720q7O) {
        C679540Ql6 c679540Ql6;
        String strLIZ;
        CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList;
        if (this.LIZIZ) {
            Object tag = c1537720q7O.getTag(R.id.vs8);
            if ((tag instanceof C679540Ql6) && (c679540Ql6 = (C679540Ql6) tag) != null && (strLIZ = C621700Oa0.LIZ(c679540Ql6)) != null) {
                if (this.LJIJ.get(strLIZ) == null) {
                    this.LJIJ.put(strLIZ, new CopyOnWriteArrayList<>());
                }
                CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList2 = this.LJIJ.get(strLIZ);
                if (copyOnWriteArrayList2 != null && !copyOnWriteArrayList2.contains(c1537720q7O) && (copyOnWriteArrayList = this.LJIJ.get(strLIZ)) != null) {
                    copyOnWriteArrayList.add(c1537720q7O);
                }
                CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList3 = this.LJIIZILJ.get(strLIZ);
                if (copyOnWriteArrayList3 != null) {
                    copyOnWriteArrayList3.remove(c1537720q7O);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recycleLynxKitView kitView: ");
                sbLIZ.append(c1537720q7O);
                sbLIZ.append(", conf = ");
                sbLIZ.append(c679540Ql6);
                LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                return;
            }
        }
        c1537720q7O.LIZ("cardHide", null);
        this.LJJIJIL.remove(c1537720q7O.getHybridContext().containerId);
        LJIJJ();
    }

    public final void LJJIFFI(String str) {
        for (Map.Entry<String, CopyOnWriteArrayList<C0OV4>> entry : this.LJIILLIIL.LIZ().entrySet()) {
            for (C0OV4 c0ov4 : entry.getValue()) {
                if (Intrinsics.LJFF(c0ov4.LIZ, str)) {
                    entry.getValue().remove(c0ov4);
                }
            }
        }
    }

    public final void LJJII(C1537720q7O c1537720q7O) {
        Iterator<T> it2 = this.LJIIZILJ.values().iterator();
        while (it2.hasNext()) {
            ((CopyOnWriteArrayList) it2.next()).remove(c1537720q7O);
        }
        Iterator<T> it3 = this.LJIJ.values().iterator();
        while (it3.hasNext()) {
            ((CopyOnWriteArrayList) it3.next()).remove(c1537720q7O);
        }
        c1537720q7O.LLD(true);
        String str = c1537720q7O.getHybridContext().containerId;
        if (str == null) {
            str = "";
        }
        LJJIFFI(str);
    }

    public final void LJJIIJ(C1537720q7O c1537720q7O) {
        C679540Ql6 c679540Ql6;
        String str;
        Object tag = c1537720q7O.getTag(R.id.vs8);
        if (tag instanceof C679540Ql6) {
            c679540Ql6 = (C679540Ql6) tag;
        } else {
            c679540Ql6 = null;
        }
        if (!this.LJJIJL.contains(c1537720q7O.getHybridContext().containerId)) {
            if (c679540Ql6 != null) {
                str = c679540Ql6.LJIIJJI;
            } else {
                str = null;
            }
            Iterator<C1540660qC8> it2 = this.LJJIZ.iterator();
            loop0: while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Iterator<Map.Entry<String, C1540670qC9>> it3 = it2.next().LIZIZ.entrySet().iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(it3.next().getKey(), str)) {
                        LJJIIJZLJL(c1537720q7O, "viewAppeared", null);
                        break loop0;
                    }
                }
            }
        }
        LJJIIJZLJL(c1537720q7O, "cardShow", null);
    }

    public final Pair<C1537720q7O, Boolean> LJJIIZI(C679540Ql6 c679540Ql6) {
        C1537720q7O c1537720q7OLIZJ;
        String str = c679540Ql6.LJIIJJI;
        if (str != null && (c1537720q7OLIZJ = ((C2250481D6o) this.LJIJJ.getValue()).LIZJ(str)) != null) {
            return new Pair<>(c1537720q7OLIZJ, Boolean.FALSE);
        }
        String strLIZ = C621700Oa0.LIZ(c679540Ql6);
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.LJJIIZI.get(strLIZ);
        if (copyOnWriteArrayList != null && (r4 = copyOnWriteArrayList.iterator()) != null) {
            for (Integer num : copyOnWriteArrayList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append('#');
                sbLIZ.append(num);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryGetPreLayoutCache identify: ");
                sbLIZ2.append(strLIZIZ);
                LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
                C1537720q7O c1537720q7OLIZJ2 = ((C2250481D6o) this.LJIJJ.getValue()).LIZJ(strLIZIZ);
                if (c1537720q7OLIZJ2 != null) {
                    CopyOnWriteArrayList<Integer> copyOnWriteArrayList2 = this.LJJIIZI.get(strLIZ);
                    if (copyOnWriteArrayList2 != null) {
                        copyOnWriteArrayList2.remove(num);
                    }
                    return new Pair<>(c1537720q7OLIZJ2, Boolean.TRUE);
                }
            }
        }
        return new Pair<>(null, Boolean.FALSE);
    }

    public static void LIZLLL(C679540Ql6 c679540Ql6, C1537720q7O c1537720q7O) {
        c1537720q7O.setTag(R.id.vs8, c679540Ql6);
        c1537720q7O.LJJIZ();
    }

    public final void LIZJ(C679540Ql6 c679540Ql6, C1537720q7O c1537720q7O) {
        C679540Ql6 c679540Ql62;
        String strLIZ;
        CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList;
        Object tag = c1537720q7O.getTag(R.id.vs8);
        if ((tag instanceof C679540Ql6) && (c679540Ql62 = (C679540Ql6) tag) != null && (strLIZ = C621700Oa0.LIZ(c679540Ql62)) != null) {
            if (this.LJIIZILJ.get(strLIZ) == null) {
                this.LJIIZILJ.put(strLIZ, new CopyOnWriteArrayList<>());
            }
            CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList2 = this.LJIIZILJ.get(strLIZ);
            if ((copyOnWriteArrayList2 == null || !copyOnWriteArrayList2.contains(c1537720q7O)) && (copyOnWriteArrayList = this.LJIIZILJ.get(strLIZ)) != null) {
                copyOnWriteArrayList.add(c1537720q7O);
            }
            CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList3 = this.LJIJ.get(strLIZ);
            if (copyOnWriteArrayList3 != null) {
                copyOnWriteArrayList3.remove(c1537720q7O);
            }
        }
        this.LJJJJI.put(c1537720q7O.getHybridContext().containerId, c1537720q7O);
        if (!this.LJII) {
            int iLJIIL = LJIIL(c679540Ql6.LJIILLIIL, c679540Ql6.LJIIJJI, C621700Oa0.LIZ(c679540Ql6));
            if (c1537720q7O.getMeasuredHeight() != iLJIIL) {
                C086F c086f = C086F.LIZ;
                ARunnableS17S0201000_10 aRunnableS17S0201000_10 = new ARunnableS17S0201000_10(iLJIIL, c679540Ql6, c1537720q7O, 10);
                c086f.getClass();
                C086F.LJII(aRunnableS17S0201000_10);
            }
        }
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ) {
            C086F c086f2 = C086F.LIZ;
            ARunnableS78S0200000_9 aRunnableS78S0200000_9 = new ARunnableS78S0200000_9(c1537720q7O, c679540Ql6, 97);
            c086f2.getClass();
            C086F.LIZIZ(2000L, aRunnableS78S0200000_9);
        }
        String str = c679540Ql6.LJIIJJI;
        if (str != null) {
            if (this.LJJJ.containsKey(str)) {
                c1537720q7O.LJJIL(Boolean.TRUE, "isFirstScreen");
            } else {
                c1537720q7O.LLJJJJJIL.remove("isFirstScreen");
            }
        }
        LJIJJ();
    }

    public final C1537720q7O LJFF(C679540Ql6 c679540Ql6, long j) {
        C1537720q7O c1537720q7OLJI = LJI(c679540Ql6);
        LIZLLL(c679540Ql6, c1537720q7OLJI);
        LJJIIJ(c1537720q7OLJI);
        c1537720q7OLJI.load();
        c1537720q7OLJI.LJJIJIIJI(C1697810uHb.LJIILJJIL("isReuse", "isPreLayout", "isPreCreate", "isFirstScreen", "isPreRender"));
        c1537720q7OLJI.LJJIL(Long.valueOf(j), "initTime");
        c1537720q7OLJI.LJJIL(EnumC620100OTw.LOAD_URL, "updateType");
        LIZJ(c679540Ql6, c1537720q7OLJI);
        this.LJJJI.LIZLLL++;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getOrCreateLynxKitView create new instance, fetch liteLynxKitView: ");
        sbLIZ.append(c1537720q7OLJI);
        sbLIZ.append(", configuration: ");
        sbLIZ.append(c679540Ql6);
        sbLIZ.append(", lynxdata: ");
        LJ();
        sbLIZ.append("");
        LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
        return c1537720q7OLJI;
    }

    public final void LJIIJ(C1537720q7O c1537720q7O, boolean z) {
        if (z) {
            this.LJJIJ.getValue().getClass();
            return;
        }
        C1540680qCA c1540680qCA = (C1540680qCA) this.LJJIIZ.getValue();
        synchronized (c1540680qCA) {
            if (c1540680qCA.LIZIZ.isEmpty()) {
                return;
            }
            for (Map.Entry entry : ((LinkedHashMap) c1540680qCA.LIZIZ).entrySet()) {
                c1537720q7O.setSessionStorageItem((String) entry.getKey(), (TemplateData) entry.getValue());
            }
            ((LinkedHashMap) c1540680qCA.LIZIZ).clear();
        }
    }

    public final C1537720q7O LJIILIIL(C679540Ql6 c679540Ql6, C1537720q7O c1537720q7O) {
        CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList;
        C1537720q7O next;
        int iIntValue;
        C1161430gKT c1161430gKT = this.LJIILJJIL;
        if (c1161430gKT != null) {
            c1161430gKT.LIZ.NS().LIZIZ("ssm_first_on_screen_start");
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getOrCreateLynxKitView initTime = ");
        sbLIZ.append(jCurrentTimeMillis);
        LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
        LJIIZILJ(c679540Ql6);
        if (c1537720q7O != null) {
            Function1<? super C1537720q7O, Unit> function1 = c679540Ql6.LJI;
            if (function1 != null) {
                function1.invoke(c1537720q7O);
            }
            LIZLLL(c679540Ql6, c1537720q7O);
            LJJIJ(c679540Ql6, c1537720q7O);
            c1537720q7O.LJJIJIIJI(C1697810uHb.LJIILJJIL("isPreCreate", "isPreLayout", "isFirstScreen", "isPreRender"));
            c1537720q7O.LJJIL(Boolean.TRUE, "isReuse");
            c1537720q7O.LJJIL(Long.valueOf(jCurrentTimeMillis), "initTime");
            c1537720q7O.LJJIL(EnumC620100OTw.UPDATE_DATA, "updateType");
            LIZJ(c679540Ql6, c1537720q7O);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getOrCreateLynxKitView input liteLynxKitView not null, liteLynxKitView: ");
            sbLIZ2.append(c1537720q7O);
            sbLIZ2.append(", configuration: ");
            sbLIZ2.append(c679540Ql6);
            sbLIZ2.append(", lynxdata: ");
            LJ();
            sbLIZ2.append("");
            LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
            this.LJJJI.LIZIZ++;
            return c1537720q7O;
        }
        String str = c679540Ql6.LJIJJLI;
        if (str != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            InterfaceC1105930esx interfaceC1105930esx = (InterfaceC1105930esx) C1537060q6K.LIZLLL(this.LIZ, str, this.LIZLLL, null, null);
            if (interfaceC1105930esx instanceof C1537720q7O) {
                C1537720q7O c1537720q7O2 = (C1537720q7O) interfaceC1105930esx;
                Function1<? super C1537720q7O, Unit> function12 = c679540Ql6.LJI;
                if (function12 != null) {
                    function12.invoke(c1537720q7O2);
                }
                LIZLLL(c679540Ql6, c1537720q7O2);
                LJJIJ(c679540Ql6, c1537720q7O2);
                c1537720q7O2.LJJIJIIJI(C1697810uHb.LJIILJJIL("isPreCreate", "isPreLayout", "isFirstScreen", "isPreRender"));
                c1537720q7O2.LJJIL(Boolean.TRUE, "isPreRender");
                c1537720q7O2.LJJIL(Long.valueOf(jCurrentTimeMillis), "initTime");
                c1537720q7O2.LJJIL(EnumC620100OTw.UPDATE_DATA, "updateType");
                LIZJ(c679540Ql6, c1537720q7O2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("getOrCreateLynxKitView fetch from pre render, got liteLynxKitView: ");
                sbLIZ3.append(c1537720q7O2);
                sbLIZ3.append(", configuration: ");
                sbLIZ3.append(c679540Ql6);
                sbLIZ3.append(", lynxdata: ");
                LJ();
                sbLIZ3.append("");
                LJIJJLI(C2188811AlT.LIZIZ(sbLIZ3));
                this.LJJJI.LIZIZ++;
                return c1537720q7O2;
            }
        }
        String strLIZ = C621700Oa0.LIZ(c679540Ql6);
        Pair<C1537720q7O, Boolean> pairLJJIIZI = LJJIIZI(c679540Ql6);
        C1537720q7O first = pairLJJIIZI.getFirst();
        if (first != null) {
            Function1<? super C1537720q7O, Unit> function13 = c679540Ql6.LJI;
            if (function13 != null) {
                function13.invoke(first);
            }
            LIZLLL(c679540Ql6, first);
            if (pairLJJIIZI.getSecond().booleanValue()) {
                LJJIJ(c679540Ql6, first);
            }
            first.LJJIL(Boolean.TRUE, "isPreLayout");
            first.LJJIJIIJI(C1697810uHb.LJIILJJIL("isPreCreate", "isReuse", "isFirstScreen", "isPreRender"));
            first.LJJIL(Long.valueOf(jCurrentTimeMillis), "initTime");
            first.LJJIL(EnumC620100OTw.UPDATE_DATA, "updateType");
            LIZJ(c679540Ql6, first);
            this.LJJJI.LIZJ++;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("getOrCreateLynxKitView fetch from prelayout, got liteLynxKitView: ");
            sbLIZ4.append(pairLJJIIZI.getFirst());
            sbLIZ4.append(", configuration: ");
            sbLIZ4.append(c679540Ql6);
            sbLIZ4.append(", lynxdata: ");
            LJ();
            sbLIZ4.append("");
            LJIJJLI(C2188811AlT.LIZIZ(sbLIZ4));
            return first;
        }
        if (this.LIZIZ && (copyOnWriteArrayList = this.LJIJ.get(strLIZ)) != null) {
            Iterator<C1537720q7O> it2 = copyOnWriteArrayList.iterator();
            while (true) {
                boolean z = false;
                if (it2 != null && it2.hasNext()) {
                    next = it2.next();
                    if (next.getHasDestroyed()) {
                        CopyOnWriteArrayList<C1537720q7O> copyOnWriteArrayList2 = this.LJIJ.get(strLIZ);
                        if (copyOnWriteArrayList2 != null) {
                            copyOnWriteArrayList2.remove(next);
                        }
                        LJIJJ();
                    } else {
                        ViewParent parent = next.getParent();
                        Integer num = (Integer) ((LinkedHashMap) this.LJJIIJZLJL).get(strLIZ);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        if (LJIIJJI(c679540Ql6) >= iIntValue) {
                            z = true;
                        }
                        if (parent != null) {
                            if (z && (!this.LJIIJJI || parent.getParent() == null)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            C1540240qBS.LIZ.getClass();
            C1540240qBS.LJII(next);
            if (Intrinsics.LJFF(next.getTag(R.id.vs7), Boolean.FALSE)) {
                Function1<? super C1537720q7O, Unit> function14 = c679540Ql6.LJI;
                if (function14 != null) {
                    function14.invoke(next);
                }
                LIZLLL(c679540Ql6, next);
                next.load();
                LJJIJ(c679540Ql6, next);
                Boolean bool = Boolean.TRUE;
                next.LJJIL(bool, "isPreCreate");
                next.LJJIJIIJI(C1697810uHb.LJIILJJIL("isPreLayout", "isReuse", "isFirstScreen", "isPreRender"));
                next.LJJIL(Long.valueOf(jCurrentTimeMillis), "initTime");
                next.LJJIL(EnumC620100OTw.LOAD_URL, "updateType");
                LIZJ(c679540Ql6, next);
                next.setTag(R.id.vs7, bool);
                this.LJJJI.LJ++;
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("getOrCreateLynxKitView fetch from precreate, fetch liteLynxKitView: ");
                sbLIZ5.append(next);
                sbLIZ5.append(", configuration: ");
                sbLIZ5.append(c679540Ql6);
                sbLIZ5.append(", lynxdata: ");
                LJ();
                sbLIZ5.append("");
                LJIJJLI(C2188811AlT.LIZIZ(sbLIZ5));
            } else {
                Function1<? super C1537720q7O, Unit> function15 = c679540Ql6.LJI;
                if (function15 != null) {
                    function15.invoke(next);
                }
                LIZLLL(c679540Ql6, next);
                LJJIJ(c679540Ql6, next);
                next.LJJIL(Boolean.TRUE, "isReuse");
                next.LJJIJIIJI(C1697810uHb.LJIILJJIL("isPreLayout", "isPreCreate", "isFirstScreen", "isPreRender"));
                next.LJJIL(Long.valueOf(jCurrentTimeMillis), "initTime");
                next.LJJIL(EnumC620100OTw.UPDATE_DATA, "updateType");
                LIZJ(c679540Ql6, next);
                this.LJJJI.LIZIZ++;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("getOrCreateLynxKitView fetch from normal offScreenLynxViewMap, fetch liteLynxKitView: ");
                sbLIZ6.append(next);
                sbLIZ6.append(", configuration: ");
                sbLIZ6.append(c679540Ql6);
                sbLIZ6.append(", lynxdata: ");
                LJ();
                sbLIZ6.append("");
                LJIJJLI(C2188811AlT.LIZIZ(sbLIZ6));
            }
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("getOrCreateLynxKitView enableCustomCache fetch success, next: ");
            sbLIZ7.append(next);
            sbLIZ7.append('}');
            LJIJJLI(C2188811AlT.LIZIZ(sbLIZ7));
            LJIJJ();
            return next;
        }
        return LJFF(c679540Ql6, jCurrentTimeMillis);
    }

    public final void LJIILLIIL(List<C679540Ql6> list, Function1<? super Runnable, Unit> function1) {
        ARunnableS78S0200000_9 aRunnableS78S0200000_9 = new ARunnableS78S0200000_9(list, this, 96);
        if (function1 != null) {
            function1.invoke(aRunnableS78S0200000_9);
        } else {
            aRunnableS78S0200000_9.run();
        }
    }

    public final void LJIJ(List<C679540Ql6> list, final InterfaceC1168240gVS interfaceC1168240gVS) {
        Object c098200Yq;
        int iIntValue;
        Integer num;
        C1161430gKT c1161430gKT = this.LJIILJJIL;
        if (c1161430gKT != null) {
            c1161430gKT.LIZ.NS().LIZIZ("ssm_pre_layout_start");
        }
        final int size = list.size();
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (final C679540Ql6 c679540Ql6 : list) {
            final C1537720q7O c1537720q7OLJI = LJI(c679540Ql6);
            final String strLIZ = C621700Oa0.LIZ(c679540Ql6);
            final String str = c679540Ql6.LJIIJJI;
            if (str == null) {
                try {
                    CopyOnWriteArrayList<Integer> copyOnWriteArrayList = this.LJJIIZI.get(strLIZ);
                    if (copyOnWriteArrayList != null && (num = (Integer) C13LP.LJJLIIIJL(copyOnWriteArrayList)) != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c098200Yq = Integer.valueOf(iIntValue);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = 0;
                }
                int iIntValue2 = ((Number) c098200Yq).intValue() + 1;
                if (this.LJJIIZI.get(strLIZ) != null) {
                    CopyOnWriteArrayList<Integer> copyOnWriteArrayList2 = this.LJJIIZI.get(strLIZ);
                    if (copyOnWriteArrayList2 != null) {
                        copyOnWriteArrayList2.add(Integer.valueOf(iIntValue2));
                    }
                } else {
                    ConcurrentHashMap<String, CopyOnWriteArrayList<Integer>> concurrentHashMap2 = this.LJJIIZI;
                    CopyOnWriteArrayList<Integer> copyOnWriteArrayList3 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList3.add(Integer.valueOf(iIntValue2));
                    concurrentHashMap2.put(strLIZ, copyOnWriteArrayList3);
                }
                str = strLIZ + '#' + iIntValue2;
            }
            this.LJJJI.LJFF++;
            LJJJJJ.execute(new Runnable() { // from class: X.0gVQ
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SparkMultiViewsManager@2f75.preLayoutWithConfigurations$1");
                    try {
                        C2250481D6o c2250481D6o = (C2250481D6o) this.LL.LJIJJ.getValue();
                        String str2 = str;
                        C1537720q7O c1537720q7O = c1537720q7OLJI;
                        final C1540620qC4 c1540620qC4 = this.LL;
                        final int i = size;
                        final InterfaceC1168240gVS interfaceC1168240gVS2 = interfaceC1168240gVS;
                        final ConcurrentHashMap<String, C1168230gVR> concurrentHashMap3 = concurrentHashMap;
                        final C679540Ql6 c679540Ql62 = c679540Ql6;
                        final String str3 = strLIZ;
                        c2250481D6o.LIZIZ(str2, c1537720q7O, true, new InterfaceC2250511D6r<C1537720q7O>() { // from class: X.0gVP
                            @Override // X.InterfaceC2250511D6r
                            public final void LIZ(C0Q8K c0q8k, LynxError lynxError) {
                                String strLIZJ;
                                C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("onPreLayoutError, error = ");
                                if (lynxError != null) {
                                    strLIZJ = lynxError.LIZJ();
                                } else {
                                    strLIZJ = null;
                                }
                                sbLIZ.append(strLIZJ);
                                C679810QlX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                                C1540620qC4 c1540620qC42 = c1540620qC4;
                                int i2 = i;
                                InterfaceC1168240gVS interfaceC1168240gVS3 = interfaceC1168240gVS2;
                                ConcurrentHashMap<String, C1168230gVR> concurrentHashMap4 = concurrentHashMap3;
                                C1168230gVR c1168230gVR = new C1168230gVR();
                                c1168230gVR.LIZ = str3;
                                c1540620qC42.getClass();
                                String str4 = c1168230gVR.LIZ;
                                if (str4 != null) {
                                    concurrentHashMap4.put(str4, c1168230gVR);
                                    if (concurrentHashMap4.size() == i2 && interfaceC1168240gVS3 != null) {
                                        interfaceC1168240gVS3.LIZ();
                                    }
                                }
                            }

                            @Override // X.InterfaceC2250511D6r
                            public final void LIZIZ(InterfaceC647710Par interfaceC647710Par, String str4) {
                                C1537720q7O c1537720q7O2 = (C1537720q7O) interfaceC647710Par;
                                if (c1537720q7O2 != null) {
                                    Integer numValueOf = Integer.valueOf(c1537720q7O2.getMeasuredHeight());
                                    C679540Ql6 c679540Ql63 = c679540Ql62;
                                    C1540620qC4 c1540620qC42 = c1540620qC4;
                                    String str5 = str3;
                                    int iIntValue3 = numValueOf.intValue();
                                    String str6 = c679540Ql63.LJIIJJI;
                                    if (str6 != null) {
                                        c1540620qC42.LJIJJLI.put(str6, Integer.valueOf(iIntValue3));
                                    }
                                    c1540620qC42.LJIL.put(str5, Integer.valueOf(iIntValue3));
                                }
                                C1540620qC4 c1540620qC43 = c1540620qC4;
                                int i2 = i;
                                InterfaceC1168240gVS interfaceC1168240gVS3 = interfaceC1168240gVS2;
                                ConcurrentHashMap<String, C1168230gVR> concurrentHashMap4 = concurrentHashMap3;
                                C1168230gVR c1168230gVR = new C1168230gVR();
                                c1168230gVR.LIZ = str3;
                                c1540620qC43.getClass();
                                String str7 = c1168230gVR.LIZ;
                                if (str7 != null) {
                                    concurrentHashMap4.put(str7, c1168230gVR);
                                    if (concurrentHashMap4.size() == i2 && interfaceC1168240gVS3 != null) {
                                        interfaceC1168240gVS3.LIZ();
                                    }
                                }
                                if (c1537720q7O2 != null) {
                                    c1537720q7O2.LJJIL(Boolean.TRUE, "isPreLayout");
                                }
                                C1161430gKT c1161430gKT2 = c1540620qC4.LJIILJJIL;
                                if (c1161430gKT2 != null) {
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    c1161430gKT2.LIZ.NS().LIZIZ.put("ssm_pre_layout_end", new C1163170gNH(Long.valueOf(jCurrentTimeMillis)));
                                    new C1043010dFT();
                                    C1043010dFT.LIZIZ("RavenTracing", new C0T8K(jCurrentTimeMillis));
                                }
                                C01GW<C1537720q7O> c01gw = C1540620qC4.LJJJJIZL;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("preLayout onLayoutFinish, identify = ");
                                sbLIZ.append(str4);
                                C679810QlX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                            }
                        });
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SparkMultiViewsManager@2f75.preLayoutWithConfigurations$1");
                }
            });
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preLayoutWithConfigurations preLayoutId: ");
            sbLIZ.append(str);
            sbLIZ.append(", liteLynxKitView: ");
            sbLIZ.append(c1537720q7OLJI);
            sbLIZ.append(", configuration: ");
            sbLIZ.append(c679540Ql6);
            sbLIZ.append(", lynxdata: ");
            LJ();
            sbLIZ.append("");
            LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIJI(Integer num, List list) {
        int size;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        if (C1537060q6K.LJI(this.LIZLLL) == null) {
            C1097680efe c1097680efe = new C1097680efe();
            c1097680efe.LIZ = this.LIZLLL;
            if (num != null) {
                size = num.intValue();
            } else {
                size = list.size();
            }
            c1097680efe.LJIJ = size;
            c1097680efe.LJIIIIZZ = AnonymousClass0208.get$arr$(54);
            c1097680efe.LJIJJ = new AwS659S0100000_10(this, 11);
            C1537060q6K.LJIIL(c1097680efe, Boolean.FALSE);
        }
        list.size();
        new ConcurrentHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LJJJJJ.execute(new ARunnableS78S0200000_9((C679540Ql6) it2.next(), this, 98));
        }
    }

    public final void LJJIII(String str, JSONObject jSONObject) {
        Iterator<Map.Entry<String, CopyOnWriteArrayList<C1537720q7O>>> it2 = this.LJIIZILJ.entrySet().iterator();
        while (it2.hasNext()) {
            for (C1537720q7O c1537720q7O : it2.next().getValue()) {
                if (c1537720q7O != null) {
                    LJJIIJZLJL(c1537720q7O, str, jSONObject);
                }
            }
        }
        C1537720q7O c1537720q7O2 = this.LJJIJIIJI;
        if (c1537720q7O2 != null) {
            LJJIIJZLJL(c1537720q7O2, str, jSONObject);
        }
        C1540540qBw c1540540qBw = this.LJJIJLIJ;
        if (c1540540qBw != null) {
            if (c1540540qBw.LJIIIIZZ.get()) {
                c1540540qBw.LIZ(str, jSONObject);
                return;
            }
            String str2 = c1540540qBw.LIZ.containerId;
            if (this.LJJIJIL.get(str2) == null) {
                this.LJJIJIL.put(str2, new CopyOnWriteArrayList<>());
            }
            CopyOnWriteArrayList<Pair<String, Object>> copyOnWriteArrayList = this.LJJIJIL.get(str2);
            if (copyOnWriteArrayList == null) {
                return;
            }
            copyOnWriteArrayList.add(new Pair<>(str, jSONObject));
        }
    }

    public final void LJJIJ(C679540Ql6 c679540Ql6, final C1537720q7O c1537720q7O) {
        SparkContext sparkContext;
        boolean z;
        C1537910q7h c1537910q7h;
        TemplateData templateData = c679540Ql6.LJIIL;
        C1537480q70 hybridContext = c1537720q7O.getHybridContext();
        C1537480q70 c1537480q70 = null;
        if (hybridContext instanceof SparkContext) {
            sparkContext = (SparkContext) hybridContext;
        } else {
            sparkContext = null;
        }
        if (sparkContext != null && sparkContext.LJJJJI(c679540Ql6.LJIJJLI, sparkContext.LJIJI())) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = true ^ z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, ? extends Object> map = c679540Ql6.LJIILL;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (z2) {
            if (sparkContext != null) {
                String str = c679540Ql6.LJIJJLI;
                if (str != null) {
                    InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
                    if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                        c1537910q7h.LJJIIJ = C1545470qJt.LIZ(str, sparkContext.LJJJ(), sparkContext.bundle, sparkContext.containerId);
                    }
                    sparkContext.LJJIIZ(str);
                }
                c1537480q70 = sparkContext;
            }
            c1537720q7O.LJIILIIL(c1537480q70);
        }
        LJJIIJ(c1537720q7O);
        if (this.LJ && !Intrinsics.LJFF(c679540Ql6.LJIILJJIL, Boolean.TRUE)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateDataAndGlobalProps kitView: ");
            sbLIZ.append(c1537720q7O);
            sbLIZ.append(", reloadTemplate lynxdata: ");
            LJ();
            sbLIZ.append("");
            LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
            if (this.LJI && !c1537720q7O.LIZIZ()) {
                C086F c086f = C086F.LIZ;
                Runnable runnable = new Runnable() { // from class: X.0q8f
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LiteLynxKitView@73dd.triggerLoadingIfNeed$1");
                        try {
                            c1537720q7O.setStatus(EnumC1538460q8a.LOADING);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LiteLynxKitView@73dd.triggerLoadingIfNeed$1");
                    }
                };
                c086f.getClass();
                C086F.LJII(runnable);
            }
            TemplateData templateData2 = new TemplateData();
            templateData2.LJIJJ(linkedHashMap);
            c1537720q7O.reloadTemplate(templateData, templateData2);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateDataAndGlobalProps kitView: ");
        sbLIZ2.append(c1537720q7O);
        sbLIZ2.append(", updateMetaData lynxdata: ");
        LJ();
        sbLIZ2.append("");
        LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
        C1300040jw2 c1300040jw2 = new C1300040jw2();
        c1300040jw2.LIZ = templateData;
        TemplateData templateData3 = new TemplateData();
        templateData3.LJIJJ(linkedHashMap);
        c1300040jw2.LIZIZ = templateData3;
        c1537720q7O.updateMetaData(new C1300050jw3(c1300040jw2.LIZ, templateData3));
    }

    public final int LJIIL(Integer num, String str, String str2) {
        Integer num2;
        if (str != null && C01CL.LIZLLL(this.LJIJJLI.get(str)) > 0) {
            return C01CL.LIZLLL(this.LJIJJLI.get(str));
        }
        if (C01CL.LIZLLL(num) > 0) {
            return C01CL.LIZLLL(num);
        }
        C678350QjB c678350QjB = this.LJJ;
        Integer num3 = null;
        if (c678350QjB != null) {
            num2 = c678350QjB.LJIILLIIL;
        } else {
            num2 = null;
        }
        if (C01CL.LIZLLL(num2) > 0) {
            C678350QjB c678350QjB2 = this.LJJ;
            if (c678350QjB2 != null) {
                num3 = c678350QjB2.LJIILLIIL;
            }
            return C01CL.LIZLLL(num3);
        }
        if (str2 != null && C01CL.LIZLLL(this.LJIL.get(str2)) > 0) {
            return C01CL.LIZLLL(this.LJIL.get(str2));
        }
        return 0;
    }

    public final void LJIL(TemplateData templateData, String str, boolean z) {
        InterfaceC1538960q9O nativeStorageVisitor;
        InterfaceC1870830ymf interfaceC1870830ymfLIZ;
        if (z) {
            C1540640qC6 c1540640qC6 = (C1540640qC6) this.LJJIJ.getValue();
            c1540640qC6.getClass();
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
            if (c1538050q7v != null && (nativeStorageVisitor = c1538050q7v.getNativeStorageVisitor()) != null && (interfaceC1870830ymfLIZ = nativeStorageVisitor.LIZ(c1540640qC6.LL)) != null) {
                interfaceC1870830ymfLIZ.LIZIZ(C1058250de3.LIZLLL(templateData.LJIJI()), c1540640qC6.LLILLJJLI, str);
                return;
            }
            return;
        }
        C1540680qCA c1540680qCA = (C1540680qCA) this.LJJIIZ.getValue();
        synchronized (c1540680qCA) {
            LynxBackgroundRuntime lynxBackgroundRuntimeLIZIZ = c1540680qCA.LIZ.LIZIZ();
            if (lynxBackgroundRuntimeLIZIZ != null) {
                lynxBackgroundRuntimeLIZIZ.LJFF(str, templateData);
                return;
            }
            C1537720q7O c1537720q7OLIZ = c1540680qCA.LIZ.LIZ();
            if (c1537720q7OLIZ != null) {
                c1537720q7OLIZ.setSessionStorageItem(str, templateData);
            } else {
                c1540680qCA.LIZIZ.put(str, templateData);
            }
        }
    }

    public final void LJJIIJZLJL(C1537720q7O c1537720q7O, String str, JSONObject jSONObject) {
        if (this.LJJIJIIJIL.contains(c1537720q7O)) {
            c1537720q7O.LIZ(str, jSONObject);
            return;
        }
        String str2 = c1537720q7O.getHybridContext().containerId;
        if (this.LJJIJIL.get(str2) == null) {
            this.LJJIJIL.put(str2, new CopyOnWriteArrayList<>());
        }
        CopyOnWriteArrayList<Pair<String, Object>> copyOnWriteArrayList = this.LJJIJIL.get(str2);
        if (copyOnWriteArrayList == null) {
            return;
        }
        copyOnWriteArrayList.add(new Pair<>(str, jSONObject));
    }

    public final void LJJIIZ(List<String> list, InterfaceC1540710qCD interfaceC1540710qCD, String str) {
        int i;
        int iIntValue;
        int iIntValue2;
        Iterator<C1540660qC8> it2 = this.LJJIZ.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().LIZ, str)) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        for (String str2 : list) {
            ConcurrentHashMap<String, Integer> concurrentHashMap = this.LJJJIL;
            Integer num = concurrentHashMap.get(str2);
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 0;
            }
            concurrentHashMap.put(str2, Integer.valueOf(iIntValue2 + 1));
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (String str3 : list) {
            Integer num2 = this.LJJJIL.get(str3);
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = 1;
            }
            linkedHashMap.put(str3, new C1540670qC9(iIntValue, 6));
        }
        C1540660qC8 c1540660qC8 = new C1540660qC8(str, new LinkedHashMap(linkedHashMap), interfaceC1540710qCD, 56);
        for (Map.Entry<String, C1540670qC9> entry : c1540660qC8.LIZIZ.entrySet()) {
            if (!this.LJJJ.containsKey(entry.getKey())) {
                this.LJJJ.put(entry.getKey(), new C1540670qC9(0, 5));
            }
            C1540670qC9 value = entry.getValue();
            C1540670qC9 c1540670qC9 = this.LJJJ.get(entry.getKey());
            if (c1540670qC9 != null) {
                i = c1540670qC9.LIZIZ;
            } else {
                i = 0;
            }
            value.LIZIZ = i;
        }
        this.LJJIZ.add(c1540660qC8);
        this.LJJJI.LIZ = this.LJJJ.size();
    }

    public final void LJJ(C1537720q7O c1537720q7O, String str, Long l, String str2) throws JSONException {
        long jCurrentTimeMillis;
        Object objLJIJI;
        Long l2;
        long j;
        Object objLJIJI2;
        String str3;
        String strLJIJI;
        Object objLJIJI3;
        long j2;
        boolean zLJFF;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        EnumC1538160q86 templateFrom;
        Object obj5;
        Long l3;
        long jCurrentTimeMillis2;
        Long l4;
        long jCurrentTimeMillis3;
        C1537480q70 hybridContext;
        C1537480q70 hybridContext2;
        long jCurrentTimeMillis4;
        long jCurrentTimeMillis5;
        int i;
        if (!this.LJJI && str != null) {
            C1540670qC9 c1540670qC9 = this.LJJJ.get(str);
            if (c1540670qC9 != null) {
                C1540670qC9 c1540670qC92 = this.LJJJ.get(str);
                if (c1540670qC92 != null) {
                    i = c1540670qC92.LIZIZ;
                } else {
                    i = 0;
                }
                c1540670qC9.LIZIZ = i + 1;
            }
            for (C1540660qC8 c1540660qC8 : this.LJJIZ) {
                int i2 = 0;
                for (Map.Entry<String, C1540670qC9> entry : c1540660qC8.LIZIZ.entrySet()) {
                    if (Intrinsics.LJFF(entry.getKey(), str)) {
                        entry.getValue().LIZIZ++;
                        long j3 = c1540660qC8.LIZLLL;
                        if (l != null) {
                            jCurrentTimeMillis5 = l.longValue();
                        } else {
                            jCurrentTimeMillis5 = System.currentTimeMillis();
                        }
                        c1540660qC8.LIZLLL = Math.max(j3, jCurrentTimeMillis5);
                    }
                    if (entry.getValue().LIZIZ >= entry.getValue().LIZ) {
                        i2++;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("check status, chunkName = ");
                    sbLIZ.append(c1540660qC8.LIZ);
                    sbLIZ.append(", itemId = ");
                    sbLIZ.append(entry.getKey());
                    sbLIZ.append(entry.getValue());
                    LJIJJLI(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (i2 == c1540660qC8.LIZIZ.size() && !c1540660qC8.LJ && c1540660qC8.LIZIZ.containsKey(str)) {
                    C1161430gKT c1161430gKT = this.LJIILJJIL;
                    if (c1161430gKT != null) {
                        c1161430gKT.LIZ.NS().LIZ(c1540660qC8.LIZLLL, "ssm_first_screen_end");
                    }
                    LIZ("onPageGroupLoadFinish");
                    InterfaceC1540710qCD interfaceC1540710qCD = c1540660qC8.LIZJ;
                    if (interfaceC1540710qCD != null) {
                        interfaceC1540710qCD.RJ(c1540660qC8.LIZLLL);
                    }
                    LJIIIZ();
                    c1540660qC8.LJ = true;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onPageGroupLoadFinish, chunkName = ");
                    sbLIZ2.append(c1540660qC8.LIZ);
                    sbLIZ2.append(" ,firstScreenMaxDrawEnd: ");
                    sbLIZ2.append(c1540660qC8.LIZLLL);
                    LJIJJLI(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            if (!this.LJJJJ.containsKey(str)) {
                ConcurrentHashMap<String, Long> concurrentHashMap = this.LJJJJ;
                if (l != null) {
                    jCurrentTimeMillis = l.longValue();
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                concurrentHashMap.put(str, Long.valueOf(jCurrentTimeMillis));
                StringBuilder sb = new StringBuilder("smm_timing_info report, firstScreenDuration = ");
                Object objLJIJI4 = null;
                if (c1537720q7O != null) {
                    objLJIJI = c1537720q7O.LJIJI("initTime");
                } else {
                    objLJIJI = null;
                }
                if (objLJIJI instanceof Long) {
                    l2 = (Long) objLJIJI;
                } else {
                    l2 = null;
                }
                long j4 = -1;
                if (l2 != null) {
                    long jLongValue = l2.longValue();
                    if (l != null) {
                        jCurrentTimeMillis4 = l.longValue();
                    } else {
                        jCurrentTimeMillis4 = System.currentTimeMillis();
                    }
                    j = jCurrentTimeMillis4 - jLongValue;
                } else {
                    j = -1;
                }
                sb.append(j);
                sb.append(",  itemId = ");
                sb.append(str);
                sb.append(", drawEnd = ");
                sb.append(l);
                sb.append(", startTime = ");
                if (c1537720q7O != null) {
                    objLJIJI2 = c1537720q7O.LJIJI("initTime");
                } else {
                    objLJIJI2 = null;
                }
                if (!(objLJIJI2 instanceof Long)) {
                    objLJIJI2 = null;
                }
                sb.append(objLJIJI2);
                LJIJJLI(sb.toString());
                if (c1537720q7O != null && (hybridContext2 = c1537720q7O.getHybridContext()) != null) {
                    str3 = hybridContext2.containerId;
                } else {
                    str3 = null;
                }
                C1520360pfO c1520360pfO = new C1520360pfO("smm_timing_info");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("biz", this.LIZJ);
                if (c1537720q7O != null && (hybridContext = c1537720q7O.getHybridContext()) != null) {
                    strLJIJI = hybridContext.LJIJI();
                } else {
                    strLJIJI = null;
                }
                jSONObject.put("schema", strLJIJI);
                jSONObject.put("pageId", this.LJIILL);
                if (c1537720q7O != null) {
                    objLJIJI3 = c1537720q7O.LJIJI("initTime");
                } else {
                    objLJIJI3 = null;
                }
                if ((objLJIJI3 instanceof Long) && (l4 = (Long) objLJIJI3) != null) {
                    long jLongValue2 = l4.longValue();
                    if (l != null) {
                        jCurrentTimeMillis3 = l.longValue();
                    } else {
                        jCurrentTimeMillis3 = System.currentTimeMillis();
                    }
                    j2 = jCurrentTimeMillis3 - jLongValue2;
                } else {
                    j2 = -1;
                }
                jSONObject.put("firstScreenDuration", j2);
                if (c1537720q7O != null) {
                    zLJFF = Intrinsics.LJFF(c1537720q7O.LJIJI("isFirstScreen"), Boolean.TRUE);
                } else {
                    zLJFF = false;
                }
                String str4 = "1";
                if (zLJFF) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("isFirstScreen", obj);
                if (c1537720q7O != null && Intrinsics.LJFF(c1537720q7O.LJIJI("isPreCreate"), Boolean.TRUE)) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("isPreCreate", obj2);
                if (c1537720q7O != null && Intrinsics.LJFF(c1537720q7O.LJIJI("isPreRender"), Boolean.TRUE)) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("isPreRender", obj3);
                if (c1537720q7O != null && Intrinsics.LJFF(c1537720q7O.LJIJI("isPreLayout"), Boolean.TRUE)) {
                    obj4 = "1";
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("isPreLayout", obj4);
                if (c1537720q7O != null) {
                    templateFrom = c1537720q7O.getTemplateFrom();
                } else {
                    templateFrom = null;
                }
                if (templateFrom == EnumC1538160q86.TEMPLATE_BUNDLE_PRE_DECODE) {
                    obj5 = "1";
                } else {
                    obj5 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("isPreDecode", obj5);
                if (c1537720q7O == null || !Intrinsics.LJFF(c1537720q7O.LJIJI("isReuse"), Boolean.TRUE)) {
                    str4 = CardStruct.IStatusCode.DEFAULT;
                }
                jSONObject.put("isReuse", str4);
                jSONObject.put("loadStatus", str2);
                if (c1537720q7O != null) {
                    objLJIJI4 = c1537720q7O.LJIJI("customInitTime");
                }
                if ((objLJIJI4 instanceof Long) && (l3 = (Long) objLJIJI4) != null) {
                    long jLongValue3 = l3.longValue();
                    if (l != null) {
                        jCurrentTimeMillis2 = l.longValue();
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                    }
                    j4 = jCurrentTimeMillis2 - jLongValue3;
                }
                jSONObject.put("firstScreenCustomDuration", j4);
                c1520360pfO.LIZLLL = jSONObject;
                c1520360pfO.LIZIZ(0);
                c1520360pfO.LJIIJJI = EnumC993170bx5.Both;
                C1520080pew.LIZ(str3, c1520360pfO.LIZ());
            }
        }
    }

    public C1540620qC4(Context context, boolean z, String str, String str2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, ConcurrentHashMap concurrentHashMap, int i) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = z2;
        boolean z12 = z4;
        boolean z13 = z3;
        boolean z14 = z6;
        boolean z15 = z5;
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        if ((i & 16) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        z11 = (i & 32) != 0 ? true : z11;
        z13 = (i & 64) != 0 ? false : z13;
        z12 = (i & 128) != 0 ? true : z12;
        if ((i & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        z15 = (i & 512) != 0 ? true : z15;
        z14 = (i & 1024) != 0 ? false : z14;
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z16 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z7 : false;
        concurrentHashMap2 = (i & 8192) != 0 ? null : concurrentHashMap2;
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = z8;
        this.LJFF = z11;
        this.LJI = z13;
        this.LJII = z12;
        this.LJIIIIZZ = z9;
        this.LJIIIZ = z15;
        this.LJIIJ = z14;
        this.LJIIJJI = z10;
        this.LJIIL = z16;
        this.LJIILIIL = concurrentHashMap2;
        this.LJIILL = UUID.randomUUID().toString();
        this.LJIILLIIL = new C0OV2();
        this.LJIIZILJ = new ConcurrentHashMap<>();
        this.LJIJ = new ConcurrentHashMap<>();
        this.LJIJI = new ConcurrentHashMap<>();
        this.LJIJJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 199));
        this.LJIJJLI = new ConcurrentHashMap<>();
        this.LJIL = new ConcurrentHashMap<>();
        this.LJJIFFI = new ConcurrentHashMap<>();
        this.LJJII = new ConcurrentHashMap<>();
        this.LJJIII = new ConcurrentLinkedQueue<>();
        this.LJJIIJ = true;
        this.LJJIIJZLJL = new LinkedHashMap();
        this.LJJIIZ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 197));
        this.LJJIIZI = new ConcurrentHashMap<>();
        this.LJJIJ = C452501pT.LIZIZ(new AwS567S0100000_23(this, 198));
        this.LJJIJIIJIL = new CopyOnWriteArraySet<>();
        this.LJJIJIL = new ConcurrentHashMap<>();
        this.LJJIJL = new CopyOnWriteArrayList<>();
        this.LJJIZ = new CopyOnWriteArrayList<>();
        this.LJJJ = new ConcurrentHashMap<>();
        this.LJJJI = new C620250OUl();
        this.LJJJIL = new ConcurrentHashMap<>();
        this.LJJJJ = new ConcurrentHashMap<>();
        this.LJJJJI = new ConcurrentHashMap<>();
    }
}
