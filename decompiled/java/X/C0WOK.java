package X;

import android.webkit.WebView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WOK, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WOK {
    public static final ConcurrentHashMap<Object, List<C0WOO>> LIZ = new ConcurrentHashMap<>();

    public static void LIZ(WebView webView) {
        List list;
        Iterator<C0WOO> it2;
        Object tag = webView.getTag(R.id.web_client_jsi_flag);
        if (C19719512Dh.LJI(tag) && (list = (List) tag) != null) {
            for (Object obj : list) {
                List<C0WOO> list2 = LIZ.get(obj);
                if (list2 != null && (it2 = list2.iterator()) != null) {
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().LIZ, webView)) {
                            it2.remove();
                        }
                    }
                }
                ConcurrentHashMap<Object, List<C0WOO>> concurrentHashMap = LIZ;
                List<C0WOO> list3 = concurrentHashMap.get(obj);
                if (list3 == null || list3.isEmpty()) {
                    concurrentHashMap.remove(obj);
                }
            }
        }
    }
}
