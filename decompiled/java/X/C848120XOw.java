package X;

import android.content.Context;
import android.content.IntentFilter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0XOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848120XOw {
    public static C848120XOw LIZLLL;
    public final Context LIZ;
    public EnumC804670VhR LIZIZ;
    public final C1519760peQ<InterfaceC848130XOx> LIZJ = new C1519760peQ<>();

    public C848120XOw(ActivityC2186501Ahk activityC2186501Ahk) {
        this.LIZIZ = EnumC804670VhR.MOBILE;
        Context contextN3 = C786410Ut5.N3(activityC2186501Ahk);
        this.LIZ = contextN3;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        try {
            C786410Ut5.LJIJJ(contextN3, new C854540Xfg(this, 9), intentFilter);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LIZIZ = C804680VhS.LIZ(this.LIZ);
    }

    public static synchronized C848120XOw LIZ(ActivityC2186501Ahk activityC2186501Ahk) {
        if (LIZLLL == null) {
            LIZLLL = new C848120XOw(activityC2186501Ahk);
        }
        return LIZLLL;
    }
}
