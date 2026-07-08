package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.ab.MiddleSnapShotConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C683900Qs8 {
    public static Bitmap LIZIZ;
    public static C1740600vOc LIZLLL;
    public static long LJ;
    public static final C683900Qs8 LIZ = new C683900Qs8();
    public static boolean LIZJ = true;

    public static void LIZ(int i, Fragment fragment, boolean z) {
        View view;
        C673030Qab.LIZ.getClass();
        if (!((MiddleSnapShotConfig) C673030Qab.LIZJ.getValue()).list.contains(Integer.valueOf(i))) {
            return;
        }
        try {
            if (!((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJIJ(fragment) && !((ISearchService) ServiceManager.get().getService(ISearchService.class)).z0(fragment)) {
                while (fragment != null) {
                    if (!((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJIJ(fragment) && !((ISearchService) ServiceManager.get().getService(ISearchService.class)).z0(fragment)) {
                        fragment = fragment.getParentFragment();
                    }
                }
                return;
            }
            if (fragment == null) {
                return;
            }
            View view2 = fragment.getView();
            if (view2 == null || view2.getWidth() == 0 || view2.getHeight() == 0 || !fragment.isAdded() || (view = fragment.getView()) == null || !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            if (width > 0 && height > 0) {
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                    try {
                        view.draw(new Canvas(bitmapCreateBitmap));
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1564106Al(view2, bitmapCreateBitmap, z, null), 2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        bitmapCreateBitmap.recycle();
                        BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0047
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static void LIZJ(android.content.Context r3, android.graphics.Bitmap r4, boolean r5) {
        /*
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES     // Catch: java.lang.Throwable -> L4f
            java.io.File r3 = X.C786410Ut5.y2(r3, r0)     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L9
            return
        L9:
            boolean r0 = r3.exists()     // Catch: java.lang.Throwable -> L4f
            if (r0 != 0) goto L12
            r3.mkdirs()     // Catch: java.lang.Throwable -> L4f
        L12:
            if (r5 == 0) goto L17
            java.lang.String r0 = "dark_"
            goto L19
        L17:
            java.lang.String r0 = "light_"
        L19:
            X.0VSJ r2 = new X.0VSJ     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L4f
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = "ec_search_middle_capture.png"
            r1.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L4f
            X.0VSV r3 = new X.0VSV     // Catch: java.lang.Throwable -> L4f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4f
            r2 = 0
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L3f
            r0 = 85
            r4.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L3f
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Throwable -> L4f
            return
        L3f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L47
            throw r1     // Catch: java.lang.Throwable -> L44
        L44:
            r0 = move-exception
            r2 = r1
            goto L48
        L47:
            r0 = move-exception
        L48:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L47
            X.C2107108Nh.LIZ(r3, r2)     // Catch: java.lang.Throwable -> L4f
            throw r0     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C683900Qs8.LIZJ(android.content.Context, android.graphics.Bitmap, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.content.Context r8, boolean r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C1564206Am
            if (r0 == 0) goto L95
            r3 = r10
            X.06Am r3 = (X.C1564206Am) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r1 = r3.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r4 = 1
            if (r0 == 0) goto L38
            if (r0 != r4) goto L9c
            X.C155000ia.LIZIZ(r1)
        L22:
            android.graphics.Bitmap r1 = X.C683900Qs8.LIZIZ
            if (r1 == 0) goto L32
            boolean r0 = r1.isRecycled()
            if (r0 != 0) goto L32
            r1.recycle()
            com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker.recordBitmapRecyclePoint(r1)
        L32:
            r0 = 0
            X.C683900Qs8.LIZIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.C155000ia.LIZIZ(r1)
            if (r8 != 0) goto L40
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L40:
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r6 = X.C786410Ut5.y2(r8, r0)
            if (r6 != 0) goto L4b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4b:
            if (r9 == 0) goto L6d
            java.lang.String r0 = "dark_"
        L4f:
            X.0VSJ r5 = new X.0VSJ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r0)
            java.lang.String r0 = "ec_search_middle_capture.png"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r5.<init>(r6, r0)
            boolean r0 = r5.exists()
            if (r0 != 0) goto L70
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L6d:
            java.lang.String r0 = "light_"
            goto L4f
        L70:
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> La7
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0)     // Catch: java.lang.Throwable -> La7
            if (r0 != 0) goto L7b
            goto La4
        L7b:
            X.C683900Qs8.LIZIZ = r0
            X.0Qab r0 = X.C673030Qab.LIZ
            r0.getClass()
            X.01GW r0 = X.C673030Qab.LIZJ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.ab.MiddleSnapShotConfig r0 = (com.ss.android.ugc.aweme.ab.MiddleSnapShotConfig) r0
            long r0 = r0.timeOutLoadImage
            r3.LLILLL = r4
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r3)
            if (r0 != r2) goto L22
            return r2
        L95:
            X.06Am r3 = new X.06Am
            r3.<init>(r7, r10)
            goto L12
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La4:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La7:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C683900Qs8.LIZIZ(android.content.Context, boolean, X.05Vn):java.lang.Object");
    }
}
