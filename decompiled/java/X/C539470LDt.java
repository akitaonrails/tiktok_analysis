package X;

import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539470LDt extends C09AY implements Function1<VideoPublishEditModel, List<? extends String>> {
    public C539470LDt() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends String> invoke(VideoPublishEditModel videoPublishEditModel) {
        ArrayList<String> arrayList;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        if (C1416310mxZ.LJJJJJ(videoPublishEditModel2)) {
            CameraLayoutModel cameraLayoutModel = videoPublishEditModel2.creativeModel.cameraLayoutModel;
            if (cameraLayoutModel != null && (arrayList = cameraLayoutModel.originFilePaths) != null) {
                return arrayList;
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }
}
