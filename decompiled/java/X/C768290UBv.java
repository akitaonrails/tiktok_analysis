package X;

import android.content.Context;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.TtlsLiveProductNumber;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBgMusicSwitchSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveVoiceChatVoiceEffectSwitchSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.PaidEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C768290UBv implements C0KWW {
    public static final C768290UBv LIZ = new C768290UBv();

    public static final boolean LIZIZ(DataChannel dataChannel) {
        int iIntValue;
        boolean z;
        if (dataChannel == null) {
            return false;
        }
        Boolean bool = (Boolean) dataChannel.gg0(ECLiveStatusChangeChannel.class);
        Integer num = (Integer) dataChannel.gg0(TtlsLiveProductNumber.class);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iIntValue > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((bool == null || !bool.booleanValue()) && !z) {
            C761830TuX c761830TuX = C761830TuX.LIZ;
            if (C761830TuX.LIZJ()) {
                C766270U4b.LIZLLL(2131842672);
                return false;
            }
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (!C0U3P.LIZIZ(C0U3Q.KARAOKE)) {
                return true;
            }
            HashMap map = new HashMap();
            map.put("extra", "karaoke");
            C0U4R c0u4r = new C0U4R();
            c0u4r.LIZLLL = 2131840654;
            c0u4r.LIZJ = "pm_mt_LIVEKaraoke_LIVEhostPage_musicKaraokeToast";
            c0u4r.LJFF = true;
            c0u4r.LJII = dataChannel;
            c0u4r.LJI = map;
            C766270U4b.LJIIJ(c0u4r);
            return false;
        }
        HashMap map2 = new HashMap();
        map2.put("extra", "ecom");
        C0U4R c0u4r2 = new C0U4R();
        c0u4r2.LIZLLL = 2131842667;
        c0u4r2.LJI = map2;
        c0u4r2.LJFF = true;
        c0u4r2.LJII = dataChannel;
        c0u4r2.LIZJ = "pm_live_bgmusic_playlist_music_cannot_enter";
        C766270U4b.LJIIJ(c0u4r2);
        return false;
    }

    public static final boolean LIZJ(DataChannel dataChannel) {
        boolean z;
        Room room;
        Integer num;
        Room room2;
        PaidEvent paidEvent;
        if (dataChannel == null) {
            return false;
        }
        C0UBZ c0ubz = C0UBZ.LL;
        if (C0UBZ.LLJJIII != 0 && !C0UBZ.LLJJIJIIJIL) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ((!C763260Twq.LJIIL && !C763260Twq.LJIIIZ) || !LiveBGMSetting.INSTANCE.inLiveBGMUpgrade() || (((room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (paidEvent = room.paidEvent) != null && paidEvent.paidType == 1) || !C500260Jjc.LJJIFFI((Boolean) dataChannel.gg0(ECLiveStatusChangeChannel.class)) || (((num = (Integer) dataChannel.gg0(TtlsLiveProductNumber.class)) != null && num.intValue() != 0) || ((room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null && room2.liveSubOnly == 1))))) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (!C0U3P.LIZIZ(C0U3Q.KARAOKE)) {
                return true;
            }
            C0U4R c0u4r = new C0U4R();
            c0u4r.LIZLLL = 2131840666;
            c0u4r.LIZJ = "pm_mt_LIVEKaraoke_LIVEhostPage_voiceEffectKaraokeToast";
            c0u4r.LJFF = true;
            c0u4r.LJII = dataChannel;
            c0u4r.LJI = C2097908Jt.LIZJ(new Pair("extra", "karaoke"));
            C766270U4b.LJIIJ(c0u4r);
            return false;
        }
        C0U4R c0u4r2 = new C0U4R();
        c0u4r2.LIZLLL = 2131842672;
        c0u4r2.LJI = C2097608Jq.LJIIJ(new Pair("extra", "voice"));
        c0u4r2.LJFF = true;
        c0u4r2.LJII = dataChannel;
        c0u4r2.LIZJ = "pm_live_bgmusic_toast_cannot_use_music_sound_effect";
        C766270U4b.LJIIJ(c0u4r2);
        return false;
    }

    public static final boolean LIZLLL(DataChannel dataChannel) {
        Room room;
        Room room2;
        PaidEvent paidEvent;
        Room room3;
        Room room4;
        Integer num;
        PaidEvent paidEvent2;
        if (dataChannel == null) {
            return false;
        }
        LiveBgMusicSwitchSetting liveBgMusicSwitchSetting = LiveBgMusicSwitchSetting.INSTANCE;
        if (!liveBgMusicSwitchSetting.getValue() || LiveBGMSetting.INSTANCE.inLiveBGMUpgrade() || (((room3 = (Room) dataChannel.gg0(RoomChannel.class)) != null && (paidEvent2 = room3.paidEvent) != null && paidEvent2.paidType == 1) || (((room4 = (Room) dataChannel.gg0(RoomChannel.class)) != null && room4.liveSubOnly == 1) || !C500260Jjc.LJJIFFI((Boolean) dataChannel.gg0(ECLiveStatusChangeChannel.class)) || (((num = (Integer) dataChannel.gg0(TtlsLiveProductNumber.class)) != null && num.intValue() != 0) || ((C500260Jjc.LJJJIL(dataChannel) && (!C500260Jjc.LJJJIL(dataChannel) || !TryModeGuidanceSetting.INSTANCE.inExperiment())) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin()))))) {
            if (!liveBgMusicSwitchSetting.getValue() || !LiveBGMSetting.INSTANCE.inLiveBGMUpgrade() || (((room = (Room) dataChannel.gg0(RoomChannel.class)) != null && (paidEvent = room.paidEvent) != null && paidEvent.paidType == 1) || ((room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null && room2.liveSubOnly == 1))) {
                return false;
            }
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (C0U3P.LIZIZ(C0U3Q.COMMERCE) || C0U3P.LIZIZ(C0U3Q.LOCAL_SERVICE_GOODS) || ((C500260Jjc.LJJJIL(dataChannel) && (!C500260Jjc.LJJJIL(dataChannel) || !TryModeGuidanceSetting.INSTANCE.inExperiment())) || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isCoin())) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LJ(DataChannel dataChannel) {
        LiveMode liveMode;
        if (!LiveVoiceChatVoiceEffectSwitchSetting.isOpen()) {
            if (dataChannel != null) {
                liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
            } else {
                liveMode = null;
            }
            if (C781520UlC.LJ(liveMode)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final boolean LIZ(Context context, DataChannel dataChannel) {
        C0KX8 c0kx8;
        if (dataChannel != null) {
            c0kx8 = (C0KX8) dataChannel.gg0(LiveBanCapabilityChannel.class);
        } else {
            c0kx8 = null;
        }
        if (c0kx8 != null && c0kx8.LIZ) {
            C766270U4b.LIZLLL(2131844180);
            return false;
        }
        C013C c013c = new C013C();
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null && iRoomFunctionService.C72() != null && !C0JFN.LJIIIZ(context, dataChannel, new AwS556S0100000_12(c013c, 841))) {
            c013c.element = true;
        }
        return c013c.element;
    }
}
