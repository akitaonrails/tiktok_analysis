package X;

import com.bytedance.android.livesdk.watch.memleak.LiveMemLeakDetectSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0IKR, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKR {
    public static final void LIZ(int i, Object obj) {
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.isOffline() && LiveMemLeakDetectSetting.isEnabled(i)) {
            iHostAppContext.detectFragLeakOffline(obj);
        }
    }
}
