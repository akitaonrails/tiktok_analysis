package X;

import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.166u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207218166u {
    public static final List<LiveSubMediaModel> LIZ(List<? extends MediaModel> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (MediaModel mediaModel : list) {
                LiveSubMediaModel liveSubMediaModel = new LiveSubMediaModel();
                liveSubMediaModel.setFileLocalUriPath(mediaModel.LJFF());
                liveSubMediaModel.setFileName(mediaModel.fileName);
                liveSubMediaModel.setWidth(mediaModel.width);
                liveSubMediaModel.setHeight(mediaModel.height);
                arrayList.add(liveSubMediaModel);
            }
        }
        return arrayList;
    }
}
