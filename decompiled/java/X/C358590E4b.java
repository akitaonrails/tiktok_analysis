package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358590E4b {
    public static final List<String> LIZ(VideoPublishEditModel videoPublishEditModel) {
        String second;
        List<LyricStickerModel> list = videoPublishEditModel.creativeModel.stickerModel.lyricStickerModels;
        ArrayList arrayList = new ArrayList();
        Iterator<LyricStickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            Pair<String, String> pairLIZJ = C0FGD.LIZJ(it2.next().getLyricStyleUrs());
            if (pairLIZJ != null && (second = pairLIZJ.getSecond()) != null && (!a0.LJJJIL(second))) {
                arrayList.add(second);
            }
        }
        return C13LP.LJJJJI(arrayList);
    }
}
