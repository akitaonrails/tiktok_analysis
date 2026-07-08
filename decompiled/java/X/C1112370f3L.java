package X;

import Y.ARunnableS117S0100000_17;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0f3L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1112370f3L {
    public final Fragment LIZ;
    public C1111930f2d<? extends InterfaceC1112050f2p> LIZIZ;
    public final DataChannel LIZJ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final ARunnableS117S0100000_17 LJ = new ARunnableS117S0100000_17(this, 283);
    public final ARunnableS117S0100000_17 LJFF = new ARunnableS117S0100000_17(this, 284);
    public final ARunnableS117S0100000_17 LJI = new ARunnableS117S0100000_17(this, 285);

    public static InterfaceC1112060f2q LIZ(String str) {
        return ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(C181500mr.LJ(0L, str));
    }

    public C1112370f3L(Fragment fragment, C1111930f2d<? extends InterfaceC1112050f2p> c1111930f2d, DataChannel dataChannel) {
        this.LIZ = fragment;
        this.LIZIZ = c1111930f2d;
        this.LIZJ = dataChannel;
    }
}
