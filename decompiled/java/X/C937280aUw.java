package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aUw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937280aUw {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        switch (str.hashCode()) {
            case -1872205243:
                if (!str.equals("playbook_entity")) {
                    return false;
                }
                return true;
            case -907987547:
                if (!str.equals("scheme")) {
                    return false;
                }
                return true;
            case -229890836:
                if (!str.equals("playbook_edit")) {
                    return false;
                }
                return true;
            case 353061164:
                if (!str.equals("setting_playbook")) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    public static final boolean LIZIZ(String str) {
        return Intrinsics.LJFF(str, "playbook_edit");
    }

    public static final Object LIZJ(Class cls, String str, Object obj) {
        Object objLJII;
        try {
            objLJII = C19748512Ol.LIZJ.LJII(str, cls);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (objLJII != null) {
            return objLJII;
        }
        return obj;
    }
}
