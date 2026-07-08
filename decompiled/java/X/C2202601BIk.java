package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.1BIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202601BIk {
    public static final ScheduledExecutorService LIZLLL = C807400Vlq.LJ();
    public final String LIZ;
    public final C1BKM LIZIZ;
    public final String LIZJ;

    public final void LIZ(String str) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            Bundle bundleLIZ = C1BJ5.LIZ("");
            C786410Ut5.LJJJI("2_result", EnumC2202671BIr.ERROR.getLoggingValue(), bundleLIZ);
            C786410Ut5.LJJJI("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", bundleLIZ);
            C786410Ut5.LJJJI("3_method", str, bundleLIZ);
            getClass();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1BKM] */
    public C2202601BIk(Context context, String str) {
        PackageInfo packageInfoY3;
        this.LIZ = str;
        final int i = 0;
        this.LIZIZ = new Object(i) { // from class: X.1BKM
            public static final /* synthetic */ int LIZ = 0;
        };
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfoY3 = C786410Ut5.Y3(packageManager, "com.facebook.katana", 0)) != null) {
                this.LIZJ = packageInfoY3.versionName;
            }
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
