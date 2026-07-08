package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS10S0200001_15;

/* JADX INFO: renamed from: X.0a5P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public abstract class AbstractC921450a5P extends AbstractC938410aWl<InterfaceC921460a5Q> implements InterfaceC919200a1m {
    public final Room LL;
    public InterfaceC302401Fe LLILLJJLI;

    public void LJIIIZ(long j, String str, String str2, LinkPlayerInfo linkPlayerInfo) {
    }

    public void LJIJI(long j, String str, int i, boolean z, String str2, String str3, InterfaceC923280a8M interfaceC923280a8M, LinkPlayerInfo linkPlayerInfo, Integer num, Function1 function1) {
    }

    public void LJJJJLI(LinkPlayerInfo linkPlayerInfo, int i, boolean z) {
    }

    public void LJJJJLL(long j, C930380aJo c930380aJo, AwS10S0200001_15 awS10S0200001_15) {
    }

    public void LJJJLIIL(C918350a0P c918350a0P) {
    }

    public void LJJJLZIJ() {
    }

    public void Lc2(C977800bYI c977800bYI) {
    }

    public InterfaceC302401Fe LJJL() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int LJJJJZI(String str) {
        switch (str.hashCode()) {
            case -1372966201:
                if (!str.equals("kickout_with_profile")) {
                    return 0;
                }
                return 2;
            case -520746559:
                if (!str.equals("kickout_with_rtc_user_leaved")) {
                    return 0;
                }
                return 3;
            case -325227317:
                if (!str.equals("kickout_with_popup_confirm")) {
                    return 0;
                }
                return 2;
            case 1917515391:
                if (!str.equals("kickout_with_timeout")) {
                    return 0;
                }
                return 1;
            default:
                return 0;
        }
    }

    public AbstractC921450a5P(Room room, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.LL = room;
    }

    public C931860aMC LJJJZ(DataChannel dataChannel, InterfaceC931760aM2 interfaceC931760aM2, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i, C921060a4m c921060a4m, C920520a3u c920520a3u, String str, C928710aH7 c928710aH7) {
        return new C931860aMC(dataChannel, interfaceC931760aM2, multiGuestDataHolder, linkControlDataHolder, i, c921060a4m, c920520a3u, str, c928710aH7);
    }
}
