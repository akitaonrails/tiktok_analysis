package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.08wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2279508wT {
    public static final /* synthetic */ int LIZ = 0;

    public static final Bitmap LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        byte[] bArrDecode = Base64.decode(str, 0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
        if (bitmapDecodeByteArray == null) {
            return null;
        }
        return bitmapDecodeByteArray;
    }

    public static String LIZIZ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(simpleDateFormat.format(time));
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZJ(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CutoutImageHelper#saveImageBitmap failed. Msg:");
            sbLIZ.append(th.getMessage());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.graphics.Bitmap] */
    public static final C0VSJ LIZLLL(CreativeInfo creativeInfo, Bitmap bitmap, Bitmap.CompressFormat compressFormat) throws Throwable {
        String strLIZIZ;
        ?? r1;
        BufferedOutputStream bufferedOutputStream = null;
        if (bitmap == 0) {
            return null;
        }
        String strLJJJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJI(creativeInfo, "");
        if (!new C0VSJ(strLJJJI).exists()) {
            new C0VSJ(strLJJJI).mkdirs();
        }
        if (compressFormat == Bitmap.CompressFormat.PNG) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C570490MZb.LIZJ(strLJJJI));
            sbLIZ.append(LIZIZ(".png"));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            r1 = sbLIZ;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C570490MZb.LIZJ(strLJJJI));
            sbLIZ2.append(LIZIZ(".jpg"));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            r1 = sbLIZ2;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        try {
            try {
                try {
                    if (!bitmap.isRecycled()) {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new C0VSV(c0vsj));
                        try {
                            bitmap.compress(compressFormat, 80, bufferedOutputStream2);
                            bufferedOutputStream2.flush();
                            LIZJ(bufferedOutputStream2);
                        } catch (Exception e) {
                            e = e;
                            bufferedOutputStream = bufferedOutputStream2;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("CutoutImageHelper#saveImageBitmap failed. Msg:");
                            sbLIZ3.append(e.getMessage());
                            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                            LIZJ(bufferedOutputStream);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    LIZJ(r1);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
            return c0vsj;
        } catch (Throwable th2) {
            th = th2;
            r1 = bufferedOutputStream;
            TryCatchGuardChecker.doCheck(th);
            LIZJ(r1);
            throw th;
        }
    }
}
