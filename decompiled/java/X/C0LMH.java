package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LMH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LMH {
    public static final String LIZ = C0LM6.DM_FAKE_MESSAGE.getStepName();
    public static final String LIZIZ = C0LM6.SAVE_DRAFT.getStepName();

    public static String LIZ(String str) {
        String type;
        if (Intrinsics.LJFF(str, LivePreviewCTASmartDisplayManager.DEFAULT)) {
            return "default";
        }
        if (Intrinsics.LJFF(str, "CHECK_CAMEO_PERMISSION")) {
            type = C0LMI.CAMEO_PERMISSION.getType();
        } else if (Intrinsics.LJFF(str, "QUOTA")) {
            type = C0LMI.QUOTA.getType();
        } else if (Intrinsics.LJFF(str, "IMAGE_PREPROCESS")) {
            type = C0LMI.IMAGE_PREPROCESS.getType();
        } else if (Intrinsics.LJFF(str, "IMAGE_UPLOAD")) {
            type = C0LMI.UPLOAD.getType();
        } else if (Intrinsics.LJFF(str, "SERVER")) {
            type = C0LMI.SERVER.getType();
        } else if (Intrinsics.LJFF(str, "PROGRESS")) {
            type = C0LMI.POLLING.getType();
        } else if (Intrinsics.LJFF(str, "DOWNLOAD")) {
            type = C0LMI.DOWNLOAD.getType();
        } else if (Intrinsics.LJFF(str, "POST_PROCESSING")) {
            type = C0LMI.POST_PROCESS.getType();
        } else if (Intrinsics.LJFF(str, LIZ)) {
            type = C0LMI.FAKE_DM_MESSAGE.getType();
        } else {
            if (!Intrinsics.LJFF(str, LIZIZ)) {
                return "";
            }
            type = C0LMI.SAVE_DRAFT.getType();
        }
        if (type != null) {
            return type;
        }
        return "";
    }
}
