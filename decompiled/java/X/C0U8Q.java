package X;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: X.0U8Q, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U8Q {
    public static final C0X76 LIZ(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        C842540X3k c842540X3kLIZLLL = AbstractC842530X3j.LIZLLL(C0X0P.LIZJ("image/png"), byteArrayOutputStream.toByteArray());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("boar_preview.png");
        sbLIZ.append(System.currentTimeMillis());
        return C0X76.LIZIZ("file", C2188811AlT.LIZIZ(sbLIZ), c842540X3kLIZLLL);
    }
}
