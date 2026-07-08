package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.lyrax.video.TTLHVideoFrameAdjustmentConfig;
import com.ss.ttlivestreamer.core.transport.ContextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271260jBc {
    public final Keva LIZ;
    public final boolean LIZIZ;
    public boolean LIZJ;
    public volatile boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public final Map<Integer, Integer> LJIIIIZZ;
    public final Map<Integer, Integer> LJIIIZ;
    public final ArrayList<InterfaceC1267650j5n> LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final List<String> LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public volatile boolean LJIJJLI;
    public volatile boolean LJIL;
    public TTLHVideoFrameAdjustmentConfig LJJ;
    public int LJJI;
    public String LJJIFFI;
    public boolean LJJII;
    public boolean LJJIII;

    public final float LIZLLL() {
        TTLHVideoFrameAdjustmentConfig tTLHVideoFrameAdjustmentConfig = this.LJJ;
        if (tTLHVideoFrameAdjustmentConfig == null || !tTLHVideoFrameAdjustmentConfig.enable) {
            return 0.5625f;
        }
        return tTLHVideoFrameAdjustmentConfig.ratio;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ() {
        /*
            r3 = this;
            boolean r0 = r3.LJII
            r2 = 1
            if (r0 == 0) goto L55
            boolean r0 = r3.LJIJI
            if (r0 == 0) goto L55
            boolean r0 = r3.LJIJJLI
            if (r0 == 0) goto L55
            java.lang.String r1 = "layout_linkmic_float_full"
            java.lang.String r0 = r3.LJJIFFI
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L55
            boolean r0 = r3.LIZLLL
            if (r0 == 0) goto L55
            boolean r0 = r3.LJIIJJI
            if (r0 == 0) goto L55
            boolean r0 = r3.LJIIL
            if (r0 == 0) goto L55
            boolean r0 = r3.LJIILIIL
            if (r0 == 0) goto L55
            boolean r0 = r3.LJIILJJIL
            if (r0 == 0) goto L55
            boolean r0 = r3.LJ
            if (r0 == 0) goto L55
            boolean r0 = r3.LJI
            if (r0 == 0) goto L55
            boolean r0 = r3.LJFF
            if (r0 == 0) goto L55
            r0 = 1
        L38:
            r3.LJIILLIIL = r0
            boolean r0 = r3.LJJIII
            if (r0 == 0) goto L53
            boolean r0 = r3.LJIJI
            if (r0 == 0) goto L46
            boolean r0 = r3.LJJII
            if (r0 != 0) goto L50
        L46:
            java.util.List<java.lang.String> r1 = r3.LJIIZILJ
            java.lang.String r0 = r3.LJJIFFI
            boolean r0 = X.C13LP.LJJJJ(r0, r1)
            if (r0 == 0) goto L53
        L50:
            r3.LJIJ = r2
            return
        L53:
            r2 = 0
            goto L50
        L55:
            r0 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271260jBc.LJIIIIZZ():void");
    }

    public C1271260jBc() {
        Keva repo = Keva.getRepo("ttlh_video_resolution_store");
        this.LIZ = repo;
        this.LIZIZ = repo.getBoolean("linked_ever", false);
        this.LJIIIIZZ = new ConcurrentHashMap();
        this.LJIIIZ = new ConcurrentHashMap();
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = true;
        this.LJIIL = true;
        this.LJIILIIL = true;
        this.LJIILJJIL = true;
        this.LJIIZILJ = new ArrayList(C1697810uHb.LJIILJJIL("layout_linkmic_panel_5", "layout_linkmic_panel_5_fov_opti", "layout_linkmic_panel_7", "layout_linkmic_panel_7_fov_opti"));
        this.LJJI = 16;
        this.LJJIFFI = "";
    }

    public final void LJII() {
        if (LIZLLL() > 0.0f) {
            if ((!this.LJIJJLI || this.LJIL) && (this.LJIJJLI || !this.LJIL)) {
                return;
            }
            Iterator<InterfaceC1267650j5n> it2 = this.LJIIJ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ();
            }
        }
    }

    public final void LIZIZ(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("support_list_saved_");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int length = 0;
        if (!this.LIZ.getBoolean(strLIZIZ, false)) {
            Context applicationContext = ContextUtils.getApplicationContext();
            Size[] outputSizes = null;
            if (i != 0 && i != 1) {
                if (C1274040jG6.LIZ()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("not supported camera type:");
                    sbLIZ2.append(i);
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else if (applicationContext == null && (applicationContext = ContextUtils.getApplicationContext()) == null) {
                if (C1274040jG6.LIZ()) {
                    throw new NullPointerException("context is null");
                }
            } else {
                try {
                    outputSizes = ((StreamConfigurationMap) ((CameraManager) C786410Ut5.H2(applicationContext, "camera")).getCameraCharacteristics(String.valueOf(i)).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            Keva keva = this.LIZ;
            if (outputSizes == null || outputSizes.length == 0 || (i != 0 && i != 1)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("sizes:");
                sbLIZ3.append(outputSizes);
                sbLIZ3.append(" len:");
                if (outputSizes != null) {
                    length = outputSizes.length;
                }
                sbLIZ3.append(length);
                sbLIZ3.append(" keva:");
                sbLIZ3.append(keva);
                sbLIZ3.append(" cameraFacing:");
                sbLIZ3.append(i);
                C2188811AlT.LIZIZ(sbLIZ3);
            } else {
                int length2 = outputSizes.length;
                while (length < length2) {
                    Size size = outputSizes[length];
                    int width = size.getWidth();
                    int height = size.getHeight();
                    if (width > height) {
                        width = height;
                    }
                    int width2 = size.getWidth();
                    int height2 = size.getHeight();
                    if (width2 < height2) {
                        width2 = height2;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(width);
                    sbLIZ4.append('_');
                    sbLIZ4.append(width2);
                    sbLIZ4.append('_');
                    sbLIZ4.append(i);
                    keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ4), true);
                    length++;
                }
            }
            this.LIZ.storeBoolean(strLIZIZ, true);
        }
    }

    public final String LIZJ(boolean z) {
        if (z) {
            return "1";
        }
        if (!this.LIZLLL) {
            return "e0e";
        }
        StringBuilder sb = new StringBuilder();
        if (!this.LJIJJ) {
            LIZ(sb, this.LJIIJJI, "e1");
            LIZ(sb, this.LJIIL, "e2");
            LIZ(sb, this.LJIILIIL, "e3");
            LIZ(sb, this.LJIILJJIL, "e4");
        }
        if (!this.LJ) {
            LIZ(sb, !this.LIZJ, "e5");
            LIZ(sb, !this.LIZIZ, "e6");
        }
        LIZ(sb, this.LJFF, "e7");
        LIZ(sb, this.LJI, "e8");
        LIZ(sb, this.LJIILL, "e9");
        LIZ(sb, this.LJIILLIIL, "e10");
        LIZ(sb, this.LJIJ, "e11");
        sb.append("e");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJFF(int r6) {
        /*
            r5 = this;
            r2 = r6 & 1
            r1 = 0
            r0 = 1
            if (r2 != r0) goto L7
            return r1
        L7:
            r2 = r6 & 4
            r0 = 4
            if (r2 != r0) goto Lf
            boolean r0 = r5.LIZLLL
            return r0
        Lf:
            boolean r2 = r5.LJIILL
            boolean r4 = r5.LJIJJLI
            r3 = 2
            r0 = r6 & 2
            if (r0 != r3) goto L46
            r2 = 1
        L19:
            boolean r0 = r5.LIZLLL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIIJJI
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIIL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIILIIL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIILJJIL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJ
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJI
            if (r0 == 0) goto L3c
            if (r2 == 0) goto L3c
            boolean r0 = r5.LJFF
            if (r0 == 0) goto L3c
        L3b:
            r1 = 1
        L3c:
            boolean r0 = X.C1267520j5a.LIZ()
            if (r0 == 0) goto L45
            r5.LIZJ(r1)
        L45:
            return r1
        L46:
            if (r4 == 0) goto L19
            boolean r0 = r5.LIZLLL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIIJJI
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIIL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIILIIL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIILJJIL
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJ
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJI
            if (r0 == 0) goto L3c
            if (r2 == 0) goto L3c
            boolean r0 = r5.LJFF
            if (r0 == 0) goto L3c
            boolean r0 = r5.LJIILLIIL
            if (r0 == 0) goto L3c
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271260jBc.LJFF(int):boolean");
    }

    public final void LJI(boolean z) {
        boolean z2;
        if (this.LJIL != z) {
            boolean zLJFF = LJFF(0);
            this.LJIL = z;
            if (this.LJIJJLI && !this.LJIL) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.LJIILL = z2;
            if (zLJFF != LJFF(0)) {
                LJII();
            }
        }
    }

    public static void LIZ(StringBuilder sb, boolean z, String str) {
        if (!z) {
            sb.append(str);
        }
    }

    public final int LJ(int i, int i2, int i3) {
        if (i2 > 0 && LJFF(i3)) {
            float f = (i * 1.0f) / i2;
            float fLIZLLL = LIZLLL();
            if (f > fLIZLLL) {
                int i4 = this.LJJI;
                if (i4 > 0) {
                    i2 = (((i2 + i4) - 1) / i4) * i4;
                }
                return (int) (i2 * fLIZLLL);
            }
            return i;
        }
        return i;
    }
}
