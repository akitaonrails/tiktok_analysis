package X;

import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.EmoteChatResult;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import java.util.List;

/* JADX INFO: renamed from: X.0f6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public interface InterfaceC1114450f6h extends InterfaceC919320a1y {
    void Ah2(Barrage barrage);

    void Fj0(EmoteChatResult emoteChatResult);

    void HE1(ChatMessage chatMessage, C1114480f6k c1114480f6k, int i, long j, long j2);

    void Kw();

    void Mh1(boolean z);

    void PQ0(boolean z);

    void Wr0(ChatMessage chatMessage);

    void XG2(Exception exc);

    void ea0(C1114480f6k c1114480f6k, Exception exc);

    void oo1();

    void wX0(Exception exc);

    C474500IjA xy1(String str, C1114480f6k c1114480f6k, int i, User user, long j, List<EmoteWithIndex> list, long j2);
}
