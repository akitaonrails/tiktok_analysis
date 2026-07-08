package Y;

import X.C1289620jfE;
import X.C1C7U;
import android.graphics.Bitmap;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.lynx.tasm.base.TraceEvent;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS12S0100100_3 implements Runnable {
    public final int $t;
    public long j1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS12S0100100_3 aRunnableS12S0100100_3) {
        Bitmap bitmapCreateScaledBitmap;
        Bitmap bitmap = (Bitmap) aRunnableS12S0100100_3.l0;
        long j = aRunnableS12S0100100_3.j1;
        C1C7U.LIZ("MeaningfulContentSnapshot@e2a4.takeScreenshot$1L");
        HashMap map = new HashMap();
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width <= 600 && height <= 600) {
                bitmapCreateScaledBitmap = bitmap;
            } else {
                float f = 600;
                float f2 = width;
                float f3 = height;
                float fMin = Math.min(f / f2, f / f3);
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(f2 * fMin), Math.round(f3 * fMin), true);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, Math.max(30, 30), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (bitmapCreateScaledBitmap != bitmap) {
                bitmapCreateScaledBitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateScaledBitmap);
            }
            map.put("data", "data:image/jpeg;base64," + Base64.encodeToString(byteArray, 0));
        }
        C1289620jfE.LIZJ(new ARunnableS12S0100100_3(j, map, 1));
        C1C7U.LIZIZ("MeaningfulContentSnapshot@e2a4.takeScreenshot$1L");
    }

    public static final void run$1(ARunnableS12S0100100_3 aRunnableS12S0100100_3) {
        long j = aRunnableS12S0100100_3.j1;
        Map map = (Map) aRunnableS12S0100100_3.l0;
        C1C7U.LIZ("MeaningfulContentSnapshot@e2a4.takeScreenshot$1L$1L");
        TraceEvent.LJIILIIL(j, map, "FSPSnapshotBase64Bitmap");
        C1C7U.LIZIZ("MeaningfulContentSnapshot@e2a4.takeScreenshot$1L$1L");
    }

    public ARunnableS12S0100100_3(long j, Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
        this.j1 = j;
    }
}
