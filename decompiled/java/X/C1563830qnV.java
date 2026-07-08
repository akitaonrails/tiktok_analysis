package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563830qnV extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainRootFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563830qnV(MainRootFragment mainRootFragment) {
        super(1);
        this.LL = mainRootFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.vQ2(this.LL, new C1563820qnU());
        return Unit.LIZ;
    }
}
