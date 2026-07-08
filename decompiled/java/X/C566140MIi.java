package X;

import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.AiMeStyleInfo;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MIi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566140MIi {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        String currentStyleId;
        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
        String str = videoPublishEditModel.creativeModel.recordEffectModel.stickerID;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (!Boolean.valueOf(!z).booleanValue()) {
            str = null;
        }
        c13dvLIZIZ.add(str);
        AISelfModel aISelfModel = videoPublishEditModel.creativeModel.aiSelfModel;
        if (aISelfModel.anchorIconUri != null) {
            c13dvLIZIZ.add(aISelfModel.styleId);
        }
        ArrayList<TimeSpeedModelExtension> finalVideoList = videoPublishEditModel.getFinalVideoList();
        ArrayList arrayList = new ArrayList();
        Iterator<TimeSpeedModelExtension> it2 = finalVideoList.iterator();
        while (it2.hasNext()) {
            AiMeStyleInfo aiMeStyleInfo = it2.next().getAiMeStyleInfo();
            if (aiMeStyleInfo != null && (currentStyleId = aiMeStyleInfo.getCurrentStyleId()) != null) {
                arrayList.add(currentStyleId);
            }
        }
        c13dvLIZIZ.addAll(arrayList);
        return C13LP.LJJLIIIJ(C13LP.LJJJJLI(C1697820uHc.LIZ(c13dvLIZIZ)), ",", null, null, 0, null, null, 62);
    }
}
