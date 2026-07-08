package X;

import android.content.Context;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.livesetting.gift.LiveAnchorGiftDisableSetting;
import com.bytedance.android.livesdk.message.proto.DisplayControl;
import com.bytedance.android.livesdk.message.proto.ShowResult;
import com.bytedance.android.livesdk.model.message.PrivilegeAdvanceMessage;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086150eN3 {
    public InterfaceC1087420eP6[] LIZ;
    public InterfaceC1087420eP6[] LIZIZ = new InterfaceC1087420eP6[0];

    public C1086150eN3(Context context, final DataChannel dataChannel) {
        this.LIZ = new InterfaceC1087420eP6[]{new InterfaceC1087420eP6(dataChannel) { // from class: X.0eN2
            public final DataChannel LIZ;

            @Override // X.InterfaceC1087420eP6
            public final boolean LIZIZ(String str) {
                return true;
            }

            {
                this.LIZ = dataChannel;
            }

            @Override // X.InterfaceC1087420eP6
            public final boolean LIZ(IMessage iMessage) {
                DisplayControl displayControl;
                Map<Integer, ShowResult> map;
                boolean value;
                Long lValueOf;
                if ((iMessage instanceof PrivilegeAdvanceMessage) && (displayControl = ((PrivilegeAdvanceMessage) iMessage).control) != null && (map = displayControl.targetGroupShowRst) != null) {
                    for (Map.Entry<Integer, ShowResult> entry : map.entrySet()) {
                        int iIntValue = entry.getKey().intValue();
                        if (entry.getValue().banned) {
                            if (iIntValue != 1) {
                                if (iIntValue != 2) {
                                    if (iIntValue != 3) {
                                        if (iIntValue != 4) {
                                            if (iIntValue == 5) {
                                                value = ((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).zS();
                                            } else {
                                                continue;
                                            }
                                        } else {
                                            C1087250eOp roomStatus = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).getRoomStatus();
                                            DataChannel dataChannel2 = this.LIZ;
                                            if (dataChannel2 != null) {
                                                lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2));
                                            } else {
                                                lValueOf = null;
                                            }
                                            value = roomStatus.LIZ(lValueOf);
                                        }
                                    } else {
                                        value = ((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).lm1();
                                    }
                                } else {
                                    value = C500260Jjc.LJIIZILJ(this.LIZ);
                                }
                            } else {
                                value = LiveAnchorGiftDisableSetting.INSTANCE.getValue();
                            }
                            if (value) {
                                C1087430eP7.LIZ = "target_group_intercept";
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }, new InterfaceC1087420eP6(dataChannel) { // from class: X.0eN5
            public final DataChannel LIZ;
            public final C08CX LIZIZ = C08CX.INSTANCE;

            {
                this.LIZ = dataChannel;
            }

            @Override // X.InterfaceC1087420eP6
            public final boolean LIZ(IMessage iMessage) {
                DataChannel dataChannel2;
                if (!(iMessage instanceof PrivilegeAdvanceMessage) || (dataChannel2 = this.LIZ) == null || !Intrinsics.LJFF(dataChannel2.gg0(C0TZM.class), Boolean.FALSE)) {
                    return false;
                }
                C1087430eP7.LIZ = "business_intercept";
                return true;
            }

            @Override // X.InterfaceC1087420eP6
            public final boolean LIZIZ(String str) {
                return this.LIZIZ.contains(str);
            }
        }, new InterfaceC1087420eP6(dataChannel) { // from class: X.0eN4
            public final DataChannel LIZ;
            public final C08CX LIZIZ = C08CX.INSTANCE;

            {
                this.LIZ = dataChannel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1087420eP6
            public final boolean LIZ(IMessage iMessage) {
                Long lValueOf;
                if (iMessage instanceof PrivilegeAdvanceMessage) {
                    DataChannel dataChannel2 = this.LIZ;
                    Long lValueOf2 = null;
                    if (dataChannel2 != null) {
                        lValueOf = Long.valueOf(C500260Jjc.LJJLIIIJ(dataChannel2));
                    } else {
                        lValueOf = null;
                    }
                    CommonMessageData commonMessageData = ((BaseMessage) iMessage).baseMessage;
                    if (commonMessageData != null) {
                        lValueOf2 = Long.valueOf(commonMessageData.roomId);
                    }
                    if (!Intrinsics.LJFF(lValueOf, lValueOf2)) {
                        C1087430eP7.LIZ = "room_mismatch_intercept";
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1087420eP6
            public final boolean LIZIZ(String str) {
                return this.LIZIZ.contains(str);
            }
        }, new C1086120eN0(dataChannel)};
    }
}
