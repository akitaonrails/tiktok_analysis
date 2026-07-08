package X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.effectmanager.effect.model.PlayAddress;
import java.util.List;

/* JADX INFO: renamed from: X.0n2A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419160n2A {
    public static final Video LIZ(InterfaceC1419170n2B interfaceC1419170n2B) {
        List<String> urlList;
        Video video = new Video();
        VideoUrlModel videoUrlModelLIZ = interfaceC1419170n2B.LIZ();
        if (videoUrlModelLIZ != null && (urlList = videoUrlModelLIZ.getUrlList()) != null && !urlList.isEmpty()) {
            List<String> urlList2 = videoUrlModelLIZ.getUrlList();
            if (C989140bqa.LIZ()) {
                int size = urlList2.size();
                for (int i = 0; i < size; i++) {
                    String str = (String) ListProtector.get(urlList2, i);
                    if (str != null && str.length() != 0) {
                        try {
                            Uri uri = UriProtector.parse(str);
                            if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "device_type"))) {
                                StringBuilder sb = new StringBuilder(str);
                                if (TextUtils.isEmpty(uri.getQuery())) {
                                    sb.append("?");
                                } else {
                                    sb.append("&");
                                }
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("device_type=");
                                sbLIZ.append(Build.MODEL);
                                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                                urlList2.set(i, sb.toString());
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
        }
        video.setPlayAddr(videoUrlModelLIZ);
        video.setSourceId(interfaceC1419170n2B.getMvId());
        return video;
    }

    public static final UrlModel LIZIZ(PlayAddress playAddress) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(playAddress.getUri());
        List<String> url_list = playAddress.getUrl_list();
        if (url_list == null) {
            url_list = C13BV.INSTANCE;
        }
        urlModel.setUrlList(url_list);
        Long data_size = playAddress.getData_size();
        if (data_size != null) {
            urlModel.setSize(data_size.longValue());
        }
        Integer width = playAddress.getWidth();
        if (width != null) {
            urlModel.setWidth(width.intValue());
        }
        Integer height = playAddress.getHeight();
        if (height != null) {
            urlModel.setHeight(height.intValue());
        }
        urlModel.setUrlKey(playAddress.getUrl_key());
        urlModel.setFileHash(playAddress.getFile_hash());
        return urlModel;
    }
}
