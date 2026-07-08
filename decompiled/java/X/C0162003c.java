package X;

import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.model.QuickChatInfo;
import com.bytedance.android.livesdk.model.message.QuickChatContent;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.003c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0162003c {
    public static C195900pB LIZ(QuickChatInfo quickChatInfo, String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : (ArrayList) C13LP.LJJJJLI(quickChatInfo.list)) {
            QuickChatContent quickChatContent = new QuickChatContent();
            quickChatContent.type = 0;
            quickChatContent.text = str2;
            arrayList.add(quickChatContent);
        }
        ArrayList<EmoteModel> arrayList2 = (ArrayList) C13LP.LJJJJLI(quickChatInfo.emoteList);
        boolean z2 = !arrayList2.isEmpty();
        for (EmoteModel emoteModel : arrayList2) {
            QuickChatContent quickChatContent2 = new QuickChatContent();
            quickChatContent2.type = 1;
            quickChatContent2.emote = emoteModel;
            arrayList.add(quickChatContent2);
        }
        return new C195900pB(z2, quickChatInfo.duration, quickChatInfo.priority, arrayList, z, str);
    }
}
