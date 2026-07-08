package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.chatroom.event.SelectRoomStickerEvent;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01S3, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01S3 {
    public static DataChannel LIZ;
    public static final C2252331DDr LIZIZ = C09IR.LIZIZ(0, 0, null, 7);

    public static void LIZ(String str, String str2, String str3, Function2 function2) {
        if (C500260Jjc.LJJJI(Boolean.valueOf(!((ArrayList) C342601Uq.LJFF()).isEmpty())) && C342701Ur.LIZ != null) {
            RoomSticker roomStickerLJ = C342601Uq.LJ(str);
            if (roomStickerLJ != null) {
                roomStickerLJ.LIZJ = str2;
                roomStickerLJ.source = str3;
                if (function2 != null) {
                    function2.invoke(Boolean.TRUE, "success");
                }
                DataChannel dataChannel = LIZ;
                if (dataChannel != null) {
                    dataChannel.LC0(SelectRoomStickerEvent.class, roomStickerLJ);
                    return;
                }
                return;
            }
            if (function2 == null) {
                return;
            }
            function2.invoke(Boolean.FALSE, "sticker not found");
            return;
        }
        if (!C500260Jjc.LJJJI(Boolean.valueOf(!((ArrayList) C342601Uq.LJFF()).isEmpty()))) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJIIL(LIZ);
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJIIJJI(LIZ);
        } else if (C342701Ur.LIZ == null) {
            C342601Uq.LJII();
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01S1(str, str2, null, function2), 2);
    }
}
