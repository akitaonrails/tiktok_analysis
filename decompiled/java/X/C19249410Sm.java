package X;

import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.10Sm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19249410Sm {
    public static IPluginService.ReinstallCheck LIZ(int i) {
        for (IPluginService.ReinstallCheck reinstallCheck : IPluginService.ReinstallCheck.getEntries()) {
            if (reinstallCheck.getValue() == i) {
                return reinstallCheck;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
