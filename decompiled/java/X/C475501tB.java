package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.01tB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C475501tB {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        String strLJIJI = C08QA.LJIJI(c0vsj);
        String parent = c0vsj.getParent();
        if (parent == null) {
            parent = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(parent);
        sbLIZ.append('/');
        sbLIZ.append(strLJIJI);
        sbLIZ.append("_compressed_");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".jpg");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Bitmap LIZJ(String str) throws Throwable {
        try {
            C0VSP c0vsp = new C0VSP(str);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c0vsp);
                C2107108Nh.LIZ(c0vsp, null);
                return bitmapDecodeStream;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsp, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error loading sampled bitmap: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
    }

    public static boolean LIZ(Bitmap bitmap, int i, String str) throws Throwable {
        C0VSJ c0vsj = new C0VSJ(str);
        try {
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            C0VSV c0vsv = new C0VSV(c0vsj);
            Throwable th = null;
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i, c0vsv);
                C2107108Nh.LIZ(c0vsv, null);
                return true;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsv, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error saving compressed image: ");
            sbLIZ.append(e.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
    }
}
