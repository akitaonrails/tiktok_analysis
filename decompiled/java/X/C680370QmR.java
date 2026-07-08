package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.config.SearchSAFPlaceholderBitmapPreloadExp;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0QmR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C680370QmR {
    public static final C680370QmR LIZ = new C680370QmR();
    public static volatile C0QL6 LIZIZ;
    public static volatile String LIZJ;
    public static volatile Bitmap LIZLLL;
    public static volatile Bitmap LJ;
    public static volatile Bitmap LJFF;
    public static volatile boolean LJI;

    public static void LJII() {
        if (!SearchSAFPlaceholderBitmapPreloadExp.LIZ()) {
            LJ = null;
            LJFF = null;
            return;
        }
        Bitmap bitmap = LJFF;
        LJ = null;
        LJFF = null;
        if (bitmap == null || !(!bitmap.isRecycled())) {
            return;
        }
        bitmap.recycle();
        BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
    }

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

    public static String LJFF(Context context) {
        Integer numLIZ = C1308910kAL.LIZ(R.attr.g0d, context);
        if (numLIZ != null && numLIZ.intValue() == 0) {
            return "search_middle_cache_dark.png";
        }
        return "search_middle_cache_light.png";
    }

    public final synchronized void LIZLLL(boolean z) {
        Bitmap bitmap = LIZLLL;
        LIZLLL = null;
        LIZJ = null;
        if (bitmap != null && !bitmap.isRecycled()) {
            if (z && bitmap == LJ) {
                LJFF = bitmap;
            } else {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            }
        }
    }

    public final synchronized Bitmap LJI(Bitmap bitmap) {
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                LJ = bitmap;
                if (LJFF == bitmap) {
                    LJFF = null;
                }
                return bitmap;
            }
        }
        return null;
    }

    public static Bitmap LJ(Context context, String str) {
        Bitmap bitmapDecodeFile = null;
        try {
            C0VSJ c0vsj = new C0VSJ(LIZ(context), str);
            if (c0vsj.exists() && c0vsj.isFile()) {
                String absolutePath = c0vsj.getAbsolutePath();
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                int i = displayMetrics.widthPixels;
                int i2 = displayMetrics.heightPixels;
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i3 = 1;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(absolutePath, options);
                if (options.outWidth > 0 && options.outHeight > 0) {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    int i4 = options.outHeight;
                    int i5 = options.outWidth;
                    if (i4 > i2 || i5 > i) {
                        int i6 = i4 / 2;
                        int i7 = i5 / 2;
                        while (i6 / i3 >= i2 && i7 / i3 >= i) {
                            i3 *= 2;
                        }
                    }
                    options2.inSampleSize = i3;
                    options2.inJustDecodeBounds = false;
                    bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
                    return bitmapDecodeFile;
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmapDecodeFile;
        }
    }

    public final synchronized void LJIIIIZZ(Bitmap bitmap, String str) {
        if (bitmap.isRecycled()) {
            return;
        }
        LIZJ = str;
        LIZLLL = bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(android.view.View r18, java.lang.String r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C680370QmR.LIZIZ(android.view.View, java.lang.String, java.lang.String):void");
    }

    public static final void LIZJ(View view, Canvas canvas, int i, Drawable drawable, int i2, int i3, View view2) {
        Pair pair;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).offsetDescendantRectToMyCoords(view2, new Rect());
            pair = new Pair(Float.valueOf(r1.left), Float.valueOf(r1.top));
        } else {
            view.getLocationInWindow(new int[2]);
            view2.getLocationInWindow(new int[2]);
            pair = new Pair(Float.valueOf(r4[0] - r5[0]), Float.valueOf(r4[1] - r5[1]));
        }
        float fFloatValue = ((Number) pair.getFirst()).floatValue();
        float fFloatValue2 = ((Number) pair.getSecond()).floatValue();
        int width = view2.getWidth();
        int height = view2.getHeight();
        if (width > 0 && height > 0) {
            canvas.save();
            canvas.translate(fFloatValue, fFloatValue2);
            canvas.clipRect(0.0f, 0.0f, width, height);
            canvas.drawColor(i);
            if (drawable != null) {
                canvas.save();
                canvas.translate(-fFloatValue, -fFloatValue2);
                drawable.setBounds(0, 0, i2, i3);
                drawable.draw(canvas);
                canvas.restore();
            }
            C842150X1x.LIZIZ(canvas, view2);
            canvas.restore();
        }
    }
}
