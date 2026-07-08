package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563230qmX extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ C1563200qmU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563230qmX(C1563200qmU c1563200qmU) {
        super(1);
        this.LL = c1563200qmU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C1156604fk c1156604fk = MainPageFragment.LLJLLIL;
        C1563200qmU c1563200qmU = this.LL;
        c1156604fk.getClass();
        C1156604fk.LIZ(assembler, c1563200qmU);
        return Unit.LIZ;
    }
}
