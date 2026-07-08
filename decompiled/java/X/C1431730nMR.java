package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nMR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431730nMR {
    public static final String LIZ() {
        C0CHQ.LIZ().LJIIJJI();
        return "unknown";
    }

    public static final boolean LIZIZ(C1434650nR9 c1434650nR9) {
        if (c1434650nR9 instanceof C1430810nKx) {
            return false;
        }
        Throwable cause = c1434650nR9.getCause();
        if ((!(cause instanceof C1433670nPZ) || ((C1433670nPZ) cause).getCode() != -66666) && ((!(cause instanceof C1434330nQd) || ((C1434330nQd) cause).getErrorCode() != -39993) && !Intrinsics.LJFF(c1434650nR9, C1431740nMS.INSTANCE))) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(String str) {
        C1436930nUp.LIZIZ(str, new C1431180nLY(str, null), null);
    }

    public static final void LJ(Throwable th) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("studio_throw_publish_failure_as_crash", false)) {
            C0CHQ.LIZ().LJIIJJI();
        }
    }
}
