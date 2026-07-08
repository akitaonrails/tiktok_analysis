package X;

import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.monitorV2.webview.blank.WebBlankDetectorDefault;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0pjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523120pjq extends C09AY implements Function1<C1521720pha, Unit> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ Bitmap.Config LLILLL;
    public final /* synthetic */ WebBlankDetectorDefault LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1523120pjq(View view, float f, Bitmap.Config config, WebBlankDetectorDefault webBlankDetectorDefault) {
        super(1);
        this.LL = view;
        this.LLILLJJLI = f;
        this.LLILLL = config;
        this.LLILZ = webBlankDetectorDefault;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|2|(1:5)|6|(1:17)(4:14|(0)(3:23|(1:29)|30)|31|32)|33|18|21|(0)|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[PHI: r3 r4
      0x0064: PHI (r3v2 boolean) = (r3v1 boolean), (r3v3 boolean) binds: [B:22:0x0062, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0064: PHI (r4v2 android.graphics.Bitmap) = (r4v0 android.graphics.Bitmap), (r4v3 android.graphics.Bitmap) binds: [B:22:0x0062, B:15:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C1521720pha r12) {
        /*
            r11 = this;
            X.0pha r12 = (X.C1521720pha) r12
            long r9 = java.lang.System.currentTimeMillis()
            android.view.View r5 = r11.LL
            float r6 = r11.LLILLJJLI
            android.graphics.Bitmap$Config r7 = r11.LLILLL
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r6
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
            int r2 = (int) r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r6
            float r0 = r0 + r1
            int r1 = (int) r0
            if (r2 <= 0) goto L22
            if (r1 > 0) goto L2a
        L22:
            int r2 = r5.getWidth()
            int r1 = r5.getHeight()
        L2a:
            android.graphics.Bitmap r0 = X.C1523130pjr.LIZ
            r8 = 0
            if (r0 == 0) goto L4b
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L4b
            android.graphics.Bitmap r0 = X.C1523130pjr.LIZ
            int r0 = r0.getWidth()
            if (r0 != r2) goto L4b
            android.graphics.Bitmap r0 = X.C1523130pjr.LIZ
            int r0 = r0.getHeight()
            if (r0 != r1) goto L4b
            android.graphics.Bitmap r4 = X.C1523130pjr.LIZ
            r3 = 0
            if (r4 != 0) goto L64
            goto L4c
        L4b:
            r3 = 1
        L4c:
            android.content.Context r0 = r5.getContext()     // Catch: java.lang.OutOfMemoryError -> L5d
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.OutOfMemoryError -> L5d
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch: java.lang.OutOfMemoryError -> L5d
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r0, r2, r1, r7)     // Catch: java.lang.OutOfMemoryError -> L5d
            goto L61
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L61:
            r4 = r8
            if (r8 == 0) goto L97
        L64:
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r4)
            r2.scale(r6, r6)
            r5.computeScroll()
            int r0 = r5.getScrollX()
            float r0 = (float) r0
            float r1 = -r0
            int r0 = r5.getScrollY()
            float r0 = (float) r0
            float r0 = -r0
            r2.translate(r1, r0)
            X.C842150X1x.LIZIZ(r2, r5)
            if (r3 == 0) goto L95
            android.graphics.Bitmap r0 = X.C1523130pjr.LIZ
            if (r0 == 0) goto L95
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L95
            android.graphics.Bitmap r0 = X.C1523130pjr.LIZ
            r0.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r0)
        L95:
            X.C1523130pjr.LIZ = r4
        L97:
            com.bytedance.android.monitorV2.webview.blank.WebBlankDetectorDefault r0 = r11.LLILZ
            r0.checkBlank(r4, r12)
            r12.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            r12.LIZIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1523120pjq.invoke(java.lang.Object):java.lang.Object");
    }
}
