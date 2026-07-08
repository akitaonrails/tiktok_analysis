package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import irm.AkS52S0200000_6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS288S0000000_5;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HTr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C441690HTr extends AbstractC1662050tLv {
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

    @Override // X.AbstractC1662050tLv
    public final void j0(String str) {
        getTvTitle().setText(str);
        C0P0T c0p0t = this.LL;
        if (c0p0t != null) {
            c0p0t.LJ();
        }
    }

    public final void setTooltip(C0P0T c0p0t) {
        this.LL = c0p0t;
    }

    @Override // X.AbstractC1662050tLv
    public final void h0(Function0 function0, boolean z) {
        if (!isShowing()) {
            ((AwS153S0400000_25) function0).invoke();
            return;
        }
        if (z) {
            C0P0T c0p0t = this.LL;
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
            ((AwS153S0400000_25) function0).invoke();
            return;
        }
        C0P0T c0p0t2 = this.LL;
        if (c0p0t2 != null) {
            c0p0t2.LJIILJJIL(AFwS289S0000000_6.get$arr$(48));
        }
        C0P0T c0p0t3 = this.LL;
        if (c0p0t3 != null) {
            c0p0t3.dismiss();
        }
        ((AwS153S0400000_25) function0).invoke();
    }

    @Override // X.AbstractC1662050tLv
    public final void i0(C1662100tM0 c1662100tM0, View view) {
        if (isShowing()) {
            return;
        }
        j0(c1662100tM0.LIZIZ);
        String str = c1662100tM0.LJIIL;
        if (str != null) {
            getButton().setText(str);
        }
        if (getParent() != null) {
            C786410Ut5.LJJJLZIJ(this, (ViewGroup) getParent());
        }
        Function0<Boolean> function0 = c1662100tM0.LJII;
        if (function0 != null && !function0.invoke().booleanValue()) {
            return;
        }
        C786410Ut5.I7(new AkS52S0200000_6(c1662100tM0, this, 12), getButton());
        C1391550mJd c1391550mJd = new C1391550mJd(getContext());
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.START;
        c1391600mJi.LJIIZILJ = this;
        c1391550mJd.LJI(C960203pA.LIZ(R.attr.zh, getContext()));
        c1391550mJd.LJIIIZ(true, null);
        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
        c1391600mJi2.LJIJJ = true;
        c1391600mJi2.LJIJJLI = false;
        c1391600mJi2.LJII = -1001L;
        c1391600mJi2.LJIIJJI = true;
        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
        this.LL = c0p0tLIZIZ;
        c0p0tLIZIZ.LJIILJJIL(AFwS288S0000000_5.get$arr$(13));
        C0P0T c0p0t = this.LL;
        if (c0p0t != null) {
            c0p0t.LJIIIZ(new InterfaceC1340660kzY() { // from class: X.0HTs
                @Override // X.InterfaceC1340660kzY
                public final void LIZ(AbstractC1391670mJp abstractC1391670mJp) {
                    this.LIZ.setTooltip(null);
                }
            });
        }
        C0P0T c0p0t2 = this.LL;
        if (c0p0t2 == null) {
            return;
        }
        c0p0t2.show();
    }

    public C441690HTr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1266));
        this.LLILLL = C452501pT.LIZIZ(new AwS407S0200000_6(this, context, 81));
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
