package X;

import com.bytedance.android.livesdk.dataChannel.PIPModeChangeEvent;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0eGF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081930eGF implements OnMessageListener {
    public final DataChannel LL;
    public boolean LLILLJJLI;
    public String LLILLL = "";
    public LinkLayerMessage LLILZ;
    public boolean LLILZIL;

    public C1081930eGF(DataChannel dataChannel) {
        this.LL = dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(PIPModeChangeEvent.class, this, new AwS596S0100000_17(this, 701));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (iMessage != null && (iMessage instanceof LinkLayerMessage)) {
            this.LLILZ = (LinkLayerMessage) iMessage;
        }
    }
}
