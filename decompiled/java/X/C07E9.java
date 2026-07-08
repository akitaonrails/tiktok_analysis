package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07E9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07E9 extends C09AY implements Function0<Integer> {
    public C07E9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIIZILJ;
        try {
            iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "search_root_page_stack_opt", true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iLJIIZILJ = 0;
        }
        return Integer.valueOf(iLJIIZILJ);
    }
}
