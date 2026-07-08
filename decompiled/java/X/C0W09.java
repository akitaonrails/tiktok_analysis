package X;

import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.os.Build;
import com.ss.android.ugc.aweme.minis.view.MinisGameGuidanceSheetFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W09, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W09 {
    public static MinisGameGuidanceSheetFragment LIZ;
    public static ShortcutManager LIZIZ;

    public static boolean LIZ() {
        List<ShortcutInfo> pinnedShortcuts;
        if (Build.VERSION.SDK_INT < 26) {
            return false;
        }
        if (LIZIZ == null) {
            C844470XAv.LIZ.getClass();
            LIZIZ = (ShortcutManager) C844470XAv.LIZ().getSystemService(ShortcutManager.class);
        }
        ShortcutManager shortcutManager = LIZIZ;
        if (shortcutManager != null && (pinnedShortcuts = shortcutManager.getPinnedShortcuts()) != null && !pinnedShortcuts.isEmpty()) {
            Iterator<ShortcutInfo> it2 = pinnedShortcuts.iterator();
            while (it2.hasNext()) {
                String id = it2.next().getId();
                C1395660mQG.LIZ.getClass();
                if (Intrinsics.LJFF(id, C1395660mQG.LIZ())) {
                    int i = C2187451AjH.LIZ;
                    return true;
                }
            }
        }
        int i2 = C2187451AjH.LIZ;
        return false;
    }
}
