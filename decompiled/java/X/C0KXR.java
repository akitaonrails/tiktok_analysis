package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.SubscribeInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.MemberMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KXR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXR implements InterfaceC1108270ewj, OnIMMessageListener {
    public final Room LL;
    public final Context LLILLJJLI;
    public final C1108220ewe LLILLL;
    public final DataChannel LLILZ;
    public IMessageManager LLILZIL;

    @Override // X.InterfaceC1108270ewj
    public final int LIZJ() {
        return 1;
    }

    @Override // X.InterfaceC1108270ewj
    public final void LIZLLL() {
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "sub_only_live";
    }

    @Override // X.InterfaceC1108270ewj
    public final void onHide() {
    }

    @Override // X.InterfaceC1108270ewj
    public final void onShow() {
    }

    @Override // X.InterfaceC1108270ewj
    public final boolean LIZIZ() {
        Room room;
        User owner;
        SubscribeInfo subscribeInfo;
        return C494680Jac.LJIILL(this.LLILZ) && (room = this.LL) != null && (owner = room.getOwner()) != null && (subscribeInfo = owner.getSubscribeInfo()) != null && subscribeInfo.status == 3 && C0KQ3.LIZIZ(this.LL) > 0;
    }

    @Override // X.InterfaceC1108270ewj
    public final void LJ() {
        DataChannel dataChannel = this.LLILZ;
        IMessageManager iMessageManager = dataChannel != null ? (IMessageManager) dataChannel.gg0(C776250Uch.class) : null;
        this.LLILZIL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.MEMBER.getIntType(), (OnIMMessageListener) this);
        }
    }

    public final Function0<Unit> LJFF() {
        return new C0KXS(this);
    }

    public final String LJII() {
        return C786410Ut5.j4(C497740JfY.LJIJI(2131840940), Arrays.copyOf(new Object[]{Long.valueOf(C0KQ3.LIZIZ(this.LL))}, 1));
    }

    @Override // X.InterfaceC1108270ewj
    public final void onUnload() {
        IMessageManager iMessageManager = this.LLILZIL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
    }

    public static final String LJI() {
        return C497740JfY.LJIJI(2131840938);
    }

    public static final String LJIIIIZZ() {
        return C497740JfY.LJIJI(2131853353);
    }

    @Override // X.InterfaceC1108270ewj
    public final C1108330ewp LIZ() {
        return new C1108330ewp(LJIIIIZZ(), LJII(), LJI(), LJFF());
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if ((iMessage instanceof MemberMessage) && ((MemberMessage) iMessage).action == 28) {
            Room room = this.LL;
            if (room != null) {
                room.liveSubOnly = 1L;
            }
            if (LIZIZ()) {
                this.LLILLL.LJ(this);
            }
        }
    }

    public C0KXR(Room room, Context context, C1108220ewe c1108220ewe, DataChannel dataChannel) {
        this.LL = room;
        this.LLILLJJLI = context;
        this.LLILLL = c1108220ewe;
        this.LLILZ = dataChannel;
    }
}
