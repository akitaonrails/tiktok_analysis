package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0jGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274140jGG {
    public static final List<C1274150jGH> LIZ = new ArrayList();
    public static final List<C1274150jGH> LIZIZ = new ArrayList();
    public static boolean LIZJ = false;
    public static final List<C1274150jGH> LIZLLL = Arrays.asList(new C1274150jGH(320, 240), new C1274150jGH(640, 480), new C1274150jGH(1280, 720), new C1274150jGH(1920, 1080));

    public static C1274150jGH LIZ(C1274150jGH c1274150jGH, boolean z) {
        if (z) {
            return new C1274150jGH(c1274150jGH.LIZIZ, c1274150jGH.LIZ);
        }
        return new C1274150jGH(c1274150jGH.LIZ, c1274150jGH.LIZIZ);
    }

    public static void LIZIZ(CameraManager cameraManager, int i, List<C1274150jGH> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(i);
        for (Size size : ((StreamConfigurationMap) cameraManager.getCameraCharacteristics(C2188811AlT.LIZIZ(sbLIZ)).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class)) {
            ((ArrayList) list).add(new C1274150jGH(size.getWidth(), size.getHeight()));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cameraid:");
            sbLIZ2.append(i);
            sbLIZ2.append(", Width: ");
            sbLIZ2.append(size.getWidth());
            sbLIZ2.append(", Height: ");
            sbLIZ2.append(size.getHeight());
            AVLog.e("CameraResolution", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> LIZJ(X.AbstractC1273900jFs r16, int r17, int r18) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274140jGG.LIZJ(X.0jFs, int, int):android.util.Pair");
    }

    public static C1274150jGH LIZLLL(int i, int i2, Context context, boolean z) {
        boolean z2;
        int i3;
        int i4;
        C1274150jGH c1274150jGH;
        List<C1274150jGH> list;
        C1274150jGH c1274150jGHLIZ;
        C1274150jGH c1274150jGH2;
        List<C1274150jGH> list2;
        if (!LIZJ) {
            synchronized (C1274140jGG.class) {
                if (!LIZJ) {
                    CameraManager cameraManager = (CameraManager) C786410Ut5.H2(context, "camera");
                    try {
                        LIZIZ(cameraManager, 0, LIZ);
                        LIZIZ(cameraManager, 1, LIZIZ);
                        LIZJ = true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        LIZJ = false;
                    }
                }
            }
        }
        if (i < i2) {
            z2 = true;
            int i5 = i ^ i2;
            i4 = i2 ^ i5;
            i3 = i5 ^ i4;
        } else {
            z2 = false;
            i3 = i;
            i4 = i2;
        }
        if (i3 <= 1280 && i4 <= 720) {
            if (z2) {
                c1274150jGH = new C1274150jGH(720, 1280);
            } else {
                c1274150jGH = new C1274150jGH(1280, 720);
            }
        } else if (z2) {
            c1274150jGH = new C1274150jGH(1080, 1920);
        } else {
            c1274150jGH = new C1274150jGH(1920, 1080);
        }
        int i6 = 2;
        C1274150jGH c1274150jGHLIZ2 = null;
        if (i3 == 1920 && i4 == 1088) {
            c1274150jGH = new C1274150jGH(1920, 1080);
            c1274150jGH2 = null;
            c1274150jGHLIZ = null;
        } else {
            if (z) {
                list = LIZ;
            } else {
                list = LIZIZ;
            }
            int size = list.size() - 1;
            C1274150jGH c1274150jGHLIZ3 = null;
            c1274150jGHLIZ = null;
            while (size >= 0) {
                C1274150jGH c1274150jGH3 = (C1274150jGH) ListProtector.get(list, size);
                int i7 = c1274150jGH3.LIZ;
                int i8 = c1274150jGH3.LIZIZ;
                if (i7 < i8) {
                    Object[] objArr = new Object[i6];
                    objArr[0] = Integer.valueOf(i7);
                    objArr[1] = Integer.valueOf(c1274150jGH3.LIZIZ);
                    AVLog.iow("CameraUtils", C786410Ut5.j4("camera list invalid. temp=[%d,%d], why?", objArr));
                } else if (i7 >= i3 && i8 >= i4) {
                    if (i7 == i3 || i8 == i4) {
                        c1274150jGHLIZ = LIZ(c1274150jGH3, z2);
                    }
                    if (c1274150jGHLIZ2 == null && (list2 = LIZLLL) != null && !list2.isEmpty()) {
                        int i9 = 0;
                        while (true) {
                            if (i9 >= list2.size()) {
                                break;
                            }
                            C1274150jGH c1274150jGH4 = (C1274150jGH) ListProtector.get(list2, i9);
                            if (c1274150jGH3.LIZ == c1274150jGH4.LIZ && c1274150jGH3.LIZIZ == c1274150jGH4.LIZIZ) {
                                c1274150jGHLIZ2 = LIZ(c1274150jGH3, z2);
                                break;
                            }
                            i9++;
                        }
                    }
                    if (c1274150jGHLIZ3 == null) {
                        c1274150jGHLIZ3 = LIZ(c1274150jGH3, z2);
                    }
                }
                size--;
                i6 = 2;
            }
            c1274150jGH2 = c1274150jGHLIZ2;
            c1274150jGHLIZ2 = c1274150jGHLIZ3;
        }
        C1274160jGI c1274160jGI = new C1274160jGI();
        c1274160jGI.LIZ = c1274150jGH;
        c1274160jGI.LIZIZ = c1274150jGHLIZ2;
        c1274160jGI.LIZJ = c1274150jGH2;
        c1274160jGI.LIZLLL = c1274150jGHLIZ;
        int iMax = Math.max(i, i2);
        int iMin = Math.min(i, i2);
        C1274150jGH c1274150jGH5 = c1274160jGI.LIZJ;
        if (c1274150jGH5 != null && c1274150jGH5.LIZ / iMax < i6 && c1274150jGH5.LIZIZ / iMin < i6) {
            return c1274150jGH5;
        }
        return new C1274150jGH(1280, 720);
    }
}
