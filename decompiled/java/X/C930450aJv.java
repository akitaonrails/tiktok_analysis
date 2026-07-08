package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.MultiGuestModeratorGuideProfileInviteEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCellDismissEvent;
import com.bytedance.android.livesdk.model.message.MultiGuestGuideMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930450aJv {
    public final DataChannel LIZ;
    public MultiGuestGuideMessage LIZIZ;
    public int LIZJ;
    public final List<Runnable> LIZLLL;
    public final C11NJ LJ;

    public C930450aJv(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        dataChannel.CQ2(MultiGuestModeratorGuideProfileInviteEvent.class, this, new AwS594S0100000_15(this, 218));
        dataChannel.CQ2(MultiGuestOperationCellDismissEvent.class, this, new AwS594S0100000_15(this, 219));
        this.LIZLLL = new ArrayList();
        this.LJ = new C11NJ();
    }

    public static final int LIZ(C934190aPx c934190aPx) {
        String str;
        Integer numLJIIJJI;
        PosIdentity posIdentity = c934190aPx.getWindow().getPosIdentity();
        if (posIdentity != null && (str = posIdentity.value) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null) {
            return numLJIIJJI.intValue();
        }
        return Integer.MAX_VALUE;
    }
}
