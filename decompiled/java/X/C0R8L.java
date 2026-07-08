package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0R8L, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R8L extends C09AY implements Function0<C690870R8b> {
    public final /* synthetic */ BaseCellContentComponent<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R8L(BaseCellContentComponent<RECEIVER> baseCellContentComponent) {
        super(0);
        this.LL = baseCellContentComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C690870R8b invoke() {
        C690870R8b c690870R8b;
        ReusedUIContentAssem reusedUIContentAssem = this.LL;
        C690430R6j c690430R6j = (C690430R6j) new C1559260qg8(new C723580SZw(reusedUIContentAssem, C690430R6j.class, null), reusedUIContentAssem.checkSupervisorPrepared()).getValue();
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
