package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;

/* JADX INFO: renamed from: X.0jfK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289680jfK {
    public static int LIZ = 0;
    public static long LIZIZ = 0;

    public static byte[] LIZ(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap LIZJ(int i, Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = bitmap;
        int byteCount = bitmapCreateBitmap.getByteCount();
        LIZ++;
        if (i < byteCount) {
            float fSqrt = (float) Math.sqrt((((double) i) + 0.0d) / ((double) byteCount));
            if (LIZ > 10 || LIZIZ > 52428800) {
                fSqrt *= 0.99f;
            }
            Matrix matrix = new Matrix();
            matrix.setScale(fSqrt, fSqrt);
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, true);
            LIZIZ += (long) bitmapCreateBitmap.getByteCount();
            if (bitmapCreateBitmap.getByteCount() > i) {
                return LIZJ(i - 2, bitmapCreateBitmap);
            }
        }
        LIZIZ = 0L;
        LIZ = 0;
        return bitmapCreateBitmap;
    }

    public static Bitmap LJ(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static Bitmap LIZIZ(byte[] bArr, int i, int i2, float f) {
        new BitmapFactory.Options().inJustDecodeBounds = true;
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return LJ(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options), f);
    }

    public static Bitmap LIZLLL(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (i + i3 > bitmap.getWidth()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startX + width > originBitmap.getWidth() startX is ");
            sbLIZ.append(i);
            sbLIZ.append(" startY is ");
            sbLIZ.append(i2);
            sbLIZ.append(" width is ");
            sbLIZ.append(i3);
            sbLIZ.append(" height is ");
            sbLIZ.append(i4);
            sbLIZ.append(" image.width is ");
            sbLIZ.append(bitmap.getWidth());
            sbLIZ.append(" image.height is ");
            sbLIZ.append(bitmap.getHeight());
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
        if (i2 + i4 > bitmap.getHeight()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("startY + height > originBitmap.getHeight() startX is ");
            sbLIZ2.append(i);
            sbLIZ2.append(" startY is ");
            sbLIZ2.append(i2);
            sbLIZ2.append(" width is ");
            sbLIZ2.append(i3);
            sbLIZ2.append(" height is ");
            sbLIZ2.append(i4);
            sbLIZ2.append(" image.width is ");
            sbLIZ2.append(bitmap.getWidth());
            sbLIZ2.append(" image.height is ");
            sbLIZ2.append(bitmap.getHeight());
            C2188811AlT.LIZIZ(sbLIZ2);
            return null;
        }
        if (i < 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startX < 0 startX is ");
            sbLIZ3.append(i);
            sbLIZ3.append(" startY is ");
            sbLIZ3.append(i2);
            sbLIZ3.append(" width is ");
            sbLIZ3.append(i3);
            sbLIZ3.append(" height is ");
            sbLIZ3.append(i4);
            sbLIZ3.append(" image.width is ");
            sbLIZ3.append(bitmap.getWidth());
            sbLIZ3.append(" image.height is ");
            sbLIZ3.append(bitmap.getHeight());
            C2188811AlT.LIZIZ(sbLIZ3);
            return null;
        }
        if (i2 < 0) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("startY < 0 startX is ");
            sbLIZ4.append(i);
            sbLIZ4.append(" startY is ");
            sbLIZ4.append(i2);
            sbLIZ4.append(" width is ");
            sbLIZ4.append(i3);
            sbLIZ4.append(" height is ");
            sbLIZ4.append(i4);
            sbLIZ4.append(" image.width is ");
            sbLIZ4.append(bitmap.getWidth());
            sbLIZ4.append(" image.height is ");
            sbLIZ4.append(bitmap.getHeight());
            C2188811AlT.LIZIZ(sbLIZ4);
            return null;
        }
        if (i3 < 0) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("width < 0 startX is ");
            sbLIZ5.append(i);
            sbLIZ5.append(" startY is ");
            sbLIZ5.append(i2);
            sbLIZ5.append(" width is ");
            sbLIZ5.append(i3);
            sbLIZ5.append(" height is ");
            sbLIZ5.append(i4);
            sbLIZ5.append(" image.width is ");
            sbLIZ5.append(bitmap.getWidth());
            sbLIZ5.append(" image.height is ");
            sbLIZ5.append(bitmap.getHeight());
            C2188811AlT.LIZIZ(sbLIZ5);
            return null;
        }
        if (i4 < 0) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("height < 0 startX is ");
            sbLIZ6.append(i);
            sbLIZ6.append(" startY is ");
            sbLIZ6.append(i2);
            sbLIZ6.append(" width is ");
            sbLIZ6.append(i3);
            sbLIZ6.append(" height is ");
            sbLIZ6.append(i4);
            sbLIZ6.append(" image.width is ");
            sbLIZ6.append(bitmap.getWidth());
            sbLIZ6.append(" image.height is ");
            sbLIZ6.append(bitmap.getHeight());
            C2188811AlT.LIZIZ(sbLIZ6);
            return null;
        }
        return Bitmap.createBitmap(bitmap, i, i2, i3, i4);
    }
}
