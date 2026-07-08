package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563240qmY extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ C1563210qmV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563240qmY(C1563210qmV c1563210qmV) {
        super(1);
        this.LL = c1563210qmV;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C1156604fk c1156604fk = MainPageFragment.LLJLLIL;
        C1563210qmV c1563210qmV = this.LL;
        c1156604fk.getClass();
        C1156604fk.LIZIZ(assembler, c1563210qmV);
        return Unit.LIZ;
    }
}
