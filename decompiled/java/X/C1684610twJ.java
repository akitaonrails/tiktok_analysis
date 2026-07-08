package X;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0twJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684610twJ extends C09AY implements Function1<C1684540twC, Unit> {
    public final /* synthetic */ C1684860twi LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C1684590twH LLIZLLLIL;
    public final /* synthetic */ Rect LLJ;
    public final /* synthetic */ C1684800twc LLJI;
    public final /* synthetic */ C1684910twn LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1684610twJ(C1684860twi c1684860twi, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, C1684590twH c1684590twH, Rect rect, C1684800twc c1684800twc, C1684910twn c1684910twn) {
        super(1);
        this.LL = c1684860twi;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = i;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = z5;
        this.LLIZLLLIL = c1684590twH;
        this.LLJ = rect;
        this.LLJI = c1684800twc;
        this.LLJIJIL = c1684910twn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1684540twC c1684540twC) {
        C1684540twC c1684540twC2 = c1684540twC;
        c1684540twC2.LIZ = this.LL.LIZ;
        c1684540twC2.LIZIZ = this.LLILLJJLI;
        C1684440tw2 c1684440tw2 = c1684540twC2.LIZJ;
        C1684800twc c1684800twc = this.LLJI;
        C1684440tw2 c1684440tw22 = c1684800twc.LIZJ;
        c1684440tw2.LIZ = c1684440tw22.LIZ;
        c1684440tw2.LIZIZ = c1684440tw22.LIZIZ;
        c1684440tw2.LIZJ = c1684440tw22.LIZJ;
        c1684440tw2.LIZLLL = c1684440tw22.LIZLLL;
        c1684440tw2.LJ = c1684440tw22.LJ;
        c1684440tw2.LJFF = c1684440tw22.LJFF;
        c1684540twC2.LIZLLL = this.LLILLL;
        c1684540twC2.LJFF = this.LLILZ;
        c1684540twC2.LJI = this.LLILZIL;
        c1684540twC2.LJ = this.LLILZLL;
        c1684540twC2.LJII = this.LLIZ;
        c1684540twC2.LJIIIIZZ = this.LLIZLLLIL;
        c1684540twC2.LJIIIZ = this.LLJ;
        c1684540twC2.LJIIJ.set(c1684800twc.LIZIZ);
        C1684910twn c1684910twn = this.LLJIJIL;
        c1684540twC2.LJIIJJI = c1684910twn.LIZJ;
        c1684540twC2.LJIIL = c1684910twn.LIZIZ;
        c1684540twC2.LJIILIIL = c1684910twn.LIZLLL;
        return Unit.LIZ;
    }
}
