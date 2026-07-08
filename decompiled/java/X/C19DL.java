package X;

import Y.ARunnableS101S0200000_32;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.IWindowFocusUtil;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import com.ss.android.ugc.aweme.utils.WindowFocusUtilImpl;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19DL, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19DL {
    public final Function0<Boolean> LIZ;
    public C1AMU LIZIZ;

    public C19DL(Function0<Boolean> function0) {
        this.LIZ = function0;
    }

    public final C1AMU LIZ(Context context) {
        if (this.LIZIZ == null) {
            this.LIZIZ = new C1AMU(context);
        }
        return this.LIZIZ;
    }

    public final void LIZIZ(Context context) {
        if (!this.LIZ.invoke().booleanValue() && !C2073608Ak.LIZ) {
            if (C2073608Ak.LIZIZ) {
                IDowngradeApi iDowngradeApi = (IDowngradeApi) ServiceManager.get().getService(IDowngradeApi.class);
                if (iDowngradeApi != null) {
                    iDowngradeApi.LJI(new C19DM(this, context));
                    return;
                }
                return;
            }
            if (C2073708Al.LIZ) {
                C823050WQl.LIZLLL().execute(new ARunnableS101S0200000_32(this, context, 13));
                return;
            }
            C1AMU c1amuLIZ = LIZ(context);
            if (c1amuLIZ == null) {
                return;
            }
            c1amuLIZ.LIZIZ(context);
        }
    }

    public final void LIZJ(Context context) {
        if (!this.LIZ.invoke().booleanValue() && !C2073608Ak.LIZ) {
            if (C2073708Al.LIZ) {
                C823050WQl.LIZLLL().execute(new ARunnableS101S0200000_32(this, context, 14));
                return;
            }
            C1AMU c1amuLIZ = LIZ(context);
            if (c1amuLIZ == null) {
                return;
            }
            c1amuLIZ.LIZ(context);
        }
    }

    public static void LIZLLL(Activity activity, boolean z) {
        IWindowFocusUtil iWindowFocusUtil;
        Iterator it2 = ((List) C117G.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((C117F) it2.next()).LIZ(activity, z);
        }
        Object objLIZ = C04TD.LIZ(IWindowFocusUtil.class, false);
        if (objLIZ != null) {
            iWindowFocusUtil = (IWindowFocusUtil) objLIZ;
        } else {
            if (C04TD.Y5 == null) {
                synchronized (IWindowFocusUtil.class) {
                    if (C04TD.Y5 == null) {
                        C04TD.Y5 = new WindowFocusUtilImpl();
                    }
                }
            }
            iWindowFocusUtil = C04TD.Y5;
        }
        iWindowFocusUtil.LIZ(z);
    }
}
