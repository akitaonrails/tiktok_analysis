package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.14z1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20443314z1 {
    public static AbstractC20027413Xs LIZ(String str, String str2) {
        try {
            if (a0.LJJIIZI(str, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                C20443514z3.Companion.getClass();
                return C20446814za.LIZ(str, str2);
            }
            throw new C13XT();
        } catch (C13XT e) {
            TryCatchGuardChecker.doCheck(e);
            return new C20441314yh(str, str2);
        }
    }
}
