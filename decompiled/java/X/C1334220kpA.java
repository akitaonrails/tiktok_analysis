package X;

import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334220kpA {
    public static final C1334220kpA LIZ = new C1334220kpA();

    public static void LIZ(JSONObject jSONObject) {
        if (C1330720kjW.LIZ() && C1330720kjW.LIZIZ()) {
            if (!((Boolean) C1330720kjW.LIZJ.getValue()).booleanValue()) {
                return;
            }
            AppLogNewUtils.onEventV3("image_monitor_v3", jSONObject);
            return;
        }
        C2222891BzL.LIZ.monitorCommonLog("image_monitor_v2", jSONObject);
    }
}
