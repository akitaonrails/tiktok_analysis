package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.applog.AppLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248100iaG {
    public String LIZ = C0XQ7.LJFF().getCurUserId();
    public final String LIZIZ = AppLog.getClientId();
    public C1248100iaG LIZJ;
    public final Keva LIZLLL;

    public final C1248100iaG LIZ() {
        if (this.LIZJ == null || !Intrinsics.LJFF(this.LIZ, C0XQ7.LJFF().getCurUserId())) {
            synchronized (C1248100iaG.class) {
                try {
                    this.LIZ = C0XQ7.LJFF().getCurUserId();
                    this.LIZJ = new C1248100iaG();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LIZJ;
    }

    public C1248100iaG() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("guide_user_bind_number_");
        sbLIZ.append(this.LIZ);
        this.LIZLLL = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
