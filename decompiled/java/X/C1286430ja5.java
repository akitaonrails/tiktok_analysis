package X;

import com.bytedance.effectcreatormobile.infrastructure.effectplatform.api.AssetsLibData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ja5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1286430ja5 {
    public static final boolean LIZ(String str) {
        Object c098200Yq;
        try {
            if (str == null) {
                str = "";
            }
            c098200Yq = Boolean.valueOf(new JSONObject(str).optBoolean("fullscreen", false));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Boolean bool = (Boolean) c098200Yq;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static final String LIZIZ(String str) {
        Object c098200Yq;
        try {
            if (str == null) {
                str = "";
            }
            c098200Yq = new JSONObject(str).optString("ame_default_tracking");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (String) c098200Yq;
    }

    public static final Double LIZJ(AssetsLibData.AssetsItemData assetsItemData) {
        String str = assetsItemData.realExtra;
        if ((str != null && str.length() > 0) || (0 != 0 && str != null)) {
            return LIZLLL(str);
        }
        return null;
    }

    public static final Double LIZLLL(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ame_performance_grade")) {
                    return Double.valueOf(jSONObject.optDouble("ame_performance_grade", -1.0d));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }
}
