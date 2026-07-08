package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EMd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363290EMd {
    public static final boolean LIZ(TextMotionModel textMotionModel) {
        if (Intrinsics.LJFF(textMotionModel.motionCategoryId, "caption_animation") && textMotionModel.motionEnabled == 1) {
            return true;
        }
        return false;
    }
}
