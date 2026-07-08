package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.livesetting.watchlive.player.BlackScreenMonitorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0IED, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IED {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final Map<String, Integer> LJIIJ = new LinkedHashMap();

    public final void LIZ() {
        BlackScreenMonitorSetting blackScreenMonitorSetting = BlackScreenMonitorSetting.INSTANCE;
        if (blackScreenMonitorSetting.getEnable() == blackScreenMonitorSetting.getDEFAULT()) {
            return;
        }
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            dataChannel.BQ2(this.LIZIZ, LiveEndEvent.class, new AwS586S0100000_7(this, 448));
        }
        this.LJIIIIZZ = false;
        this.LIZJ = false;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
        LIZIZ(0);
        ((LinkedHashMap) this.LJIIJ).clear();
    }

    public final void LIZIZ(int i) {
        if (this.LJIIIZ == 0) {
            this.LJIIIZ = i;
        }
    }

    public C0IED(LifecycleOwner lifecycleOwner, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = lifecycleOwner;
    }

    public final void LIZJ(String str, HashMap map) {
        if (this.LJIIJ.containsKey(str)) {
            map.put(str, String.valueOf(((LinkedHashMap) this.LJIIJ).get(str)));
        } else {
            map.put(str, String.valueOf(-1));
        }
    }
}
