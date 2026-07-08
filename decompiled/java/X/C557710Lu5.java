package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Lu5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557710Lu5 {
    public static final /* synthetic */ int LIZ = 0;

    public static Bitmap LIZ(String str) {
        Bitmap bitmapDecodeByteArray = null;
        if (str == null) {
            return null;
        }
        if (u.LJJIIJZLJL(str, "data:", false) && u.LJJIIJZLJL(str, "data:image/", false) && a0.LJJIIZI(str, ";base64,", false)) {
            try {
                byte[] bArrDecode = Base64.decode((String) a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6).get(1), 0);
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                return bitmapDecodeByteArray;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return bitmapDecodeByteArray;
    }
}
