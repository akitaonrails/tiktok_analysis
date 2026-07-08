package X;

import Y.ARunnableS130S0100000_30;
import Y.ARunnableS63S0300000_30;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.1Dgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class ViewOnTouchListenerC2262471Dgz implements View.OnTouchListener {
    public final /* synthetic */ C2262491Dh1 LL;
    public final /* synthetic */ C2262481Dh0 LLILLJJLI;

    public ViewOnTouchListenerC2262471Dgz(C2262491Dh1 c2262491Dh1, C2262481Dh0 c2262481Dh0) {
        this.LL = c2262491Dh1;
        this.LLILLJJLI = c2262481Dh0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        BPEAHandler bPEAHandler;
        BPEAHandler bPEAHandler2;
        BPEAHandler bPEAHandler3;
        BPEAHandler bPEAHandler4;
        BPEAHandler bPEAHandler5;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        C2262491Dh1 c2262491Dh1 = this.LL;
                        C2262481Dh0 c2262481Dh0 = this.LLILLJJLI;
                        c2262491Dh1.getClass();
                        if (!c2262481Dh0.LJIIJ) {
                            c2262481Dh0.LIZ();
                        }
                    }
                } else {
                    C2262491Dh1 c2262491Dh12 = this.LL;
                    C2262481Dh0 c2262481Dh02 = this.LLILLJJLI;
                    c2262491Dh12.getClass();
                    float scaledTouchSlop = ViewConfiguration.get(c2262481Dh02.LIZ.itemView.getContext()).getScaledTouchSlop();
                    float fAbs = Math.abs(motionEvent.getX() - c2262481Dh02.LJFF);
                    float fAbs2 = Math.abs(motionEvent.getY() - c2262481Dh02.LJI);
                    if ((fAbs > scaledTouchSlop || fAbs2 > scaledTouchSlop) && !c2262481Dh02.LJIIJJI) {
                        c2262481Dh02.LJIIJJI = true;
                    }
                    if (c2262481Dh02.LJIIIZ && !c2262481Dh02.LJIIIIZZ && fAbs > scaledTouchSlop) {
                        c2262481Dh02.LJIIIIZZ = true;
                        c2262481Dh02.LJIIJ = true;
                        c2262481Dh02.LIZ.getAdapterPosition();
                        ARunnableS130S0100000_30 aRunnableS130S0100000_30 = c2262481Dh02.LJIILJJIL;
                        if (aRunnableS130S0100000_30 != null && (bPEAHandler5 = c2262481Dh02.LJIIL) != null) {
                            bPEAHandler5.removeCallbacks(aRunnableS130S0100000_30);
                        }
                        View viewLIZIZ = c2262481Dh02.LIZIZ();
                        viewLIZIZ.animate().cancel();
                        viewLIZIZ.animate().scaleX(c2262491Dh12.LJFF.LJ).scaleY(c2262491Dh12.LJFF.LJ).setDuration(c2262491Dh12.LJFF.LJFF).start();
                        View view2 = c2262481Dh02.LIZ.itemView;
                        view2.setOnTouchListener(null);
                        HandlerHook.viewPost(view2, new ARunnableS63S0300000_30(c2262491Dh12, view2, c2262481Dh02, 8));
                        return true;
                    }
                }
            } else {
                C2262491Dh1 c2262491Dh13 = this.LL;
                C2262481Dh0 c2262481Dh03 = this.LLILLJJLI;
                c2262491Dh13.getClass();
                if (!c2262481Dh03.LJIIJ) {
                    if (!c2262481Dh03.LJIIIIZZ && !c2262481Dh03.LJIIIZ && !c2262481Dh03.LJIIJJI && SystemClock.uptimeMillis() - c2262481Dh03.LJII < c2262481Dh03.LIZIZ.LIZJ) {
                        c2262481Dh03.LJIIIIZZ = true;
                        int adapterPosition = c2262481Dh03.LIZ.getAdapterPosition();
                        if (adapterPosition != -1) {
                            c2262481Dh03.LIZLLL.invoke(c2262481Dh03.LIZ, Integer.valueOf(adapterPosition));
                        }
                    }
                    c2262481Dh03.LIZ();
                    return false;
                }
            }
        } else {
            C2262491Dh1 c2262491Dh14 = this.LL;
            C2262481Dh0 c2262481Dh04 = this.LLILLJJLI;
            c2262491Dh14.getClass();
            View viewLIZIZ2 = c2262481Dh04.LIZIZ();
            viewLIZIZ2.animate().cancel();
            viewLIZIZ2.animate().scaleX(c2262481Dh04.LIZIZ.LIZLLL).scaleY(c2262481Dh04.LIZIZ.LIZLLL).setDuration(c2262481Dh04.LIZIZ.LJFF).start();
            c2262481Dh04.LJIIIIZZ = false;
            c2262481Dh04.LJIIIZ = false;
            c2262481Dh04.LJIIJ = false;
            c2262481Dh04.LJIIJJI = false;
            c2262481Dh04.LJII = SystemClock.uptimeMillis();
            ARunnableS130S0100000_30 aRunnableS130S0100000_302 = c2262481Dh04.LJIILIIL;
            if (aRunnableS130S0100000_302 != null && (bPEAHandler4 = c2262481Dh04.LJIIL) != null) {
                bPEAHandler4.removeCallbacks(aRunnableS130S0100000_302);
            }
            ARunnableS130S0100000_30 aRunnableS130S0100000_303 = c2262481Dh04.LJIILJJIL;
            if (aRunnableS130S0100000_303 != null && (bPEAHandler3 = c2262481Dh04.LJIIL) != null) {
                bPEAHandler3.removeCallbacks(aRunnableS130S0100000_303);
            }
            c2262481Dh04.LJFF = motionEvent.getX();
            c2262481Dh04.LJI = motionEvent.getY();
            ARunnableS130S0100000_30 aRunnableS130S0100000_304 = c2262481Dh04.LJIILIIL;
            if (aRunnableS130S0100000_304 != null && (bPEAHandler2 = c2262481Dh04.LJIIL) != null) {
                C786410Ut5.LJLIIL(c2262491Dh14.LJFF.LIZ, bPEAHandler2, aRunnableS130S0100000_304);
            }
            ARunnableS130S0100000_30 aRunnableS130S0100000_305 = c2262481Dh04.LJIILJJIL;
            if (aRunnableS130S0100000_305 != null && (bPEAHandler = c2262481Dh04.LJIIL) != null) {
                C786410Ut5.LJLIIL(c2262491Dh14.LJFF.LIZIZ, bPEAHandler, aRunnableS130S0100000_305);
                return false;
            }
        }
        return false;
    }
}
