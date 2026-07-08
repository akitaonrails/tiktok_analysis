package X;

import android.graphics.Bitmap;
import co5.g;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1Ahe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186441Ahe {
    public static g LIZ(C1AFI c1afi) {
        String str;
        Bitmap bitmap;
        String str2;
        Bitmap bitmap2 = null;
        g gVar = new g(null, 511);
        if (c1afi == null) {
            str = null;
        } else {
            try {
                str = c1afi.LJII;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return gVar;
            }
        }
        gVar.LIZIZ = str;
        if (c1afi == null) {
            bitmap = null;
        } else {
            bitmap = c1afi.LJIILIIL;
        }
        gVar.LIZJ = bitmap;
        if (c1afi == null) {
            str2 = null;
        } else {
            str2 = c1afi.LJFF;
        }
        gVar.LIZLLL = str2;
        if (c1afi != null) {
            bitmap2 = c1afi.LJIILJJIL;
        }
        gVar.LJ = bitmap2;
        return gVar;
    }
}
