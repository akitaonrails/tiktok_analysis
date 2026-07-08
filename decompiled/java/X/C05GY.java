package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.05GY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05GY {
    public static final Keva LIZ = Keva.getRepo("consent_event_tracking_repo");
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C2232408os LIZJ = new C2232408os(C786410Ut5.h4());

    public static boolean LIZ() {
        return LIZIZ.get();
    }

    public static void LIZIZ(boolean z) {
        AtomicBoolean atomicBoolean = LIZIZ;
        atomicBoolean.set(z);
        if (atomicBoolean.get()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(LIZJ), null, null, new C05GW(null), 3);
        }
    }
}
