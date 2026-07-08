package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS37S0101000_26;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765540w2q extends C1765530w2p {
    public final View LLJILJILJ;
    public final List<AbstractC1763110vyv> LLJILLL;
    public final InterfaceC1765560w2s LLJJ;
    public final Boolean LLJJI;
    public final Boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    @Override // X.C1765530w2p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ() {
        /*
            r3 = this;
            int r0 = r3.LLIZLLLIL
            boolean r0 = r3.LJJIZ(r0)
            if (r0 == 0) goto L29
            X.0w2r[] r0 = r3.LLJI
            int r2 = r3.LLIZLLLIL
            r1 = r0[r2]
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L29
            boolean r0 = r1.LIZIZ
            if (r0 != 0) goto L20
            r0 = 1
            r1.LIZIZ = r0
            X.0w2s r0 = r3.LLJJ
            if (r0 == 0) goto L20
            r0.onShow(r2)
        L20:
            r3.show()
        L23:
            int r0 = r3.LLIZLLLIL
            r3.LJJIL(r0)
            return
        L29:
            java.lang.Boolean r1 = r3.LLJJIII
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L23
            int r0 = r3.LLIZLLLIL
            boolean r0 = r3.LJJIZ(r0)
            if (r0 != 0) goto L23
            r3.hide()
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1765540w2q.LJJJ():void");
    }

    @Override // X.C1765530w2p
    public final void hide() {
        if (Intrinsics.LJFF(this.LLJJIII, Boolean.TRUE)) {
            if (this.LLJJIJIIJIL) {
                return;
            }
            this.LLJJIJIIJIL = true;
            this.LLJJIJIL = false;
            C786410Ut5.LJLLLLLL(8, this.LLJILJILJ);
            return;
        }
        if (this.LLJJIJIIJIL) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.LLJILJILJ.animate().alpha(0.0f);
        viewPropertyAnimatorAlpha.setDuration(300L);
        viewPropertyAnimatorAlpha.withStartAction(new ARunnableS126S0100000_26(this, 115)).withEndAction(new ARunnableS126S0100000_26(this, 116));
    }

    @Override // X.C1765530w2p
    public final void show() {
        Boolean bool = this.LLJJIII;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            if (this.LLJJIJIL) {
                return;
            }
            HandlerHook.viewPost(this.LLJILJILJ, new ARunnableS37S0101000_26(this, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(Intrinsics.LJFF(this.LLJJI, bool2) ? 28 : 21))), 10));
        } else {
            if (this.LLJJIJI || this.LLJJIJIL) {
                return;
            }
            HandlerHook.viewPost(this.LLJILJILJ, new ARunnableS37S0101000_26(this, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Intrinsics.LJFF(this.LLJJI, bool2) ? 28 : 21)), 9));
        }
    }

    @Override // X.C1765530w2p, X.InterfaceC1761370vw7
    public final void LJFF() {
        super.LJFF();
        this.LLJILJILJ.animate().cancel();
    }

    @Override // X.C1765530w2p
    public final void LJJIJIIJIL(FrameLayout frameLayout) {
        int iLIZIZ;
        if (Intrinsics.LJFF(this.LLJJI, Boolean.TRUE)) {
            iLIZIZ = -2;
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(21));
        }
        View view = this.LLJILJILJ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, iLIZIZ);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(563));
        C786410Ut5.W5(view, layoutParams);
        frameLayout.setClipToOutline(false);
        frameLayout.setClipChildren(false);
        frameLayout.addView(this.LLJILJILJ);
    }

    @Override // X.C1765530w2p, X.InterfaceC21650419oE
    public final void gA(int i) {
        if (Intrinsics.LJFF(this.LLJJIII, Boolean.TRUE)) {
            return;
        }
        this.LLJJIJI = false;
        if (i == 1) {
            LJJJ();
        }
    }

    @Override // X.C1765530w2p, X.InterfaceC1761370vw7
    public final void onPageSelected(int i) {
        this.LLIZLLLIL = i;
        LJJIL(i);
        if (Intrinsics.LJFF(this.LLJJIII, Boolean.TRUE)) {
            LJJJ();
        }
    }

    @Override // X.C1765530w2p, X.InterfaceC21650419oE
    public final void xP(int i) {
        if (Intrinsics.LJFF(this.LLJJIII, Boolean.TRUE)) {
            return;
        }
        this.LLJJIJI = true;
        hide();
    }

    @Override // X.C1765530w2p, X.InterfaceC1763180vz2
    public final void LJIIJJI(RectF rectF, int i) {
        super.LJIIJJI(rectF, i);
        if (!this.LLJJIJI) {
            LJJJ();
        }
    }

    @Override // X.C1765530w2p, X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.LLJJIJI = false;
            LJJJ();
        } else {
            if (i != 1 || Intrinsics.LJFF(this.LLJJIII, Boolean.TRUE)) {
                return;
            }
            this.LLJJIJI = true;
            hide();
        }
    }

    @Override // X.C1765530w2p, X.InterfaceC21650419oE
    public final void kG(float f, int i) {
        Intrinsics.LJFF(this.LLJJIII, Boolean.TRUE);
    }

    public /* synthetic */ C1765540w2q(View view, List list, InterfaceC1765560w2s interfaceC1765560w2s, boolean z, int i, Boolean bool, int i2) {
        this(view, (List<? extends AbstractC1763110vyv>) list, (i2 & 4) != 0 ? null : interfaceC1765560w2s, z, i, (Boolean) null, (i2 & 64) != 0 ? null : bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1765540w2q(View view, List<? extends AbstractC1763110vyv> list, InterfaceC1765560w2s interfaceC1765560w2s, boolean z, int i, Boolean bool, Boolean bool2) {
        super(view, list, interfaceC1765560w2s, z, i);
        this.LLJILJILJ = view;
        this.LLJILLL = list;
        this.LLJJ = interfaceC1765560w2s;
        this.LLJJI = bool;
        this.LLJJIII = bool2;
    }
}
