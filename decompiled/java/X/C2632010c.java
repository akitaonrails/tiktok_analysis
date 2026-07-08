package X;

import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.LiveStreamGoal;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.android.livesdk.livesetting.gift.LiveGoalCapsuleUserServerSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameObsLiveGoalAndGuessingAdaptSetting;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.RoomMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.wishlistv2.dialog.LiveStreamGoalMessageDialog;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.010c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2632010c implements OnMessageListener {
    public final LiveRecyclableWidget LL;
    public final DataChannel LLILLJJLI;
    public FragmentManager LLILLL;
    public final C11NJ LLILZ = new C11NJ();
    public final IMessageManager LLILZIL;
    public LiveStreamGoalMessageDialog LLILZLL;
    public final HashMap<String, Double> LLIZ;
    public final ArrayList<C238100vz> LLIZLLLIL;
    public boolean LLJ;
    public final HashSet<Integer> LLJI;

    public final boolean LIZJ() {
        return C500260Jjc.LJIIZILJ(this.LLILLJJLI);
    }

    public final boolean LIZLLL() {
        Room room;
        DataChannel dataChannel = this.LLILLJJLI;
        LiveMode streamType = (dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : room.getStreamType();
        if (C781520UlC.LIZJ(streamType) || C781520UlC.LJI(streamType)) {
            return true;
        }
        return TtliveGameObsLiveGoalAndGuessingAdaptSetting.INSTANCE.enable() && C781520UlC.LJIIIZ(streamType);
    }

    public final boolean LJ() {
        Room room;
        DataChannel dataChannel = this.LLILLJJLI;
        return C781520UlC.LJIIJJI((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? null : room.getStreamType());
    }

    public final boolean LIZ() {
        if (LIZJ()) {
            if (!LJ() && !LIZLLL()) {
                return false;
            }
        } else if (!LJ() && !LIZLLL()) {
            return false;
        }
        return true;
    }

    public final void LJI() {
        Long l;
        if (!LIZ() || LiveGoalCapsuleUserServerSetting.INSTANCE.enable() || this.LLJI.contains(100)) {
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131842024);
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        DataChannel dataChannel = this.LLILLJJLI;
        RoomMessage roomMessageLJ = C181500mr.LJ((dataChannel == null || (l = (Long) dataChannel.gg0(C751340Tdc.class)) == null) ? 0L : l.longValue(), strLJIJI);
        StringBuffer stringBuffer = new StringBuffer("101");
        stringBuffer.append(C158B.LIZ());
        stringBuffer.append(new Random(C158B.LIZ()).nextInt(100));
        CommonMessageData commonMessageData = roomMessageLJ.baseMessage;
        if (commonMessageData != null) {
            commonMessageData.messageId = CastLongProtector.parseLong(stringBuffer.toString());
        }
        IMessageManager iMessageManager = this.LLILZIL;
        if (iMessageManager != null) {
            iMessageManager.insertMessage(roomMessageLJ);
        }
        this.LLJI.add(100);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(java.lang.Long r20) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2632010c.LJFF(java.lang.Long):void");
    }

    public final void LJII(int i) {
        long jLongValue;
        Long l;
        if (!LIZ() || this.LLJI.contains(Integer.valueOf(i))) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('%');
        String strLJIJJ = C497740JfY.LJIJJ(2131842016, C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(C751340Tdc.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        RoomMessage roomMessageLJ = C181500mr.LJ(jLongValue, strLJIJJ);
        StringBuffer stringBuffer = new StringBuffer("101");
        stringBuffer.append(C158B.LIZ());
        stringBuffer.append(new Random(C158B.LIZ()).nextInt(100));
        CommonMessageData commonMessageData = roomMessageLJ.baseMessage;
        if (commonMessageData != null) {
            commonMessageData.messageId = CastLongProtector.parseLong(stringBuffer.toString());
        }
        IMessageManager iMessageManager = this.LLILZIL;
        if (iMessageManager != null) {
            iMessageManager.insertMessage(roomMessageLJ);
        }
        this.LLJI.add(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r21) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2632010c.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public static CapsuleMessage LIZIZ(String str, String str2) {
        CapsuleMessage capsuleMessage = new CapsuleMessage();
        capsuleMessage.isLocalInsertMsg = true;
        capsuleMessage.capsuleType = 2;
        capsuleMessage.schema = null;
        Text text = new Text();
        text.key = null;
        text.defaultPattern = str;
        capsuleMessage.desc = text;
        Text text2 = new Text();
        text2.key = null;
        text2.defaultPattern = str2;
        capsuleMessage.buttonText = text2;
        return capsuleMessage;
    }

    public C2632010c(LiveRecyclableWidget liveRecyclableWidget, DataChannel dataChannel, FragmentManager fragmentManager) {
        IMessageManager iMessageManager;
        this.LL = liveRecyclableWidget;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = fragmentManager;
        if (dataChannel != null) {
            iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILZIL = iMessageManager;
        this.LLIZ = new HashMap<>();
        this.LLIZLLLIL = new ArrayList<>();
        this.LLJ = true;
        this.LLJI = new HashSet<>();
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.STREAM_GOAL_SERVER_MESSAGE.getIntType(), this);
        }
        if (dataChannel != null) {
            dataChannel.EQ2(liveRecyclableWidget, VideoOrientationChangeChannel.class, new C5183020f(this, 294));
        }
    }

    public final void LJIIIIZZ(long j, String str, final boolean z) {
        int i;
        final long jUptimeMillis = SystemClock.uptimeMillis();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("live_goal_fetch_request");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_anchor");
        c474500IjALIZ.LIZ();
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        Long lValueOf = Long.valueOf(j);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.LLILZ.LIZ(iBroadcastService.getGoalGiftInfo(str, lValueOf, 1, i).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.010f
            @Override // X.C09JN
            public final void accept(Object obj) {
                LiveStreamGoal liveStreamGoal;
                C1C7U.LIZ("LiveStreamGoalPresenter@dd38.requestGoalGiftInfo$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                CopyOnWriteArrayList<C1125840fP4> copyOnWriteArrayList = C1125820fP2.LIZ;
                GetResponse.Data data = (GetResponse.Data) baseResponse.data;
                if (data != null) {
                    liveStreamGoal = data.ongoingGoal;
                } else {
                    liveStreamGoal = null;
                }
                C1125820fP2.LJIIIIZZ(liveStreamGoal);
                C2639010j.LIZIZ(SystemClock.uptimeMillis() - jUptimeMillis, Integer.valueOf(baseResponse.statusCode), baseResponse.LIZIZ, z);
                C1C7U.LIZIZ("LiveStreamGoalPresenter@dd38.requestGoalGiftInfo$1");
            }
        }, new C09JN() { // from class: X.010h
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("LiveStreamGoalPresenter@dd38.requestGoalGiftInfo$2");
                Throwable th = (Throwable) obj;
                long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
                C1133120fao c1133120faoLIZ = C1133160fas.LIZ(th);
                C2639010j.LIZIZ(jUptimeMillis2, Integer.valueOf(c1133120faoLIZ.LIZ), "", z);
                C20441214yg.LJI("LiveStreamGoalPresenter", th);
                C1C7U.LIZIZ("LiveStreamGoalPresenter@dd38.requestGoalGiftInfo$2");
            }
        }));
    }
}
