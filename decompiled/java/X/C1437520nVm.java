package X;

import android.util.Log;
import com.bytedance.ies.abmock.SettingsManager;

/* JADX INFO: renamed from: X.0nVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437520nVm {
    public static final int LIZIZ;
    public final InterfaceC1437550nVp LIZ;

    public C1437520nVm() {
        this(0);
    }

    static {
        SettingsManager.LIZLLL().getClass();
        LIZIZ = SettingsManager.LJ("studio_publish_log_max_length", 2000);
    }

    public static boolean LIZ() {
        C0CHQ.LIZ().LJIIJJI();
        return false;
    }

    public /* synthetic */ C1437520nVm(int i) {
        this(new C1437530nVn());
    }

    public C1437520nVm(InterfaceC1437550nVp interfaceC1437550nVp) {
        this.LIZ = interfaceC1437550nVp;
    }

    public final void LIZIZ(String str, Throwable th) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_publish_online_business_log", true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[stage-");
            sbLIZ.append(str);
            sbLIZ.append("][thread-");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("] ");
            sbLIZ.append(Log.getStackTraceString(th));
            this.LIZ.log(C13LN.LJZL(LIZIZ, C2188811AlT.LIZIZ(sbLIZ)));
        }
    }
}
