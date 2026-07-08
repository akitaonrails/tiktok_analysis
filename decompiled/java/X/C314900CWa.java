package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.0CWa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C314900CWa<T> {
    public static final /* synthetic */ int LJ = 0;
    public final Function0<? extends T> LIZ;
    public volatile AnonymousClass0956 LIZIZ;
    public volatile T LIZJ;
    public final ArrayList<Function1<T, Unit>> LIZLLL = new ArrayList<>();

    public C314900CWa(AwS576S0100000_32 awS576S0100000_32) {
        this.LIZ = awS576S0100000_32;
    }

    public static Object LIZ(C314900CWa c314900CWa) {
        T tInvoke;
        if (c314900CWa.LIZJ != null) {
            return c314900CWa.LIZJ;
        }
        synchronized (c314900CWa) {
            try {
                AnonymousClass0956 anonymousClass0956 = c314900CWa.LIZIZ;
                if (anonymousClass0956 == null) {
                    return c314900CWa.LIZ.invoke();
                }
                if (anonymousClass0956.isCompleted()) {
                    tInvoke = c314900CWa.LIZJ;
                } else if (!anonymousClass0956.isActive()) {
                    tInvoke = c314900CWa.LIZ.invoke();
                } else {
                    tInvoke = null;
                }
                return tInvoke;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
