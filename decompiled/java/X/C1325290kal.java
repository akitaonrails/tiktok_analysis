package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS386S0200000_20;

/* JADX INFO: renamed from: X.0kal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325290kal {
    public static final Bitmap LIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        synchronized (bitmap) {
            try {
                if (bitmap.isRecycled()) {
                    return null;
                }
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                return bitmap.copy(config, false);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final byte[] LIZLLL(android.graphics.Bitmap r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1325290kal.LIZLLL(android.graphics.Bitmap):byte[]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0kSY] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static final Bitmap LJFF(Uri uri) throws Throwable {
        InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI;
        ?? r3;
        C1323050kX9 c1323050kX9;
        AbstractC1325130kaV abstractC1325130kaV;
        ?? underlyingBitmap = 0;
        underlyingBitmap = 0;
        underlyingBitmap = 0;
        underlyingBitmap = 0;
        try {
            if (uri == null) {
                return null;
            }
            try {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
                c1325700kbQLIZLLL.LIZJ = new C1324630kZh(720, 720);
                interfaceC1320200kSYLJI = C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), null);
                try {
                    Object objLIZIZ = C1321330kUN.LIZIZ(interfaceC1320200kSYLJI);
                    if (objLIZIZ instanceof C1323050kX9) {
                        c1323050kX9 = (C1323050kX9) objLIZIZ;
                    } else {
                        c1323050kX9 = null;
                    }
                    if (c1323050kX9 != null && (abstractC1325130kaV = (AbstractC1325130kaV) c1323050kX9.get()) != null) {
                        underlyingBitmap = abstractC1325130kaV.getUnderlyingBitmap();
                    }
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    r3 = underlyingBitmap;
                    if (interfaceC1320200kSYLJI != null) {
                    }
                    return r3;
                }
            } catch (Exception e2) {
                e = e2;
                interfaceC1320200kSYLJI = null;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                if (0 != 0) {
                    underlyingBitmap.close();
                }
                throw th;
            }
            interfaceC1320200kSYLJI.close();
            r3 = underlyingBitmap;
            return r3;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static final Object LJ(Uri uri, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        C1324660kZk c1324660kZkLIZJ;
        AbstractC1327750kej abstractC1327750kej;
        AbstractC1325130kaV abstractC1325130kaV;
        Bitmap underlyingBitmap;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
        c1325700kbQLIZLLL.LJIIL = EnumC1331380kka.HIGH;
        c1325700kbQLIZLLL.LIZJ = new C1324630kZh(720, 720);
        C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
        InterfaceC1325590kbF interfaceC1325590kbF = C1322200kVm.LIZ().LJIIJJI;
        Bitmap bitmapLIZ = null;
        if (interfaceC1325590kbF != null && c1325710kbRLIZ != null) {
            if (c1325710kbRLIZ.LJIJJ != null) {
                c1324660kZkLIZJ = interfaceC1325590kbF.LIZIZ(c1325710kbRLIZ, null);
            } else {
                c1324660kZkLIZJ = interfaceC1325590kbF.LIZJ(c1325710kbRLIZ, null);
            }
        } else {
            c1324660kZkLIZJ = null;
        }
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = C1322200kVm.LIZ().LIZLLL.get(c1324660kZkLIZJ);
        if (c1323050kX9 == null) {
            abstractC1327750kej = null;
        } else {
            try {
                abstractC1327750kej = c1323050kX9.get();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (c1323050kX9 != null) {
                    c1323050kX9.close();
                }
                throw th;
            }
        }
        if (abstractC1327750kej instanceof AbstractC1325130kaV) {
            abstractC1325130kaV = (AbstractC1325130kaV) abstractC1327750kej;
        } else {
            abstractC1325130kaV = null;
        }
        if (abstractC1325130kaV != null && (underlyingBitmap = abstractC1325130kaV.getUnderlyingBitmap()) != null) {
            bitmapLIZ = LIZ(underlyingBitmap);
        }
        if (c1323050kX9 != null) {
            c1323050kX9.close();
        }
        if (bitmapLIZ != null && !bitmapLIZ.isRecycled()) {
            C189200o6.m2constructorimpl(bitmapLIZ);
            c2252611DEt.resumeWith(bitmapLIZ);
        } else {
            AwS386S0200000_20 awS386S0200000_20 = new AwS386S0200000_20(c1325710kbRLIZ, c2252611DEt, 5);
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(c1325710kbRLIZ.LIZIZ);
            C1324630kZh c1324630kZh = c1325710kbRLIZ.LJIIJJI;
            if (c1324630kZh != null) {
                c1331670kl3LJI.LJJIJIIJI(c1324630kZh.LIZ, c1324630kZh.LIZIZ, (int) c1324630kZh.LIZJ);
            }
            c1331670kl3LJI.LJJII(new C1339370kxT(awS386S0200000_20, 0));
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public static final Object LJI(Uri uri, Bitmap bitmap) throws Throwable {
        Object c098200Yq;
        try {
            c098200Yq = LIZLLL(bitmap);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            Bitmap bitmapLJFF = LJFF(uri);
            if (bitmapLJFF != null) {
                return LIZLLL(bitmapLJFF);
            }
            return null;
        }
        return c098200Yq;
    }

    public static final void LIZIZ(Uri uri, boolean z, InterfaceC1631630sYr<? super InterfaceC497601wk, ? super Bitmap, ? super Long, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631630sYr, Function1<? super Long, Unit> function1) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1377205aE(z, uri, interfaceC1631630sYr, System.currentTimeMillis(), function1, null), 3);
    }

    public static Object LIZJ(Bitmap bitmap, Uri uri, InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1364105Vn interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZ, new C1377305aF(uri, bitmap, interfaceC1631630sYr, System.currentTimeMillis(), null, null));
    }
}
