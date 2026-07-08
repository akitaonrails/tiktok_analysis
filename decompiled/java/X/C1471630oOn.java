package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.util.SurfaceWrapper;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0oOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471630oOn extends C1469760oLm implements InterfaceC1473850oSN {
    @Override // X.InterfaceC1473850oSN
    public final void LIZ() {
    }

    @Override // X.InterfaceC1473850oSN
    public final void LIZIZ() {
    }

    public C1471630oOn(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
    }

    @Override // X.InterfaceC1473850oSN
    public final void LIZJ(SurfaceWrapper surfaceWrapper) {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null && surfaceWrapper == player.LIZ.LJIIL) {
            player.setSurface(null);
        }
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJII(Surface surface) {
        C1480980ods c1480980odsUe = this.LLILLJJLI.ue();
        if (c1480980odsUe != null && c1480980odsUe.LJJIJIL && (surface instanceof SurfaceWrapper)) {
            ((SurfaceWrapper) surface).mListener = new WeakReference<>(this);
        }
    }
}
