package X;

import Y.ARunnableS93S0200000_24;
import android.os.Bundle;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563090qmJ extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainFragment LL;
    public final /* synthetic */ Bundle LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563090qmJ(MainFragment mainFragment, Bundle bundle) {
        super(1);
        this.LL = mainFragment;
        this.LLILLJJLI = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.DQ2(this.LL, new C647060PZo(this.LLILLJJLI));
        if (C297740Blk.LIZ()) {
            C1563710qnJ.LJFF("Main-Fragment-Preload-Assem-V2", assembler2, this.LL);
            C1558150qeL.LIZ(assembler2, this.LL);
            C1563710qnJ.LIZLLL(assembler2, this.LL);
        } else {
            C1563110qmL c1563110qmL = C1563110qmL.LLJ;
            if (c1563110qmL == null) {
                c1563110qmL = new C1563110qmL();
            }
            C1563110qmL.LLJ = c1563110qmL;
            c1563110qmL.LIZIZ(this.LL);
        }
        MainFragment mainFragment = this.LL;
        if (((Boolean) C285090BFj.LJJZZIII.getValue()).booleanValue()) {
            C0CN5.LIZJ(Long.valueOf(((Number) C285090BFj.LJJZZI.getValue()).longValue()), new ARunnableS93S0200000_24(assembler2, mainFragment, 18), false);
        }
        return Unit.LIZ;
    }
}
