package X;

import android.content.Context;
import android.util.Pair;
import android.view.KeyEvent;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: renamed from: X.0IHF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IHF implements C0IHG {
    public final /* synthetic */ LivePlayFragment LIZ;

    public C0IHF(LivePlayFragment livePlayFragment) {
        this.LIZ = livePlayFragment;
    }

    public final void LIZ(Pair<String, String> pair) {
        LivePlayFragment livePlayFragment = this.LIZ;
        KeyEvent.Callback callback = livePlayFragment.L0;
        if (pair != null && callback != null) {
            String str = (String) pair.first;
            String str2 = (String) pair.second;
            Context context = livePlayFragment.getContext();
            if (context != null && this.LIZ.g1 != null && (callback instanceof C0IEW) && str != null && !str.isEmpty()) {
                EncourageGoLiveCard encourageGoLiveCard = new EncourageGoLiveCard();
                if (str.startsWith("exit")) {
                    encourageGoLiveCard.style = 105;
                } else if (str.startsWith("default")) {
                    encourageGoLiveCard.style = 107;
                    encourageGoLiveCard.bgMusicUrl = str2;
                } else {
                    encourageGoLiveCard.style = 104;
                    encourageGoLiveCard.bgMusicUrl = str2;
                }
                this.LIZ.oT((C0IEW) callback, context, encourageGoLiveCard);
            }
        }
    }
}
