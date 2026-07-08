package X;

import Y.AObjectS360S0100000_17;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenFastScrollReleaseTypeSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0eyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109300eyO implements InterfaceC1109310eyP, OnIMMessageListener, InterfaceC1109340eyS {
    public static final /* synthetic */ int LLILZLL = 0;
    public final boolean LL;
    public IMessageManager LLILLJJLI;
    public final List<IMessage> LLILLL = new ArrayList();
    public final List<Integer> LLILZ = new ArrayList();
    public OnIMMessageListener LLILZIL;

    @Override // X.InterfaceC1109310eyP
    public final void LIZIZ() {
        this.LLILZIL = null;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "public_screen";
    }

    @Override // X.InterfaceC1109310eyP
    public final void destroy() {
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
    }

    @Override // X.InterfaceC1109340eyS
    public final boolean LIZ() {
        return this.LL;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.SYNC;
    }

    @Override // X.InterfaceC1109340eyS
    public final void LIZLLL(int i) {
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(i, (OnIMMessageListener) this);
        }
    }

    @Override // X.InterfaceC1109340eyS
    public final void LJIIZILJ(int i) {
        IMessageManager iMessageManager = this.LLILLJJLI;
        if (iMessageManager != null) {
            iMessageManager.addStickyMessageListener(i, (OnIMMessageListener) this);
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null) {
            OnIMMessageListener onIMMessageListener = this.LLILZIL;
            if (onIMMessageListener != null) {
                onIMMessageListener.onMessage(iMessage);
            } else {
                ((ArrayList) this.LLILLL).add(iMessage);
            }
        }
    }

    public C1109300eyO(DataChannel dataChannel, boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1109310eyP
    public final void LIZJ(OnIMMessageListener onIMMessageListener, AObjectS360S0100000_17 aObjectS360S0100000_17) {
        if (this.LLILZIL == null) {
            this.LLILZIL = onIMMessageListener;
            for (IMessage iMessage : (ArrayList) this.LLILLL) {
                if (C13LQ.LJIILLIIL(iMessage.getMethodName(), LivePublicScreenFastScrollReleaseTypeSetting.INSTANCE.getValue())) {
                    onIMMessageListener.onMessage(iMessage);
                }
            }
            Iterator it2 = ((ArrayList) this.LLILZ).iterator();
            while (it2.hasNext()) {
                aObjectS360S0100000_17.invoke(Integer.valueOf(((Number) it2.next()).intValue()));
            }
            ((ArrayList) this.LLILLL).clear();
            ((ArrayList) this.LLILZ).clear();
        }
    }
}
