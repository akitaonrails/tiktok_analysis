package X;

import Y.ARunnableS104S0100000_4;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309050C9n {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("prefetchId", str);
        jSONObject.put("prefetchType", str2);
        jSONObject.put("isHit", i);
        jSONObject.put("enterMethod", str3);
        jSONObject.put("server_degrade_flag", i2);
        jSONObject.put("degrade_exp", i3);
        jSONObject.put("stream_degrade_flag", i4);
        C823050WQl.LIZIZ().execute(new ARunnableS104S0100000_4(jSONObject, 166));
    }
}
