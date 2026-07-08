package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129070fUH {
    public static CountDownTimerC1129830fVV LIZ;
    public static Boolean LIZIZ;

    public static void LIZJ() {
        CountDownTimerC1129830fVV countDownTimerC1129830fVV = LIZ;
        if (countDownTimerC1129830fVV != null) {
            countDownTimerC1129830fVV.cancel();
        }
        LIZ = null;
    }

    public static String LIZ(DataChannel dataChannel) {
        GiftSuspension giftSuspension;
        boolean z;
        boolean z2;
        if (dataChannel != null && (giftSuspension = (GiftSuspension) dataChannel.gg0(C1130470fWX.class)) != null) {
            if (giftSuspension.status == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int iLIZIZ = ((int) ((giftSuspension.endTime - (C158B.LIZIZ() / 1000)) / ((long) 60))) + 1;
                return C497740JfY.LJIIL(2131755528, iLIZIZ, Integer.valueOf(iLIZIZ));
            }
            if (giftSuspension != null) {
                if (giftSuspension.status == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return C497740JfY.LJIJI(2131841874);
                }
                if (giftSuspension != null && giftSuspension.status == 3) {
                    if (Intrinsics.LJFF(LIZIZ, Boolean.TRUE)) {
                        int iLIZIZ2 = ((int) ((giftSuspension.endTime - (C158B.LIZIZ() / 1000)) / ((long) 86400))) + 1;
                        return C497740JfY.LJIIL(2131755529, iLIZIZ2, Integer.valueOf(iLIZIZ2));
                    }
                    return C497740JfY.LJIJI(2131841874);
                }
                return "";
            }
            return "";
        }
        return "";
    }

    public static boolean LIZIZ(DataChannel dataChannel) {
        GiftSuspension giftSuspension;
        int i;
        if (dataChannel != null && (giftSuspension = (GiftSuspension) dataChannel.gg0(C1130470fWX.class)) != null) {
            if ((giftSuspension.status == 1 && giftSuspension.endTime > C158B.LIZIZ() / 1000) || (i = giftSuspension.status) == 2 || (i == 3 && giftSuspension.endTime > C158B.LIZIZ() / 1000)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LIZLLL(Context context, DataChannel dataChannel) {
        if (dataChannel == null) {
            return;
        }
        String strLIZ = LIZ(dataChannel);
        boolean zBooleanValue = false;
        if (context == null) {
            C766270U4b.LJIIJJI(strLIZ);
        } else {
            C497340Jeu.LIZ(context, strLIZ, Integer.valueOf(R.drawable.eqq), false, 12);
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        GiftSuspension giftSuspension = (GiftSuspension) dataChannel.gg0(C1130470fWX.class);
        if (giftSuspension != null && room != null) {
            Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            C1128760fTm.LJIIJ.getClass();
            C1128760fTm.LJJJJIZL(zBooleanValue, room, giftSuspension);
        }
    }

    public static void LJ(View view, DataChannel dataChannel) {
        Room room;
        boolean zBooleanValue;
        if (dataChannel == null) {
            return;
        }
        String strLIZ = LIZ(dataChannel);
        if (view == null) {
            C766270U4b.LJIIJJI(strLIZ);
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJFF(R.drawable.eqq);
            c1389890mGx.LJIIJ(strLIZ);
            c1389890mGx.LJIIJJI();
        }
        GiftSuspension giftSuspension = (GiftSuspension) dataChannel.gg0(C1130470fWX.class);
        if (giftSuspension != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            Boolean bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            C1128760fTm.LJIIJ.getClass();
            C1128760fTm.LJJJJIZL(zBooleanValue, room, giftSuspension);
        }
    }
}
