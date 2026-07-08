package X;

import android.view.ViewGroup;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C671620QWa extends C09AY implements Function2<Integer, C671660QWe, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C671720QWk LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0QWU LLILZ;
    public final /* synthetic */ ViewGroup LLILZIL;
    public final /* synthetic */ C670090QQd LLILZLL;
    public final /* synthetic */ TextView LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C671620QWa(int i, C671720QWk c671720QWk, int i2, C0QWU c0qwu, ViewGroup viewGroup, C670090QQd c670090QQd, TextView textView) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = c671720QWk;
        this.LLILLL = i2;
        this.LLILZ = c0qwu;
        this.LLILZIL = viewGroup;
        this.LLILZLL = c670090QQd;
        this.LLIZ = textView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, C671660QWe c671660QWe) {
        int iIntValue = ((this.LL - this.LLILLJJLI.LIZLLL) - this.LLILLL) - num.intValue();
        C0QWU c0qwu = this.LLILZ;
        c0qwu.LJI = true;
        c0qwu.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        this.LLILZ.LJIIIIZZ = iIntValue;
        this.LLILZIL.addView(c671660QWe.LIZ);
        float f = C0QWW.LIZ;
        C0QWW.LIZJ(this.LLILZIL, this.LLIZ, this.LLILZ, this.LLILZLL);
        return Unit.LIZ;
    }
}
