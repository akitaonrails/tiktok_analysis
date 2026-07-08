package X;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import com.bytedance.ies.ugc.appcontext.IAppContextService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0mGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1389600mGU {
    public static final boolean LIZ() {
        Context applicationContext;
        try {
            IAppContextService iAppContextService = (IAppContextService) PluggableExtentionKt.pluggableSpi$default(IAppContextService.class, false, false, false, 14, null);
            if (iAppContextService == null || (applicationContext = iAppContextService.getApplicationContext()) == null) {
                return false;
            }
            return C1088190eQL.LIZ(applicationContext);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final boolean LIZIZ(Context context) {
        try {
            return C1088190eQL.LIZ(context);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static final void LIZJ(Dialog dialog) {
        Object c098200Yq;
        Window window;
        if (dialog != null) {
            C1389580mGS.LIZ.getClass();
            try {
                if (LIZ() && (window = dialog.getWindow()) != null) {
                    window.setWindowAnimations(R.style.yj);
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }
}
