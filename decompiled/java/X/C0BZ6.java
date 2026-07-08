package X;

import com.bytedance.ies.nle.editor_jni.NLESegmentHSLFilter;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0BZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BZ6 {
    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (((Boolean) C273700Ao4.LIZ.getValue()).booleanValue() || (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate && ((Boolean) C273630Anx.LIZ.getValue()).booleanValue())) {
            return true;
        }
        return false;
    }

    public static final boolean LIZIZ(NLESegmentHSLFilter nLESegmentHSLFilter) {
        if (nLESegmentHSLFilter.getHue() != 0.5d || nLESegmentHSLFilter.getSaturation() != 0.5d || nLESegmentHSLFilter.getLightness() != 0.5d) {
            return true;
        }
        return false;
    }
}
