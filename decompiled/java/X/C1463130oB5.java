package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463130oB5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C557050Lt1 LL;
    public final /* synthetic */ C1463050oAx LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;
    public final /* synthetic */ AVMusic LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ long LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1463130oB5(C557050Lt1 c557050Lt1, C1463050oAx c1463050oAx, boolean z, Function1<? super Boolean, Unit> function1, AVMusic aVMusic, boolean z2, int i, boolean z3, boolean z4, long j) {
        super(0);
        this.LL = c557050Lt1;
        this.LLILLJJLI = c1463050oAx;
        this.LLILLL = z;
        this.LLILZ = function1;
        this.LLILZIL = aVMusic;
        this.LLILZLL = z2;
        this.LLIZ = i;
        this.LLIZLLLIL = z3;
        this.LLJ = z4;
        this.LLJI = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C557050Lt1 c557050Lt1 = this.LL;
        if (c557050Lt1 == null || !c557050Lt1.LIZIZ()) {
            C1463050oAx c1463050oAx = this.LLILLJJLI;
            if (!c1463050oAx.LJI) {
                AbstractC1463010oAt.LLLII.getClass();
                C1463170oB9.LIZ("initBingoAlgorithm when force apply music sync");
                c1463050oAx.LJI = true;
                InterfaceC1452170ntP interfaceC1452170ntP = c1463050oAx.LJII().LIZ;
                if (interfaceC1452170ntP != null) {
                    interfaceC1452170ntP.initBingoAlgorithm();
                }
            }
            boolean z = C1444820nhY.LIZ;
            C1444820nhY.LJII(this.LLILZIL);
            if (this.LLILZLL) {
                AbstractC1463010oAt.LLLII.getClass();
                C1463170oB9.LIZ("updateAlgorithmFromNormal");
                C1463030oAv c1463030oAvLJII = this.LLILLJJLI.LJII();
                final C1463050oAx c1463050oAx2 = this.LLILLJJLI;
                final boolean z2 = this.LLILLL;
                final Function1<Boolean, Unit> function1 = this.LLILZ;
                final C557050Lt1 c557050Lt12 = this.LL;
                final AVMusic aVMusic = this.LLILZIL;
                final int i = this.LLIZ;
                final boolean z3 = this.LLIZLLLIL;
                final boolean z4 = this.LLJ;
                final long j = this.LLJI;
                c1463030oAvLJII.LJ(new InterfaceC358010E1v() { // from class: X.0oBB
                    @Override // X.InterfaceC358010E1v
                    public final void onFailed() {
                        c1463050oAx2.LIZIZ.LLILLL(false, true, true, z2);
                        Function1<Boolean, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Boolean.FALSE);
                        }
                    }

                    @Override // X.InterfaceC358010E1v
                    public final void LIZ(int i2) {
                        C557050Lt1 c557050Lt13 = c557050Lt12;
                        if (c557050Lt13 != null && c557050Lt13.LIZIZ()) {
                            c1463050oAx2.LIZIZ.LLILLL(false, true, true, z2);
                            Function1<Boolean, Unit> function12 = function1;
                            if (function12 != null) {
                                function12.invoke(Boolean.FALSE);
                                return;
                            }
                            return;
                        }
                        if (i2 < 0) {
                            c1463050oAx2.LIZIZ.LLILLL(false, true, true, z2);
                            Function1<Boolean, Unit> function13 = function1;
                            if (function13 == null) {
                                return;
                            }
                            function13.invoke(Boolean.FALSE);
                            return;
                        }
                        c1463050oAx2.getClass();
                        c1463050oAx2.LJI(aVMusic, i, z3, z4, z2, j, c557050Lt12, function1);
                    }
                }, false);
            } else {
                this.LLILLJJLI.getClass();
                this.LLILLJJLI.LJI(this.LLILZIL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLILLL, this.LLJI, this.LL, this.LLILZ);
            }
        } else {
            this.LLILLJJLI.LIZIZ.LLILLL(false, true, true, this.LLILLL);
            Function1<Boolean, Unit> function12 = this.LLILZ;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }
}
