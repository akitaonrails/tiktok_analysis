package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13Y8, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class C13Y8 implements C13Y9 {
    public final /* synthetic */ Function2 LIZ;

    public /* synthetic */ C13Y8(Function2 function2) {
        this.LIZ = function2;
    }

    @Override // X.C13Y9
    public final void dispose() {
        Function2 function2 = this.LIZ;
        synchronized (C13YE.LIZJ) {
            try {
                C13YE.LJII = C13LP.LJLIIIL(function2, C13YE.LJII);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
