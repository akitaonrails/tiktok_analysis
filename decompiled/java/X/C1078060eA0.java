package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0eA0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078060eA0 {
    public final LifecycleOwner LIZ;
    public final Room LIZIZ;
    public final DataChannel LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Long> LJ;
    public final boolean LJFF = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();

    public C1078060eA0(LifecycleOwner lifecycleOwner, Room room, DataChannel dataChannel, boolean z, Map<String, Long> map) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = room;
        this.LIZJ = dataChannel;
        this.LIZLLL = z;
        this.LJ = map;
    }
}
