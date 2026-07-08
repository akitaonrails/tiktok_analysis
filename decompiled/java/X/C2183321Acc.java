package X;

import Y.AComparatorS39S0000000_20;
import Y.AComparatorS49S0000000_30;
import Y.AComparatorS502S0100000_3;
import Y.AComparatorS52S0000000_33;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Size;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Acc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183321Acc {
    public static String LIZ;
    public static final boolean LIZIZ;
    public static final String[] LIZJ = {"SDM632", "SDM636", "SDM638", "SDM660", "SDM670", "SDM710", "SDM720", "MSM8996", "MSM8998", "SDM845", "KIRIN980", "KIRIN970", "KIRIN710", "HI3660", "MT6771", "Exynos 9810", "Exynos 8895"};
    public static final String[] LIZLLL = {"BAC-AL00", "ANE-AL00", "HWI-AL00"};
    public static final boolean LJ;
    public static Class LJFF;
    public static Field LJI;
    public static Method LJII;
    public static byte LJIIIIZZ;
    public static final Map<Long, String> LJIIIZ;
    public static final ArrayList<TEFrameSizei> LJIIJ;

    public static int LIZLLL(int i) {
        int i2 = LSPassThroughRecordSizeConfig.DEFAULT;
        if (i <= 1000) {
            i2 = C386801es.DEFAULT;
            if (i >= -1000) {
                return i;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0252, code lost:
    
        r1 = r1[1].trim();
        X.C2183321Acc.LIZ = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x025a, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x025f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0260, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0289 -> B:48:0x0283). Please report as a decompilation issue!!! */
    static {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2183321Acc.<clinit>():void");
    }

    public static List<TEFrameSizei> LJ(List<Size> list) {
        ArrayList<Size> arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (Size size : arrayList) {
            arrayList2.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        return arrayList2;
    }

    public static boolean LJI(Object obj) {
        try {
            if (LJFF == null || LJI == null || LJII == null) {
                LJFF = Class.forName("android.hardware.camera2.impl.CameraMetadataNative");
                LJI = obj.getClass().getSuperclass().getDeclaredField("mResults");
                Method declaredMethod = LJFF.getDeclaredMethod("finalize", new Class[0]);
                LJII = declaredMethod;
                declaredMethod.setAccessible(true);
                LJI.setAccessible(true);
            }
            LJII.invoke(LJI.get(obj), new Object[0]);
            return true;
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraUtils", "CameraMetadataNative class not found");
            return false;
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            int i2 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraUtils", "illegal access");
            return false;
        } catch (NoSuchFieldException e3) {
            TryCatchGuardChecker.doCheck(e3);
            int i3 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraUtils", "mResults field not found");
            return false;
        } catch (NoSuchMethodException e4) {
            TryCatchGuardChecker.doCheck(e4);
            int i4 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraUtils", "finalize method not found");
            return false;
        } catch (InvocationTargetException e5) {
            TryCatchGuardChecker.doCheck(e5);
            int i5 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraUtils", "method invoke error");
            return false;
        } catch (Exception e6) {
            TryCatchGuardChecker.doCheck(e6);
            int i6 = C2187451AjH.LIZ;
            C2183341Ace.LJ("TECameraUtils", "unknown error");
            return false;
        }
    }

    public static int LJIIJ(Context context) {
        int rotation = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(context, "window"), new C0WZX("dzBzEhEpEcvSUUUuTBbKcpY6ind3QGAFRmHgTXYWbNrIoPrFeTU1", null)).getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    public static boolean LJIILJJIL(Context context) {
        boolean z = true;
        try {
            if (C838410Wul.LIZ(context, "android.permission.CAMERA") != 0) {
                z = false;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C2183341Ace.LIZJ("TECameraUtils", "check camera permission failed!", e);
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LJ("TECameraUtils", "isCameraPermissionGranted = " + z);
        return z;
    }

    public static boolean LJIILL(Rect rect) {
        if (rect != null && !rect.isEmpty() && rect.left >= 0 && rect.right >= 0 && rect.top >= 0 && rect.bottom >= 0) {
            return true;
        }
        return false;
    }

    public static TEFrameSizei LIZ(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : (ArrayList) list) {
            int i = tEFrameSizei3.width;
            if (i > tEFrameSizei.width && tEFrameSizei3.height > tEFrameSizei.height && (tEFrameSizei2 == null || i < tEFrameSizei2.width)) {
                tEFrameSizei2 = tEFrameSizei3;
            }
        }
        if (tEFrameSizei2 == null) {
            return null;
        }
        return tEFrameSizei2;
    }

    public static TEFrameSizei LIZJ(List<TEFrameSizei> list, float f) {
        if (f <= 0.0f || list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei : list) {
            if (Float.compare(f, tEFrameSizei.width / tEFrameSizei.height) == 0) {
                arrayList.add(tEFrameSizei);
            } else {
                arrayList2.add(tEFrameSizei);
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList<TEFrameSizei> arrayList3 = LJIIJ;
            if (arrayList.contains(ListProtector.get(arrayList3, 14))) {
                return (TEFrameSizei) ListProtector.get(arrayList3, 14);
            }
            if (arrayList.contains(ListProtector.get(arrayList3, 16))) {
                return (TEFrameSizei) ListProtector.get(arrayList3, 16);
            }
            Collections.sort(arrayList, new AComparatorS52S0000000_33(3));
            return (TEFrameSizei) ListProtector.get(arrayList, 0);
        }
        ArrayList<TEFrameSizei> arrayList4 = LJIIJ;
        if (arrayList2.contains(ListProtector.get(arrayList4, 14))) {
            return (TEFrameSizei) ListProtector.get(arrayList4, 14);
        }
        if (arrayList.contains(ListProtector.get(arrayList4, 16))) {
            return (TEFrameSizei) ListProtector.get(arrayList4, 16);
        }
        Collections.sort(arrayList2, new AComparatorS52S0000000_33(4));
        return (TEFrameSizei) ListProtector.get(arrayList, arrayList.size() / 2);
    }

    public static int[] LJII(List list, int[] iArr) {
        if (list.size() > 0) {
            ArrayList<int[]> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int[] iArr2 = (int[]) it2.next();
                if (iArr[0] > 1000) {
                    if (iArr2[1] == 30000) {
                        arrayList.add(iArr2);
                    } else {
                        arrayList2.add(iArr2);
                    }
                } else if (iArr2[1] == 30) {
                    arrayList.add(iArr2);
                } else {
                    arrayList2.add(iArr2);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new AComparatorS49S0000000_30(3));
                for (int[] iArr3 : arrayList) {
                    if (iArr3[0] <= iArr[0]) {
                        break;
                    }
                }
                iArr3 = (int[]) Collections.min(list, new AComparatorS502S0100000_3(iArr, 0));
            } else {
                iArr3 = (int[]) Collections.min(list, new AComparatorS502S0100000_3(iArr, 0));
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculate fps range = [");
            sbLIZ.append(iArr3[0]);
            sbLIZ.append(",");
            sbLIZ.append(iArr3[1]);
            sbLIZ.append(e3.f);
            C2183341Ace.LIZ("TECameraUtils", C2188811AlT.LIZIZ(sbLIZ));
            return iArr3;
        }
        int i2 = C2187451AjH.LIZ;
        C2183341Ace.LJ("TECameraUtils", "supported fpsRange is null,use [7,30]");
        return new int[]{7, 30};
    }

    public static int[] LJIIJJI(List list, int[] iArr) {
        if (list.size() > 0) {
            ArrayList<int[]> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int[] iArr2 = (int[]) it2.next();
                if (iArr2[1] == iArr2[0]) {
                    arrayList.add(iArr2);
                } else {
                    arrayList2.add(iArr2);
                }
            }
            if (!arrayList.isEmpty()) {
                Collections.sort(arrayList, new AComparatorS49S0000000_30(4));
                for (int[] iArr3 : arrayList) {
                    int i = iArr3[0];
                    if (i >= 15 && (i <= 30 || (i >= 15000 && iArr3[1] <= 30000))) {
                        if (iArr[1] == iArr3[1]) {
                            break;
                        }
                    }
                }
                iArr3 = (int[]) Collections.min(list, new AComparatorS502S0100000_3(iArr, 0));
            } else {
                iArr3 = (int[]) Collections.min(list, new AComparatorS502S0100000_3(iArr, 0));
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("calculate fps range = [");
            sbLIZ.append(iArr3[0]);
            sbLIZ.append(",");
            sbLIZ.append(iArr3[1]);
            sbLIZ.append(e3.f);
            C2183341Ace.LIZ("TECameraUtils", C2188811AlT.LIZIZ(sbLIZ));
            return iArr3;
        }
        int i3 = C2187451AjH.LIZ;
        C2183341Ace.LJ("TECameraUtils", "supported fpsRange is null,use [30,30]");
        return new int[]{30, 30};
    }

    public static TEFrameSizei LJIILIIL(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei) {
        Collections.sort(list, new AComparatorS52S0000000_33(7));
        int i = tEFrameSizei.width;
        int i2 = tEFrameSizei.height;
        TEFrameSizei tEFrameSizei2 = null;
        for (TEFrameSizei tEFrameSizei3 : (ArrayList) list) {
            if (tEFrameSizei2 != null) {
                int i3 = tEFrameSizei3.width;
                if (i3 == i && tEFrameSizei3.height == i2) {
                    return tEFrameSizei3;
                }
                if (i3 <= i || i3 >= tEFrameSizei2.width) {
                    if (i3 < i) {
                        return tEFrameSizei2;
                    }
                }
            }
            tEFrameSizei2 = tEFrameSizei3;
        }
        return tEFrameSizei2;
    }

    public static TEFrameSizei LIZIZ(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, EnumC2183331Acd enumC2183331Acd) {
        int i;
        TEFrameSizei tEFrameSizei2 = null;
        if (list == null || list.size() <= 0) {
            return null;
        }
        int i2 = tEFrameSizei.width;
        int i3 = tEFrameSizei.height;
        float f = i2 / i3;
        ArrayList arrayList = new ArrayList();
        ArrayList<TEFrameSizei> arrayList2 = new ArrayList();
        for (TEFrameSizei tEFrameSizei3 : list) {
            if (Float.compare(f, tEFrameSizei3.width / tEFrameSizei3.height) == 0) {
                arrayList.add(tEFrameSizei3);
            } else {
                arrayList2.add(tEFrameSizei3);
            }
        }
        if (enumC2183331Acd == EnumC2183331Acd.MATCH_BY_PIXELS) {
            TEFrameSizei tEFrameSizeiLJIILIIL = LJIILIIL(arrayList, tEFrameSizei);
            int i4 = tEFrameSizei.width * tEFrameSizei.height;
            int iAbs = Integer.MAX_VALUE;
            for (TEFrameSizei tEFrameSizei4 : arrayList2) {
                if (tEFrameSizei2 == null) {
                    iAbs = Math.abs((tEFrameSizei4.width * tEFrameSizei4.height) - i4);
                } else if (Math.abs((tEFrameSizei4.width * tEFrameSizei4.height) - i4) < iAbs) {
                    iAbs = Math.abs((tEFrameSizei4.width * tEFrameSizei4.height) - i4);
                }
                tEFrameSizei2 = tEFrameSizei4;
            }
            if (tEFrameSizeiLJIILIIL == null) {
                return tEFrameSizei2;
            }
            if (tEFrameSizei2 == null) {
                return tEFrameSizeiLJIILIIL;
            }
            int i5 = tEFrameSizeiLJIILIIL.width;
            int i6 = tEFrameSizeiLJIILIIL.height;
            if (i5 * i6 <= tEFrameSizei2.width * tEFrameSizei2.height || (i5 - i2 <= 512 && i6 - i3 <= 512)) {
                return tEFrameSizeiLJIILIIL;
            }
            return tEFrameSizei2;
        }
        if (!arrayList.isEmpty()) {
            return LJIILIIL(arrayList, tEFrameSizei);
        }
        int i7 = tEFrameSizei.width;
        int i8 = tEFrameSizei.height;
        Collections.sort(arrayList2, new AComparatorS39S0000000_20(7));
        for (TEFrameSizei tEFrameSizei5 : arrayList2) {
            if (tEFrameSizei2 == null || ((i = tEFrameSizei5.width) >= i7 && tEFrameSizei5.height >= i8)) {
                tEFrameSizei2 = tEFrameSizei5;
            } else if (i < i7 && tEFrameSizei5.height < i8) {
                return tEFrameSizei2;
            }
        }
        return tEFrameSizei2;
    }

    public static TEFrameSizei LJIIIZ(List<TEFrameSizei> list, TEFrameSizei tEFrameSizei, TEFrameSizei tEFrameSizei2) {
        ArrayList<TEFrameSizei> arrayList = new ArrayList(list);
        if (tEFrameSizei != null && tEFrameSizei.width > 0 && tEFrameSizei.height > 0) {
            if (tEFrameSizei.equals(tEFrameSizei2) && arrayList.contains(tEFrameSizei2)) {
                return tEFrameSizei2;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                TEFrameSizei tEFrameSizei3 = (TEFrameSizei) it2.next();
                if (tEFrameSizei3.width * tEFrameSizei.height != tEFrameSizei3.height * tEFrameSizei.width) {
                    it2.remove();
                }
            }
        }
        Collections.sort(arrayList, new AComparatorS52S0000000_33(5));
        TEFrameSizei tEFrameSizei4 = null;
        for (TEFrameSizei tEFrameSizei5 : arrayList) {
            if (tEFrameSizei4 != null) {
                if (tEFrameSizei5.width == tEFrameSizei2.width && tEFrameSizei5.height == tEFrameSizei2.height) {
                    return tEFrameSizei5;
                }
                int i = tEFrameSizei5.height;
                int i2 = tEFrameSizei2.height;
                if (i <= i2 || i >= tEFrameSizei4.height) {
                    if (i < i2) {
                        return tEFrameSizei4;
                    }
                }
            }
            tEFrameSizei4 = tEFrameSizei5;
        }
        return tEFrameSizei4;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ttvecamera.TEFrameSizei LJIIIIZZ(java.util.List<com.ss.android.ttvecamera.TEFrameSizei> r6, com.ss.android.ttvecamera.TEFrameSizei r7, int r8, float r9) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            if (r7 == 0) goto L3f
            int r0 = r7.width
            if (r0 <= 0) goto L3f
            int r0 = r7.height
            if (r0 <= 0) goto L3f
            java.util.Iterator r6 = r3.iterator()
            int r0 = r7.width
            float r4 = (float) r0
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            int r0 = r7.height
            float r0 = (float) r0
            float r4 = r4 / r0
        L1d:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r2 = r6.next()
            com.ss.android.ttvecamera.TEFrameSizei r2 = (com.ss.android.ttvecamera.TEFrameSizei) r2
            int r0 = r2.width
            float r1 = (float) r0
            float r1 = r1 * r5
            int r0 = r2.height
            float r0 = (float) r0
            float r1 = r1 / r0
            float r0 = r4 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 <= 0) goto L1d
            r6.remove()
            goto L1d
        L3f:
            Y.AComparatorS52S0000000_33 r1 = new Y.AComparatorS52S0000000_33
            r0 = 6
            r1.<init>(r0)
            java.util.Collections.sort(r3, r1)
            java.util.Iterator r1 = r3.iterator()
        L4c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r2 = r1.next()
            com.ss.android.ttvecamera.TEFrameSizei r2 = (com.ss.android.ttvecamera.TEFrameSizei) r2
            int r0 = r2.width
            if (r0 > r8) goto L4c
        L5c:
            byte r0 = X.C2183321Acc.LJIIIIZZ
            r0 = r0 & 8
            if (r0 == 0) goto L79
            if (r2 == 0) goto L70
            int r1 = r2.width
            int r0 = r7.width
            if (r1 <= r0) goto L70
            int r1 = r2.height
            int r0 = r7.height
            if (r1 > r0) goto Lb8
        L70:
            com.ss.android.ttvecamera.TEFrameSizei r0 = LIZ(r3, r7)
            if (r0 == 0) goto L8e
            return r0
        L77:
            r2 = 0
            goto L5c
        L79:
            if (r2 == 0) goto L87
            int r1 = r2.width
            int r0 = r7.width
            if (r1 < r0) goto L87
            int r1 = r2.height
            int r0 = r7.height
            if (r1 >= r0) goto Lb8
        L87:
            com.ss.android.ttvecamera.TEFrameSizei r0 = LIZ(r3, r7)
            if (r0 == 0) goto L8e
            return r0
        L8e:
            if (r2 != 0) goto Lb8
            int r0 = X.C2187451AjH.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getClosestSupportedSize failed, maxWidth: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", accuracy: "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", previewSize: "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TECameraUtils"
            X.C2183341Ace.LIZIZ(r0, r1)
            return r2
        Lb8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2183321Acc.LJIIIIZZ(java.util.List, com.ss.android.ttvecamera.TEFrameSizei, int, float):com.ss.android.ttvecamera.TEFrameSizei");
    }

    public static int[] LJIIL(int i, int i2, int[] iArr, List<int[]> list) {
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requiredFpsRange : [");
        sbLIZ.append(iArr[0]);
        sbLIZ.append(",");
        sbLIZ.append(iArr[1]);
        sbLIZ.append(e3.f);
        C2183341Ace.LIZ("TECameraUtils", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 1) {
            C2183341Ace.LIZ("TECameraUtils", "fixed framerate for all cameras");
            return LJIIJJI(list, iArr);
        }
        if (i == 2) {
            if (i2 == 0) {
                C2183341Ace.LIZ("TECameraUtils", "fixed framerate for rear camera");
                return LJIIJJI(list, iArr);
            }
            C2183341Ace.LIZ("TECameraUtils", "dynamic framerate for front camera");
            return LJII(list, iArr);
        }
        if (i == 3) {
            C2183341Ace.LIZ("TECameraUtils", "dynamic framerate without select");
            return (int[]) Collections.min(list, new AComparatorS502S0100000_3(iArr, 0));
        }
        if (i == 4) {
            C2183341Ace.LIZ("TECameraUtils", "framerate by user");
            for (int[] iArr2 : list) {
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return iArr;
                }
            }
            return LJII(list, iArr);
        }
        C2183341Ace.LIZ("TECameraUtils", "dynamic framerate");
        return LJII(list, iArr);
    }

    public static Object LJFF(String str, int i, Context context, InterfaceC2254691DMt interfaceC2254691DMt, Handler handler, C1DJO c1djo) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = null;
        try {
            Method method = Class.forName(str).getMethod("create", Integer.TYPE, Context.class, InterfaceC2254691DMt.class, Handler.class, InterfaceC2186371AhX.class);
            method.setAccessible(true);
            objInvoke = method.invoke(null, Integer.valueOf(i), context, interfaceC2254691DMt, handler, c1djo);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createCameraInstance for ");
            sbLIZ.append(str);
            sbLIZ.append(", exception occurred.");
            C2183341Ace.LJFF("TECameraUtils", C2188811AlT.LIZIZ(sbLIZ), e);
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createCameraInstance for ");
        sbLIZ2.append(str);
        sbLIZ2.append(", cost time = ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append("ms, cameraInstance = ");
        sbLIZ2.append(objInvoke);
        C2183341Ace.LIZLLL("TECameraUtils", C2188811AlT.LIZIZ(sbLIZ2));
        return objInvoke;
    }
}
