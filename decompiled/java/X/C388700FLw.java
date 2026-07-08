package X;

import Y.ARunnableS105S0100000_5;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0FLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388700FLw extends C0FKS {
    public final ViewGroup LIZIZ;
    public final C388200FJy LIZJ;
    public final boolean LIZLLL;
    public boolean LJ;
    public final ViewGroup LJFF;
    public final C388720FLy LJI;
    public final C01GW LJII;
    public final C01GW LJIIIIZZ;
    public final ARunnableS105S0100000_5 LJIIIZ;

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LIZIZ() {
        C388720FLy c388720FLy = this.LJI;
        if (c388720FLy != null) {
            c388720FLy.LJI();
        }
    }

    @Override // X.C0FKZ, X.InterfaceC388800FMg
    public final void LJI() {
        C388200FJy c388200FJy = this.LIZJ;
        if (!c388200FJy.LJIIIZ.LJJIIJ) {
            LJIILIIL();
            return;
        }
        boolean z = c388200FJy.LJIIJJI.LIZ.LIZJ;
        if (!this.LJ || !z) {
            LJIIIIZZ();
            return;
        }
        C2487409ou.LIZLLL(100L, this.LJIIIZ);
        LJIILIIL();
        this.LJ = false;
    }

    @Override // X.C0FKS
    public final void LJIIIZ() {
        C0FM0 textSizeHelper;
        C388720FLy c388720FLy = this.LJI;
        if (c388720FLy == null || (textSizeHelper = c388720FLy.getTextSizeHelper()) == null) {
            return;
        }
        SeekBar seekBar = textSizeHelper.LIZ;
        float f = textSizeHelper.LIZLLL;
        float f2 = textSizeHelper.LJ;
        float min = Build.VERSION.SDK_INT >= 26 ? seekBar.getMin() : 0;
        float max = textSizeHelper.LIZ.getMax();
        if (1.0f > f) {
            min = 1.0f >= f2 ? max : ((min * (f2 - 1.0f)) + (max * (1.0f - f))) / (f2 - f);
        }
        seekBar.setProgress(C814420VxA.LIZIZ(min));
    }

    public final void LJIIL() {
        int i;
        int iMax;
        if (C0F8Y.LJIIIIZZ(this.LIZJ.LJ.LIZ)) {
            i = 22;
        } else {
            C0FF8 c0ff8 = this.LIZJ.LJFF;
            i = (c0ff8 == null || !c0ff8.LIZLLL()) ? 28 : 50;
        }
        Pair<Integer, Integer> pair = this.LIZJ.LJIIIZ.LJIIJ;
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        if (C0FM7.LIZ()) {
            float fCeil = (float) Math.ceil(C0FM7.LIZIZ(this.LIZJ.LJ.LIZ.getCompatModel().getMinFontSize()) / this.LIZJ.LJJI);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("wsx: currentMin :");
            sbLIZ.append(fCeil);
            sbLIZ.append("  min = ");
            sbLIZ.append(iIntValue);
            C388320FKk.LIZ.d(C2188811AlT.LIZIZ(sbLIZ));
            iMax = (int) Math.max(fCeil, iIntValue);
        } else {
            iMax = iIntValue;
        }
        C388720FLy c388720FLy = this.LJI;
        if (c388720FLy != null) {
            Integer numValueOf = Integer.valueOf(iMax);
            Integer numValueOf2 = Integer.valueOf(iIntValue2);
            C0FM0 textSizeHelper = c388720FLy.getTextSizeHelper();
            textSizeHelper.getClass();
            if (numValueOf != null) {
                textSizeHelper.LIZLLL = numValueOf.intValue() / i;
            }
            if (numValueOf2 != null) {
                textSizeHelper.LJ = numValueOf2.intValue() / i;
            }
        }
        C385340F8y c385340F8y = (C385340F8y) this.LJII.getValue();
        if (c385340F8y != null) {
            c385340F8y.setDefaultTextSize(i);
        }
        C385340F8y c385340F8y2 = (C385340F8y) this.LJII.getValue();
        if (c385340F8y2 != null) {
            c385340F8y2.setMinTextSize(iIntValue);
        }
    }

    @Override // X.C0FKS
    public final void LJIIIIZZ() {
        LJIIL();
        C388720FLy c388720FLy = this.LJI;
        if (c388720FLy != null) {
            c388720FLy.getTextSizeHelper().LIZ((TextView) this.LJII.getValue());
        }
        C388720FLy c388720FLy2 = this.LJI;
        if (c388720FLy2 != null) {
            c388720FLy2.LJII(false);
        }
    }

    public final void LJIILIIL() {
        LJIIL();
        C388720FLy c388720FLy = this.LJI;
        if (c388720FLy != null) {
            c388720FLy.getTextSizeHelper().LIZ((TextView) this.LJII.getValue());
        }
        if (this.LIZJ.LJIIJJI.LIZ.LIZJ) {
            C388720FLy c388720FLy2 = this.LJI;
            if (c388720FLy2 != null) {
                HandlerHook.viewPostDelay(c388720FLy2, c388720FLy2.LLILZLL, 100L);
                return;
            }
            return;
        }
        C388720FLy c388720FLy3 = this.LJI;
        if (c388720FLy3 != null) {
            c388720FLy3.LJII(true);
        }
    }

    @Override // X.C0FKS
    public final void LJIIJ(boolean z) {
        int i;
        ViewGroup viewGroup = this.LIZIZ;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJLZ(i, viewGroup);
    }

    @Override // X.C0FKS
    public final void LJIIJJI(int i, int i2) {
        C426750GoL.LJIIIZ(this.LIZIZ, Integer.valueOf(-i), null, Integer.valueOf(-i2), null, false, 10);
    }

    public C388700FLw(ViewGroup viewGroup, C388200FJy c388200FJy, boolean z, boolean z2, ViewGroup viewGroup2) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        super(c388200FJy);
        this.LIZIZ = viewGroup;
        this.LIZJ = c388200FJy;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = viewGroup2;
        C388720FLy c388720FLy = (C388720FLy) viewGroup.findViewById(R.id.xqd);
        this.LJI = c388720FLy;
        View viewFindViewById = viewGroup2.findViewById(R.id.mgs);
        this.LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1601));
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1600));
        this.LJIIIZ = new ARunnableS105S0100000_5(this, 130);
        if (c388720FLy != null) {
            if (c388200FJy.LJIIIZ.LJJI) {
                c388720FLy.setAttachToRight(true);
            }
            c388720FLy.LLIZLLLIL = c388200FJy.LJ;
            LJIIL();
            c388720FLy.setEnableTextAnimOpt(c388200FJy.LJIIIZ.LJIILJJIL);
            c388720FLy.setEnableDesignV2(c388200FJy.LJIIIZ.LJJIIJ);
        }
        if (viewGroup.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            if (c388720FLy != null && c388720FLy.getAttachToRight()) {
                ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
                if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams5) != null) {
                    layoutParams4.gravity = 8388629;
                }
            } else {
                ViewGroup.LayoutParams layoutParams6 = viewGroup.getLayoutParams();
                if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                    layoutParams3.gravity = 8388627;
                }
            }
        }
        if ((viewFindViewById != null ? viewFindViewById.getLayoutParams() : null) instanceof FrameLayout.LayoutParams) {
            if (c388720FLy != null && c388720FLy.getAttachToRight()) {
                ViewGroup.LayoutParams layoutParams7 = viewFindViewById.getLayoutParams();
                if ((layoutParams7 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams7) != null) {
                    layoutParams2.gravity = 8388629;
                }
            } else {
                ViewGroup.LayoutParams layoutParams8 = viewFindViewById.getLayoutParams();
                if ((layoutParams8 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams8) != null) {
                    layoutParams.gravity = 8388627;
                }
            }
        }
        if (c388720FLy != null) {
            c388720FLy.setOnTextSizeChangedListener(new C0FM5() { // from class: X.0FLv
                @Override // X.C0FM5
                public final void LIZ() {
                    C0FGR c0fgrLIZJ;
                    C385340F8y c385340F8y = (C385340F8y) this.LIZ.LJII.getValue();
                    if (c385340F8y != null) {
                        c385340F8y.LLJJIJIIJIL = false;
                    }
                    this.LIZ.getClass();
                    C0FF8 c0ff8 = this.LIZ.LIZJ.LJFF;
                    if (c0ff8 == null || (c0fgrLIZJ = c0ff8.LIZJ()) == null) {
                        return;
                    }
                    c0fgrLIZJ.LJIIJ(this.LIZ.LIZJ.LJ.LIZ);
                }
            });
            c388720FLy.setOnAdjustTextRollbarListener(new AwS406S0200000_5(this, c388720FLy, 154));
        }
    }
}
