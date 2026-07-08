package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0NGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591050NGd {
    public static final C591050NGd LIZ = new C591050NGd();

    public static void LIZ(String str) {
        try {
            new C0VSJ(str).delete();
            if (u.LJIIZILJ(str, ".mdl", false)) {
                new C0VSJ(a0.LJJL(str, str.length() - 4, str.length(), ".mdlnodeconf").toString()).delete();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
