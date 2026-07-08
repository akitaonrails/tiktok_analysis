package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.08Sx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2121708Sx {
    public final Context LIZ;

    public C2121708Sx(Context context) {
        this.LIZ = context;
    }

    public final Set LIZ() {
        Set<String> hashSet;
        synchronized (C2121708Sx.class) {
            try {
                try {
                    hashSet = C810670Vr7.LIZJ(this.LIZ, 0, "playcore_split_install_internal").getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                    if (hashSet == null) {
                        hashSet = new HashSet<>();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    hashSet = new HashSet<>();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return hashSet;
    }
}
