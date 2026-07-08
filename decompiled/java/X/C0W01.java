package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W01, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W01 {
    public static final String[] LIZ;

    static {
        new C0W01();
        LIZ = new String[]{"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    }

    public static final String LIZ() {
        if (C807660VmG.LIZ(C0W01.class)) {
            return null;
        }
        try {
            Context contextLIZJ = FacebookSdk.LIZJ();
            List<ResolveInfo> listQueryIntentServices = contextLIZJ.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            HashSet hashSetLJJLIIIJLJLI = C13LQ.LJJLIIIJLJLI(LIZ);
            Iterator<ResolveInfo> it2 = listQueryIntentServices.iterator();
            while (it2.hasNext()) {
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null && hashSetLJJLIIIJLJLI.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final String LIZIZ() {
        if (C807660VmG.LIZ(C0W01.class)) {
            return null;
        }
        try {
            return Intrinsics.LJIIJJI(FacebookSdk.LIZJ().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public static final String LIZJ(String str) {
        if (C807660VmG.LIZ(C0W01.class)) {
            return null;
        }
        try {
            if (C0W7K.LIZ(FacebookSdk.LIZJ(), str)) {
                return str;
            }
            if (C0W7K.LIZ(FacebookSdk.LIZJ(), LIZIZ())) {
                return LIZIZ();
            }
            return "";
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
