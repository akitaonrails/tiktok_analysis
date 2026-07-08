package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0LAx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C538730LAx {
    public static void LIZ(C0LAB c0lab, VideoPublishEditModel videoPublishEditModel) {
        boolean zLIZIZ = C0EYU.LIZIZ(videoPublishEditModel, null, null);
        boolean zLIZ = videoPublishEditModel.creativeModel.autoPickModel.LIZ();
        if (zLIZIZ || zLIZ) {
            c0lab.LJ("autocut_click_from", "aipick_panel");
        }
    }

    public static final String LIZLLL(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel) {
        boolean z;
        AutoPickModel autoPickModel = videoPublishEditModel.creativeModel.autoPickModel;
        boolean z2 = true;
        if (C1874810yt5.LIZ(autoPickModel) && autoPickModel.isFromAutoPickPanel) {
            boolean zLIZIZ = C0EYU.LIZIZ(videoPublishEditModel, nLEModel, null);
            if (nLEModel == null && (nLEModel = videoPublishEditModel.getNleModel()) == null) {
                z = true;
            } else {
                z = false;
                if (C0EYQ.LIZ(nLEModel) != null) {
                    z2 = false;
                }
            }
            if (!zLIZIZ && !z && !z2) {
                return C1428470nHB.LJIILL(videoPublishEditModel);
            }
            return "edit_agent";
        }
        return C1428470nHB.LJIILL(videoPublishEditModel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e2  */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(X.C0LAB r14, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r15, boolean r16, boolean r17, boolean r18, com.bytedance.ies.nle.editor_jni.NLEModel r19) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C538730LAx.LIZIZ(X.0LAB, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean, boolean, boolean, com.bytedance.ies.nle.editor_jni.NLEModel):void");
    }
}
