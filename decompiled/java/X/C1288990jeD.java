package X;

import a17.a0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.canvas.LynxKryptonTelemetryService;
import j27.s;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0jeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1288990jeD extends AbstractC1289010jeF {
    public final WeakReference<s> LIZ;
    public final Context LIZIZ;
    public String LIZJ;
    public AbstractC1301300jy4 LIZLLL;

    public C1288990jeD(s sVar) {
        this.LIZ = new WeakReference<>(sVar);
        this.LIZIZ = C786410Ut5.T3(sVar);
    }

    @Override // X.AbstractC1289010jeF
    public final <T extends a0> T LIZ(Class<T> cls) {
        if (cls == AbstractC1301300jy4.class) {
            s sVar = this.LIZ.get();
            boolean z = false;
            if (C1285890jZD.LIZ("lynx_canvas_enable_using_generic_fetcher", false) && sVar.LLL != null && sVar.LLLF != null) {
                z = true;
            }
            if (z) {
                LynxLog.i("LynxKryptonDefaultServiceLazyLoader", "Krypton using Lynx generic fetcher to load canvas resources.");
                this.LIZLLL = new C1301290jy3(this.LIZ);
            } else {
                LynxLog.i("LynxKryptonDefaultServiceLazyLoader", "Krypton using resource fetcher to load canvas resources.");
                this.LIZLLL = new C1301280jy2(this.LIZ);
            }
            return this.LIZLLL;
        }
        if (cls == AbstractC1289020jeG.class) {
            return new AbstractC1289020jeG() { // from class: X.0jeE
                @Override // X.AbstractC1289020jeG
                public final InterfaceC1304380k32 LIZ() {
                    final Context context = this.LIZ.LIZIZ;
                    InterfaceC1289280jeg interfaceC1289280jeg = (InterfaceC1289280jeg) C1285920jZG.LIZJ().LIZ(InterfaceC1289280jeg.class);
                    final C1289030jeH c1289030jeH = interfaceC1289280jeg == null ? null : new C1289030jeH(interfaceC1289280jeg);
                    return new InterfaceC1304380k32(context, c1289030jeH) { // from class: X.0k35
                        public int LIZ = -1;
                        public int LIZIZ;
                        public int LIZJ;
                        public int LIZLLL;
                        public Camera LJ;
                        public Camera.CameraInfo LJFF;
                        public final Context LJI;
                        public final InterfaceC1289050jeJ LJII;

                        @Override // X.InterfaceC1304380k32
                        public final void pause() throws Throwable {
                            Camera camera = this.LJ;
                            if (camera == null) {
                                return;
                            }
                            C2204961BRm.LJJJZ(camera, new C0WZX("dzBzEg4jUdKSVlYvUxOXKNs2Ng/9T8corIJnXT4Plq6RHjBJKkQUoeKDRA==", null));
                            this.LJ.lock();
                        }

                        @Override // X.InterfaceC1304380k32
                        public final void play() throws Throwable {
                            Camera camera = this.LJ;
                            if (camera == null) {
                                return;
                            }
                            C2204961BRm.LJJJLZIJ(camera, new C0WZX("dzBzEg4jUdKSVlYvUxOXKNs2Ng/9T8corIJnXT4Plq6RHjBJKkQUoeKDRA==", null));
                        }

                        @Override // X.InterfaceC1304380k32
                        public final void release() throws Throwable {
                            Camera camera = this.LJ;
                            if (camera == null) {
                                return;
                            }
                            InterfaceC1289050jeJ interfaceC1289050jeJ = this.LJII;
                            if (interfaceC1289050jeJ != null) {
                                ((C1289030jeH) interfaceC1289050jeJ).LIZ.releaseCamera(camera);
                            } else {
                                C2204961BRm.LJJJLL(camera, new C0WZX("dzBzEg4jUdKSVlYvUxOXKNs2Ng/9T8corIJnXT4Plq6RHjBJKkQUoeKDRA==", null));
                            }
                            this.LJ = null;
                        }

                        @Override // X.InterfaceC1304380k32
                        public final int getHeight() {
                            return this.LIZJ;
                        }

                        @Override // X.InterfaceC1304380k32
                        public final int getWidth() {
                            return this.LIZIZ;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:64:0x0134  */
                        /* JADX WARN: Type inference failed for: r2v10 */
                        /* JADX WARN: Type inference failed for: r2v13 */
                        /* JADX WARN: Type inference failed for: r2v14 */
                        @Override // X.InterfaceC1304380k32
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final boolean LIZ(X.C1304390k33 r12) throws java.lang.Throwable {
                            /*
                                Method dump skipped, instruction units count: 490
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1304410k35.LIZ(X.0k33):boolean");
                        }

                        @Override // X.InterfaceC1304380k32
                        public final void LIZIZ(SurfaceTexture surfaceTexture) {
                            Camera camera = this.LJ;
                            if (camera == null) {
                                return;
                            }
                            try {
                                camera.setPreviewTexture(surfaceTexture);
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("setPreviewTexture exception:");
                                sbLIZ.append(e.toString());
                                C1288370jdD.LIZIZ("Camera default", C2188811AlT.LIZIZ(sbLIZ));
                            }
                        }

                        {
                            this.LJI = context;
                            this.LJII = c1289030jeH;
                        }

                        public static C1304400k34 LIZJ(List list, float f) {
                            Iterator it2 = list.iterator();
                            Camera.Size size = null;
                            while (it2.hasNext()) {
                                Camera.Size size2 = (Camera.Size) it2.next();
                                int i = size2.height;
                                if (i <= f && (size == null || i > size.height)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("update max supported size to (");
                                    sbLIZ.append(size2.width);
                                    sbLIZ.append(",");
                                    sbLIZ.append(size2.height);
                                    sbLIZ.append(")");
                                    C1288370jdD.LIZJ("Camera default", C2188811AlT.LIZIZ(sbLIZ));
                                    size = size2;
                                }
                            }
                            if (size == null) {
                                C1288370jdD.LIZIZ("Camera default", "find max supported preview size error");
                                return null;
                            }
                            return new C1304400k34(size.height, size.width);
                        }
                    };
                }
            };
        }
        if (cls == AbstractC1286080jZW.class) {
            return new AbstractC1286080jZW() { // from class: X.0jZX
                @Override // X.AbstractC1286080jZW
                public final C1286000jZO LIZ() {
                    C1288990jeD c1288990jeD = this.LIZ;
                    c1288990jeD.getClass();
                    C1286100jZY c1286100jZY = new C1286100jZY(c1288990jeD);
                    InterfaceC1289280jeg interfaceC1289280jeg = (InterfaceC1289280jeg) C1285920jZG.LIZJ().LIZ(InterfaceC1289280jeg.class);
                    return new C1286000jZO(c1286100jZY, interfaceC1289280jeg == null ? null : new C1286110jZZ(interfaceC1289280jeg));
                }
            };
        }
        if (cls == AbstractC1304280k2s.class) {
            return new AbstractC1304280k2s() { // from class: X.0jZE
                @Override // X.AbstractC1304280k2s
                public final Object LIZLLL(String str) {
                    return C1285890jZD.LIZIZ(str);
                }

                @Override // X.AbstractC1304280k2s
                public final boolean LIZ(String str, boolean z2) {
                    return C1285890jZD.LIZ(str, z2);
                }

                @Override // X.AbstractC1304280k2s
                public final double LIZIZ(double d, String str) {
                    Object objLIZIZ = C1285890jZD.LIZIZ(str);
                    if (objLIZIZ != null) {
                        if (objLIZIZ instanceof Number) {
                            return ((Number) objLIZIZ).doubleValue();
                        }
                        if (objLIZIZ instanceof Boolean) {
                            if (((Boolean) objLIZIZ).booleanValue()) {
                                return 1.0d;
                            }
                            return 0.0d;
                        }
                        if (!(objLIZIZ instanceof String)) {
                            return d;
                        }
                        try {
                            d = CastDoubleProtector.parseDouble((String) objLIZIZ);
                            return d;
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1288370jdD.LIZLLL("LynxSettingsUtils", e.toString());
                            return d;
                        }
                    }
                    return d;
                }

                @Override // X.AbstractC1304280k2s
                public final int LIZJ(int i, String str) {
                    Object objLIZIZ = C1285890jZD.LIZIZ(str);
                    if (objLIZIZ != null) {
                        if (objLIZIZ instanceof Number) {
                            return ((Number) objLIZIZ).intValue();
                        }
                        if (objLIZIZ instanceof Boolean) {
                            return ((Boolean) objLIZIZ).booleanValue() ? 1 : 0;
                        }
                        if (!(objLIZIZ instanceof String)) {
                            return i;
                        }
                        try {
                            i = CastIntegerProtector.parseInt((String) objLIZIZ);
                            return i;
                        } catch (NumberFormatException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1288370jdD.LIZLLL("LynxSettingsUtils", e.toString());
                            return i;
                        }
                    }
                    return i;
                }

                @Override // X.AbstractC1304280k2s
                public final String LJ(String str, String str2) {
                    Object objLIZIZ = C1285890jZD.LIZIZ(str);
                    if (objLIZIZ != null && (objLIZIZ instanceof String)) {
                        return (String) objLIZIZ;
                    }
                    return str2;
                }
            };
        }
        C1289040jeI c1289040jeI = null;
        if (cls == AbstractC1289250jed.class) {
            Context context = this.LIZIZ;
            InterfaceC1289280jeg interfaceC1289280jeg = (InterfaceC1289280jeg) C1285920jZG.LIZJ().LIZ(InterfaceC1289280jeg.class);
            if (interfaceC1289280jeg != null) {
                c1289040jeI = new C1289040jeI(interfaceC1289280jeg);
            }
            return new C1289240jec(context, c1289040jeI);
        }
        if (cls != AbstractC1286160jZe.class) {
            return null;
        }
        return new LynxKryptonTelemetryService(this.LIZ);
    }
}
