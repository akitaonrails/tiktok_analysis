package X;

import android.content.res.Resources;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DGq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336380DGq {
    public static int LIZ(Resources resources, int i) {
        try {
            return resources.getDimensionPixelSize(i);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }
}
