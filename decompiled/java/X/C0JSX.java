package X;

import com.bytedance.android.live.room.RefreshUserInRoomEvent;
import com.bytedance.android.livesdk.model.message.UserStatsMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.0JSX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSX extends C0JSV<C0JSP> implements OnMessageListener {
    public IMessageManager LL;
    public final DataChannel LLILLJJLI;

    @Override // X.C0JSV
    public final void detachView() {
        super.detachView();
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    public C0JSX(DataChannel dataChannel) {
        this.LLILLJJLI = dataChannel;
    }

    @Override // X.C0JSV
    public final void attachView(C0JSP c0jsp) {
        super.attachView(c0jsp);
        IMessageManager iMessageManager = (IMessageManager) this.LLILLJJLI.gg0(C776250Uch.class);
        this.LL = iMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.USER_STATS.getIntType(), this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof UserStatsMessage)) {
            return;
        }
        UserStatsMessage userStatsMessage = (UserStatsMessage) iMessage;
        if (userStatsMessage.mUserId == UserService.getInstance().user().getCurrentUserId() && 1 == userStatsMessage.mActionType) {
            UserService.getInstance().user().LJIIL("UserStatsPresenter_refreshUser").LIZ(new C476750Imn());
            this.LLILLJJLI.FQ2(RefreshUserInRoomEvent.class);
        }
    }
}
