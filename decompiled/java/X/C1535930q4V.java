package X;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.bytedance.hybrid.spark.security.web_js.core.IFrameOptConfig;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0q4V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535930q4V {
    public static IFrameOptConfig LIZIZ;
    public static C612740O1o LIZJ;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("css", "js", "jpeg", "jpg", "png", "gif", "svg", "webp", "woff", "woff2", "ttf", "otf", "mp4", "webm", "mp3", "ogg", "ico", "json", "xml");

    public static void LIZ(Uri uri) {
        String strLIZ;
        if (LIZ.get() && (strLIZ = C20509081r.LIZ(uri)) != null) {
            C612740O1o c612740O1o = LIZJ;
            C612740O1o c612740O1o2 = null;
            if (c612740O1o == null) {
                c612740O1o = null;
            }
            if (c612740O1o.LIZIZ.contains(strLIZ)) {
                c612740O1o.LIZJ.remove(strLIZ);
                c612740O1o.LIZJ.add(strLIZ);
                return;
            }
            if (c612740O1o.LIZIZ.size() == c612740O1o.LIZ) {
                c612740O1o.LIZIZ.remove(c612740O1o.LIZJ.remove());
            }
            c612740O1o.LIZIZ.add(strLIZ);
            c612740O1o.LIZJ.add(strLIZ);
            C612740O1o c612740O1o3 = LIZJ;
            if (c612740O1o3 != null) {
                c612740O1o2 = c612740O1o3;
            }
            Keva.getRepo("spark_js_inject").storeStringSet("non_html_urls", c612740O1o2.LIZIZ);
        }
    }

    public static boolean LIZIZ(WebResourceRequest webResourceRequest) {
        String strLJJLL;
        List<String> list;
        String path;
        if (!LIZ.get()) {
            return true;
        }
        if (!u.LJIJI(webResourceRequest.getMethod(), "GET", true)) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        C612740O1o c612740O1o = null;
        if (url != null && (path = url.getPath()) != null) {
            String strLJJLJ = a0.LJJLJ('.', path, "");
            String strLJJLL2 = a0.LJJLL('?', strLJJLJ, strLJJLJ);
            strLJJLL = a0.LJJLL('#', strLJJLL2, strLJJLL2);
        } else {
            strLJJLL = null;
        }
        IFrameOptConfig iFrameOptConfig = LIZIZ;
        if (iFrameOptConfig == null || (list = iFrameOptConfig.extensions) == null) {
            list = LIZLLL;
        }
        if (strLJJLL != null && strLJJLL.length() != 0 && list.contains(strLJJLL)) {
            return false;
        }
        IFrameOptConfig iFrameOptConfig2 = LIZIZ;
        if (iFrameOptConfig2 == null || !iFrameOptConfig2.enableNonHtmlCache) {
            return true;
        }
        String strLIZ = C20509081r.LIZ(webResourceRequest.getUrl());
        C612740O1o c612740O1o2 = LIZJ;
        if (c612740O1o2 != null) {
            c612740O1o = c612740O1o2;
        }
        return !C13LP.LJJJJ(strLIZ, c612740O1o.LIZIZ);
    }

    public static Set LIZJ(Set set, int i) {
        C1535710q49 c1535710q49 = C1544850qIt.LIZIZ;
        if (((ArrayList) c1535710q49.LIZ).isEmpty()) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C1535670q45 c1535670q45 : (ArrayList) c1535710q49.LIZ) {
            List<String> list = c1535670q45.LIZ;
            int i2 = c1535670q45.LIZIZ;
            for (Object obj : (ArrayList) list) {
                if (set.contains(obj) && (i == i2 || i == 3)) {
                    linkedHashSet.add(obj);
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }
}
