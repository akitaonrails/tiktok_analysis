package X;

import Y.ALAdapterS2S0200000_5;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ebq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368040Ebq implements InterfaceC368590Ecj {
    public final C368220Ec8 LIZ;
    public float LIZIZ;
    public int LIZJ;
    public final /* synthetic */ C368010Ebn LIZLLL;

    @Override // X.InterfaceC368590Ecj
    public final boolean LIZ() {
        C368010Ebn c368010Ebn = this.LIZLLL;
        List<NLETrackSlot> list = c368010Ebn.LLILZIL;
        boolean z = false;
        if (list != null && !list.isEmpty() && ((ArrayList) this.LIZLLL.LLILZIL).size() > 1 && this.LIZLLL.LLJZ) {
            z = true;
        }
        c368010Ebn.setLongClickEnable$editor_trackpanel_release(z);
        return this.LIZLLL.LLJJIII;
    }

    @Override // X.InterfaceC368590Ecj
    public final void LIZJ(boolean z) {
        C368010Ebn c368010Ebn;
        InterfaceC368180Ec4 interfaceC368180Ec4;
        ImageView imageView;
        if (z) {
            this.LIZJ = this.LIZ.getIndex();
        }
        C368010Ebn c368010Ebn2 = this.LIZLLL;
        if (!c368010Ebn2.LLJJIII) {
            return;
        }
        c368010Ebn2.LLJJJJLIIL.cancel();
        this.LIZLLL.LLJJJJLIIL.removeAllUpdateListeners();
        this.LIZLLL.LLJJJJLIIL.removeAllListeners();
        if (!this.LIZLLL.LJ(this.LIZJ)) {
            this.LIZJ = this.LIZ.getIndex();
        }
        if (((C368220Ec8) ListProtector.get(this.LIZLLL.LLILLJJLI, this.LIZJ)).LLLFF) {
            this.LIZJ--;
        }
        for (C368220Ec8 c368220Ec8 : (ArrayList) this.LIZLLL.LLILLJJLI) {
            c368220Ec8.setEnableDragMode(true);
            C368230Ec9 itemFrameViewFromXml = c368220Ec8.getItemFrameViewFromXml();
            itemFrameViewFromXml.LLIZLLLIL = false;
            itemFrameViewFromXml.invalidate();
            if (!c368220Ec8.LLLIILIL && (imageView = c368220Ec8.LLLIIIL) != null) {
                C368610Ecl.LIZJ(imageView);
            }
            c368220Ec8.getCheckboxFromXml().setHandlerGone(false);
            C368390EcP c368390EcP = c368220Ec8.LLLILZLLLI;
            int i = c368390EcP.LJFF + c368390EcP.LJII;
            c368220Ec8.LLLII.setMarginStart(i);
            c368220Ec8.LLLII.setMarginEnd(i);
        }
        this.LIZLLL.getClass();
        if (this.LIZLLL.LJ(this.LIZ.getIndex()) && (interfaceC368180Ec4 = (c368010Ebn = this.LIZLLL).LLILZLL) != null) {
            interfaceC368180Ec4.LJ((NLETrackSlot) ListProtector.get(c368010Ebn.LLILZIL, this.LIZ.getIndex()), this.LIZ.getIndex(), this.LIZJ);
        }
        this.LIZLLL.LJIIIZ();
        this.LIZLLL.LLILZ.getLayoutParams().width = -2;
    }

    @Override // X.InterfaceC368590Ecj
    public final void LIZLLL(AwS549S0100000_5 awS549S0100000_5) {
        InterfaceC368180Ec4 interfaceC368180Ec4 = this.LIZLLL.LLILZLL;
        if (interfaceC368180Ec4 != null) {
            interfaceC368180Ec4.LIZLLL(awS549S0100000_5);
        }
    }

    public C368040Ebq(C368010Ebn c368010Ebn, C368220Ec8 c368220Ec8) {
        this.LIZLLL = c368010Ebn;
        this.LIZ = c368220Ec8;
    }

    @Override // X.InterfaceC368590Ecj
    public final boolean LIZIZ(float f, float f2) {
        Object next;
        float width = f;
        Object obj = null;
        boolean z = false;
        if (this.LIZLLL.getSelectIndex() != this.LIZ.getIndex() || this.LIZLLL.LLJJI != C0E6E.LINE) {
            this.LIZLLL.LJI(this.LIZ.getIndex(), C0E6E.LINE, false, null);
        }
        C368010Ebn c368010Ebn = this.LIZLLL;
        if (!c368010Ebn.LLJJIII) {
            return false;
        }
        NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLZIJ(this.LIZ.getIndex(), c368010Ebn.LLILZIL);
        if (nLETrackSlot == null) {
            return false;
        }
        this.LIZLLL.getClass();
        InterfaceC368180Ec4 interfaceC368180Ec4 = this.LIZLLL.LLILZLL;
        if (interfaceC368180Ec4 != null) {
            interfaceC368180Ec4.LJIIIZ(nLETrackSlot);
        }
        C368010Ebn c368010Ebn2 = this.LIZLLL;
        if (c368010Ebn2.LLJILJILJ) {
            C368220Ec8 c368220Ec8LIZJ = c368010Ebn2.getBlackSlotContainer().LIZJ();
            if (c368220Ec8LIZJ != null) {
                C368010Ebn c368010Ebn3 = this.LIZLLL;
                C19719512Dh.LIZ(c368010Ebn3.LLILZIL).remove(c368010Ebn3.getBlackSlotContainer().LIZLLL());
                ((ArrayList) c368010Ebn3.LLILLJJLI).remove(c368220Ec8LIZJ);
                C368010Ebn c368010Ebn4 = c368010Ebn3.LLILZ;
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c368010Ebn4, c368220Ec8LIZJ);
                c368010Ebn4.removeView(c368220Ec8LIZJ);
                c368010Ebn3.LJIIJ();
            }
        } else {
            C368010Ebn c368010Ebn5 = c368010Ebn2.LLILZ;
            ImageView imageView = c368010Ebn2.LLJIJIL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c368010Ebn5, imageView);
            c368010Ebn5.removeView(imageView);
        }
        this.LIZJ = this.LIZ.getIndex();
        C368220Ec8 c368220Ec8 = this.LIZ;
        c368220Ec8.bringToFront();
        C368400EcQ checkboxFromXml = c368220Ec8.getCheckboxFromXml();
        C368390EcP c368390EcP = c368220Ec8.LLLILZLLLI;
        float f3 = c368390EcP.LJIIJ;
        float f4 = c368390EcP.LJIIIZ;
        checkboxFromXml.LLJJJJLIIL = f3;
        checkboxFromXml.LLJJJJJIL = f4;
        checkboxFromXml.invalidate();
        checkboxFromXml.setDragMode(true);
        this.LIZLLL.getHapticFeedback().LIZ(this.LIZ, C0E4C.VIBRATE_IMPACT_LIGHT);
        final int[] iArr = new int[((ArrayList) this.LIZLLL.LLILLJJLI).size()];
        final int[] iArr2 = new int[((ArrayList) this.LIZLLL.LLILLJJLI).size()];
        final int[] iArr3 = new int[((ArrayList) this.LIZLLL.LLILLJJLI).size()];
        final C118300cf c118300cf = new C118300cf();
        c118300cf.element = this.LIZ.getHeight();
        int dimensionPixelSize = this.LIZLLL.getResources().getDimensionPixelSize(R.dimen.b3j);
        float f5 = 0.0f;
        if (this.LIZLLL.LIZLLL()) {
            float fLIZIZ = width + C369030EdR.LIZIZ(this.LIZLLL);
            int iLJIIJ = C1697810uHb.LJIIJ(this.LIZLLL.LLILLJJLI);
            for (int i = -1; i < iLJIIJ; i = -1) {
                C368220Ec8 c368220Ec82 = (C368220Ec8) ListProtector.get(this.LIZLLL.LLILLJJLI, iLJIIJ);
                c368220Ec82.LIZLLL();
                if (iLJIIJ != this.LIZ.getIndex()) {
                    c368220Ec82.setEnableDragMode(false);
                }
                if (iLJIIJ > this.LIZ.getIndex()) {
                    int width2 = c368220Ec82.getWidth();
                    C368010Ebn c368010Ebn6 = this.LIZLLL;
                    fLIZIZ += (width2 - ((c368010Ebn6.LLJLL + c368010Ebn6.LLJLLIL) * 2)) - c368220Ec82.getTransitionWidth();
                } else if (iLJIIJ == this.LIZ.getIndex()) {
                    int measuredWidth = this.LIZLLL.getMeasuredWidth();
                    int right = ((View) ListProtector.get(this.LIZLLL.LLILLJJLI, iLJIIJ)).getRight() + C369030EdR.LIZIZ(this.LIZLLL);
                    C368010Ebn c368010Ebn7 = this.LIZLLL;
                    iArr3[iLJIIJ] = measuredWidth - ((right - c368010Ebn7.LLJLL) - c368010Ebn7.LLJLLIL);
                    iArr2[iLJIIJ] = (((c368010Ebn7.getMeasuredWidth() - ((int) fLIZIZ)) - C369030EdR.LIZIZ(this.LIZLLL)) - iArr3[iLJIIJ]) - (C360610EBv.LIZJ / 2);
                    f5 = fLIZIZ;
                } else if (iLJIIJ < this.LIZ.getIndex()) {
                    int i2 = C360610EBv.LIZJ;
                    fLIZIZ += i2 + dimensionPixelSize;
                    int measuredWidth2 = this.LIZLLL.getMeasuredWidth();
                    int right2 = ((View) ListProtector.get(this.LIZLLL.LLILLJJLI, iLJIIJ)).getRight() + C369030EdR.LIZIZ(this.LIZLLL);
                    C368010Ebn c368010Ebn8 = this.LIZLLL;
                    iArr3[iLJIIJ] = measuredWidth2 - ((right2 - c368010Ebn8.LLJLL) - c368010Ebn8.LLJLLIL);
                    iArr2[iLJIIJ] = (((c368010Ebn8.getMeasuredWidth() - ((int) fLIZIZ)) - C369030EdR.LIZIZ(this.LIZLLL)) - iArr3[iLJIIJ]) - (i2 / 2);
                }
                int width3 = c368220Ec82.getWidth();
                C368010Ebn c368010Ebn9 = this.LIZLLL;
                iArr[iLJIIJ] = (width3 - ((c368010Ebn9.LLJLL + c368010Ebn9.LLJLLIL) * 2)) - C360610EBv.LIZJ;
                iLJIIJ--;
                obj = null;
            }
        } else {
            C368010Ebn c368010Ebn10 = this.LIZLLL;
            int i3 = 0;
            for (Object obj2 : (ArrayList) c368010Ebn10.LLILLJJLI) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C368220Ec8 c368220Ec83 = (C368220Ec8) obj2;
                    c368220Ec83.LIZLLL();
                    if (i3 != this.LIZ.getIndex()) {
                        c368220Ec83.setEnableDragMode(z);
                    }
                    if (i3 < this.LIZ.getIndex()) {
                        width += (c368220Ec83.getWidth() - ((c368010Ebn10.LLJLL + c368010Ebn10.LLJLLIL) * 2)) - c368220Ec83.getTransitionWidth();
                    } else if (i3 == this.LIZ.getIndex()) {
                        int left = (((View) ListProtector.get(c368010Ebn10.LLILLJJLI, i3)).getLeft() - C369030EdR.LIZIZ(c368010Ebn10)) + c368010Ebn10.LLJLL + c368010Ebn10.LLJLLIL;
                        iArr3[i3] = left;
                        iArr2[i3] = (((int) width) - left) - (C360610EBv.LIZJ / 2);
                        f5 = width;
                    } else if (i3 > this.LIZ.getIndex()) {
                        int i5 = C360610EBv.LIZJ;
                        width += i5 + dimensionPixelSize;
                        int left2 = (((View) ListProtector.get(c368010Ebn10.LLILLJJLI, i3)).getLeft() - C369030EdR.LIZIZ(c368010Ebn10)) + c368010Ebn10.LLJLL + c368010Ebn10.LLJLLIL;
                        iArr3[i3] = left2;
                        iArr2[i3] = (((int) width) - left2) - (i5 / 2);
                    }
                    iArr[i3] = (c368220Ec83.getWidth() - ((c368010Ebn10.LLJLL + c368010Ebn10.LLJLLIL) * 2)) - C360610EBv.LIZJ;
                    i3 = i4;
                    z = false;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            obj = null;
        }
        if (this.LIZLLL.LIZLLL()) {
            int size = ((ArrayList) this.LIZLLL.LLILLJJLI).size();
            for (int index = this.LIZ.getIndex() + 1; index < size; index++) {
                int i6 = C360610EBv.LIZJ;
                f5 -= i6 + dimensionPixelSize;
                int measuredWidth3 = this.LIZLLL.getMeasuredWidth();
                int right3 = ((View) ListProtector.get(this.LIZLLL.LLILLJJLI, index)).getRight() + C369030EdR.LIZIZ(this.LIZLLL);
                C368010Ebn c368010Ebn11 = this.LIZLLL;
                iArr3[index] = measuredWidth3 - ((right3 - c368010Ebn11.LLJLL) - c368010Ebn11.LLJLLIL);
                iArr2[index] = (((c368010Ebn11.getMeasuredWidth() - ((int) f5)) - C369030EdR.LIZIZ(this.LIZLLL)) - iArr3[index]) - (i6 / 2);
            }
        } else {
            for (int index2 = this.LIZ.getIndex() - 1; -1 < index2; index2--) {
                int i7 = C360610EBv.LIZJ;
                f5 -= i7 + dimensionPixelSize;
                int left3 = ((View) ListProtector.get(this.LIZLLL.LLILLJJLI, index2)).getLeft() - C369030EdR.LIZIZ(this.LIZLLL);
                C368010Ebn c368010Ebn12 = this.LIZLLL;
                int i8 = left3 + c368010Ebn12.LLJLL + c368010Ebn12.LLJLLIL;
                iArr3[index2] = i8;
                iArr2[index2] = (((int) f5) - i8) - (i7 / 2);
            }
        }
        this.LIZLLL.LLJJJJLIIL.cancel();
        this.LIZLLL.LLJJJJLIIL.removeAllUpdateListeners();
        this.LIZLLL.LLJJJJLIIL.removeAllListeners();
        final C368010Ebn c368010Ebn13 = this.LIZLLL;
        c368010Ebn13.LLJJJJLIIL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Ebx
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C368010Ebn c368010Ebn14 = c368010Ebn13;
                List<C368220Ec8> list = c368010Ebn14.LLILLJJLI;
                int[] iArr4 = iArr;
                C118300cf c118300cf2 = c118300cf;
                int[] iArr5 = iArr3;
                int[] iArr6 = iArr2;
                int i9 = 0;
                for (Object obj3 : (ArrayList) list) {
                    int i10 = i9 + 1;
                    if (i9 >= 0) {
                        C368220Ec8 c368220Ec84 = (C368220Ec8) obj3;
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (C360610EBv.LIZJ + ((c368010Ebn14.LLJLLIL + c368010Ebn14.LLJLILLLLZIIL) * 2) + ((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * iArr4[i9])), c118300cf2.element);
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c368220Ec84);
                        c368220Ec84.setLayoutParams(layoutParams);
                        float fFloatValue = iArr5[i9] + (((Float) valueAnimator.getAnimatedValue()).floatValue() * iArr6[i9]);
                        if (c368010Ebn14.LIZLLL()) {
                            fFloatValue = -fFloatValue;
                        }
                        C786410Ut5.Zc(c368220Ec84, fFloatValue);
                        i9 = i10;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        });
        this.LIZLLL.LLILZ.getLayoutParams().width = this.LIZLLL.LLILZ.getWidth();
        this.LIZLLL.LLJJJJLIIL.addListener(new ALAdapterS2S0200000_5(this.LIZLLL, this, 11));
        this.LIZLLL.LLJJJJLIIL.start();
        Iterator it2 = ((ArrayList) this.LIZLLL.LLILLJJLI).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((C368220Ec8) next).LLLFF) {
                    break;
                }
            } else {
                next = obj;
                break;
            }
        }
        View view = (View) next;
        if (view != null) {
            int visibility = view.getVisibility();
            view.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, view);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158  */
    @Override // X.InterfaceC368590Ecj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(float r13, float r14, boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368040Ebq.LJ(float, float, boolean, boolean):void");
    }
}
