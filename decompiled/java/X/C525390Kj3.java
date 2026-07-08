package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Kj3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525390Kj3 {
    public static final ConcurrentHashMap<String, C525000KiQ> LIZ = new ConcurrentHashMap<>();

    public static ArrayList LIZ(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            TikTokMediaModel tikTokMediaModelLJIJ = null;
            if (i >= 0) {
                TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) obj;
                try {
                    MediaModel mediaModelClone = tikTokMediaModel.clone();
                    if (mediaModelClone instanceof TikTokMediaModel) {
                        tikTokMediaModelLJIJ = (TikTokMediaModel) mediaModelClone;
                    }
                    if (tikTokMediaModelLJIJ == null) {
                        tikTokMediaModelLJIJ = tikTokMediaModel.LJIJ();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    tikTokMediaModelLJIJ = tikTokMediaModel.LJIJ();
                }
                tikTokMediaModelLJIJ.originLocalUriPath = tikTokMediaModel.originLocalUriPath;
                tikTokMediaModelLJIJ.mediaPickerAbsolutePath = tikTokMediaModel.mediaPickerAbsolutePath;
                tikTokMediaModelLJIJ.startTime = tikTokMediaModel.startTime;
                tikTokMediaModelLJIJ.endTime = tikTokMediaModel.endTime;
                tikTokMediaModelLJIJ.speed = tikTokMediaModel.speed;
                tikTokMediaModelLJIJ.selectIndex = i2;
                tikTokMediaModelLJIJ.abRollIndex = tikTokMediaModel.abRollIndex;
                tikTokMediaModelLJIJ.mediaIndex = i;
                tikTokMediaModelLJIJ.mediaRatio = tikTokMediaModel.mediaRatio;
                tikTokMediaModelLJIJ.clipDuration = tikTokMediaModel.clipDuration;
                tikTokMediaModelLJIJ.isFromRecord = tikTokMediaModel.isFromRecord;
                tikTokMediaModelLJIJ.canClip = tikTokMediaModel.canClip;
                tikTokMediaModelLJIJ.newFlag = tikTokMediaModel.newFlag;
                tikTokMediaModelLJIJ.selectionScenario = tikTokMediaModel.selectionScenario;
                tikTokMediaModelLJIJ.isLiveRecordingsGuide = tikTokMediaModel.isLiveRecordingsGuide;
                arrayList.add(tikTokMediaModelLJIJ);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return arrayList;
    }
}
