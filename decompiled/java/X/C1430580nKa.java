package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.DuetAndStitchRouterConfig;
import com.ss.android.ugc.aweme.shortvideo.model.TransAnchorData;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1430580nKa {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        List<TransAnchorData> list;
        AnchorTransData autoSelectedAnchor = videoPublishEditModel.getCreativeFlowData().getAutoSelectedAnchor();
        if (autoSelectedAnchor != null) {
            C1440005kM.LIZ(new C1799610wvn(autoSelectedAnchor));
        }
        List<AnchorTransData> anchors = videoPublishEditModel.getCreativeFlowData().getAnchors();
        if (anchors != null) {
            Iterator<AnchorTransData> it2 = anchors.iterator();
            while (it2.hasNext()) {
                C1440005kM.LIZ(new C1799610wvn(it2.next()));
            }
        }
        DuetAndStitchRouterConfig duetAndStitchRouterConfig = videoPublishEditModel.creativeModel.initialModel.duetAndStitchRouterConfig;
        if (duetAndStitchRouterConfig != null && (list = duetAndStitchRouterConfig.anchors) != null) {
            Iterator<TransAnchorData> it3 = list.iterator();
            while (it3.hasNext()) {
                C1440005kM.LIZ(new C1799610wvn(C1446700nka.LIZ(it3.next())));
            }
        }
    }

    public static CreateAnchorInfo LIZIZ(AnchorTransData anchorTransData) {
        String str;
        List<String> urlList;
        int i = anchorTransData.businessType;
        String str2 = anchorTransData.title;
        String strValueOf = "";
        if (str2 == null) {
            str2 = "";
        }
        String str3 = anchorTransData.url;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = anchorTransData.language;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = anchorTransData.anchorContent;
        UrlModel urlModel = anchorTransData.anchorIcon;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            str = (String) ListProtector.get(urlList, 0);
        } else {
            str = null;
        }
        Integer num = anchorTransData.anchorIconRaw;
        Long l = anchorTransData.addTime;
        String str6 = anchorTransData.extra;
        String str7 = anchorTransData.subtype;
        boolean z = anchorTransData.canDelete;
        String str8 = anchorTransData.pluginInfo;
        int i2 = C19510811Va.LLL;
        if (C1430410nKJ.LIZIZ().contains(Integer.valueOf(anchorTransData.businessType))) {
            strValueOf = String.valueOf(anchorTransData.id);
        }
        return new CreateAnchorInfo(i, str2, str3, str4, str5, str, l, str6, strValueOf, "", str7, Boolean.valueOf(z), true, str8, null, false, num);
    }
}
