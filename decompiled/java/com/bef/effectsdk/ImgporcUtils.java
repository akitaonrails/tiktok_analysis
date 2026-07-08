package com.bef.effectsdk;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public class ImgporcUtils {

    public static class InterpolationFlags {
    }

    public static native float nativeCalculateAspectRatio(PointF[] pointFArr, int i, int i2);

    public static native Bitmap nativeCorrectPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2, int i3);

    public static float calculateAspectRatio(PointF[] pointFArr, int i, int i2) {
        return nativeCalculateAspectRatio(pointFArr, i, i2);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static byte[] compressImage(Bitmap bitmap, int i, int i2) {
        Bitmap.CompressFormat compressFormat;
        if (i == 1) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, i2, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap decodeImage(byte[] bArr, int i, int i2) {
        if (i > 0 && i2 > 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int iCalculateInSampleSize = calculateInSampleSize(options, i, i2);
            options.inJustDecodeBounds = false;
            options.inSampleSize = iCalculateInSampleSize;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2) {
        return nativeCorrectPerspective(bitmap, pointFArr, i, i2, 1);
    }

    public static Bitmap correctPerspective(Bitmap bitmap, PointF[] pointFArr, int i, int i2, int i3) {
        return nativeCorrectPerspective(bitmap, pointFArr, i, i2, i3);
    }
}
