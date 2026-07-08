package X;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13oL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20122313oL {
    public static final C20122313oL LIZ = new C20122313oL();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("com.dev47apps.droidcam", "com.dev47apps.droidcamx", "com.kinoni.epoccam", "com.iriun.webcam", "com.e2esoft.ivcam", "com.manycam.manycam", "com.pas.webcam", "com.shenyaocn.android.virtualcamera");
    public static final List<String> LIZJ = C1697810uHb.LJIIJJI("v4l2loopback", "virtualcamera", "droidcam", "iriun", "ivcam", "manycam");
    public static final List<String> LIZLLL = C1697810uHb.LJIIJJI("xposed", "lsposed", "edxposed", "de.robv.android.xposed", "substrate", "cydia", "frida", "com.saurik.substrate");

    public static int LIZJ(Context context) {
        List listLIZLLL = LIZLLL(context);
        int i = 0;
        if (!(listLIZLLL instanceof Collection) || !listLIZLLL.isEmpty()) {
            Iterator it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((C1285810jZ5) it2.next()).LIZLLL, "back") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    public static List LIZLLL(Context context) {
        CameraManager cameraManager;
        String[] cameraIdList;
        if (context == null) {
            return C13BV.INSTANCE;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Object objH2 = C786410Ut5.H2(context, "camera");
            if (objH2 instanceof CameraManager) {
                cameraManager = (CameraManager) objH2;
            } else {
                cameraManager = null;
            }
            if (cameraManager != null && (cameraIdList = cameraManager.getCameraIdList()) != null) {
                for (String str : cameraIdList) {
                    try {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        LIZ.getClass();
                        arrayList.add(LJIIIIZZ(cameraCharacteristics, str));
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return C13BV.INSTANCE;
            }
            throw new C2197108jB();
        }
    }

    public static int LJ(Context context) {
        CameraManager cameraManager;
        String[] cameraIdList;
        int length = 0;
        if (context == null) {
            return 0;
        }
        try {
            Object objH2 = C786410Ut5.H2(context, "camera");
            if (!(objH2 instanceof CameraManager) || (cameraManager = (CameraManager) objH2) == null || (cameraIdList = cameraManager.getCameraIdList()) == null) {
                return 0;
            }
            length = cameraIdList.length;
            return length;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                return length;
            }
            throw new C2197108jB();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.ArrayList] */
    public static List LJFF(Context context) {
        Object obj;
        CameraManager cameraManager;
        List arrayList;
        Object c098200Yq;
        boolean z;
        ?? arrayList2;
        Object c098200Yq2;
        Iterable<String> iterable;
        Object c098200Yq3;
        if (context == null) {
            return C13BV.INSTANCE;
        }
        try {
            Object objH2 = C786410Ut5.H2(context, "camera");
            if (objH2 instanceof CameraManager) {
                cameraManager = (CameraManager) objH2;
            } else {
                cameraManager = null;
            }
            if (cameraManager != null) {
                String[] cameraIdList = cameraManager.getCameraIdList();
                arrayList = new ArrayList();
                for (String str : cameraIdList) {
                    try {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
                        LIZ.getClass();
                        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        if (iArr == null) {
                            iArr = new int[0];
                        }
                        if (C13LQ.LJJIJ(11, iArr) >= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Map mapLIZ = LIZ(str, cameraCharacteristics, "", z);
                        if (z) {
                            if (Build.VERSION.SDK_INT < 28) {
                                iterable = C08CX.INSTANCE;
                            } else {
                                try {
                                    c098200Yq2 = cameraCharacteristics.getPhysicalCameraIds();
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq2 = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                                    c098200Yq2 = null;
                                }
                                iterable = (Set) c098200Yq2;
                                if (iterable == null) {
                                    iterable = C08CX.INSTANCE;
                                }
                            }
                            arrayList2 = new ArrayList();
                            for (String str2 : iterable) {
                                try {
                                    CameraCharacteristics cameraCharacteristics2 = cameraManager.getCameraCharacteristics(str2);
                                    LIZ.getClass();
                                    c098200Yq3 = LIZ(str2, cameraCharacteristics2, str, false);
                                    C189200o6.m2constructorimpl(c098200Yq3);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq3 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq3);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                                    c098200Yq3 = null;
                                }
                                Map map = (Map) c098200Yq3;
                                if (map != null) {
                                    arrayList2.add(map);
                                }
                            }
                        } else {
                            arrayList2 = C13BV.INSTANCE;
                        }
                        c098200Yq = C13LP.LJLIL(arrayList2, Collections.singletonList(mapLIZ));
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        c098200Yq = new C098200Yq(th3);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C13BV c13bv = C13BV.INSTANCE;
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        c098200Yq = c13bv;
                    }
                    C19719612Di.LJJI((Iterable) c098200Yq, arrayList);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C189200o6.m2constructorimpl(arrayList);
            obj = arrayList;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            C098200Yq c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
            obj = c098200Yq4;
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        Object obj2 = obj;
        if (thM5exceptionOrNullimpl != null) {
            obj2 = C13BV.INSTANCE;
        }
        return (List) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: all -> 0x00c1, TryCatch #0 {all -> 0x00c1, blocks: (B:28:0x0070, B:30:0x0087, B:33:0x00a7, B:44:0x00bd, B:45:0x00c0, B:31:0x008a, B:32:0x0092), top: B:94:0x0070, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:28:0x0070, B:30:0x0087, B:33:0x00a7, B:44:0x00bd, B:45:0x00c0, B:31:0x008a, B:32:0x0092), top: B:94:0x0070, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(android.content.Context r12) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20122313oL.LJI(android.content.Context):boolean");
    }

    public static int LJII(Context context) {
        List listLIZLLL = LIZLLL(context);
        int i = 0;
        if (!(listLIZLLL instanceof Collection) || !listLIZLLL.isEmpty()) {
            Iterator it2 = listLIZLLL.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((C1285810jZ5) it2.next()).LIZLLL, "front") && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1285810jZ5 LJIIIIZZ(android.hardware.camera2.CameraCharacteristics r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20122313oL.LJIIIIZZ(android.hardware.camera2.CameraCharacteristics, java.lang.String):X.0jZ5");
    }

    public static String LIZIZ(String str, String str2, float[] fArr) {
        if (fArr != null && fArr.length != 0) {
            return C13LQ.LJJIJLIJ(fArr, ", ", new C256600yy(str2, str), 30);
        }
        return "unknown";
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.lang.String r21, android.hardware.camera2.CameraCharacteristics r22, java.lang.String r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20122313oL.LIZ(java.lang.String, android.hardware.camera2.CameraCharacteristics, java.lang.String, boolean):java.util.Map");
    }
}
