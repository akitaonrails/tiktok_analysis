package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0REb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C692430REb extends C09AY implements Function0<Integer> {
    public final /* synthetic */ C0SZR<R, ITEM> LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C692430REb(C0SZR<R, ITEM> c0szr, C259800zU<String> c259800zU, int i) {
        super(0);
        this.LL = c0szr;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIILJJIL;
        try {
            iLJIILJJIL = this.LL.LIZ.LJIILJJIL(this.LLILLJJLI.element);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            iLJIILJJIL = this.LLILLL;
        }
        return Integer.valueOf(iLJIILJJIL);
    }
}
