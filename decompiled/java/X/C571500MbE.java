package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.CutSameModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.creative.model.grid.QuickGridModel;
import com.ss.android.ugc.aweme.creative.model.story.StreaksData;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramPersistenceModel;
import com.ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.ClientCherEffectParam;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VECherEffectParam;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEUtils;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0MbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571500MbE {
    public static final void LIZ(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo.getCalculateWidth() <= 0 || editPreviewInfo.getCalculateHeight() <= 0) {
            VESize vESizeCalcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C571630MbR.LIZ(editPreviewInfo), editPreviewInfo.getPreviewWidth());
            editPreviewInfo.setCalculateWidth(vESizeCalcTargetRes.width);
            editPreviewInfo.setCalculateHeight(vESizeCalcTargetRes.height);
        }
    }

    public static final String LIZIZ(int[] iArr) {
        StringBuilder sb = new StringBuilder(e3.e);
        for (int i : iArr) {
            sb.append(i);
            sb.append(", ");
        }
        sb.append(e3.f);
        return sb.toString();
    }

    public static final EditVideoSegment LJ(DraftVideoSegment draftVideoSegment) {
        String str = draftVideoSegment.videoPath;
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, draftVideoSegment.audioPath, LJIIJ(str));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(draftVideoSegment.start, draftVideoSegment.end, draftVideoSegment.speed, draftVideoSegment.rotate));
        return editVideoSegment;
    }

    public static final EditVideoSegment LJFF(VideoSegment videoSegment) {
        String strLJFF = videoSegment.LJFF(false);
        strLJFF.toString();
        int i = 0;
        EditVideoSegment editVideoSegment = new EditVideoSegment(strLJFF, null, new VideoFileInfo(videoSegment.width, videoSegment.height, videoSegment.duration, videoSegment.LJ(), videoSegment.LIZIZ(), i, i, i, 0.0f, 480, null));
        editVideoSegment.setVideoCutInfo(new VideoCutInfo(videoSegment.LJII(), videoSegment.LIZLLL(), videoSegment.LJI(), videoSegment.rotate));
        editVideoSegment.setAigcInfo(videoSegment.aigcInfo);
        return editVideoSegment;
    }

    public static final VideoFileInfo LJIIIIZZ(VEUtils.VEVideoFileInfo vEVideoFileInfo) {
        return new VideoFileInfo(vEVideoFileInfo.width, vEVideoFileInfo.height, vEVideoFileInfo.duration, vEVideoFileInfo.fps, vEVideoFileInfo.bitrate, vEVideoFileInfo.codec, vEVideoFileInfo.keyFrameCount, 0, vEVideoFileInfo.floatFPS, 128, null);
    }

    public static final VideoFileInfo LJIIJ(String str) {
        int i = 0;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
            int[] iArr = new int[10];
            if (str != null && VEUtils.getVideoFileInfo(str, iArr) == 0) {
                return new VideoFileInfo(iArr[0], iArr[1], iArr[3], iArr[7], iArr[6], i, i, i, 0.0f, 480, null);
            }
            return new VideoFileInfo(i, i, 0L, i, i, i, i, i, 0.0f, 496, defaultConstructorMarker);
        }
        return new VideoFileInfo(i, i, 0L, i, i, i, i, i, 0.0f, 496, null);
    }

    public static final float LJIIJJI(EditPreviewInfo editPreviewInfo, boolean z) {
        int iIntValue;
        if (editPreviewInfo.getVideoList().isEmpty()) {
            return -1.0f;
        }
        Iterator<EditVideoSegment> it2 = editPreviewInfo.getVideoList().iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (!C2471909mP.LJJIII(it2.next().getVideoPath(), false, 6)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        if (((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue)).getVideoFileInfo().getFpsFloat() == -100.0f) {
            if (z) {
                return -100.0f;
            }
            VEUtils.VEVideoFileInfo vEVideoFileInfoLIZJ = C574790MgX.LIZJ(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue)).getVideoPath());
            if (vEVideoFileInfoLIZJ != null) {
                ListProtector.set(editPreviewInfo.getVideoList(), iIntValue, EditVideoSegment.copy$default((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue), null, null, LJIIIIZZ(vEVideoFileInfoLIZJ), null, 11, null));
            } else {
                int i2 = 0;
                ListProtector.set(editPreviewInfo.getVideoList(), iIntValue, EditVideoSegment.copy$default((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue), null, null, new VideoFileInfo(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue)).getVideoFileInfo().getWidth(), ((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue)).getVideoFileInfo().getHeight(), ((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue)).getVideoFileInfo().getDuration(), i2, i2, i2, i2, i2, 0.0f, 504, null), null, 11, null));
            }
        }
        return ((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), iIntValue)).getVideoFileInfo().getFpsFloat();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C443120HZe<EditVideoSegment, Long, long[]> LJIIIZ(EditPreviewInfo editPreviewInfo, boolean z, long j) {
        boolean z2;
        EditVideoSegment editVideoSegment;
        long duration;
        long duration2;
        String[] reverseVideoArray;
        String str;
        long speed = j;
        List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
        int i = 0;
        if (videoList != null && !videoList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str2 = null;
        if (z2) {
            return null;
        }
        long[] jArr = {0, -1};
        long j2 = 0;
        if (z && (reverseVideoArray = editPreviewInfo.getReverseVideoArray()) != null && (str = reverseVideoArray[0]) != null && str.length() != 0) {
            String[] reverseVideoArray2 = editPreviewInfo.getReverseVideoArray();
            if (reverseVideoArray2 != null) {
                str2 = reverseVideoArray2[0];
            }
            editVideoSegment = new EditVideoSegment(str2, 0 == true ? 1 : 0, new VideoFileInfo(i, i, j2, i, i, i, i, i, 0.0f, 496, null), 2, 0 == true ? 1 : 0);
        } else {
            int size = editPreviewInfo.getVideoList().size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    EditVideoSegment editVideoSegment2 = (EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), i2);
                    VideoCutInfo videoCutInfo = editVideoSegment2.getVideoCutInfo();
                    if (videoCutInfo != null) {
                        duration = (long) ((videoCutInfo.getEnd() - videoCutInfo.getStart()) / videoCutInfo.getSpeed());
                    } else {
                        duration = editVideoSegment2.getVideoFileInfo().getDuration();
                    }
                    long j3 = duration + j2;
                    if (j3 > speed) {
                        speed -= j2;
                        VideoCutInfo videoCutInfo2 = editVideoSegment2.getVideoCutInfo();
                        if (videoCutInfo2 != null) {
                            speed = (long) ((speed * videoCutInfo2.getSpeed()) + videoCutInfo2.getStart());
                        }
                    } else {
                        i2++;
                        j2 = j3;
                    }
                } else {
                    i2 = 0;
                    break;
                }
            }
            editVideoSegment = (EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), i2);
        }
        jArr[0] = j2;
        VideoCutInfo videoCutInfo3 = editVideoSegment.getVideoCutInfo();
        if (videoCutInfo3 != null) {
            duration2 = (long) ((videoCutInfo3.getEnd() - videoCutInfo3.getStart()) / videoCutInfo3.getSpeed());
        } else {
            duration2 = editVideoSegment.getVideoFileInfo().getDuration();
        }
        jArr[1] = j2 + duration2;
        return new C443120HZe<>(editVideoSegment, Long.valueOf(speed), jArr);
    }

    public static final VEPreviewParams LJI(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3) {
        String[] matrix;
        double[] duration;
        boolean[] segUseCher;
        int size;
        float f;
        long j;
        int duration2;
        CanvasExtra canvasExtra;
        CanvasExtra canvasExtra2;
        VEPreviewParams vEPreviewParams = new VEPreviewParams();
        if (videoPublishEditModel.getPreviewInfo() != null) {
            EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
            List<EditVideoSegment> videoList = previewInfo.getVideoList();
            if (videoList != null && (size = videoList.size()) > 0) {
                String[] strArr = new String[size];
                for (int i4 = 0; i4 < size; i4++) {
                    strArr[i4] = "";
                }
                vEPreviewParams.mVideoPaths = strArr;
                String[] strArr2 = new String[size];
                int i5 = 0;
                do {
                    strArr2[i5] = "";
                    i5++;
                } while (i5 < size);
                vEPreviewParams.mAudioPaths = strArr2;
                int i6 = 0;
                for (EditVideoSegment editVideoSegment : previewInfo.getVideoList()) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        EditVideoSegment editVideoSegment2 = editVideoSegment;
                        vEPreviewParams.mVideoPaths[i6] = editVideoSegment2.getVideoPath();
                        vEPreviewParams.mAudioPaths[i6] = editVideoSegment2.getAudioPath();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("EditPageModelExt -> toPreviewParams: videoPath: ");
                        sbLIZ.append(editVideoSegment2.getVideoPath());
                        sbLIZ.append('.');
                        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        VideoCutInfo videoCutInfo = editVideoSegment2.getVideoCutInfo();
                        if (videoCutInfo != null) {
                            if (vEPreviewParams.mSpeedArray == null) {
                                float[] fArr = new float[size];
                                int i8 = 0;
                                do {
                                    fArr[i8] = 1.0f;
                                    i8++;
                                } while (i8 < size);
                                vEPreviewParams.mSpeedArray = fArr;
                            }
                            if (vEPreviewParams.mRotateArray == null) {
                                int[] iArr = new int[size];
                                int i9 = 0;
                                do {
                                    iArr[i9] = 0;
                                    i9++;
                                } while (i9 < size);
                                vEPreviewParams.mRotateArray = iArr;
                            }
                            if (vEPreviewParams.mVTrimIn == null) {
                                int[] iArr2 = new int[size];
                                int i10 = 0;
                                do {
                                    iArr2[i10] = 0;
                                    i10++;
                                } while (i10 < size);
                                vEPreviewParams.mVTrimIn = iArr2;
                            }
                            if (vEPreviewParams.mVTrimOut == null) {
                                int[] iArr3 = new int[size];
                                int i11 = 0;
                                do {
                                    iArr3[i11] = -1;
                                    i11++;
                                } while (i11 < size);
                                vEPreviewParams.mVTrimOut = iArr3;
                            }
                            vEPreviewParams.getSpeedArray()[i6] = videoCutInfo.getSpeed();
                            vEPreviewParams.getRotateArray()[i6] = videoCutInfo.getRotate();
                            vEPreviewParams.mVTrimIn[i6] = (int) videoCutInfo.getStart();
                            vEPreviewParams.mVTrimOut[i6] = (int) videoCutInfo.getEnd();
                        }
                        if (videoPublishEditModel.getVideoEditorType() == 11) {
                            if (vEPreviewParams.mSpeedArray == null) {
                                float[] fArr2 = new float[size];
                                int i12 = 0;
                                while (true) {
                                    f = 1.0f;
                                    if (i12 >= size) {
                                        break;
                                    }
                                    fArr2[i12] = 1.0f;
                                    i12++;
                                }
                                vEPreviewParams.mSpeedArray = fArr2;
                            } else {
                                f = 1.0f;
                            }
                            if (vEPreviewParams.mRotateArray == null) {
                                int[] iArr4 = new int[size];
                                int i13 = 0;
                                do {
                                    iArr4[i13] = 0;
                                    i13++;
                                } while (i13 < size);
                                vEPreviewParams.mRotateArray = iArr4;
                            }
                            if (vEPreviewParams.mVTrimIn == null) {
                                int[] iArr5 = new int[size];
                                int i14 = 0;
                                do {
                                    iArr5[i14] = 0;
                                    i14++;
                                } while (i14 < size);
                                vEPreviewParams.mVTrimIn = iArr5;
                            }
                            if (vEPreviewParams.mVTrimOut == null) {
                                int[] iArr6 = new int[size];
                                int i15 = 0;
                                do {
                                    iArr6[i15] = -1;
                                    i15++;
                                } while (i15 < size);
                                vEPreviewParams.mVTrimOut = iArr6;
                            }
                            if (i6 == 0) {
                                float[] fArr3 = vEPreviewParams.mSpeedArray;
                                CanvasVideoData canvasVideoData = videoPublishEditModel.getCanvasVideoData();
                                if (canvasVideoData != null && (canvasExtra2 = canvasVideoData.extra) != null) {
                                    f = canvasExtra2.speed;
                                }
                                fArr3[i6] = f;
                            }
                            int[] iArr7 = vEPreviewParams.mVTrimIn;
                            CanvasVideoData canvasVideoData2 = videoPublishEditModel.getCanvasVideoData();
                            if (canvasVideoData2 != null && (canvasExtra = canvasVideoData2.extra) != null) {
                                j = canvasExtra.startTime;
                            } else {
                                j = 0;
                            }
                            iArr7[i6] = (int) j;
                            int[] iArr8 = vEPreviewParams.mVTrimOut;
                            int i16 = vEPreviewParams.mVTrimIn[i6];
                            if (i3 <= 0) {
                                VideoFileInfo videoFileInfo = editVideoSegment2.getVideoFileInfo();
                                if (videoFileInfo != null) {
                                    duration2 = (int) videoFileInfo.getDuration();
                                } else {
                                    duration2 = 5000;
                                }
                            } else {
                                duration2 = i3;
                            }
                            iArr8[i6] = i16 + duration2;
                        }
                        i6 = i7;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            vEPreviewParams.sceneIn = (int) previewInfo.getSceneIn();
            vEPreviewParams.sceneOut = (int) previewInfo.getSceneOut();
            vEPreviewParams.mPreviewWidth = previewInfo.getPreviewWidth();
            vEPreviewParams.mPreviewHeight = previewInfo.getPreviewHeight();
        }
        if (i != -1) {
            vEPreviewParams.mPageType = i;
        }
        if (i2 != -1) {
            vEPreviewParams.mFps = i2;
        }
        vEPreviewParams.isFromCut = videoPublishEditModel.getFromCut();
        vEPreviewParams.mWorkspace = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJZI(videoPublishEditModel);
        vEPreviewParams.setCanvasWidth(videoPublishEditModel.getVideoCanvasWidth());
        vEPreviewParams.setCanvasHeight(videoPublishEditModel.getVideoCanvasHeight());
        vEPreviewParams.mVolume = videoPublishEditModel.getVoiceVolume();
        vEPreviewParams.mMusicVolume = videoPublishEditModel.getMusicVolume();
        vEPreviewParams.mDbRange = 0.0d;
        vEPreviewParams.mMusicInPoint = videoPublishEditModel.getMMusicStart();
        vEPreviewParams.mMusicOutPoint = videoPublishEditModel.getMMusicEnd();
        vEPreviewParams.useAudioInVideo = !C1416310mxZ.LJJJJZ(videoPublishEditModel);
        vEPreviewParams.mMusicPath = videoPublishEditModel.getMMusicPath();
        vEPreviewParams.isFastImport = videoPublishEditModel.isFastImport();
        vEPreviewParams.isCutSameType = videoPublishEditModel.isCutSameVideoType();
        vEPreviewParams.mIsFromDraft = videoPublishEditModel.mIsFromDraft;
        vEPreviewParams.videoEditorType = videoPublishEditModel.getVideoEditorType();
        vEPreviewParams.imageAlbumModel = videoPublishEditModel.creativeModel.imageAlbumModel;
        vEPreviewParams.mvCreateVideoData = videoPublishEditModel.getMvCreateVideoData();
        vEPreviewParams.recordData = videoPublishEditModel.getMultiEditVideoRecordData();
        vEPreviewParams.stitchParams = videoPublishEditModel.getStitchParams();
        if (videoPublishEditModel.getVeCherEffectParam() != null) {
            ClientCherEffectParam veCherEffectParam = videoPublishEditModel.getVeCherEffectParam();
            if (veCherEffectParam != null) {
                matrix = veCherEffectParam.getMatrix();
            } else {
                matrix = null;
            }
            ClientCherEffectParam veCherEffectParam2 = videoPublishEditModel.getVeCherEffectParam();
            if (veCherEffectParam2 != null) {
                duration = veCherEffectParam2.getDuration();
            } else {
                duration = null;
            }
            ClientCherEffectParam veCherEffectParam3 = videoPublishEditModel.getVeCherEffectParam();
            if (veCherEffectParam3 != null) {
                segUseCher = veCherEffectParam3.getSegUseCher();
            } else {
                segUseCher = null;
            }
            vEPreviewParams.veCherEffectParam = new VECherEffectParam(matrix, duration, segUseCher);
        }
        if (videoPublishEditModel.getVeAudioEffectParam() != null) {
            vEPreviewParams.setVeAudioEffectParam(videoPublishEditModel.getVeAudioEffectParam());
        }
        if (videoPublishEditModel.isFastImport() || videoPublishEditModel.isCutSameVideoType()) {
            vEPreviewParams.mAudioPaths = null;
        }
        vEPreviewParams.isStoryEditMode = videoPublishEditModel.isStoryEditMode();
        CanvasVideoData canvasVideoData3 = videoPublishEditModel.getCanvasVideoData();
        vEPreviewParams.canvasVideoPreviewData = canvasVideoData3;
        if (canvasVideoData3 == null) {
            EditModel editModel = videoPublishEditModel.creativeModel.editModel;
            Integer num = editModel.storyCanvasBgColorFromAlbumStart;
            Integer num2 = editModel.storyCanvasBgColorFromAlbumEnd;
            if (num != null && num2 != null) {
                vEPreviewParams.storyCanvasBgColorStart = num;
                vEPreviewParams.storyCanvasBgColorEnd = num2;
            }
        }
        vEPreviewParams.singleImageCoverBitmapData = videoPublishEditModel.getSingleImageCoverBitmapData();
        vEPreviewParams.isVideoImageMixFastImport = C1428470nHB.LJLIIIL(videoPublishEditModel);
        vEPreviewParams.setEnableMusicSync(C1428470nHB.LJIIZILJ(videoPublishEditModel));
        vEPreviewParams.isMusicSyncMode = videoPublishEditModel.getEditMusicSyncMode();
        CutSameModel cutSameModel = videoPublishEditModel.creativeModel.cutSameModel;
        if (cutSameModel != null) {
            vEPreviewParams.selectedTemplateStr = cutSameModel.selectedTemplate;
            vEPreviewParams.selectedTemplateMediaItemList = new ArrayList<>(cutSameModel.selectedTemplateMediaItemList);
            vEPreviewParams.nleModelCachedId = cutSameModel.nleModelCachedId;
        }
        CelebrationData celebrationData = videoPublishEditModel.creativeModel.celebrationData;
        if (celebrationData != null) {
            vEPreviewParams.nleData = celebrationData.getNleData();
        }
        String[] strArr3 = vEPreviewParams.mAudioPaths;
        if (strArr3 != null && ((ArrayList) C13LQ.LJIJI(strArr3)).isEmpty()) {
            vEPreviewParams.mAudioPaths = null;
        }
        TangramPersistenceModel tangramPersistenceModel = videoPublishEditModel.creativeModel.tangramPersistenceModel;
        if (tangramPersistenceModel != null) {
            vEPreviewParams.mUseCanvasStyle = tangramPersistenceModel.useCanvasStyle;
        }
        C201955140j.LIZ("EditPageModelExt -> toPreviewParams: " + vEPreviewParams);
        return vEPreviewParams;
    }

    public static /* synthetic */ VEPreviewParams LJII(VideoPublishEditModel videoPublishEditModel, int i, int i2, int i3) {
        int i4 = -1;
        if ((i3 & 1) != 0) {
            i = -1;
        }
        if ((i3 & 2) != 0) {
            i2 = -1;
        }
        if ((i3 & 4) == 0) {
            i4 = 0;
        }
        return LJI(videoPublishEditModel, i, i2, i4);
    }

    public static final int LIZJ(VideoPublishEditModel videoPublishEditModel, EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        boolean z4;
        CanvasVideoData canvasVideoData;
        CreativeModel creativeModel;
        StreaksData streaksData;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (streaksData = creativeModel.streaksData) != null && streaksData.isStreaksPost()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Integer numValueOf = Integer.valueOf(editPreviewInfo.getPreviewHeight());
            int iIntValue = numValueOf.intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditPreviewInfo.videoHeight");
            sbLIZ.append(" : ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(" --- info : isStoryStreaks");
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return numValueOf.intValue();
        }
        if (!z && !z2) {
            if (z3 && editPreviewInfo.getVideoList().size() >= 2) {
                Integer numValueOf2 = Integer.valueOf(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo().getHeight());
                int iIntValue2 = numValueOf2.intValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditPreviewInfo.videoHeight");
                sbLIZ2.append(" : ");
                sbLIZ2.append(iIntValue2);
                sbLIZ2.append(" ; info --- isStitchMode : ");
                sbLIZ2.append(z3);
                sbLIZ2.append(" ; fileInfo : ");
                sbLIZ2.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo());
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                return numValueOf2.intValue();
            }
            if (videoPublishEditModel != null && (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && C1444940nhk.LJIILLIIL(canvasVideoData) && videoPublishEditModel.enableUsePreviewSizeInCanvasMode()) {
                Integer numValueOf3 = Integer.valueOf(editPreviewInfo.getPreviewHeight());
                int iIntValue3 = numValueOf3.intValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("EditPreviewInfo.videoHeight");
                sbLIZ3.append(" : ");
                sbLIZ3.append(iIntValue3);
                sbLIZ3.append(" ; info --- isVideoCanvas");
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                return numValueOf3.intValue();
            }
            if (editPreviewInfo.getVideoList().isEmpty() && C0BVV.LIZ()) {
                C1AF0.LIZJ("EditPreviewInfo.videoHeight videoList is empty");
                Integer numValueOf4 = Integer.valueOf(editPreviewInfo.getPreviewHeight());
                if (numValueOf4.intValue() <= 0) {
                    return 0;
                }
                return numValueOf4.intValue();
            }
            Integer numValueOf5 = Integer.valueOf(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo().getHeight());
            int iIntValue4 = numValueOf5.intValue();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("EditPreviewInfo.videoHeight");
            sbLIZ4.append(" : ");
            sbLIZ4.append(iIntValue4);
            sbLIZ4.append(" ; info --- default ; fileInfo : ");
            sbLIZ4.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo());
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
            return numValueOf5.intValue();
        }
        if (editPreviewInfo.getCalculateHeight() <= 0) {
            VESize vESizeCalcTargetRes = VEUtils.calcTargetRes(editPreviewInfo.getTotalVideoWidth(), editPreviewInfo.getTotalVideoHeight(), C571630MbR.LIZ(editPreviewInfo), editPreviewInfo.getPreviewWidth());
            editPreviewInfo.setCalculateWidth(vESizeCalcTargetRes.width);
            editPreviewInfo.setCalculateHeight(vESizeCalcTargetRes.height);
        }
        Integer numValueOf6 = Integer.valueOf(editPreviewInfo.getCalculateHeight());
        int iIntValue5 = numValueOf6.intValue();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("EditPreviewInfo.videoHeight");
        sbLIZ5.append(" : ");
        sbLIZ5.append(iIntValue5);
        sbLIZ5.append(" ; info --- isFastImport : ");
        sbLIZ5.append(z);
        sbLIZ5.append(" || forceCalculateVideoSize : ");
        sbLIZ5.append(z2);
        sbLIZ5.append(" ;totalVideoWidth : ");
        sbLIZ5.append(LIZIZ(editPreviewInfo.getTotalVideoWidth()));
        sbLIZ5.append(" ; totalVideoHeight : ");
        sbLIZ5.append(LIZIZ(editPreviewInfo.getTotalVideoHeight()));
        sbLIZ5.append("; previewWidth : ");
        sbLIZ5.append(editPreviewInfo.getPreviewWidth());
        sbLIZ5.append(';');
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ5));
        return numValueOf6.intValue();
    }

    public static final int LIZLLL(VideoPublishEditModel videoPublishEditModel, EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        boolean z4;
        CanvasVideoData canvasVideoData;
        CreativeModel creativeModel;
        StreaksData streaksData;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (streaksData = creativeModel.streaksData) != null && streaksData.isStreaksPost()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Integer numValueOf = Integer.valueOf(editPreviewInfo.getPreviewWidth());
            int iIntValue = numValueOf.intValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EditPreviewInfo.videoWidth");
            sbLIZ.append(" : ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(" --- info : isStoryStreaks");
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return numValueOf.intValue();
        }
        if (!z && !z2) {
            if (z3 && editPreviewInfo.getVideoList().size() >= 2) {
                Integer numValueOf2 = Integer.valueOf(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo().getWidth());
                int iIntValue2 = numValueOf2.intValue();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("EditPreviewInfo.videoWidth");
                sbLIZ2.append(" : ");
                sbLIZ2.append(iIntValue2);
                sbLIZ2.append(" ; info --- isStitchMode : ");
                sbLIZ2.append(z3);
                sbLIZ2.append(" ; fileInfo : ");
                sbLIZ2.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 1)).getVideoFileInfo());
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                return numValueOf2.intValue();
            }
            if (videoPublishEditModel != null && (canvasVideoData = videoPublishEditModel.getCanvasVideoData()) != null && C1444940nhk.LJIILLIIL(canvasVideoData) && videoPublishEditModel.enableUsePreviewSizeInCanvasMode()) {
                Integer numValueOf3 = Integer.valueOf(editPreviewInfo.getPreviewWidth());
                int iIntValue3 = numValueOf3.intValue();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("EditPreviewInfo.videoWidth");
                sbLIZ3.append(" : ");
                sbLIZ3.append(iIntValue3);
                sbLIZ3.append(" ; info --- isVideoCanvas");
                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
                return numValueOf3.intValue();
            }
            if (editPreviewInfo.getVideoList().isEmpty() && C0BVV.LIZ()) {
                C1AF0.LIZJ("EditPreviewInfo.videoWidth videoList is empty");
                Integer numValueOf4 = Integer.valueOf(editPreviewInfo.getPreviewWidth());
                if (numValueOf4.intValue() <= 0) {
                    return 0;
                }
                return numValueOf4.intValue();
            }
            Integer numValueOf5 = Integer.valueOf(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo().getWidth());
            int iIntValue4 = numValueOf5.intValue();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("EditPreviewInfo.videoWidth");
            sbLIZ4.append(" : ");
            sbLIZ4.append(iIntValue4);
            sbLIZ4.append(" ; info --- default ; fileInfo : ");
            sbLIZ4.append(((EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), 0)).getVideoFileInfo());
            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
            return numValueOf5.intValue();
        }
        LIZ(editPreviewInfo);
        Integer numValueOf6 = Integer.valueOf(editPreviewInfo.getCalculateWidth());
        int iIntValue5 = numValueOf6.intValue();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("EditPreviewInfo.videoWidth");
        sbLIZ5.append(" : ");
        sbLIZ5.append(iIntValue5);
        sbLIZ5.append(" ; info --- isFastImport : ");
        sbLIZ5.append(z);
        sbLIZ5.append(" || forceCalculateVideoSize : ");
        sbLIZ5.append(z2);
        sbLIZ5.append(" ;totalVideoWidth : ");
        sbLIZ5.append(LIZIZ(editPreviewInfo.getTotalVideoWidth()));
        sbLIZ5.append(" ; totalVideoHeight : ");
        sbLIZ5.append(LIZIZ(editPreviewInfo.getTotalVideoHeight()));
        sbLIZ5.append("; previewWidth : ");
        sbLIZ5.append(editPreviewInfo.getPreviewWidth());
        sbLIZ5.append(';');
        C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ5));
        return numValueOf6.intValue();
    }

    public static final int LJIILIIL(VideoPublishEditModel videoPublishEditModel, EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        int i;
        if (videoPublishEditModel != null && videoPublishEditModel.isNLECanvas()) {
            if (videoPublishEditModel.enableUsePreviewSizeInCanvasMode()) {
                return editPreviewInfo.getPreviewHeight();
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                QuickGridModel quickGridModel = videoPublishEditModel.creativeModel.quickGridModel;
                if (quickGridModel != null && quickGridModel.isFromQuickGrid && quickGridModel.width > 0 && (i = quickGridModel.height) > 0) {
                    return i;
                }
                LIZ(editPreviewInfo);
                return editPreviewInfo.getCalculateHeight();
            }
            return LIZJ(videoPublishEditModel, editPreviewInfo, z, z2, z3);
        }
        return LIZJ(videoPublishEditModel, editPreviewInfo, z, z3, z2);
    }

    public static final int LJIILJJIL(VideoPublishEditModel videoPublishEditModel, EditPreviewInfo editPreviewInfo, boolean z, boolean z2, boolean z3) {
        int i;
        if (videoPublishEditModel != null && videoPublishEditModel.isNLECanvas()) {
            if (videoPublishEditModel.enableUsePreviewSizeInCanvasMode()) {
                return editPreviewInfo.getPreviewWidth();
            }
            if (videoPublishEditModel.isMultiVideoEdit()) {
                QuickGridModel quickGridModel = videoPublishEditModel.creativeModel.quickGridModel;
                if (quickGridModel != null && quickGridModel.isFromQuickGrid && (i = quickGridModel.width) > 0 && quickGridModel.height > 0) {
                    return i;
                }
                LIZ(editPreviewInfo);
                return editPreviewInfo.getCalculateWidth();
            }
            return LIZLLL(videoPublishEditModel, editPreviewInfo, z, z2, z3);
        }
        return LIZLLL(videoPublishEditModel, editPreviewInfo, z, z3, z2);
    }
}
