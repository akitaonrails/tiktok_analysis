package X;

import Y.ARunnableS93S0200000_24;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563270qmb extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563270qmb(MainPageFragment mainPageFragment) {
        super(1);
        this.LL = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        if (C297740Blk.LIZ()) {
            C1563710qnJ.LJFF("Main-Page-Fragment-Preload-Assem-V2", assembler2, this.LL);
            C1156604fk c1156604fk = MainPageFragment.LLJLLIL;
            MainPageFragment mainPageFragment = this.LL;
            c1156604fk.getClass();
            C1156604fk.LIZ(assembler2, mainPageFragment);
            C1563710qnJ.LIZLLL(assembler2, this.LL);
        } else {
            C1563200qmU c1563200qmU = C1563200qmU.LLJ;
            if (c1563200qmU == null) {
                c1563200qmU = new C1563200qmU();
            }
            C1563200qmU.LLJ = c1563200qmU;
            c1563200qmU.LIZIZ(this.LL);
        }
        MainPageFragment mainPageFragment2 = this.LL;
        mainPageFragment2.getClass();
        C723850SaN.LIZ(mainPageFragment2, false, null, new C1157304fr(mainPageFragment2), 3);
        C0S78.LJ(((Boolean) C1EKN.LJII.getValue()).booleanValue(), new C1563290qmd(assembler2, this.LL));
        if (((Boolean) C285090BFj.LJLI.getValue()).booleanValue()) {
            C0CN5.LIZJ(Long.valueOf(((Number) C285090BFj.LJL.getValue()).longValue()), new ARunnableS93S0200000_24(assembler2, this.LL, 19), false);
        } else {
            assembler2.vQ2(this.LL, new C1563280qmc());
        }
        C0S78.LJ(C281530B1r.LIZ, new C1148104eN(assembler2, this.LL));
        return Unit.LIZ;
    }
}
