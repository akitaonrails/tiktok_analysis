package X;

import Y.ARunnableS133S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.19o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21649419o4 extends C21649019o0 implements InterfaceC21650319oD {
    public final LinkedHashSet<InterfaceC21650419oE> LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public final Matrix LLJLLIL;
    public boolean LLJLLL;
    public final Matrix LLJZ;
    public float LLJZIJLIL;
    public final AUListenerS280S0100000_33 LLL;
    public final C01GW LLLF;

    @Override // X.C21649019o0
    public final void LJIILJJIL() {
        if (!this.LLJL && this.LLJLL == 3) {
            float fLJIJJ = LJIJJ();
            Iterator<InterfaceC21650419oE> it2 = this.LLJLIL.iterator();
            while (it2.hasNext()) {
                it2.next().gA(this.LLJLL);
            }
            if (fLJIJJ < this.LLJZIJLIL) {
                LJIJI(false);
                return;
            }
            this.LLJLL = 1;
            this.LLJL = true;
            this.LLJLLIL.set(this.LLJZ);
            Iterator<InterfaceC21650419oE> it3 = this.LLJLIL.iterator();
            while (it3.hasNext()) {
                it3.next().xP(this.LLJLL);
            }
            LJIIZILJ(this.LLJLLIL, this.LLJJJJJIL, new ARunnableS133S0100000_33((Object) this, 120), this.LLL);
        }
    }

    public final float LJIJJ() {
        if (!this.LLJLILLLLZIIL) {
            return 1.0f;
        }
        float f = this.LL.LLILZLL;
        if (f <= 0.0f) {
            return 1.0f;
        }
        float f2 = 1;
        float fHeight = f / this.LLIZLLLIL.height();
        if (fHeight > 0.95f) {
            fHeight = 0.95f;
        }
        return f2 - fHeight;
    }

    @Override // X.C21649019o0, X.InterfaceC21650219oC
    public final /* bridge */ /* synthetic */ void LIZ(C21649319o3 c21649319o3) {
        LIZ(c21649319o3);
    }

    @Override // X.InterfaceC21650319oD
    public final void LIZIZ(InterfaceC21650419oE interfaceC21650419oE) {
        this.LLJLIL.add(interfaceC21650419oE);
    }

    @Override // X.C21649019o0, X.InterfaceC21650219oC
    public final /* bridge */ /* synthetic */ void LIZJ(C21649319o3 c21649319o3) {
        LIZJ(c21649319o3);
    }

    @Override // X.C21649019o0, X.InterfaceC21650219oC
    public final /* bridge */ /* synthetic */ void LIZLLL(C21649319o3 c21649319o3) {
        LJIILJJIL();
    }

    @Override // X.InterfaceC21650319oD
    public final void LJ(InterfaceC21650419oE interfaceC21650419oE) {
        this.LLJLIL.remove(interfaceC21650419oE);
    }

    @Override // X.C21649019o0
    /* JADX INFO: renamed from: LJIILIIL */
    public final void LIZJ(C21649319o3 c21649319o3) {
        boolean z;
        super.LIZJ(c21649319o3);
        if (this.LLJL) {
            return;
        }
        this.LLJLL = -1;
        if (this.LLIZLLLIL.top - this.LLJI.top > 0.001f) {
            z = true;
        } else {
            z = false;
        }
        this.LLJLLL = !z;
    }

    @Override // X.C21649019o0
    /* JADX INFO: renamed from: LJIILL */
    public final void LIZ(C21649319o3 c21649319o3) {
        for (InterfaceC1765420w2e interfaceC1765420w2e : (List) this.LLLF.getValue()) {
            this.LLJIJIL.getValues(this.LLJILJILJ);
            interfaceC1765420w2e.LJIJJLI(this.LLJILJILJ[0]);
        }
        if (!this.LLJL && !LJIIIZ()) {
            if (this.LLJLILLLLZIIL && c21649319o3.LLJILJIL == 4 && this.LLJLLL && this.LLJLL == -1) {
                this.LLJLL = 3;
                this.LLJZ.set(this.LLJIJIL);
                Iterator<InterfaceC21650419oE> it2 = this.LLJLIL.iterator();
                while (it2.hasNext()) {
                    it2.next().xP(this.LLJLL);
                }
            }
            if (this.LLJLL == 3) {
                Matrix matrix = this.LLJIJIL;
                C21649319o3 c21649319o32 = this.LL;
                RectF rectF = this.LLJ;
                matrix.set(this.LLJZ);
                float f = c21649319o32.LLILZLL;
                float fLJIJJ = LJIJJ();
                matrix.postScale(fLJIJJ, fLJIJJ, rectF.centerX(), rectF.centerY());
                Iterator<InterfaceC21650419oE> it3 = this.LLJLIL.iterator();
                while (it3.hasNext()) {
                    it3.next().kG(fLJIJJ, this.LLJLL);
                }
                if (this.LLILZIL) {
                    matrix.postTranslate(c21649319o32.LLILZIL, f);
                }
                LJFF();
                return;
            }
            super.LIZ(c21649319o3);
        }
    }

    public final void LJIJI(boolean z) {
        this.LLJLL = 2;
        this.LLJL = true;
        this.LLJLLIL.set(this.LLJIJIL);
        if (z) {
            this.LLJLLIL.postTranslate(this.LLJ.centerX() - this.LLJI.centerX(), this.LLJ.centerY() - this.LLJI.centerY());
            this.LLJLLIL.postScale(0.1f, 0.1f, this.LLJ.centerX(), this.LLJ.centerY());
        } else {
            this.LLJLLIL.postScale(0.1f, 0.1f, this.LLJI.centerX(), this.LLJI.centerY());
        }
        Iterator<InterfaceC21650419oE> it2 = this.LLJLIL.iterator();
        while (it2.hasNext()) {
            it2.next().xP(this.LLJLL);
        }
        LJIIZILJ(this.LLJLLIL, this.LLJJJJJIL, new ARunnableS133S0100000_33((Object) this, 44), this.LLL);
    }

    @Override // X.InterfaceC21650319oD
    public final void setDragTransitionEnabled(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    @Override // X.InterfaceC21650319oD
    public final void setMaxDragTransitionFactor(float f) {
        this.LLJZIJLIL = f;
    }

    public C21649419o4(C21649319o3 c21649319o3, Context context) {
        super(c21649319o3, context);
        this.LLJLIL = new LinkedHashSet<>();
        this.LLJLILLLLZIIL = true;
        this.LLJLL = -1;
        this.LLJLLIL = new Matrix();
        this.LLJLLL = true;
        this.LLJZ = new Matrix();
        this.LLJZIJLIL = 0.7f;
        this.LLL = new AUListenerS280S0100000_33(this, 18);
        this.LLLF = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(269));
    }
}
