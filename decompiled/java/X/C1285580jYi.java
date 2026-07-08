package X;

import android.media.MediaExtractor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import java.io.IOException;

/* JADX INFO: renamed from: X.0jYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285580jYi {
    public static boolean LIZ(MediaExtractor mediaExtractor, String str) {
        try {
            mediaExtractor.setDataSource(str);
            return true;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setDataSource IOException: ");
            sbLIZ.append(e.getMessage());
            AnimaXLog.LIZ("VideoAssetExtractor", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
    }
}
