package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Locale;

/* JADX INFO: renamed from: X.0hNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201920hNm {
    public static EnumC1553730qXD LIZ(String str) {
        try {
            return EnumC1553730qXD.valueOf(str.toUpperCase(Locale.US));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return EnumC1553730qXD.UNSUPPORTED;
        }
    }
}
