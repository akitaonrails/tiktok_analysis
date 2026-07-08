package X;

import X.C1910200zoA;
import X.C1C7U;
import X.C2201941BFw;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.im.service.model.IMChatExt;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zoA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910200zoA {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final IIMService LIZLLL = C1336205Ku.LIZ(false);
    public IMUser LJ;

    public final void LIZ() {
        if (this.LJ == null) {
            return;
        }
        IMChatExt iMChatExt = new IMChatExt();
        iMChatExt.ext = this.LIZJ;
        EnterChatParams enterChatParams = new EnterChatParams(this.LIZ, this.LJ);
        enterChatParams.setChatExt(iMChatExt);
        if (Intrinsics.LJFF(this.LIZJ, "click_dm_invitation")) {
            enterChatParams.setEnterFromForMob("link");
            enterChatParams.setEnterMethodForMob("click_dm_invitation");
        }
        this.LIZLLL.getImChatService().LJIILLIIL(enterChatParams, null);
    }

    public final void LIZIZ() {
        String str = this.LIZIZ;
        if (str == null || str.length() == 0) {
            return;
        }
        C2277881EDy c2277881EDy = C2277881EDy.LIZIZ;
        final Looper mainLooper = Looper.getMainLooper();
        c2277881EDy.queryProfileWithId(new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.commercialize.im.OpenChatExt$OpenChatTask$startGetUserInfo$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("OpenChatExt$OpenChatTask@7335.startGetUserInfo$1");
                Object messageObj = HandlerHook.getMessageObj(message.obj);
                if (messageObj == null) {
                    C1C7U.LIZIZ("OpenChatExt$OpenChatTask@7335.startGetUserInfo$1");
                    return;
                }
                if (messageObj instanceof User) {
                    C1910200zoA c1910200zoA = this.LL;
                    IMUser.Companion.getClass();
                    IMUser iMUserLIZJ = C2201941BFw.LIZJ((User) messageObj);
                    synchronized (c1910200zoA) {
                        c1910200zoA.LJ = iMUserLIZJ;
                        c1910200zoA.LIZ();
                    }
                }
                C1C7U.LIZIZ("OpenChatExt$OpenChatTask@7335.startGetUserInfo$1");
            }
        }, this.LIZIZ, 0, EnumC1254690ikt.IM_OPEN_CHAT_EXT);
    }

    public C1910200zoA(Context context, String str, String str2) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
