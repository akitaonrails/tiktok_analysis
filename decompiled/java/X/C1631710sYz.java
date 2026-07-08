package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sYz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631710sYz {
    public static final boolean LIZ(ShortVideoContext shortVideoContext) {
        if (!C1631730sZ1.LIZ(shortVideoContext)) {
            C1631720sZ0.LIZ.getClass();
            if (!C1631720sZ0.LIZ(shortVideoContext)) {
                C1631740sZ2.LIZ.getClass();
                if (!C1631740sZ2.LIZ(shortVideoContext)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean LIZIZ(ShortVideoContext shortVideoContext) {
        boolean z;
        DuetContext duetContext = shortVideoContext.cameraComponentModel.duetContext;
        String str = duetContext.duetVideoPath;
        String str2 = duetContext.duetAudioPath;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(shortVideoContext.shootWay, "duet") || z || shortVideoContext.isDuetMode || shortVideoContext.LJJIII() || shortVideoContext.cameraComponentModel.isEditorProRecordMode || shortVideoContext.LJJJJIZL() || shortVideoContext.LJJJIL() || shortVideoContext.cameraComponentModel.editorProRecordUsedForPip || shortVideoContext.isStory) {
            return false;
        }
        return true;
    }
}
