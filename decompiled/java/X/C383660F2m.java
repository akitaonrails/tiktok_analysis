package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383660F2m {
    public static final C383660F2m LIZ = new C383660F2m();

    public static void LIZ(Context context, String str, ImageView imageView, C370690Eg7 c370690Eg7) {
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        C383700F2q.LIZ(c370690Eg7, c1331670kl3LJIIIZ);
        c1331670kl3LJIIIZ.LIZLLL = true;
        c1331670kl3LJIIIZ.LJJIJL(context);
        c1331670kl3LJIIIZ.LJJI(imageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
    }

    public static Object LIZIZ(Context context, String str, C370690Eg7 c370690Eg7, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iIntValue;
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(interfaceC1364105Vn));
        Uri uriFromFile = UriProtector.parse(str);
        if (!Intrinsics.LJFF(uriFromFile.getScheme(), "content") && !Intrinsics.LJFF(uriFromFile.getScheme(), "http") && !Intrinsics.LJFF(uriFromFile.getScheme(), "https")) {
            uriFromFile = Uri.fromFile(new C0VSJ(str));
        }
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uriFromFile);
        Integer num = c370690Eg7.LIZ;
        if (num != null && c370690Eg7.LIZIZ != null) {
            int iIntValue2 = num.intValue();
            Integer num2 = c370690Eg7.LIZIZ;
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                iIntValue = -1;
            }
            c1331670kl3LJI.LJIIIIZZ = iIntValue2;
            c1331670kl3LJI.LJIIIZ = iIntValue;
        }
        c1331670kl3LJI.LJJ = EnumC1338240kve.CENTER_CROP;
        Bitmap.Config config = c370690Eg7.LIZJ;
        if (config == null) {
            config = Bitmap.Config.RGB_565;
        }
        c1331670kl3LJI.LJIL = config;
        boolean z = c370690Eg7.LJFF;
        c1331670kl3LJI.LJJJJLL = z;
        c1331670kl3LJI.LJJJJZ = z;
        c1331670kl3LJI.LJJIJL(context);
        c1331670kl3LJI.LJJII(new C2499509qr(c23260099m, 1));
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLIZ;
    }

    public static final Bitmap LIZJ(Bitmap bitmap, int i, int i2, Bitmap.Config config) {
        float width;
        float height;
        List<String> list = C383670F2n.LIZ;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, config);
        C383670F2n.LIZJ.getClass();
        try {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, matrix, C383670F2n.LIZIZ);
            canvas.setBitmap(null);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C383670F2n.LIZJ.getClass();
            throw th;
        }
    }
}
