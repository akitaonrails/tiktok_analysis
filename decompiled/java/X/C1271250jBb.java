package X;

import com.ss.lyrax.video.TTLHVideoFrameAdjustmentConfig;
import com.ss.pusher.core.utils.AVLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jBb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271250jBb {
    public C1268720j7W LIZIZ;
    public final C1271260jBc LIZ = new C1271260jBc();
    public boolean LIZJ = false;

    public final String LIZJ() {
        C1271260jBc c1271260jBc = this.LIZ;
        if (!c1271260jBc.LJIJJLI) {
            return c1271260jBc.LIZJ(c1271260jBc.LJFF(0));
        }
        if (c1271260jBc.LJIJ && c1271260jBc.LJJII) {
            return "1";
        }
        if (!c1271260jBc.LJIJI) {
            StringBuilder sb = new StringBuilder();
            C1271260jBc.LIZ(sb, c1271260jBc.LJIILLIIL, "e10");
            C1271260jBc.LIZ(sb, c1271260jBc.LJIJ, "e11");
            sb.append("e");
            return sb.toString();
        }
        if (c1271260jBc.LJIILLIIL) {
            return "1";
        }
        StringBuilder sb2 = new StringBuilder();
        C1271260jBc.LIZ(sb2, c1271260jBc.LJIILLIIL, "e10");
        C1271260jBc.LIZ(sb2, c1271260jBc.LJIJ, "e11");
        sb2.append("e");
        return sb2.toString();
    }

    public final float LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    public final boolean LJI() {
        C1271260jBc c1271260jBc = this.LIZ;
        TTLHVideoFrameAdjustmentConfig tTLHVideoFrameAdjustmentConfig = c1271260jBc.LJJ;
        return ((tTLHVideoFrameAdjustmentConfig != null && !tTLHVideoFrameAdjustmentConfig.supportCameraAdjustmentWithHistoryLinkmic && (c1271260jBc.LIZJ || c1271260jBc.LIZIZ)) || (c1271260jBc.LJIJJLI && (tTLHVideoFrameAdjustmentConfig == null || !tTLHVideoFrameAdjustmentConfig.enableCameraAdjustmentInLinkmic)) || !c1271260jBc.LJFF(0) || tTLHVideoFrameAdjustmentConfig == null || !tTLHVideoFrameAdjustmentConfig.enableCameraAdjustment) ? false : true;
    }

    public static C1271250jBb LIZ() {
        return C1271270jBd.LIZ;
    }

    public final boolean LJFF(int i) {
        return this.LIZ.LJFF(i);
    }

    public final void LJIIIZ(boolean z) {
        C1271260jBc c1271260jBc = this.LIZ;
        if (c1271260jBc.LJIJJLI != z) {
            boolean zLJFF = c1271260jBc.LJFF(0);
            c1271260jBc.LJIJJLI = z;
            boolean z2 = true;
            c1271260jBc.LIZ.storeBoolean("linked_ever", true);
            if (c1271260jBc.LJIJJLI && !c1271260jBc.LJIL) {
                z2 = false;
            }
            c1271260jBc.LJIILL = z2;
            if (zLJFF != c1271260jBc.LJFF(0)) {
                c1271260jBc.LJII();
            }
        }
        c1271260jBc.LJIIIIZZ();
    }

    public final int[] LIZIZ(int i, int i2) {
        Integer num = (Integer) ((ConcurrentHashMap) this.LIZ.LJIIIIZZ).get(Integer.valueOf((i << 16) | i2));
        if (num != null) {
            int iIntValue = num.intValue() >>> 16;
            int iIntValue2 = num.intValue() & 65535;
            if (iIntValue > i && iIntValue2 <= i2) {
                return new int[]{iIntValue, iIntValue2};
            }
        }
        return new int[]{i, i2};
    }

    public final int[] LJ(int i, int i2, int i3) {
        int i4;
        int i5;
        C1271260jBc c1271260jBc = this.LIZ;
        c1271260jBc.getClass();
        if (i > 0 && i2 > 0 && c1271260jBc.LJFF(i3)) {
            int iLJ = c1271260jBc.LJ(i, i2, i3);
            if (c1271260jBc.LJFF(i3) && (i * 1.0f) / i2 >= c1271260jBc.LIZLLL() && (i5 = c1271260jBc.LJJI) > 0) {
                i4 = (((i2 + i5) - 1) / i5) * i5;
            } else {
                i4 = i2;
            }
            if (iLJ < i && i4 >= i2) {
                int i6 = (i << 16) | i2;
                if (!((ConcurrentHashMap) c1271260jBc.LJIIIZ).containsKey(Integer.valueOf(i6))) {
                    int i7 = (iLJ << 16) | i4;
                    ((ConcurrentHashMap) c1271260jBc.LJIIIZ).put(Integer.valueOf(i6), Integer.valueOf(i7));
                    ((ConcurrentHashMap) c1271260jBc.LJIIIIZZ).put(Integer.valueOf(i7), Integer.valueOf(i6));
                }
            }
            return new int[]{iLJ, i4};
        }
        return new int[]{i, i2};
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000e, code lost:
    
        if (r8 != 2) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(int r6, int r7, int r8) {
        /*
            r5 = this;
            X.0jBc r1 = r5.LIZ
            r1.getClass()
            r4 = 0
            if (r6 <= 0) goto L10
            if (r7 <= 0) goto L10
            r3 = 1
            if (r8 == r3) goto L11
            r0 = 2
            if (r8 == r0) goto L12
        L10:
            return r4
        L11:
            r3 = 0
        L12:
            com.bytedance.keva.Keva r2 = r1.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            r0 = 95
            r1.append(r0)
            r1.append(r7)
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            boolean r4 = r2.getBoolean(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271250jBb.LJII(int, int, int):boolean");
    }

    public final void LJIIIIZZ(int i, int i2, String str, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (this.LIZIZ == null) {
            this.LIZIZ = new C1268720j7W(this.LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preconfig isEnableInitTimeCostOpt:");
        sbLIZ.append(z);
        AVLog.logKibana(4, "VideoResolutionManager", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LIZ.LIZJ = z2;
        C1269160j8E c1269160j8E = new C1269160j8E();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setEnableInitializationTimeCostOpt isEnableInitTimeCostOpt:");
        sbLIZ2.append(z);
        com.ss.ttlivestreamer.core.utils.AVLog.logKibana(4, "LiveStreamBuilder", C2188811AlT.LIZIZ(sbLIZ2), null);
        c1269160j8E.LJLJI.LJJJLIIL = z;
        c1269160j8E.LJJLIIIJL(str);
        C1271260jBc c1271260jBc = this.LIZ;
        TTLHVideoFrameAdjustmentConfig tTLHVideoFrameAdjustmentConfigLJIJ = c1269160j8E.LIZ.ttlhABSettingsConfigs.LJIJ();
        c1271260jBc.LJJ = tTLHVideoFrameAdjustmentConfigLJIJ;
        boolean z5 = false;
        if (tTLHVideoFrameAdjustmentConfigLJIJ != null && tTLHVideoFrameAdjustmentConfigLJIJ.enable) {
            z3 = true;
        } else {
            z3 = false;
        }
        c1271260jBc.LIZLLL = z3;
        TTLHVideoFrameAdjustmentConfig tTLHVideoFrameAdjustmentConfig = this.LIZ.LJJ;
        if (i > 0 && i2 > 0 && tTLHVideoFrameAdjustmentConfig != null) {
            float f = (i * 1.0f) / i2;
            if (Math.abs(f - 0.5625f) < Math.abs(f - tTLHVideoFrameAdjustmentConfig.ratio)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.LIZJ = z4;
        } else {
            this.LIZJ = false;
        }
        C1271260jBc c1271260jBc2 = this.LIZ;
        TTLHVideoFrameAdjustmentConfig tTLHVideoFrameAdjustmentConfig2 = c1271260jBc2.LJJ;
        if (tTLHVideoFrameAdjustmentConfig2 != null) {
            if (tTLHVideoFrameAdjustmentConfig2.supportHistoryLinkMic || (!z2 && !c1271260jBc2.LIZIZ)) {
                z5 = true;
            }
            c1271260jBc2.LJ = z5;
            c1271260jBc2.LJFF = !this.LIZJ;
            c1271260jBc2.LJIJJ = tTLHVideoFrameAdjustmentConfig2.disableMutualExclusionDetection;
        }
    }
}
