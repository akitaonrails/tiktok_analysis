package X;

import Y.ARunnableS132S0100000_32;
import Y.ARunnableS42S0101000_31;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.195s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214834195s implements InterfaceC214832195q {
    public C16F5 LIZ;
    public boolean LIZLLL;
    public int LJ;
    public final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());
    public EnumC214828195m LIZJ = EnumC214828195m.LARGE;
    public final ARunnableS132S0100000_32 LJFF = new ARunnableS132S0100000_32(this, 104);

    public final void LIZ() {
        C19ME c19me;
        int iLJIIIZ;
        C16F5 c16f5 = this.LIZ;
        if (c16f5 != null) {
            ViewGroup.LayoutParams layoutParams = c16f5.getLayoutParams();
            if (!(layoutParams instanceof C19ME) || (c19me = (C19ME) layoutParams) == null) {
                return;
            }
            int i = C214829195n.LIZ[this.LIZJ.ordinal()];
            if (i == 1) {
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.avt);
            } else {
                if (i != 2) {
                    throw new C1954807lC();
                }
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.avu);
            }
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            c19me.bottomToBottom = 0;
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = iLJIIIZ;
            c19me.topToTop = -1;
            c19me.topToBottom = -1;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = 0;
            C786410Ut5.y6(c16f5, c19me);
        }
    }

    public final void LIZIZ() {
        View view;
        C16F5 c16f5 = this.LIZ;
        if (c16f5 != null && c16f5.getVisibility() == 0) {
            c16f5.requestLayout();
            Object parent = c16f5.getParent();
            if (!(parent instanceof View) || (view = (View) parent) == null) {
                return;
            }
            view.requestLayout();
        }
    }

    public final void LIZJ() {
        long jLJII = C915980Zwa.LJIIIZ().LJII();
        if (jLJII < 0) {
            jLJII = 0;
        }
        C16F5 c16f5 = this.LIZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJJ(2131851888, Long.valueOf(jLJII)));
        }
    }

    @Override // X.InterfaceC214832195q
    public void onEvent(AbstractC214838195w abstractC214838195w) {
        C16F5 c16f5;
        if (abstractC214838195w instanceof C960230b5x) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnSearchStarted path=");
            sbLIZ.append(((C960230b5x) abstractC214838195w).LIZ);
            sbLIZ.append(" → arm search + tick loop (show on OnOverlayShown)");
            C20441214yg.LJIIIZ("CancelCountdownComponent", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZLLL = true;
            this.LJ++;
            C16F5 c16f52 = this.LIZ;
            if (c16f52 != null) {
                c16f52.animate().cancel();
                C786410Ut5.k5(c16f52, 1.0f);
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
            if (this.LIZLLL) {
                this.LIZIZ.removeCallbacks(this.LJFF);
                LIZJ();
                C786410Ut5.LJLIIL(1000L, this.LIZIZ, this.LJFF);
                return;
            }
            return;
        }
        int length = 0;
        if (abstractC214838195w instanceof C20689215xa) {
            this.LIZLLL = false;
            C20441214yg.LJIIIZ("CancelCountdownComponent", "OnPartnerFound → stop tick loop + fade-out cancel button (700ms)");
            this.LIZIZ.removeCallbacks(this.LJFF);
            C16F5 c16f53 = this.LIZ;
            if (c16f53 != null && c16f53.getVisibility() == 0) {
                int i = this.LJ;
                c16f53.animate().cancel();
                c16f53.animate().alpha(0.0f).setDuration(700L).withEndAction(new ARunnableS42S0101000_31(i, this, 18)).start();
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C960250b5z.LIZ)) {
            this.LIZLLL = false;
            this.LJ++;
            C20441214yg.LJIIIZ("CancelCountdownComponent", "OnSearchCancelled → stop tick loop + hide cancel button (instant)");
            this.LIZIZ.removeCallbacks(this.LJFF);
            C16F5 c16f54 = this.LIZ;
            if (c16f54 == null) {
                return;
            }
            c16f54.animate().cancel();
            C786410Ut5.k5(c16f54, 1.0f);
            C786410Ut5.LLJJJJ(c16f54, 8);
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C214841195z.LIZ)) {
            C20441214yg.LJIIIZ("CancelCountdownComponent", "OnOverlayShown → show cancel button (overlay geometry committed)");
            if (!this.LIZLLL || (c16f5 = this.LIZ) == null) {
                return;
            }
            c16f5.animate().cancel();
            C786410Ut5.k5(c16f5, 1.0f);
            LIZJ();
            C786410Ut5.LLJJJJ(c16f5, 0);
            c16f5.setClickable(true);
            c16f5.setFocusable(true);
            LIZIZ();
            if (this.LIZLLL) {
                this.LIZIZ.removeCallbacks(this.LJFF);
                LIZJ();
                C786410Ut5.LJLIIL(1000L, this.LIZIZ, this.LJFF);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("showCancelButtonIfSearching w=");
            sbLIZ2.append(c16f5.getWidth());
            sbLIZ2.append(" h=");
            sbLIZ2.append(c16f5.getHeight());
            sbLIZ2.append(" textLen=");
            CharSequence text = c16f5.getText();
            if (text != null) {
                length = text.length();
            }
            sbLIZ2.append(length);
            C20441214yg.LJIIIZ("CancelCountdownComponent", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (Intrinsics.LJFF(abstractC214838195w, C214839195x.LIZ) || Intrinsics.LJFF(abstractC214838195w, C214840195y.LIZ) || Intrinsics.LJFF(abstractC214838195w, C960240b5y.LIZ)) {
            return;
        }
        if (abstractC214838195w instanceof C960220b5w) {
            this.LIZLLL = false;
            this.LJ++;
            return;
        }
        if (abstractC214838195w instanceof C1158070gF3) {
            return;
        }
        if (abstractC214838195w instanceof C1158080gF4) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("OnTileSizeChanged category=");
            C1158080gF4 c1158080gF4 = (C1158080gF4) abstractC214838195w;
            sbLIZ3.append(c1158080gF4.LIZ);
            sbLIZ3.append(" (was=");
            sbLIZ3.append(this.LIZJ);
            sbLIZ3.append(") → re-apply cancel-pill geometry");
            C20441214yg.LJIIIZ("CancelCountdownComponent", C2188811AlT.LIZIZ(sbLIZ3));
            this.LIZJ = c1158080gF4.LIZ;
            LIZ();
            LIZIZ();
            return;
        }
        if (abstractC214838195w instanceof C1158060gF2) {
        } else {
            throw new C1954807lC();
        }
    }
}
