package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellLogicComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RDA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RDA extends C09AY implements Function0<C690870R8b> {
    public final /* synthetic */ BaseCellLogicComponent<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RDA(BaseCellLogicComponent<RECEIVER> baseCellLogicComponent) {
        super(0);
        this.LL = baseCellLogicComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C690870R8b invoke() {
        C690870R8b c690870R8b;
        ReusedAssem reusedAssem = this.LL;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(reusedAssem, C690430R6j.class, null), reusedAssem.checkSupervisorPrepared()).getValue();
        if (c690430R6j == null || (c690870R8b = c690430R6j.LL) == null) {
            c690870R8b = new C690870R8b();
            if (C299590Boj.LIZ()) {
                C1AF0.LIZJ("can not find hierarchyData: cellContext");
                c690870R8b.LIZIZ = "cell_unknown";
            }
        }
        return c690870R8b;
    }
}
