package X;

import android.webkit.WebView;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WeE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828160WeE {
    public static final ConcurrentHashMap<Integer, CopyOnWriteArrayList<C828170WeF>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(int i, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<C828170WeF>> concurrentHashMap = LIZ;
        CopyOnWriteArrayList<C828170WeF> copyOnWriteArrayList = concurrentHashMap.get(Integer.valueOf(i));
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        }
        copyOnWriteArrayList.add(new C828170WeF(str, str2, jSONObject, jSONObject2));
        concurrentHashMap.put(Integer.valueOf(i), copyOnWriteArrayList);
    }

    public static void LIZIZ(WebView webView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (webView != null) {
            LIZ(webView.hashCode(), str, str2, jSONObject, jSONObject2);
        }
    }
}
