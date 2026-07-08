package X;

import android.app.Activity;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.0vOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740620vOe {
    public static C1740600vOc LIZ(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            String str = EnumC1741460vQ0.AUTO_JUMP.getCCode() + '.' + EnumC1741490vQ3.DEFAULT.getDCode();
            C21244318Bt c21244318Bt = new C21244318Bt();
            c21244318Bt.LIZ = str;
            c21244318Bt.LIZIZ = PageFinder.via(activity);
            return new C1740600vOc(c21244318Bt, null);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
