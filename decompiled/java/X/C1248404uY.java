package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04uY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1248404uY extends C09AY implements Function0<Integer> {
    public C1248404uY() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer num;
        try {
            Integer numValueOf = Integer.valueOf(C0C64.LJIILLIIL().LJIIZILJ(31744, 0, 2, "start_up_window_focus_opt", true));
            C189200o6.m2constructorimpl(numValueOf);
            num = numValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            num = c098200Yq;
        }
        if (C189200o6.m5exceptionOrNullimpl(num) != null) {
            return 0;
        }
        return num;
    }
}
