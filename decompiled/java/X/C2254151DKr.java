package X;

import Y.ARunnableS46S0101000_35;
import android.os.Handler;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* JADX INFO: renamed from: X.1DKr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254151DKr implements InterfaceC2253851DJn {
    public final Handler LIZ;
    public final InterfaceC2253851DJn LIZIZ;

    @Override // X.InterfaceC2253851DJn
    public final void LIZ(int i) {
        C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS46S0101000_35(this, i, 3));
    }

    @Override // X.InterfaceC2253851DJn
    public final void LIZIZ(int i) {
        this.LIZIZ.LIZIZ(i);
    }

    public C2254151DKr(SafeHandler safeHandler, C2254131DKp c2254131DKp) {
        this.LIZ = safeHandler;
        this.LIZIZ = c2254131DKp;
    }
}
