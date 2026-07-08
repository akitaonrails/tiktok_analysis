package X;

import android.os.Build;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubClaimPointsOptSetting;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import java.time.Instant;
import java.time.ZoneId;

/* JADX INFO: renamed from: X.0ebv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1095370ebv {
    public final DataChannel LIZ;
    public final InterfaceC497601wk LIZIZ;
    public AnonymousClass0956 LIZJ;
    public long LIZLLL;

    public final void LIZIZ(int i) {
        IMessageManager iMessageManager;
        C1095140ebY c1095140ebY;
        long j;
        String strLJIIL;
        long j2;
        long j3;
        long jDoubleValue;
        long j4;
        String strLJIIL2;
        long j5;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        DataChannel dataChannel2 = this.LIZ;
        if (dataChannel2 != null) {
            c1095140ebY = (C1095140ebY) dataChannel2.gg0(FansClubChannel.class);
        } else {
            c1095140ebY = null;
        }
        long j6 = 0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (c1095140ebY != null) {
                        j6 = c1095140ebY.LJIIJ;
                    }
                    if (LiveFansClubClaimPointsOptSetting.INSTANCE.enableExpirePointMessage()) {
                        if (j6 != this.LIZLLL || this.LIZJ == null) {
                            this.LIZLLL = j6;
                            AnonymousClass0956 anonymousClass0956 = this.LIZJ;
                            if (anonymousClass0956 != null) {
                                anonymousClass0956.LIZIZ(null);
                            }
                            this.LIZJ = C23250099c.LIZLLL(this.LIZIZ, null, null, new C1096150edB(this, j6, iMessageManager, null), 3);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            LiveFansClubClaimPointsOptSetting liveFansClubClaimPointsOptSetting = LiveFansClubClaimPointsOptSetting.INSTANCE;
            if (!liveFansClubClaimPointsOptSetting.enableNewJoinCompleteTaskMessage()) {
                return;
            }
            if (c1095140ebY != null) {
                j3 = c1095140ebY.LJIIIZ;
            } else {
                j3 = 0;
            }
            if (Build.VERSION.SDK_INT < 26) {
                return;
            }
            if (!Instant.ofEpochSecond(j3).atZone(ZoneId.systemDefault()).toLocalDate().isEqual(Instant.ofEpochSecond(C158B.LIZJ()).atZone(ZoneId.systemDefault()).toLocalDate()) || c1095140ebY == null || c1095140ebY.LJIIJJI <= 0) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0JT6<Double> c0jt6 = InterfaceC1093910eZZ.LLLLLZ;
            Double dLIZ = c0jt6.LIZ();
            if (dLIZ != null) {
                jDoubleValue = (long) dLIZ.doubleValue();
            } else {
                jDoubleValue = 0;
            }
            if (jCurrentTimeMillis - jDoubleValue <= liveFansClubClaimPointsOptSetting.getSystemMessageBlockIntervalMillis()) {
                return;
            }
            C518180KTw.LJIJJ(this.LIZ, 2);
            c0jt6.LIZJ(Double.valueOf(System.currentTimeMillis()));
            if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                if (c1095140ebY != null) {
                    j5 = c1095140ebY.LJIIJJI;
                } else {
                    j5 = 0;
                }
                int i2 = (int) j5;
                Object[] objArr = new Object[1];
                if (c1095140ebY != null) {
                    j6 = c1095140ebY.LJIIJJI;
                }
                objArr[0] = String.valueOf(j6);
                strLJIIL2 = C497740JfY.LJIIL(2131755836, i2, objArr);
            } else {
                if (c1095140ebY != null) {
                    j4 = c1095140ebY.LJIIJJI;
                } else {
                    j4 = 0;
                }
                int i3 = (int) j4;
                Object[] objArr2 = new Object[1];
                if (c1095140ebY != null) {
                    j6 = c1095140ebY.LJIIJJI;
                }
                objArr2[0] = String.valueOf(j6);
                strLJIIL2 = C497740JfY.LJIIL(2131756003, i3, objArr2);
            }
            if (iMessageManager == null) {
                return;
            }
            iMessageManager.insertMessage(LIZ("1", strLJIIL2, C13BV.INSTANCE), true);
            return;
        }
        if (!LiveFansClubClaimPointsOptSetting.INSTANCE.enableFirstTimeClaimMessage() || c1095140ebY == null || c1095140ebY.LJIIJJI <= 0) {
            return;
        }
        C518180KTw.LJIJJ(this.LIZ, 1);
        if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
            if (c1095140ebY != null) {
                j2 = c1095140ebY.LJIIJJI;
            } else {
                j2 = 0;
            }
            int i4 = (int) j2;
            Object[] objArr3 = new Object[1];
            if (c1095140ebY != null) {
                j6 = c1095140ebY.LJIIJJI;
            }
            objArr3[0] = String.valueOf(j6);
            strLJIIL = C497740JfY.LJIIL(2131755835, i4, objArr3);
        } else {
            if (c1095140ebY != null) {
                j = c1095140ebY.LJIIJJI;
            } else {
                j = 0;
            }
            int i5 = (int) j;
            Object[] objArr4 = new Object[1];
            if (c1095140ebY != null) {
                j6 = c1095140ebY.LJIIJJI;
            }
            objArr4[0] = String.valueOf(j6);
            strLJIIL = C497740JfY.LJIIL(2131756002, i5, objArr4);
        }
        if (iMessageManager == null) {
            return;
        }
        iMessageManager.insertMessage(LIZ("nokey", strLJIIL, C13BV.INSTANCE), true);
    }

    public C1095370ebv(DataChannel dataChannel, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = dataChannel;
        this.LIZIZ = interfaceC497601wk;
    }

    public final RoomMessage LIZ(String str, String str2, C13BV c13bv) {
        Room room;
        long id;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        Text text = new Text();
        text.key = str;
        text.defaultPattern = str2;
        TextFormat textFormat = new TextFormat();
        textFormat.color = "#ffffff";
        text.defaultFormat = textFormat;
        text.pieces = c13bv;
        CommonMessageData commonMessageData = new CommonMessageData();
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        commonMessageData.roomId = id;
        commonMessageData.showMsg = true;
        commonMessageData.messageId = C158B.LIZ();
        commonMessageData.foldType = 0L;
        commonMessageData.createTime = C158B.LIZ();
        commonMessageData.displayText = text;
        RoomMessage roomMessage = new RoomMessage();
        roomMessage.isLocalInsertMsg = true;
        roomMessage.scene = "user_join_fans";
        roomMessage.baseMessage = commonMessageData;
        return roomMessage;
    }
}
