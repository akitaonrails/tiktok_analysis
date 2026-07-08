package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.14yk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20441614yk {
    public static AbstractC20027713Xv LIZ(String str, String str2) {
        try {
            if (u.LJJIIJZLJL(str, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                C20441714yl.Companion.getClass();
                return C20446714zZ.LIZ(str, str2);
            }
            throw new C13XT();
        } catch (C13XT e) {
            TryCatchGuardChecker.doCheck(e);
            return new C20441414yi(str, str2);
        }
    }
}
