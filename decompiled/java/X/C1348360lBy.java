package X;

import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0lBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348360lBy extends C09AY implements Function0<Method> {
    public C1348360lBy() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Method invoke() {
        C1348340lBw.LIZ.getClass();
        try {
            return C1961107mD.LIZIZ(Choreographer.class, "removeCallbacksInternal", Integer.TYPE, Object.class, Object.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1348340lBw.LIZJ = false;
            return null;
        }
    }
}
