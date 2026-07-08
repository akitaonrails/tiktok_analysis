package X;

import android.R;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Qkq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679380Qkq {
    public static int LIZIZ() {
        try {
            C844470XAv.LIZ.getClass();
            int iN3 = C786410Ut5.n3(C844470XAv.LIZ().getResources(), "status_bar_height", "dimen", "android");
            dimensionPixelSize = iN3 > 0 ? C844470XAv.LIZ().getResources().getDimensionPixelSize(iN3) : 0;
            C189200o6.m2constructorimpl(Unit.LIZ);
            return dimensionPixelSize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return dimensionPixelSize;
        }
    }

    public static int LIZ(C19EG c19eg) {
        Object c098200Yq;
        int iLJII;
        Integer numValueOf;
        if (c19eg != null) {
            View viewFindViewById = c19eg.findViewById(R.id.content);
            if (viewFindViewById != null && (numValueOf = Integer.valueOf(viewFindViewById.getHeight())) != null && numValueOf.intValue() > 0) {
                return numValueOf.intValue();
            }
            if (c19eg != null) {
                Rect rect = new Rect();
                c19eg.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                int iHeight = rect.height();
                if (iHeight > 0) {
                    C679390Qkr.LIZ.getClass();
                    return iHeight + LIZIZ();
                }
            }
        }
        try {
            C844470XAv.LIZ.getClass();
            c098200Yq = Integer.valueOf(C418440Gaw.LIZJ(C844470XAv.LIZ()) + LIZIZ());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            int iLJ = C14KQ.LJ(c19eg);
            if (c19eg != null) {
                C1546210qL5.LIZ.getClass();
                iLJII = C1546210qL5.LJII(c19eg);
            } else {
                iLJII = 0;
            }
            c098200Yq = Integer.valueOf(iLJ - iLJII);
        }
        return ((Number) c098200Yq).intValue();
    }
}
