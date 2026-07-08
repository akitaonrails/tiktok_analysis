package X;

import Y.ACListenerS118S0200000_15;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aJJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C930070aJJ extends AbstractC960470b6L<C922290a6l> {
    public final Function2<String, String, Unit> LL;
    public final Function1<Integer, Unit> LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C922290a6l c922290a6l = (C922290a6l) obj;
        C500260Jjc.LJLJLJ((View) this.LLILLL.getValue(), true);
        int iLJIIZILJ = C497740JfY.LJIIZILJ() - (((int) C497740JfY.LIZIZ(16.0f)) * 2);
        int i2 = (int) ((iLJIIZILJ * 80.0f) / 343.0f);
        C500260Jjc.LJLL(iLJIIZILJ, i2, (View) this.LLILZ.getValue());
        C1324610kZf url = C1819620xS4.LIZ().setUrl(c922290a6l.LIZIZ);
        url.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        url.LJ = iLJIIZILJ;
        url.LJFF = i2;
        url.LJIIL = new C786200Usk(this, 1);
        url.LJJI((View) this.LLILZ.getValue());
        C786410Ut5.J8((C19R6) this.LLILZ.getValue(), new ACListenerS118S0200000_15(this, c922290a6l, 9));
        C786410Ut5.Q7((ImageView) this.LLILZIL.getValue(), new ACListenerS147S0100000_12(this, 43));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C930070aJJ(View view, Function2<? super String, ? super String, Unit> function2, Function1<? super Integer, Unit> function1) {
        super(view);
        this.LL = function2;
        this.LLILLJJLI = function1;
        this.LLILLL = C292401Bi.LIZ(new AwS559S0100000_15(view, 68));
        this.LLILZ = C292401Bi.LIZ(new AwS559S0100000_15(view, 69));
        this.LLILZIL = C292401Bi.LIZ(new AwS559S0100000_15(view, 67));
    }
}
