package X;

import com.bytedance.android.live.broadcast.api.PanelLayoutTypeChangeEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLayoutDataPbEncoder;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common._LayoutData_ProtoEncoder;

/* JADX INFO: renamed from: X.0amK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C948060amK {
    public final DataChannel LIZ;

    public final void LIZ() {
        Integer num;
        C948100amO c948100amOLIZ = C0H79.LIZ();
        int iIntValue = 1;
        if (c948100amOLIZ != null) {
            c948100amOLIZ.LIZIZ = 1;
        }
        C948100amO c948100amOLIZ2 = C0H79.LIZ();
        if (c948100amOLIZ2 != null) {
            c948100amOLIZ2.LIZJ = 3;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            C948100amO c948100amOLIZ3 = C0H79.LIZ();
            if (c948100amOLIZ3 != null && (num = c948100amOLIZ3.LIZIZ) != null) {
                iIntValue = num.intValue();
            }
            dataChannel.zW(PanelLayoutTypeChangeEvent.class, Integer.valueOf(iIntValue));
        }
    }

    public C948060amK(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public static void LIZIZ(LayoutData layoutData, String str) {
        InterfaceC940060aZQ interfaceC940060aZQ;
        InterfaceC940060aZQ interfaceC940060aZQ2;
        if (layoutData != null) {
            if (LinkMicLayoutDataPbEncoder.isEnable()) {
                byte[] bArrLIZ = C1515990pYL.LIZ(layoutData, new _LayoutData_ProtoEncoder());
                C917100ZyO c917100ZyO = new C917100ZyO("MultiGuestPreviewLiveLayoutRepository", str);
                if (bArrLIZ != null) {
                    InterfaceC937900aVw interfaceC937900aVwCi = C915980Zwa.LJIIIIZZ().Ci(null);
                    if ((interfaceC937900aVwCi instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ2 = (InterfaceC940060aZQ) interfaceC937900aVwCi) != null) {
                        interfaceC940060aZQ2.LJLI(EnumC965730bEp.INNER, bArrLIZ, c917100ZyO, C13BV.INSTANCE);
                        return;
                    }
                    return;
                }
                return;
            }
            InterfaceC937900aVw interfaceC937900aVwCi2 = C915980Zwa.LJIIIIZZ().Ci(null);
            if (!(interfaceC937900aVwCi2 instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwCi2) == null) {
                return;
            }
            interfaceC940060aZQ.LJJLIIJ(layoutData, str, "MultiGuestPreviewLiveLayoutRepository");
        }
    }
}
