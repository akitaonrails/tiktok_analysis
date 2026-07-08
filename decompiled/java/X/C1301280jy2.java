package X;

import Y.ARunnableS10S2100000_20;
import Y.ARunnableS24S1200000_20;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.base.TraceController;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.service.ILynxImageService;
import j27.s;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jy2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301280jy2 extends AbstractC1301300jy4 {
    public final WeakReference<s> LIZ;
    public InterfaceC1301330jy7 LIZIZ;
    public ILynxImageService LIZJ;

    public C1301280jy2(WeakReference<s> weakReference) {
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
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    @Override // X.AbstractC1301300jy4
    public final String LJI(String str) {
        s sVar;
        String strLJFF = C1301430jyH.LJFF(str);
        if (TraceController.isTracingStarted()) {
            HashMap map = new HashMap();
            map.put("url", strLJFF);
            TraceEvent.LIZJ("LYNX_KRYPTON_LOADER_REDIRECT_URL", map);
        }
        String strLJIIIIZZ = LJIIIIZZ(str);
        if (!C1301430jyH.LJIIIIZZ(strLJIIIIZZ) && !C1301430jyH.LJI(strLJIIIIZZ)) {
            WeakReference<s> weakReference = this.LIZ;
            if (weakReference != null && (sVar = weakReference.get()) != null) {
                String strLIZ = C1294030jmL.LIZ(sVar, strLJIIIIZZ, false);
                if (strLIZ != null && !strLIZ.equals(strLJIIIIZZ)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Redirect the original url: ");
                    sbLIZ.append(strLJIIIIZZ);
                    sbLIZ.append(" to new path: ");
                    sbLIZ.append(strLIZ);
                    C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
                    TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
                    return strLIZ;
                }
                TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
                return strLJIIIIZZ;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LynxContext null, redirect failed with url: ");
            sbLIZ2.append(strLJFF);
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
            TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
            return strLJIIIIZZ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Local path and base64 path redirect with original url: ");
        sbLIZ3.append(strLJFF);
        C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ3));
        TraceEvent.LJII("LYNX_KRYPTON_LOADER_REDIRECT_URL");
        return strLJIIIIZZ;
    }

    public static final void LJIIIZ(String str, InterfaceC1301370jyB interfaceC1301370jyB) {
        String strLJFF = C1301430jyH.LJFF(str);
        try {
            Bitmap bitmapLIZIZ = C1301430jyH.LIZIZ(str);
            if (bitmapLIZIZ != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Decode base64 image success with image: ");
                sbLIZ.append(strLJFF);
                C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
                interfaceC1301370jyB.LIZ(bitmapLIZIZ);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Empty base64 image: ");
            sbLIZ2.append(strLJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", strLIZIZ);
            interfaceC1301370jyB.reject(strLIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Decode base64 image: ");
            sbLIZ3.append(strLJFF);
            sbLIZ3.append(" with error: ");
            sbLIZ3.append(e.getMessage());
            interfaceC1301370jyB.reject(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public static void LJIIJ(String str, C1301310jy5 c1301310jy5) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Handle local path resource: ");
        sbLIZ.append(str);
        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
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
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
            try {
                if (c1301310jy5.LIZIZ != null) {
                    LJIIJJI(str, inputStreamLJIIIZ, inputStreamLJIIIZ.available(), c1301310jy5);
                } else {
                    LJII(str, inputStreamLJIIIZ, inputStreamLJIIIZ.available(), c1301310jy5);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Handle local path resource with exception: ");
                sbLIZ3.append(e.toString());
                sbLIZ3.append(" url: ");
                sbLIZ3.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                C1288370jdD.LIZIZ("KryptonCanvasLoaderService", strLIZIZ);
                c1301310jy5.LIZ(strLIZIZ);
            }
        } else {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Handle local path resource failed.  path: ");
            sbLIZ4.append(str);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", strLIZIZ2);
            c1301310jy5.LIZ(strLIZIZ2);
        }
        TraceEvent.LJII("LYNX_KRYPTON_LOAD_LOCAL_PATH_RESOURCE");
    }

    @Override // X.AbstractC1301300jy4
    public final void LIZJ(String str, InterfaceC1301360jyA interfaceC1301360jyA) {
        C1301310jy5 c1301310jy5 = new C1301310jy5(interfaceC1301360jyA, null);
        if (str == null) {
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", "Load data with invalid null url");
            interfaceC1301360jyA.reject("Failed with invalid null url");
            return;
        }
        if (C1301430jyH.LJI(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load resource with data url: ");
            sbLIZ.append(C1301430jyH.LJFF(str));
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
            String strLJFF = C1301430jyH.LJFF(str);
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put("url", strLJFF);
                TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_DATA_URI", map);
            }
            C1301430jyH.LJ().execute(new ARunnableS10S2100000_20(c1301310jy5, strLJFF, str, 0));
            TraceEvent.LJII("LYNX_KRYPTON_LOAD_DATA_URI");
            return;
        }
        LJIILJJIL(LJIIIIZZ(str), c1301310jy5);
    }

    @Override // X.AbstractC1301300jy4
    public final void LJ(String str, InterfaceC1301370jyB interfaceC1301370jyB) {
        if (str == null) {
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", "Load image with invalid null url");
            interfaceC1301370jyB.reject("Failed image invalid null url");
        } else {
            LJIIL(new C1301380jyC(false, false), interfaceC1301370jyB, LJIIIIZZ(str));
        }
    }

    @Override // X.AbstractC1301300jy4
    public final void LJFF(String str, C1301480jyM c1301480jyM) {
        C1301310jy5 c1301310jy5 = new C1301310jy5(null, c1301480jyM);
        if (str == null) {
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", "Load data with invalid null url");
            c1301310jy5.LIZ("Failed with invalid null url");
        } else {
            if (C1301430jyH.LJI(str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Do not handle data url with stream loader! The url is: ");
                sbLIZ.append(C1301430jyH.LJFF(str));
                c1301310jy5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            LJIILJJIL(LJIIIIZZ(str), c1301310jy5);
        }
    }

    public final void LJIILIIL(final String str, final C1301310jy5 c1301310jy5) {
        s sVar;
        if (this.LIZIZ == null) {
            this.LIZIZ = (InterfaceC1301330jy7) C1285920jZG.LIZJ().LIZ(InterfaceC1301330jy7.class);
        }
        InterfaceC1301330jy7 interfaceC1301330jy7 = this.LIZIZ;
        if (interfaceC1301330jy7 != null && interfaceC1301330jy7.isReady()) {
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put("url", str);
                TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_WITH_RESOURCE_SERVICE", map);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load url : ");
            sbLIZ.append(str);
            sbLIZ.append(" with LynxResourceService.");
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
            final String strLJI = LJI(str);
            if (C1301430jyH.LJIIIIZZ(strLJI)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("The redirected url is a local path: ,");
                sbLIZ2.append(strLJI);
                sbLIZ2.append(" handle local path.");
                C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
                LJIIJ(strLJI, c1301310jy5);
                TraceEvent.LJII("LYNX_KRYPTON_LOAD_WITH_RESOURCE_SERVICE");
                return;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Load from remote by LynxResourceService with url: ");
            sbLIZ3.append(strLJI);
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ3));
            C1530360pvW c1530360pvW = new C1530360pvW();
            c1530360pvW.LIZIZ = Boolean.TRUE;
            if (this.LIZIZ == null) {
                this.LIZIZ = (InterfaceC1301330jy7) C1285920jZG.LIZJ().LIZ(InterfaceC1301330jy7.class);
            }
            InterfaceC1301330jy7 interfaceC1301330jy72 = this.LIZIZ;
            if (interfaceC1301330jy72 != null && interfaceC1301330jy72.isReady()) {
                interfaceC1301330jy72.fetchResourceAsync(strLJI, c1530360pvW, new AbstractC1289780jfU() { // from class: X.0jfS
                    @Override // X.AbstractC1289780jfU
                    public final void LIZ(InterfaceC1289770jfT interfaceC1289770jfT) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("LynxResourceService request success with url: ");
                        sbLIZ4.append(strLJI);
                        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ4));
                        InputStream inputStreamLIZIZ = interfaceC1289770jfT.LIZIZ();
                        if (interfaceC1289770jfT.LIZJ().booleanValue() && inputStreamLIZIZ != null) {
                            try {
                                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                sbLIZ5.append("Load response's stream from LynxResourceService with url: ");
                                sbLIZ5.append(strLJI);
                                C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ5));
                                if (c1301310jy5.LIZIZ != null) {
                                    C1301280jy2 c1301280jy2 = this;
                                    String str2 = str;
                                    int iAvailable = inputStreamLIZIZ.available();
                                    C1301310jy5 c1301310jy52 = c1301310jy5;
                                    c1301280jy2.getClass();
                                    C1301280jy2.LJIIJJI(str2, inputStreamLIZIZ, iAvailable, c1301310jy52);
                                    return;
                                }
                                C1301280jy2 c1301280jy22 = this;
                                String str3 = str;
                                int iAvailable2 = inputStreamLIZIZ.available();
                                C1301310jy5 c1301310jy53 = c1301310jy5;
                                c1301280jy22.getClass();
                                C1301280jy2.LJII(str3, inputStreamLIZIZ, iAvailable2, c1301310jy53);
                                return;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append("load from remote exception: ");
                                sbLIZ6.append(e.toString());
                                sbLIZ6.append(" url: ");
                                sbLIZ6.append(strLJI);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
                                C1288370jdD.LIZIZ("KryptonCanvasLoaderService", strLIZIZ);
                                c1301310jy5.LIZ(strLIZIZ);
                                return;
                            }
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("request by LynxResourceService failed. ");
                        sbLIZ7.append(interfaceC1289770jfT.LIZLLL());
                        sbLIZ7.append(" url: ");
                        sbLIZ7.append(strLJI);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                        C1288370jdD.LIZIZ("KryptonCanvasLoaderService", strLIZIZ2);
                        c1301310jy5.LIZ(strLIZIZ2);
                    }
                });
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("No LynxResourceService existed, LynxResourceService request failed with url: ");
                sbLIZ4.append(strLJI);
                C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ4));
                c1301310jy5.LIZ("No LynxResourceService existed");
            }
            TraceEvent.LJII("LYNX_KRYPTON_LOAD_WITH_RESOURCE_SERVICE");
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("Load url : ");
        sbLIZ5.append(str);
        sbLIZ5.append(" with ResManager.");
        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ5));
        if (TraceController.isTracingStarted()) {
            HashMap map2 = new HashMap();
            map2.put("url", str);
            TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_WITH_RES_MANAGER", map2);
        }
        WeakReference<s> weakReference = this.LIZ;
        Object obj = null;
        if (weakReference != null) {
            sVar = weakReference.get();
        } else {
            sVar = null;
        }
        if (sVar != null) {
            obj = sVar.LLJLLL;
        }
        C846680XJi.LIZ().LIZIZ(new C1288950je9(str, obj), new InterfaceC846700XJk() { // from class: X.0jfQ
            @Override // X.InterfaceC846700XJk
            public final void LIZ(C846690XJj c846690XJj) {
                int iAvailable;
                InputStream inputStream = c846690XJj.LIZJ;
                this.LIZJ.getClass();
                InputStream inputStream2 = c846690XJj.LIZJ;
                if (inputStream2 == null) {
                    iAvailable = 0;
                } else {
                    try {
                        iAvailable = inputStream2.available();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        iAvailable = 0;
                    }
                    if (iAvailable <= 0) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("no length from stream, responseContentLength = ");
                        sbLIZ6.append(0);
                        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ6));
                    }
                }
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("ResManager load success with url : ");
                sbLIZ7.append(str);
                sbLIZ7.append(" ,the total content length of the file is: ");
                sbLIZ7.append(iAvailable);
                C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ7));
                C1301310jy5 c1301310jy52 = c1301310jy5;
                if (c1301310jy52.LIZIZ != null) {
                    C1301280jy2 c1301280jy2 = this.LIZJ;
                    String str2 = str;
                    c1301280jy2.getClass();
                    C1301280jy2.LJIIJJI(str2, inputStream, iAvailable, c1301310jy52);
                    return;
                }
                C1301280jy2 c1301280jy22 = this.LIZJ;
                String str3 = str;
                c1301280jy22.getClass();
                C1301280jy2.LJII(str3, inputStream, iAvailable, c1301310jy52);
            }

            @Override // X.InterfaceC846700XJk
            public final void LIZIZ(C846690XJj c846690XJj) {
                String str2 = c846690XJj.LIZIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("ResManager load url: ");
                sbLIZ6.append(str);
                sbLIZ6.append(" ,failed with error ");
                sbLIZ6.append(str2);
                C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ6));
                c1301310jy5.LIZ(str2);
            }
        });
        TraceEvent.LJII("LYNX_KRYPTON_LOAD_WITH_RES_MANAGER");
    }

    public final void LJIILJJIL(String str, C1301310jy5 c1301310jy5) {
        C1301430jyH.LJ().execute(new ARunnableS24S1200000_20(this, str, c1301310jy5, 0));
    }

    @Override // X.AbstractC1301300jy4
    public final void LIZ(C1301380jyC c1301380jyC, C1301490jyN c1301490jyN, String str) {
        if (str != null && !str.isEmpty()) {
            LJIIL(c1301380jyC, c1301490jyN, LJIIIIZZ(str));
        } else {
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", "Load image with invalid null url");
            c1301490jyN.reject("Failed image invalid null url");
        }
    }

    @Override // X.AbstractC1301300jy4
    public final void LIZLLL(String str, C1301460jyK c1301460jyK, EnumC1301390jyD enumC1301390jyD) {
        if (enumC1301390jyD != EnumC1301390jyD.PREFER_CURRENT_THREAD_FOR_LOCAL_OR_DATA_URI) {
            LIZJ(str, c1301460jyK);
            return;
        }
        C1301310jy5 c1301310jy5 = new C1301310jy5(c1301460jyK, null);
        if (str == null) {
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", "Load data with invalid null url");
            c1301460jyK.reject("Failed with invalid null url");
            return;
        }
        if (C1301430jyH.LJI(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Load resource with data url in current thread: ");
            sbLIZ.append(C1301430jyH.LJFF(str));
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[readFilePreferCurrentThread] policy branch=data_uri_current_thread, url=");
            sbLIZ2.append(C1301430jyH.LJFF(str));
            sbLIZ2.append(", thread=");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
            String strLJFF = C1301430jyH.LJFF(str);
            if (TraceController.isTracingStarted()) {
                HashMap map = new HashMap();
                map.put("url", strLJFF);
                TraceEvent.LIZJ("LYNX_KRYPTON_LOAD_DATA_URI", map);
            }
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Load resource start decode the data url, the url: ");
                sbLIZ3.append(strLJFF);
                C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ3));
                byte[] bArrLIZJ = C1301430jyH.LIZJ(str);
                if (bArrLIZJ != null) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Load resource with data url success, the url: ");
                    sbLIZ4.append(strLJFF);
                    C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ4));
                    c1301310jy5.LIZIZ(bArrLIZJ);
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("Load resource with data url failed, the url: ");
                    sbLIZ5.append(strLJFF);
                    C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ5));
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("Decoder return null data with url: ");
                    sbLIZ6.append(strLJFF);
                    c1301310jy5.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
                }
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("Load resource with data url with exception, the url: ");
                sbLIZ7.append(strLJFF);
                C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ7));
                c1301310jy5.LIZ(e.toString());
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
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ8));
            LJIIJ(strLJI, c1301310jy5);
            return;
        }
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("[readFilePreferCurrentThread] policy branch=remote_async_fallback, finalPath=");
        sbLIZ9.append(C1301430jyH.LJFF(strLJIIIIZZ));
        sbLIZ9.append(", redirectedPath=");
        sbLIZ9.append(C1301430jyH.LJFF(strLJI));
        sbLIZ9.append(", thread=");
        sbLIZ9.append(C786410Ut5.u3().getName());
        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ9));
        LJIILJJIL(strLJIIIIZZ, c1301310jy5);
    }

    public final void LJIIL(C1301380jyC c1301380jyC, final InterfaceC1301370jyB interfaceC1301370jyB, final String str) {
        if (this.LIZJ == null) {
            this.LIZJ = (ILynxImageService) C1285920jZG.LIZJ().LIZ(ILynxImageService.class);
        }
        ILynxImageService iLynxImageService = this.LIZJ;
        boolean z = c1301380jyC.LIZIZ;
        boolean z2 = c1301380jyC.LIZ;
        if (!z && iLynxImageService != null) {
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", "Handle image load with the LynxImageService.");
            C1301430jyH.LJ().execute(new ARunnableS24S1200000_20(this, str, interfaceC1301370jyB, 1));
            return;
        }
        C1288370jdD.LIZJ("KryptonCanvasLoaderService", "LynxImageService is not ready, Load and decode image with BitmapFactory.");
        if (C1301430jyH.LJI(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Handle base64 type image with url: ");
            sbLIZ.append(C1301430jyH.LJFF(str));
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
            if (!z2) {
                C1301430jyH.LJ().execute(new ARunnableS24S1200000_20(this, str, interfaceC1301370jyB, 2));
                return;
            } else {
                LJIIIZ(str, interfaceC1301370jyB);
                return;
            }
        }
        InterfaceC1301360jyA interfaceC1301360jyA = new InterfaceC1301360jyA() { // from class: X.0jyF
            @Override // X.InterfaceC1301360jyA
            public final void reject(String str2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Load image data failed with url: ");
                sbLIZ2.append(str);
                sbLIZ2.append(" ,the error message: ");
                sbLIZ2.append(str2);
                C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
                interfaceC1301370jyB.reject(str2);
            }

            @Override // X.InterfaceC1301360jyA
            public final void LIZ(byte[] bArr, int i) {
                if (C1301430jyH.LJII(bArr)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Cannot handle heif file type image, the url is: ");
                    sbLIZ2.append(str);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C1288370jdD.LIZIZ("KryptonCanvasLoaderService", strLIZIZ);
                    interfaceC1301370jyB.reject(strLIZIZ);
                    return;
                }
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i);
                if (bitmapDecodeByteArray != null) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Load image raw data and decode it with BitmapFactory success: ");
                    sbLIZ3.append(str);
                    C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC1301370jyB.LIZ(bitmapDecodeByteArray);
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("Load image success but decode bitmap with BitmapFactory failed: ");
                sbLIZ4.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                C1288370jdD.LIZIZ("KryptonCanvasLoaderService", strLIZIZ2);
                interfaceC1301370jyB.reject(strLIZIZ2);
            }
        };
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Load raw data of image and decode it with BitmapFactory, the url: ");
        sbLIZ2.append(str);
        C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
        if (z2) {
            LJIILIIL(str, new C1301310jy5(interfaceC1301360jyA, null));
        } else {
            LJIILJJIL(str, new C1301310jy5(interfaceC1301360jyA, null));
        }
    }

    public static void LJII(String str, InputStream inputStream, int i, C1301310jy5 c1301310jy5) {
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
            C1288370jdD.LIZJ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ));
            c1301310jy5.LIZIZ(bArrLIZLLL);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Load stream failed from url: ");
            sbLIZ2.append(str);
            C1288370jdD.LIZIZ("KryptonCanvasLoaderService", C2188811AlT.LIZIZ(sbLIZ2));
            c1301310jy5.LIZ("Load stream failed from url!");
        }
        TraceEvent.LJII("LYNX_KRYPTON_HANDLE_STREAM_WITH_RESOLVER");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024 A[PHI: r0
      0x0024: PHI (r0v6 int) = (r0v5 int), (r0v12 int) binds: [B:6:0x001e, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJJI(java.lang.String r4, java.io.InputStream r5, int r6, X.C1301310jy5 r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1301280jy2.LJIIJJI(java.lang.String, java.io.InputStream, int, X.0jy5):void");
    }
}
