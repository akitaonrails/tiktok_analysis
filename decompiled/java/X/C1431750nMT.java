package X;

import com.ss.android.ugc.aweme.creative.model.landscape.LandscapeVideoModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nMT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1431750nMT {
    public static final int[] LIZJ(VideoPublishEditModel videoPublishEditModel) {
        int[] iArrLJII = LJII(videoPublishEditModel);
        int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize();
        if (recordVideoSize != null && recordVideoSize.length >= 2 && iArrLJII.length >= 2) {
            int i = 0;
            if (C1431760nMU.LIZ(iArrLJII[0] / iArrLJII[1], recordVideoSize[0] / recordVideoSize[1], 0.05f)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UploadOutputVideoSize Duet ; floatsEqual ; outputSize : ");
                sbLIZ.append(C2296108z9.LIZ(iArrLJII));
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                return iArrLJII;
            }
            int iMin = Math.min(recordVideoSize[0], recordVideoSize[1]);
            int[] iArr = new int[2];
            float f = recordVideoSize[0] * 2;
            float f2 = recordVideoSize[1];
            if (f > f2) {
                iArr[1] = iMin;
                iArr[0] = (int) ((f / recordVideoSize[1]) * iMin);
            } else {
                iArr[0] = iMin;
                iArr[1] = (int) ((f2 / f) * iMin);
            }
            do {
                int i2 = iArr[i];
                int i3 = i2 % 16;
                if (i3 < 8) {
                    iArr[i] = i2 - i3;
                } else {
                    iArr[i] = (i2 + 16) - i3;
                }
                i++;
            } while (i < 2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("UploadOutputVideoSize Duet ; final ; sourceSize : ");
            sbLIZ2.append(C2296108z9.LIZ(iArrLJII));
            sbLIZ2.append(" recordSize : ");
            sbLIZ2.append(C2296108z9.LIZ(recordVideoSize));
            sbLIZ2.append(" outputSize : ");
            sbLIZ2.append(C2296108z9.LIZ(iArr));
            sbLIZ2.append(' ');
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            return iArr;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("UploadOutputVideoSize Duet ; inputInvalid ; outputSize : ");
        sbLIZ3.append(C2296108z9.LIZ(iArrLJII));
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
        return iArrLJII;
    }

    public static final int[] LJ(VideoPublishEditModel videoPublishEditModel) {
        int[] iArrLJII = LJII(videoPublishEditModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadOutputVideoSize PhotoCanvas; outputSize : ");
        sbLIZ.append(C2296108z9.LIZ(iArrLJII));
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return iArrLJII;
    }

    public static final int[] LJII(VideoPublishEditModel videoPublishEditModel) {
        int[] iArrLJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("outputSize : [");
        sbLIZ.append(videoPublishEditModel.getOutVideoWidth());
        sbLIZ.append(" , ");
        sbLIZ.append(videoPublishEditModel.getOutVideoHeight());
        sbLIZ.append("] ; canvasSize : [");
        sbLIZ.append(videoPublishEditModel.getVideoCanvasWidth());
        sbLIZ.append(", ");
        sbLIZ.append(videoPublishEditModel.getVideoCanvasHeight());
        sbLIZ.append("] ;  videoSize : [");
        sbLIZ.append(videoPublishEditModel.videoWidth());
        sbLIZ.append(", ");
        sbLIZ.append(videoPublishEditModel.videoHeight());
        sbLIZ.append("] ; sourceSize : [");
        sbLIZ.append(videoPublishEditModel.sourceVideoWidth());
        sbLIZ.append(", ");
        sbLIZ.append(videoPublishEditModel.sourceVideoHeight());
        sbLIZ.append("] ; isFastImport : ");
        sbLIZ.append(C1428470nHB.LJJLIIIJ(videoPublishEditModel));
        sbLIZ.append(" isFastImport : ");
        sbLIZ.append(videoPublishEditModel.isFastImport());
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (((Boolean) C280540Az6.LIZ.getValue()).booleanValue()) {
            iArrLJIIIIZZ = LJIIIIZZ(videoPublishEditModel);
        } else if (C1428470nHB.LIZLLL(videoPublishEditModel) && videoPublishEditModel.getOutVideoWidth() > 0 && videoPublishEditModel.getOutVideoHeight() > 0) {
            iArrLJIIIIZZ = new int[]{videoPublishEditModel.getOutVideoWidth(), videoPublishEditModel.getOutVideoHeight()};
        } else if (videoPublishEditModel.isFastImport()) {
            iArrLJIIIIZZ = new int[]{-1, -1};
        } else {
            iArrLJIIIIZZ = new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UploadOutputVideoSize; sourceSize : ");
        sbLIZ2.append(C2296108z9.LIZ(iArrLJIIIIZZ));
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        return iArrLJIIIIZZ;
    }

    public static final int[] LJIIIIZZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        boolean needExpandCompiledSize;
        if (C1428470nHB.LJJLIIIJ(videoPublishEditModel)) {
            int iSourceVideoWidth = videoPublishEditModel.sourceVideoWidth();
            int iSourceVideoHeight = videoPublishEditModel.sourceVideoHeight();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sourceSize -> sourceVideoSize : [");
            sbLIZ.append(iSourceVideoWidth);
            sbLIZ.append(", ");
            sbLIZ.append(iSourceVideoHeight);
            sbLIZ.append("] ; isFastImportForLog : ");
            sbLIZ.append(C1428470nHB.LJJLIIIJ(videoPublishEditModel));
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            if (iSourceVideoWidth > 0 && iSourceVideoHeight > 0) {
                z = true;
            } else {
                z = false;
            }
            if (videoPublishEditModel.getOutVideoWidth() > 0 && videoPublishEditModel.getOutVideoHeight() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z) {
                if (z2) {
                    return new int[]{videoPublishEditModel.getOutVideoWidth(), videoPublishEditModel.getOutVideoHeight()};
                }
                return new int[]{720, 1280};
            }
            CoverPublishModel coverPublishModel = videoPublishEditModel.getCoverPublishModel();
            if (coverPublishModel != null) {
                needExpandCompiledSize = coverPublishModel.getNeedExpandCompiledSize();
            } else {
                needExpandCompiledSize = false;
            }
            if (z2 && !needExpandCompiledSize && iSourceVideoWidth > iSourceVideoHeight && Math.abs((iSourceVideoWidth / iSourceVideoHeight) - (videoPublishEditModel.getOutVideoWidth() / videoPublishEditModel.getOutVideoHeight())) >= 0.1f) {
                needExpandCompiledSize = true;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("sourceSize -> needExpand: ");
            sbLIZ2.append(needExpandCompiledSize);
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
            if (needExpandCompiledSize && z2) {
                return new int[]{iSourceVideoWidth, (int) (iSourceVideoWidth * (videoPublishEditModel.getOutVideoHeight() / videoPublishEditModel.getOutVideoWidth()))};
            }
            return new int[]{videoPublishEditModel.sourceVideoWidth(), videoPublishEditModel.sourceVideoHeight()};
        }
        if (C1428470nHB.LIZLLL(videoPublishEditModel) && videoPublishEditModel.getOutVideoWidth() > 0 && videoPublishEditModel.getOutVideoHeight() > 0) {
            return new int[]{videoPublishEditModel.getOutVideoWidth(), videoPublishEditModel.getOutVideoHeight()};
        }
        if (videoPublishEditModel.isFastImport()) {
            return new int[]{-1, -1};
        }
        return new int[]{videoPublishEditModel.videoWidth(), videoPublishEditModel.videoHeight()};
    }

    public static final int[] LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        int[] iArrLJII = LJII(videoPublishEditModel);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadOutputVideoSize Template; outputSize : ");
        sbLIZ.append(C2296108z9.LIZ(iArrLJII));
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        return iArrLJII;
    }

    public static final String LJIIJJI(int[] iArr) {
        if (iArr.length < 2) {
            return "unknown";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(iArr[0]);
        sbLIZ.append('*');
        sbLIZ.append(iArr[1]);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final int[] LIZ(VideoPublishEditModel videoPublishEditModel, int[] iArr) {
        int videoCanvasWidth;
        Integer numLJJIIJ;
        int videoCanvasHeight;
        Integer numLJJIIJ2;
        int[] iArrLIZIZ = LIZIZ(videoPublishEditModel, iArr);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadOutputVideoSize Celebration; outputSize : ");
        sbLIZ.append(C2296108z9.LIZ(iArrLIZIZ));
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        Integer numLJJIIJ3 = C13LQ.LJJIIJ(0, iArrLIZIZ);
        if (numLJJIIJ3 == null || numLJJIIJ3.intValue() <= 0) {
            if (iArr != null && (numLJJIIJ = C13LQ.LJJIIJ(0, iArr)) != null) {
                videoCanvasWidth = numLJJIIJ.intValue();
            } else {
                videoCanvasWidth = videoPublishEditModel.getVideoCanvasWidth();
            }
            iArrLIZIZ[0] = videoCanvasWidth;
        }
        Integer numLJJIIJ4 = C13LQ.LJJIIJ(1, iArrLIZIZ);
        if (numLJJIIJ4 == null || numLJJIIJ4.intValue() <= 0) {
            if (iArr != null && (numLJJIIJ2 = C13LQ.LJJIIJ(1, iArr)) != null) {
                videoCanvasHeight = numLJJIIJ2.intValue();
            } else {
                videoCanvasHeight = videoPublishEditModel.getVideoCanvasHeight();
            }
            iArrLIZIZ[1] = videoCanvasHeight;
        }
        return iArrLIZIZ;
    }

    public static final int[] LIZIZ(VideoPublishEditModel videoPublishEditModel, int[] iArr) {
        boolean z;
        int i;
        int[] iArrLJII = LJII(videoPublishEditModel);
        if (iArr == null) {
            return iArrLJII;
        }
        int[] iArr2 = new int[2];
        int i2 = iArrLJII[0];
        int i3 = iArrLJII[1];
        if (i2 > i3) {
            z = true;
        } else {
            z = false;
        }
        int iMax = Math.max(i2, i3);
        int iMin = Math.min(iArrLJII[0], iArrLJII[1]);
        float f = iMax / iMin;
        int iMax2 = Math.max(iArr[0], iArr[1]);
        int iMin2 = Math.min(iArr[0], iArr[1]);
        if (iMin2 == 1080) {
            i = 1100;
        } else {
            i = iMin2;
        }
        if (C1428470nHB.LL(videoPublishEditModel) && C0C64.LJIILLIIL().LJIILL(31744, "creative_compile_thin_video_height_factor", true, 0.0f) > 0.0f && iArrLJII[0] * 16 < iArrLJII[1] * 9) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UploadOutputVideoSize , enableThinVideoOpt, targetMax = ");
            sbLIZ.append(iMax2);
            sbLIZ.append(" , factor : ");
            sbLIZ.append(C0C64.LJIILLIIL().LJIILL(31744, "creative_compile_thin_video_height_factor", true, 0.0f));
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            iMax2 = Math.max(iMax2, (int) (C0C64.LJIILLIIL().LJIILL(31744, "creative_compile_thin_video_height_factor", true, 0.0f) * iMax2));
        }
        if (iMax > iMax2 || iMin > i) {
            if (iMax * iMin2 >= iMin * iMax2) {
                iMin = (int) (iMax2 / f);
                iMax = iMax2;
            } else {
                iMax = (int) (iMin2 * f);
                iMin = iMin2;
            }
        }
        if (z) {
            iArr2[0] = iMax;
            iArr2[1] = iMin;
        } else {
            iArr2[1] = iMax;
            iArr2[0] = iMin;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("UploadOutputVideoSize default; outputSize : ");
        sbLIZ2.append(C2296108z9.LIZ(iArr2));
        sbLIZ2.append(" ;");
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        return iArr2;
    }

    public static final int[] LJI(VideoPublishEditModel videoPublishEditModel, boolean z) {
        int i;
        if (z) {
            i = 1920;
        } else {
            i = 1280;
        }
        int iMin = Math.min(videoPublishEditModel.sourceVideoWidth(), i);
        int[] iArr = {iMin & (-4), ((iMin * 16) / 9) & (-4)};
        C1424160nAE c1424160nAE = C1424160nAE.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pseudoHorizontalScreenOutputSize; outputSize : ");
        sbLIZ.append(C2296108z9.LIZ(iArr));
        C201955140j.LIZLLL(c1424160nAE, "PseudoHorizontalScreen", C2188811AlT.LIZIZ(sbLIZ));
        return iArr;
    }

    public static final int[] LJIIJ(VideoPublishEditModel videoPublishEditModel, int[] iArr) {
        boolean z;
        int[] iArrLIZIZ = LIZIZ(videoPublishEditModel, iArr);
        if (iArrLIZIZ[0] > 0 && iArrLIZIZ[1] > 0) {
            z = true;
        } else {
            z = false;
        }
        if (C287070BMz.LIZ() > 0 && z) {
            int i = iArrLIZIZ[0];
            int i2 = iArrLIZIZ[1];
            if (Math.min(i, i2) < C287070BMz.LIZ()) {
                int iLIZ = C287070BMz.LIZ();
                if (i > i2) {
                    iArrLIZIZ[0] = (i * iLIZ) / i2;
                    iArrLIZIZ[1] = iLIZ;
                } else {
                    iArrLIZIZ[1] = (i2 * iLIZ) / i;
                    iArrLIZIZ[0] = iLIZ;
                    return iArrLIZIZ;
                }
            }
        }
        return iArrLIZIZ;
    }

    public static final boolean LIZLLL(VideoPublishEditModel videoPublishEditModel, boolean z, boolean z2) {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_pseudo_horizontal_screen_enable", true, false)) {
            C201955140j.LIZLLL(C1424160nAE.LIZIZ, "PseudoHorizontalScreen", "Experiment is disabled");
            return false;
        }
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_pseudo_horizontal_screen_support_non_hd", true, false) && !z2) {
            C201955140j.LIZLLL(C1424160nAE.LIZIZ, "PseudoHorizontalScreen", "PseudoHorizontalScreenSupportNonHdExperiment is disabled and isHighQualityOpen is false");
            return false;
        }
        if (z) {
            C201955140j.LIZLLL(C1424160nAE.LIZIZ, "PseudoHorizontalScreen", "isEditSave is true");
            return false;
        }
        if (videoPublishEditModel.getTtStoryUploadModel() != null) {
            C201955140j.LIZLLL(C1424160nAE.LIZIZ, "PseudoHorizontalScreen", "isStoryPublishMode() is true");
            return false;
        }
        int iMin = Math.min(videoPublishEditModel.sourceVideoWidth(), videoPublishEditModel.sourceVideoHeight());
        if (iMin < 720) {
            C1424160nAE c1424160nAE = C1424160nAE.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("min video size (");
            sbLIZ.append(iMin);
            sbLIZ.append(") is less than 720");
            C201955140j.LIZLLL(c1424160nAE, "PseudoHorizontalScreen", C2188811AlT.LIZIZ(sbLIZ));
            return false;
        }
        LandscapeVideoModel landscapeVideoModel = videoPublishEditModel.creativeModel.landscapeVideoModel;
        if (landscapeVideoModel.isFakeLandscapeVideo && landscapeVideoModel.blackLevel != 0) {
            C201955140j.LIZLLL(C1424160nAE.LIZIZ, "PseudoHorizontalScreen", "isPseudoHorizontalScreen() is true");
            return true;
        }
        C201955140j.LIZLLL(C1424160nAE.LIZIZ, "PseudoHorizontalScreen", "not fake landscape video or blackLevel is 0");
        return false;
    }

    public static final int[] LJFF(VideoPublishEditModel videoPublishEditModel, boolean z, int[] iArr) {
        if (!z) {
            int[] iArrLJII = LJII(videoPublishEditModel);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UploadOutputVideoSize PhotoMV; outputSize : ");
            sbLIZ.append(C2296108z9.LIZ(iArrLJII));
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return iArrLJII;
        }
        return LIZIZ(videoPublishEditModel, iArr);
    }
}
