package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.09n5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2476109n5 {
    public static final C2476109n5 LIZ = new C2476109n5();

    public static Bitmap LIZ(Context context, Bitmap bitmap) {
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bitmapCopy);
        C2476209n6 c2476209n6 = new C2476209n6(context);
        c2476209n6.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        c2476209n6.layout(0, 0, c2476209n6.getMeasuredWidth(), c2476209n6.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c2476209n6.getMeasuredWidth(), c2476209n6.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        c2476209n6.draw(new Canvas(bitmapCreateBitmap));
        float fLIZIZ = C418440Gaw.LIZIZ(750);
        float fMin = Math.min(bitmapCopy.getWidth() / fLIZIZ, bitmapCopy.getHeight() / fLIZIZ);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Matrix matrix = new Matrix();
        matrix.postScale(fMin, fMin);
        matrix.postTranslate(0.0f, 0.0f);
        canvas.drawBitmap(bitmapCreateBitmap, matrix, paint);
        canvas.save();
        canvas.restore();
        return bitmapCopy;
    }

    public static String LIZIZ(Context context, Uri uri) throws Throwable {
        Throwable th = null;
        Cursor cursorLJJJ = C2204961BRm.LJJJ(context.getContentResolver(), uri, new String[]{"_data"}, null, null, null, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2w2c2sgKOmgYouA3z2U6AxTnRauIAHlSiRoeVKvQ9OnA9csQBl/CdQ=", null));
        if (cursorLJJJ != null) {
            try {
                if (cursorLJJJ.moveToFirst()) {
                    String string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
                    C2107108Nh.LIZ(cursorLJJJ, null);
                    return string;
                }
                C2107108Nh.LIZ(cursorLJJJ, null);
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
                                C2107108Nh.LIZ(cursorLJJJ, th);
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
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x00ff
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String LIZJ(android.content.Context r13, android.graphics.Bitmap r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2476109n5.LIZJ(android.content.Context, android.graphics.Bitmap):java.lang.String");
    }
}
