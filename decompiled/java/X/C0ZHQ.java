package X;

import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.SkeletonLayoutAssembler;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS258S0300000_14;

/* JADX INFO: renamed from: X.0ZHQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZHQ implements InterfaceC897100ZHg {
    public final EnumC897070ZHd LIZ = EnumC897070ZHd.CUSTOMIZE_LABEL;
    public final boolean LIZIZ = true;
    public final /* synthetic */ SkeletonLayoutAssembler LIZJ;

    @Override // X.InterfaceC897100ZHg
    public final boolean LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC897100ZHg
    public final EnumC897070ZHd getType() {
        return this.LIZ;
    }

    public C0ZHQ(SkeletonLayoutAssembler skeletonLayoutAssembler) {
        this.LIZJ = skeletonLayoutAssembler;
    }

    @Override // X.InterfaceC897100ZHg
    public final List<InterfaceC1233004s4> LIZIZ(List<? extends C869590Y9l> list) {
        SessionInfo sessionInfo;
        String conversationId;
        SessionInfo sessionInfo2;
        IChatCustomizeHelper.LIZ.getClass();
        IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
        if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.isShowLabelOnLastMessage()) {
            C457780HxI c457780HxIFo = this.LIZJ.fo();
            if (c457780HxIFo != null && (sessionInfo = c457780HxIFo.LL) != null && sessionInfo.isFriendChat()) {
                C457780HxI c457780HxIFo2 = this.LIZJ.fo();
                if (c457780HxIFo2 == null || (sessionInfo2 = c457780HxIFo2.LL) == null || (conversationId = sessionInfo2.getConversationId()) == null) {
                    conversationId = "";
                }
                IMAIServiceAPI.LIZ.getClass();
                if (AnonymousClass0629.LIZ().LIZ().LJIL(conversationId)) {
                    return C13BV.INSTANCE;
                }
                C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL(list);
                if (c869590Y9l == null) {
                    return C13BV.INSTANCE;
                }
                if (!C0ZDX.LJJJJIZL(c869590Y9l)) {
                    return C13BV.INSTANCE;
                }
                if (c869590Y9l.getMsgType() != 7 && c869590Y9l.getMsgType() != 1813) {
                    return C13BV.INSTANCE;
                }
                return Collections.singletonList(new C1232804s2(c869590Y9l.getUuid(), new AwS258S0300000_14(this.LIZJ, this, c869590Y9l, 6)));
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }
}
