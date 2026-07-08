package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;

/* JADX INFO: renamed from: X.0C5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307920C5e {
    public static boolean LIZ;

    static {
        Keva repoSync = KevaImpl.getRepoSync("repo_unregistered_opt_libra_config", 0);
        repoSync.getBoolean("key_opt_open", false);
        repoSync.getBoolean("key_keva_single_mode", false);
        LIZ = repoSync.getBoolean("key_using_skip_lock", false);
    }
}
