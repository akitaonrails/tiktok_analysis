package X;

import android.app.Application;
import android.content.res.AssetManager;
import com.bytedance.forest.Forest;
import com.bytedance.forest.bridge.ForestBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.tiktok.forestx.config.ForestXEnvData;
import com.tiktok.forestx.net.DefaultNetApi;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pzG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532680pzG {
    public static long LIZIZ;
    public static String LIZJ;
    public static ForestXEnvData LJFF;
    public static h LJI;
    public static String LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIIZ;
    public static boolean LJIIJ;
    public static boolean LJIIJJI;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static int LJIILLIIL;
    public static boolean LJIJ;
    public static C1531950py5 LJIJJ;
    public static C07QY LJIL;
    public static final boolean LJJI;
    public static InterfaceC1502280pCE LJJIFFI;
    public static final HashSet<AbstractC1532320pyg<?, ?>> LJJII;
    public static final HashSet<Class<? extends AbstractC1532320pyg<?, ?>>> LJJIII;
    public static final HashMap<Class<?>, HashSet<Class<?>>> LJJIIJ;
    public static boolean LJJIIJZLJL;
    public static Function0<String> LJJIIZ;
    public static final C1532680pzG LIZ = new C1532680pzG();
    public static String LIZLLL = "";
    public static String LJ = "";
    public static long LJIILJJIL = 80;
    public static final long LJIILL = 20000;
    public static boolean LJIIZILJ = true;
    public static final List<String> LJIJI = C1697810uHb.LJIIJJI("gecko", "assets", "cdn");
    public static final C1502310pCH LJIJJLI = new C1502310pCH();
    public static C1532950pzh LJJ = new C1532950pzh(new C1533300q0G("default", "", (C1533330q0J) null, (List) (0 == true ? 1 : 0), 28));

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C1535890q4R.LIZ.getClass();
        LJJI = C1535890q4R.LIZIZ;
        LJJIFFI = DefaultNetApi.LIZ;
        LJJII = C093Y.LIZJ(new AbstractC1532320pyg<byte[], InputStream>() { // from class: X.0pxa
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC1532320pyg
            public final int LJI() {
                return 1;
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "Bytes2Stream";
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1532320pyg
            public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
                Object c098200Yq;
                C1531000pwY c1531000pwY;
                C1532030pyD c1532030pyD = new C1532030pyD((byte[]) abstractC1532350pyj.LIZ, null, null, false, null, null);
                try {
                    c098200Yq = c1532030pyD.LJIILJJIL(c1532710pzJ);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                InputStream inputStream = (InputStream) c098200Yq;
                if (inputStream != null) {
                    c1531000pwY = new C1531000pwY(inputStream, c1532030pyD);
                } else {
                    c1531000pwY = null;
                }
                function1.invoke(new C1532340pyi(c1531000pwY, null));
            }
        }, new AbstractC1532320pyg<ByteBuffer, InputStream>() { // from class: X.0pxc
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC1532320pyg
            public final int LJI() {
                return 2;
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "Buffer2Stream";
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1532320pyg
            public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
                C1531690pxf c1531690pxf = new C1531690pxf((ByteBuffer) abstractC1532350pyj.LIZ, c1532710pzJ);
                function1.invoke(new C1532340pyi(new C1531000pwY(c1531690pxf, c1531690pxf), null));
            }
        }, new AbstractC1532320pyg<File, InputStream>() { // from class: X.0pxY
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC1532320pyg
            public final int LJI() {
                return 4;
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "File2Stream";
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1532320pyg
            public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, final C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, final C1532340pyi c1532340pyi, Function1 function1) {
                Object c098200Yq;
                final File file = (File) abstractC1532350pyj.LIZ;
                final boolean zLJFF = Intrinsics.LJFF(c1532170pyR.LIZIZ, "assets");
                InterfaceC1530990pwX interfaceC1530990pwX = new InterfaceC1530990pwX() { // from class: X.0pxX
                    @Override // X.InterfaceC1530990pwX
                    public final InputStream LJFF(C1532710pzJ c1532710pzJ2) {
                        Object c098200Yq2;
                        String strLIZ;
                        boolean z = zLJFF;
                        C1532340pyi c1532340pyi2 = c1532340pyi;
                        C1532170pyR c1532170pyR2 = c1532170pyR;
                        File file2 = file;
                        try {
                            if (z) {
                                C1532680pzG.LIZ.getClass();
                                AssetManager assets = C1532680pzG.LIZIZ().getAssets();
                                InterfaceC1532190pyT interfaceC1532190pyT = c1532340pyi2.LIZIZ;
                                if ((interfaceC1532190pyT == null || (strLIZ = interfaceC1532190pyT.getFilepath()) == null) && (strLIZ = c1532170pyR2.LIZ()) == null) {
                                    strLIZ = a0.LJJJJZ("/", file2.getAbsolutePath());
                                }
                                c098200Yq2 = assets.open(strLIZ);
                            } else {
                                c098200Yq2 = new C0VSP(file2);
                            }
                            C189200o6.m2constructorimpl(c098200Yq2);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq2 = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq2);
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                            c098200Yq2 = null;
                        }
                        return (InputStream) c098200Yq2;
                    }
                };
                InputStream inputStreamLJFF = interfaceC1530990pwX.LJFF(c1532710pzJ);
                if (inputStreamLJFF == null) {
                    function1.invoke(null);
                    return;
                }
                try {
                    c098200Yq = new C1531000pwY(inputStreamLJFF, interfaceC1530990pwX);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                function1.invoke(new C1532340pyi((AbstractC1532350pyj) c098200Yq, null));
            }
        }, new AbstractC1532320pyg<InputStream, byte[]>() { // from class: X.0pxi
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "OfflineStream2Bytes";
            }

            @Override // X.AbstractC1532320pyg, X.InterfaceC1532520pz0
            public final boolean LJFF() {
                InterfaceC1531740pxk interfaceC1531740pxk = C1531760pxm.LIZ;
                return !((interfaceC1531740pxk != null ? interfaceC1531740pxk.LIZIZ() : null) == EnumC1529850puh.STRESSFUL);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Not initialized variable reg: 1, insn: 0x00b2: INVOKE (r1 I:kotlin.jvm.functions.Function1), (r8 I:java.lang.Object) INTERFACE call: kotlin.jvm.functions.Function1.invoke(java.lang.Object):java.lang.Object A[MD:(P1):R (m)] (LINE:100663474), block:B:33:0x009c */
            @Override // X.AbstractC1532320pyg
            public final void LJII(C1532710pzJ c1532710pzJ, C1532470pyv c1532470pyv, C1532170pyR c1532170pyR, AbstractC1532350pyj abstractC1532350pyj, C1532340pyi c1532340pyi, Function1 function1) {
                Function1 function1Invoke;
                C0VSJ c0vsj;
                C1532030pyD c1532030pyD;
                String filepath;
                String message;
                C1532020pyC c1532020pyC;
                try {
                    InputStream inputStream = (InputStream) abstractC1532350pyj.LIZ;
                    if (!(inputStream instanceof C1532020pyC) || (c1532020pyC = (C1532020pyC) inputStream) == null || (c1532030pyD = c1532020pyC.LLILLJJLI) == null) {
                        if (inputStream instanceof C1531700pxg) {
                            c1532030pyD = ((C1531700pxg) inputStream).LIZ();
                            if (c1532030pyD == null) {
                                C1532760pzO.LIZIZ(C1532920pze.LIZJ, "OfflineStream2Bytes", "process", "failed to provide ForestBuffer from stream, " + inputStream, null, null, 48);
                                function1.invoke(new C1532340pyi(null, c1532340pyi.LIZIZ));
                                return;
                            }
                        } else {
                            InterfaceC1532190pyT interfaceC1532190pyT = c1532340pyi.LIZIZ;
                            if (interfaceC1532190pyT != null && (filepath = interfaceC1532190pyT.getFilepath()) != null) {
                                c0vsj = new C0VSJ(filepath);
                            } else {
                                c0vsj = null;
                            }
                            c1532030pyD = new C1532030pyD(inputStream, (Integer) null, false, (File) c0vsj, 14);
                        }
                    }
                    c1532030pyD.LJIILL(c1532710pzJ);
                    byte[] bArrLJIILIIL = c1532030pyD.LJIILIIL();
                    if (bArrLJIILIIL != null) {
                        function1.invoke(new C1532340pyi(new C1519990pen(bArrLJIILIIL), null));
                        return;
                    }
                    StringBuilder sb = new StringBuilder("load to memory failed, error: ");
                    Throwable th = c1532030pyD.LLILZ;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sb.append(message);
                    c1532470pyv.LIZ(sb.toString());
                    function1.invoke(null);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("process error: ");
                    sbLIZ.append(th2);
                    c1532470pyv.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    function1Invoke.invoke(null);
                }
            }
        }, new AbstractC1532320pyg<InputStream, InputStream>() { // from class: X.0pyP
            @Override // X.InterfaceC1532520pz0
            public final boolean LIZ() {
                return false;
            }

            @Override // X.AbstractC1532320pyg
            public final int LJI() {
                return 1;
            }

            @Override // X.InterfaceC1532520pz0
            public final String getName() {
                return "Stream2Stream";
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
            /* JADX WARN: Type inference failed for: r1v1, types: [Type, X.0pxg] */
            /* JADX WARN: Type inference failed for: r1v5 */
            /* JADX WARN: Type inference failed for: r1v6 */
            @Override // X.AbstractC1532320pyg
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJII(X.C1532710pzJ r8, X.C1532470pyv r9, X.C1532170pyR r10, X.AbstractC1532350pyj r11, X.C1532340pyi r12, kotlin.jvm.functions.Function1 r13) {
                /*
                    r7 = this;
                    Type r6 = r11.LIZ
                    java.io.InputStream r6 = (java.io.InputStream) r6
                    boolean r0 = r6 instanceof X.InterfaceC1531770pxn
                    r5 = 0
                    if (r0 == 0) goto L18
                    r0 = r6
                    X.0pxn r0 = (X.InterfaceC1531770pxn) r0
                    if (r0 == 0) goto L18
                    X.0pyD r0 = r0.LIZIZ()
                    if (r0 == 0) goto L18
                    r13.invoke(r12)
                    return
                L18:
                    java.lang.Class<?> r0 = r8.LIZLLL
                    java.lang.Class<byte[]> r2 = byte[].class
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                    r3 = 1
                    if (r0 != 0) goto L45
                    java.util.LinkedList<kotlin.Pair<?, X.0pyg<?, ?>>> r0 = r10.LJIIL
                    if (r0 == 0) goto La8
                    java.util.Iterator r1 = r0.iterator()
                L2b:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto La8
                    java.lang.Object r0 = r1.next()
                    kotlin.Pair r0 = (kotlin.Pair) r0
                    java.lang.Object r0 = r0.getSecond()
                    X.0pyg r0 = (X.AbstractC1532320pyg) r0
                    java.lang.Class<Output> r0 = r0.LIZIZ
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)
                    if (r0 == 0) goto L2b
                L45:
                    r4 = 1
                L46:
                    boolean r0 = r6 instanceof X.C1531700pxg
                    if (r0 == 0) goto L4f
                    r1 = r6
                    X.0pxg r1 = (X.C1531700pxg) r1
                    if (r1 != 0) goto L6b
                L4f:
                    r2 = r4 ^ 1
                    X.0pyT r0 = r12.LIZIZ
                    if (r0 == 0) goto L5b
                    java.lang.String r0 = r0.getFilepath()
                    if (r0 != 0) goto L61
                L5b:
                    java.lang.String r0 = r10.LIZ()
                    if (r0 == 0) goto L66
                L61:
                    X.0VSJ r5 = new X.0VSJ
                    r5.<init>(r0)
                L66:
                    X.0pxg r1 = new X.0pxg
                    r1.<init>(r8, r6, r2, r5)
                L6b:
                    if (r4 != 0) goto L75
                    X.0qCo<X.0pyf> r0 = r8.LJJIIZI
                    if (r0 == 0) goto L7e
                    boolean r0 = r0.LJIIJ
                    if (r0 != r3) goto L7e
                L75:
                    r1.LJII()
                L78:
                    r11.LIZ = r1
                    r13.invoke(r12)
                    return
                L7e:
                    X.0pye r0 = r10.LIZ
                    if (r0 == 0) goto L78
                    X.0qCo<?> r2 = r0.LIZ
                    X.0qCZ r0 = r2.LIZ
                    boolean r0 = r0.LIZ
                    if (r0 == 0) goto L99
                    X.0qCz r0 = r2.LJIILLIIL
                    java.util.concurrent.atomic.AtomicInteger r0 = r0.LIZ
                    int r0 = r0.get()
                    if (r0 < 0) goto L78
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    if (r0 <= r3) goto L78
                    goto L75
                L99:
                    X.0qCz r0 = r2.LJIILLIIL
                    java.util.concurrent.atomic.AtomicInteger r0 = r0.LIZ
                    int r0 = r0.get()
                    if (r0 < 0) goto L78
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    if (r0 <= 0) goto L78
                    goto L75
                La8:
                    r4 = 0
                    goto L46
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1532150pyP.LJII(X.0pzJ, X.0pyv, X.0pyR, X.0pyj, X.0pyi, kotlin.jvm.functions.Function1):void");
            }
        });
        LJJIII = C093Y.LIZJ(C1531640pxa.class, C1531660pxc.class, C1531670pxd.class, C1531750pxl.class, C1531650pxb.class, C1531620pxY.class, C1531730pxj.class, C1531780pxo.class, C1531630pxZ.class);
        LJJIIJ = new HashMap<>();
        LJJIIZ = AFwS212S0000000_23.get$arr$(114);
    }

    public static Application LIZIZ() {
        InterfaceC1532860pzY.LIZ.getClass();
        Application application = C1532910pzd.LIZIZ;
        if (application != null) {
            return application;
        }
        C1532760pzO.LIZIZ(C1532920pze.LIZJ, "ForestGlobalConfigX", "getApp", "cannot get application", null, null, 48);
        return new Application();
    }

    public static void LIZLLL() {
        C1532810pzT.LIZ = new ForestBridge() { // from class: X.0q0L
            @Override // com.bytedance.forest.bridge.ForestBridge
            public final InterfaceC1534830q2j createResourceChain(C1533790q13 c1533790q13) {
                final C1532950pzh c1532950pzh;
                C1533330q0J c1533330q0J;
                C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
                Iterator<String> it2 = c1533490q0Z.LJJJLL.iterator();
                do {
                    ArrayList arrayList = null;
                    if (it2.hasNext()) {
                    } else {
                        Forest forest = c1533490q0Z.LJJJJJ;
                        if (Intrinsics.LJFF(forest.getName(), "SparkContainerForest")) {
                            C1532680pzG.LIZ.getClass();
                            c1532950pzh = C1532680pzG.LJJ;
                        } else {
                            c1532950pzh = C1533380q0O.LIZ.get(forest);
                            if (c1532950pzh == null) {
                                C1533570q0h c1533570q0h = forest.getConfig().LIZIZ;
                                if (c1533570q0h != null) {
                                    c1533330q0J = new C1533330q0J(c1533570q0h.LIZ, c1533570q0h.LIZIZ, c1533570q0h.LJI);
                                    c1533330q0J.LIZLLL = c1533570q0h.LJII;
                                    c1533330q0J.LJ = c1533570q0h.LJIIIIZZ;
                                    c1533330q0J.LJFF = c1533570q0h.LJIIIZ;
                                } else {
                                    c1533330q0J = null;
                                }
                                Map<String, C1533570q0h> map = forest.getConfig().LIZJ;
                                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                                Iterator<T> it3 = map.entrySet().iterator();
                                while (it3.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it3.next();
                                    Object key = entry.getKey();
                                    C1533570q0h c1533570q0h2 = (C1533570q0h) entry.getValue();
                                    C1533330q0J c1533330q0J2 = new C1533330q0J(c1533570q0h2.LIZ, c1533570q0h2.LIZIZ, c1533570q0h2.LJI);
                                    c1533330q0J2.LIZLLL = c1533570q0h2.LJII;
                                    c1533330q0J2.LJ = c1533570q0h2.LJIIIIZZ;
                                    c1533330q0J2.LJFF = c1533570q0h2.LJIIIZ;
                                    linkedHashMap.put(key, c1533330q0J2);
                                }
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                                if (!(!linkedHashMap2.isEmpty())) {
                                    linkedHashMap2 = null;
                                }
                                String name = forest.getName();
                                String str = forest.getConfig().LIZ;
                                List<String> list = forest.getConfig().LIZLLL;
                                if (list != null) {
                                    arrayList = new ArrayList(list);
                                }
                                c1532950pzh = new C1532950pzh(new C1533300q0G(name, str, c1533330q0J, linkedHashMap2, arrayList));
                                C1533380q0O.LIZ.put(forest, c1532950pzh);
                            }
                        }
                        return new InterfaceC1533470q0X(c1532950pzh) { // from class: X.0q0T
                            public final C1532950pzh LIZ;
                            public volatile C1541080qCo<C1532310pyf> LIZIZ;

                            @Override // X.InterfaceC1534830q2j
                            public final boolean cancel() {
                                C1541080qCo<C1532310pyf> c1541080qCo = this.LIZIZ;
                                return c1541080qCo != null && c1541080qCo.cancel();
                            }

                            {
                                this.LIZ = c1532950pzh;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
                            @Override // X.InterfaceC1534830q2j
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final boolean LIZ(X.C1533490q0Z r10, X.C1533790q13 r11, kotlin.jvm.functions.Function1<? super X.C1533790q13, kotlin.Unit> r12) {
                                /*
                                    Method dump skipped, instruction units count: 478
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1533430q0T.LIZ(X.0q0Z, X.0q13, kotlin.jvm.functions.Function1):boolean");
                            }
                        };
                    }
                } while (C1531170pwp.LIZ.contains(it2.next()));
                return null;
            }
        };
    }

    public final void LIZ() {
        Object c098200Yq;
        if (LJJIIJZLJL) {
            return;
        }
        synchronized (this) {
            try {
                if (LJJIIJZLJL) {
                    return;
                }
                Iterator<Class<? extends AbstractC1532320pyg<?, ?>>> it2 = LJJIII.iterator();
                while (it2.hasNext()) {
                    try {
                        c098200Yq = (InterfaceC1532800pzS) it2.next().getAnnotation(InterfaceC1532800pzS.class);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = null;
                    }
                    InterfaceC1532800pzS interfaceC1532800pzS = (InterfaceC1532800pzS) c098200Yq;
                    if (interfaceC1532800pzS != null) {
                        HashMap<Class<?>, HashSet<Class<?>>> map = LJJIIJ;
                        Class<?> clsOutputClass = interfaceC1532800pzS.outputClass();
                        HashSet<Class<?>> hashSet = map.get(clsOutputClass);
                        if (hashSet == null) {
                            hashSet = new HashSet<>();
                            map.put(clsOutputClass, hashSet);
                        }
                        hashSet.add(interfaceC1532800pzS.inputClass());
                    }
                }
                LJJIIJZLJL = true;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public static C1532950pzh LIZJ() {
        return LJJ;
    }

    public static void LJ(n nVar) {
        C1531950py5 c1531950py5;
        String strLJIL;
        String strLJIL2;
        C1531980py8 c1531980py8;
        String strLJIL3;
        String strLJIL4;
        if (nVar == null) {
            return;
        }
        try {
            if (nVar.LJJIIZ("switch").LJIIJJI() != 1) {
                c1531950py5 = new C1531950py5(false, C13BV.INSTANCE, C2097608Jq.LJ());
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<k> it2 = nVar.LJJIIZ("buckets").LJIIL().iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LJIL());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<T> it3 = nVar.LJJIIZ("area_infos").LJIILIIL().entrySet().iterator();
                while (it3.hasNext()) {
                    n nVarLJIILIIL = ((k) ((Map.Entry) it3.next()).getValue()).LJIILIIL();
                    try {
                        n nVarLJIILIIL2 = nVarLJIILIIL.LJJIIZ("config").LJIILIIL();
                        k kVarLJJIIZ = nVarLJIILIIL2.LJJIIZ("domain");
                        Unit unit = null;
                        if (kVarLJJIIZ != null) {
                            strLJIL = kVarLJJIIZ.LJIL();
                        } else {
                            strLJIL = null;
                        }
                        k kVarLJJIIZ2 = nVarLJIILIIL2.LJJIIZ("bucket");
                        if (kVarLJJIIZ2 != null) {
                            strLJIL2 = kVarLJJIIZ2.LJIL();
                        } else {
                            strLJIL2 = null;
                        }
                        C1531980py8 c1531980py82 = new C1531980py8(strLJIL, strLJIL2);
                        k kVarLJJIIZ3 = nVarLJIILIIL.LJJIIZ("fallback_config");
                        if (kVarLJJIIZ3 != null) {
                            n nVarLJIILIIL3 = kVarLJJIIZ3.LJIILIIL();
                            k kVarLJJIIZ4 = nVarLJIILIIL3.LJJIIZ("domain");
                            if (kVarLJJIIZ4 != null) {
                                strLJIL3 = kVarLJJIIZ4.LJIL();
                            } else {
                                strLJIL3 = null;
                            }
                            k kVarLJJIIZ5 = nVarLJIILIIL3.LJJIIZ("bucket");
                            if (kVarLJJIIZ5 != null) {
                                strLJIL4 = kVarLJJIIZ5.LJIL();
                            } else {
                                strLJIL4 = null;
                            }
                            c1531980py8 = new C1531980py8(strLJIL3, strLJIL4);
                        } else {
                            c1531980py8 = null;
                        }
                        C1531970py7 c1531970py7 = new C1531970py7(c1531980py82, c1531980py8);
                        k kVarLJJIIZ6 = nVarLJIILIIL.LJJIIZ("default");
                        if (kVarLJJIIZ6 != null && kVarLJJIIZ6.LJIIJJI() == 1) {
                            linkedHashMap.put("default", c1531970py7);
                        }
                        k kVarLJJIIZ7 = nVarLJIILIIL.LJJIIZ("regions");
                        if (kVarLJJIIZ7 != null) {
                            Iterator<k> it4 = kVarLJJIIZ7.LJIIL().iterator();
                            while (it4.hasNext()) {
                                linkedHashMap.put(it4.next().LJIL(), c1531970py7);
                            }
                            unit = Unit.LIZ;
                        }
                        C189200o6.m2constructorimpl(unit);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                c1531950py5 = new C1531950py5(true, arrayList, linkedHashMap);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1532920pze.LIZJ.LIZIZ("AreaInfo", "parseAreaConfig", "failed to parse config");
            c1531950py5 = new C1531950py5(false, C13BV.INSTANCE, C2097608Jq.LJ());
        }
        LJIJJ = c1531950py5;
    }

    public static void LJFF(h hVar) {
        LJI = hVar;
    }

    public static void LJI(int i) {
        LJIILLIIL = i;
    }

    public static void LJII(boolean z) {
        LJIIJ = z;
    }

    public static void LJIIIIZZ(boolean z) {
        LJIIIIZZ = z;
    }

    public static void LJIIIZ(boolean z) {
        LJIJ = z;
    }

    public static void LJIIJ(C1540200qBO c1540200qBO) {
        LJIL = c1540200qBO;
    }

    public static void LJIIJJI(long j) {
        LJIILJJIL = j;
    }

    public static void LJIIL(AFwS204S0000000_16 aFwS204S0000000_16) {
        LJJIIZ = aFwS204S0000000_16;
    }

    public static void LJIILIIL(boolean z) {
        LJIIIZ = z;
    }

    public static void LJIILJJIL(boolean z) {
        LJIIZILJ = z;
    }

    public static void LJIILL(boolean z) {
        LJIIJJI = z;
    }

    public static void LJIILLIIL(boolean z) {
        LJIILIIL = z;
    }

    public static void LJIIZILJ(boolean z) {
        LJIIL = z;
    }
}
