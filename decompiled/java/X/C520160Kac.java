package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Kac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520160Kac {
    public static final PageFinder LIZ(Context context) {
        Unit unit;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (!C07MW.LIZ()) {
            return PageFinder.via(context);
        }
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C520150Kab.LIZJ(context);
        if (abstractC1387200mCcLIZJ != null) {
            if (abstractC1387200mCcLIZJ instanceof C1397950mTx) {
                return PageFinder.via(((C1397950mTx) abstractC1387200mCcLIZJ).LIZLLL);
            }
            if (abstractC1387200mCcLIZJ instanceof C1844400y62) {
                return PageFinder.via((Fragment) ((C1844400y62) abstractC1387200mCcLIZJ).LIZLLL);
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C189200o6.m2constructorimpl(unit);
        return PageFinder.via(context);
    }
}
