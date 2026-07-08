package X;

import com.bytedance.keva.Keva;

/* JADX INFO: renamed from: X.0dxp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070510dxp {
    public static final boolean LIZ() {
        return Keva.getRepo("facebook_sync_repo").getBoolean("facebook_sync_is_removing", false);
    }

    public static final boolean LIZIZ() {
        return Keva.getRepo("mlbb_sync_repo").getBoolean("mlbb_sync_is_removing", false);
    }

    public static final boolean LIZJ() {
        return Keva.getRepo("contacts_sync_repo").getBoolean("contacts_sync_is_removing", false);
    }
}
