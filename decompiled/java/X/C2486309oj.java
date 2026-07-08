package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.io.IOException;

/* JADX INFO: renamed from: X.09oj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2486309oj {
    public static final C2486309oj LIZ = new C2486309oj();

    public static Bitmap LIZ(int i, int i2) {
        int iLIZJ = C20642515q3.LIZJ(R.color.mj);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawColor(iLIZJ);
        return bitmapCreateBitmap;
    }

    public static String LIZJ(Bitmap bitmap, File file) {
        try {
            C0VSV c0vsv = new C0VSV(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, c0vsv);
            c0vsv.flush();
            c0vsv.close();
            return file.getAbsolutePath();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x012e A[Catch: IllegalArgumentException -> 0x018f, OutOfMemoryError -> 0x01e1, TryCatch #4 {IllegalArgumentException -> 0x018f, OutOfMemoryError -> 0x01e1, blocks: (B:49:0x0128, B:51:0x012e), top: B:73:0x0128 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeInfo r10, com.bytedance.ies.nle.editor_jni.NLETrackSlot r11, kotlin.jvm.functions.Function1 r12) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2486309oj.LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeInfo, com.bytedance.ies.nle.editor_jni.NLETrackSlot, kotlin.jvm.functions.Function1):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.lang.String r8, com.bytedance.tux.drawable.TuxIconDrawable r9, java.lang.String r10, android.content.Context r11, X.InterfaceC1364105Vn r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof X.C2486409ok
            if (r0 == 0) goto L4a
            r4 = r12
            X.09ok r4 = (X.C2486409ok) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4a
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r6 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L89
            java.lang.Object r10 = r4.LLILLJJLI
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r4.LL
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            X.C155000ia.LIZIZ(r6)
        L2a:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L50
            r0 = 0
            return r0
        L30:
            X.C155000ia.LIZIZ(r6)
            X.0Eg6 r1 = new X.0Eg6
            r1.<init>()
            X.0Eg7 r0 = new X.0Eg7
            r0.<init>(r1)
            r4.LL = r9
            r4.LLILLJJLI = r10
            r4.LLILZIL = r2
            java.lang.Object r6 = X.C383660F2m.LIZIZ(r11, r8, r0, r4)
            if (r6 != r3) goto L2a
            return r3
        L4a:
            X.09ok r4 = new X.09ok
            r4.<init>(r7, r12)
            goto L12
        L50:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = r6.copy(r0, r2)
            r6.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r6)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r5)
            int r0 = r6.getWidth()
            float r1 = (float) r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r0
            int r3 = X.C814420VxA.LIZIZ(r1)
            int r0 = r6.getWidth()
            int r0 = r0 - r3
            int r2 = r0 / 2
            int r0 = r6.getHeight()
            int r0 = r0 - r3
            int r1 = r0 / 2
            int r0 = r2 + r3
            int r3 = r3 + r1
            r9.setBounds(r2, r1, r0, r3)
            r9.draw(r4)
            X.C2243308qd.LIZ(r5, r10)
            return r5
        L89:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2486309oj.LIZIZ(java.lang.String, com.bytedance.tux.drawable.TuxIconDrawable, java.lang.String, android.content.Context, X.05Vn):java.lang.Object");
    }
}
