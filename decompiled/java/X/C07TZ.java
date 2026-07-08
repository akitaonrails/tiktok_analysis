package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.07TZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07TZ {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(100, 101, 111);

    public static final String LIZ(Aweme aweme) {
        String strValueOf;
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        if (interactStickerStructs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
            if (LIZ.contains(Integer.valueOf(interactStickerStruct.getType())) && (strValueOf = String.valueOf(interactStickerStruct.getType())) != null) {
                arrayList.add(strValueOf);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }
}
