package X;

import android.content.res.AssetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05ZB {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(AssetManager assetManager, RunnableC2110508Op runnableC2110508Op) {
        Object c098200Yq;
        C013C c013c = new C013C();
        if (((Boolean) C0C3N.LIZLLL.getValue()).booleanValue()) {
            try {
                C23250099c.LJ(C23271099x.INSTANCE, new C05Z9(c013c, assetManager, runnableC2110508Op, null));
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        } else {
            c013c.element = LIZIZ(assetManager, runnableC2110508Op);
        }
        return c013c.element;
    }

    public static boolean LIZIZ(AssetManager assetManager, Runnable runnable) {
        boolean zLJFF = Intrinsics.LJFF(C1BWL.LIZ().getAssets(), assetManager);
        if (zLJFF) {
            zLJFF = false;
            try {
                runnable.run();
                zLJFF = true;
                C189200o6.m2constructorimpl(Unit.LIZ);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return zLJFF;
    }
}
