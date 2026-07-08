package Y;

import X.C1768850w8B;
import X.C1C7U;
import X.C1D36;
import X.C2188811AlT;
import X.C2252051DCp;
import X.C2252061DCq;
import X.C315220CXg;
import X.C644290POx;
import X.C644300POy;
import X.C650560PfS;
import X.C650640Pfa;
import X.C650700Pfg;
import X.C653070PjV;
import X.C657900PrI;
import X.C687270QxZ;
import X.C786410Ut5;
import X.C798360VTm;
import X.EnumC1768950w8L;
import X.InterfaceC648350Pbt;
import android.os.Debug;
import android.view.View;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.feed.platform.panel.bubble.EcomSearchMallBubbleComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS15S1200000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    public final void LIZ$1() {
        try {
            int width = ((View) this.l1).getWidth();
            int height = ((View) this.l1).getHeight();
            if (width > 0 && height > 0) {
                C657900PrI c657900PrI = C657900PrI.LIZ;
                String str = this.s0;
                c657900PrI.getClass();
                C657900PrI.LIZJ.put(str, new C644290POx(width, height));
            }
            C657900PrI.LJ.decrementAndGet();
            ((AtomicBoolean) this.l2).set(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C657900PrI.LJ.decrementAndGet();
            ((AtomicBoolean) this.l2).set(false);
            throw th;
        }
    }

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        double dLIZ;
        C798360VTm c798360VTmPutIfAbsent;
        JSONObject jSONObject = new JSONObject();
        Double dRemove = C644300POy.LIZJ.remove(this.s0);
        if (dRemove != null) {
            dLIZ = dRemove.doubleValue();
        } else {
            ConcurrentHashMap<String, C798360VTm> concurrentHashMap = C644300POy.LIZ;
            String str = this.s0;
            C798360VTm c798360VTm = concurrentHashMap.get(str);
            if (c798360VTm == null && (c798360VTmPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c798360VTm = new C798360VTm(false, null, 31)))) != null) {
                c798360VTm = c798360VTmPutIfAbsent;
            }
            dLIZ = C687270QxZ.LIZ(c798360VTm.LJI.LIZ);
        }
        if (dLIZ > 0.0d) {
            jSONObject.put("cpu_usage", dLIZ);
        }
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        jSONObject.put("total_pss", memoryInfo.getTotalPss());
        jSONObject.put("dalvik_pss", memoryInfo.dalvikPss);
        jSONObject.put("native_pss", memoryInfo.nativePss);
        jSONObject.put(Scene.SCENE_SERVICE, this.s0);
        Map map = (Map) this.l1;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str2 = (String) entry.getKey();
                String str3 = (String) entry.getValue();
                if (str3 != null && str3.length() != 0) {
                    jSONObject.put(str2, str3);
                }
            }
        }
        Map map2 = (Map) this.l2;
        if (map2 != null) {
            for (Map.Entry entry2 : map2.entrySet()) {
                String str4 = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    jSONObject.put(str4, value);
                }
            }
        }
        AppLogNewUtils.onEventV3("tako_resource_performance_monitor", jSONObject);
    }

    public final void LIZ$3() {
        Set<InterfaceC648350Pbt> set = ((C650640Pfa) this.l1).LJIIIIZZ;
        InterfaceC648350Pbt interfaceC648350Pbt = (InterfaceC648350Pbt) this.l2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!Intrinsics.LJFF(obj, interfaceC648350Pbt)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC648350Pbt) it2.next()).LJJLIIIJLLLLLLLZ();
        }
        String str = this.s0;
        if (C650560PfS.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get releasable playables, source:");
            sbLIZ.append(str);
            sbLIZ.append(", size:");
            sbLIZ.append(arrayList.size());
            sbLIZ.append(", remaining:");
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(C650700Pfg.LIZ.keySet());
            sbLIZ.append(arrayList2.toString());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final void LIZ$4() {
        C1D36 c1d36LIZIZ = C2252051DCp.LIZJ.LIZIZ(C2252051DCp.LJ, this.s0);
        if (c1d36LIZIZ == null) {
            ((Function1) this.l1).invoke(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((Map) this.l2).entrySet().iterator();
        while (it2.hasNext()) {
            C2252061DCq c2252061DCqLIZ = c1d36LIZIZ.LIZJ.LIZ((String) ((Map.Entry) it2.next()).getKey());
            if (c2252061DCqLIZ != null) {
                arrayList.add(c2252061DCqLIZ);
            }
        }
        ((Function1) this.l1).invoke(arrayList);
    }

    public final void LIZ$2() throws JSONException {
        if (!C315220CXg.LIZ().LJLILLLLZI((Aweme) this.l1, true, true)) {
            EcomSearchMallBubbleComponent ecomSearchMallBubbleComponent = (EcomSearchMallBubbleComponent) this.l2;
            String str = this.s0;
            ecomSearchMallBubbleComponent.getClass();
            EcomSearchMallBubbleComponent.bo("fail", str, "feedbar&commentTop avoid");
            return;
        }
        EcomSearchMallBubbleComponent ecomSearchMallBubbleComponent2 = (EcomSearchMallBubbleComponent) this.l2;
        String str2 = this.s0;
        ecomSearchMallBubbleComponent2.getClass();
        EcomSearchMallBubbleComponent.bo("request", str2, "");
        IShopIconService iShopIconServiceLIZ = MallServiceManager.LIZIZ().LIZ();
        if (iShopIconServiceLIZ != null) {
            EnumC1768950w8L enumC1768950w8L = EnumC1768950w8L.FEED_VIDEO_SEARCH;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("after_video_gid", this.s0);
            iShopIconServiceLIZ.Pv(enumC1768950w8L, new C1768850w8B(C786410Ut5.J3(jSONObject), null, null, null, 14), null);
        }
    }

    public static final void run$0(ARunnableS15S1200000_10 aRunnableS15S1200000_10) {
        boolean zLIZ;
        C1C7U.LIZ("TakoResourcePerformanceMonitor@8f4a.collect$1");
        try {
            aRunnableS15S1200000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoResourcePerformanceMonitor@8f4a.collect$1");
    }

    public static final void run$1(ARunnableS15S1200000_10 aRunnableS15S1200000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchImageLoadManager@b294.tryScheduleViewSizeCacheFill$1");
        try {
            aRunnableS15S1200000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchImageLoadManager@b294.tryScheduleViewSizeCacheFill$1");
    }

    public static final void run$2(ARunnableS15S1200000_10 aRunnableS15S1200000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchHotSpotWithVideoViewHolder@ad55.mobShowOrClick$1");
        try {
            ((C653070PjV) aRunnableS15S1200000_10.l1).LLJJ.LIZ(aRunnableS15S1200000_10.s0, (SearchSpot) aRunnableS15S1200000_10.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchHotSpotWithVideoViewHolder@ad55.mobShowOrClick$1");
    }

    public static final void run$3(ARunnableS15S1200000_10 aRunnableS15S1200000_10) {
        boolean zLIZ;
        C1C7U.LIZ("EcomSearchMallBubbleComponent@785d.addVideoPlayObserver$1$1$1$1");
        try {
            aRunnableS15S1200000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EcomSearchMallBubbleComponent@785d.addVideoPlayObserver$1$1$1$1");
    }

    public static final void run$4(ARunnableS15S1200000_10 aRunnableS15S1200000_10) {
        boolean zLIZ;
        C1C7U.LIZ("PlayService@8c2c.releasePlayablesIfNeed$1");
        try {
            aRunnableS15S1200000_10.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlayService@8c2c.releasePlayablesIfNeed$1");
    }

    public static final void run$5(ARunnableS15S1200000_10 aRunnableS15S1200000_10) {
        boolean zLIZ;
        C1C7U.LIZ("ConsumeManager@fa78.getConsumeDataList$1");
        try {
            aRunnableS15S1200000_10.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ConsumeManager@fa78.getConsumeDataList$1");
    }

    public ARunnableS15S1200000_10(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
