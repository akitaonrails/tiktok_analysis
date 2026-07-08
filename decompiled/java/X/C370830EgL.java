package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0EgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370830EgL {
    public static Bitmap LIZ(C370830EgL c370830EgL, ByteBuffer byteBuffer, String str, int i, int i2, int i3, int i4, Bitmap.Config config, boolean z, int i5) {
        if ((i5 & 64) != 0) {
            config = Bitmap.Config.RGB_565;
        }
        if ((i5 & 128) != 0) {
            z = false;
        }
        c370830EgL.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
        if (z) {
            int width = bitmapCreateBitmap.getWidth();
            int i6 = width / 2;
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, i6, 0, width - i6, bitmapCreateBitmap.getHeight());
        }
        try {
            C0EHL.LIZ();
            return C383660F2m.LIZJ(bitmapCreateBitmap, i3, i4, config);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("decode bitmap failed with path ");
            sbLIZ.append(str);
            sbLIZ.append(" reason ");
            sbLIZ.append(e);
            C355090Dw3.LIZLLL("GetFrameAbility", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }
}
