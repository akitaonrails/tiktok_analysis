package X;

import android.content.Intent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Cxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C330790Cxx {
    public static final C330790Cxx LIZ = new C330790Cxx();

    public static void LIZ(C0LAB c0lab, String str, Intent intent) {
        try {
            String stringExtra = intent.getStringExtra(str);
            if (stringExtra != null) {
                c0lab.LJ(str, stringExtra);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
