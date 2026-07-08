package X;

import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.broadcast.PreviewBlockInfoChannel;
import com.bytedance.android.livesdk.broadcast.ShakeBlockTipEvent;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0UPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771730UPb implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 100;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        Object objGg0;
        RoomCreateInfo roomCreateInfo;
        List<CreateInfoPerceptionMessage> list;
        DataChannel dataChannel = c500840JkY.LIZIZ;
        Object objGg02 = null;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(PreviewBlockInfoChannel.class);
        } else {
            objGg0 = null;
        }
        boolean z2 = true;
        if (objGg0 != null) {
            c500840JkY.LIZIZ.LC0(ShakeBlockTipEvent.class, EnumC771760UPe.NORMAL_BLOCK);
            return true;
        }
        DataChannel dataChannel2 = c500840JkY.LIZIZ;
        if (dataChannel2 != null) {
            objGg02 = dataChannel2.gg0(LiveModeChannel.class);
        }
        DataChannel dataChannel3 = c500840JkY.LIZIZ;
        if (dataChannel3 != null && (roomCreateInfo = (RoomCreateInfo) dataChannel3.gg0(RoomCreateInfoChannel.class)) != null && (list = roomCreateInfo.perceptionMessages) != null) {
            Iterator<CreateInfoPerceptionMessage> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                CreateInfoPerceptionMessage next = it2.next();
                C771780UPg c771780UPg = InterfaceC771800UPi.LIZIZ;
                int i = next.accessType;
                c771780UPg.getClass();
                if (C771780UPg.LIZ(i) == objGg02) {
                    if (next == null) {
                        break;
                    }
                }
            }
            z2 = false;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
