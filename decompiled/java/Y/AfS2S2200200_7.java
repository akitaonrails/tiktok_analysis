package Y;

import X.C09JN;
import X.C0IJT;
import X.C1C7U;
import X.C464950ILd;
import X.C465050ILn;
import X.C474500IjA;
import X.C786410Ut5;
import android.os.Handler;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public class AfS2S2200200_7 implements C09JN {
    public final int $t;
    public long j4;
    public long j5;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS2S2200200_7 afS2S2200200_7, Object obj) {
        C464950ILd c464950ILd = (C464950ILd) afS2S2200200_7.l2;
        long j = afS2S2200200_7.j4;
        long j2 = afS2S2200200_7.j5;
        String str = afS2S2200200_7.s0;
        Handler handler = (Handler) afS2S2200200_7.l3;
        String str2 = afS2S2200200_7.s1;
        c464950ILd.getClass();
        C1C7U.LIZ("RoomManager@6c79.enterRoomWithPatch$3L");
        C465050ILn.LIZIZ(j, "live_room_enter_end");
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_room_enter_interface_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJ(str);
        c474500IjALIZIZ.LJJII(CardStruct.IStatusCode.DEFAULT, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "without_stream");
        c474500IjALIZIZ.LJJII(String.valueOf(jCurrentTimeMillis), "duration");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            w wVar = w.LIZ;
            wVar.getClass();
            c474500IjALIZIZ.LJJII(w.LJIIZILJ(), "log_pb");
            c474500IjALIZIZ.LJJII(w.LJIJI(), "request_id");
            c474500IjALIZIZ.LJJII(wVar.LIZJ(), "live_type");
            c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(4);
            messageObtainMessage.obj = obj;
            C786410Ut5.LJLJJL(handler, messageObtainMessage);
        }
        C465050ILn.LJI(j);
        C464950ILd.LJIIJJI(j, obj, jCurrentTimeMillis, str2);
        C1C7U.LIZIZ("RoomManager@6c79.enterRoomWithPatch$3L");
    }

    public static final void accept$1(AfS2S2200200_7 afS2S2200200_7, Object obj) {
        C464950ILd c464950ILd = (C464950ILd) afS2S2200200_7.l2;
        long j = afS2S2200200_7.j4;
        long j2 = afS2S2200200_7.j5;
        String str = afS2S2200200_7.s0;
        Handler handler = (Handler) afS2S2200200_7.l3;
        String str2 = afS2S2200200_7.s1;
        c464950ILd.getClass();
        C1C7U.LIZ("RoomManager@6c79.enterRoom$3L");
        C465050ILn.LIZIZ(j, "live_room_enter_end");
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_room_enter_interface_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJ(str);
        c474500IjALIZIZ.LJJII(CardStruct.IStatusCode.DEFAULT, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "without_stream");
        c474500IjALIZIZ.LJJII(String.valueOf(jCurrentTimeMillis), "duration");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            w wVar = w.LIZ;
            wVar.getClass();
            c474500IjALIZIZ.LJJII(w.LJIIZILJ(), "log_pb");
            c474500IjALIZIZ.LJJII(w.LJIJI(), "request_id");
            c474500IjALIZIZ.LJJII(wVar.LIZJ(), "live_type");
            c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(4);
            messageObtainMessage.obj = obj;
            C786410Ut5.LJLJJL(handler, messageObtainMessage);
        }
        C465050ILn.LJI(j);
        C464950ILd.LJIIJJI(j, obj, jCurrentTimeMillis, str2);
        C1C7U.LIZIZ("RoomManager@6c79.enterRoom$3L");
    }

    public static final void accept$2(AfS2S2200200_7 afS2S2200200_7, Object obj) {
        C464950ILd c464950ILd = (C464950ILd) afS2S2200200_7.l2;
        long j = afS2S2200200_7.j4;
        long j2 = afS2S2200200_7.j5;
        String str = afS2S2200200_7.s0;
        Handler handler = (Handler) afS2S2200200_7.l3;
        String str2 = afS2S2200200_7.s1;
        c464950ILd.getClass();
        C1C7U.LIZ("RoomManager@6c79.requestEnterConfirm$3L");
        C465050ILn.LIZIZ(j, "live_room_enter_end");
        long jCurrentTimeMillis = System.currentTimeMillis() - j2;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_room_enter_interface_duration", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJ(str);
        c474500IjALIZIZ.LJJII(CardStruct.IStatusCode.DEFAULT, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZIZ.LJJII(CardStruct.IStatusCode.DEFAULT, "without_stream");
        c474500IjALIZIZ.LJJII(String.valueOf(jCurrentTimeMillis), "duration");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZIZ.LJIJ())) {
            c474500IjALIZIZ.LJIL();
            c474500IjALIZIZ.LIZ();
        } else {
            w wVar = w.LIZ;
            wVar.getClass();
            c474500IjALIZIZ.LJJII(w.LJIIZILJ(), "log_pb");
            c474500IjALIZIZ.LJJII(w.LJIJI(), "request_id");
            c474500IjALIZIZ.LJJII(wVar.LIZJ(), "live_type");
            c474500IjALIZIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZIZ.LJJIJLIJ();
            c474500IjALIZIZ.LJIIIIZZ();
            c474500IjALIZIZ.LJJIJL();
        }
        if (handler != null) {
            Message messageObtainMessage = handler.obtainMessage(56);
            messageObtainMessage.obj = obj;
            C786410Ut5.LJLJJL(handler, messageObtainMessage);
        }
        C465050ILn.LJI(j);
        C464950ILd.LJIIJJI(j, obj, jCurrentTimeMillis, str2);
        C1C7U.LIZIZ("RoomManager@6c79.requestEnterConfirm$3L");
    }

    public AfS2S2200200_7(C464950ILd c464950ILd, long j, long j2, String str, Handler handler, String str2, int i) {
        this.$t = i;
        this.l2 = c464950ILd;
        this.j4 = j;
        this.j5 = j2;
        this.s0 = str;
        this.l3 = handler;
        this.s1 = str2;
    }
}
