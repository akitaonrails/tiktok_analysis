package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;

/* JADX INFO: renamed from: X.0znA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909580znA implements C0QBB {
    public static volatile C1909580znA LIZ;

    @Override // X.C0QBB
    public final boolean LIZ(String str) {
        if (str != null) {
            Uri uri = UriProtector.parse(str);
            C1909570zn9.LIZ.getClass();
            if (!C1909570zn9.LIZJ(uri) && !C1909570zn9.LIZLLL(uri)) {
                if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).n4().LIZIZ()) {
                    try {
                        if (((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJIJJLI(UriProtector.parse(str))) {
                            return true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                    }
                    if (C2697012p.LIZ(str)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.C0QBB
    public final String LIZJ(Context context, String str) {
        int iIntValue;
        C512350K7l.LIZ.getClass();
        Integer num = C512350K7l.LIZJ.get(str);
        if (num != null && (iIntValue = num.intValue()) != 0) {
            return context.getString(iIntValue);
        }
        return "";
    }

    @Override // X.C0QBB
    public final Boolean LIZLLL(Context context, String str) {
        Activity activityLIZ;
        boolean zLIZ;
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (str == null) {
            zLIZ = true;
        } else {
            zLIZ = C1909570zn9.LIZ(activityLIZ, UriProtector.parse(str));
        }
        return Boolean.valueOf(zLIZ);
    }

    @Override // X.C0QBB
    public final boolean LIZIZ(Context context, Uri uri, Bundle bundle) {
        return C1909570zn9.LIZ(context, uri);
    }
}
