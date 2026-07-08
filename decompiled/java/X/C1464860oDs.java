package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0oDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464860oDs {
    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        CreateAnchorInfo next;
        PublishExtensionModel publishExtensionModelFromString = PublishExtensionModel.fromString(videoPublishEditModel.commerceData);
        List<CreateAnchorInfo> list = publishExtensionModelFromString.createAnchorInfos;
        if (list != null) {
            Iterator<CreateAnchorInfo> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == 19) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            list.remove(next);
        }
        videoPublishEditModel.commerceData = PublishExtensionModel.toString(publishExtensionModelFromString);
    }
}
