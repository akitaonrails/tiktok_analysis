package X;

import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QWY, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QWY extends C09AY implements Function2<Integer, C671660QWe, Unit> {
    public final /* synthetic */ C0QWU LL;
    public final /* synthetic */ C671720QWk LLILLJJLI;
    public final /* synthetic */ TextView LLILLL;
    public final /* synthetic */ ViewGroup LLILZ;
    public final /* synthetic */ C670090QQd LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QWY(C0QWU c0qwu, C671720QWk c671720QWk, TextView textView, ViewGroup viewGroup, C670090QQd c670090QQd) {
        super(2);
        this.LL = c0qwu;
        this.LLILLJJLI = c671720QWk;
        this.LLILLL = textView;
        this.LLILZ = viewGroup;
        this.LLILZIL = c670090QQd;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, C671660QWe c671660QWe) {
        int iIntValue = num.intValue();
        C671660QWe c671660QWe2 = c671660QWe;
        C0QWU c0qwu = this.LL;
        c0qwu.LJI = true;
        c0qwu.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        C0QWU c0qwu2 = this.LL;
        c0qwu2.LJIIIIZZ = this.LLILLJJLI.LJ;
        c0qwu2.LIZLLL = true;
        int marginEnd = 0;
        c0qwu2.LJ = 0;
        ViewGroup.LayoutParams layoutParams = this.LLILLL.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginEnd();
        }
        c0qwu2.LJFF = iIntValue - marginEnd;
        this.LLILZ.addView(c671660QWe2.LIZ);
        float f = C0QWW.LIZ;
        C0QWW.LIZJ(this.LLILZ, this.LLILLL, this.LL, this.LLILZIL);
        return Unit.LIZ;
    }
}
