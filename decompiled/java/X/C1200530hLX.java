package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200530hLX {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("enter_homepage_nearby", "publish", "choose_poi", "enter_poi_detail", "search", "search_poi_result", "search_poi", "poi_recommendation_show", "enter_poi_search", "poi_entrance_show", "poi_recommendation_result", "location_status");

    public static final String LIZLLL(Boolean bool) {
        if (bool != null) {
            if (bool.booleanValue()) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        return null;
    }

    public static final Map<String, String> LIZIZ(Context context, String str) {
        Object c098200Yq;
        String message;
        boolean z;
        String str2 = "";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1207340hWW.LIZ.getClass();
        if (C1207340hWW.LJIIJJI()) {
            return linkedHashMap;
        }
        if (context == null) {
            try {
                context = ActivityStack.getTopActivity();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        String str3 = "-1";
        if (C13LP.LJJJJ(str, LIZ)) {
            boolean zLIZ = C1194170hBH.LIZ(context);
            boolean zLIZJ = C1194170hBH.LIZJ(context);
            String strLIZLLL = LIZLLL(Boolean.valueOf(zLIZ));
            if (strLIZLLL == null) {
                strLIZLLL = "-1";
            }
            linkedHashMap.put("is_location_app_permission", strLIZLLL);
            String strLIZLLL2 = LIZLLL(Boolean.valueOf(zLIZJ));
            if (strLIZLLL2 != null) {
                str3 = strLIZLLL2;
            }
            linkedHashMap.put("is_location_system_permission", str3);
            if (zLIZ && zLIZJ) {
                z = true;
            } else {
                z = false;
            }
            String strLIZLLL3 = LIZLLL(Boolean.valueOf(z));
            if (strLIZLLL3 == null) {
                strLIZLLL3 = "";
            }
            linkedHashMap.put("enable_location", strLIZLLL3);
        } else {
            String strLIZLLL4 = LIZLLL(Boolean.valueOf(C1194170hBH.LIZ(context)));
            if (strLIZLLL4 != null) {
                str3 = strLIZLLL4;
            }
            linkedHashMap.put("enable_location", str3);
        }
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
        if (iLocationBaseServiceForMT.LJIILJJIL()) {
            String strLIZLLL5 = LIZLLL(Boolean.valueOf(((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJ(context)));
            if (strLIZLLL5 == null) {
                strLIZLLL5 = "";
            }
            linkedHashMap.put("system_is_precise", strLIZLLL5);
            String strLIZLLL6 = LIZLLL(Boolean.valueOf(iLocationBaseServiceForMT.LJJIJ()));
            if (strLIZLLL6 == null) {
                strLIZLLL6 = "";
            }
            linkedHashMap.put("inapp_is_precise", strLIZLLL6);
        }
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                message = thM5exceptionOrNullimpl.getMessage();
            } else {
                message = null;
            }
            if (message != null) {
                str2 = message;
            }
            C1720106oR.LJI("LocationExt", str2);
        }
        return linkedHashMap;
    }

    public static final void LIZ(Context context, Object obj, String str) {
        C1207340hWW.LIZ.getClass();
        if (C1207340hWW.LJIIJJI()) {
            return;
        }
        try {
            Map<String, String> mapLIZIZ = LIZIZ(context, str);
            if (obj instanceof AbstractC1386130mAt) {
                for (Map.Entry entry : ((LinkedHashMap) mapLIZIZ).entrySet()) {
                    ((AbstractC1386130mAt) obj).LJ((String) entry.getKey(), (String) entry.getValue());
                }
            } else if (obj instanceof C2241008qG) {
                for (Map.Entry entry2 : ((LinkedHashMap) mapLIZIZ).entrySet()) {
                    ((C2241008qG) obj).LIZLLL((String) entry2.getKey(), (String) entry2.getValue());
                }
            } else if (obj instanceof C2344009Gk) {
                for (Map.Entry entry3 : ((LinkedHashMap) mapLIZIZ).entrySet()) {
                    ((C2344009Gk) obj).LJFF((String) entry3.getKey(), (String) entry3.getValue());
                }
            } else if (obj instanceof JSONObject) {
                for (Map.Entry entry4 : ((LinkedHashMap) mapLIZIZ).entrySet()) {
                    ((JSONObject) obj).put((String) entry4.getKey(), entry4.getValue());
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
