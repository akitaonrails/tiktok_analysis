package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.UcpWrapContentStaggeredGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DG6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DG6 {
    public static final /* synthetic */ int LJI = 0;
    public final ViewGroup LIZ;
    public final RecyclerView LIZIZ;
    public final View LIZJ;
    public final C0DG8 LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;

    public final C1749280vcc LIZ() {
        return (C1749280vcc) this.LJ.getValue();
    }

    public final View LIZIZ() {
        return (View) this.LJFF.getValue();
    }

    public final void LIZJ() {
        C786410Ut5.LJLZ(8, this.LIZ);
        C786410Ut5.LJLLLLLL(8, LIZIZ());
        C786410Ut5.LLLZLZ(LIZ(), 8);
        LIZLLL();
    }

    public final void LIZLLL() {
        View view;
        this.LIZ.requestLayout();
        this.LIZIZ.requestLayout();
        Object parent = this.LIZ.getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void LJ() {
        C786410Ut5.LJLZ(0, this.LIZ);
        C786410Ut5.LLIZLLLIL(this.LIZIZ, 8);
        C786410Ut5.LLLZLZ(LIZ(), 0);
        C786410Ut5.LJLLLLLL(8, LIZIZ());
        Context context = this.LIZ.getContext();
        LIZ().setLayoutVariant(0);
        C1749280vcc c1749280vccLIZ = LIZ();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C844470XAv c844470XAv = C844470XAv.LIZ;
        c844470XAv.getClass();
        c1722300uv6.LJI = C844470XAv.LIZ().getString(2131857587);
        c844470XAv.getClass();
        c1722300uv6.LJIIIIZZ = C844470XAv.LIZ().getString(2131857588);
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.mw;
        Drawable drawableLIZ = c0hti.LIZ(context);
        c1722300uv6.LIZJ = 2;
        c1722300uv6.LIZ = drawableLIZ;
        c1749280vccLIZ.setStatus(c1722300uv6);
        this.LIZLLL.LLLI(false);
        this.LIZLLL.LLLII(C13BV.INSTANCE);
        LIZLLL();
    }

    public final void LJI() {
        C786410Ut5.LJLZ(0, this.LIZ);
        C786410Ut5.LLIZLLLIL(this.LIZIZ, 0);
        C786410Ut5.LLLZLZ(LIZ(), 8);
        C786410Ut5.LJLLLLLL(8, LIZIZ());
        C0DG8 c0dg8 = this.LIZLLL;
        c0dg8.getClass();
        AbstractC331870Czh.Companion.getClass();
        c0dg8.LLLFZ(C331820Czc.LIZ());
        LIZLLL();
    }

    public final void LJFF(Function0<Unit> function0) {
        C786410Ut5.LJLZ(0, this.LIZ);
        C786410Ut5.LLIZLLLIL(this.LIZIZ, 8);
        C786410Ut5.LLLZLZ(LIZ(), 8);
        C786410Ut5.LJLLLLLL(0, LIZIZ());
        TextView textView = (TextView) LIZIZ().findViewById(R.id.z3t);
        if (textView != null) {
            textView.setText(this.LIZ.getContext().getString(2131857451));
        }
        TextView textView2 = (TextView) LIZIZ().findViewById(R.id.z3r);
        if (textView2 != null) {
            textView2.setText(this.LIZ.getContext().getString(2131857450));
        }
        View viewFindViewById = LIZIZ().findViewById(R.id.cmd);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS139S0100000_4(function0, 110), viewFindViewById);
        }
        this.LIZLLL.LLLI(false);
        this.LIZLLL.LLLII(C13BV.INSTANCE);
        LIZLLL();
    }

    public final void LJII(List<? extends AbstractC331870Czh> list, Function0<Unit> function0) {
        C786410Ut5.LJLZ(0, this.LIZ);
        C786410Ut5.LLIZLLLIL(this.LIZIZ, 0);
        C786410Ut5.LLLZLZ(LIZ(), 8);
        C786410Ut5.LJLLLLLL(8, LIZIZ());
        this.LIZLLL.LLLIIIIL(list);
        LIZLLL();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C0DG6(ViewGroup viewGroup, C20512315Of c20512315Of, TuxTextView tuxTextView, View view, Function1 function1) {
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        this.LIZ = viewGroup;
        this.LIZIZ = c20512315Of;
        this.LIZJ = view;
        C0DG8 c0dg8 = new C0DG8(new ArrayList(), function1);
        this.LIZLLL = c0dg8;
        this.LJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 555));
        this.LJFF = C452501pT.LIZIZ(new AwS548S0100000_4(this, 556));
        ViewGroup.LayoutParams layoutParams = c20512315Of.getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            staggeredGridLayoutManager = new UcpWrapContentStaggeredGridLayoutManager();
        } else {
            staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 1);
        }
        staggeredGridLayoutManager.LJJIL(0);
        c20512315Of.setLayoutManager(staggeredGridLayoutManager);
        c20512315Of.setHasFixedSize(false);
        c20512315Of.setItemViewCacheSize(20);
        c20512315Of.setItemAnimator(null);
        c20512315Of.setNestedScrollingEnabled(false);
        c20512315Of.setOverScrollMode(2);
        c0dg8.LLLI(true);
        c20512315Of.setAdapter(c0dg8);
    }
}
