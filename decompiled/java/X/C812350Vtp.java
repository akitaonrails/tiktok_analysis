package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.cloudmessaging.zzaa;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0Vtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C812350Vtp {
    public static int LJII;
    public static PendingIntent LJIIIIZZ;
    public static final ExecutorC812400Vtu LJIIIZ = ExecutorC812400Vtu.LL;
    public static final Pattern LJIIJ = PatternProtector.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context LIZIZ;
    public final C812260Vtg LIZJ;
    public final C822660WOy LIZLLL;
    public Messenger LJFF;
    public zzd LJI;
    public final C830530Wi3<String, C835520Wq6<Bundle>> LIZ = new C830530Wi3<>();
    public final Messenger LJ = new Messenger(new zzaa(this, Looper.getMainLooper()));

    public static synchronized String LIZJ() {
        int i;
        i = LJII;
        LJII = i + 1;
        return Integer.toString(i);
    }

    public C812350Vtp(Context context) {
        this.LIZIZ = context;
        this.LIZJ = new C812260Vtg(context);
        C822660WOy c822660WOy = new C822660WOy(1);
        c822660WOy.setKeepAliveTime(60L, TimeUnit.SECONDS);
        c822660WOy.allowCoreThreadTimeOut(true);
        this.LIZLLL = c822660WOy;
    }

    public static Bundle LIZ(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C835510Wq5 LIZIZ(android.os.Bundle r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C812350Vtp.LIZIZ(android.os.Bundle):X.0Wq5");
    }

    public static synchronized void LIZLLL(Context context, Intent intent) {
        if (LJIIIIZZ == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            LJIIIIZZ = PendingIntent.getBroadcast(context, 0, intent2, C2211808lY.LIZ);
        }
        intent.putExtra("app", LJIIIIZZ);
    }

    public final void LJ(Bundle bundle, String str) {
        synchronized (this.LIZ) {
            try {
                C835520Wq6<Bundle> c835520Wq6Remove = this.LIZ.remove(str);
                if (c835520Wq6Remove == null) {
                    String strValueOf = String.valueOf(str);
                    if (strValueOf.length() != 0) {
                        "Missing callback for ".concat(strValueOf);
                    }
                    return;
                }
                c835520Wq6Remove.LIZIZ(bundle);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
