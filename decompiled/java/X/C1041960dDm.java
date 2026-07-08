package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.seclink.ISecLinkService;

/* JADX INFO: renamed from: X.0dDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1041960dDm {
    public static final C1041960dDm LIZ = new C1041960dDm();

    public static String LIZ(String str, String str2) {
        String strLIZIZ = ((ISecLinkService) ServiceManager.get().getService(ISecLinkService.class)).LIZIZ(str, str2);
        if (strLIZIZ != null) {
            return strLIZIZ;
        }
        return str;
    }
}
