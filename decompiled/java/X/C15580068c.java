package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.068c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15580068c {
    public static final C15580068c LIZ = new C15580068c();

    public static void LIZ(Object obj) {
        if (!EventBus.LIZLLL().LJIIJ(obj)) {
            try {
                EventBus.LIZLLL().LJIJJ(obj);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public static void LIZIZ(Object obj) {
        if (EventBus.LIZLLL().LJIIJ(obj)) {
            EventBus.LIZLLL().LJJI(obj);
        }
    }
}
