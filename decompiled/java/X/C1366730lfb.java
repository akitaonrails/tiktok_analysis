package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import com.ss.android.ugc.aweme.vibefeed.service.IVibeCacheService;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1366730lfb {
    public static final void LIZLLL(Bundle bundle, Object obj) {
        Object c098200Yq;
        String strOptString;
        String str = "";
        String string = bundle.getString("enter_from", "");
        if (C1575980r76.LIZIZ(string) || C1575980r76.LIZ(string)) {
            String string2 = bundle.getString("shared_feed_id");
            String string3 = bundle.getString("social_vibe_extra_param");
            if (string3 != null && string3.length() != 0) {
                try {
                    c098200Yq = new JSONObject(string3);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                JSONObject jSONObject = (JSONObject) c098200Yq;
                if (jSONObject == null || (strOptString = jSONObject.optString("conversation_id")) == null) {
                    strOptString = "";
                }
                if (string2 != null) {
                    str = string2;
                }
                LIZIZ(string, obj, strOptString, str);
                LIZ(obj, "conversation_id", strOptString);
                if (jSONObject != null) {
                    int iIntValue = Integer.valueOf(jSONObject.optInt("mutual_feed_scene")).intValue();
                    EnumC912680ZrG.Companion.getClass();
                    LIZ(obj, "shared_feed_type", C908790Zkz.LIZ(iIntValue).sharedFeedType());
                }
            }
        }
    }

    public static final void LIZ(Object obj, String str, String str2) {
        Object objPut;
        Map map;
        try {
            if (obj instanceof AbstractC1386130mAt) {
                AbstractC1386130mAt abstractC1386130mAt = (AbstractC1386130mAt) obj;
                abstractC1386130mAt.getClass();
                abstractC1386130mAt.LJFF(str, str2, InterfaceC1210900hcG.LIZ);
                objPut = abstractC1386130mAt;
            } else if (obj instanceof C2241008qG) {
                C2241008qG c2241008qG = (C2241008qG) obj;
                c2241008qG.LIZ.put(str, str2);
                objPut = c2241008qG;
            } else if (obj instanceof C2344009Gk) {
                C2344009Gk c2344009Gk = (C2344009Gk) obj;
                c2344009Gk.getClass();
                c2344009Gk.LJIIIIZZ(str, str2);
                objPut = c2344009Gk;
            } else if (C19719512Dh.LJII(obj)) {
                if (C19719512Dh.LJII(obj) && (map = (Map) obj) != null) {
                    objPut = (String) map.put(str, str2);
                } else {
                    objPut = null;
                }
            } else if (obj instanceof JSONObject) {
                objPut = ((JSONObject) obj).put(str, str2);
            } else {
                if (obj instanceof Bundle) {
                    ((BaseBundle) obj).putString(str, str2);
                }
                objPut = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(objPut);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZJ(C2189821An6 c2189821An6, Object obj, String str) {
        String eventType;
        Object c098200Yq;
        String strOptString;
        String eventType2;
        String vibeExtraParam;
        DetailNavArgModel navArgModel;
        String eventType3;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        if (!C1575980r76.LIZIZ(eventType)) {
            if (c2189821An6 != null) {
                eventType3 = c2189821An6.getEventType();
            } else {
                eventType3 = null;
            }
            if (!C1575980r76.LIZ(eventType3)) {
                return;
            }
        }
        try {
            if (c2189821An6 == null || (navArgModel = c2189821An6.getNavArgModel()) == null || (vibeExtraParam = navArgModel.getVibeExtraParam()) == null) {
                vibeExtraParam = "";
            }
            c098200Yq = new JSONObject(vibeExtraParam);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        JSONObject jSONObject = (JSONObject) c098200Yq;
        if (jSONObject == null || (strOptString = jSONObject.optString("conversation_id")) == null) {
            strOptString = "";
        }
        if (c2189821An6 == null || (eventType2 = c2189821An6.getEventType()) == null) {
            eventType2 = "";
        }
        if (str == null) {
            str = "";
        }
        LIZIZ(eventType2, obj, strOptString, str);
        LIZ(obj, "conversation_id", strOptString);
        C908790Zkz c908790Zkz = EnumC912680ZrG.Companion;
        int iOptInt = 0;
        if (jSONObject != null) {
            iOptInt = jSONObject.optInt("mutual_feed_scene", 0);
        }
        c908790Zkz.getClass();
        LIZ(obj, "chat_type", C908790Zkz.LIZ(iOptInt).stringValue());
    }

    public static final void LIZIZ(String str, Object obj, String str2, String str3) {
        String strLIZIZ;
        if ((C1575980r76.LIZIZ(str) && str2.length() > 0) || (C1575980r76.LIZ(str) && str3.length() == 0)) {
            IVibeCacheService iVibeCacheService = (IVibeCacheService) C1557990qe5.LIZJ.getValue();
            if (iVibeCacheService != null && (strLIZIZ = iVibeCacheService.LIZIZ(str2)) != null) {
                LIZ(obj, "shared_feed_id", strLIZIZ);
                return;
            }
            return;
        }
        if (!C1575980r76.LIZ(str) || str3.length() == 0) {
            return;
        }
        LIZ(obj, "shared_feed_id", str3);
    }
}
