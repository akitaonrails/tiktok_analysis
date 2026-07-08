package X;

import android.os.Looper;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveMultiTabItemViewCacheSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Kat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520330Kat {
    public final Room LIZ;
    public ViewGroup LIZIZ;
    public final BPEAHandler LIZJ;
    public final int LIZLLL;
    public final List<InterfaceC520350Kav> LJ;
    public final RunnableC520320Kas LJFF;

    public C520330Kat(DataChannel dataChannel) {
        Room room;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LIZ = room;
        this.LIZJ = new BPEAHandler(Looper.getMainLooper());
        this.LIZLLL = LiveMultiTabItemViewCacheSetting.INSTANCE.getValue().cacheCount;
        this.LJ = new ArrayList();
        this.LJFF = new RunnableC520320Kas(this);
    }
}
