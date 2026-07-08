package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0BVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C289230BVh {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4668));

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        C353560Dta.LIZ.getClass();
        if (!C353560Dta.LJII(videoPublishEditModel, nLEModel)) {
            return false;
        }
        if (videoPublishEditModel != null && videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate) {
            if (!((Boolean) C273790AoD.LIZ.getValue()).booleanValue() && (nLEModel == null || !C351220Dpo.LIZLLL(nLEModel))) {
                return false;
            }
            return true;
        }
        if (!((Boolean) LIZ.getValue()).booleanValue() && (nLEModel == null || !C351220Dpo.LIZLLL(nLEModel))) {
            return false;
        }
        return true;
    }
}
