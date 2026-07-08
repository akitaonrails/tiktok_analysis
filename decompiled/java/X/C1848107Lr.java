package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1848107Lr extends C09AY implements Function0<Object> {
    public final /* synthetic */ Function0<Object> LL;
    public final /* synthetic */ Object LLILLJJLI = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1848107Lr(C1848307Lt c1848307Lt) {
        super(0);
        this.LL = c1848307Lt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        try {
            return this.LL.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return this.LLILLJJLI;
        }
    }
}
