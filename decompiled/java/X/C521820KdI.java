package X;

import com.bytedance.android.livesdk.microom.MicRoomAudienceExitWidget;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.model.message.OfficialChannelModifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KdI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521820KdI implements OnMessageListener {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onMessage$0(C521820KdI c521820KdI, IMessage iMessage) {
        ((Function1) c521820KdI.l0).invoke(iMessage);
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final /* synthetic */ void onMessage(IMessage iMessage) {
        switch (this.$t) {
            case 0:
                onMessage$0(this, iMessage);
                break;
            case 1:
                onMessage$1(this, iMessage);
                break;
        }
    }

    public C521820KdI(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onMessage$1(C521820KdI c521820KdI, IMessage iMessage) {
        OfficialChannelInfo officialChannelInfo;
        if ((iMessage instanceof OfficialChannelModifyMessage) && iMessage != null) {
            MicRoomAudienceExitWidget micRoomAudienceExitWidget = (MicRoomAudienceExitWidget) c521820KdI.l0;
            Room room = micRoomAudienceExitWidget.LLILZ;
            if (room != null && (officialChannelInfo = room.officialChannelInfo) != null) {
                officialChannelInfo.endTimeStamp = ((OfficialChannelModifyMessage) iMessage).endTimeStamp;
            }
            micRoomAudienceExitWidget.LLILLJJLI.LJ();
            micRoomAudienceExitWidget.y1();
        }
    }
}
