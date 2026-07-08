package X;

import com.bytedance.android.livesdk.api.revenue.starcomment.StarCommentDataChannel;
import com.bytedance.android.livesdk.revenue.StarCommentHideEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS221S0300000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0Uhz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779530Uhz {
    public final DataChannel LIZ;
    public final C779520Uhy LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        this.LIZIZ.LJJJJLL(false);
    }

    public C779530Uhz(DataChannel dataChannel, AbstractC776930Udn abstractC776930Udn, InterfaceC779960Uig interfaceC779960Uig, C776870Udh c776870Udh) {
        this.LIZ = dataChannel;
        C779520Uhy c779520Uhy = new C779520Uhy(C497740JfY.LJIIIIZZ(), null, 6, 0);
        this.LIZIZ = c779520Uhy;
        c779520Uhy.h0(true, dataChannel, c776870Udh);
        dataChannel.CQ2(StarCommentDataChannel.class, this, new AwS221S0300000_12(abstractC776930Udn, this, interfaceC779960Uig, 23));
        dataChannel.CQ2(StarCommentHideEvent.class, this, new AwS591S0100000_12(this, 928));
    }
}
