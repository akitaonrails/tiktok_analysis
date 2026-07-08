package X;

import com.ss.android.ugc.aweme.ug.shortcut.UninstallRemoveData;

/* JADX INFO: renamed from: X.10XW, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10XW {
    public static final UninstallRemoveData LIZ = new UninstallRemoveData(false, "", "", false);

    public static UninstallRemoveData LIZ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        UninstallRemoveData uninstallRemoveData = LIZ;
        UninstallRemoveData uninstallRemoveData2 = (UninstallRemoveData) c0c64LJIILLIIL.LJJII(UninstallRemoveData.class, uninstallRemoveData, "uninstall_remove_keep_shortcut", true);
        return uninstallRemoveData2 != null ? uninstallRemoveData2 : uninstallRemoveData;
    }
}
