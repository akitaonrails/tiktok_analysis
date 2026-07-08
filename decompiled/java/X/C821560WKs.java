package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.fresco.nativeheif.Heif;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: X.0WKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821560WKs {
    public static String LIZ(String str) {
        String str2 = "ISO-8859-1";
        if (TextUtils.isEmpty("ISO-8859-1")) {
            str2 = "UTF-8";
        }
        try {
            return new String(Base64.decode(str, 0), str2);
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static Bitmap LIZIZ(boolean z, String str, String str2, int i, int i2, InterfaceC821570WKt interfaceC821570WKt) {
        String string;
        Bitmap bitmapDecodeByteArray;
        if (z) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    String strLIZ = LIZ(str);
                    String strLIZ2 = LIZ(str2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZ2);
                    sbLIZ.append(strLIZ);
                    string = C2188811AlT.LIZIZ(sbLIZ);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    string = null;
                }
            } else {
                C1328570kg3.LIZIZ("PreviewBlur", "recoverMetaData: base64data or metaData is null!");
            }
            string = null;
        } else {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                try {
                    String strLIZ3 = LIZ(str);
                    String strLIZ4 = LIZ(str2);
                    char cCharAt = strLIZ3.charAt(0);
                    char cCharAt2 = strLIZ3.charAt(1);
                    StringBuilder sb = new StringBuilder(strLIZ4);
                    sb.setCharAt(166, cCharAt);
                    sb.setCharAt(164, cCharAt2);
                    sb.append(strLIZ3.substring(2));
                    string = sb.toString();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    string = null;
                }
            } else {
                C1328570kg3.LIZIZ("PreviewBlur", "recoverMetaData: base64data or metaData is null!");
            }
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            C1328570kg3.LIZIZ("PreviewBlur", "getBlurhashBitmap: totalImgStr is null!");
            interfaceC821570WKt.LIZ();
            return null;
        }
        try {
            try {
                byte[] bytes = string.getBytes("ISO-8859-1");
                if (z) {
                    int[] iArr = new int[1];
                    bitmapDecodeByteArray = Heif.previewToRgbaBitmap(bytes, bytes.length, 64, 64, iArr);
                    if (bitmapDecodeByteArray == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("previewToRgbaBitmap failed: errCode is ");
                        sbLIZ2.append(iArr[0]);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        interfaceC821570WKt.LIZ();
                        return null;
                    }
                } else {
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
                    if (bitmapDecodeByteArray == null) {
                        interfaceC821570WKt.LIZ();
                        return null;
                    }
                }
                try {
                    Class<?> cls = Class.forName("com.facebook.imagepipeline.nativecode.NativeBlurFilter");
                    Class<?> cls2 = Integer.TYPE;
                    cls.getDeclaredMethod("iterativeBoxBlur", Bitmap.class, cls2, cls2).invoke(cls, bitmapDecodeByteArray, Integer.valueOf(i), Integer.valueOf(i2));
                    return bitmapDecodeByteArray;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("NativeBlurFilter deal failed! ");
                    sbLIZ3.append(e3.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ3);
                    interfaceC821570WKt.LIZ();
                    return bitmapDecodeByteArray;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getBlurhashBitmap deal failed! ");
                sbLIZ4.append(th.getMessage());
                C2188811AlT.LIZIZ(sbLIZ4);
                interfaceC821570WKt.LIZ();
                return null;
            }
        } catch (UnsupportedEncodingException e4) {
            TryCatchGuardChecker.doCheck(e4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("getBlurhashBitmap deal failed! UnsupportedEncodingException ");
            sbLIZ5.append(e4.getMessage());
            C2188811AlT.LIZIZ(sbLIZ5);
            interfaceC821570WKt.LIZ();
            return null;
        }
    }
}
