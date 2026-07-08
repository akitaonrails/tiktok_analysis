package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.models.MessageBubbleStyle;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZY7, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZY7 {
    public static C21620819jS LIZ(Bitmap bitmap, MessageBubbleStyle messageBubbleStyle) {
        Pair pair;
        Pair pair2;
        MessageBubbleStyle.MessageBubbleStyleData messageBubbleStyleData = messageBubbleStyle.data;
        float f = messageBubbleStyleData.imageSize.width;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (f <= 1.0f) {
            pair = new Pair(fValueOf2, fValueOf);
        } else {
            MessageBubbleStyle.MessageBubbleStyleData.StretchPosition stretchPosition = messageBubbleStyleData.stretchPosition;
            float fMin = Math.min(stretchPosition.x0, f - stretchPosition.x1);
            MessageBubbleStyle.MessageBubbleStyleData messageBubbleStyleData2 = messageBubbleStyle.data;
            MessageBubbleStyle.MessageBubbleStyleData.StretchPosition stretchPosition2 = messageBubbleStyleData2.stretchPosition;
            pair = new Pair(Float.valueOf(Math.min(1.0f, Math.max(0.0f, fMin / f))), Float.valueOf(Math.min(1.0f, Math.max(0.0f, Math.max(stretchPosition2.x0, messageBubbleStyleData2.imageSize.width - stretchPosition2.x1) / f))));
        }
        MessageBubbleStyle.MessageBubbleStyleData messageBubbleStyleData3 = messageBubbleStyle.data;
        float f2 = messageBubbleStyleData3.imageSize.height;
        if (f2 <= 1.0f) {
            pair2 = new Pair(fValueOf2, fValueOf);
        } else {
            MessageBubbleStyle.MessageBubbleStyleData.StretchPosition stretchPosition3 = messageBubbleStyleData3.stretchPosition;
            float fMin2 = Math.min(stretchPosition3.y0, f2 - stretchPosition3.y1);
            MessageBubbleStyle.MessageBubbleStyleData messageBubbleStyleData4 = messageBubbleStyle.data;
            MessageBubbleStyle.MessageBubbleStyleData.StretchPosition stretchPosition4 = messageBubbleStyleData4.stretchPosition;
            pair2 = new Pair(Float.valueOf(Math.min(1.0f, Math.max(0.0f, fMin2 / f2))), Float.valueOf(Math.min(1.0f, Math.max(0.0f, Math.max(stretchPosition4.y0, messageBubbleStyleData4.imageSize.height - stretchPosition4.y1) / f2))));
        }
        MessageBubbleStyle.MessageBubbleStyleData.ImageSize imageSize = messageBubbleStyle.data.imageSize;
        return new C21620819jS(bitmap, imageSize.width, imageSize.height, ((Number) pair.getFirst()).floatValue(), ((Number) pair2.getFirst()).floatValue(), ((Number) pair.getSecond()).floatValue(), ((Number) pair2.getSecond()).floatValue(), messageBubbleStyle.data.tileToResize);
    }
}
