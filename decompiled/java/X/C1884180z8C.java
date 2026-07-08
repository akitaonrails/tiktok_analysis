package X;

import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1884180z8C extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SmartRoute LL;
    public final /* synthetic */ C259800zU<Integer> LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1884180z8C(SmartRoute smartRoute, C259800zU<Integer> c259800zU, C259800zU<String> c259800zU2) {
        super(0);
        this.LL = smartRoute;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c259800zU2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Integer] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        try {
            this.LL.open();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLJJLI.element = 0;
            this.LLILLL.element = "Failed to open by router.";
            C1885840zAs.LIZ(EnumC1884170z8B.FAILED_TO_OPEN_DETAIL, "Failed to open by router.", e.getStackTrace().toString());
        }
        return Unit.LIZ;
    }
}
