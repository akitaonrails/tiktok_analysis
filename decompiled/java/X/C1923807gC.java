package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.07gC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1923807gC {
    public static final Long LIZ(String str) {
        try {
            return Long.valueOf(CastLongProtector.parseLong(str));
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
