package X;

import com.ss.android.ugc.aweme.creative.model.filter.RecordFilterModel;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import com.ss.android.ugc.aweme.shortvideo.model.RecordSceneExtKt;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0MlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577720MlG {
    public static final void LIZ(ShortVideoContext shortVideoContext) {
        ArrayList<TimeSpeedModelExtension> arrayList;
        CameraLayoutModel cameraLayoutModel = shortVideoContext.creativeModel.cameraLayoutModel;
        if (cameraLayoutModel != null && (arrayList = cameraLayoutModel.captureSegments) != null && !arrayList.isEmpty()) {
            shortVideoContext.creativeModel.recordEffectModel.stickerID = RecordScene.getStickerIdsByModel(arrayList);
            RecordFilterModel recordFilterModel = shortVideoContext.creativeModel.recordFilterModel;
            recordFilterModel.recordFilterLabels = RecordScene.getFilterLabelsByModel(arrayList);
            recordFilterModel.recordFilterIds = RecordScene.getFilterIdsByModel(arrayList);
            recordFilterModel.recordFilterValues = RecordScene.getFilterValuesByModel(arrayList);
            recordFilterModel.recordFilterCategoryKeys = RecordSceneExtKt.getFilterCategoryKeysByModel(arrayList);
            recordFilterModel.recordFilterDefaultInfos = RecordSceneExtKt.getFilterDefaultInfoByModel(shortVideoContext, arrayList);
        }
    }
}
