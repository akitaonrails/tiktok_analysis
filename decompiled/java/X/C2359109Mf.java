package X;

import android.app.Activity;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.io.BufferedOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.09Mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2359109Mf {
    public static final C2359109Mf LIZ = new C2359109Mf();
    public static final ConcurrentHashMap<String, C2360009Mo> LIZIZ = new ConcurrentHashMap<>();

    public static String LIZIZ(String str) throws Throwable {
        boolean z;
        boolean z2;
        String string;
        boolean z3 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "image";
        }
        if (u.LJJIIJZLJL(str, "content://", false)) {
            String str2 = null;
            try {
                C844470XAv.LIZ.getClass();
                Cursor cursorLJJJ = C2204961BRm.LJJJ(C844470XAv.LIZ().getContentResolver(), UriProtector.parse(str), null, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqnatHN0z9MXzXHQyjT2jLwq5+hMARuxD1aSvREKYpGrURdaAmLmg==", null));
                if (cursorLJJJ != null) {
                    if (cursorLJJJ.moveToFirst()) {
                        try {
                            string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            string = null;
                        }
                        cursorLJJJ.close();
                        str2 = string;
                    } else {
                        string = null;
                        cursorLJJJ.close();
                        str2 = string;
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (str2 != null && str2.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                str = str2;
            }
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        String str3 = options.outMimeType;
        if (str3 != null && str3.length() != 0) {
            z3 = false;
        }
        if (z3) {
            return "image";
        }
        return options.outMimeType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static String LIZ(Activity activity, String str) throws Throwable {
        boolean z;
        Bitmap bitmapCreateBitmap;
        String str2;
        File fileCreateTempFile;
        ?? r2;
        BufferedOutputStream bufferedOutputStream;
        C2215208m6 c2215208m6LIZ;
        Bitmap bitmapLIZJ = LIZJ(activity, str);
        String absolutePath = null;
        if (bitmapLIZJ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("convertToPng bitmap is null, mimeType=");
            sbLIZ.append(LIZIZ(str));
            C2188811AlT.LIZIZ(sbLIZ);
            return null;
        }
        int width = bitmapLIZJ.getWidth();
        int height = bitmapLIZJ.getHeight();
        boolean z2 = true;
        String strLIZIZ = null;
        if ((width & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if ((height & 1) != 1) {
            z2 = false;
        }
        if (!z && !z2) {
            bitmapCreateBitmap = bitmapLIZJ;
        } else {
            if (z) {
                width--;
            }
            if (z2) {
                height--;
            }
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapLIZJ, 0, 0, width, height);
                bitmapLIZJ.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                bitmapCreateBitmap = null;
            }
        }
        if (bitmapCreateBitmap == null) {
            return null;
        }
        try {
            String str3 = new SimpleDateFormat("yyyy-MMdd_HHmmss", Locale.ENGLISH).format(new Date());
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Dou_fsm_");
            sbLIZ2.append(str3);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c2215208m6LIZ = C2359009Me.LIZ();
            str2 = strLIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            str2 = strLIZIZ;
        }
        if (c2215208m6LIZ != null) {
            fileCreateTempFile = File.createTempFile(strLIZIZ, ".png", c2215208m6LIZ);
            r2 = strLIZIZ;
        } else {
            fileCreateTempFile = null;
            r2 = str2;
        }
        try {
            if (fileCreateTempFile == null) {
                return null;
            }
            try {
                bufferedOutputStream = new BufferedOutputStream(new C0VSV(fileCreateTempFile));
                try {
                    boolean zCompress = bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
                    bufferedOutputStream.flush();
                    if (zCompress) {
                        absolutePath = fileCreateTempFile.getAbsolutePath();
                    }
                    C1319770kRr.LIZJ(bufferedOutputStream);
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    C1319770kRr.LIZJ(bufferedOutputStream);
                    if (bitmapCreateBitmap != bitmapLIZJ) {
                    }
                    return absolutePath;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                r2 = 0;
                TryCatchGuardChecker.doCheck(th);
                C1319770kRr.LIZJ(r2);
                if (bitmapCreateBitmap != bitmapLIZJ) {
                    bitmapCreateBitmap.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                }
                throw th;
            }
            if (bitmapCreateBitmap != bitmapLIZJ) {
                bitmapCreateBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
            }
            return absolutePath;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap LIZJ(Activity activity, String str) {
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C259800zU c259800zU = new C259800zU();
            if (!u.LJJIIJZLJL(str, "content://", false) && !u.LJJIIJZLJL(str, "file://", false)) {
                str = Uri.fromFile(new C0VSJ(str)).toString();
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LIZJ = activity;
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LJJII(new C2501909rF(c259800zU, countDownLatch, 2));
            countDownLatch.await(10L, TimeUnit.SECONDS);
            return (Bitmap) c259800zU.element;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
