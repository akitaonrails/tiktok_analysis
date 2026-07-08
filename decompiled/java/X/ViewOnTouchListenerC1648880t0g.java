package X;

import Y.ACListenerS159S0100000_25;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import avg.f;
import kotlin.Pair;
import kotlin.Unit;
import mf.a;

/* JADX INFO: renamed from: X.0t0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnTouchListenerC1648880t0g extends FrameLayout implements View.OnTouchListener {
    public final ViewOnTouchListenerC1648690t0N LL;
    public final C2252331DDr LLILLJJLI;
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;
    public final C2252331DDr LLILZIL;
    public final C2252331DDr LLILZLL;
    public final C2252331DDr LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final C2252331DDr LLJ;
    public final C2252331DDr LLJI;
    public final C2252331DDr LLJIJIL;
    public final C2252331DDr LLJILJIL;
    public final C2252331DDr LLJILJILJ;
    public InterfaceC1648950t0n LLJILLL;
    public final int[] LLJJ;

    public final InterfaceC346201Wa<EnumC1448830no1> getOnRecordModeConfirmedFlow() {
        return this.LLJ;
    }

    public final InterfaceC346201Wa<Pair<Float, Float>> getOnRecordScaled() {
        return this.LLJILJILJ;
    }

    public final InterfaceC346201Wa<Unit> getOnRecordStartFlow() {
        return this.LLILZIL;
    }

    public final InterfaceC346201Wa<Unit> getOnRecordStopFlow() {
        return this.LLIZ;
    }

    public final InterfaceC346201Wa<Unit> getOnTakePhotoFlow() {
        return this.LLILLL;
    }

    public final InterfaceC346201Wa<Float> getOnUIRadiusChangedFlow() {
        return this.LLJIJIL;
    }

    public final void setCombineTakePhoto(boolean z) {
        this.LL.setCombineTakePhoto(z);
    }

    public final void setEnablePressRecording(boolean z) {
        this.LL.setEnablePressRecording(z);
    }

    public final void setMultiTouchHandler(InterfaceC1648950t0n interfaceC1648950t0n) {
        this.LLJILLL = interfaceC1648950t0n;
    }

    public final void setPhotoIdleStyle(boolean z) {
        EnumC1648530t07 enumC1648530t07;
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = this.LL;
        if (z) {
            enumC1648530t07 = EnumC1648530t07.PHOTO;
        } else {
            enumC1648530t07 = EnumC1648530t07.DEFAULT;
        }
        viewOnTouchListenerC1648690t0N.setPhotoIdleStyle(enumC1648530t07);
    }

    public final void setVideoRecordingConflictHandler(InterfaceC579890Mol interfaceC579890Mol) {
        this.LL.setVideoRecordingConflictHandler(interfaceC579890Mol);
    }

    public ViewOnTouchListenerC1648880t0g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 4);
        this.LLILLJJLI = c2252331DDrLIZIZ;
        this.LLILLL = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, null, 4);
        this.LLILZ = c2252331DDrLIZIZ2;
        this.LLILZIL = c2252331DDrLIZIZ2;
        C2252331DDr c2252331DDrLIZIZ3 = C09IR.LIZIZ(0, 1, null, 4);
        this.LLILZLL = c2252331DDrLIZIZ3;
        this.LLIZ = c2252331DDrLIZIZ3;
        C2252331DDr c2252331DDrLIZIZ4 = C09IR.LIZIZ(0, 1, null, 4);
        this.LLIZLLLIL = c2252331DDrLIZIZ4;
        this.LLJ = c2252331DDrLIZIZ4;
        C2252331DDr c2252331DDrLIZIZ5 = C09IR.LIZIZ(0, 1, null, 4);
        this.LLJI = c2252331DDrLIZIZ5;
        this.LLJIJIL = c2252331DDrLIZIZ5;
        C2252331DDr c2252331DDrLIZIZ6 = C09IR.LIZIZ(0, 1, null, 4);
        this.LLJILJIL = c2252331DDrLIZIZ6;
        this.LLJILJILJ = c2252331DDrLIZIZ6;
        this.LLJJ = new int[]{0, 0};
        ViewOnTouchListenerC1648690t0N viewOnTouchListenerC1648690t0N = new ViewOnTouchListenerC1648690t0N(context, attributeSet, 0);
        C786410Ut5.n7(viewOnTouchListenerC1648690t0N, new FrameLayout.LayoutParams(-1, -1));
        addView(viewOnTouchListenerC1648690t0N);
        this.LL = viewOnTouchListenerC1648690t0N;
        View.OnClickListener aCListenerS159S0100000_25 = new ACListenerS159S0100000_25(this, 59);
        View.OnClickListener aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS159S0100000_25) : aCListenerS159S0100000_25);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        viewOnTouchListenerC1648690t0N.setCombineTakePhoto(true);
        viewOnTouchListenerC1648690t0N.setPhotoIdleStyle(EnumC1648530t07.PHOTO);
        viewOnTouchListenerC1648690t0N.LJIILJJIL(3, true, false, false);
        viewOnTouchListenerC1648690t0N.setRecordListener(new InterfaceC1648710t0P() { // from class: X.0t0j
            @Override // X.InterfaceC1648710t0P
            public final boolean O0() {
                return false;
            }

            @Override // X.InterfaceC1648710t0P
            public final void R2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void S2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void W2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void p2() {
            }

            @Override // X.InterfaceC1648710t0P
            public final void Q2() {
                this.LIZ.LLILZ.LIZJ(Unit.LIZ);
                ViewOnTouchListenerC1648880t0g viewOnTouchListenerC1648880t0g = this.LIZ;
                viewOnTouchListenerC1648880t0g.LL.getLocationOnScreen(viewOnTouchListenerC1648880t0g.LLJJ);
            }

            @Override // X.InterfaceC1648710t0P
            public final void T2(boolean z) {
                this.LIZ.LLILLJJLI.LIZJ(Unit.LIZ);
            }

            @Override // X.InterfaceC1648710t0P
            public final void V2(boolean z) {
                if (!z) {
                    this.LIZ.LLILZLL.LIZJ(Unit.LIZ);
                }
            }

            @Override // X.InterfaceC1648710t0P
            public final void y2(EnumC1448830no1 enumC1448830no1) {
                this.LIZ.LLIZLLLIL.LIZJ(enumC1448830no1);
            }

            @Override // X.InterfaceC1648710t0P
            public final void U2(float f, float f2) {
                this.LIZ.LLJILJIL.LIZJ(new Pair(Float.valueOf(f), Float.valueOf(f2)));
            }
        });
        viewOnTouchListenerC1648690t0N.setRecordLayoutUIChangedListener(new InterfaceC1648720t0Q() { // from class: X.0t0l
            @Override // X.InterfaceC1648720t0Q
            public final void LIZ(float f) {
                this.LIZ.LLJI.LIZJ(Float.valueOf(f));
            }
        });
        viewOnTouchListenerC1648690t0N.setOnGestureListener(new AbstractC21664519qV() { // from class: X.0t0m
            @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
            public final void LIZJ(MotionEvent motionEvent, int[] iArr) {
                LJIILIIL(motionEvent, this.LL.LLJJ);
                ViewOnTouchListenerC1648880t0g viewOnTouchListenerC1648880t0g = this.LL;
                InterfaceC1648950t0n interfaceC1648950t0n = viewOnTouchListenerC1648880t0g.LLJILLL;
                if (interfaceC1648950t0n != null) {
                    interfaceC1648950t0n.LIZJ(motionEvent, viewOnTouchListenerC1648880t0g.LLJJ);
                }
            }

            @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
            public final void LJI(MotionEvent motionEvent, int[] iArr) {
                LJIILIIL(motionEvent, this.LL.LLJJ);
                ViewOnTouchListenerC1648880t0g viewOnTouchListenerC1648880t0g = this.LL;
                InterfaceC1648950t0n interfaceC1648950t0n = viewOnTouchListenerC1648880t0g.LLJILLL;
                if (interfaceC1648950t0n != null) {
                    interfaceC1648950t0n.LJI(motionEvent, viewOnTouchListenerC1648880t0g.LLJJ);
                }
            }

            @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
            public final void LJII(MotionEvent motionEvent, int[] iArr) {
                LJIILIIL(motionEvent, this.LL.LLJJ);
                ViewOnTouchListenerC1648880t0g viewOnTouchListenerC1648880t0g = this.LL;
                InterfaceC1648950t0n interfaceC1648950t0n = viewOnTouchListenerC1648880t0g.LLJILLL;
                if (interfaceC1648950t0n != null) {
                    interfaceC1648950t0n.LJII(motionEvent, viewOnTouchListenerC1648880t0g.LLJJ);
                }
            }

            @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
            public final void LJIIIIZZ(MotionEvent motionEvent, int[] iArr) {
                LJIILIIL(motionEvent, this.LL.LLJJ);
                ViewOnTouchListenerC1648880t0g viewOnTouchListenerC1648880t0g = this.LL;
                InterfaceC1648950t0n interfaceC1648950t0n = viewOnTouchListenerC1648880t0g.LLJILLL;
                if (interfaceC1648950t0n != null) {
                    interfaceC1648950t0n.LJIIIIZZ(motionEvent, viewOnTouchListenerC1648880t0g.LLJJ);
                }
            }

            @Override // X.AbstractC21664519qV, X.InterfaceC21645719nT
            public final void LJIIJ(MotionEvent motionEvent, int[] iArr) {
                LJIILIIL(motionEvent, this.LL.LLJJ);
                ViewOnTouchListenerC1648880t0g viewOnTouchListenerC1648880t0g = this.LL;
                InterfaceC1648950t0n interfaceC1648950t0n = viewOnTouchListenerC1648880t0g.LLJILLL;
                if (interfaceC1648950t0n != null) {
                    interfaceC1648950t0n.LJIIJ(motionEvent, viewOnTouchListenerC1648880t0g.LLJJ);
                }
            }
        });
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.LL.onTouch(view, motionEvent);
        return false;
    }
}
