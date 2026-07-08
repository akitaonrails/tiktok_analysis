package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import java.util.List;

/* JADX INFO: renamed from: X.0lqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373660lqm {
    public static String LIZ(Aweme aweme) {
        boolean z;
        UrlModel urlModel;
        List<String> urlList;
        UrlModel urlModel2;
        List<String> urlList2;
        UrlModel urlModel3;
        List<String> urlList3;
        UrlModel urlModel4;
        List<String> urlList4;
        ACLCommonShare downloadGeneral;
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null && (downloadGeneral = awemeACLShare.getDownloadGeneral()) != null && downloadGeneral.getTranscode() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (C444960Hcc.LIZIZ()) {
                NowPostInfo nowPostInfo = aweme.nowPostInfo;
                if (nowPostInfo == null || (urlModel4 = nowPostInfo.compositeImageRtlWithoutWatermark) == null || (urlList4 = urlModel4.getUrlList()) == null || !(!urlList4.isEmpty())) {
                    return null;
                }
                return (String) ListProtector.get(urlList4, 0);
            }
            NowPostInfo nowPostInfo2 = aweme.nowPostInfo;
            if (nowPostInfo2 == null || (urlModel3 = nowPostInfo2.compositeImageLtrWithoutWatermark) == null || (urlList3 = urlModel3.getUrlList()) == null || !(!urlList3.isEmpty())) {
                return null;
            }
            return (String) ListProtector.get(urlList3, 0);
        }
        if (C444960Hcc.LIZIZ()) {
            NowPostInfo nowPostInfo3 = aweme.nowPostInfo;
            if (nowPostInfo3 == null || (urlModel2 = nowPostInfo3.watermarkImageRTL) == null || (urlList2 = urlModel2.getUrlList()) == null || !(!urlList2.isEmpty())) {
                return null;
            }
            return (String) ListProtector.get(urlList2, 0);
        }
        NowPostInfo nowPostInfo4 = aweme.nowPostInfo;
        if (nowPostInfo4 == null || (urlModel = nowPostInfo4.watermarkImageLTR) == null || (urlList = urlModel.getUrlList()) == null || !(!urlList.isEmpty())) {
            return null;
        }
        return (String) ListProtector.get(urlList, 0);
    }
}
