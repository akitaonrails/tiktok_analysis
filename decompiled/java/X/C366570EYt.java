package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366570EYt {
    public static final String LIZIZ(List<TextStickerTextWrap> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        Iterator<TextStickerTextWrap> it2 = list.iterator();
        while (it2.hasNext()) {
            sb.append(it2.next().getText());
        }
        return sb.toString();
    }

    public static boolean LIZ(TextStickerData textStickerData, TextStickerData textStickerData2) {
        if (Math.abs(textStickerData2.getX() - textStickerData.getX()) > 5.0f) {
            return true;
        }
        if (Math.abs(textStickerData2.getY() - textStickerData.getY()) > 5.0f || textStickerData.getFontSize() != textStickerData2.getFontSize() || textStickerData.getColor() != textStickerData2.getColor() || textStickerData.getScale() != textStickerData2.getScale() || textStickerData.getRotation() != textStickerData2.getRotation() || textStickerData.getBgMode() != textStickerData2.getBgMode() || textStickerData.getAlign() != textStickerData2.getAlign() || !Intrinsics.LJFF(LIZIZ(textStickerData.getTextWrapList()), LIZIZ(textStickerData2.getTextWrapList()))) {
            return true;
        }
        return false;
    }
}
