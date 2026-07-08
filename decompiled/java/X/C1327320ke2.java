package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0ke2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1327320ke2 {
    public static final C1085640eME<ByteBuffer> LIZ = new C1085640eME<>(12);

    public static C1327330ke3 LIZ(InputStream inputStream) {
        inputStream.getClass();
        C1085640eME<ByteBuffer> c1085640eME = LIZ;
        ByteBuffer byteBufferLIZIZ = c1085640eME.LIZIZ();
        if (byteBufferLIZIZ == null) {
            byteBufferLIZIZ = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferLIZIZ.array();
            ColorSpace colorSpace = null;
            BitmapFactory.decodeStream(inputStream, null, options);
            if (Build.VERSION.SDK_INT >= 26) {
                colorSpace = options.outColorSpace;
            }
            C1327330ke3 c1327330ke3 = new C1327330ke3(options.outWidth, options.outHeight, colorSpace);
            c1085640eME.LIZ(byteBufferLIZIZ);
            return c1327330ke3;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ.LIZ(byteBufferLIZIZ);
            throw th;
        }
    }

    public static int LIZIZ(Bitmap.Config config) {
        switch (C1301690jyh.LIZ[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static int LIZJ(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmap.getByteCount();
        }
    }
}
