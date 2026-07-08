package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.main.MainPageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563290qmd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ MainPageFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1563290qmd(Assembler assembler, MainPageFragment mainPageFragment) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = mainPageFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.vQ2(this.LLILLJJLI, new C1257050ioh());
        return Unit.LIZ;
    }
}
