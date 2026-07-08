package X;

import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pTo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513180pTo {
    public static boolean LIZ;

    public static void LIZ(String str, JSONObject jSONObject) {
        ITTMEventStream iTTMEventStream = C829800Wgs.LIZ;
        if (iTTMEventStream != null) {
            iTTMEventStream.emitEventToCaiEventStream(str, jSONObject);
        }
    }
}
