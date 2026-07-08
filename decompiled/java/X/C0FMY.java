package X;

import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMentionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0FMY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FMY {
    public static final List<InteractStickerStruct> LIZ(List<TextStickerModel> list) {
        ArrayList arrayList = new ArrayList();
        for (TextStickerModel textStickerModel : list) {
            List<TextMentionModel> mentionList = textStickerModel.getMentionList();
            if (mentionList != null) {
                for (TextMentionModel textMentionModel : mentionList) {
                    textMentionModel.setBaseSticker(textStickerModel.getBaseStickerModel());
                    InteractStickerStruct interactStickerStruct = textMentionModel.getInteractStickerStruct();
                    interactStickerStruct.setNoGlobal(true);
                    arrayList.add(interactStickerStruct);
                }
            }
        }
        return arrayList;
    }
}
