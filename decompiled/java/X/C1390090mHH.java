package X;

import Y.AUListenerS270S0100000_21;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.behavior.TopSheetBehavior;
import com.zhiliaoapp.musically.R;
import java.util.Collections;

/* JADX INFO: renamed from: X.0mHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1390090mHH extends AbstractC1389950mH3 {
    public final Context LLILZLL;
    public final View LLIZ;
    public final C1383230m6D LLIZLLLIL;
    public View LLJ;
    public TopSheetBehavior<C1CRB> LLJI;
    public Integer LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.AbstractC1389950mH3
    public final int LJJIJ() {
        return this.LLIZLLLIL.LIZIZ ? 48 : 80;
    }

    @Override // X.AbstractC1389950mH3
    public final View LJJIJIIJI() {
        View view = this.LLJ;
        if (view == null) {
            return null;
        }
        return view;
    }

    @Override // X.AbstractC1389950mH3
    public final void LJJIIJ(boolean z) {
        if (!z) {
            View view = this.LLJ;
            if (view == null) {
                view = null;
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.y55);
            C786410Ut5.W4(linearLayout, 1.0f);
            C786410Ut5.Rb(linearLayout, 1.0f);
            C786410Ut5.sc(linearLayout, 1.0f);
        }
    }

    @Override // X.AbstractC1389950mH3
    public final void LJJIIZ(boolean z) {
        float f;
        float f2;
        float f3;
        View view = this.LLJ;
        if (view == null) {
            view = null;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.y55);
        float f4 = 0.8f;
        if (z) {
            f3 = 1.0f;
            f2 = 0.0f;
            f = 0.8f;
            f4 = 1.0f;
        } else {
            f = 1.0f;
            f2 = 1.0f;
            f3 = 0.0f;
        }
        if (C07XO.LIZ) {
            new C21647019ng(linearLayout.getContext(), linearLayout, new C19746312Np(EnumC19746112Nn.BEZIER, new C1776900wLA(new C1342130l1v(0.0f), new C1342130l1v(0.0f), new C1342130l1v(1.0f), new C1342130l1v(1.0f), 75L), Collections.singletonList(new C19746412Nq("alpha", new C0HUY(f2, f3)))), false).LJI(true);
            return;
        }
        if (C1389890mGx.LJFF >= 4) {
            new C21647019ng(linearLayout.getContext(), linearLayout, new C19746312Np(EnumC19746112Nn.SPRING, new C0HU6(new C1342130l1v(1218.47f), new C1342130l1v(55.85f)), C1697810uHb.LJIIJJI(new C19746412Nq("alpha", new C0HUY(f2, f3)), new C19746412Nq("scaleX", new C0HIW(f, f4)), new C19746412Nq("scaleY", new C0HIX(f, f4)))), false).LJI(true);
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS270S0100000_21(linearLayout, 40));
        valueAnimatorOfFloat.start();
        C21616519il c21616519ilLJIILL = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILL, f4);
        c21616519ilLJIILL.LJI(f);
        c21616519ilLJIILL.LJIIIZ();
        C21616519il c21616519ilLJIILL2 = C1619980sG4.LJIILL(linearLayout, AbstractC21616419ik.LJIILLIIL, f4);
        c21616519ilLJIILL2.LJI(f);
        c21616519ilLJIILL2.LJIIIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1390090mHH(android.content.Context r19, android.view.View r20, X.C1383230m6D r21) {
        /*
            Method dump skipped, instruction units count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1390090mHH.<init>(android.content.Context, android.view.View, X.0m6D):void");
    }
}
