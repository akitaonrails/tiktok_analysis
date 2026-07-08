package Y;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C06MM;
import X.C0T81;
import X.C0TJZ;
import X.C0TU5;
import X.C0UE1;
import X.C10SW;
import X.C1161920gLG;
import X.C1389890mGx;
import X.C15438062q;
import X.C1906580ziK;
import X.C1C7U;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C744690TJb;
import X.C759970TrX;
import X.C760160Trq;
import X.C766270U4b;
import X.C931040aKs;
import X.InterfaceC744680TJa;
import X.InterfaceC766480U4w;
import X.InterfaceC772190UQv;
import android.app.Activity;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class ARunnableS7S1000000_12 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C01GW c01gw = C0UE1.LIZ;
        String str = this.s0;
        Object objGg0 = DataChannelGlobal.LLILZ.gg0(C931040aKs.class);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JSONObjectProtectorUtils.getString(jSONObject, Scene.SCENE_SERVICE);
            Iterator<String> itKeys = jSONObject.keys();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, JSONObjectProtectorUtils.getString(jSONObject, next));
            }
            if (objGg0 != null) {
                linkedHashMap.put("enter_from", objGg0);
            }
            C0UE1.LIZ("preview", string, linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_broadcast_schema_dispatch_error");
            c760160TrqLIZ.LJII("page", "preview");
            c760160TrqLIZ.LJII(Scene.SCENE_SERVICE, "deep_link");
            c760160TrqLIZ.LJII("params", str);
            c760160TrqLIZ.LJII("error", e.getMessage());
            c760160TrqLIZ.LJIIIZ();
        }
    }

    public final void LIZ$1() {
        C760160Trq c760160TrqLIZ = C759970TrX.LIZ("ttlive_enter_preview_all");
        c760160TrqLIZ.LIZ(InterfaceC766480U4w.LJII.LIZIZ(), "beauty_skin");
        c760160TrqLIZ.LIZ(InterfaceC766480U4w.LJIIIIZZ.LIZIZ(), "big_eyes");
        c760160TrqLIZ.LIZ(InterfaceC766480U4w.LJIIIZ.LIZIZ(), "face_lift");
        Integer numLIZIZ = InterfaceC772190UQv.c3.LIZIZ();
        c760160TrqLIZ.LIZLLL("camera_type", (numLIZIZ == null || numLIZIZ.intValue() != 1) ? "back" : "front");
        c760160TrqLIZ.LIZLLL("live_mode", this.s0);
        c760160TrqLIZ.LIZIZ(InterfaceC766480U4w.LIZ.LIZIZ(), "filter_position");
        c760160TrqLIZ.LJI = true;
        c760160TrqLIZ.LJIIIZ();
    }

    public static final void run$0(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        String str = aRunnableS7S1000000_12.s0;
        C1C7U.LIZ("LivePlayController@1c0e.getAppInfoFetcher$1$getEffectModel$1L");
        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).qk2(str);
        C1C7U.LIZIZ("LivePlayController@1c0e.getAppInfoFetcher$1$getEffectModel$1L");
    }

    public static final void run$1(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        ArrayList<Integer> arrayList;
        int size;
        JSONObject jSONObject;
        Iterator<String> itKeys;
        String str = aRunnableS7S1000000_12.s0;
        C1C7U.LIZ("TaskSchedulingAnalyzer@5be7.init$1L");
        synchronized (C0T81.LIZ) {
            C0TJZ.LIZ("TaskSchedulingAnalyzer begin init");
            HashMap map = new HashMap();
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                Iterator<String> itKeys2 = jSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    Object obj = jSONObject2.get(next);
                    if ((obj instanceof JSONObject) && (jSONObject = (JSONObject) obj) != null && (itKeys = jSONObject.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next2 = itKeys.next();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(next);
                            sbLIZ.append('-');
                            sbLIZ.append(next2);
                            map.put(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject, next2)));
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TaskSchedulingAnalyzer parse json failed: ");
                sbLIZ2.append(e.getMessage());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                InterfaceC744680TJa interfaceC744680TJa = C0TJZ.LIZ;
                if (interfaceC744680TJa != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("TaskScheduler | ");
                    sbLIZ3.append(strLIZIZ);
                    interfaceC744680TJa.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
            ConcurrentHashMap<String, Integer> concurrentHashMap = C0T81.LIZIZ;
            concurrentHashMap.clear();
            concurrentHashMap.putAll(map);
            C0T81.LIZLLL = C744690TJb.LIZ().getInt("key_record_count", 0);
            C0T81.LIZJ = C744690TJb.LIZ().getString("key_session_id", "");
            for (String str2 : concurrentHashMap.keySet()) {
                HashMap<String, ArrayList<Integer>> map2 = C0T81.LJ;
                String string = "";
                if (str2 != null) {
                    try {
                        string = C744690TJb.LIZ().getString(str2, "");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        arrayList = new ArrayList<>(C0T81.LIZLLL);
                        Collections.fill(arrayList, 1);
                    }
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
                arrayList = new ArrayList<>(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
                }
                int size2 = arrayList.size();
                int i = C0T81.LIZLLL;
                if (size2 < i) {
                    int size3 = i - arrayList.size();
                    if (1 <= size3) {
                        int i2 = 1;
                        while (true) {
                            arrayList.add(0);
                            if (i2 != size3) {
                                i2++;
                            }
                        }
                    }
                } else if (arrayList.size() > C0T81.LIZLLL && 1 <= (size = arrayList.size() - C0T81.LIZLLL)) {
                    int i3 = 1;
                    while (true) {
                        arrayList.remove(0);
                        if (i3 != size) {
                            i3++;
                        }
                    }
                }
                map2.put(str2, arrayList);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("TaskSchedulingAnalyzer featureUsageMap key: ");
                sbLIZ4.append(str2);
                sbLIZ4.append(" value: ");
                sbLIZ4.append(C0T81.LJ.get(str2));
                C0TJZ.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
        C1C7U.LIZIZ("TaskSchedulingAnalyzer@5be7.init$1L");
    }

    public static final void run$10(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackClickSearch$1");
        try {
            C0TU5 c0tu5 = C0TU5.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c0tu5.getClass();
            C0TU5.LIZ(c2344009Gk);
            c2344009Gk.LJIIIIZZ("page_name", aRunnableS7S1000000_12.s0);
            C20684815ws.LJIILLIIL("click_searchbar_na", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackClickSearch$1");
    }

    public static final void run$11(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackEnterTopicPage$1");
        try {
            C0TU5 c0tu5 = C0TU5.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c0tu5.getClass();
            C0TU5.LIZ(c2344009Gk);
            c2344009Gk.LJIIIIZZ("faq_id", aRunnableS7S1000000_12.s0);
            C20684815ws.LJIILLIIL("enter_topics_page_na", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackEnterTopicPage$1");
    }

    public static final void run$2(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        Activity activityLIZIZ;
        C1C7U.LIZ("PolicyNoticeServiceImpl@4917.universalPopupCallback$1$showPopupToast$1");
        try {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            Activity activityLIZ = C06MM.LIZ(activityLIZIZ);
            if (activityLIZ != null) {
                String str = aRunnableS7S1000000_12.s0;
                C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.universalPopupCallback$1$showPopupToast$1");
    }

    public static final void run$3(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        String str = aRunnableS7S1000000_12.s0;
        C1C7U.LIZ("LiveOuterService@2ce2.getLiveGlobalConfig$1$getEffectModel$1L");
        ((IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)).qk2(str);
        C1C7U.LIZIZ("LiveOuterService@2ce2.getLiveGlobalConfig$1$getEffectModel$1L");
    }

    public static final void run$4(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.registerDataChannel$1$9$1$1");
        try {
            aRunnableS7S1000000_12.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.registerDataChannel$1$9$1$1");
    }

    public static final void run$5(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewLogHelperKt@d15e.reportEnterPreview$1");
        try {
            aRunnableS7S1000000_12.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewLogHelperKt@d15e.reportEnterPreview$1");
    }

    public static final void run$6(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("NewUserLinkTracker@4abb.onCustomStep$runnable$1");
        try {
            C10SW c10sw = C10SW.LIZ;
            String str = aRunnableS7S1000000_12.s0;
            c10sw.getClass();
            C10SW.LJIIL(null, str, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewUserLinkTracker@4abb.onCustomStep$runnable$1");
    }

    public static final void run$7(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("EffectSchemaDispatchCenter@53fc.showToast$1");
        try {
            C766270U4b.LJIIJJI(aRunnableS7S1000000_12.s0);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EffectSchemaDispatchCenter@53fc.showToast$1");
    }

    public static final void run$8(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackButtonClick$1");
        try {
            C0TU5 c0tu5 = C0TU5.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("service_type", aRunnableS7S1000000_12.s0);
            c0tu5.getClass();
            C0TU5.LIZ(c2344009Gk);
            C20684815ws.LJIILLIIL("click_submit_report_button_na", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackButtonClick$1");
    }

    public static final void run$9(ARunnableS7S1000000_12 aRunnableS7S1000000_12) {
        boolean zLIZ;
        C1C7U.LIZ("FaqEventTrack@30b9.trackButtonShow$1");
        try {
            C0TU5 c0tu5 = C0TU5.LIZ;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c0tu5.getClass();
            C0TU5.LIZ(c2344009Gk);
            c2344009Gk.LJIIIIZZ("button_type", aRunnableS7S1000000_12.s0);
            C20684815ws.LJIILLIIL("show_submit_report_button_na", c2344009Gk.LIZ);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FaqEventTrack@30b9.trackButtonShow$1");
    }

    public ARunnableS7S1000000_12(String str, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 3:
                this.s0 = str;
                break;
            case 2:
            default:
                this.s0 = str;
                break;
        }
    }
}
