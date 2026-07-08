package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* JADX INFO: renamed from: X.1234, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1234 {
    public InterfaceC196910122i LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public long LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public SafeHandler LJIILJJIL;
    public C196925122x LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public C196923122v LJIJI;
    public InterfaceC196951123x LJIJJ;
    public final C124G LJIJJLI;
    public final C1DRG LJIL;
    public C122Q LJJI;
    public int LJIIIZ = 2;
    public int LJIIJ = LivePreCreateNextRoomPlayer.ENABLE;
    public AnonymousClass1239 LJIILL = new AnonymousClass1239(this);
    public AnonymousClass1223 LJJ = C1658670tGT.LIZ;

    public final String LIZ() {
        return this.LJIILLIIL.getData() != null ? this.LJIILLIIL.getData().getTtsVoiceModel() != null ? "auto" : (this.LJIILLIIL.getData().getTtsExtraMap().containsKey("is_tts_reuse_mdp") && this.LJIILLIIL.getData().getTtsExtraMap().get("is_tts_reuse_mdp").equals("1")) ? "tts_reuse" : "user_click" : "user_click";
    }

    public final boolean LIZIZ() {
        C124G c124g = this.LJIJJLI;
        if (c124g != null) {
            return c124g.LIZ();
        }
        C1DRG c1drg = this.LJIL;
        if (c1drg == null) {
            return false;
        }
        if (this.LJJI == null) {
            this.LJJI = (C122Q) c1drg.LJIIL(null, C122Q.class);
        }
        C122Q c122q = this.LJJI;
        if (c122q != null) {
            return c122q.LLLLZLLIL();
        }
        return false;
    }

    public final void LIZLLL(boolean z) {
        boolean hasReadTextAudio;
        this.LJIIIIZZ = z;
        AnonymousClass1239 anonymousClass1239 = this.LJIILL;
        if (anonymousClass1239 != null) {
            HandlerHook.viewRemoveCallbacks(this.LJIILLIIL, anonymousClass1239);
            this.LJIILL = null;
        }
        if (z && this.LJIILJJIL != null && this.LJIILL == null) {
            this.LJIILL = new AnonymousClass1239(this);
            HandlerHook.viewPostDelay(this.LJIILLIIL, this.LJIILL, this.LJIIJ);
        }
        this.LJIILLIIL.invalidate();
        C196923122v c196923122v = this.LJIJI;
        if (c196923122v != null) {
            if (this.LJIILLIIL.getData() != null) {
                hasReadTextAudio = this.LJIILLIIL.getData().getHasReadTextAudio();
            } else {
                hasReadTextAudio = false;
            }
            c196923122v.LIZ(LIZ(), z, false, hasReadTextAudio);
        }
    }

    public AnonymousClass1234(C124G c124g, C1DRG c1drg) {
        this.LJIJJLI = c124g;
        this.LJIL = c1drg;
    }

    public final boolean LIZJ(float f, float f2) {
        this.LJFF = System.currentTimeMillis();
        float f3 = f - this.LJIIJJI;
        float f4 = f2 - this.LJIIL;
        this.LIZLLL = f3;
        this.LJ = f4;
        boolean z = false;
        if (this.LJIJ) {
            this.LJIIIZ = 2;
            this.LJIJ = false;
        }
        if (this.LJIIIZ == 2 || LIZIZ()) {
            boolean zLJIILL = this.LJIILLIIL.LJIILL(f3, f4);
            this.LJIILIIL = zLJIILL;
            if (zLJIILL) {
                this.LJIIIZ = 3;
                this.LJI = f3;
                this.LJII = f4;
                z = true;
                InterfaceC196910122i interfaceC196910122i = this.LIZ;
                if (interfaceC196910122i != null) {
                    interfaceC196910122i.LJII(this.LJIILLIIL);
                }
            }
        }
        return z;
    }
}
