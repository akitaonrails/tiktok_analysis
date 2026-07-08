package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.003f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0165003f {
    public static int LIZ;
    public static boolean LIZIZ;

    public static final List<EmoteWithIndex> LIZ(List<com.bytedance.android.livesdk.chatroom.api.EmoteWithIndex> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (com.bytedance.android.livesdk.chatroom.api.EmoteWithIndex emoteWithIndex : list) {
                EmoteWithIndex emoteWithIndex2 = new EmoteWithIndex();
                emoteWithIndex2.index = (int) emoteWithIndex.index;
                emoteWithIndex2.emoteModel = emoteWithIndex.emote;
                arrayList.add(emoteWithIndex2);
            }
        }
        return arrayList;
    }
}
