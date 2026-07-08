package X;

import android.graphics.Bitmap;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Whi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830320Whi {
    public static final C830320Whi LIZ = new C830320Whi();
    public static boolean LIZIZ;

    public static String LIZ(Exception exc) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("className ");
        sbLIZ.append(exc.getClass());
        sbLIZ.append(" cause ");
        sbLIZ.append(exc.getCause());
        sbLIZ.append(" message ");
        sbLIZ.append(exc.getMessage());
        sbLIZ.append(" stackTrace ");
        sbLIZ.append(Log.getStackTraceString(exc));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZJ(Bitmap bitmap, String str, String str2, boolean z) throws Throwable {
        if (!Intrinsics.LJFF("mounted", C786410Ut5.X3())) {
            LIZIZ(this, bitmap, null, "not mounted", null, z, 10);
            C2344809Gs.LIZLLL(6, "saveBitmapToSD", "not mounted");
            return false;
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists() && !c0vsj.mkdirs()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mkdirs canRead: ");
            sbLIZ.append(c0vsj.canRead());
            sbLIZ.append(" canWrite: ");
            sbLIZ.append(c0vsj.canWrite());
            sbLIZ.append(" freeSpace: ");
            sbLIZ.append(c0vsj.getFreeSpace());
            LIZIZ(this, bitmap, C2188811AlT.LIZIZ(sbLIZ), null, null, z, 12);
            C2344809Gs.LIZLLL(6, "saveBitmapToSD", "mkdirs fails");
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c0vsj.getPath());
        sbLIZ2.append('/');
        sbLIZ2.append(str2);
        C0VSJ c0vsj2 = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2));
        try {
            if (!c0vsj2.exists() && !c0vsj2.createNewFile()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("createNewFile canRead: ");
                sbLIZ3.append(c0vsj2.canRead());
                sbLIZ3.append(" canWrite: ");
                sbLIZ3.append(c0vsj2.canWrite());
                sbLIZ3.append(" freeSpace: ");
                sbLIZ3.append(c0vsj2.getFreeSpace());
                LIZIZ(this, bitmap, C2188811AlT.LIZIZ(sbLIZ3), null, null, z, 12);
                C2344809Gs.LIZLLL(6, "saveBitmapToSD", "createNewFile fails");
                return false;
            }
            C0VSV c0vsv = new C0VSV(c0vsj2);
            try {
                try {
                    try {
                        boolean zCompress = bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
                        if (!zCompress) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("compressResult freeSpace: ");
                            sbLIZ4.append(c0vsj2.getFreeSpace());
                            LIZIZ(this, bitmap, C2188811AlT.LIZIZ(sbLIZ4), null, null, z, 12);
                            C2344809Gs.LIZLLL(6, "saveBitmapToSD", "compress fails");
                        }
                        c0vsv.flush();
                        try {
                            c0vsv.close();
                            return zCompress;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C2344809Gs.LIZ(e);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("fileOutputStream close Exception freeSpace: ");
                            sbLIZ5.append(c0vsj2.getFreeSpace());
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("fileOutputStream close Exception ");
                            sbLIZ6.append(LIZ(e));
                            LIZIZ(this, bitmap, strLIZIZ, null, C2188811AlT.LIZIZ(sbLIZ6), z, 4);
                            return zCompress;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        C2344809Gs.LIZ(e2);
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("compressResult Exception freeSpace: ");
                        sbLIZ7.append(c0vsj2.getFreeSpace());
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                        sbLIZ8.append("compressResult Exception ");
                        sbLIZ8.append(LIZ(e2));
                        LIZIZ(this, bitmap, strLIZIZ2, null, C2188811AlT.LIZIZ(sbLIZ8), z, 4);
                        try {
                            c0vsv.close();
                            return false;
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            C2344809Gs.LIZ(e3);
                            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                            sbLIZ9.append("fileOutputStream close Exception freeSpace: ");
                            sbLIZ9.append(c0vsj2.getFreeSpace());
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ9);
                            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                            sbLIZ10.append("fileOutputStream close Exception ");
                            sbLIZ10.append(LIZ(e3));
                            LIZIZ(this, bitmap, strLIZIZ3, null, C2188811AlT.LIZIZ(sbLIZ10), z, 4);
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                c0vsv.close();
                                throw th;
                            } catch (Exception e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                C2344809Gs.LIZ(e4);
                                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                                sbLIZ11.append("fileOutputStream close Exception freeSpace: ");
                                sbLIZ11.append(c0vsj2.getFreeSpace());
                                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ11);
                                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                                sbLIZ12.append("fileOutputStream close Exception ");
                                sbLIZ12.append(LIZ(e4));
                                LIZIZ(this, bitmap, strLIZIZ4, null, C2188811AlT.LIZIZ(sbLIZ12), z, 4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    TryCatchGuardChecker.doCheck(th);
                    c0vsv.close();
                    throw th;
                }
            }
        } catch (Exception e5) {
            TryCatchGuardChecker.doCheck(e5);
            C2344809Gs.LIZ(e5);
            StringBuilder sbLIZ13 = C2188811AlT.LIZ();
            sbLIZ13.append("createNewFile Exception canRead: ");
            sbLIZ13.append(c0vsj2.canRead());
            sbLIZ13.append(" canWrite: ");
            sbLIZ13.append(c0vsj2.canWrite());
            sbLIZ13.append(" freeSpace: ");
            sbLIZ13.append(c0vsj2.getFreeSpace());
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ13);
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("createNewFile Exception ");
            sbLIZ14.append(LIZ(e5));
            LIZIZ(this, bitmap, strLIZIZ5, null, C2188811AlT.LIZIZ(sbLIZ14), z, 4);
            return false;
        }
    }

    public static void LIZIZ(C830320Whi c830320Whi, Bitmap bitmap, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            bitmap = null;
        }
        String str4 = "";
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            z = true;
        }
        c830320Whi.getClass();
        if (bitmap != null) {
            str4 = "width: " + bitmap.getWidth() + " height: " + bitmap.getHeight() + " config: " + bitmap.getConfig() + " byteCount: " + bitmap.getByteCount() + " allocationByteCount: " + bitmap.getAllocationByteCount() + " density: " + bitmap.getDensity() + " generationId: " + bitmap.getGenerationId() + " isMutable: " + bitmap.isMutable() + " isPremultiplied: " + bitmap.isPremultiplied() + " isRecycled: " + bitmap.isRecycled() + " rowBytes: " + bitmap.getRowBytes() + " ninePatchChunk: " + bitmap.getNinePatchChunk();
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bitmapMsg: ");
        sbLIZ.append(str4);
        sbLIZ.append(" fileMsg: ");
        sbLIZ.append(str);
        sbLIZ.append(" mediaMountedMsg: ");
        sbLIZ.append(str2);
        sbLIZ.append(" exceptionMsg: ");
        sbLIZ.append(str3);
        C1720106oR.LIZ("saveBitmapToSD", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            C1232140iAW.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("bitmap_msg", str4);
            c2344009Gk.LJIIIIZZ("file_msg", str);
            c2344009Gk.LJIIIIZZ("media_mounted_msg", str2);
            c2344009Gk.LJIIIIZZ("exception", str3);
            c2344009Gk.LJ(Boolean.TRUE, "hasClean");
            C20684815ws.LJIILLIIL("crop_fail", c2344009Gk.LIZ);
        }
    }
}
