package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qmW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563220qmW extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MainPageFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563220qmW(MainPageFragment mainPageFragment) {
        super(1);
        this.LL = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        C1563210qmV c1563210qmV = C1563210qmV.LLJ;
        if (c1563210qmV == null) {
            c1563210qmV = new C1563210qmV();
        }
        C1563210qmV.LLJ = c1563210qmV;
        c1563210qmV.LIZIZ(this.LL);
        return Unit.LIZ;
    }
}
