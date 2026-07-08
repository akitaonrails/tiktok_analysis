package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.03g6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C904003g6 {
    public String LIZ;
    public final List<C904003g6> LIZIZ;

    public C904003g6() {
        this(0);
    }

    public final String LIZ() {
        C904003g6 next;
        String str;
        if (this.LIZ.length() > 0) {
            return this.LIZ;
        }
        Iterator<C904003g6> it2 = this.LIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LIZ().length() > 0) {
                break;
            }
        }
        C904003g6 c904003g6 = next;
        return (c904003g6 == null || (str = c904003g6.LIZ) == null) ? "" : str;
    }

    public C904003g6(int i) {
        this.LIZ = "";
        this.LIZIZ = new ArrayList();
    }

    public final void LIZIZ(int i) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        this.LIZ = ((IApplicationDependencyService) iECommerceHostService).getApplication().getString(i);
    }

    public final void LIZJ(String str, String... strArr) {
        String strLIZ;
        String str2 = (String) C13LQ.LJJIIZ(0, strArr);
        if (str2 != null && str2.length() != 0) {
            strLIZ = C928803k6.LIZ(str, str2);
        } else {
            strLIZ = C928803k6.LIZ(str, new String[0]);
        }
        this.LIZ = strLIZ;
    }
}
