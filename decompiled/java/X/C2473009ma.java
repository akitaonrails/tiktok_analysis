package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2473009ma {
    public static final C2473009ma LIZ = new C2473009ma();

    public static boolean LJI(String str) {
        String scheme;
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                scheme = uri.getScheme();
            } else {
                scheme = null;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (Intrinsics.LJFF("content", scheme)) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(File file) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file.getAbsolutePath());
        sbLIZ.append("_rename_to_tmp_when_");
        sbLIZ.append(System.currentTimeMillis());
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        if (file.exists() && !c0vsj.exists() && file.renameTo(c0vsj)) {
            return c0vsj.delete();
        }
        return file.delete();
    }

    public static void LIZ(File file, C0VSJ c0vsj) throws Throwable {
        if ((c0vsj.exists() || c0vsj.mkdirs()) && file.exists() && file.listFiles() != null && file.listFiles().length != 0) {
            C089E c089e = new C089E(file.listFiles());
            while (c089e.hasNext()) {
                File file2 = (File) c089e.next();
                C0VSJ c0vsj2 = new C0VSJ(c0vsj.getAbsolutePath(), file2.getName());
                if (file2.isFile()) {
                    C09BH.LJIIIIZZ(c0vsj2, C09BH.LJ(file2));
                } else if (!c0vsj2.exists() && !c0vsj2.mkdir()) {
                    return;
                } else {
                    LIZ(file2, c0vsj2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[Catch: IOException -> 0x002f, TRY_LEAVE, TryCatch #0 {IOException -> 0x002f, blocks: (B:6:0x0009, B:8:0x000f, B:10:0x001a, B:11:0x0027), top: B:17:0x0009 }] */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, android.media.ExifInterface] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.ExifInterface LIZJ(android.content.Context r3, java.lang.String r4) throws java.lang.Throwable {
        /*
            if (r3 != 0) goto L4
            r0 = 0
            return r0
        L4:
            X.00zU r2 = new X.00zU
            r2.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.io.IOException -> L2f
            r0 = 24
            if (r1 < r0) goto L27
            X.09ma r0 = X.C2473009ma.LIZ     // Catch: java.io.IOException -> L2f
            r0.getClass()     // Catch: java.io.IOException -> L2f
            boolean r0 = LJI(r4)     // Catch: java.io.IOException -> L2f
            if (r0 == 0) goto L27
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r4)     // Catch: java.io.IOException -> L2f
            X.09mb r0 = new X.09mb     // Catch: java.io.IOException -> L2f
            r0.<init>()     // Catch: java.io.IOException -> L2f
            LIZLLL(r3, r1, r0)     // Catch: java.io.IOException -> L2f
            goto L33
        L27:
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch: java.io.IOException -> L2f
            r0.<init>(r4)     // Catch: java.io.IOException -> L2f
            r2.element = r0     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L33:
            T r0 = r2.element
            android.media.ExifInterface r0 = (android.media.ExifInterface) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2473009ma.LIZJ(android.content.Context, java.lang.String):android.media.ExifInterface");
    }

    public static MediaMetadataRetriever LJ(Context context, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            if (LJI(str)) {
                mediaMetadataRetriever.setDataSource(context, UriProtector.parse(str));
                return mediaMetadataRetriever;
            }
            mediaMetadataRetriever.setDataSource(str);
            return mediaMetadataRetriever;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return mediaMetadataRetriever;
        }
    }

    public static boolean LJFF(Context context, String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (LJI(str)) {
            Uri uri = UriProtector.parse(str);
            if (context != null) {
                try {
                    AssetFileDescriptor assetFileDescriptorLIZIZ = C09NT.LIZIZ(context.getContentResolver(), uri, "r");
                    if (assetFileDescriptorLIZIZ != null) {
                        try {
                            assetFileDescriptorLIZIZ.close();
                            return true;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return true;
                        }
                    }
                    return false;
                } catch (FileNotFoundException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return false;
                }
            }
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.isFile() && c0vsj.exists() && c0vsj.length() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LJII(String str, boolean z) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists()) {
            if (c0vsj.isDirectory()) {
                return true;
            }
            if (!z || LJIIIIZZ(c0vsj)) {
                return false;
            }
        }
        return c0vsj.mkdirs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static Bitmap LIZIZ(Context context, BitmapFactory.Options options, String str) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptorLIZLLL;
        Unit unit;
        Bitmap bitmapDecodeFileDescriptor;
        boolean z;
        Unit unit2 = null;
        Bitmap bitmapDecodeFile = null;
        Unit unit3 = null;
        if (context == null) {
            return null;
        }
        boolean z2 = false;
        if (str != null) {
            parcelFileDescriptor = 1;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            return null;
        }
        try {
            if (LJI(str)) {
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    if (contentResolver != null) {
                        parcelFileDescriptorLIZLLL = C09NT.LIZLLL(contentResolver, Uri.parse(str), "r");
                    } else {
                        parcelFileDescriptorLIZLLL = null;
                    }
                    if (parcelFileDescriptorLIZLLL != null) {
                        try {
                            bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(parcelFileDescriptorLIZLLL.getFileDescriptor(), null, options);
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            if (parcelFileDescriptorLIZLLL == null) {
                                unit = null;
                            } else {
                                try {
                                    parcelFileDescriptorLIZLLL.close();
                                    unit = Unit.LIZ;
                                } catch (Throwable th) {
                                    return null;
                                }
                            }
                            C189200o6.m2constructorimpl(unit);
                            return null;
                        }
                    } else {
                        bitmapDecodeFileDescriptor = null;
                    }
                    if (parcelFileDescriptorLIZLLL != null) {
                        try {
                            parcelFileDescriptorLIZLLL.close();
                            unit3 = Unit.LIZ;
                        } catch (Throwable th2) {
                            return bitmapDecodeFileDescriptor;
                        }
                    }
                    C189200o6.m2constructorimpl(unit3);
                    return bitmapDecodeFileDescriptor;
                } catch (Exception e2) {
                    e = e2;
                    parcelFileDescriptorLIZLLL = null;
                } catch (Throwable th3) {
                    th = th3;
                    parcelFileDescriptor = 0;
                    TryCatchGuardChecker.doCheck(th);
                    if (parcelFileDescriptor != 0) {
                        try {
                            parcelFileDescriptor.close();
                            unit2 = Unit.LIZ;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    C189200o6.m2constructorimpl(unit2);
                    throw th;
                }
            } else {
                try {
                    bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
                    return bitmapDecodeFile;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return bitmapDecodeFile;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0033: MOVE (r3 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:50331699), block:B:25:0x0033 */
    public static void LIZLLL(Context context, Uri uri, Function1 function1) throws Throwable {
        ParcelFileDescriptor parcelFileDescriptorLIZLLL;
        ParcelFileDescriptor parcelFileDescriptor;
        FileDescriptor fileDescriptor;
        if (context == null) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        try {
            try {
                try {
                    parcelFileDescriptorLIZLLL = C09NT.LIZLLL(context.getContentResolver(), uri, "r");
                    if (parcelFileDescriptorLIZLLL == null) {
                        fileDescriptor = null;
                    } else {
                        try {
                            fileDescriptor = parcelFileDescriptorLIZLLL.getFileDescriptor();
                        } catch (IOException e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            function1.invoke(null);
                            if (parcelFileDescriptorLIZLLL == null) {
                                return;
                            }
                        }
                    }
                    function1.invoke(fileDescriptor);
                } catch (Throwable th) {
                    th = th;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    TryCatchGuardChecker.doCheck(th);
                    if (parcelFileDescriptor2 != null) {
                        try {
                            parcelFileDescriptor2.close();
                            throw th;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                parcelFileDescriptorLIZLLL = null;
            }
            if (parcelFileDescriptorLIZLLL != null) {
                try {
                    parcelFileDescriptorLIZLLL.close();
                } catch (IOException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
