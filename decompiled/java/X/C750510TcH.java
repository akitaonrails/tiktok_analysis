package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.adminsetting.IAdminSettingService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0TcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750510TcH extends AbstractC752950TgD implements InterfaceC750500TcG {
    public final Room LLILZ;
    public final User LLILZIL;
    public final C498340JgW LLILZLL;
    public final FragmentManager LLIZ;
    public final DataChannel LLIZLLLIL;

    @Override // X.AbstractC752950TgD
    public final Function1<Boolean, Unit> LJII() {
        return new AwS591S0100000_12(this, 926);
    }

    public final void LJIIIZ() {
        InterfaceC750520TcI interfaceC750520TcI;
        UserAttr userAttr = this.LLILZIL.getUserAttr();
        boolean z = userAttr != null && userAttr.isMuted;
        InterfaceC750520TcI interfaceC750520TcI2 = this.LLILLJJLI;
        if ((interfaceC750520TcI2 == null || interfaceC750520TcI2.LIZ() != z) && (interfaceC750520TcI = this.LLILLJJLI) != null) {
            interfaceC750520TcI.LIZIZ(z);
        }
        InterfaceC750520TcI interfaceC750520TcI3 = this.LLILLJJLI;
        if (interfaceC750520TcI3 != null) {
            interfaceC750520TcI3.LIZJ(true);
        }
    }

    @Override // X.InterfaceC750500TcG
    public final void ca(Exception exc) {
        LJIIIZ();
    }

    @Override // X.InterfaceC750500TcG
    public final void cd(long j, boolean z) {
        String msgContent;
        FragmentManager fragmentManager;
        long msgId;
        if (z) {
            C498340JgW c498340JgW = this.LLILZLL;
            if (c498340JgW == null || (msgContent = c498340JgW.getMsgContent()) == null) {
                msgContent = "";
            }
            DataChannel dataChannel = this.LLIZLLLIL;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                IAdminSettingService iAdminSettingService = (IAdminSettingService) C1161920gLG.LIZJ(IAdminSettingService.class);
                long id = this.LLILZ.getId();
                C498340JgW c498340JgW2 = this.LLILZLL;
                if (c498340JgW2 != null) {
                    msgId = c498340JgW2.getMsgId();
                } else {
                    msgId = 0;
                }
                iAdminSettingService.M22(id, msgContent, fragmentManager, 1, Long.valueOf(msgId));
            }
        }
        LJIIIZ();
    }

    public C750510TcH(Room room, User user, C498340JgW c498340JgW, FragmentManager fragmentManager, DataChannel dataChannel) {
        this.LLILZ = room;
        this.LLILZIL = user;
        this.LLILZLL = c498340JgW;
        this.LLIZ = fragmentManager;
        this.LLIZLLLIL = dataChannel;
    }
}
