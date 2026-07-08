package com.bef.effectsdk;

import X.C2188811AlT;
import X.C786410Ut5;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: loaded from: classes21.dex */
public class OpenGLUtils {
    public static final String FAIL_RES = C786410Ut5.k4(Locale.US, "{%s: false}", new Object[]{"\"res\""});

    public static int getExternalOESTextureID() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static void saveBitmap(Bitmap bitmap, String str) {
    }

    public static void checkGlError(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": glError 0x");
        sbLIZ.append(Integer.toHexString(iGlGetError));
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap loadBitmap(java.lang.String r4) throws java.lang.Throwable {
        /*
            r3 = 0
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L31
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L31
            r0.<init>(r4)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L31
            r2.<init>(r0)     // Catch: java.lang.Exception -> L1b java.lang.Throwable -> L31
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r2)     // Catch: java.lang.Exception -> L19 java.lang.Throwable -> L2b
            r2.close()     // Catch: java.io.IOException -> L13
            goto L18
        L13:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r1
        L18:
            return r1
        L19:
            r0 = move-exception
            goto L1d
        L1b:
            r0 = move-exception
            r2 = r3
        L1d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L2a
            r2.close()     // Catch: java.io.IOException -> L26
            return r3
        L26:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L2a:
            return r3
        L2b:
            r1 = move-exception
            r3 = r2
        L2d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r1 = move-exception
            goto L2d
        L33:
            if (r3 == 0) goto L3d
            r3.close()     // Catch: java.io.IOException -> L39
            throw r1
        L39:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.OpenGLUtils.loadBitmap(java.lang.String):android.graphics.Bitmap");
    }

    public static String loadTexture(String str) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null) {
            return FAIL_RES;
        }
        return C786410Ut5.k4(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", new Object[]{"\"res\"", "\"width\"", Integer.valueOf(bitmapDecodeFile.getWidth()), "\"height\"", Integer.valueOf(bitmapDecodeFile.getHeight()), "\"textureId\"", Integer.valueOf(loadTexture(bitmapDecodeFile, -1, false))});
    }

    public static int loadProgram(String str, String str2) {
        int iLoadShader;
        int[] iArr = new int[1];
        int iLoadShader2 = loadShader(str, 35633);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(str2, 35632)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            return 0;
        }
        GLES20.glDeleteShader(iLoadShader2);
        GLES20.glDeleteShader(iLoadShader);
        return iGlCreateProgram;
    }

    public static int loadShader(String str, int i) {
        int[] iArr = new int[1];
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        return iGlCreateShader;
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        return loadTexture(bitmap, i, false);
    }

    public static int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    public static Bitmap loadBitmap(FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        FileInputStream fileInputStreamCreateInputStream = new AssetFileDescriptor(ParcelFileDescriptor.dup(fileDescriptor), j, j2).createInputStream();
        try {
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStreamCreateInputStream);
            fileInputStreamCreateInputStream.close();
            return bitmapDecodeStream;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            fileInputStreamCreateInputStream.close();
            throw th;
        }
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        return iArr[0];
    }

    public static void byte2Bitmap(byte[] bArr, int i, int i2, String str) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(-16776961);
        bitmapCreateBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        saveBitmap(bitmapCreateBitmap, str);
    }

    public static int initEffectTexture(int i, int i2, int[] iArr, int i3) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i3, iArr[0]);
        GLES20.glTexParameterf(i3, 10240, 9729.0f);
        GLES20.glTexParameterf(i3, 10241, 9729.0f);
        GLES20.glTexParameterf(i3, 10242, 33071.0f);
        GLES20.glTexParameterf(i3, 10243, 33071.0f);
        GLES20.glTexImage2D(i3, 0, 6408, i, i2, 0, 6408, 5121, null);
        return iArr[0];
    }

    public static Bitmap loadBitmap(byte[] bArr, int i, int i2, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPremultiplied = z;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        if (bitmapDecodeByteArray != null) {
            Bitmap.Config config = bitmapDecodeByteArray.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            if (config != config2) {
                return bitmapDecodeByteArray.copy(config2, true);
            }
            return bitmapDecodeByteArray;
        }
        return bitmapDecodeByteArray;
    }
}
