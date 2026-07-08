package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C289200BVe {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4474));

    public static final boolean LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        if (((Boolean) LIZ.getValue()).booleanValue()) {
            return true;
        }
        if (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            return true;
        }
        if (nLEModel != null && C346910Dir.LIZ(nLEModel)) {
            return true;
        }
        return false;
    }
}
