package X;

import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.InputImage;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;

/* JADX INFO: renamed from: X.0Ldu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547680Ldu {
    public static InputBlock LIZ(InputImage inputImage) {
        return new InputBlock("image", null, null, inputImage, null, false);
    }

    public static InputBlock LIZIZ(MentionDataItem mentionDataItem) {
        return new InputBlock("mention", null, mentionDataItem, null, null, false);
    }

    public static InputBlock LIZJ(String str) {
        return new InputBlock("text", str, null, null, null, false);
    }
}
