package X;

import Y.ARunnableS107S0100000_7;
import android.graphics.Rect;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0IHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C464030IHp {
    public static Rect LJIIIZ;
    public static final HashMap<Long, Boolean> LJIIJ = new HashMap<>();
    public static final HashMap<Long, Rect> LJIIJJI = new HashMap<>();
    public static final ArrayList<String> LJIIL = C1697810uHb.LJ("ld");
    public final DataChannel LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public float LIZLLL;
    public float LJFF;
    public boolean LJIIIIZZ;
    public float LJ = 1.0f;
    public final BPEAHandler LJI = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS107S0100000_7 LJII = new ARunnableS107S0100000_7(this, 241);

    public C464030IHp(DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZJ = C0IKK.LIZ(dataChannel);
    }

    public final void LIZ(boolean z) {
        if (z) {
            this.LIZJ = false;
        }
        this.LIZIZ = false;
        ARunnableS107S0100000_7 aRunnableS107S0100000_7 = this.LJII;
        if (aRunnableS107S0100000_7 != null) {
            this.LJI.removeCallbacks(aRunnableS107S0100000_7);
        }
        LJIIIZ = null;
    }
}
