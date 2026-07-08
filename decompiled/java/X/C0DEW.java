package X;

import Y.ACListenerS71S0300000_4;
import Y.ALAdapterS1S0200000_4;
import Y.ARunnableS37S0300000_4;
import Y.AUListenerS254S0100000_4;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.pdp.PdpViewModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0DEW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DEW {
    public final Fragment LIZ;
    public final C0DD8 LIZIZ;
    public final PdpViewModel LIZJ;

    public final CommonAdData LIZJ() {
        CommonAdData commonAdData;
        InterfaceC333090D3z interfaceC333090D3z;
        CommonAdData commonAdDataEe;
        InterfaceC1670800ta2 activity = this.LIZ.getActivity();
        if ((activity instanceof InterfaceC333090D3z) && (interfaceC333090D3z = (InterfaceC333090D3z) activity) != null && (commonAdDataEe = interfaceC333090D3z.ee()) != null) {
            return commonAdDataEe;
        }
        PdpViewModel pdpViewModel = this.LIZJ;
        C332690D2l c332690D2l = pdpViewModel.LLILZLL;
        if (c332690D2l != null && (commonAdData = c332690D2l.rawAdData) != null) {
            return commonAdData;
        }
        C0DBY c0dby = C335000DBi.LIZJ;
        Map<String, String> map = pdpViewModel.LLJ;
        c0dby.getClass();
        return C0DBY.LIZLLL(map);
    }

    public final InterfaceC1023590ck9 LIZLLL() {
        InterfaceC333090D3z interfaceC333090D3z;
        C335000DBi c335000DBiG4;
        InterfaceC1670800ta2 activity = this.LIZ.getActivity();
        return (!(activity instanceof InterfaceC333090D3z) || (interfaceC333090D3z = (InterfaceC333090D3z) activity) == null || (c335000DBiG4 = interfaceC333090D3z.g4()) == null) ? new C335000DBi(this.LIZJ.LLJ, new Object[0]) : c335000DBiG4;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014f A[LOOP:2: B:62:0x0149->B:64:0x014f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C0D3N r19) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0DEW.LJ(X.0D3N):void");
    }

    public final void LIZIZ(C0DEX c0dex, C332860D3c c332860D3c) {
        C786410Ut5.T7(c0dex.LIZJ, null);
        C786410Ut5.R7(c0dex.LIZLLL, null);
        if (c332860D3c.isExpanded()) {
            C786410Ut5.LJZL(0, c0dex.LIZLLL);
            C786410Ut5.LLIL(c0dex.LIZJ, 8);
            c0dex.LJ.setText(c332860D3c.description);
            C786410Ut5.R7(c0dex.LIZLLL, new ACListenerS71S0300000_4(c0dex, c332860D3c, this, 5));
            return;
        }
        C786410Ut5.LJZL(8, c0dex.LIZLLL);
        C786410Ut5.LLIL(c0dex.LIZJ, 0);
        c0dex.LIZJ.setText(c332860D3c.description);
        HandlerHook.viewPost(c0dex.LIZJ, new ARunnableS37S0300000_4(c0dex, c332860D3c, this, 17));
    }

    public C0DEW(Fragment fragment, C0DD8 c0dd8, PdpViewModel pdpViewModel) {
        this.LIZ = fragment;
        this.LIZIZ = c0dd8;
        this.LIZJ = pdpViewModel;
    }

    public final void LIZ(C0DEX c0dex, C332860D3c c332860D3c, boolean z) {
        ValueAnimator valueAnimator = c0dex.LJIIIIZZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z && c0dex.LIZ.getWidth() > 0 && c0dex.LIZ.getHeight() > 0) {
            int height = c0dex.LIZ.getHeight();
            View view = c0dex.LIZ;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams.height != height) {
                layoutParams.height = height;
                C786410Ut5.W5(view, layoutParams);
            }
            LIZIZ(c0dex, c332860D3c);
            View view2 = c0dex.LIZ;
            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = c0dex.LIZ.getMeasuredHeight();
            if (height == measuredHeight) {
                View view3 = c0dex.LIZ;
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2.height != -2) {
                    layoutParams2.height = -2;
                    C786410Ut5.W5(view3, layoutParams2);
                    return;
                }
                return;
            }
            long jAbs = ((long) Math.abs(measuredHeight - height)) * 2;
            if (jAbs > 300) {
                jAbs = 300;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, measuredHeight);
            valueAnimatorOfInt.setInterpolator(new C12DM());
            valueAnimatorOfInt.setDuration(jAbs);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(c0dex, 15));
            valueAnimatorOfInt.addListener(new ALAdapterS1S0200000_4(this, c0dex, 1));
            valueAnimatorOfInt.start();
            c0dex.LJIIIIZZ = valueAnimatorOfInt;
            return;
        }
        LIZIZ(c0dex, c332860D3c);
    }
}
