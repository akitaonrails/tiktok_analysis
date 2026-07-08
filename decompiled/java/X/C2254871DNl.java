package X;

import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DNl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254871DNl implements InterfaceC2254971DNv<C1DL5>, C1DL5 {
    public final InterfaceC2238351CjB LIZ;
    public TextureView LIZIZ;
    public C2254861DNk LIZJ;

    @Override // X.InterfaceC2254971DNv
    public final void onDestroy() {
    }

    @Override // X.C1DL5
    public final View getPreviewView() {
        TextureView textureView = this.LIZIZ;
        if (textureView == null) {
            return null;
        }
        return textureView;
    }

    @Override // X.C1DL5
    public final Surface getSurface() {
        C2254861DNk c2254861DNk = this.LIZJ;
        if (c2254861DNk == null) {
            c2254861DNk = null;
        }
        return c2254861DNk.LIZJ;
    }

    @Override // X.InterfaceC2254971DNv
    public final void init() {
        this.LIZIZ = new TextureView(this.LIZ.getActivity());
        this.LIZJ = new C2254861DNk(new AwS579S0100000_35(this, 429));
    }

    @Override // X.C1DL5
    public final boolean jk() {
        C2254861DNk c2254861DNk = this.LIZJ;
        if (c2254861DNk == null) {
            c2254861DNk = null;
        }
        return c2254861DNk.LIZLLL;
    }

    public C2254871DNl(InterfaceC2238351CjB interfaceC2238351CjB) {
        this.LIZ = interfaceC2238351CjB;
    }

    @Override // X.C1DL5
    public final void LIZ(C1DI1 c1di1) {
        C2254861DNk c2254861DNk = this.LIZJ;
        if (c2254861DNk == null) {
            c2254861DNk = null;
        }
        synchronized (c2254861DNk) {
            try {
                c2254861DNk.LIZIZ.add(c1di1);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
