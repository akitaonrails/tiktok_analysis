package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.livesdk.model.message.KaraokeQueueListMessage;
import com.bytedance.android.livesdk.model.message.KaraokeQueueMessage;
import com.bytedance.android.livesdk.model.message.KaraokeRedDotMessage;
import com.bytedance.android.livesdk.model.message.KaraokeReqMessage;
import com.bytedance.android.livesdk.model.message.KaraokeSwitchMessage;
import com.bytedance.android.livesdk.model.message.KaraokeYouSingReqMessage;
import com.bytedance.android.livesdkapi.depend.model.live.KaraokeInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* JADX INFO: renamed from: X.01TY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01TY implements OnMessageListener {
    public final LifecycleOwner LL;
    public final KaraokeViewModel LLILLJJLI;

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage instanceof KaraokeQueueListMessage) {
            C20441214yg.LIZIZ("KaraokeManager", "receive queuelist msg");
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C338601Tc(this, (KaraokeQueueListMessage) iMessage, null), 3);
            return;
        }
        if (iMessage instanceof KaraokeQueueMessage) {
            C20441214yg.LIZIZ("KaraokeManager", "receive queue msg");
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C01TZ((KaraokeQueueMessage) iMessage, this, null), 3);
            return;
        }
        if (iMessage instanceof KaraokeReqMessage) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C01TX((KaraokeReqMessage) iMessage, this, null), 3);
            return;
        }
        if (iMessage instanceof KaraokeYouSingReqMessage) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C01TW((KaraokeYouSingReqMessage) iMessage, this, null), 3);
        } else if (iMessage instanceof KaraokeSwitchMessage) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C338401Ta((KaraokeSwitchMessage) iMessage, this, null), 3);
        } else {
            if (!(iMessage instanceof KaraokeRedDotMessage)) {
                return;
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C338501Tb(this, (KaraokeRedDotMessage) iMessage, null), 3);
        }
    }

    public C01TY(int i, DataChannel dataChannel, LifecycleOwner lifecycleOwner, KaraokeViewModel karaokeViewModel, KaraokeInfo karaokeInfo) {
        Boolean boolValueOf;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = karaokeViewModel;
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            if (i == 1) {
                iMessageManager.addAsyncMessageListener(C001A.KARAOKE_REQ_MESSAGE.getIntType(), this);
                iMessageManager.addAsyncMessageListener(C001A.KARAOKE_YOU_SING_REQ_MESSAGE.getIntType(), this);
                iMessageManager.addAsyncMessageListener(C001A.KARAOKE_QUEUE_LIST_MESSAGE.getIntType(), this);
                iMessageManager.addAsyncMessageListener(C001A.KARAOKE_RED_DOT_MESSAGE.getIntType(), this);
                return;
            }
            if (i != 2) {
                return;
            }
            if (karaokeInfo != null) {
                boolValueOf = Boolean.valueOf(karaokeInfo.displayKaraoke);
            } else {
                boolValueOf = null;
            }
            if (!C500260Jjc.LJJJI(boolValueOf)) {
                return;
            }
            iMessageManager.addAsyncMessageListener(C001A.KARAOKE_QUEUE_LIST_MESSAGE.getIntType(), this);
            iMessageManager.addAsyncMessageListener(C001A.KARAOKE_SWITCH_MESSAGE.getIntType(), this);
            iMessageManager.addAsyncMessageListener(C001A.KARAOKE_REQ_MESSAGE.getIntType(), this);
            iMessageManager.addAsyncMessageListener(C001A.KARAOKE_YOU_SING_REQ_MESSAGE.getIntType(), this);
        }
    }
}
