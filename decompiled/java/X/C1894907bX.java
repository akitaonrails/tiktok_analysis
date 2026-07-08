package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.List;

/* JADX INFO: renamed from: X.07bX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1894907bX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        StringBuilder sb = new StringBuilder();
        if (aweme != null && (interactStickerStructs = aweme.getInteractStickerStructs()) != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 100) {
                    sb.append("100,");
                }
                if (interactStickerStruct.getType() == 101) {
                    sb.append("101,");
                }
            }
        }
        return sb.toString();
    }
}
