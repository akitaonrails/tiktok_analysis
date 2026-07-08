package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.0mEe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388460mEe {
    public static Bitmap LIZ(View view) {
        Bitmap bitmapCreateBitmap = null;
        try {
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            Bitmap bitmapLIZLLL = C842150X1x.LIZLLL(view, CertProviderManagerKt.findCert("bpea-qrcode_view_to_bitmap", 1476435976));
            if (bitmapLIZLLL == null) {
                return null;
            }
            bitmapCreateBitmap = Bitmap.createBitmap(bitmapLIZLLL);
            return bitmapCreateBitmap;
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            return bitmapCreateBitmap;
        }
    }

    public static Uri LIZIZ(Context context, View view, String str) {
        Bitmap bitmapLIZ = LIZ(view);
        if (bitmapLIZ == null) {
            return null;
        }
        view.setDrawingCacheEnabled(false);
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        try {
            Uri uriLIZIZ = C2400409as.LIZIZ(context, str, "image/png");
            if (uriLIZIZ != null) {
                bitmapLIZ.compress(Bitmap.CompressFormat.PNG, 100, C09NT.LJFF(context.getContentResolver(), uriLIZIZ));
                return uriLIZIZ;
            }
            throw new IOException();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
