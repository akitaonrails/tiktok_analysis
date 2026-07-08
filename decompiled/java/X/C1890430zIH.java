package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0zIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1890430zIH {
    public static final Keva LIZ = Keva.getRepo("unified_frequency_control_repo");

    public static boolean LIZ() {
        return System.currentTimeMillis() - LIZ.getLong("key_unified_push_permission", 0L) > 86400000;
    }
}
