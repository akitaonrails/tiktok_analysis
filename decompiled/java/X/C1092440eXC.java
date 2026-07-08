package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092440eXC {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1092410eX9 LIZIZ(java.util.List r11) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1092440eXC.LIZIZ(java.util.List):X.0eX9");
    }

    public static Pair LIZJ(int i) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            return new Pair(bitmapCreateBitmap, new Canvas(bitmapCreateBitmap));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJIIIZ("V2BoardItemContainerSize", "createBitmapAndCanvas -- null");
            return null;
        }
    }

    public static Bitmap LIZLLL(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        ArrayList<View> arrayList = new ArrayList();
        arrayList.addAll(C09RB.LJJII(C09RB.LJIJI(new C09RD(viewGroup), new C1092450eXD())));
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (View view : arrayList) {
            arrayList2.add(new C1092430eXB(view.getTranslationX(), view.getTranslationY(), view.getWidth(), view.getHeight()));
        }
        C1092410eX9 c1092410eX9LIZIZ = LIZIZ(arrayList2);
        Pair pairLIZJ = LIZJ((int) (c1092410eX9LIZIZ.LIZJ + (c1092410eX9LIZIZ.LIZLLL * 2)));
        if (pairLIZJ == null) {
            return null;
        }
        Bitmap bitmap = (Bitmap) pairLIZJ.getFirst();
        Canvas canvas = (Canvas) pairLIZJ.getSecond();
        for (View view2 : arrayList) {
            float translationX = view2.getTranslationX();
            float translationY = view2.getTranslationY();
            view2.getWidth();
            view2.getHeight();
            float f = translationX - c1092410eX9LIZIZ.LIZ;
            float f2 = c1092410eX9LIZIZ.LIZLLL;
            float f3 = f + f2 + c1092410eX9LIZIZ.LJ;
            float f4 = (translationY - c1092410eX9LIZIZ.LIZIZ) + f2 + c1092410eX9LIZIZ.LJFF;
            int iSave = canvas.save();
            canvas.translate(f3, f4);
            try {
                try {
                    C842150X1x.LIZJ(view2, canvas, CertProviderManagerKt.findCert("bpea-decoration_template_preview_screen_shot_1", 1476435993));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        return bitmap;
    }

    public static int LIZ(Canvas canvas, View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width > 0 && height > 0 && f > 0.0f) {
            float fMin = Math.min(width, height) / 2.0f;
            if (f <= fMin) {
                fMin = f;
            }
            int iSave = canvas.save();
            try {
                Path path = new Path();
                path.addRoundRect(0.0f, 0.0f, width, height, fMin, fMin, Path.Direction.CW);
                canvas.clipPath(path);
                return iSave;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                canvas.restoreToCount(iSave);
                return -1;
            }
        }
        return -1;
    }
}
