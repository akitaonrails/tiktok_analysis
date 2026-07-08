package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutPatchSettings;
import com.bytedance.android.livesdk.sei.LiveSeiStruct;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0aUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937300aUy {
    public static final C937300aUy LIZ = new C937300aUy();

    public static void LIZ(C945320ahu c945320ahu, Function1 function1) {
        Object c098200Yq;
        Object c098200Yq2;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        String strOptString;
        SeiAppData seiAppData;
        if (!LinkMicLayoutPatchSettings.isEnable()) {
            return;
        }
        String str = null;
        if (c945320ahu != null) {
            LiveSeiStruct liveSeiStruct = c945320ahu.LIZ;
            if (liveSeiStruct != null && (seiAppData = liveSeiStruct.LIZ) != null) {
                Map<String, Map<String, String>> map = seiAppData.businessExtraInfo;
                if (map != null) {
                    Map<String, String> map2 = map.get("lp");
                    if (map2 != null) {
                        str = map2.get("p");
                    }
                    function1.invoke(str);
                    return;
                }
                function1.invoke("");
                return;
            }
            String str2 = c945320ahu.LIZIZ;
            if (str2 != null && str2.length() > 0) {
                try {
                    c098200Yq = new JSONObject(str2);
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
                if (jSONObject != null) {
                    try {
                        c098200Yq2 = new JSONObject(jSONObject.optString("app_data"));
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq2 = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                        c098200Yq2 = null;
                    }
                    JSONObject jSONObject2 = (JSONObject) c098200Yq2;
                    if (jSONObject2 != null && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("business_extra_info")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("lp")) != null && (strOptString = jSONObjectOptJSONObject2.optString("p")) != null) {
                        function1.invoke(strOptString);
                    } else {
                        new AwS559S0100000_15(function1, (Function1<? super Throwable, Unit>) 570);
                    }
                }
            }
        }
    }
}
