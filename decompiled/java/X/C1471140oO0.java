package X;

import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0oO0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471140oO0 {
    public static void LIZ(int i, String str, long j, DataLoaderHelper dataLoaderHelper) {
        if (dataLoaderHelper.LIZIZ != 0) {
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("DataLoaderHelper", "dataloader not started, not allow set play info");
        } else {
            if (dataLoaderHelper.LJJJI <= 0) {
                return;
            }
            dataLoaderHelper.LJJ.LIZJ(1);
            C1476180oW8 c1476180oW8 = dataLoaderHelper.LJJJJL;
            if (c1476180oW8.LIZ > 0 && c1476180oW8.LIZIZ > 0) {
                c1476180oW8.LIZJ(i, j, str);
            }
            dataLoaderHelper.LJJ.LJFF(1);
        }
    }
}
