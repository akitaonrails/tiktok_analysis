package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.105B, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C105B {
    public static final C105B LIZ = new C105B();

    public static void LIZ(String str, List list) {
        C191819102n.LIZ.getClass();
        String strLIZIZ = C191819102n.LIZIZ();
        if (strLIZIZ == null) {
            return;
        }
        for (Object obj : list) {
            C105B c105b = LIZ;
            if (Intrinsics.LJFF(strLIZIZ, str) && !Intrinsics.LJFF(strLIZIZ, obj)) {
                AnonymousClass1057.LIZ.getClass();
                if (AnonymousClass1057.LIZ("guide_comment_on_delete_or_report")) {
                    synchronized (c105b) {
                        try {
                            if (AnonymousClass1057.LIZ("guide_comment_on_delete_or_report")) {
                                AnonymousClass1057.LIZJ("guide_comment_on_delete_or_report", null);
                                return;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
