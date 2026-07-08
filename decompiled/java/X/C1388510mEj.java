package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0mEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388510mEj {
    public static final C1388510mEj LIZ = new C1388510mEj();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C1388540mEm
            if (r0 == 0) goto L45
            r4 = r6
            X.0mEm r4 = (X.C1388540mEm) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L4b
            X.C155000ia.LIZIZ(r2)
        L22:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L2f
            boolean r0 = r2.booleanValue()
        L2a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f:
            r0 = 0
            goto L2a
        L31:
            X.C155000ia.LIZIZ(r2)
            X.0m60 r2 = new X.0m60
            r0 = 0
            r2.<init>(r0)
            r4.LLILLL = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r2 = X.C099A.LIZJ(r0, r2, r4)
            if (r2 != r3) goto L22
            return r3
        L45:
            X.0mEm r4 = new X.0mEm
            r4.<init>(r5, r6)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1388510mEj.LIZLLL(X.05Vn):java.lang.Object");
    }

    public static Bitmap LIZ(C350270DoH c350270DoH, Bitmap bitmap) {
        Bitmap bitmapCopy;
        Bitmap bitmapCopy2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1080, 1920, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        if (bitmap == null || bitmap.getConfig() != Bitmap.Config.HARDWARE || (bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false)) == null) {
            bitmapCopy = bitmap;
        }
        if (bitmapCopy != null && !bitmapCopy.isRecycled() && bitmapCopy.getWidth() > 0 && bitmapCopy.getHeight() > 0) {
            float f = 1080;
            float f2 = 1920;
            float fMax = Math.max(f / bitmapCopy.getWidth(), f2 / bitmapCopy.getHeight());
            float width = bitmapCopy.getWidth() * fMax;
            float height = bitmapCopy.getHeight() * fMax;
            float f3 = (f - width) / 2.0f;
            float f4 = (f2 - height) / 2.0f;
            canvas.drawBitmap(bitmapCopy, (Rect) null, new RectF(f3, f4, width + f3, height + f4), paint);
        } else {
            canvas.drawColor(-16777216);
        }
        if (c350270DoH.LIZ.getConfig() != Bitmap.Config.HARDWARE || (bitmapCopy2 = c350270DoH.LIZ.copy(Bitmap.Config.ARGB_8888, false)) == null) {
            bitmapCopy2 = c350270DoH.LIZ;
        }
        if (bitmapCopy2.getWidth() > 0 && bitmapCopy2.getHeight() > 0) {
            canvas.drawBitmap(bitmapCopy2, (1080 / 2.0f) - c350270DoH.LIZIZ, (1920 / 2.0f) - c350270DoH.LIZJ, paint);
        }
        if (bitmapCopy != null && bitmapCopy != bitmap && !bitmapCopy.isRecycled()) {
            bitmapCopy.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy);
        }
        if (bitmapCopy2 != c350270DoH.LIZ && !bitmapCopy2.isRecycled()) {
            bitmapCopy2.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCopy2);
        }
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C19EG r15, X.InterfaceC1364105Vn<? super X.C350270DoH> r16) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1388510mEj.LIZIZ(X.19EG, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C19EG r9, X.InterfaceC1364105Vn<? super X.InterfaceC1375300ltQ> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1388530mEl
            if (r0 == 0) goto Lb0
            r6 = r10
            X.0mEl r6 = (X.C1388530mEl) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb0
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r4 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r2 = r6.LLILZ
            r7 = 0
            r3 = 3
            r1 = 2
            r0 = 1
            if (r2 == 0) goto L44
            if (r2 == r0) goto L52
            if (r2 == r1) goto L81
            if (r2 != r3) goto Lba
            java.lang.Object r1 = r6.LL
            X.0DoH r1 = (X.C350270DoH) r1
            X.C155000ia.LIZIZ(r4)
        L2d:
            android.graphics.Bitmap r4 = (android.graphics.Bitmap) r4
            android.graphics.Bitmap r0 = r1.LIZ
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L3c
            android.graphics.Bitmap r0 = r1.LIZ
            X.C786410Ut5.LJJJJ(r0)
        L3c:
            if (r4 == 0) goto Lb7
            X.07o9 r0 = new X.07o9
            r0.<init>(r4)
            return r0
        L44:
            X.C155000ia.LIZIZ(r4)
            r6.LL = r9
            r6.LLILZ = r0
            java.lang.Object r4 = r8.LIZLLL(r6)
            if (r4 != r5) goto L59
            return r5
        L52:
            java.lang.Object r9 = r6.LL
            X.19EG r9 = (X.C19EG) r9
            X.C155000ia.LIZIZ(r4)
        L59:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 != 0) goto L64
            X.0ltR r0 = X.C1375310ltR.LIZ
            return r0
        L64:
            java.lang.ref.WeakReference<android.graphics.Bitmap> r0 = X.C1383110m61.LIZ
            if (r0 == 0) goto Lc2
            java.lang.Object r2 = r0.get()
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto Lc2
            boolean r0 = r2.isRecycled()
            if (r0 != 0) goto Lc2
            r6.LL = r2
            r6.LLILZ = r1
            java.lang.Object r4 = r8.LIZIZ(r9, r6)
            if (r4 != r5) goto L88
            return r5
        L81:
            java.lang.Object r2 = r6.LL
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            X.C155000ia.LIZIZ(r4)
        L88:
            X.0DoH r4 = (X.C350270DoH) r4
            if (r4 != 0) goto L8f
            X.0ltS r0 = X.C1375320ltS.LIZ
            return r0
        L8f:
            android.graphics.Bitmap r0 = r4.LIZ
            boolean r0 = r0.isRecycled()
            if (r0 == 0) goto L9a
            X.0ltS r0 = X.C1375320ltS.LIZ
            return r0
        L9a:
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0Ds6 r0 = new X.0Ds6
            r0.<init>(r4, r2, r7)
            r6.LL = r4
            r6.LLILZ = r3
            java.lang.Object r0 = X.C23250099c.LJI(r6, r1, r0)
            if (r0 != r5) goto Lac
            return r5
        Lac:
            r1 = r4
            r4 = r0
            goto L2d
        Lb0:
            X.0mEl r6 = new X.0mEl
            r6.<init>(r8, r10)
            goto L12
        Lb7:
            X.0ltS r0 = X.C1375320ltS.LIZ
            return r0
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc2:
            X.0ltR r0 = X.C1375310ltR.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1388510mEj.LIZJ(X.19EG, X.05Vn):java.lang.Object");
    }
}
