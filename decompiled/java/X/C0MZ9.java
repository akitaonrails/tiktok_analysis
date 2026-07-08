package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Size;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.creation.CreationTypeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftPreviewConfigure;
import com.ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.filter.IFilterService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfigKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.vesdk.VEUtils;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MZ9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZ9 {
    public static final String LIZIZ(AwemeDraft awemeDraft) {
        int i = awemeDraft.LJJJJIZL.from;
        if (i != 0 && i != 1 && !awemeDraft.LJIIZILJ()) {
            return "shoot";
        }
        return "upload";
    }

    public static final String LIZJ(AwemeDraft awemeDraft) {
        if (awemeDraft.LJIIL()) {
            if (awemeDraft.LJIILL()) {
                return "story_photo";
            }
            return "multi_photo";
        }
        if (awemeDraft.LJJJJIZL.isPhotoMvMode) {
            return "slideshow";
        }
        if (!awemeDraft.LJIIZILJ()) {
            AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
            if (!aVDraftExtras.isStickPointMode && !aVDraftExtras.editMusicSyncMode) {
                if (awemeDraft.LJIIIZ()) {
                    return "photo_canvas";
                }
                if (awemeDraft.LJJJJIZL.cutSameData == null) {
                    if (awemeDraft.LJIIIIZZ()) {
                        return "autocut";
                    }
                    return "video";
                }
                return "mv";
            }
            return "sound_sync";
        }
        return "mv";
    }

    public static final HashSet<String> LIZLLL(AwemeDraft awemeDraft) {
        boolean z;
        HashSet<String> hashSet = new HashSet<>();
        EditPreviewInfo editPreviewInfoLJ = LJ(awemeDraft, false);
        if (editPreviewInfoLJ != null) {
            String draftDir = editPreviewInfoLJ.getDraftDir();
            if (draftDir.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                hashSet.add(draftDir);
            }
            for (EditVideoSegment editVideoSegment : editPreviewInfoLJ.getVideoList()) {
                String videoPath = editVideoSegment.getVideoPath();
                if (C2286708xd.LIZJ(videoPath) && videoPath != null) {
                    hashSet.add(videoPath);
                    String strLIZJ = C08HM.LIZJ(videoPath);
                    if (strLIZJ != null && strLIZJ.length() == 0) {
                        hashSet.add(strLIZJ);
                    }
                }
                String audioPath = editVideoSegment.getAudioPath();
                if (audioPath != null && audioPath.length() != 0) {
                    hashSet.add(audioPath);
                }
            }
            String[] reverseVideoArray = editPreviewInfoLJ.getReverseVideoArray();
            if (reverseVideoArray != null) {
                for (String str : reverseVideoArray) {
                    if (str.length() > 0) {
                        hashSet.add(str);
                    }
                }
            }
            String[] reverseAudioArray = editPreviewInfoLJ.getReverseAudioArray();
            if (reverseAudioArray != null) {
                for (String str2 : reverseAudioArray) {
                    if (str2.length() > 0) {
                        hashSet.add(str2);
                    }
                }
            }
            String[] tempVideoArray = editPreviewInfoLJ.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String str3 : tempVideoArray) {
                    if (str3.length() > 0) {
                        hashSet.add(str3);
                    }
                }
            }
        }
        return hashSet;
    }

    public static final List<EditVideoSegment> LJFF(AwemeDraft awemeDraft) {
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        List list = aVDraftExtras.previewVideoListCopy;
        if (list != null) {
            return list;
        }
        if (aVDraftExtras.videoSegmentsCopy != null && (!r0.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            List<DraftVideoSegment> list2 = awemeDraft.LJJJJIZL.videoSegmentsCopy;
            if (list2 != null) {
                Iterator<DraftVideoSegment> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(C571500MbE.LJ(it2.next()));
                }
            }
            awemeDraft.LJJJJIZL.previewVideoListCopy = arrayList;
            return arrayList;
        }
        return null;
    }

    public static final boolean LJI(AwemeDraft awemeDraft) {
        AIGCOfflineModel aIGCOfflineModel = awemeDraft.LIZ.aigcOfflineModel;
        if (aIGCOfflineModel.isAttachCountdownEffect && aIGCOfflineModel.isCountDownVideoPresent) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(AwemeDraft awemeDraft) {
        if (awemeDraft.LJJJJIZL.publishStage != 50) {
            return true;
        }
        return false;
    }

    public static final Bitmap LIZ(VideoCoverConfig videoCoverConfig, String str) {
        if (VideoCoverConfigKt.isValid(videoCoverConfig) && str != null) {
            return C097U.LIZIZ(videoCoverConfig.displayWidth, videoCoverConfig.displayHeight, str);
        }
        return BitmapFactory.decodeFile(str);
    }

    public static final EditPreviewInfo LJ(AwemeDraft awemeDraft, boolean z) {
        VideoFileInfo videoFileInfo;
        ArrayList arrayList;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        VideoFileInfo videoFileInfo2;
        int i;
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[getPreviewInfo]: creation id = ");
        sbLIZ.append(awemeDraft.LIZ());
        sbLIZ.append(" is fast import = ");
        sbLIZ.append(awemeDraft.LJJJJIZL.isFastImport);
        C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AVDraftExtras aVDraftExtras = awemeDraft.LJJJJIZL;
        EditPreviewInfo editPreviewInfo = aVDraftExtras.previewInfo;
        if (editPreviewInfo != null) {
            if (editPreviewInfo.getPreviewWidth() <= 0 && (i2 = awemeDraft.LJJJJIZL.videoOutWidth) > 0) {
                editPreviewInfo.setPreviewWidth(i2);
            }
            if (editPreviewInfo.getPreviewHeight() <= 0 && (i = awemeDraft.LJJJJIZL.videoOutHeight) > 0) {
                editPreviewInfo.setPreviewHeight(i);
            }
            if (awemeDraft.LJIILLIIL == 1) {
                AVDraftExtras aVDraftExtras2 = awemeDraft.LJJJJIZL;
                if (!aVDraftExtras2.fileLengthFixed) {
                    aVDraftExtras2.fileLengthFixed = true;
                    List<EditVideoSegment> videoList = editPreviewInfo.getVideoList();
                    int i3 = 0;
                    for (EditVideoSegment editVideoSegment : videoList) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            EditVideoSegment editVideoSegment2 = editVideoSegment;
                            long duration = editVideoSegment2.getVideoFileInfo().getDuration();
                            VideoFileInfo videoFileInfo3 = editVideoSegment2.getVideoFileInfo();
                            long j = duration / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                            ListProtector.set(videoList, i3, EditVideoSegment.copy$default(editVideoSegment2, null, null, videoFileInfo3.copy(videoFileInfo3.width, videoFileInfo3.height, j, videoFileInfo3.fps, videoFileInfo3.bitrate, videoFileInfo3.codecType, videoFileInfo3.keyFrameCount, videoFileInfo3.gop, videoFileInfo3.fpsFloat), null, 11, null));
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("[getPreviewInfo]:fix video length in draft,old:");
                            sbLIZ2.append(duration);
                            sbLIZ2.append(",new:");
                            sbLIZ2.append(j);
                            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("[getPreviewInfo]:videoPath = ");
                            sbLIZ3.append(editVideoSegment2.getVideoPath());
                            sbLIZ3.append(", audioPath = ");
                            sbLIZ3.append(editVideoSegment2.getAudioPath());
                            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            List<EditVideoSegment> listLJFF = LJFF(awemeDraft);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[getPreviewInfo]: previewVideoListCopy = ");
            sbLIZ4.append(listLJFF);
            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            if (listLJFF != null && !listLJFF.isEmpty()) {
                if (listLJFF.size() < editPreviewInfo.getVideoList().size()) {
                    C0LSN.LIZ("[getPreviewInfo]: copySize < previewInfo!!.videoList.size");
                    return editPreviewInfo;
                }
                int size = editPreviewInfo.getVideoList().size();
                for (int i5 = 0; i5 < size; i5++) {
                    EditVideoSegment editVideoSegment3 = (EditVideoSegment) ListProtector.get(editPreviewInfo.getVideoList(), i5);
                    boolean zLIZJ = C2286708xd.LIZJ(editVideoSegment3.getVideoPath());
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[getPreviewInfo]: videoPath = ");
                    sbLIZ5.append(editVideoSegment3.getVideoPath());
                    sbLIZ5.append(" is exist = ");
                    sbLIZ5.append(zLIZJ);
                    C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
                    if (!zLIZJ) {
                        ListProtector.set(editPreviewInfo.getVideoList(), i5, ListProtector.get(listLJFF, i5));
                    }
                }
            }
            awemeDraft.LJJJJIZL.previewInfo = editPreviewInfo;
            return editPreviewInfo;
        }
        EditPreviewInfo editPreviewInfoLIZ = null;
        DraftPreviewConfigure draftPreviewConfigure = aVDraftExtras.previewConfigure;
        if (draftPreviewConfigure != null) {
            List<DraftVideoSegment> list2 = aVDraftExtras.videoSegmentsCopy;
            if (list2 != null && !list2.isEmpty() && !C2286708xd.LIZJ(((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).videoPath)) {
                List<DraftVideoSegment> list3 = awemeDraft.LJJJJIZL.videoSegmentsCopy;
                if (list3 == null) {
                    list3 = C13BV.INSTANCE;
                }
                draftPreviewConfigure.videoSegments = list3;
                C0LSN.LIZ("draftOpt==>getDraftPreviewConfigure,using copy video videoSegment");
            }
            editPreviewInfoLIZ = new C538330L9j(draftPreviewConfigure.previewWidth, draftPreviewConfigure.previewHeight, 12).LIZ(C571500MbE.LJ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)));
            String str = ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).reversePath;
            if (str != null) {
                editPreviewInfoLIZ.setReverseVideoArray(new String[]{str});
            }
            String str2 = ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).audioPath;
            if (str2 != null && u.LJIIZILJ(str2, "reverse.wav", false)) {
                editPreviewInfoLIZ.setReverseAudioArray(new String[]{str2});
            }
            String str3 = ((DraftVideoSegment) ListProtector.get(draftPreviewConfigure.videoSegments, 0)).tempVideoPath;
            if (str3 != null) {
                editPreviewInfoLIZ.setTempVideoArray(new String[]{str3});
            }
        } else if (awemeDraft.LJI != null) {
            if (C275840ArW.LIZIZ) {
                C0LSN.LIZ("[getPreviewInfo]: BlockDraftRestorePreviewInfoExp blocked");
                final String strLIZ = awemeDraft.LIZ();
                C1AF0.LJ(new RuntimeException(strLIZ) { // from class: X.0MZG
                    public static final int $stable = 8;
                    public final String LL;

                    public final String getMsg() {
                        return this.LL;
                    }

                    {
                        super(strLIZ);
                        this.LL = strLIZ;
                    }
                });
            } else if (C275840ArW.LIZJ) {
                C0LSN.LIZ("[getPreviewInfo]: BlockDraftRestorePreviewInfoExp degraded");
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = awemeDraft.LJJJJIZL.multiEditVideoData;
                if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                        String str4 = multiEditVideoSegmentRecordData.draftVideoPath;
                        String str5 = multiEditVideoSegmentRecordData.draftAudioPath;
                        if (z) {
                            videoFileInfo2 = C571500MbE.LJIIJ(str4);
                        } else {
                            videoFileInfo2 = new VideoFileInfo(multiEditVideoSegmentRecordData.width, multiEditVideoSegmentRecordData.height, 0L, 0, 0, 0, 0, 0, 0.0f, 496, null);
                        }
                        arrayList.add(new EditVideoSegment(str4, str5, videoFileInfo2));
                    }
                } else {
                    arrayList = new ArrayList();
                }
                EditVideoSegment editVideoSegment4 = (EditVideoSegment) C13LP.LJJJLL(arrayList);
                if (editVideoSegment4 != null) {
                    editPreviewInfoLIZ = new C538330L9j(0, 0, 15).LIZ(editVideoSegment4);
                    C1AF0.LJ(new C0MY1("Degraded from multiEditVideoData"));
                }
                if (!TextUtils.isEmpty(awemeDraft.LJIIZILJ) && editPreviewInfoLIZ != null) {
                    editPreviewInfoLIZ.setReverseVideoArray(new String[]{awemeDraft.LJIIZILJ});
                }
            } else {
                String str6 = awemeDraft.LJI;
                String str7 = awemeDraft.LJIIIIZZ;
                if (z) {
                    videoFileInfo = C571500MbE.LJIIJ(str6);
                } else {
                    videoFileInfo = new VideoFileInfo(0, 0, 0L, 0, 0, 0, 0, 0, 0.0f, 496, null);
                }
                editPreviewInfoLIZ = new C538330L9j(0, 0, 15).LIZ(new EditVideoSegment(str6, str7, videoFileInfo));
                if (!TextUtils.isEmpty(awemeDraft.LJIIZILJ)) {
                    editPreviewInfoLIZ.setReverseVideoArray(new String[]{awemeDraft.LJIIZILJ});
                }
            }
        }
        awemeDraft.LJJJJIZL.previewInfo = editPreviewInfoLIZ;
        return editPreviewInfoLIZ;
    }

    public static final void LJIIJ(AwemeDraft awemeDraft, final C0MZA c0mza) {
        VideoPublishEditModel videoPublishEditModelLJII = C0CHQ.LIZ().LJIILLIIL().LJII(awemeDraft);
        C0MZB c0mzbLJIILLIIL = C0CHQ.LIZ().LJIILLIIL();
        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModelLJII);
        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
        c1457050o1H.LJIJI = true;
        c1457050o1H.LJIJJLI = true;
        AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(c0mza, 23);
        C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
        c1457050o1H2.LJII = awS582S0100000_3;
        c1457050o1H2.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0MZE
            @Override // X.InterfaceC1457180o1U
            public final void onError(final int i, String str) {
                final IEffectService.OnVideoCoverCallback onVideoCoverCallback = c0mza;
                C15O7.LIZIZ(new Callable() { // from class: X.0MZF
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C1C7U.LIZ("AwemeDraftExtension@e329.loadVideoCover$2$1");
                        onVideoCoverCallback.onGetVideoCoverFailed(i);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("AwemeDraftExtension@e329.loadVideoCover$2$1");
                        return unit;
                    }
                }, C15O7.LJIIIIZZ, null);
            }
        };
        c0mzbLJIILLIIL.LIZJ(c1457050o1H2);
    }

    public static final void LJIIJJI(int i, AwemeDraft awemeDraft) {
        String filterFolder;
        FilterBean filter;
        awemeDraft.LJIILIIL = i;
        IFilterService filterService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).getFilterService();
        if (filterService != null && (filter = filterService.getFilter(i)) != null) {
            filterFolder = filter.getFilterFolder();
        } else {
            filterFolder = null;
        }
        awemeDraft.LJJJJIZL.filterLocalPath = filterFolder;
    }

    public static final void LJIIIIZZ(AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        boolean z;
        Object objValueOf;
        Size realVideoSize;
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        String videoPath;
        List<EditVideoSegment> videoList2;
        EditVideoSegment editVideoSegment2;
        List<String> list;
        String coverPath;
        CreativeModel creativeModel;
        CreationTypeModel creationTypeModel;
        String str;
        int imageCurrentIndex;
        String path;
        List<SingleImageData> imageList;
        SingleImageData singleImageData;
        SrcImageInfo srcImageInfo;
        final C0MZA c0mza = new C0MZA(videoCoverConfig, onVideoCoverCallback);
        C0MZD c0mzd = new C0MZD(c0mza, awemeDraft);
        VideoPublishEditModel videoPublishEditModelLJII = C0CHQ.LIZ().LJIILLIIL().LJII(awemeDraft);
        if (C0CHQ.LIZ().LJIILLIIL().LJIIIIZZ(videoPublishEditModelLJII, -1)) {
            C0CHQ.LIZ().LJIILLIIL().LJIIJ(-1, videoPublishEditModelLJII, "", new AwS587S0100000_8(c0mzd, 15));
            return;
        }
        String str2 = awemeDraft.LJJJJIZL.videoCoverPath;
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str3 = null;
        if (!z && new C0VSJ(awemeDraft.LJJJJIZL.videoCoverPath).exists()) {
            Bitmap bitmapLIZ = LIZ(videoCoverConfig, awemeDraft.LJJJJIZL.videoCoverPath);
            if (bitmapLIZ != null && (!bitmapLIZ.isRecycled())) {
                c0mzd.onGetVideoCoverSuccess(bitmapLIZ);
                return;
            } else {
                c0mzd.onGetVideoCoverFailed(-1);
                return;
            }
        }
        if (awemeDraft.LJJIJLIJ == 2) {
            c0mzd.onGetVideoCoverFailed(-1);
            return;
        }
        if (awemeDraft.LJIIL()) {
            String str4 = awemeDraft.LJJJJIZL.videoCoverPath;
            if (str4 != null && C2286708xd.LIZJ(str4)) {
                c0mza.onGetVideoCoverFailed(-1);
                return;
            }
            CoverPublishModel coverPublishModel = awemeDraft.LJJJJIZL.coverPublishModel;
            if (coverPublishModel != null) {
                imageCurrentIndex = coverPublishModel.getImageCurrentIndex();
            } else {
                imageCurrentIndex = 0;
            }
            ImageAlbumData imageAlbumData = awemeDraft.LJJJJIZL.imageAlbumData;
            if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLZIJ(imageCurrentIndex, imageList)) == null || (srcImageInfo = singleImageData.getSrcImageInfo()) == null || (path = srcImageInfo.getPath()) == null || path.length() == 0) {
                path = awemeDraft.LIZ.text2ImageModel.coverPath;
            }
            if (!C2286708xd.LIZJ(path)) {
                c0mza.onGetVideoCoverFailed(-1);
                return;
            }
            Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(path, null);
            if (bitmapLIZLLL == null) {
                return;
            }
            try {
                int pictureDegree = BitmapUtils.readPictureDegree(path);
                if (pictureDegree != 0) {
                    Bitmap bitmapRotateBitmap = BitmapUtils.rotateBitmap(bitmapLIZLLL, pictureDegree);
                    bitmapLIZLLL.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZLLL);
                    bitmapLIZLLL = bitmapRotateBitmap;
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJI("loadImageModeCover throw exception", e);
            }
            c0mza.onGetVideoCoverSuccess(C0MZX.LIZIZ(bitmapLIZLLL, awemeDraft.LJJJJIZL.coverPublishModel));
            return;
        }
        if (awemeDraft.LJIIZILJ()) {
            MvCreateVideoData mvCreateVideoData = awemeDraft.LJJJJIZL.mvCreateVideoData;
            if (mvCreateVideoData != null && (str = mvCreateVideoData.videoCoverImgPath) != null && C2286708xd.LIZJ(str)) {
                MvCreateVideoData mvCreateVideoData2 = awemeDraft.LJJJJIZL.mvCreateVideoData;
                if (mvCreateVideoData2 != null) {
                    str3 = mvCreateVideoData2.videoCoverImgPath;
                }
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str3);
                if (bitmapDecodeFile != null && (!bitmapDecodeFile.isRecycled())) {
                    c0mzd.onGetVideoCoverSuccess(C0MZX.LIZIZ(bitmapDecodeFile, awemeDraft.LJJJJIZL.coverPublishModel));
                    return;
                } else {
                    c0mzd.onGetVideoCoverFailed(-1);
                    return;
                }
            }
            c0mzd.onGetVideoCoverFailed(-1);
            return;
        }
        if (awemeDraft.LJIILLIIL()) {
            if (!C2286708xd.LIZJ(awemeDraft.LJI())) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("multi edit video cover img path not exist:");
                sbLIZ.append(awemeDraft.LJI());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                c0mzd.onGetVideoCoverFailed(-1);
                return;
            }
            if (!C2286708xd.LIZJ(awemeDraft.LIZ.postPageModel.customCoverPath) || ((creativeModel = awemeDraft.LIZ) != null && (creationTypeModel = creativeModel.creationTypeModel) != null && creationTypeModel.creationMode == 2)) {
                String strLJI = awemeDraft.LJI();
                if (strLJI == null || !C2286708xd.LIZJ(strLJI)) {
                    return;
                }
                Bitmap bitmapLIZ2 = LIZ(videoCoverConfig, awemeDraft.LJI());
                if (bitmapLIZ2 != null && (!bitmapLIZ2.isRecycled())) {
                    c0mzd.onGetVideoCoverSuccess(C0MZX.LIZIZ(bitmapLIZ2, awemeDraft.LJJJJIZL.coverPublishModel));
                    return;
                } else {
                    c0mzd.onGetVideoCoverFailed(-1);
                    return;
                }
            }
            Bitmap bitmapLIZ3 = LIZ(videoCoverConfig, creativeModel.postPageModel.customCoverPath);
            if (bitmapLIZ3 != null && (!bitmapLIZ3.isRecycled())) {
                c0mzd.onGetVideoCoverSuccess(C0MZX.LIZIZ(bitmapLIZ3, awemeDraft.LJJJJIZL.coverPublishModel));
                return;
            } else {
                c0mzd.onGetVideoCoverFailed(-1);
                return;
            }
        }
        if (awemeDraft.LJIIIZ()) {
            if (C1444940nhk.LJIIJ(awemeDraft.LJJJJIZL.canvasVideoData)) {
                coverPath = awemeDraft.LIZ.musicShareStoryData.getCoverPath();
            } else {
                CanvasVideoData canvasVideoData = awemeDraft.LJJJJIZL.canvasVideoData;
                if (canvasVideoData != null && (list = canvasVideoData.sourceInfo) != null) {
                    coverPath = (String) ListProtector.get(list, 0);
                }
                c0mzd.onGetVideoCoverFailed(-1);
                return;
            }
            if (coverPath != null) {
                Bitmap bitmapLIZLLL2 = C2471909mP.LIZLLL(coverPath, null);
                if (bitmapLIZLLL2 == null) {
                    return;
                }
                c0mzd.onGetVideoCoverSuccess(bitmapLIZLLL2);
                return;
            }
            c0mzd.onGetVideoCoverFailed(-1);
            return;
        }
        if (awemeDraft.LJJJJIZL.cutSameData != null) {
            EditPreviewInfo editPreviewInfoLJ = LJ(awemeDraft, true);
            if (editPreviewInfoLJ != null && (videoList = editPreviewInfoLJ.getVideoList()) != null && (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) != null && editVideoSegment.getVideoPath() != null) {
                EditPreviewInfo editPreviewInfoLJ2 = LJ(awemeDraft, true);
                if (editPreviewInfoLJ2 != null && (videoList2 = editPreviewInfoLJ2.getVideoList()) != null && (editVideoSegment2 = (EditVideoSegment) C13LP.LJJJLL(videoList2)) != null) {
                    videoPath = editVideoSegment2.getVideoPath();
                } else {
                    videoPath = null;
                }
                Bitmap bitmapLIZLLL3 = C2471909mP.LIZLLL(videoPath, null);
                if (bitmapLIZLLL3 == null) {
                    return;
                }
                c0mza.onGetVideoCoverSuccess(bitmapLIZLLL3);
                return;
            }
            c0mza.onGetVideoCoverFailed(-1);
            return;
        }
        if (awemeDraft.LJIIIIZZ()) {
            CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
            if (creativeToolsPluginService != null && creativeToolsPluginService.LJI(null)) {
                AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) C13LP.LJJJLL(awemeDraft.LIZ.autoCutModel.mediaList);
                if (autoCutMediaModel != null) {
                    if (autoCutMediaModel.isVideoType) {
                        IEffectService iEffectServiceEffectService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).effectService();
                        if (iEffectServiceEffectService != null && (realVideoSize = iEffectServiceEffectService.getRealVideoSize(autoCutMediaModel.filePath)) != null) {
                            objValueOf = Integer.valueOf(VEUtils.getVideoFrames2(autoCutMediaModel.filePath, new int[]{0}, realVideoSize.getWidth(), -1, false, new InterfaceC1286300jZs() { // from class: X.09nF
                                @Override // X.InterfaceC1286300jZs
                                public final boolean processFrame(ByteBuffer byteBuffer, int i, int i2, int i3) {
                                    if (byteBuffer == null) {
                                        c0mza.onGetVideoCoverFailed(-1);
                                        return true;
                                    }
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                                    bitmapCreateBitmap.copyPixelsFromBuffer(byteBuffer.position(0));
                                    c0mza.onGetVideoCoverSuccess(bitmapCreateBitmap);
                                    return true;
                                }
                            }));
                        } else {
                            c0mza.onGetVideoCoverFailed(-1);
                            objValueOf = Unit.LIZ;
                        }
                    } else {
                        Bitmap bitmapLIZLLL4 = C2471909mP.LIZLLL(autoCutMediaModel.filePath, null);
                        if (bitmapLIZLLL4 != null) {
                            c0mza.onGetVideoCoverSuccess(bitmapLIZLLL4);
                            objValueOf = Unit.LIZ;
                        }
                    }
                    if (objValueOf != null) {
                        return;
                    }
                }
                c0mza.onGetVideoCoverFailed(-1);
                return;
            }
            c0mza.onGetVideoCoverFailed(-1);
            return;
        }
        LJIIJ(awemeDraft, c0mza);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09pb] */
    public static final void LJIIIZ(AwemeDraft awemeDraft, VideoCoverConfig videoCoverConfig, final IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2491909pd(awemeDraft, videoCoverConfig, new IEffectService.OnVideoCoverCallback() { // from class: X.09pb
            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverFailed(int i) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C2491809pc(onVideoCoverCallback, i, null), 2);
            }

            @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                C817503Hh c817503Hh = C817503Hh.LL;
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C2491609pa(onVideoCoverCallback, bitmap, null), 2);
            }
        }, null), 2);
    }
}
