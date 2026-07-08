package X;

import android.content.Context;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cz4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1032840cz4 extends InterfaceC1033030czN {
    void exit();

    InterfaceC1031720cxG getGpMiniCardManager();

    C1008080cL8 getHybridConfig(Object obj, Context context);

    void handleTap(Context context, Map<EnumC1005420cGq, ? extends Object> map, Object obj);

    void loadDataSuccess(Object obj);

    void report(Context context, Object obj);

    void showToast(Context context);

    void track3rdPartyURL(C1031370cwh c1031370cwh, Object obj);

    void trackEvent(C1031310cwb c1031310cwb, Object obj);

    void trackOMSDK(AbstractC1891907b3 abstractC1891907b3, Object obj, Context context);

    void trackUserEvent(String str, JSONObject jSONObject);
}
