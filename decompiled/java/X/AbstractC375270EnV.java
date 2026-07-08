package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC375270EnV implements InterfaceC375350End {
    public C19EG LL;
    public FrameLayout LLILLJJLI;
    public boolean LLILLL;
    public Pair<Float, Float> LLILZ;
    public NLEModel LLILZIL;
    public InterfaceC375300EnY LLILZLL;
    public boolean LLIZ;

    @Override // X.InterfaceC375350End
    public final void LJII() {
        if (this.LLILLL) {
            InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
            if (interfaceC375300EnY != null) {
                interfaceC375300EnY.LJ(this.LLILLJJLI);
            }
            this.LLILLL = false;
        }
    }

    @Override // X.InterfaceC375350End
    public final void LJIIJ() {
        C19EG c19eg = this.LL;
        FrameLayout frameLayout = this.LLILLJJLI;
        if (c19eg == null || frameLayout == null || this.LLILLL) {
            return;
        }
        this.LLILLL = true;
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY != null) {
            interfaceC375300EnY.LJIJJLI(frameLayout, this);
        }
    }

    @Override // X.InterfaceC375340Enc
    public final EnumC375280EnW LJIIJJI() {
        return EnumC375280EnW.RIGHT;
    }

    @Override // X.InterfaceC375340Enc
    public final C00B8 LJIIL() {
        return C00B8.ANTICLOCKWISE;
    }

    @Override // X.InterfaceC375340Enc
    public final EnumC375290EnX LJIILL() {
        return EnumC375290EnX.DOWN;
    }

    @Override // X.InterfaceC375350End
    public final void LIZ(Canvas canvas) {
        InterfaceC375300EnY interfaceC375300EnY;
        if (this.LLILLL && (interfaceC375300EnY = this.LLILZLL) != null) {
            interfaceC375300EnY.LIZ(canvas);
        }
    }

    @Override // X.InterfaceC375350End
    public final void LIZIZ(NLEModel nLEModel) {
        InterfaceC375300EnY interfaceC375300EnY;
        this.LLILZIL = nLEModel;
        if (this.LLILLL && (interfaceC375300EnY = this.LLILZLL) != null) {
            interfaceC375300EnY.LIZIZ(nLEModel);
        }
    }

    @Override // X.InterfaceC375350End
    public final void LJIILLIIL(Pair<Float, Float> pair) {
        this.LLILZ = pair;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJJJJ(MotionEvent motionEvent) {
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY == null || !interfaceC375300EnY.LJJJJ(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC375350End
    public final void LJIJI(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        Float fValueOf;
        Integer numValueOf;
        InterfaceC375300EnY interfaceC375300EnY;
        NLEModel nLEModel = this.LLILZIL;
        Integer numValueOf2 = null;
        if (nLEModel != null) {
            fValueOf = Float.valueOf(nLEModel.getCanvasRatio());
        } else {
            fValueOf = null;
        }
        Pair<Float, Float> pair = this.LLILZ;
        FrameLayout frameLayout = this.LLILLJJLI;
        if (frameLayout != null) {
            numValueOf = Integer.valueOf(frameLayout.getMeasuredWidth());
        } else {
            numValueOf = null;
        }
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            numValueOf2 = Integer.valueOf(frameLayout2.getMeasuredHeight());
        }
        C375170EnL c375170EnLLIZIZ = C375260EnU.LIZIZ(this, nLETrackSlot, fValueOf, pair, numValueOf, numValueOf2);
        if (c375170EnLLIZIZ != null && (interfaceC375300EnY = this.LLILZLL) != null) {
            interfaceC375300EnY.LIZJ(nLETrackSlot, c375170EnLLIZIZ);
        }
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIIIIZZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY != null && this.LLILLL) {
            return interfaceC375300EnY.LJIIIIZZ(nLETrack, nLETrackSlot, motionEvent);
        }
        return false;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIIIZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i) {
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY != null && this.LLILLL) {
            return interfaceC375300EnY.LJIIIZ(nLETrack, nLETrackSlot, i);
        }
        return false;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIILIIL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, MotionEvent motionEvent) {
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY != null && this.LLILLL) {
            return interfaceC375300EnY.LJIILIIL(nLETrack, nLETrackSlot, motionEvent);
        }
        return false;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIILJJIL(NLETrack nLETrack, NLETrackSlot nLETrackSlot, float f) {
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY != null && this.LLILLL) {
            if (!this.LLIZ) {
                nLETrackSlot.getScale();
                this.LLIZ = true;
            }
            boolean zLJIILJJIL = interfaceC375300EnY.LJIILJJIL(nLETrack, nLETrackSlot, f);
            if (zLJIILJJIL) {
                nLETrackSlot.getScale();
            }
            return zLJIILJJIL;
        }
        return false;
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LIZLLL(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LLIZ = false;
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY == null || !this.LLILLL) {
            return false;
        }
        return interfaceC375300EnY.LIZLLL(z, z2, z3, z4, z5);
    }

    @Override // X.InterfaceC375310EnZ
    public final boolean LJIIZILJ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, int i, float f, float f2, float f3, float f4) {
        InterfaceC375300EnY interfaceC375300EnY = this.LLILZLL;
        if (interfaceC375300EnY != null && this.LLILLL) {
            return interfaceC375300EnY.LJIIZILJ(nLETrack, nLETrackSlot, i, f, f2, f3, f4);
        }
        return false;
    }
}
