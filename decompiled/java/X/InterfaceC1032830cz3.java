package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1032830cz3 extends InterfaceC1033000czK {
    void addVideoWaterMarker(Object obj, ViewGroup viewGroup);

    void exit();

    InterfaceC1032290cyB getCustomAdVideo();

    InterfaceC1032380cyK getGpMiniCardManager();

    InterfaceC1032330cyF getHostUtils();

    Object getHybridConfig(Object obj, Context context);

    InterfaceC1032240cy6 getLandingPageManager();

    InterfaceC1032210cy3 getRewardAnoleModule(Context context, InterfaceC1032120cxu interfaceC1032120cxu, ViewGroup viewGroup, InterfaceC1032280cyA interfaceC1032280cyA, InterfaceC1016100cY4 interfaceC1016100cY4);

    void handleTap(Context context, Map<EnumC1005430cGr, ? extends Object> map, Object obj);

    void jumpRoute(Context context, C1016240cYI c1016240cYI, Object obj);

    void loadDataSuccess(List<Object> list);

    void onAdSelected(Object obj);

    void report(Context context, Object obj);

    void showToast(Context context);

    void track3rdPartyURL(C1031380cwi c1031380cwi, Object obj);

    void trackEvent(C1031480cws c1031480cws, Object obj);

    void trackEventFromJSB(C1031480cws c1031480cws, Object obj);

    void trackOMSDK(AbstractC1892207b6 abstractC1892207b6, Object obj, Context context);

    void trackUserEvent(String str, JSONObject jSONObject);
}
