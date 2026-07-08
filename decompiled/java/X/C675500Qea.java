package X;

import android.os.SystemClock;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.dependency.apm.ApmDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.apm.IApmDependencyService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675500Qea {
    public final EnumC669620QOi LIZ;
    public long LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public boolean LJFF = true;
    public final Map<String, Object> LJI = new LinkedHashMap();

    public C675500Qea(EnumC669620QOi enumC669620QOi) {
        this.LIZ = enumC669620QOi;
    }

    public final void LIZLLL(C0QER c0qer) {
        String value;
        String enterSearchFrom;
        AnonymousClass0317 anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin;
        String name;
        ECSearchEntranceData ecSearchEntranceData;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LJI);
        if (c0qer == null || (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) == null || (value = ecSearchEntranceData.getStringStrategy("result_type")) == null) {
            value = C0QXX.TYPE_SHOP.getValue();
        }
        String str = "";
        if (c0qer == null || (enterSearchFrom = c0qer.getEnterSearchFrom()) == null) {
            enterSearchFrom = "";
        }
        linkedHashMap.put("enter_search_from", enterSearchFrom);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = ApmDependencyService.createIApmDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IApmDependencyService.class.getName();
            if (anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApmDependencyService.class);
        }
        linkedHashMap.put("traceparent", ((IApmDependencyService) anonymousClass0317CreateIApmDependencyServicebyMonsterPlugin).newTrackingTraceparent());
        linkedHashMap.put("search_type", value);
        String latestSearchId = C1ER1.LIZIZ.getLatestSearchId();
        if (latestSearchId != null) {
            str = latestSearchId;
        }
        linkedHashMap.put("search_id", str);
        if (c0qer != null) {
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(c0qer.getEcSearchEntranceValue()));
        }
        C1018703yb.LIZIZ("rd_ec_search_page_start", linkedHashMap);
    }

    public final void LJ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LJI);
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        linkedHashMap.put("native_request_count", 0);
        linkedHashMap.put("request_count", 0);
        if (Intrinsics.LJFF(str, "search_exit")) {
            linkedHashMap.put("has_result", Integer.valueOf(this.LIZLLL ? 1 : 0));
            linkedHashMap.put("exit_duration", Long.valueOf(System.currentTimeMillis() - this.LJ));
        }
        linkedHashMap.put("visiable", 0);
        C1018703yb.LIZIZ("rd_ec_search_request_trace", linkedHashMap);
    }

    public static void LIZ(C675500Qea c675500Qea, String str, String str2, int i) {
        Map<String, Object> map = c675500Qea.LJI;
        map.put("enter_method", str);
        map.put("enter_from", str2);
        map.put("is_native_request", 1);
        map.put("trace_type", 0);
        map.put("request_count", Integer.valueOf(i));
        map.put("tab_name", c675500Qea.LIZ.getTabName());
    }

    public final void LIZIZ(C0QER c0qer, boolean z, int i, int i2, String str, long j) {
        String str2;
        if (z) {
            this.LIZJ = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZJ;
        if (z) {
            str2 = "rd_ec_request_send";
        } else {
            str2 = "rd_ec_request_result";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = ((LinkedHashMap) this.LJI).get("tab_name");
        Object obj2 = obj;
        if (obj == null) {
            obj2 = "";
        }
        linkedHashMap.put("page_name", obj2);
        linkedHashMap.put("request_method", "template");
        linkedHashMap.put("start_click_to_now", Long.valueOf(System.currentTimeMillis() - this.LIZIZ));
        Object obj3 = ((LinkedHashMap) this.LJI).get("enter_from");
        if (obj3 != null) {
            linkedHashMap.put("enter_from", obj3);
        }
        linkedHashMap.put("request_type", Integer.valueOf(!this.LJFF ? 1 : 0));
        if (!z) {
            linkedHashMap.put("api_duration", Long.valueOf(jCurrentTimeMillis));
            linkedHashMap.put("is_success", Integer.valueOf(i));
            linkedHashMap.put("item_count", Integer.valueOf(i2));
            linkedHashMap.put("params", 0);
        }
        linkedHashMap.put("api_path", str);
        linkedHashMap.put("cursor", Long.valueOf(j));
        if (c0qer != null) {
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(c0qer.getEcSearchEntranceValue()));
        }
        C1018703yb.LIZIZ(str2, linkedHashMap);
        if (!z) {
            this.LJFF = false;
        }
    }
}
