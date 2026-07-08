package X;

import com.bytedance.android.live.liveinteract.api.TicketInfoUpdateEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aby, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941640aby extends AbstractC941590abt {
    public final Function0<Unit> LLILZLL;
    public C19487111Lx LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.AbstractC941590abt
    public final String LIZ() {
        return "SeiDataSource";
    }

    @Override // X.AbstractC941590abt
    public final void onDestroy() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public C941640aby(DataChannel dataChannel, C941630abx c941630abx, C941800acE c941800acE, AwS559S0100000_15 awS559S0100000_15, AwS559S0100000_15 awS559S0100000_152) {
        super(dataChannel, c941630abx, c941800acE, awS559S0100000_152);
        this.LLILZLL = awS559S0100000_15;
        if (dataChannel != null) {
            dataChannel.CQ2(TicketInfoUpdateEvent.class, this, new AwS381S0200000_15(this, c941630abx, 167));
        }
    }
}
