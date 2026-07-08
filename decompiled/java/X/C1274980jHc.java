package X;

import com.ss.bytertc.engine.live.MixedStreamConfig;

/* JADX INFO: renamed from: X.0jHc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274980jHc {
    public static void LIZ(MixedStreamConfig mixedStreamConfig) {
        mixedStreamConfig.getVideoConfig().setRoiInfo(0.0f, 0.0f, 1.0f, 1.0f);
        mixedStreamConfig.getVideoConfig().setUpgradeRes(mixedStreamConfig.getVideoConfig().getWidth(), mixedStreamConfig.getVideoConfig().getHeight());
    }

    public static MixedStreamConfig.SourceCropInfo LIZJ(C1276050jJL c1276050jJL) {
        MixedStreamConfig.SourceCropInfo sourceCropInfo = new MixedStreamConfig.SourceCropInfo();
        sourceCropInfo.setLocationX(c1276050jJL.LIZ);
        sourceCropInfo.setLocationY(c1276050jJL.LIZIZ);
        sourceCropInfo.setWidthProportion(c1276050jJL.LIZJ);
        sourceCropInfo.setHeightProportion(c1276050jJL.LIZLLL);
        return sourceCropInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d A[PHI: r0
      0x009d: PHI (r0v28 int) = (r0v27 int), (r0v29 int) binds: [B:18:0x0097, B:20:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.AbstractC1273900jFs r6, X.C1275030jHh r7) {
        /*
            X.0j8W r6 = r6.LLD()
            X.0jHX r3 = r7.LIZ()
            if (r6 == 0) goto La0
            if (r3 == 0) goto La0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "syncLiveConfigToMixStream videoWidth="
            r1.append(r0)
            r7 = 1
            int r0 = r6.LJJIL(r7)
            r1.append(r0)
            java.lang.String r0 = " videoHeight = "
            r1.append(r0)
            int r0 = r6.LJJIJIIJIL(r7)
            r1.append(r0)
            java.lang.String r4 = X.C2188811AlT.LIZIZ(r1)
            r2 = 4
            java.lang.String r1 = "MixerChecker"
            r0 = 0
            com.ss.ttlivestreamer.core.utils.AVLog.logKibana(r2, r1, r4, r0)
            int r1 = r6.LJJIL(r7)
            int r0 = r6.LJJIJIIJIL(r7)
            r3.LJIIJ(r1, r0)
            int r0 = r6.LJJIJIIJI()
            r3.LJII(r0)
            int r0 = r6.LJJIFFI()
            int r0 = r0 / 1000
            r3.LJI(r0)
            int r0 = r6.LJJIJ()
            r5 = 2
            if (r0 != r5) goto Lb2
            X.0jIA r0 = X.EnumC1275320jIA.BYTEVC1
        L58:
            r3.LJII = r0
            int r4 = r6.LJJIJ()
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r6.LIZ
            com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase r2 = r0.mPushBase
            int r1 = r2.LIZJ
            r0 = -1
            if (r1 != r0) goto L69
            r2.LIZJ = r7
        L69:
            int r1 = r2.LIZJ
            if (r4 != r5) goto La4
            X.0jID r0 = X.EnumC1275350jID.MAIN
        L6f:
            r3.LJIIIIZZ = r0
            float r0 = r2.LJJIFFI()
            r3.LJIIIIZZ(r0)
            int r0 = r6.LJIIJ()
            r3.LIZLLL(r0)
            r3.LJIIL = r5
            int r0 = r6.LJIIIZ()
            if (r0 != r5) goto La1
            X.0jI4 r0 = X.EnumC1275260jI4.HE
        L89:
            r3.LJIILJJIL = r0
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r6.LIZ
            com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase r0 = r0.mPushBase
            int r0 = r0.LIZ()
            int r1 = r0 / 1000
            r0 = 32
            if (r1 < r0) goto L9d
            r0 = 256(0x100, float:3.59E-43)
            if (r1 <= r0) goto L9e
        L9d:
            r1 = r0
        L9e:
            r3.LJIILIIL = r1
        La0:
            return
        La1:
            X.0jI4 r0 = X.EnumC1275260jI4.LC
            goto L89
        La4:
            if (r1 == r5) goto Laf
            r0 = 3
            if (r1 == r0) goto Lac
            X.0jID r0 = X.EnumC1275350jID.BASELINE
            goto L6f
        Lac:
            X.0jID r0 = X.EnumC1275350jID.HIGH
            goto L6f
        Laf:
            X.0jID r0 = X.EnumC1275350jID.MAIN
            goto L6f
        Lb2:
            X.0jIA r0 = X.EnumC1275320jIA.H264
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274980jHc.LIZLLL(X.0jFs, X.0jHh):void");
    }

    public static void LIZIZ(MixedStreamConfig mixedStreamConfig, float f, boolean z) {
        boolean z2;
        mixedStreamConfig.getVideoConfig().setRoiInfo(0.0f, 0.0f, 1.0f, 1.0f);
        if (z) {
            mixedStreamConfig.getVideoConfig().setUpgradeRes(mixedStreamConfig.getVideoConfig().getWidth(), mixedStreamConfig.getVideoConfig().getHeight());
            return;
        }
        if (Math.abs(f - 0.5625f) < 1.0E-6f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            mixedStreamConfig.getVideoConfig().setUpgradeRes(1080, 1920);
            return;
        }
        if (Float.compare(f, 0.5f) == 0) {
            mixedStreamConfig.getVideoConfig().setUpgradeRes(960, 1920);
            return;
        }
        int i = (int) (1080.0f / f);
        if (i % 2 != 0) {
            i++;
        }
        mixedStreamConfig.getVideoConfig().setUpgradeRes(1080, i);
    }
}
