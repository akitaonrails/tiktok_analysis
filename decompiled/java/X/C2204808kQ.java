package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.08kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2204808kQ {
    public static C2204508kN LIZ() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        ConcurrentHashMap<String, C2204508kN> concurrentHashMap = C2204508kN.LJFF;
        C2204508kN c2204508kN = concurrentHashMap.get(currentUserID);
        if (c2204508kN != null) {
            return c2204508kN;
        }
        C2204508kN c2204508kN2 = new C2204508kN(currentUserID);
        concurrentHashMap.put(currentUserID, c2204508kN2);
        return c2204508kN2;
    }
}
