package X;

import android.content.Context;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.ExpandRegionBean;

/* JADX INFO: renamed from: X.0o9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462420o9w {
    public static final Rect LIZ(Context context, ExpandRegionBean expandRegionBean) {
        return new Rect(LIZIZ(expandRegionBean.leftExpand, context), LIZIZ(expandRegionBean.topExpand, context), LIZIZ(expandRegionBean.rightExpand, context), LIZIZ(expandRegionBean.bottomExpand, context));
    }

    public static final int LIZIZ(int i, Context context) {
        Object c098200Yq;
        if (context == null) {
            C201955140j.LJFF("ExpandPublishButtonRegion", "context == null! don't expand region");
            return 0;
        }
        try {
            c098200Yq = Integer.valueOf((int) C11VU.LIZIZ(i, context));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getPxFromDp exception + ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C201955140j.LJFF("ExpandPublishButtonRegion", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
