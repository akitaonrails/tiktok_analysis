package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestEnableMixModeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerNewLayoutTopicIdSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S1422200_15;
import kotlin.jvm.internal.AwS110S0400000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aCC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C925660aCC {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(InterfaceC925670aCD interfaceC925670aCD, int i, long j, boolean z, Function0 function0, Function0 function02, String str, boolean z2, int i2, long j2) {
        Room room;
        EnumC925350aBh enumC925350aBh;
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("invite_issue_check", "onPermissionGrant");
        if (!((Boolean) function0.invoke()).booleanValue() && (room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class)) != null) {
            function02.invoke();
            if (interfaceC925670aCD != null) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                if (z) {
                    enumC925350aBh = EnumC925350aBh.JOIN_DIRECT_DIALOG;
                } else {
                    enumC925350aBh = EnumC925350aBh.NORMAL;
                }
                interfaceC925670aCD.LIZIZ(id, ownerUserId, i, null, j, enumC925350aBh, str, z2, i2, j2);
            }
        }
    }

    public static void LIZ(Context context, DataChannel dataChannel, MultiGuestDataHolder multiGuestDataHolder, InterfaceC925670aCD interfaceC925670aCD, int i, long j, boolean z, Function0 function0, Function0 function02, Function0 function03, String str, String str2, boolean z2, int i2, long j2, int i3) {
        long j3 = j2;
        boolean z3 = z2;
        int i4 = i2;
        String str3 = str2;
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str3 = null;
        }
        if ((i3 & 8192) != 0) {
            z3 = false;
        }
        if ((i3 & 16384) != 0) {
            i4 = 0;
        }
        if ((i3 & 32768) != 0) {
            j3 = 0;
        }
        try {
            if (context != null) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    if (!LiveSdkMultiGuestEnableMixModeSetting.isEnable() ? C949950apN.LIZIZ() != 2 : !C949950apN.LIZ()) {
                        C915980Zwa.LJII().jn1();
                    }
                    if (!Intrinsics.LJFF(C925600aC6.LIZ, "outside_liveroom")) {
                        C925600aC6.LIZ = "anchor_invite_guest";
                        C920830a4P.LIZLLL = "anchor_invite_guest";
                    }
                    DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                    Room room = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                    if (C781520UlC.LIZLLL(room) && LivePlayerNewLayoutTopicIdSetting.INSTANCE.isGameTopic(room)) {
                        C925070aBF.LIZ(false, 1, activityLIZ, Long.valueOf(multiGuestDataHolder.LJJJLL), new AwS110S0400000_12(activityLIZ, new AwS0S1422200_15(interfaceC925670aCD, i, j, z, function0, function02, function03, str3, z3, i4, j3, 0), dataChannel, 2), null, null);
                        return;
                    }
                    Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
                    if (room2 != null && C781520UlC.LJFF(room2)) {
                        boolean z4 = C925090aBH.LIZ;
                        C925090aBH.LIZ(dataChannel, 1, activityLIZ, Long.valueOf(multiGuestDataHolder.LJJJLL), new AwS0S1422200_15(interfaceC925670aCD, i, j, z, function0, function02, function03, str3, z3, i4, j3, 1), null);
                        return;
                    } else {
                        boolean z5 = C925080aBG.LIZ;
                        C925080aBG.LIZ(false, dataChannel, 1, activityLIZ, Long.valueOf(multiGuestDataHolder.LJJJLL), str, new AwS0S1422200_15(interfaceC925670aCD, i, j, z, function0, function02, function03, str3, z3, i4, j3, 2), null);
                        return;
                    }
                }
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
            "Required value was null.".toString();
            throw new IllegalStateException("Required value was null.");
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            Room room3 = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room3 != null) {
                if (interfaceC925670aCD != null) {
                    interfaceC925670aCD.LIZ(room3.getId(), room3.getOwnerUserId(), z);
                }
                C20441214yg.LJIIIZ("MultiGuestV3GuestBeInvitedDialog", "refuse onPluginNotAvailable");
            }
            function03.invoke();
        }
    }
}
