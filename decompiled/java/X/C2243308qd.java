package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedOutputStream;

/* JADX INFO: renamed from: X.08qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2243308qd {
    public static final boolean LIZ(Bitmap bitmap, String str) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(str));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("saveBitmapToImage: e = ");
                sbLIZ.append(thM5exceptionOrNullimpl);
                C201955140j.LJII(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
            }
            return false;
        }
    }
}
