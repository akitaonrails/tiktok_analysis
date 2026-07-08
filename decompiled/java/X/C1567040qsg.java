package X;

import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0qsg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1567040qsg {
    public static ArrayList LIZ() {
        ArrayList arrayListLJ = C1697810uHb.LJ("HOME", "For You", "Following", "FRIENDS_TAB", "homepage_explore", "Nearby");
        if (ComplianceServiceProvider.LJI().LJJIFFI()) {
            arrayListLJ.add("FRIENDS_FEED");
        }
        arrayListLJ.add("Stem");
        return arrayListLJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZIZ() {
        Boolean bool;
        return (ComplianceServiceProvider.LJI().LJIIJ(false) && (bool = (Boolean) ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LJJIII().getValue()) != null && bool.booleanValue()) || C1593730rZj.LIZIZ.LJIJI();
    }
}
