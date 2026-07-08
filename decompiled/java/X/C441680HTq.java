package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0HTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441680HTq extends AbstractC1662050tLv {
    public C0P0T LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    private final TuxTextView getButton() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final TuxTextView getTvTitle() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    @Override // X.AbstractC1662050tLv
    public final boolean isShowing() {
        C0P0T c0p0t = this.LL;
        return c0p0t != null && c0p0t.isShowing();
    }

    public final C0P0T getTooltip() {
        return this.LL;
    }

    public final void setTooltip(C0P0T c0p0t) {
        this.LL = c0p0t;
    }

    @Override // X.AbstractC1662050tLv
    public final void h0(Function0 function0, boolean z) {
        C0P0T c0p0t = this.LL;
        if (c0p0t != null) {
            c0p0t.LJIILJJIL(AFwS289S0000000_6.get$arr$(30));
        }
        C0P0T c0p0t2 = this.LL;
        if (c0p0t2 != null) {
            c0p0t2.dismiss();
        }
        ((AwS153S0400000_25) function0).invoke();
    }

    @Override // X.AbstractC1662050tLv
    public final void i0(C1662100tM0 c1662100tM0, View view) {
        if (getParent() != null) {
            C786410Ut5.LJJJLZIJ(this, (ViewGroup) getParent());
        }
        C786410Ut5.LLLLZLL(getButton(), 8);
        getTvTitle().setText(c1662100tM0.LIZJ);
        C1391550mJd c1391550mJd = new C1391550mJd(getContext());
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c1391600mJi.LJIIZILJ = this;
        c1391550mJd.LJI(C960203pA.LIZ(R.attr.a1d, getContext()));
        c1391550mJd.LJIIIZ(true, null);
        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
        c1391600mJi2.LJIJJ = true;
        c1391600mJi2.LJIJJLI = false;
        c1391600mJi2.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        c1391600mJi2.LJIIJJI = true;
        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
        this.LL = c0p0tLIZIZ;
        c0p0tLIZIZ.LJIILJJIL(new AwS619S0100000_5(c1662100tM0, 7));
        C0P0T c0p0t = this.LL;
        if (c0p0t != null) {
            c0p0t.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0HTt
                @Override // X.InterfaceC1340660kzY
                public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                    this.LIZ.setTooltip(null);
                }
            });
        }
        C0P0T c0p0t2 = this.LL;
        if (c0p0t2 != null) {
            c0p0t2.show();
        }
    }

    public C441680HTq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS407S0200000_6(this, context, 46));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 876));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.wz, this, true);
    }

    @Override // X.AbstractC1662050tLv
    public final void e0(ViewGroup viewGroup, C1662100tM0 c1662100tM0, View view) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
    }
}
