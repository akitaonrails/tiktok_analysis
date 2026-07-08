package X;

import android.util.Log;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.0522, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0522 {
    public static final AnonymousClass0522 LIZ = new AnonymousClass0522();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(75));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(76));

    public final synchronized void LIZJ() {
        Object c098200Yq;
        try {
            ((Keva) LIZIZ.getValue()).storeStringArray("orphaned_creation_ids", (String[]) LIZ().keySet().toArray(new String[0]));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static ConcurrentHashMap LIZ() {
        return (ConcurrentHashMap) LIZJ.getValue();
    }

    public static final void LIZIZ(long j) {
        Object c098200Yq;
        try {
            LIZ.getClass();
            ((Keva) LIZIZ.getValue()).storeLong("last_preload_clean_run_at_ms", j);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static final void LIZLLL(String str) {
        Object c098200Yq;
        AnonymousClass0522 anonymousClass0522 = LIZ;
        try {
            anonymousClass0522.getClass();
            LIZ().remove(str);
            anonymousClass0522.LIZJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeTracked: ");
            sbLIZ.append(str);
            sbLIZ.append(", remaining=");
            sbLIZ.append(LIZ().size());
            c098200Yq = Integer.valueOf(Log.d("SSticker-PreloadTracker", C2188811AlT.LIZIZ(sbLIZ)));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
