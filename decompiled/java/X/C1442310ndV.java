package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy;
import com.ss.android.vesdk.VESize;

/* JADX INFO: renamed from: X.0ndV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442310ndV implements InterfaceC1442420ndg {
    public static final /* synthetic */ C1442310ndV LJIILL = new C1442310ndV();
    public static final NowVQByteBenchStrategy LJIILLIIL;

    static {
        C212350188e c212350188eLIZJ = C212350188e.LIZJ();
        C844470XAv.LIZ.getClass();
        C09GA c09gaLIZIZ = c212350188eLIZJ.LIZIZ(C844470XAv.LJIIJ);
        LJIILLIIL = c09gaLIZIZ != null ? (NowVQByteBenchStrategy) c09gaLIZIZ.LJII(NowVQByteBenchStrategy.class) : null;
    }

    public static VESize LIZ() {
        String nowTakePictureSize;
        Object objLJII;
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        VESize vESize = null;
        if (nowVQByteBenchStrategy == null || (nowTakePictureSize = nowVQByteBenchStrategy.getNowTakePictureSize()) == null || !C1442370ndb.LIZIZ(nowTakePictureSize) || !LJIILL.enableSplitConfig()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("NowVQByteBenchApi ; now_ve_take_picture_size : ");
            nowTakePictureSize = "";
            sbLIZ.append("");
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (nowTakePictureSize.length() != 0) {
            try {
                objLJII = C0CHQ.LIZ().getGson().LJII(nowTakePictureSize, VESize.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Json AB ConfigError， Config:");
                sbLIZ2.append(nowTakePictureSize);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                objLJII = null;
            }
        } else {
            objLJII = null;
        }
        VESize vESize2 = (VESize) objLJII;
        if (vESize2 != null) {
            int i = vESize2.width;
            vESize = new VESize(i, (int) (i / 0.75f));
        }
        C564000MAc.LIZJ("NowVQByteBenchApi ; picture_size : " + vESize);
        return vESize;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019 A[PHI: r3
      0x0019: PHI (r3v2 java.lang.String) = (r3v0 java.lang.String), (r3v3 java.lang.String) binds: [B:14:0x0037, B:9:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.asve.context.PreviewSize LIZIZ() {
        /*
            com.ss.android.ugc.aweme.property.bytebench.NowVQByteBenchStrategy r0 = X.C1442310ndV.LJIILLIIL
            r2 = 0
            if (r0 == 0) goto L20
            java.lang.String r3 = r0.sourcePreviewSize()
            if (r3 == 0) goto L20
            boolean r0 = X.C1442370ndb.LIZIZ(r3)
            if (r0 == 0) goto L20
            X.0ndV r0 = X.C1442310ndV.LJIILL
            boolean r0 = r0.enableSplitConfig()
            if (r0 == 0) goto L20
        L19:
            int r0 = r3.length()
            if (r0 == 0) goto L60
            goto L3a
        L20:
            java.lang.String r3 = ayh.ge.LIZ()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "NowVQByteBenchApi ; now_ve_camera_preview_size : "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C564000MAc.LIZJ(r0)
            if (r3 == 0) goto L60
            goto L19
        L3a:
            X.1Ds4 r0 = X.C0CHQ.LIZ()     // Catch: java.lang.Exception -> L49
            com.google.gson.Gson r1 = r0.getGson()     // Catch: java.lang.Exception -> L49
            java.lang.Class<com.ss.android.ugc.asve.context.PreviewSize> r0 = com.ss.android.ugc.asve.context.PreviewSize.class
            java.lang.Object r0 = r1.LJII(r3, r0)     // Catch: java.lang.Exception -> L49
            goto L61
        L49:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Json AB ConfigError， Config:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LJ(r0)
        L60:
            r0 = r2
        L61:
            com.ss.android.ugc.asve.context.PreviewSize r0 = (com.ss.android.ugc.asve.context.PreviewSize) r0
            if (r0 == 0) goto L71
            com.ss.android.ugc.asve.context.PreviewSize r2 = new com.ss.android.ugc.asve.context.PreviewSize
            int r3 = r0.width
            float r1 = (float) r3
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            int r0 = (int) r1
            r2.<init>(r3, r0)
        L71:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "NowVQByteBenchApi ; previewSize : "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.C564000MAc.LIZJ(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1442310ndV.LIZIZ():com.ss.android.ugc.asve.context.PreviewSize");
    }

    public final String compileExternalSetting() {
        String strCompileExternalSetting;
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        if (nowVQByteBenchStrategy != null && (strCompileExternalSetting = nowVQByteBenchStrategy.compileExternalSetting()) != null && C1442370ndb.LIZIZ(strCompileExternalSetting) && LJIILL.enableSplitConfig()) {
            return strCompileExternalSetting;
        }
        String strLIZ = C1442690ne7.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowVQByteBenchApi ; now_ve_synthesis_settings : ");
        sbLIZ.append(strLIZ);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return strLIZ;
    }

    public final int compileVideoSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        if (nowVQByteBenchStrategy != null) {
            Integer numValueOf = Integer.valueOf(nowVQByteBenchStrategy.compileVideoSizeIndex());
            if (C1442370ndb.LIZIZ(Integer.valueOf(numValueOf.intValue())) && LJIILL.enableSplitConfig()) {
                return numValueOf.intValue();
            }
        }
        Integer numValueOf2 = Integer.valueOf(C1442320ndW.LIZ());
        int iIntValue = numValueOf2.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowVQByteBenchApi ; now_compile_video_size_index : ");
        sbLIZ.append(iIntValue);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return numValueOf2.intValue();
    }

    public final boolean enableSplitConfig() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        if (nowVQByteBenchStrategy != null) {
            return nowVQByteBenchStrategy.enableSplitConfig();
        }
        return false;
    }

    public final int recordVideoEncodeSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        if (nowVQByteBenchStrategy != null) {
            Integer numValueOf = Integer.valueOf(nowVQByteBenchStrategy.recordVideoEncodeSizeIndex());
            if (C1442370ndb.LIZIZ(Integer.valueOf(numValueOf.intValue())) && LJIILL.enableSplitConfig()) {
                return numValueOf.intValue();
            }
        }
        Integer numValueOf2 = Integer.valueOf(LJIILL.sourceVideoSizeIndex());
        int iIntValue = numValueOf2.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowVQByteBenchApi ; now_video_encode_size_index : ");
        sbLIZ.append(iIntValue);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return numValueOf2.intValue();
    }

    public final int shotScreenEncodeSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        if (nowVQByteBenchStrategy != null) {
            Integer numValueOf = Integer.valueOf(nowVQByteBenchStrategy.shotScreenEncodeSizeIndex());
            if (C1442370ndb.LIZIZ(Integer.valueOf(numValueOf.intValue())) && LJIILL.enableSplitConfig()) {
                return numValueOf.intValue();
            }
        }
        Integer numValueOf2 = Integer.valueOf(LJIILL.recordVideoEncodeSizeIndex());
        int iIntValue = numValueOf2.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowVQByteBenchApi ; now_shot_screen_encode_size_index : ");
        sbLIZ.append(iIntValue);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return numValueOf2.intValue();
    }

    public final float sourceBitrateFactor() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        if (nowVQByteBenchStrategy != null) {
            Float fValueOf = Float.valueOf(nowVQByteBenchStrategy.sourceBitrateFactor());
            if (C1442370ndb.LIZIZ(Float.valueOf(fValueOf.floatValue())) && LJIILL.enableSplitConfig()) {
                return fValueOf.floatValue();
            }
        }
        Float fValueOf2 = Float.valueOf(C1442360nda.LIZ());
        float fFloatValue = fValueOf2.floatValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowVQByteBenchApi ; now_video_bitrate : ");
        sbLIZ.append(fFloatValue);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return fValueOf2.floatValue();
    }

    public final int sourceVideoSizeIndex() {
        NowVQByteBenchStrategy nowVQByteBenchStrategy = LJIILLIIL;
        if (nowVQByteBenchStrategy != null) {
            Integer numValueOf = Integer.valueOf(nowVQByteBenchStrategy.sourceVideoSizeIndex());
            if (C1442370ndb.LIZIZ(Integer.valueOf(numValueOf.intValue())) && LJIILL.enableSplitConfig()) {
                return numValueOf.intValue();
            }
        }
        Integer numValueOf2 = Integer.valueOf(C1442330ndX.LIZ());
        int iIntValue = numValueOf2.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NowVQByteBenchApi ; now_video_size_index : ");
        sbLIZ.append(iIntValue);
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return numValueOf2.intValue();
    }
}
