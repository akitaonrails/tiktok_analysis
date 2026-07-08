package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C458060Hxk extends C2217421BqW implements Function0<String> {
    public C458060Hxk(Object obj) {
        super(0, obj, ChatroomEmojiPanelAssem.class, "provideStickerPanelEventVMKey", "provideStickerPanelEventVMKey()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        SessionInfo sessionInfo;
        String conversationId;
        C457780HxI c457780HxI = (C457780HxI) ((ChatroomEmojiPanelAssem) this.receiver).LLJJJIL.getValue();
        return (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || (conversationId = sessionInfo.getConversationId()) == null) ? "" : conversationId;
    }
}
