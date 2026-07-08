package X;

import Y.ARunnableS10S2100000_20;
import Y.ARunnableS24S1200000_20;
import Y.ARunnableS25S1100000_20;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.canvas.KryptonApp;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxImageService;
import j27.s;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jy3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301290jy3 extends AbstractC1301300jy4 {
    public final WeakReference<s> LIZ;
    public ILynxImageService LIZIZ;

    @Override // a17.a0
    public final void onBootstrap(KryptonApp kryptonApp) {
    }

    @Override // a17.a0
    public final void onDestroy() {
    }

    public C1301290jy3(WeakReference<s> weakReference) {
        this.LIZ = weakReference;
    }

    public static final String LJIIIIZZ(String str) {
        if (str.startsWith("assets:///")) {
            return str.replace("assets:///", "asset:///");
        }
        if (!str.startsWith("assets://")) {
            return str;
        }
        return str.replace("assets://", "asset:///");
    }

    @Override // X.AbstractC1301300jy4
    public final byte[] LIZIZ(String str) {
        try {
            return C1301430jyH.LIZJ(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadUrlSync with error message: ");
            sbLIZ.append(e.getMessage());
            sbLIZ.append(" ,the url is: ");
            sbLIZ.append(C1301430jyH.LJFF(str));
            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    @Override // X.AbstractC1301300jy4
    public final String LJI(String str) {
        AbstractC1301590jyX abstractC1301590jyX;
        String strLJFF = C1301430jyH.LJFF(str);
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("url", strLJFF);
            TraceEvent.LIZJ("LYNX_KRYPTON_LOADER_REDIRECT_URL", map);
        }
        String strLJIIIIZZ = LJIIIIZZ(str);
        if (!C1301430jyH.LJIIIIZZ(strLJIIIIZZ) && !C1301430jyH.LJI(strLJIIIIZZ)) {
            s sVar = this.LIZ.get();
            if (sVar != null && (abstractC1301590jyX = sVar.LLLF) != null) {
                String strLIZJ = abstractC1301590jyX.LIZJ(new C1301600jyY(strLJIIIIZZ, EnumC1299880jvm.LynxResourceTypeImage));
                if (strLIZJ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Redirect URL with LynxMediaResourceFetcher, the original url: ");
                    sbLIZ.append(strLJIIIIZZ);
                    sbLIZ.append(" redirected url: ");
                    sbLIZ.append(strLIZJ);
                    C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
                    TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
                    return strLIZJ;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Redirect URL with LynxMediaResourceFetcher return null url,  redirected url: ");
                sbLIZ2.append(strLIZJ);
                C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
                return strLJIIIIZZ;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Redirect URL: ");
            sbLIZ3.append(strLJIIIIZZ);
            sbLIZ3.append(" failed because there is no LynxMediaResourceFetcher existed.");
            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
            TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
            return strLJIIIIZZ;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Local path and base64 path redirect with original url: ");
        sbLIZ4.append(strLJFF);
        C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
        TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
        return strLJIIIIZZ;
    }

    public static void LJIIIZ(String str, C1301320jy6 c1301320jy6) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handle local path resource: ");
        sbLIZ.append(str);
        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("path", str);
            TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_LOCAL_PATH_RESOURCE", map);
        }
        InputStream inputStreamLJIIIZ = C1301430jyH.LJIIIZ(str);
        if (inputStreamLJIIIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Handle local path resource success, the resource path : ");
            sbLIZ2.append(str);
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                if (c1301320jy6.LIZIZ != null) {
                    LJIIJ(str, inputStreamLJIIIZ, inputStreamLJIIIZ.available(), c1301320jy6);
                } else {
                    LJII(str, inputStreamLJIIIZ, inputStreamLJIIIZ.available(), c1301320jy6);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Handle local path resource with exception: ");
                sbLIZ3.append(e.toString());
                sbLIZ3.append(" url: ");
                sbLIZ3.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", strLIZIZ);
                c1301320jy6.LIZ(strLIZIZ);
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Handle local path resource failed.  path: ");
            sbLIZ4.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", strLIZIZ2);
            c1301320jy6.LIZ(strLIZIZ2);
        }
        TraceEvent.LJII("LYNX_KRYPTON_LOAD_LOCAL_PATH_RESOURCE");
    }

    @Override // X.AbstractC1301300jy4
    public final void LIZJ(String str, InterfaceC1301360jyA interfaceC1301360jyA) {
        String strLJFF = C1301430jyH.LJFF(str);
        C1301320jy6 c1301320jy6 = new C1301320jy6(interfaceC1301360jyA, null);
        if (C1301430jyH.LJI(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load base64 type data url: ");
            sbLIZ.append(strLJFF);
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            String strLJFF2 = C1301430jyH.LJFF(str);
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put("url", strLJFF2);
                TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_DATA_URI", map);
            }
            C1301430jyH.LJ().execute(new ARunnableS10S2100000_20(c1301320jy6, strLJFF2, str, 1));
            TraceEvent.LJII("LYNX_KRYPTON_LOAD_DATA_URI");
            return;
        }
        C1301430jyH.LJ().execute(new ARunnableS24S1200000_20(this, LJIIIIZZ(str), c1301320jy6, 3));
    }

    @Override // X.AbstractC1301300jy4
    public final void LJ(String str, final InterfaceC1301370jyB interfaceC1301370jyB) {
        final String strLJIIIIZZ = LJIIIIZZ(str);
        if (this.LIZIZ == null) {
            this.LIZIZ = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        }
        if (this.LIZIZ != null) {
            C1301430jyH.LJ().execute(new ARunnableS24S1200000_20(this, strLJIIIIZZ, interfaceC1301370jyB, 4));
            return;
        }
        if (C1301430jyH.LJI(strLJIIIIZZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Handle base64 type image with url: ");
            sbLIZ.append(C1301430jyH.LJFF(strLJIIIIZZ));
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            C1301430jyH.LJ().execute(new ARunnableS25S1100000_20(interfaceC1301370jyB, strLJIIIIZZ, 0));
            return;
        }
        InterfaceC1301360jyA interfaceC1301360jyA = new InterfaceC1301360jyA() { // from class: X.0jyG
            @Override // X.InterfaceC1301360jyA
            public final void reject(String str2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Load image data failed with url: ");
                sbLIZ2.append(strLJIIIIZZ);
                sbLIZ2.append(" ,the error message: ");
                sbLIZ2.append(str2);
                C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC1301370jyB.reject(str2);
            }

            @Override // X.InterfaceC1301360jyA
            public final void LIZ(byte[] bArr, int i) {
                if (C1301430jyH.LJII(bArr)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Cannot handle heif file type image, the url is: ");
                    sbLIZ2.append(strLJIIIIZZ);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", strLIZIZ);
                    interfaceC1301370jyB.reject(strLIZIZ);
                    return;
                }
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
                if (bitmapDecodeByteArray != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Load image raw data and decode it with BitmapFactory success: ");
                    sbLIZ3.append(strLJIIIIZZ);
                    C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC1301370jyB.LIZ(bitmapDecodeByteArray);
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Load image success but decode bitmap with BitmapFactory failed: ");
                sbLIZ4.append(strLJIIIIZZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", strLIZIZ2);
                interfaceC1301370jyB.reject(strLIZIZ2);
            }
        };
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Load raw data of image and decode it with BitmapFactory, the url: ");
        sbLIZ2.append(strLJIIIIZZ);
        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        C1301430jyH.LJ().execute(new ARunnableS24S1200000_20(this, strLJIIIIZZ, new C1301320jy6(interfaceC1301360jyA, null), 3));
    }

    @Override // X.AbstractC1301300jy4
    public final void LJFF(String str, C1301480jyM c1301480jyM) {
        final C1301320jy6 c1301320jy6 = new C1301320jy6(null, c1301480jyM);
        LIZJ(str, new InterfaceC1301360jyA() { // from class: X.0jy9
            @Override // X.InterfaceC1301360jyA
            public final void reject(String str2) {
                c1301320jy6.LIZ(str2);
            }

            @Override // X.InterfaceC1301360jyA
            public final void LIZ(byte[] bArr, int i) {
                c1301320jy6.LIZIZ(bArr);
            }
        });
    }

    @Override // X.AbstractC1301300jy4
    public final void LIZLLL(String str, C1301460jyK c1301460jyK, EnumC1301390jyD enumC1301390jyD) {
        if (enumC1301390jyD != EnumC1301390jyD.PREFER_CURRENT_THREAD_FOR_LOCAL_OR_DATA_URI) {
            LIZJ(str, c1301460jyK);
            return;
        }
        String strLJFF = C1301430jyH.LJFF(str);
        C1301320jy6 c1301320jy6 = new C1301320jy6(c1301460jyK, null);
        if (C1301430jyH.LJI(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load base64 type data url in current thread: ");
            sbLIZ.append(strLJFF);
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[readFilePreferCurrentThread] policy branch=data_uri_current_thread, url=");
            sbLIZ2.append(strLJFF);
            sbLIZ2.append(", thread=");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            String strLJFF2 = C1301430jyH.LJFF(str);
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put("url", strLJFF2);
                TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_DATA_URI", map);
            }
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Load resource start decode the data url, the url: ");
                sbLIZ3.append(strLJFF2);
                C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                byte[] bArrLIZJ = C1301430jyH.LIZJ(str);
                if (bArrLIZJ != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Load resource with data url success, the url: ");
                    sbLIZ4.append(strLJFF2);
                    C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
                    c1301320jy6.LIZIZ(bArrLIZJ);
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Load resource with data url failed, the url: ");
                    sbLIZ5.append(strLJFF2);
                    C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ5));
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Decoder return null data with url: ");
                    sbLIZ6.append(strLJFF2);
                    c1301320jy6.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("Load resource with data url with exception, the url: ");
                sbLIZ7.append(strLJFF2);
                C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ7));
                c1301320jy6.LIZ(e.toString());
            }
            TraceEvent.LJII("LYNX_KRYPTON_LOAD_DATA_URI");
            return;
        }
        String strLJIIIIZZ = LJIIIIZZ(str);
        String strLJI = LJI(strLJIIIIZZ);
        if (C1301430jyH.LJIIIIZZ(strLJI)) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append("[readFilePreferCurrentThread] policy branch=local_current_thread, finalPath=");
            sbLIZ8.append(C1301430jyH.LJFF(strLJIIIIZZ));
            sbLIZ8.append(", redirectedPath=");
            sbLIZ8.append(C1301430jyH.LJFF(strLJI));
            sbLIZ8.append(", thread=");
            sbLIZ8.append(C786410Ut5.u3().getName());
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ8));
            LJIIIZ(strLJI, c1301320jy6);
            return;
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("[readFilePreferCurrentThread] policy branch=remote_async_fallback, finalPath=");
        sbLIZ9.append(C1301430jyH.LJFF(strLJIIIIZZ));
        sbLIZ9.append(", redirectedPath=");
        sbLIZ9.append(C1301430jyH.LJFF(strLJI));
        sbLIZ9.append(", thread=");
        sbLIZ9.append(C786410Ut5.u3().getName());
        C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ9));
        C1301430jyH.LJ().execute(new ARunnableS24S1200000_20(this, strLJIIIIZZ, c1301320jy6, 3));
    }

    public static void LJII(String str, InputStream inputStream, int i, C1301320jy6 c1301320jy6) {
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("url", str);
            TraceEvent.LIZJ("LYNX_KRYPTON_HANDLE_STREAM_WITH_RESOLVER", map);
        }
        byte[] bArrLIZLLL = C1301430jyH.LIZLLL(inputStream, i);
        if (bArrLIZLLL != null) {
            int length = bArrLIZLLL.length;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load from stream success with content length: ");
            sbLIZ.append(length);
            sbLIZ.append(" from url: ");
            sbLIZ.append(str);
            C1288370jdD.LIZJ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
            c1301320jy6.LIZIZ(bArrLIZLLL);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Load stream failed from url: ");
            sbLIZ2.append(str);
            C1288370jdD.LIZIZ("LynxKryptonLoaderServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
            c1301320jy6.LIZ("Load stream failed from url!");
        }
        TraceEvent.LJII("LYNX_KRYPTON_HANDLE_STREAM_WITH_RESOLVER");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r0
      0x0024: PHI (r0v6 int) = (r0v5 int), (r0v12 int) binds: [B:6:0x001e, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(java.lang.String r4, java.io.InputStream r5, int r6, X.C1301320jy6 r7) {
        /*
            boolean r0 = com.lynx.tasm.base.TraceController.isTracingStarted()
            java.lang.String r3 = "LYNX_KRYPTON_HANDLE_STREAM_WITH_DELEGATE"
            if (r0 == 0) goto L15
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r0 = "url"
            r1.put(r0, r4)
            com.lynx.tasm.base.TraceEvent.LIZJ(r3, r1)
        L15:
            X.0jfR r0 = r7.LIZIZ     // Catch: java.io.IOException -> L43
            X.0jyM r0 = (X.C1301480jyM) r0     // Catch: java.io.IOException -> L43
            r0.LIZLLL(r6)     // Catch: java.io.IOException -> L43
            r0 = 1024(0x400, float:1.435E-42)
            if (r6 < r0) goto L24
            r0 = 65536(0x10000, float:9.1835E-41)
            if (r6 <= r0) goto L25
        L24:
            r6 = r0
        L25:
            byte[] r2 = new byte[r6]     // Catch: java.io.IOException -> L43
        L27:
            int r1 = r5.read(r2)     // Catch: java.io.IOException -> L43
            r0 = -1
            if (r1 == r0) goto L38
            if (r1 <= 0) goto L27
            X.0jfR r0 = r7.LIZIZ     // Catch: java.io.IOException -> L43
            X.0jyM r0 = (X.C1301480jyM) r0     // Catch: java.io.IOException -> L43
            r0.LIZ(r2, r1)     // Catch: java.io.IOException -> L43
            goto L27
        L38:
            X.0jfR r0 = r7.LIZIZ     // Catch: java.io.IOException -> L43
            X.0jyM r0 = (X.C1301480jyM) r0     // Catch: java.io.IOException -> L43
            r0.LIZIZ()     // Catch: java.io.IOException -> L43
            r5.close()     // Catch: java.io.IOException -> L43
            goto L50
        L43:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.0jfR r1 = r7.LIZIZ
            java.lang.String r0 = "Read stream error"
            X.0jyM r1 = (X.C1301480jyM) r1
            r1.LIZJ(r0)
        L50:
            com.lynx.tasm.base.TraceEvent.LJII(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1301290jy3.LJIIJ(java.lang.String, java.io.InputStream, int, X.0jy6):void");
    }
}
