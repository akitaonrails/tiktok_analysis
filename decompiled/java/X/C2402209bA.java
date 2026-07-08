package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.api.IAppContextManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.09bA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2402209bA {
    public static final C2402209bA LIZ = new C2402209bA();

    public static boolean LIZ(String str, String str2) {
        boolean zLJFF = false;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return false;
        }
        if (TextUtils.isEmpty(str) || !(zLJFF = C2162308dZ.LJFF(((IAppContextManagerService) ServiceManager.get().getService(IAppContextManagerService.class)).getApplicationContext(), str))) {
            if (!TextUtils.isEmpty(str2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(UriProtector.parse(str2));
                return C2162308dZ.LJ(((IAppContextManagerService) ServiceManager.get().getService(IAppContextManagerService.class)).getApplicationContext(), intent);
            }
            return zLJFF;
        }
        return zLJFF;
    }
}
