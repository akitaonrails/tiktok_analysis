package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0UCX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCX {
    public static boolean LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
        if (liveEffect != null) {
            return liveEffect.equals(liveEffect2);
        }
        return false;
    }

    public static UrlModel LIZIZ(String str, com.ss.android.ugc.effectmanager.common.model.UrlModel urlModel) {
        if (str != null && str.length() != 0 && urlModel != null) {
            HashMap<String, UrlModel> map = LiveEffect.LJ;
            UrlModel urlModel2 = map.get(str);
            if (urlModel2 == null) {
                urlModel2 = new UrlModel();
                urlModel2.urlList = urlModel.getUrlList();
                urlModel2.uri = urlModel.getUri();
                map.put(str, urlModel2);
            }
            return urlModel2;
        }
        return LiveEffect.LIZLLL;
    }
}
