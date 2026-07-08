package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;

/* JADX INFO: renamed from: X.0Ze4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904500Ze4 {
    public static final C904500Ze4 LIZ = new C904500Ze4();

    public static final boolean LIZ(Context context, String str) {
        C0ZUN proxy;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            IAwemeImManager iAwemeImManager = (IAwemeImManager) PluggableExtentionKt.pluggableSpiForReal(IAwemeImManager.class);
            if (iAwemeImManager != null && (proxy = iAwemeImManager.getProxy()) != null) {
                C1606620ruW.LIZJ(context, str);
                return true;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
