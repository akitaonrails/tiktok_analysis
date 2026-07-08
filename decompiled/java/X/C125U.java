package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.EditTextStickerViewModel;

/* JADX INFO: renamed from: X.125U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C125U {
    public C125X LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public long LJFF;
    public float LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public SafeHandler LJIILIIL;
    public C125R LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public final InterfaceC196984125e LJIJ;
    public EditTextStickerViewModel LJIJJ;
    public int LJIIIZ = 2;
    public C125T LJIILJJIL = new C125T(this);
    public InterfaceC196983125d LJIJI = new InterfaceC196983125d() { // from class: X.125c
        @Override // X.InterfaceC196983125d
        public final boolean LIZ() {
            return false;
        }
    };

    public final boolean LIZ() {
        InterfaceC196984125e interfaceC196984125e = this.LJIJ;
        if (interfaceC196984125e != null) {
            return interfaceC196984125e.LIZ();
        }
        if (this.LJIJJ == null) {
            this.LJIJJ = (EditTextStickerViewModel) C1659650tI3.LIZ(C1388190mED.LIZIZ(this.LJIILL.getContext())).LIZ(EditTextStickerViewModel.class);
        }
        return this.LJIJJ.LLLLZLLIL();
    }

    public C125U(InterfaceC196984125e interfaceC196984125e) {
        this.LJIJ = interfaceC196984125e;
    }

    public final void LIZJ(boolean z) {
        this.LJIIIIZZ = z;
        C125T c125t = this.LJIILJJIL;
        if (c125t != null) {
            HandlerHook.viewRemoveCallbacks(this.LJIILL, c125t);
            this.LJIILJJIL = null;
        }
        if (z) {
            if (this.LJIILIIL != null && this.LJIILJJIL == null) {
                this.LJIILJJIL = new C125T(this);
                HandlerHook.viewPostDelay(this.LJIILL, this.LJIILJJIL, LivePreCreateNextRoomPlayer.ENABLE);
            }
            this.LIZ.LIZLLL(this.LJIILL);
        }
        this.LJIILL.invalidate();
    }

    public final boolean LIZIZ(float f, float f2) {
        this.LJFF = System.currentTimeMillis();
        float f3 = f - this.LJIIJ;
        float f4 = f2 - this.LJIIJJI;
        this.LIZLLL = f3;
        this.LJ = f4;
        boolean z = false;
        if (this.LJIIZILJ) {
            this.LJIIIZ = 2;
            this.LJIIZILJ = false;
        }
        if (this.LJIIIZ == 2 || LIZ()) {
            C125R c125r = this.LJIILL;
            boolean zLIZ = C121Q.LIZ(f3, f4, c125r.LLILZ.LIZIZ, c125r.getHelpRect(), 0.0f);
            this.LJIIL = zLIZ;
            if (zLIZ) {
                this.LJIIIZ = 3;
                this.LJI = f3;
                this.LJII = f4;
                z = true;
                C125X c125x = this.LIZ;
                if (c125x != null) {
                    c125x.LJLJI();
                }
            }
        }
        return z;
    }
}
