package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomEmojiPanelAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatroomPanelKnob;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0HwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457180HwK extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ChatroomEmojiPanelAssem LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ ChatroomEmojiPanelAssem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C457180HwK(ChatroomEmojiPanelAssem chatroomEmojiPanelAssem, boolean z, int i, ChatroomEmojiPanelAssem chatroomEmojiPanelAssem2) {
        super(0);
        this.LL = chatroomEmojiPanelAssem;
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = chatroomEmojiPanelAssem2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String conversationId;
        InterfaceC457220HwO c457190HwL;
        SessionInfo sessionInfo;
        C454640HsE c454640HsE = IMStickerApi.LIZ;
        List<EnumC449720HkI> listLJI = c454640HsE.LIZIZ().getImStickerInputPanelService().LJI();
        if (listLJI.isEmpty()) {
            listLJI = C449730HkJ.LIZ();
        }
        boolean z = listLJI.size() > 1;
        C457780HxI c457780HxI = (C457780HxI) this.LL.LLJJJIL.getValue();
        if (c457780HxI == null || (sessionInfo = c457780HxI.LL) == null || (conversationId = sessionInfo.getConversationId()) == null) {
            conversationId = "";
        }
        C443950Haz c443950Haz = this.LLILLJJLI ? (C443950Haz) EventBus.LIZLLL().LJIJJLI(C443950Haz.class) : null;
        C457780HxI c457780HxI2 = (C457780HxI) this.LL.LLJJJIL.getValue();
        C457240HwQ c457240HwQ = InterfaceC457220HwO.LIZ;
        C457780HxI c457780HxI3 = (C457780HxI) this.LL.LLJJJIL.getValue();
        SessionInfo sessionInfo2 = c457780HxI3 != null ? c457780HxI3.LL : null;
        c457240HwQ.getClass();
        if (sessionInfo2 == null) {
            c457190HwL = C449680HkE.LIZIZ;
        } else if (sessionInfo2.isGroupChat()) {
            c457190HwL = new C457190HwL(new C457200HwM(sessionInfo2.getConversationId()));
        } else {
            String singleChatFromUserId = sessionInfo2.getSingleChatFromUserId();
            c457190HwL = singleChatFromUserId == null ? C449680HkE.LIZIZ : new C457190HwL(new C457210HwN(singleChatFromUserId));
        }
        EnumC443930Hax enumC443930Hax = this.LLILLJJLI ? EnumC443930Hax.LAZY : EnumC443930Hax.DEFAULT;
        C457780HxI c457780HxI4 = (C457780HxI) this.LL.LLJJJIL.getValue();
        c454640HsE.LIZIZ().getImStickerInputPanelService().LJFF(R.id.q1l, null, this.LLILZ, new C449650HkB(listLJI, this.LLILLL, R.attr.zm, null, null, conversationId, z, false, null, null, C13LE.LIZ(ChatroomPanelKnob.class), true, c443950Haz, null, c457780HxI2, null, null, false, c457190HwL, null, null, null, null, null, null, null, null, null, false, enumC443930Hax, c457780HxI4 != null && c457780HxI4.LLILZ, null, null, null, null, null, null, 2146387864, 254));
        return Unit.LIZ;
    }
}
