package X;

import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.ecommerce.search.EComModelSearchDependencyService;
import com.ss.android.ugc.aweme.vision.IEComModelSearchDependencyService;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchPdpEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675840Qf8 {
    public static final void LIZIZ(PhotoSearchEnterParams photoSearchEnterParams, Function1<? super JSONObject, Unit> function1) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer numValueOf;
        IEComModelSearchDependencyService iEComModelSearchDependencyServiceLJ = EComModelSearchDependencyService.LJ();
        JSONObject jSONObject = new JSONObject();
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams;
        if (photoSearchBusinessEnterParams != null) {
            str = photoSearchBusinessEnterParams.enterFrom;
        } else {
            str = null;
        }
        jSONObject.put("enter_from", str);
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2 = photoSearchEnterParams.businessParams;
        if (photoSearchBusinessEnterParams2 != null) {
            str2 = photoSearchBusinessEnterParams2.enterMethod;
        } else {
            str2 = null;
        }
        jSONObject.put("enter_method", str2);
        PhotoSearchPdpEnterParams photoSearchPdpEnterParams = photoSearchEnterParams.pdpParams;
        if (photoSearchPdpEnterParams != null) {
            str3 = photoSearchPdpEnterParams.rawPhotoSource;
        } else {
            str3 = null;
        }
        jSONObject.put("raw_photo_source", str3);
        PhotoSearchLogEnterParams photoSearchLogEnterParams = photoSearchEnterParams.logParams;
        if (photoSearchLogEnterParams != null) {
            str4 = photoSearchLogEnterParams.searchEntrance;
        } else {
            str4 = null;
        }
        jSONObject.put("search_entrance", str4);
        PhotoSearchLogEnterParams photoSearchLogEnterParams2 = photoSearchEnterParams.logParams;
        if (photoSearchLogEnterParams2 != null) {
            str5 = photoSearchLogEnterParams2.sourcePageName;
        } else {
            str5 = null;
        }
        jSONObject.put("source_page_name", str5);
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams;
        if (photoSearchToolsEnterParams != null) {
            str6 = photoSearchToolsEnterParams.searchSource;
        } else {
            str6 = null;
        }
        jSONObject.put("search_source", str6);
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3 = photoSearchEnterParams.businessParams;
        if (photoSearchBusinessEnterParams3 != null) {
            numValueOf = Integer.valueOf(photoSearchBusinessEnterParams3.rootEnterFromType);
        } else {
            numValueOf = null;
        }
        jSONObject.put("root_enter_from_type", numValueOf);
        jSONObject.put("device_type", EComModelSearchDependencyService.LJ().getDeviceType());
        function1.invoke(jSONObject);
        iEComModelSearchDependencyServiceLJ.LIZIZ("rd_tiktokec_photo_search_trace", jSONObject, null, null);
    }

    public static void LIZ(String str, String str2, Long l, Integer num, Integer num2, Function1 function1, int i) {
        int value;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 256) != 0) {
            num2 = null;
        }
        if ((i & 512) != 0) {
            function1 = null;
        }
        if (num != null) {
            value = num.intValue();
        } else {
            value = C0QXR.MALL.getValue();
        }
        IEComModelSearchDependencyService iEComModelSearchDependencyServiceLJ = EComModelSearchDependencyService.LJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("step", str);
        jSONObject.put(Scene.SCENE_SERVICE, str2);
        jSONObject.put("duration", l);
        jSONObject.put("set_up", (Object) null);
        jSONObject.put("items_count", (Object) null);
        jSONObject.put("search_source", (Object) null);
        jSONObject.put("cursor", (Object) null);
        jSONObject.put("is_success", num2);
        jSONObject.put("root_enter_from_type", value);
        jSONObject.put("device_type", EComModelSearchDependencyService.LJ().getDeviceType());
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        iEComModelSearchDependencyServiceLJ.LIZIZ("rd_tiktokec_photo_search_trace", jSONObject, null, null);
    }

    public static void LIZJ(String str, String str2, Long l, Integer num, String str3, String str4, Function1 function1, int i) throws JSONException {
        int value;
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        if ((i & 512) != 0) {
            str3 = null;
        }
        if ((i & 1024) != 0) {
            str4 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            function1 = null;
        }
        if (num != null) {
            value = num.intValue();
        } else {
            value = C0QXR.DEFAULT.getValue();
        }
        IEComModelSearchDependencyService iEComModelSearchDependencyServiceLJ = EComModelSearchDependencyService.LJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("step", str);
        jSONObject.put(Scene.SCENE_SERVICE, str2);
        jSONObject.put("duration", l);
        jSONObject.put("set_up", (Object) null);
        jSONObject.put("items_count", (Object) null);
        jSONObject.put("search_source", (Object) null);
        jSONObject.put("cursor", (Object) null);
        jSONObject.put("is_success", (Object) null);
        jSONObject.put("root_enter_from_type", value);
        jSONObject.put("enter_from", str3);
        jSONObject.put("enter_method", str4);
        if (function1 != null) {
            function1.invoke(jSONObject);
        }
        iEComModelSearchDependencyServiceLJ.LIZIZ("rd_tiktokec_visual_search_trace", jSONObject, null, null);
    }

    public static final void LIZLLL(PageFinder pageFinder, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        IEComModelSearchDependencyService iEComModelSearchDependencyServiceLJ = EComModelSearchDependencyService.LJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_entrance", str);
        jSONObject.put("current_page", str2);
        jSONObject.put("enter_from", str3);
        jSONObject.put("enter_from_second", str4);
        jSONObject.put("photo_search_module", "visual_search");
        jSONObject.put("root_enter_from_type", num);
        if (str5 != null) {
            jSONObject.put("position", str5);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        iEComModelSearchDependencyServiceLJ.LIZIZ("photo_search_icon_click", jSONObject, str6, pageFinder);
    }

    public static final void LJFF(PageFinder pageFinder, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Map map) throws JSONException {
        IEComModelSearchDependencyService iEComModelSearchDependencyServiceLJ = EComModelSearchDependencyService.LJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("search_entrance", str);
        jSONObject.put("current_page", str2);
        jSONObject.put("enter_from", str3);
        jSONObject.put("enter_from_second", str4);
        jSONObject.put("photo_search_module", "visual_search");
        jSONObject.put("root_enter_from_type", num);
        if (str5 != null) {
            jSONObject.put("position", str5);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        iEComModelSearchDependencyServiceLJ.LIZIZ("photo_search_icon_show", jSONObject, str6, pageFinder);
    }
}
