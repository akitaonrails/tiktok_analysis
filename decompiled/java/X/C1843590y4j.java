package X;

import X.C0TIW;
import X.C1022620cia;
import X.C1617880sCg;
import X.C1720106oR;
import X.C1807670x8n;
import X.C1808090x9T;
import X.C1808100x9U;
import X.C1843570y4h;
import X.C1949507kL;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C786410Ut5;
import X.EnumC055600Ig;
import X.EnumC1843560y4g;
import X.InterfaceC1486840onK;
import X.InterfaceC1843580y4i;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.AdFastScrollServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model.AdFastScrollOutput;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.model.AdFastScrollPredictResult;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pitaya.api.PTYTaskResultCallback;
import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.bean.PTYError;
import com.bytedance.pitaya.api.bean.PTYPackageInfo;
import com.bytedance.pitaya.api.bean.PTYTaskConfig;
import com.bytedance.pitaya.api.bean.PTYTaskData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0y4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.AdFastScrollServiceImpl$predictIfNeed$1", f = "AdFastScrollServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1843590y4j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AdFastScrollServiceImpl LL;
    public final /* synthetic */ List<Aweme> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ EnumC1843600y4k LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1843590y4j(AdFastScrollServiceImpl adFastScrollServiceImpl, List<? extends Aweme> list, int i, EnumC1843600y4k enumC1843600y4k, InterfaceC1364105Vn<? super C1843590y4j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = adFastScrollServiceImpl;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = enumC1843600y4k;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1843590y4j(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        JSONObject jSONObjectLJI;
        String aid;
        boolean zContainsKey;
        C1C7U.LIZ("AdFastScrollServiceImpl@a141.predictIfNeed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AdFastScrollServiceImpl adFastScrollServiceImpl = this.LL;
        List<Aweme> list = this.LLILLJJLI;
        int i = this.LLILLL;
        adFastScrollServiceImpl.getClass();
        LinkedHashMap<Integer, Aweme> linkedHashMap = new LinkedHashMap<>();
        if (adFastScrollServiceImpl.LIZ != null) {
            int i2 = i + 1;
            int iMin = Math.min(list.size() - 1, ((Number) adFastScrollServiceImpl.LJ.getValue()).intValue() + i);
            StringBuilder sb = new StringBuilder();
            if (i2 <= iMin) {
                while (true) {
                    Aweme aweme = (Aweme) ListProtector.get(list, i2);
                    if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("(index=");
                        sbLIZ.append(i2);
                        sbLIZ.append(", isAd=");
                        sbLIZ.append(aweme.isAd());
                        sbLIZ.append(", inCache=");
                        C1949507kL c1949507kL = adFastScrollServiceImpl.LJIIL;
                        c1949507kL.getClass();
                        if (aid != null && aid.length() != 0) {
                            zContainsKey = c1949507kL.LIZ.containsKey(aid);
                        } else {
                            zContainsKey = false;
                        }
                        sbLIZ.append(zContainsKey);
                        sbLIZ.append("),");
                        sb.append(C2188811AlT.LIZIZ(sbLIZ));
                        if (aweme.isAd()) {
                            C1949507kL c1949507kL2 = adFastScrollServiceImpl.LJIIL;
                            c1949507kL2.getClass();
                            if (aid == null || aid.length() == 0 || !c1949507kL2.LIZ.containsKey(aid)) {
                                linkedHashMap.put(Integer.valueOf(i2), aweme);
                            }
                        }
                    }
                    if (i2 == iMin) {
                        break;
                    }
                    i2++;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[getPredictableAwemes] curPos=");
            sbLIZ2.append(i);
            sbLIZ2.append(", size=");
            sbLIZ2.append(linkedHashMap.size());
            sbLIZ2.append(", next=[");
            sbLIZ2.append((Object) sb);
            sbLIZ2.append(']');
            C1022620cia.LIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (linkedHashMap.isEmpty()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AdFastScrollServiceImpl@a141.predictIfNeed$1");
            return unit;
        }
        final AdFastScrollServiceImpl adFastScrollServiceImpl2 = this.LL;
        EnumC1843600y4k enumC1843600y4k = this.LLILZ;
        int i3 = this.LLILLL;
        final InterfaceC1843580y4i interfaceC1843580y4i = null;
        adFastScrollServiceImpl2.getClass();
        final ArrayList<Aweme> arrayList = new ArrayList<>(linkedHashMap.values());
        try {
            if (((Boolean) adFastScrollServiceImpl2.LJIIJJI.getValue()).booleanValue()) {
                jSONObjectLJI = adFastScrollServiceImpl2.LJII(linkedHashMap, i3, true);
            } else {
                jSONObjectLJI = adFastScrollServiceImpl2.LJI(arrayList, true);
            }
            if (jSONObjectLJI != null) {
                C0TIW.LIZ.getClass();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[sendTriggerEvent] source=");
                sbLIZ3.append(enumC1843600y4k.name());
                C1022620cia.LIZ("AdFastScrollEvent", C2188811AlT.LIZIZ(sbLIZ3));
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJFF("trigger_source", String.valueOf(enumC1843600y4k.ordinal()));
                C20684815ws.LJIILLIIL("ad_fast_slow_sliding_trigger", c2344009Gk.LIZ);
                if (adFastScrollServiceImpl2.LIZ != null) {
                    Set<Integer> setKeySet = linkedHashMap.keySet();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[sendTriggerIndexEvent] aheads=");
                    sbLIZ4.append(setKeySet);
                    sbLIZ4.append(", current=");
                    sbLIZ4.append(i3);
                    C1022620cia.LIZ("AdFastScrollEvent", C2188811AlT.LIZIZ(sbLIZ4));
                    Iterator<Integer> it2 = setKeySet.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = it2.next().intValue();
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        c2344009Gk2.LIZJ(iIntValue - i3, "ahead");
                        C20684815ws.LJIILLIIL("ad_fast_slow_sliding_trigger_index", c2344009Gk2.LIZ);
                    }
                }
                String str = (String) adFastScrollServiceImpl2.LJFF.getValue();
                if (str != null && !a0.LJJJIL(str)) {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[predictInternal] triggerSource=");
                    sbLIZ5.append(enumC1843600y4k.name());
                    sbLIZ5.append(", awemes=");
                    sbLIZ5.append(linkedHashMap.keySet());
                    sbLIZ5.append(", params=");
                    sbLIZ5.append(jSONObjectLJI);
                    C1022620cia.LIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ5));
                    PitayaCoreFactory.getCore(adFastScrollServiceImpl2.LIZIZ).runTask((String) adFastScrollServiceImpl2.LJFF.getValue(), new PTYTaskData(jSONObjectLJI), new PTYTaskConfig(false, null, -1.0f), new PTYTaskResultCallback(jCurrentTimeMillis, adFastScrollServiceImpl2, arrayList, interfaceC1843580y4i) { // from class: com.bytedance.ies.ugc.aweme.commercialize.intelligence.fastscroll.AdFastScrollServiceImpl$predictInternal$2
                        public final /* synthetic */ ArrayList<Aweme> $awemes;
                        public final /* synthetic */ long $begin;
                        public final /* synthetic */ InterfaceC1843580y4i $listener;
                        public final /* synthetic */ AdFastScrollServiceImpl this$0;

                        /* JADX WARN: Type inference failed for: r0v50, types: [X.0x9U] */
                        @Override // com.bytedance.pitaya.api.PTYTaskResultCallback
                        public void onResult(boolean z, PTYError pTYError, PTYTaskData pTYTaskData, PTYPackageInfo pTYPackageInfo) throws JSONException {
                            JSONObject params;
                            JSONObject params2;
                            EnumC1843560y4g enumC1843560y4g;
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.$begin;
                            if (pTYError != null && pTYError.getCode() != 0) {
                                C0TIW c0tiw = C0TIW.LIZ;
                                String strValueOf = String.valueOf(pTYError.getCode());
                                c0tiw.getClass();
                                C0TIW.LIZ(jCurrentTimeMillis2, strValueOf, false);
                                C1022620cia.LIZIZ("AdFastScrollServiceImpl", "[predictInternal] error=" + pTYError.getCode());
                                this.this$0.LJIIL.LIZ(this.$awemes);
                                return;
                            }
                            C0TIW.LIZ.getClass();
                            C0TIW.LIZ(jCurrentTimeMillis2, "", true);
                            StringBuilder sb2 = new StringBuilder("[predictInternal] success, output=");
                            if (pTYTaskData != null) {
                                params = pTYTaskData.getParams();
                            } else {
                                params = null;
                            }
                            sb2.append(params);
                            C1022620cia.LIZ("AdFastScrollServiceImpl", sb2.toString());
                            this.this$0.getClass();
                            HashMap map = new HashMap();
                            if (pTYTaskData != null && (params2 = pTYTaskData.getParams()) != null) {
                                try {
                                    ArrayList<AdFastScrollPredictResult> result = ((AdFastScrollOutput) C1617880sCg.LIZ.LJII(C786410Ut5.J3(params2), AdFastScrollOutput.class)).getResult();
                                    if (result != null) {
                                        for (AdFastScrollPredictResult adFastScrollPredictResult : result) {
                                            String itemId = adFastScrollPredictResult.getItemId();
                                            C1843570y4h c1843570y4h = EnumC1843560y4g.Companion;
                                            int scroll_status = adFastScrollPredictResult.getScroll_status();
                                            c1843570y4h.getClass();
                                            if (scroll_status != 0) {
                                                if (scroll_status != 1) {
                                                    enumC1843560y4g = EnumC1843560y4g.UNKNOWN;
                                                } else {
                                                    enumC1843560y4g = EnumC1843560y4g.FAST;
                                                }
                                            } else {
                                                enumC1843560y4g = EnumC1843560y4g.SLOW;
                                            }
                                            if (itemId != null && !a0.LJJJIL(itemId)) {
                                                map.put(itemId, enumC1843560y4g);
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                    sbLIZ6.append("[getFastScrollResult] error=");
                                    sbLIZ6.append(e.getMessage());
                                    C1022620cia.LIZIZ("AdFastScrollServiceImpl", C2188811AlT.LIZIZ(sbLIZ6));
                                }
                            }
                            if (!map.isEmpty()) {
                                C1949507kL c1949507kL3 = this.this$0.LJIIL;
                                c1949507kL3.getClass();
                                for (Map.Entry entry : map.entrySet()) {
                                    String str2 = (String) entry.getKey();
                                    Object value = entry.getValue();
                                    if (str2 != null && str2.length() != 0) {
                                        c1949507kL3.LIZ.put(str2, (EnumC1843560y4g) value);
                                    }
                                }
                                if (((Boolean) this.this$0.LJIIJ.getValue()).booleanValue()) {
                                    this.this$0.getClass();
                                    JSONArray jSONArray = new JSONArray();
                                    for (Map.Entry entry2 : map.entrySet()) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("aweme_id", entry2.getKey());
                                        jSONObject.put("label", ((EnumC1843560y4g) entry2.getValue()).getValue());
                                        jSONArray.put(jSONObject);
                                    }
                                    String string = jSONArray.toString();
                                    C1022620cia.LIZ("AdFastScrollServiceImpl", "[predictInternal] send to strategy center, json=" + string);
                                    C1808090x9T.LIZ.getClass();
                                    if (C1807670x8n.LJJIZ == null) {
                                        synchronized (C1808100x9U.class) {
                                            try {
                                                if (C1807670x8n.LJJIZ == null) {
                                                    C1807670x8n.LJJIZ = new Object() { // from class: X.0x9U
                                                        {
                                                            C1808090x9T.LIZ.getClass();
                                                            C1808110x9V c1808110x9VLIZ = C1808090x9T.LIZ();
                                                            EnumC055600Ig enumC055600Ig = EnumC055600Ig.VOD_PRELOAD;
                                                            C1486820onI c1486820onI = C1486830onJ.LIZ;
                                                            c1808110x9VLIZ.LIZ.putIfAbsent(enumC055600Ig, new CopyOnWriteArraySet<>());
                                                            CopyOnWriteArraySet<InterfaceC1486840onK> copyOnWriteArraySet = c1808110x9VLIZ.LIZ.get(enumC055600Ig);
                                                            if (copyOnWriteArraySet != null) {
                                                                copyOnWriteArraySet.add(c1486820onI);
                                                            }
                                                        }
                                                    };
                                                }
                                            } finally {
                                            }
                                        }
                                    }
                                    int i4 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                    sbLIZ7.append("fastScrollModelResultUpdated, result:");
                                    sbLIZ7.append(string);
                                    C1720106oR.LJI("CommerceDataDelegate", C2188811AlT.LIZIZ(sbLIZ7));
                                    CopyOnWriteArraySet<InterfaceC1486840onK> copyOnWriteArraySet = C1808090x9T.LIZ().LIZ.get(EnumC055600Ig.VOD_PRELOAD);
                                    if (copyOnWriteArraySet != null) {
                                        Iterator<InterfaceC1486840onK> it3 = copyOnWriteArraySet.iterator();
                                        while (it3.hasNext()) {
                                            it3.next().onChanged(string);
                                        }
                                    }
                                }
                                C0TIW c0tiw2 = C0TIW.LIZ;
                                Collection<EnumC1843560y4g> collectionValues = map.values();
                                c0tiw2.getClass();
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append("[sendResultPredictEvent] statusList=");
                                sbLIZ8.append(collectionValues);
                                C1022620cia.LIZ("AdFastScrollEvent", C2188811AlT.LIZIZ(sbLIZ8));
                                for (EnumC1843560y4g enumC1843560y4g2 : collectionValues) {
                                    C2344009Gk c2344009Gk3 = new C2344009Gk();
                                    c2344009Gk3.LJFF("is_fast_sliding", String.valueOf(enumC1843560y4g2.getValue()));
                                    C20684815ws.LJIILLIIL("ad_fast_slow_sliding_result_predict", c2344009Gk3.LIZ);
                                }
                                return;
                            }
                            C1022620cia.LIZIZ("AdFastScrollServiceImpl", "[predictInternal] success, but result is empty");
                            this.this$0.LJIIL.LIZ(this.$awemes);
                        }
                    });
                } else {
                    C1022620cia.LIZ("AdFastScrollServiceImpl", "[predictInternal] businessName=NULL, return!");
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdFastScrollServiceImpl@a141.predictIfNeed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
