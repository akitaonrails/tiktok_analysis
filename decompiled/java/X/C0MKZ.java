package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MKZ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MKZ {
    public static final String LIZ(ForwardMedia forwardMedia) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        PhotoModeImageInfo photoModeImageInfo = forwardMedia.photoModeImageInfo;
        if (photoModeImageInfo == null || (imageList = photoModeImageInfo.getImageList()) == null || (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(0, imageList)) == null || (urlModel = photoModeImageUrlModel.displayImageNoWatermark) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
            return "";
        }
        return str;
    }

    public static final String LIZJ(ForwardMedia forwardMedia) {
        List<String> playAddressList;
        String str;
        ForwardVideo forwardVideo = forwardMedia.video;
        if (forwardVideo == null || (playAddressList = forwardVideo.getPlayAddressList()) == null || (str = (String) C13LP.LJJJLL(playAddressList)) == null) {
            return "";
        }
        return str;
    }

    public static final <K extends Class<?>, V> V LIZIZ(ForwardMedia forwardMedia, K k, Function0<? extends V> function0) {
        if (forwardMedia.dataMap == null) {
            forwardMedia.dataMap = new LinkedHashMap();
        }
        Map<Class<?>, Object> map = forwardMedia.dataMap;
        if (map != null) {
            V v = (V) map.get(k);
            if (v == null) {
                V vInvoke = function0.invoke();
                map.put(k, vInvoke);
                return vInvoke;
            }
            return v;
        }
        return null;
    }
}
