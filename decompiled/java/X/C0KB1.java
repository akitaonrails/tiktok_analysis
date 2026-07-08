package X;

import com.bytedance.android.live.base.model.emoji.EmoteConfig;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.subscribe.model.FansEmote;
import emotes.model.EmoteListResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KB1, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KB1 {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(FansEmote fansEmote) {
        List<EmoteModel> list;
        List<EmoteModel> emoteList;
        ArrayList arrayList = new ArrayList();
        if (fansEmote != null) {
            EmoteListResult emoteListResult = fansEmote.fansEmoteDetail;
            if (emoteListResult != null && (emoteList = emoteListResult.getEmoteList()) != null) {
                arrayList.addAll(emoteList);
            }
            EmoteConfig emoteConfig = fansEmote.emoteConfig;
            if (emoteConfig != null && (list = emoteConfig.defaultEmoteList) != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    public static List LIZIZ(FansEmote fansEmote) {
        List<EmoteModel> list;
        List<EmoteModel> emoteList;
        ArrayList arrayList = new ArrayList();
        if (fansEmote != null) {
            EmoteListResult emoteListResult = fansEmote.fansEmoteDetail;
            if (emoteListResult != null && (emoteList = emoteListResult.getEmoteList()) != null) {
                arrayList.addAll(emoteList);
            }
            EmoteConfig emoteConfig = fansEmote.emoteConfig;
            if (emoteConfig != null && (list = emoteConfig.defaultEmoteList) != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }
}
