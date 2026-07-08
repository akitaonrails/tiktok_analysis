package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.Locale;

/* JADX INFO: renamed from: X.0lha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1367960lha {
    public static final C1367960lha LIZ = new C1367960lha();

    public static String LIZIZ() {
        String lowerCase;
        String str = C0X2A.LIZJ;
        return (str == null || (lowerCase = str.toLowerCase(Locale.ROOT)) == null) ? "" : lowerCase;
    }

    public static IPoiService LIZ() {
        return (IPoiService) ServiceManager.get().getService(C1367970lhb.LIZ);
    }
}
