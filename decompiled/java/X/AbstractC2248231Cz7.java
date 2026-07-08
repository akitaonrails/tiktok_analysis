package X;

import Y.ARunnableS134S0100000_34;
import android.content.Context;
import android.graphics.Rect;
import android.os.Trace;
import android.text.Layout;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1Cz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2248231Cz7 implements InterfaceC1859950yV7 {
    public Context LIZ;
    public final ViewTreeObserverOnScrollChangedListenerC2248281CzC LIZIZ;
    public final C1D16 LIZJ;
    public View LIZLLL;
    public Spannable LJ;
    public final int[] LJFF;
    public C2248181Cz2 LJII;
    public C2248181Cz2 LJIIIZ;
    public int LJIIJJI;
    public int LJIIL;
    public Rect LJIILIIL;
    public InterfaceC2248311CzF LJIILLIIL;
    public final C2248301CzE LJIJ;
    public final Rect LJI = new Rect();
    public int LJIIIIZZ = -1;
    public int LJIIJ = -1;
    public BackgroundColorSpan LJIILJJIL = new BackgroundColorSpan(1291887305);
    public boolean LJIILL = false;
    public final Set<InterfaceC2248331CzH> LJIIZILJ = new LinkedHashSet();
    public final ARunnableS134S0100000_34 LJIJI = new ARunnableS134S0100000_34(this, 93);
    public final ARunnableS134S0100000_34 LJIJJ = new ARunnableS134S0100000_34(this, 94);

    @Override // X.InterfaceC1859950yV7
    public void LIZ() {
        this.LJIIJJI = 0;
        this.LJIIL = LJIJ().length();
        this.LJIILL = true;
        LJJII();
        LJIIJ();
    }

    @Override // X.InterfaceC1859950yV7
    public void LIZJ() {
        this.LJIILL = false;
        C2248181Cz2 c2248181Cz2 = this.LJII;
        if (c2248181Cz2 != null) {
            c2248181Cz2.LIZIZ();
        }
        C2248181Cz2 c2248181Cz22 = this.LJIIIZ;
        if (c2248181Cz22 != null) {
            c2248181Cz22.LIZIZ();
        }
        if (this.LIZLLL != null) {
            InterfaceC2248311CzF interfaceC2248311CzF = this.LJIILLIIL;
            if (interfaceC2248311CzF != null) {
                interfaceC2248311CzF.LIZIZ();
            }
            CharSequence charSequenceLJIJ = LJIJ();
            Spannable spannable = charSequenceLJIJ instanceof Spannable ? (Spannable) charSequenceLJIJ : null;
            this.LJ = spannable;
            if (spannable != null) {
                spannable.removeSpan(this.LJIILJJIL);
                this.LIZLLL.invalidate();
            }
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
    }

    public abstract Layout LJIIZILJ();

    public abstract CharSequence LJIJ();

    public abstract void LJIJJ();

    public abstract boolean LJIJJLI(MotionEvent motionEvent);

    public abstract void LJJ();

    public abstract void LJJI(Layout layout, int i, C2248181Cz2 c2248181Cz2, boolean z);

    public abstract void LJJIII();

    public abstract void LJJIIJZLJL(int i, int i2, boolean z);

    @Override // X.InterfaceC1859950yV7
    public final void LJIIJ() {
        if (this.LIZLLL == null) {
            return;
        }
        Layout layoutLJIIZILJ = LJIIZILJ();
        this.LIZLLL.getLocationInWindow(this.LJFF);
        C2248181Cz2 c2248181Cz2 = this.LJII;
        if (c2248181Cz2 != null) {
            HandlerHook.viewRemoveCallbacks(c2248181Cz2, this.LJIJJ);
        }
        C2248181Cz2 c2248181Cz22 = this.LJIIIZ;
        if (c2248181Cz22 != null) {
            HandlerHook.viewRemoveCallbacks(c2248181Cz22, this.LJIJJ);
        }
        LJJI(layoutLJIIZILJ, this.LJIIJJI, LJIILLIIL(true), true);
        LJJI(layoutLJIIZILJ, this.LJIIL, LJIILLIIL(false), false);
    }

    public final void LJIL() {
        C2248301CzE c2248301CzE = this.LJIJ;
        if (c2248301CzE == null || !c2248301CzE.LIZ) {
            return;
        }
        c2248301CzE.LIZ = false;
        InterfaceC2248321CzG interfaceC2248321CzG = c2248301CzE.LIZIZ;
        if (interfaceC2248321CzG != null) {
            AbstractC2248231Cz7 abstractC2248231Cz7 = ((C2248291CzD) interfaceC2248321CzG).LIZ;
            if (abstractC2248231Cz7.LJII == null || abstractC2248231Cz7.LJIIIZ == null) {
                return;
            }
            abstractC2248231Cz7.LJJIII();
        }
    }

    public final void LJJIFFI() {
        if (this.LIZLLL != null) {
            LIZJ();
            HandlerHook.viewRemoveCallbacks(this.LIZLLL, this.LJIJI);
            C786410Ut5.E3(this.LIZLLL.getViewTreeObserver(), this.LIZIZ);
            C786410Ut5.C3(this.LIZLLL.getViewTreeObserver(), this.LIZJ);
            this.LIZLLL = null;
        }
        C2248181Cz2 c2248181Cz2 = this.LJII;
        if (c2248181Cz2 != null) {
            c2248181Cz2.setTouchMoveListener(null);
            this.LJII = null;
        }
        C2248181Cz2 c2248181Cz22 = this.LJIIIZ;
        if (c2248181Cz22 != null) {
            c2248181Cz22.setTouchMoveListener(null);
            this.LJIIIZ = null;
        }
        this.LIZ = null;
    }

    public final void LJJII() {
        if (this.LIZLLL == null) {
            return;
        }
        CharSequence charSequenceLJIJ = LJIJ();
        Spannable spannable = charSequenceLJIJ instanceof Spannable ? (Spannable) charSequenceLJIJ : null;
        this.LJ = spannable;
        if (spannable != null) {
            int length = this.LJIIJJI;
            int length2 = this.LJIIL;
            if (length >= 0 && length2 > length && length2 <= spannable.length()) {
                String string = spannable.subSequence(length, length2).toString();
                ArrayList<String> arrayList = new ArrayList();
                arrayList.add("\n");
                arrayList.add("\n ");
                for (String str : arrayList) {
                    if (string.startsWith(str)) {
                        length += str.length();
                    }
                    if (string.endsWith(str)) {
                        length2 -= str.length();
                    }
                }
                if (length >= 0 && length2 > length && length2 <= spannable.length()) {
                    this.LJIIJJI = length;
                    this.LJIIL = length2;
                }
            }
            int i = this.LJIIJJI;
            if (i >= 0 && this.LJIIL > i) {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(this.LJ.toString());
                this.LJIIJJI = characterInstance.isBoundary(this.LJIIJJI) ? this.LJIIJJI : characterInstance.preceding(this.LJIIJJI);
                int iFollowing = characterInstance.isBoundary(this.LJIIL) ? this.LJIIL : characterInstance.following(this.LJIIL);
                this.LJIIL = iFollowing;
                C786410Ut5.o2(this.LJ, this.LJIILJJIL, this.LJIIJJI, iFollowing, 17);
                InterfaceC2248311CzF interfaceC2248311CzF = this.LJIILLIIL;
                if (interfaceC2248311CzF != null) {
                    interfaceC2248311CzF.LIZ();
                }
            }
            this.LIZLLL.invalidate();
        }
        int i2 = C08C0.LIZ;
        Trace.endSection();
    }

    @Override // X.InterfaceC1859950yV7
    public final int LJII() {
        return this.LJIIJJI;
    }

    @Override // X.InterfaceC1859950yV7
    public final int LJIIIZ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1859950yV7
    public final C2248181Cz2 LJIIJJI() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1859950yV7
    public final C2248181Cz2 LJIIL() {
        return this.LJII;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.1CzC] */
    public AbstractC2248231Cz7(View view) {
        int[] iArr = new int[2];
        this.LJFF = iArr;
        this.LIZ = view.getContext();
        this.LIZLLL = view;
        C2248301CzE c2248301CzE = new C2248301CzE();
        this.LJIJ = c2248301CzE;
        c2248301CzE.LIZIZ = new C2248291CzD(this);
        if (view instanceof TextView) {
            ((TextView) view).setTextIsSelectable(false);
            TextView textView = (TextView) view;
            textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
        }
        C2248181Cz2 c2248181Cz2 = new C2248181Cz2(this.LIZ);
        this.LJII = c2248181Cz2;
        c2248181Cz2.setIsStartCursor(true);
        this.LJII.setChangeListener(new C2248201Cz4(this));
        this.LJII.setTouchMoveListener(new InterfaceC2248191Cz3() { // from class: X.1CzA
            @Override // X.InterfaceC2248191Cz3
            public final void LIZIZ(C2248181Cz2 c2248181Cz22, MotionEvent motionEvent) {
                this.LIZ.LJIJI(c2248181Cz22, motionEvent);
            }

            @Override // X.InterfaceC2248191Cz3
            public final void LIZ(int i, int i2, boolean z, boolean z2) {
                AbstractC2248231Cz7 abstractC2248231Cz7 = this.LIZ;
                if (abstractC2248231Cz7.LJIIIIZZ == -1) {
                    abstractC2248231Cz7.LJIIIIZZ = i2;
                }
                abstractC2248231Cz7.LJJIIJ(i, i2, z, z2);
                ArrayList arrayList = new ArrayList(this.LIZ.LJIIZILJ);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC2248331CzH) ListProtector.get(arrayList, i3)).LIZ(i, i2, this.LIZ.LJIIIIZZ, z2);
                }
                this.LIZ.LJIIIIZZ = i2;
            }
        });
        C2248181Cz2 c2248181Cz22 = new C2248181Cz2(this.LIZ);
        this.LJIIIZ = c2248181Cz22;
        c2248181Cz22.setIsStartCursor(false);
        this.LJIIIZ.setTouchMoveListener(new InterfaceC2248191Cz3() { // from class: X.1CzB
            @Override // X.InterfaceC2248191Cz3
            public final void LIZIZ(C2248181Cz2 c2248181Cz23, MotionEvent motionEvent) {
                this.LIZ.LJIJI(c2248181Cz23, motionEvent);
            }

            @Override // X.InterfaceC2248191Cz3
            public final void LIZ(int i, int i2, boolean z, boolean z2) {
                AbstractC2248231Cz7 abstractC2248231Cz7 = this.LIZ;
                if (abstractC2248231Cz7.LJIIJ == -1) {
                    abstractC2248231Cz7.LJIIJ = i2;
                }
                abstractC2248231Cz7.LJJIIJ(i, i2, z, z2);
                ArrayList arrayList = new ArrayList(this.LIZ.LJIIZILJ);
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((InterfaceC2248331CzH) ListProtector.get(arrayList, i3)).LIZ(i, i2, this.LIZ.LJIIJ, z2);
                }
                this.LIZ.LJIIJ = i2;
            }
        });
        this.LIZLLL.getLocationInWindow(iArr);
        this.LIZIZ = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.1CzC
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AbstractC2248231Cz7 abstractC2248231Cz7 = this.LL;
                if (abstractC2248231Cz7.LJIILL) {
                    int[] iArr2 = abstractC2248231Cz7.LJFF;
                    float f = iArr2[1];
                    abstractC2248231Cz7.LIZLLL.getLocationInWindow(iArr2);
                    AbstractC2248231Cz7 abstractC2248231Cz72 = this.LL;
                    if (f != abstractC2248231Cz72.LJFF[1]) {
                        C2248301CzE c2248301CzE2 = abstractC2248231Cz72.LJIJ;
                        if (c2248301CzE2.LIZ) {
                            return;
                        }
                        c2248301CzE2.LIZ = true;
                        InterfaceC2248321CzG interfaceC2248321CzG = c2248301CzE2.LIZIZ;
                        if (interfaceC2248321CzG != null) {
                            ((C2248291CzD) interfaceC2248321CzG).LIZ.LJIJJ();
                        }
                    }
                }
            }
        };
        C786410Ut5.z3(this.LIZLLL.getViewTreeObserver(), this.LIZIZ);
        this.LIZJ = new C1D16(this, 2);
        C786410Ut5.x3(this.LIZLLL.getViewTreeObserver(), this.LIZJ);
    }

    @Override // X.InterfaceC1859950yV7
    public final void LIZIZ(C1859970yV9 c1859970yV9) {
        this.LJIILLIIL = c1859970yV9;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJI(BackgroundColorSpan backgroundColorSpan) {
        this.LJIILJJIL = backgroundColorSpan;
    }

    public final C2248181Cz2 LJIILLIIL(boolean z) {
        boolean z2;
        C2248181Cz2 c2248181Cz2 = this.LJII;
        if (c2248181Cz2.LLILZ) {
            z2 = c2248181Cz2.LLILZLL;
        } else {
            z2 = c2248181Cz2.LLILZIL;
        }
        if (z2 == z) {
            return c2248181Cz2;
        }
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1859950yV7
    public final void LJIILIIL(int i, int i2) {
        this.LJIIJJI = i;
        this.LJIIL = i2;
        this.LJIILL = true;
        LJJII();
        LJIIJ();
    }

    public final void LJIJI(C2248181Cz2 c2248181Cz2, MotionEvent motionEvent) {
        Rect rect = this.LJIILIIL;
        if ((rect == null || !rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) && LJIJJLI(motionEvent)) {
            LJJ();
            HandlerHook.viewPostDelay(c2248181Cz2, this.LJIJJ, 200L);
        }
    }

    public final void LJJIIJ(int i, int i2, boolean z, boolean z2) {
        if (this.LIZLLL == null) {
            return;
        }
        if (!z2) {
            int i3 = this.LJIIJJI;
            int i4 = this.LJIIL;
            if (i3 == i4) {
                if (i3 > 0) {
                    this.LJIIJJI = i3 - 1;
                } else if (i4 < LJIJ().length() - 1) {
                    this.LJIIL++;
                }
            }
        } else {
            LJJIIJZLJL(i, i2, z);
        }
        LJJII();
        LJIIJ();
    }
}
