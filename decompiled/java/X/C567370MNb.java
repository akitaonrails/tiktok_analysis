package X;

import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C567370MNb {
    public static List LIZ(List list, Pair pair) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            arrayList.add(new MentionStickerModel(new BaseStickerModel(0, 0, EnumC1466150oFx.MENTION, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, iIntValue, iIntValue2, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, iIntValue * (-0.5f), iIntValue2 * (-0.5f), 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -14686213, 15, null), null, null, null, null, null, null, false, false, true, false));
        }
        return arrayList;
    }
}
