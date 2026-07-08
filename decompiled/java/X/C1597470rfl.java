package X;

import com.bytedance.crash.Npth;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0rfl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597470rfl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, Throwable th, Map map) {
        Throwable th2;
        if (!(th instanceof C1494690ozz) && !(th instanceof CancellationException)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("enter_from", str);
            if (map != null) {
                linkedHashMap.putAll(map);
            }
            String string = linkedHashMap.toString();
            if (th == null) {
                th2 = new Throwable(string);
            } else {
                th2 = new Throwable(string, th);
            }
            Npth.reportBizException("skylight", th2, string, linkedHashMap);
        }
    }
}
