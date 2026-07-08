package X;

import Y.ACallableS70S1200000_20;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0khI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329340khI {
    public C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> LIZ;
    public C1329950kiH LIZIZ;
    public final int LIZJ;

    public final void LIZIZ() {
        C1329310khF<InterfaceC1324680kZm, AbstractC1327750kej> c1329310khF = this.LIZ;
        if (c1329310khF != null) {
            try {
                c1329310khF.LJII();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[PHI: r0
      0x0050: PHI (r0v10 int) = (r0v9 int), (r0v18 int) binds: [B:6:0x004a, B:8:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.0kiH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1329340khI() {
        /*
            r7 = this;
            r7.<init>()
            android.content.Context r4 = X.C1330760kja.LIZ
            java.lang.String r5 = "activity"
            java.lang.Object r2 = X.C786410Ut5.H2(r4, r5)
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            int r1 = r0.flags
            r0 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L8d
            int r2 = r2.getLargeMemoryClass()
        L1c:
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = (long) r2
            long r2 = r2 * r0
            r0 = 10
            long r2 = r2 / r0
            int r6 = (int) r2
            java.lang.String r0 = "window"
            java.lang.Object r4 = X.C786410Ut5.H2(r4, r0)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            X.0WZX r2 = new X.0WZX
            java.lang.String r1 = "dzBzEgAjS8/YVFkiQFyIb+dNhzmL28PBZKoWYE0epUL8UQ=="
            r0 = 0
            r2.<init>(r1, r0)
            android.view.Display r0 = X.C2204961BRm.LLILZIL(r4, r2)
            r0.getMetrics(r3)
            int r1 = r3.widthPixels
            int r0 = r3.heightPixels
            int r1 = r1 * r0
            int r0 = r1 * 4
            int r0 = r0 * 4
            if (r6 > r0) goto L50
            r0 = 6291456(0x600000, float:8.816208E-39)
            if (r6 >= r0) goto L51
        L50:
            r6 = r0
        L51:
            r7.LIZJ = r6
            X.0khF r4 = new X.0khF
            X.0kfT r3 = new X.0kfT
            r3.<init>()
            X.0khc r2 = new X.0khc
            r2.<init>()
            X.0kiC r1 = new X.0kiC
            android.content.Context r0 = X.C1330760kja.LIZ
            java.lang.Object r0 = X.C786410Ut5.H2(r0, r5)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1.<init>(r0)
            r4.<init>(r3, r2, r1)
            r7.LIZ = r4
            X.0kiH r2 = new X.0kiH
            X.0WQX r0 = X.C0WQX.SERIAL
            X.08To r1 = new X.08To
            r1.<init>(r0)
            java.lang.String r0 = "bitmap-cache"
            r1.LIZIZ = r0
            X.08Tp r0 = new X.08Tp
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = X.C823050WQl.LIZ(r0)
            r2.<init>(r0)
            r7.LIZIZ = r2
            return
        L8d:
            int r2 = r2.getMemoryClass()
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1329340khI.<init>():void");
    }

    public final C1323050kX9<Bitmap> LIZJ(String str) {
        C1325120kaU c1325120kaU;
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LIZ.get(new C592490NLr(str));
        C1323050kX9<Bitmap> c1323050kX9CloneUnderlyingBitmapReference = null;
        if (c1323050kX9 == null) {
            return null;
        }
        try {
            if (C1323050kX9.LJIJJ(c1323050kX9) && (c1323050kX9.get() instanceof C1325120kaU) && (c1325120kaU = (C1325120kaU) c1323050kX9.get()) != null) {
                c1323050kX9CloneUnderlyingBitmapReference = c1325120kaU.cloneUnderlyingBitmapReference();
            }
            C1323050kX9.LJII(c1323050kX9);
            return c1323050kX9CloneUnderlyingBitmapReference;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1323050kX9.LJII(c1323050kX9);
            throw th;
        }
    }

    public final void LIZ(String str, C1329380khM c1329380khM) {
        C1323050kX9 c1323050kX9LJFF;
        if (!TextUtils.isEmpty(str) && c1329380khM != null && c1329380khM.LIZIZ() != null) {
            C1329440khS c1329440khSLIZIZ = c1329380khM.LIZIZ();
            synchronized (c1329440khSLIZIZ) {
                c1323050kX9LJFF = C1323050kX9.LJFF(c1329440khSLIZIZ.LIZJ);
            }
            if (c1323050kX9LJFF != null && c1323050kX9LJFF.LJIILLIIL()) {
                C15O7.LIZIZ(new ACallableS70S1200000_20(c1323050kX9LJFF, this, str, 1), this.LIZIZ, null);
            }
        }
    }
}
