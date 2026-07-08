package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1403490mct {
    public static final List<AiMeStyleInfo> LIZ(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
        while (it2.hasNext()) {
            AiMeStyleInfo aiMeStyleInfo = it2.next().getAiMeStyleInfo();
            if (aiMeStyleInfo != null) {
                arrayList.add(aiMeStyleInfo);
            }
        }
        return arrayList;
    }
}
