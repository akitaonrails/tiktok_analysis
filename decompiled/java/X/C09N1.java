package X;

import android.app.Application;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.09N1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09N1 {
    public static final C2215108m5 LIZ = C2215408m8.LIZ;

    public static File LIZ(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static long LJ(Context context) {
        if (Environment.getDataDirectory() != null) {
            try {
                StatFs statFs = new StatFs(LIZ(context).getParent());
                return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("diZqWQY7UcnZG14uCzCAQMxj1gbLqVjAtQ==", null)) * C2204961BRm.LLFF(statFs, new C0WZX("diZqWQY7UcnZG14uCzCAQMxj1gbLqVjAtQ==", null));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1L;
    }

    public static long LJI(Context context) {
        if (Environment.getDataDirectory() != null) {
            try {
                StatFs statFs = new StatFs(LIZ(context).getParent());
                return C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("diZqWQY7UcnZG14uCzCAQMxj1gbLqVjAtQ==", null)) * C2204961BRm.LLFZ(statFs, new C0WZX("diZqWQY7UcnZG14uCzCAQMxj1gbLqVjAtQ==", null));
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return -1L;
    }

    public static void LIZIZ(C0VSP c0vsp, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
            if (outputStream == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to copy input:");
                sbLIZ.append(c0vsp);
                sbLIZ.append("output:");
                sbLIZ.append(outputStream);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
            }
            while (true) {
                int i = c0vsp.read(bArr);
                if (i <= 0) {
                    outputStream.flush();
                    C09N0.LIZ(c0vsp);
                    C09N0.LIZIZ(outputStream);
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C09N0.LIZ(c0vsp);
            C09N0.LIZIZ(outputStream);
            throw th;
        }
    }

    public static void LIZJ(File file, C0VSV c0vsv) throws Throwable {
        LIZ.getClass();
        C2215208m6 c2215208m6LIZJ = C2215108m5.LIZJ(file);
        if (c2215208m6LIZJ.exists()) {
            if (c2215208m6LIZJ.length() != -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("begin to copy from->");
                sbLIZ.append(c2215208m6LIZJ);
                sbLIZ.append(" to->");
                sbLIZ.append(c0vsv.getFD());
                C2188811AlT.LIZIZ(sbLIZ);
                C0VSP c0vsp = null;
                try {
                    byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                    C0VSP c0vsp2 = new C0VSP(c2215208m6LIZJ);
                    while (true) {
                        try {
                            int i = c0vsp2.read(bArr);
                            if (i < 0) {
                                c0vsv.flush();
                                c0vsv.getFD().sync();
                                C09N0.LIZ(c0vsp2);
                                C09N0.LIZIZ(c0vsv);
                                return;
                            }
                            c0vsv.write(bArr, 0, i);
                        } catch (Throwable th) {
                            th = th;
                            c0vsp = c0vsp2;
                            TryCatchGuardChecker.doCheck(th);
                            C09N0.LIZ(c0vsp);
                            C09N0.LIZIZ(c0vsv);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Failed to copy from->");
                sbLIZ2.append(c2215208m6LIZJ);
                sbLIZ2.append(" to->");
                sbLIZ2.append(c0vsv.getFD());
                sbLIZ2.append(" fileLen=-1");
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Failed to copy from->");
            sbLIZ3.append(c2215208m6LIZJ);
            sbLIZ3.append("to->");
            sbLIZ3.append(c0vsv.getFD());
            sbLIZ3.append("because of srcFile not exist");
            throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static void LIZLLL(String str, String str2) throws Throwable {
        C0VSV c0vsv;
        C2215208m6 c2215208m6 = new C2215208m6(str);
        C2215208m6 c2215208m62 = new C2215208m6(str2);
        LIZ.getClass();
        C2215208m6 c2215208m6LIZJ = C2215108m5.LIZJ(c2215208m6);
        C2215208m6 c2215208m6LIZJ2 = C2215108m5.LIZJ(c2215208m62);
        if (c2215208m6LIZJ.exists()) {
            if (!c2215208m6LIZJ.getCanonicalPath().equals(c2215208m6LIZJ2.getCanonicalPath())) {
                if (c2215208m6LIZJ2.getParentFile() != null && !c2215208m6LIZJ2.getParentFile().exists() && !c2215208m6LIZJ2.getParentFile().mkdirs()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Failed to copy from->");
                    sbLIZ.append(c2215208m6LIZJ);
                    sbLIZ.append(" to->");
                    sbLIZ.append(c2215208m6LIZJ2);
                    sbLIZ.append(" because of dest parent mkdir failed");
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (c2215208m6LIZJ2.exists() && !c2215208m6LIZJ2.canWrite()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Failed to copy from->");
                    sbLIZ2.append(c2215208m6LIZJ);
                    sbLIZ2.append(" to->");
                    sbLIZ2.append(c2215208m6LIZJ2);
                    sbLIZ2.append("because of destFile cant write!");
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (c2215208m6LIZJ.length() != -1) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("begin to copy from->");
                    sbLIZ3.append(c2215208m6LIZJ);
                    sbLIZ3.append(" to->");
                    sbLIZ3.append(c2215208m6LIZJ2);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    C0VSP c0vsp = null;
                    C0VSV c0vsv2 = null;
                    try {
                        byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                        C0VSP c0vsp2 = new C0VSP(c2215208m6LIZJ);
                        try {
                            C0VSV c0vsv3 = new C0VSV(c2215208m6LIZJ2);
                            while (true) {
                                try {
                                    int i = c0vsp2.read(bArr);
                                    if (i < 0) {
                                        break;
                                    } else {
                                        c0vsv3.write(bArr, 0, i);
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    c0vsv2 = c0vsv3;
                                    c0vsv = c0vsv2;
                                    c0vsp = c0vsp2;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            C09N0.LIZ(c0vsp);
                                            C09N0.LIZIZ(c0vsv);
                                            throw th;
                                        } catch (Throwable th2) {
                                            th = th2;
                                        }
                                    }
                                }
                            }
                            c0vsv3.flush();
                            c0vsv3.getFD().sync();
                            C09N0.LIZ(c0vsp2);
                            C09N0.LIZIZ(c0vsv3);
                            if (c2215208m6LIZJ.length() == c2215208m6LIZJ2.length()) {
                                c2215208m6LIZJ2.setLastModified(c2215208m6LIZJ.lastModified());
                                return;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("Failed to copy full contents from->");
                            sbLIZ4.append(c2215208m6LIZJ);
                            sbLIZ4.append(" to->");
                            sbLIZ4.append(c2215208m6LIZJ2);
                            throw new IOException(C2188811AlT.LIZIZ(sbLIZ4));
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c0vsv = null;
                    }
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Failed to copy from->");
                    sbLIZ5.append(c2215208m6LIZJ);
                    sbLIZ5.append(" to->");
                    sbLIZ5.append(c2215208m6LIZJ2);
                    sbLIZ5.append(" fileLen=-1");
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ5));
                }
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("Failed to copy same path from->");
                sbLIZ6.append(c2215208m6LIZJ);
                sbLIZ6.append(" to->");
                sbLIZ6.append(c2215208m6LIZJ2);
                throw new IOException(C2188811AlT.LIZIZ(sbLIZ6));
            }
        } else {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("Failed to copy from->");
            sbLIZ7.append(c2215208m6LIZJ);
            sbLIZ7.append("to->");
            sbLIZ7.append(c2215208m6LIZJ2);
            sbLIZ7.append("because of srcFile not exist");
            throw new FileNotFoundException(C2188811AlT.LIZIZ(sbLIZ7));
        }
    }

    public static InputStream LJFF(Context context, Uri uri) {
        Uri contentUri;
        if (uri == null) {
            return null;
        }
        String scheme = uri.getScheme();
        if (!TextUtils.isEmpty(scheme) && !"file".equals(scheme)) {
            if (DocumentsContract.isDocumentUri(context, uri) && TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str = strArrSplit[0];
                if (TextUtils.equals("image", str)) {
                    contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    if (C09N0.LIZLLL()) {
                        contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                    }
                } else if (TextUtils.equals("video", str)) {
                    contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    if (C09N0.LIZLLL()) {
                        contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                    }
                } else if (TextUtils.equals("audio", str)) {
                    contentUri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    if (C09N0.LIZLLL()) {
                        contentUri = MediaStore.Audio.Media.getContentUri("external_primary");
                    }
                } else {
                    contentUri = null;
                }
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    return null;
                }
                return C09NT.LJ(context.getContentResolver(), ContentUris.withAppendedId(contentUri, CastLongProtector.parseLong(strArrSplit[1])));
            }
            if ("content".equals(scheme) && "media".equals(uri.getAuthority())) {
                return C09NT.LJ(context.getContentResolver(), uri);
            }
            String strLIZ = C09N5.LIZ(context, uri);
            if (TextUtils.isEmpty(strLIZ) || !new C0VSJ(strLIZ).exists()) {
                return null;
            }
            return new C0VSP(new C0VSJ(strLIZ));
        }
        return new C0VSP(uri.getPath());
    }
}
