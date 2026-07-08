package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.common.wschannel.client.AbsWsClientService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WKI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WKI {
    public final C0WKB LIZ;
    public final Class<? extends AbsWsClientService> LIZIZ;

    public C0WKI(final Context context, Class<? extends AbsWsClientService> cls) {
        if (Build.VERSION.SDK_INT >= 26 && context.getApplicationInfo().targetSdkVersion >= 26) {
            this.LIZ = new C0WKK(this, context);
        } else {
            this.LIZ = new C0WKB(context) { // from class: X.0WKJ
                public final Context LIZ;

                @Override // X.C0WKB
                public final void LIZ() {
                }

                @Override // X.C0WKB
                public final void LIZIZ(Intent intent) {
                    boolean zLJI = MethodIDManager.LJI(137893);
                    try {
                        intent.setComponent(new ComponentName(this.LIZ, this.LIZIZ.LIZIZ));
                        C786410Ut5.s3(this.LIZ, intent);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }

                {
                    this.LIZ = context;
                }
            };
        }
        this.LIZIZ = cls;
    }
}
