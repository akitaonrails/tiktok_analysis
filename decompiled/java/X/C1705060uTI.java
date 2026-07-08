package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uTI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1705060uTI {
    public static final JSONObject LIZ(Effect effect) {
        String extra = effect.getExtra();
        if (extra == null || extra.length() == 0) {
            return null;
        }
        return new JSONObject(extra);
    }

    public static final String LIZIZ(Effect effect) {
        List<String> urlList = effect.getIconUrl().getUrlList();
        if (!urlList.isEmpty()) {
            return (String) ListProtector.get(urlList, 0);
        }
        return "";
    }

    public static final String LJ(Effect effect) {
        String strLIZLLL = LIZLLL(LIZ(effect), "ame_tracking_type");
        if (strLIZLLL == null) {
            return EnumC1705050uTH.TRACKING_TYPE_FOREGROUND.getTypeName();
        }
        return strLIZLLL;
    }

    public static final boolean LJFF(Effect effect) {
        Boolean boolLIZIZ = C1706490uVb.LIZIZ(effect.getExtra());
        if (boolLIZIZ != null) {
            return boolLIZIZ.booleanValue();
        }
        return false;
    }

    public static final String LIZJ(Effect effect, String str) {
        boolean z;
        Object c098200Yq;
        String extra = effect.getExtra();
        Object obj = null;
        if (extra == null) {
            return null;
        }
        if (extra.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            extra = null;
        }
        if (extra == null) {
            return null;
        }
        try {
            c098200Yq = new JSONObject(extra).optString(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZLLL(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                return JSONObjectProtectorUtils.getString(jSONObject, str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }
}
