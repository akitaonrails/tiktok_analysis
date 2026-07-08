package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.09ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2487509ov {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C09AL()));
    public final ConcurrentLinkedQueue<C2488009p0> LIZIZ = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<C2487609ow, C2488009p0> LIZJ = new ConcurrentHashMap<>();

    public static String LIZ(C0VSJ c0vsj, MediaModel mediaModel, boolean z) {
        boolean z2;
        Bitmap bitmapLIZLLL;
        String strLJFF = mediaModel.LJFF();
        if (strLJFF != null) {
            int iLIZLLL = C2477909nN.LIZLLL(strLJFF);
            if (iLIZLLL % 180 == 90) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !z) {
                return strLJFF;
            }
            C1450470nqf c1450470nqf = C1450470nqf.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[saveFileWithRotateInfo] ");
            sbLIZ.append(strLJFF);
            sbLIZ.append(" has degree ");
            sbLIZ.append(iLIZLLL);
            C201955140j.LJIILJJIL(c1450470nqf, C2188811AlT.LIZIZ(sbLIZ));
            int[] iArrLIZJ = C2475309mx.LIZJ(strLJFF);
            try {
                Bitmap bitmapLIZ = C2475309mx.LIZ(iArrLIZJ[0], iArrLIZJ[1], strLJFF);
                if (bitmapLIZ == null || (bitmapLIZLLL = C2475309mx.LIZLLL(bitmapLIZ, iLIZLLL)) == null) {
                    return strLJFF;
                }
                C2475309mx.LJFF(100, Bitmap.CompressFormat.JPEG, bitmapLIZLLL, c0vsj);
                bitmapLIZLLL.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZLLL);
                if (z2) {
                    mediaModel.width = iArrLIZJ[1];
                    mediaModel.height = iArrLIZJ[0];
                }
            } catch (OutOfMemoryError e) {
                TryCatchGuardChecker.doCheck(e);
                return strLJFF;
            }
        }
        return c0vsj.getAbsolutePath();
    }
}
