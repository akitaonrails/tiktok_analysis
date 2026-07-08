package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07GV, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07GV {
    public static final void LIZ(Function0<? extends Object> function0) {
        try {
            function0.invoke();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
