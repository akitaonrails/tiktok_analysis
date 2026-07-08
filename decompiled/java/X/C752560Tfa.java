package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.broadcast.preview.widget.levelup.CppUnlockGuideDialogV2;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.jvm.internal.AwS63S1000000_12;

/* JADX INFO: renamed from: X.0Tfa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752560Tfa {
    public static boolean LIZ(int i) {
        DataChannel dataChannelProvideDataChannel;
        FragmentManager fragmentManager;
        int i2;
        String str;
        C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopFragmentActivity());
        if (c0ip3LIZIZ != null) {
            dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Ff2(dataChannelProvideDataChannel, i)) {
            return true;
        }
        if (dataChannelProvideDataChannel != null && (fragmentManager = (FragmentManager) dataChannelProvideDataChannel.gg0(C748880TZe.class)) != null) {
            Room room = (Room) dataChannelProvideDataChannel.gg0(RoomChannel.class);
            if (i == 1) {
                i2 = 2131842920;
            } else {
                i2 = 2131842925;
            }
            String strLJIJI = C497740JfY.LJIJI(i2);
            if (i == 1) {
                str = "cohost";
            } else {
                str = "multi_guest";
            }
            if (room != null && room.cppVersion == 2) {
                AwS63S1000000_12 awS63S1000000_12 = new AwS63S1000000_12(str, 3);
                Boolean bool = Boolean.FALSE;
                CppUnlockGuideDialogV2 cppUnlockGuideDialogV2 = new CppUnlockGuideDialogV2();
                if (strLJIJI != null) {
                    cppUnlockGuideDialogV2.LL = strLJIJI;
                }
                cppUnlockGuideDialogV2.LLILLJJLI = str;
                if (bool != null) {
                    cppUnlockGuideDialogV2.LLILZ = false;
                }
                cppUnlockGuideDialogV2.LLILLL = awS63S1000000_12;
                cppUnlockGuideDialogV2.LLILZIL = null;
                cppUnlockGuideDialogV2.show(fragmentManager, "");
            } else {
                C0TIH.LIZ(strLJIJI, new AwS63S1000000_12(str, 4), Boolean.FALSE, null).show(fragmentManager, "");
                return false;
            }
        }
        return false;
    }

    public static Bundle LIZIZ(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            C786410Ut5.LJJJI((String) entry.getKey(), (String) entry.getValue(), bundle);
        }
        return bundle;
    }
}
