package X;

import Y.ARunnableS75S0200000_6;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HWT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HWT {
    public static final C0HWT LIZ = new C0HWT();

    public static Bitmap LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deepCopy(), (W, H) = (");
            sbLIZ.append(bitmap.getWidth());
            sbLIZ.append(", ");
            sbLIZ.append(bitmap.getHeight());
            sbLIZ.append("), currentThread = ");
            sbLIZ.append(C786410Ut5.u3());
            C1706630uVp.LIZ("FrescoUtils", C2188811AlT.LIZIZ(sbLIZ));
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            e.printStackTrace();
            C1706630uVp.LIZJ("FrescoUtils", String.valueOf(e));
            return null;
        }
    }

    public static void LIZJ(Uri uri, EnumC1331380kka enumC1331380kka) {
        ARunnableS75S0200000_6 aRunnableS75S0200000_6 = new ARunnableS75S0200000_6(uri, enumC1331380kka, 13);
        if (Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            C823050WQl.LIZLLL().execute(aRunnableS75S0200000_6);
        } else {
            aRunnableS75S0200000_6.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[PHI: r1
      0x0026: PHI (r1v11 java.lang.Object) = (r1v8 java.lang.Object), (r1v0 java.lang.Object) binds: [B:24:0x00e4, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.net.Uri r12, X.InterfaceC1364105Vn<? super kotlin.Pair<android.graphics.Bitmap, ? extends java.lang.Throwable>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HWT.LIZIZ(android.net.Uri, X.05Vn):java.lang.Object");
    }
}
