package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: X.0W49, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W49 {
    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static File LIZLLL(Context context) {
        File fileW2 = C786410Ut5.w2(context);
        if (fileW2 == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(".font");
        sbLIZ.append(Process.myPid());
        sbLIZ.append("-");
        sbLIZ.append(Process.myTid());
        sbLIZ.append("-");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (int i = 0; i < 100; i++) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(i);
            File file = new File(fileW2, C2188811AlT.LIZIZ(sbLIZ2));
            try {
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static boolean LIZJ(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i != -1) {
                    fileOutputStream.write(bArr, 0, i);
                } else {
                    LIZ(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            TryCatchGuardChecker.doCheck(e);
            LIZ(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            TryCatchGuardChecker.doCheck(th);
            LIZ(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static ByteBuffer LJ(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorL4 = C786410Ut5.l4(context.getContentResolver(), uri);
            if (parcelFileDescriptorL4 == null) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorL4.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorL4.close();
                    return map;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                try {
                    parcelFileDescriptorL4.close();
                } catch (Throwable th4) {
                    TryCatchGuardChecker.doCheck(th4);
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    public static boolean LIZIZ(File file, Resources resources, int i) throws Throwable {
        try {
            try {
                InputStream inputStreamOpenRawResource = resources.openRawResource(i);
                boolean zLIZJ = LIZJ(file, inputStreamOpenRawResource);
                LIZ(inputStreamOpenRawResource);
                return zLIZJ;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                LIZ(resources);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resources = 0;
            TryCatchGuardChecker.doCheck(th);
            LIZ(resources);
            throw th;
        }
    }
}
