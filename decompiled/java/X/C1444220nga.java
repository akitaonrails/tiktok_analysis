package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageEncodeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageQualityInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSourceInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444220nga {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(String str) {
        if (str != null && str.length() != 0) {
            return new C0VSJ(str).length() / ((long) 1024);
        }
        return 0L;
    }

    public static void LIZIZ(List list) {
        String sourceEncodeType;
        String sourceEncodeType2;
        String sourceBitDepth;
        int width;
        ImageSourceInfo imageSourceInfo;
        ImageSourceInfo imageSourceInfo2;
        ImageSourceInfo imageSourceInfo3;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SingleImageData singleImageData = (SingleImageData) it2.next();
            String path = null;
            ImageQualityInfo imageQualityInfo = new ImageQualityInfo(null, null, null, null);
            ImageSynthesisResult synthesisData = singleImageData.getSynthesisData();
            ImageQualityInfo imageQualityInfo2 = singleImageData.getImageQualityInfo();
            if (imageQualityInfo2 != null && (imageSourceInfo3 = imageQualityInfo2.getImageSourceInfo()) != null) {
                sourceEncodeType = imageSourceInfo3.getSourceEncodeType();
            } else {
                sourceEncodeType = null;
            }
            imageQualityInfo.setImageSourceInfo(new ImageSourceInfo(null, null, singleImageData.getSrcImageInfo().getWidth(), singleImageData.getSrcImageInfo().getHeight(), sourceEncodeType, LIZ(singleImageData.getSrcImageInfo().getPath()), null, null, 0));
            ImageQualityInfo imageQualityInfo3 = singleImageData.getImageQualityInfo();
            if (imageQualityInfo3 != null && (imageSourceInfo2 = imageQualityInfo3.getImageSourceInfo()) != null) {
                sourceEncodeType2 = imageSourceInfo2.getSourceEncodeType();
            } else {
                sourceEncodeType2 = null;
            }
            ImageQualityInfo imageQualityInfo4 = singleImageData.getImageQualityInfo();
            if (imageQualityInfo4 != null && (imageSourceInfo = imageQualityInfo4.getImageSourceInfo()) != null) {
                sourceBitDepth = imageSourceInfo.getSourceBitDepth();
            } else {
                sourceBitDepth = null;
            }
            int height = 0;
            if (synthesisData != null) {
                width = synthesisData.getWidth();
                height = synthesisData.getHeight();
            } else {
                width = 0;
            }
            if (synthesisData != null) {
                path = synthesisData.getPath();
            }
            imageQualityInfo.setImageEncodeInfo(new ImageEncodeInfo(null, width, height, LIZ(path), sourceEncodeType2, sourceBitDepth, null, null, null, 1, 0, 0));
            singleImageData.setImageQualityInfo(imageQualityInfo);
        }
    }
}
