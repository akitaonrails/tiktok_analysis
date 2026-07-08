package X;

import Y.AfS181S0100000_12;
import android.util.Log;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0TLM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TLM implements InterfaceC778470UgH<RedEnvelopMessage> {
    public final C11NJ LIZ = new C11NJ();
    public DataChannel LIZIZ;

    @Override // X.InterfaceC778470UgH
    public final int LIZ() {
        return C001A.RED_ENVELOPE_MESSAGE.getIntType();
    }

    @Override // X.InterfaceC778470UgH
    public final void onRelease() {
        this.LIZ.dispose();
    }

    @Override // X.InterfaceC778470UgH
    public final void LIZIZ(DataChannel dataChannel) {
        this.LIZIZ = dataChannel;
    }

    @Override // X.InterfaceC778470UgH
    public final void onMessage(IMessage iMessage) {
        MessageRedEnvelopInfo messageRedEnvelopInfo;
        Integer num;
        Long lValueOf;
        if (iMessage instanceof RedEnvelopMessage) {
            RedEnvelopMessage redEnvelopMessage = (RedEnvelopMessage) iMessage;
            if (redEnvelopMessage.display == 1 && (messageRedEnvelopInfo = redEnvelopMessage.envelopeInfo) != null && (num = messageRedEnvelopInfo.unpackAt) != null && (lValueOf = Long.valueOf(num.intValue())) != null) {
                lValueOf.longValue();
                this.LIZ.LIZ(C11NZ.LJLJJLL(Long.valueOf(lValueOf.longValue() - (System.currentTimeMillis() / 1000)).longValue(), TimeUnit.SECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS181S0100000_12(this, 146), new C09JN() { // from class: X.0TID
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("GameTreasureNotice@855f.onMessage$2");
                        C20441214yg.LJ("GameTreasureNotice", Log.getStackTraceString((Throwable) obj));
                        C1C7U.LIZIZ("GameTreasureNotice@855f.onMessage$2");
                    }
                }));
            }
        }
    }
}
