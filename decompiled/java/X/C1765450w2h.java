package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0w2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765450w2h extends AbstractC1763170vz1 {
    public final C21649619o6 LL;
    public final TuxTextView LLILLJJLI;
    public C1762960vyg LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public InterfaceC1763180vz2 LLILZLL;

    public final AtomicBoolean L5() {
        return (AtomicBoolean) this.LLILZ.getValue();
    }

    @Override // X.AbstractC1763170vz1
    public final void I5(AbstractC1763110vyv abstractC1763110vyv) {
        C1762960vyg c1762960vyg = (C1762960vyg) abstractC1763110vyv;
        this.LLILLL = c1762960vyg;
        String strLIZIZ = c1762960vyg.LJ;
        if (new C0VSJ(strLIZIZ).exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("file://");
            sbLIZ.append(c1762960vyg.LJ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(strLIZIZ);
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        InterfaceC1763870w09 interfaceC1763870w09 = c1762960vyg.LIZJ;
        if (interfaceC1763870w09 != null) {
            C21649619o6 c21649619o6 = this.LL;
            String str = c1762960vyg.LIZIZ;
            interfaceC1763870w09.LIZ(c21649619o6, str, str);
        }
        this.LL.setController(abstractC1320710kTNLIZ);
        if (C770702zh.LIZIZ(c1762960vyg.LJFF)) {
            this.LLILLJJLI.setText(c1762960vyg.LJFF);
            C03DZ.LIZJ(this.LLILLJJLI);
        } else {
            C12ES.LJIILL(4, this.LLILLJJLI);
        }
    }

    public final void N5(boolean z) {
        String str;
        C1762960vyg c1762960vyg = this.LLILLL;
        if (c1762960vyg != null) {
            str = c1762960vyg.LJFF;
        } else {
            str = null;
        }
        if (C770702zh.LIZIZ(str)) {
            if (z) {
                if (this.LLILLJJLI.getVisibility() != 0) {
                    C03DZ.LIZJ(this.LLILLJJLI);
                }
            } else {
                if (this.LLILLJJLI.getVisibility() != 0) {
                    return;
                }
                C12ES.LJIILL(4, this.LLILLJJLI);
            }
        }
    }

    public C1765450w2h(C21649519o5 c21649519o5, final boolean z) {
        super(c21649519o5);
        C21649619o6 c21649619o6 = (C21649619o6) this.itemView.findViewById(R.id.qe7);
        this.LL = c21649619o6;
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.qcn);
        this.LLILZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(161));
        this.LLILZIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(160));
        c21649619o6.setHorizontalNestedScrollEnabled(true);
        c21649619o6.LJI(new InterfaceC1765420w2e() { // from class: X.0w2i
            @Override // X.InterfaceC1765420w2e
            public final void LJIJJLI(float f) {
                C1765450w2h c1765450w2h = this.LL;
                C1762960vyg c1762960vyg = c1765450w2h.LLILLL;
                if (c1762960vyg != null && c1762960vyg.LJFF != null && !((AtomicBoolean) c1765450w2h.LLILZIL.getValue()).get()) {
                    if (f > 1.0f) {
                        c1765450w2h.L5().compareAndSet(false, true);
                    } else {
                        c1765450w2h.L5().compareAndSet(true, false);
                    }
                    c1765450w2h.N5(!c1765450w2h.L5().get());
                }
            }
        });
        c21649619o6.LIZIZ(new InterfaceC21650419oE() { // from class: X.0w2j
            @Override // X.InterfaceC21650419oE
            public final void kG(float f, int i) {
            }

            @Override // X.InterfaceC21650419oE
            public final void gA(int i) {
                C1765450w2h c1765450w2h = this.LL;
                C1762960vyg c1762960vyg = c1765450w2h.LLILLL;
                if (c1762960vyg != null && c1762960vyg.LJFF != null) {
                    if (!c1765450w2h.L5().get()) {
                        c1765450w2h.N5(true);
                    }
                    ((AtomicBoolean) c1765450w2h.LLILZIL.getValue()).compareAndSet(true, false);
                }
            }

            @Override // X.InterfaceC21650419oE
            public final void xP(int i) {
                C1765450w2h c1765450w2h = this.LL;
                C1762960vyg c1762960vyg = c1765450w2h.LLILLL;
                if (c1762960vyg != null && c1762960vyg.LJFF != null) {
                    ((AtomicBoolean) c1765450w2h.LLILZIL.getValue()).compareAndSet(false, true);
                    if (!c1765450w2h.L5().get()) {
                        c1765450w2h.N5(false);
                    }
                }
            }
        });
        c21649519o5.setDelegateDragTransitionView(c21649619o6);
        c21649619o6.setTapListener(new GestureDetector.SimpleOnGestureListener() { // from class: X.0w2m
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                C21649619o6 c21649619o62 = this.LL;
                C21649019o0 c21649019o0 = c21649619o62.LLILLL;
                if (c21649019o0.LLJJIJIL == null) {
                    c21649019o0.LLJJIJIL = new C1765510w2n(c21649019o0);
                }
                InterfaceC1765520w2o interfaceC1765520w2o = c21649019o0.LLJJIJIL;
                c21649019o0.LLJIJIL.getValues(c21649019o0.LLJILJILJ);
                boolean z2 = false;
                float fLIZ = ((C1765510w2n) interfaceC1765520w2o).LIZ(c21649019o0.LLJILJILJ[0]);
                C21649019o0 c21649019o02 = c21649619o62.LLILLL;
                float f = c21649019o02.LLILZLL;
                if (f == 0.0f) {
                    f = c21649019o02.LLIZ;
                }
                if (fLIZ == f) {
                    z2 = true;
                }
                boolean z3 = !z2;
                this.L5().compareAndSet(z3, z2);
                this.N5(z3);
                return super.onDoubleTap(motionEvent);
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (z) {
                    C21649419o4 c21649419o4 = this.LL.LLIZLLLIL;
                    if (c21649419o4 == null) {
                        c21649419o4 = null;
                    }
                    c21649419o4.LLJZ.set(c21649419o4.LLJIJIL);
                    c21649419o4.LJIJI(true);
                }
                return super.onSingleTapConfirmed(motionEvent);
            }
        });
        c21649619o6.setControllerListener(new C1776250wK7(this, 0));
    }
}
