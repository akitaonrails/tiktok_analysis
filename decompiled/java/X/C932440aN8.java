package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestSwitchSpotAnchorNewStyleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWavePrivilegeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: X.0aN8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932440aN8 {
    public static final /* synthetic */ int LIZ = 0;

    public static C932100aMa LIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("audio");
        if (!LJ()) {
            arrayList.add("video");
            arrayList.add("flip");
        }
        arrayList.add("zoom");
        if (MultiGuestSwitchSpotAnchorNewStyleSetting.INSTANCE.getValue()) {
            arrayList.add("switch_spot");
        }
        if (!LJ()) {
            arrayList.add("fun_kit");
        }
        arrayList.add("manage_guest");
        return new C932100aMa(C13LP.LLIIII(arrayList), null);
    }

    public static boolean LJ() {
        return C781520UlC.LJFF((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class));
    }

    public static C932100aMa LIZJ() {
        return LJ() ? C931780aM4.LIZJ() ? new C932100aMa(C1697810uHb.LJIIJJI("gift", "audio", "zoom"), null) : new C932100aMa(C1697810uHb.LJIIJJI("gift", "audio"), null) : new C932100aMa(C1697810uHb.LJIIJJI("gift", "audio", "video", "zoom", "double_zoom", "switch_spot", "count_down"), null);
    }

    public static C932100aMa LIZLLL() {
        return LJ() ? C931780aM4.LIZJ() ? MultiGuestVoiceWavePrivilegeSetting.INSTANCE.enable() ? new C932100aMa(C1697810uHb.LJIIJJI("audio", "zoom", "voice_ring", "setting"), null) : new C932100aMa(C1697810uHb.LJIIJJI("audio", "zoom", "setting"), null) : new C932100aMa(C1697810uHb.LJIIJJI("audio", "setting"), null) : new C932100aMa(Collections.singletonList("audio"), null);
    }

    public static C932100aMa LIZIZ(boolean z) {
        if (LJ()) {
            return LIZLLL();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("audio");
        arrayList.add("video");
        if (z) {
            arrayList.add("manage_guest");
        } else {
            arrayList.add("invite");
        }
        arrayList.add("voice_ring");
        arrayList.add("modify");
        return new C932100aMa(C13LP.LLIIII(arrayList), null);
    }
}
