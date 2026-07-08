package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.10UI, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10UI {
    public static volatile boolean LIZ;

    public static final boolean LIZ() {
        if (!LIZ) {
            LIZ = Keva.getRepo("df_preload_unify_repo").getBoolean("df_preload_unify_exp", false);
        }
        return LIZ;
    }
}
