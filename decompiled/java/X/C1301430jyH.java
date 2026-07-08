package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.Krypton;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.Thread;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301430jyH {
    public static volatile Executor LIZ;

    public static Executor LJ() {
        Executor executorE4;
        if (LIZ == null) {
            synchronized (C1301430jyH.class) {
                try {
                    if (LIZ == null) {
                        try {
                            executorE4 = C786410Ut5.e4(3, new ThreadFactory() { // from class: X.0jyc
                                public final /* synthetic */ String LLILLJJLI = "krypton-brief-resource-thread";
                                public final /* synthetic */ int LLILLL = 5;
                                public final AtomicInteger LL = new AtomicInteger(1);

                                @Override // java.util.concurrent.ThreadFactory
                                public final Thread newThread(Runnable runnable) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(this.LLILLJJLI);
                                    sbLIZ.append("-");
                                    sbLIZ.append(this.LL.getAndIncrement());
                                    BPEAThread bPEAThread = new BPEAThread(runnable, C2188811AlT.LIZIZ(sbLIZ));
                                    if (bPEAThread.isDaemon()) {
                                        bPEAThread.setDaemon(false);
                                    }
                                    ThreadMethodProxy.setPriority(bPEAThread, this.LLILLL);
                                    bPEAThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: X.0jyb
                                        @Override // java.lang.Thread.UncaughtExceptionHandler
                                        public final void uncaughtException(Thread thread, Throwable th) {
                                            C1288370jdD.LIZIZ("KryptonResourceUtils", th.toString());
                                        }
                                    });
                                    return bPEAThread;
                                }
                            });
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C1288370jdD.LIZIZ("KryptonResourceUtils", th.toString());
                            executorE4 = new Executor() { // from class: X.0jyJ
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                }
                            };
                        }
                        LIZ = executorE4;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return LIZ;
    }

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to close resource: ");
                sbLIZ.append(e.getMessage());
                C1288370jdD.LIZIZ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public static Bitmap LIZIZ(String str) {
        if (LJIIJ(str) == EnumC1301440jyI.DATAURI) {
            byte[] bArrDecode = Base64.decode(str.substring(str.indexOf("base64,") + 7), 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Call decodeBase64Image with invalid path");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static byte[] LIZJ(String str) {
        EnumC1301440jyI enumC1301440jyILJIIJ = LJIIJ(str);
        if (enumC1301440jyILJIIJ == EnumC1301440jyI.DATAURI) {
            return Base64.decode(str.substring(str.indexOf("base64,") + 7), 0);
        }
        if (enumC1301440jyILJIIJ == EnumC1301440jyI.EMPTY) {
            throw new IllegalArgumentException("Call decodeBase64DataUrl with empty path!");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Call decodeBase64DataUrl with invalid path: ");
        sbLIZ.append(LJFF(str));
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LJFF(String str) {
        int length = str.length();
        if (length > 500) {
            length = 500;
        }
        return str.substring(0, length);
    }

    public static boolean LJI(String str) {
        if (LJIIJ(str) == EnumC1301440jyI.DATAURI) {
            return true;
        }
        return false;
    }

    public static boolean LJII(byte[] bArr) {
        if (bArr.length >= 12 && bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
            String str = new String(bArr, 8, 4);
            if (str.equals("heic") || str.equals("heix") || str.equals("heim") || str.equals("heis") || str.equals("mif1") || str.equals("msf1")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LJIIIIZZ(String str) {
        if (LJIIJ(str) == EnumC1301440jyI.LOCAL) {
            return true;
        }
        return false;
    }

    public static InputStream LJIIIZ(String str) {
        if (LJIIJ(str) != EnumC1301440jyI.LOCAL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The url is not a local path: ");
            sbLIZ.append(str);
            C1288370jdD.LIZIZ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        try {
            Context context = Krypton.LIZIZ().LIZIZ;
            if (str.startsWith("asset:///") && str.length() > 9) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Load resource from asset: ");
                sbLIZ2.append(str);
                C1288370jdD.LIZJ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ2));
                return context.getAssets().open(str.substring(9));
            }
            if (str.startsWith("res:///") && str.length() > 7) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Load resource from res: ");
                sbLIZ3.append(str);
                C1288370jdD.LIZJ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ3));
                return context.getResources().openRawResource(C786410Ut5.n3(context.getResources(), str.substring(7), "drawable", context.getPackageCodePath()));
            }
            if (str.startsWith("file://") && str.length() > 7) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Load resource from file: ");
                sbLIZ4.append(str);
                C1288370jdD.LIZJ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ4));
                String strSubstring = str.substring(7);
                if (!strSubstring.startsWith("/")) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("/");
                    sbLIZ5.append(strSubstring);
                    strSubstring = C2188811AlT.LIZIZ(sbLIZ5);
                }
                return new C0VSP(new C0VSJ(strSubstring));
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("the url is not available local path: ");
            sbLIZ6.append(str);
            C1288370jdD.LIZIZ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ6));
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Load stream from resource failed, the resource path is: ");
            sbLIZ7.append(str);
            sbLIZ7.append(" with error: ");
            sbLIZ7.append(e.getMessage());
            C1288370jdD.LIZIZ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ7));
            return null;
        }
    }

    public static EnumC1301440jyI LJIIJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return EnumC1301440jyI.EMPTY;
        }
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            if (!str.startsWith("asset:///") && !str.startsWith("res:///") && !str.startsWith("file://")) {
                if (str.startsWith("content://")) {
                    return EnumC1301440jyI.CONTENT;
                }
                if (str.startsWith("data:") && str.contains("base64,")) {
                    return EnumC1301440jyI.DATAURI;
                }
                return EnumC1301440jyI.INVALID;
            }
            return EnumC1301440jyI.LOCAL;
        }
        return EnumC1301440jyI.REMOTE;
    }

    public static byte[] LIZLLL(InputStream inputStream, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        boolean z = false;
        if (inputStream != null) {
            int i2 = 1024;
            if (i >= 1024) {
                i2 = 65536;
                if (i <= 65536) {
                    i2 = i;
                }
            }
            try {
                try {
                    byte[] bArr = new byte[i2];
                    C1288370jdD.LIZJ("KryptonResourceUtils", "Start read from stream...");
                    while (true) {
                        int i3 = inputStream.read(bArr, 0, i2);
                        if (i3 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i3);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("End read from stream, the total stream content is: ");
                    sbLIZ.append(i);
                    C1288370jdD.LIZJ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ));
                    LIZ(inputStream);
                    LIZ(byteArrayOutputStream);
                    z = true;
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to convert to byte array from LynxResResponse: ");
                    sbLIZ2.append(e.getMessage());
                    C1288370jdD.LIZIZ("KryptonResourceUtils", C2188811AlT.LIZIZ(sbLIZ2));
                    LIZ(inputStream);
                    LIZ(byteArrayOutputStream);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZ(inputStream);
                LIZ(byteArrayOutputStream);
                throw th;
            }
        } else {
            C1288370jdD.LIZIZ("KryptonResourceUtils", "Invalid input stream or output stream");
        }
        if (z) {
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }
}
