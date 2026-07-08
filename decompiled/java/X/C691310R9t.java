package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691310R9t extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BaseCellContentComponent<? extends C03H5> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C691310R9t(BaseCellContentComponent<? extends C03H5> baseCellContentComponent) {
        super(1);
        this.LL = baseCellContentComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Assembler assembler) {
        assembler.LQ2(this.LL, new C691610RAx());
        return Unit.LIZ;
    }
}
