package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ScmLabelInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.AVUploadMiscInfoStruct;

/* JADX INFO: renamed from: X.0Ru4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710580Ru4 {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        AVUploadMiscInfoStruct uploadMiscInfoStruct;
        ScmLabelInfo scmLabelInfo;
        if (videoItemParams != null && videoItemParams.getAweme() != null && (uploadMiscInfoStruct = AwemeExtKt.getUploadMiscInfoStruct(videoItemParams.getAweme())) != null && (scmLabelInfo = uploadMiscInfoStruct.scmLabelInfo) != null && !TextUtils.isEmpty(scmLabelInfo.content) && !TextUtils.isEmpty(scmLabelInfo.learnMoreUrl)) {
            return true;
        }
        return false;
    }
}
