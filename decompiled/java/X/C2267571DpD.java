package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267571DpD extends C09AY implements Function1<C2267501Dp6, Unit> {
    public final /* synthetic */ C1672180tcG LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C2267581DpE LLILLL;
    public final /* synthetic */ C2267581DpE LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2267571DpD(C1672180tcG c1672180tcG, boolean z, C2267581DpE c2267581DpE, C2267581DpE c2267581DpE2) {
        super(1);
        this.LL = c1672180tcG;
        this.LLILLJJLI = z;
        this.LLILLL = c2267581DpE;
        this.LLILZ = c2267581DpE2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2267501Dp6 c2267501Dp6) {
        C1557270qcv c1557270qcv;
        C2267501Dp6 c2267501Dp62 = c2267501Dp6;
        C2267491Dp5.LIZ(c2267501Dp62.LIZLLL, c2267501Dp62.LIZJ.LIZIZ, this.LL.LJIIJ, 4);
        C2267481Dp4 c2267481Dp4 = c2267501Dp62.LJFF;
        if (this.LLILLJJLI) {
            c1557270qcv = this.LLILLL.LIZIZ;
        } else {
            c1557270qcv = c2267501Dp62.LIZJ.LIZLLL;
        }
        C2267491Dp5.LIZ(c2267481Dp4, c1557270qcv, this.LL.LJIIIZ, 4);
        C2267471Dp3.LIZ(c2267501Dp62.LJ, this.LLILZ.LIZJ, 0.0f, 6);
        C2267471Dp3.LIZ(c2267501Dp62.LJI, this.LLILZ.LJ, 0.0f, 6);
        return Unit.LIZ;
    }
}
