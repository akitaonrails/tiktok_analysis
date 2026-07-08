package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.creative.model.EditPostPoiChangeType;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.editpost.EditPostBizPermissionStruct;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443230nez {
    public static final long LIZJ(long j) {
        long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        C1387320mCo c1387320mCoLIZJ = C1387310mCn.LIZJ();
        if (j2 > c1387320mCoLIZJ.LIZIZ) {
            return 1L;
        }
        long j3 = c1387320mCoLIZJ.LIZ;
        if (j2 > j3) {
            return 1L;
        }
        return ((j3 - j2) / 86400000) + ((long) 2);
    }

    public static final List<AVTextExtraStruct> LIZLLL(List<AVTextExtraStruct> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) list;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(((AVTextExtraStruct) it2.next()).m175clone());
            }
        }
        return arrayList;
    }

    public static final String LJFF(VideoPublishEditModel videoPublishEditModel) {
        if (C1429680nJ8.LJ(videoPublishEditModel.creativeModel.musicBuzModel)) {
            return videoPublishEditModel.getMusicId();
        }
        return LJI(videoPublishEditModel);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1443230nez.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    public static final EditPostPoiChangeType LJII(EditPostModel editPostModel) {
        String str;
        if (editPostModel == null) {
            return EditPostPoiChangeType.UNKNOWN;
        }
        EditPostPoiChangeType editPostPoiChangeType = EditPostPoiChangeType.UNKNOWN;
        if (editPostModel.getOriginPoiData() == null && editPostModel.getPoiData() != null) {
            editPostPoiChangeType = EditPostPoiChangeType.ADD;
        }
        if (editPostModel.getOriginPoiData() != null && editPostModel.getPoiData() != null) {
            PoiData originPoiData = editPostModel.getOriginPoiData();
            String str2 = null;
            if (originPoiData != null) {
                str = originPoiData.poiId;
            } else {
                str = null;
            }
            PoiData poiData = editPostModel.getPoiData();
            if (poiData != null) {
                str2 = poiData.poiId;
            }
            if (!Intrinsics.LJFF(str, str2)) {
                editPostPoiChangeType = EditPostPoiChangeType.MODIFY;
            }
        }
        if (editPostModel.getOriginPoiData() != null && editPostModel.getPoiData() == null) {
            return EditPostPoiChangeType.DELETE;
        }
        return editPostPoiChangeType;
    }

    public static final String LJIIIIZZ(String str) {
        return C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIJ(new CreativeInfo(str, 0, null, 4, null), EnumC20228014Cw.EDIT_POST_VIDEO, "editpost_local", true);
    }

    public static final boolean LJIIJJI(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        EditVideoSegment editVideoSegment;
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo == null || (videoList = previewInfo.getVideoList()) == null || (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(videoList)) == null || editVideoSegment.getVideoPath().length() <= 0 || videoPublishEditModel.getVideoCanvasWidth() <= 0 || videoPublishEditModel.getVideoCanvasHeight() <= 0) {
            return false;
        }
        return true;
    }

    public static final List<AVTextExtraStruct> LJIILIIL(List<? extends TextExtraStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (TextExtraStruct textExtraStruct : list) {
            AVTextExtraStruct aVTextExtraStruct = new AVTextExtraStruct();
            aVTextExtraStruct.start = 0;
            aVTextExtraStruct.end = 0;
            aVTextExtraStruct.userId = textExtraStruct.getUserId();
            aVTextExtraStruct.setSecUid(textExtraStruct.getSecUid());
            aVTextExtraStruct.type = textExtraStruct.getType();
            aVTextExtraStruct.subType = textExtraStruct.getSubtype();
            String atUserType = textExtraStruct.getAtUserType();
            if (atUserType == null) {
                atUserType = "";
            }
            aVTextExtraStruct.atUserType = atUserType;
            aVTextExtraStruct.hashTagName = textExtraStruct.getHashTagName();
            aVTextExtraStruct.awemeId = textExtraStruct.getAwemeId();
            aVTextExtraStruct.setLineIndex(textExtraStruct.getLineIndex());
            aVTextExtraStruct.cid = textExtraStruct.getCid();
            aVTextExtraStruct.setTagId(textExtraStruct.getTagId());
            arrayList.add(aVTextExtraStruct);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public static final void LJ(VideoPublishEditModel videoPublishEditModel, String str) {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData;
        boolean z;
        String path;
        String path2;
        String path3;
        File fileLJFF;
        File fileLIZLLL;
        File fileLIZJ;
        if (!videoPublishEditModel.creativeModel.draftInfoModel.isPublishedDraft) {
            videoPublishEditModel.setCreativeInfo(new CreativeInfo(null, 0, null, 7, null));
        }
        videoPublishEditModel.setUploadMethod("download");
        Workspace workspaceLIZ = C14D2.LIZ(videoPublishEditModel.getCreativeInfo());
        videoPublishEditModel.setWorkspace(workspaceLIZ);
        long j = 0;
        MediaModel mediaModel = new MediaModel(0L);
        mediaModel.LJIILL(str);
        C13W2 c13w2LIZIZ = C13W4.LIZIZ(str);
        mediaModel.duration = c13w2LIZIZ.LJ;
        mediaModel.width = c13w2LIZIZ.LIZJ;
        mediaModel.height = c13w2LIZIZ.LIZLLL;
        ArrayList<VideoSegment> arrayList = new ArrayList();
        arrayList.add(new VideoSegment(mediaModel));
        C571550MbJ.LIZ.getClass();
        ?? r6 = 1;
        videoPublishEditModel.setPreviewInfo(C571550MbJ.LIZ(true, workspaceLIZ, arrayList, new long[]{-1, -1}));
        videoPublishEditModel.setVideoCanvasHeight(((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getHeight());
        videoPublishEditModel.setVideoCanvasWidth(((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoFileInfo().getWidth());
        if (((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo() != null) {
            VideoCutInfo videoCutInfo = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo();
            if (videoCutInfo != null) {
                long end = videoCutInfo.getEnd();
                VideoCutInfo videoCutInfo2 = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo();
                if (videoCutInfo2 != null) {
                    float start = end - videoCutInfo2.getStart();
                    VideoCutInfo videoCutInfo3 = ((EditVideoSegment) ListProtector.get(videoPublishEditModel.getPreviewInfo().getVideoList(), 0)).getVideoCutInfo();
                    if (videoCutInfo3 != null) {
                        videoPublishEditModel.setVideoLength((int) (start / videoCutInfo3.getSpeed()));
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        videoPublishEditModel.getPreviewInfo().setPreviewVideoLength((int) mediaModel.duration);
        MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C574800MgY.LIZIZ(videoPublishEditModel.getPreviewInfo().getVideoList());
        if (multiEditVideoRecordDataLIZIZ == null) {
            multiEditVideoStatusRecordData = null;
        } else {
            multiEditVideoStatusRecordData = new MultiEditVideoStatusRecordData();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                j += ((VideoSegment) it2.next()).duration;
            }
            long jLIZ = C536240L1i.LIZ();
            if (j > jLIZ) {
                j = jLIZ;
            }
            multiEditVideoRecordDataLIZIZ.endTime = j;
            if (multiEditVideoStatusRecordData.curMultiEditVideoRecordData == null) {
                if (multiEditVideoRecordDataLIZIZ.segmentDataList.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                multiEditVideoRecordDataLIZIZ.isSingleVideo = z;
                multiEditVideoStatusRecordData.originMultiEditRecordData = multiEditVideoRecordDataLIZIZ.cloneData();
            }
            multiEditVideoStatusRecordData.curMultiEditVideoRecordData = multiEditVideoRecordDataLIZIZ;
        }
        videoPublishEditModel.setMultiEditVideoRecordData(multiEditVideoStatusRecordData);
        Workspace workspace = videoPublishEditModel.getWorkspace();
        if (workspace != null && (fileLIZJ = workspace.LIZJ()) != null) {
            path = fileLIZJ.getPath();
        } else {
            path = null;
        }
        videoPublishEditModel.setEncodedAudioOutputFile(path);
        Workspace workspace2 = videoPublishEditModel.getWorkspace();
        if (workspace2 != null && (fileLIZLLL = workspace2.LIZLLL()) != null) {
            path2 = fileLIZLLL.getPath();
        } else {
            path2 = null;
        }
        videoPublishEditModel.setParallelUploadOutputFile(path2);
        Workspace workspace3 = videoPublishEditModel.getWorkspace();
        if (workspace3 != null && (fileLJFF = workspace3.LJFF()) != null) {
            path3 = fileLJFF.getPath();
        } else {
            path3 = null;
        }
        videoPublishEditModel.setOutputFile(path3);
        videoPublishEditModel.setMaxDuration(15000L);
        videoPublishEditModel.setHardEncode(0);
        videoPublishEditModel.generateVideoCoverPath();
        videoPublishEditModel.setOrigin(0);
        videoPublishEditModel.stickerInfo = null;
        videoPublishEditModel.setRestoreType(0);
        videoPublishEditModel.isPrivate = 0;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (VideoSegment videoSegment : arrayList) {
            int i = videoSegment.width;
            int i2 = videoSegment.height;
            int iLIZIZ = videoSegment.LIZIZ();
            int iLIZJ = videoSegment.LIZJ();
            String strLJFF = videoSegment.LJFF(r6);
            strLJFF.toString();
            long j2 = videoSegment.duration;
            long jLIZLLL = videoSegment.LIZLLL() - videoSegment.LJII();
            String str2 = videoSegment.mDescription;
            String str3 = videoSegment.mMusicId;
            int iLJ = videoSegment.LJ();
            float fLJI = videoSegment.LJI();
            String strLJFF2 = videoSegment.LJFF(false);
            strLJFF2.toString();
            arrayList2.add(new ImportVideoInfo(i, i2, iLIZIZ, iLIZJ, strLJFF, j2, jLIZLLL, str2, str3, iLJ, fLJI, strLJFF2, videoSegment.originPath, videoSegment.fastImportDependHW, null, null, videoSegment.date, 49152, null));
            r6 = 1;
        }
        videoPublishEditModel.setImportInfoList(new ArrayList(arrayList2));
        videoPublishEditModel.setVideoCount(r6);
        videoPublishEditModel.setFastImport(r6);
        videoPublishEditModel.setVideoEditorType(6);
        if (videoPublishEditModel.getMainBusinessContext() == null) {
            videoPublishEditModel.setMainBusinessContext(new C1429890nJT());
        }
        videoPublishEditModel.setMusicVolume(1.0f);
        videoPublishEditModel.setVoiceVolume(1.0f);
        if (C2286708xd.LIZJ(str)) {
            C1439340nYi c1439340nYi = new C1439340nYi(videoPublishEditModel);
            videoPublishEditModel.setOutVideoWidth(c1439340nYi.LIZLLL());
            videoPublishEditModel.setOutVideoHeight(c1439340nYi.LJI());
        }
    }

    public static final boolean LJIIJ(List<String> list, List<String> list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty() && ((ArrayList) list2).isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = (ArrayList) list2;
        if (arrayList.size() != arrayList2.size()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (!arrayList2.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x05f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r42, com.ss.android.ugc.aweme.feed.model.Aweme r43, android.app.Activity r44) {
        /*
            Method dump skipped, instruction units count: 1698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1443230nez.LIZIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity):void");
    }

    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, List<AVTextExtraStruct> list, List<? extends AbstractC858320Xlm<AVTextExtraStruct>> list2, boolean z) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (AVTextExtraStruct aVTextExtraStruct : list) {
            if (aVTextExtraStruct.subType == 18) {
                arrayList.add(aVTextExtraStruct);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<? extends AbstractC858320Xlm<AVTextExtraStruct>> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().LJIILJJIL());
        }
        Iterator it3 = arrayList2.iterator();
        if (!it3.hasNext()) {
            next = null;
        } else {
            next = it3.next();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) next);
                sbLIZ.append(str);
                next = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        String str2 = (String) next;
        if (str2 == null) {
            str2 = "";
        }
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            int i = ((AVTextExtraStruct) it4.next()).end;
            while (it4.hasNext()) {
                int i2 = ((AVTextExtraStruct) it4.next()).end;
                if (i < i2) {
                    i = i2;
                }
            }
            if (i > 0 && str2.length() != 0) {
                int length = str2.length();
                if (i > length) {
                    i = length;
                }
                String strSubstring = str2.substring(0, i);
                if (strSubstring.length() == 0) {
                    return;
                }
                videoPublishEditModel.setChain(strSubstring);
                videoPublishEditModel.setDisableDeleteChain(true);
                if (z) {
                    CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
                    captionModel.chain = strSubstring;
                    captionModel.disableDeleteChain = true;
                    return;
                }
                return;
            }
            return;
        }
        throw new NoSuchElementException();
    }

    public static final void LJIIL(List list, Map map, List list2, List list3) {
        int iIntValue;
        String str;
        if (list3 != null && !list3.isEmpty()) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) it2.next();
                if (C123100dR.LIZ(aVTextExtraStruct.hashTagName)) {
                    Integer num = (Integer) ((LinkedHashMap) map).get(aVTextExtraStruct.hashTagName);
                    String str2 = aVTextExtraStruct.hashTagName;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    map.put(str2, Integer.valueOf(iIntValue));
                } else if (C123100dR.LIZ(aVTextExtraStruct.awemeId) && aVTextExtraStruct.type == 5) {
                    ((ArrayList) list2).add(aVTextExtraStruct.awemeId);
                } else if (aVTextExtraStruct.type == 0 && (str = aVTextExtraStruct.userId) != null) {
                    ((ArrayList) list).add(str);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.util.ArrayList] */
    public static final void LJIIIZ(Activity activity, VideoPublishEditModel videoPublishEditModel, Aweme aweme, int i, String str, boolean z) {
        String str2;
        String title;
        float fFloatValue;
        ?? arrayList;
        List<PhotoModeImageUrlModel> imageList;
        UrlModel playUrl;
        String title2;
        UrlModel playUrl2;
        List<String> urlList;
        List<EditPostBizPermissionStruct> list;
        List<PhotoModeImageUrlModel> imageList2;
        String uri;
        Float musicVolume;
        String str3 = "";
        if (AwemeExtKt.isPhotoMode(aweme)) {
            videoPublishEditModel.setCreationMode(2);
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            String str4 = null;
            if (photoModeImageInfo != null) {
                title = photoModeImageInfo.getTitle();
            } else {
                title = null;
            }
            videoPublishEditModel.setHeading(title);
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (musicVolume = photoModeImageInfo2.getMusicVolume()) != null) {
                fFloatValue = musicVolume.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            videoPublishEditModel.setMusicVolume(fFloatValue);
            PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo3 != null && (imageList2 = photoModeImageInfo3.getImageList()) != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(imageList2, 10));
                int i2 = 0;
                for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList2) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        PhotoModeImageUrlModel photoModeImageUrlModel2 = photoModeImageUrlModel;
                        UrlModel urlModel = photoModeImageUrlModel2.thumbnail;
                        C1431780nMW.LIZ.getClass();
                        String strLIZ = C1431780nMW.LIZ(i2);
                        int height = urlModel.getHeight();
                        int width = urlModel.getWidth();
                        String str5 = photoModeImageUrlModel2.altText;
                        UrlModel urlModel2 = photoModeImageUrlModel2.displayImageNoWatermark;
                        if (urlModel2 != null) {
                            uri = urlModel2.getUri();
                        } else {
                            uri = null;
                        }
                        arrayList.add(new SingleImageData(strLIZ, null, new SrcImageInfo("", height, width, str5, uri), null, null, null, null, null, null, new ImageSynthesisResult("", urlModel.getWidth(), urlModel.getHeight(), null, null, null, null, null, null, 504, null), null, 0, null, null, null, null, false, null, null, null, null, null, false, 8388082, null));
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            videoPublishEditModel.setImageAlbumData(new ImageAlbumData(arrayList, 0, false, null, C1450870nrJ.LIZIZ(), C1450870nrJ.LIZIZ(), null, null, null, null, false, false, false, false, false, false, false, false, null, 0, null, 2097102, null));
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            if (creativeModel.editPostModel == null) {
                creativeModel.editPostModel = new EditPostModel(false, null, null, null, null, null, null, null, null, null, 0L, null, null, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, null);
            }
            EditPostModel editPostModel = videoPublishEditModel.creativeModel.editPostModel;
            if (editPostModel != null) {
                PhotoModeImageInfo photoModeImageInfo4 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo4 != null) {
                    imageList = photoModeImageInfo4.getImageList();
                } else {
                    imageList = null;
                }
                editPostModel.setImageList(imageList);
                Music music = aweme.getMusic();
                if (music != null) {
                    playUrl = music.getPlayUrl();
                } else {
                    playUrl = null;
                }
                editPostModel.setMusicUrlModel(playUrl);
                PhotoModeImageInfo photoModeImageInfo5 = aweme.getPhotoModeImageInfo();
                if (photoModeImageInfo5 != null) {
                    title2 = photoModeImageInfo5.getTitle();
                } else {
                    title2 = null;
                }
                editPostModel.setPhotoModeHeading(title2);
                EditPostPermission editPostPermission = aweme.getEditPostPermission();
                if (editPostPermission != null && (list = editPostPermission.bizPermission) != null) {
                    for (EditPostBizPermissionStruct editPostBizPermissionStruct : list) {
                        if (editPostBizPermissionStruct.bizType == EnumC1379590m0L.IMAGE.getValue() && editPostBizPermissionStruct.bizStatus == C0JMD.SHOW.getValue()) {
                            videoPublishEditModel.creativeModel.imageEditModel.useNewReEditImageExp = true;
                        }
                    }
                }
                if (C568750MSj.LIZIZ(videoPublishEditModel)) {
                    int musicEndTime = aweme.getMusicEndTime() - aweme.getMusicBeginTime();
                    MusicBuzModel musicBuzModel = videoPublishEditModel.creativeModel.musicBuzModel;
                    Music music2 = aweme.getMusic();
                    if (music2 != null && (playUrl2 = music2.getPlayUrl()) != null && (urlList = playUrl2.getUrlList()) != null) {
                        str4 = (String) C13LP.LJJJLZIJ(0, urlList);
                    }
                    musicBuzModel.musicPath = str4;
                    videoPublishEditModel.creativeModel.musicBuzModel.musicVolume = 1.0f;
                    if (aweme.getMusic() != null) {
                        MusicBuzModel musicBuzModel2 = videoPublishEditModel.creativeModel.musicBuzModel;
                        long id = aweme.getMusic().getId();
                        String musicName = aweme.getMusic().getMusicName();
                        if (musicName == null) {
                            musicName = "";
                        }
                        String authorName = aweme.getMusic().getAuthorName();
                        if (authorName != null) {
                            str3 = authorName;
                        }
                        musicBuzModel2.music = new MusicObject(id, null, str3, 0, 0, 0, null, null, null, false, null, null, false, false, null, false, false, null, null, null, 0L, 0, null, null, 0, null, false, false, null, 0, 0, musicName, 0, false, false, null, null, false, 0.0f, null, null, 0, null, 0, 0, false, false, null, null, null, 0, false, false, null, null, null, false, 0, false, null, 0L, 0L, null, 2147483642, Integer.MAX_VALUE, null);
                    }
                    if (musicEndTime >= 15000) {
                        videoPublishEditModel.setMMusicStart(aweme.getMusicBeginTime());
                        videoPublishEditModel.setMMusicEnd(aweme.getMusicEndTime());
                        videoPublishEditModel.setVideoLength(musicEndTime);
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            LJ(videoPublishEditModel, "");
        }
        LIZIZ(videoPublishEditModel, aweme, activity);
        MultiEditVideoStatusRecordData multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData();
        if (multiEditVideoRecordData != null && ((str2 = multiEditVideoRecordData.coverImagePath) == null || str2.length() == 0)) {
            multiEditVideoRecordData.coverImagePath = C383300F1c.LIZJ(videoPublishEditModel.getCreativeInfo());
        }
        videoPublishEditModel.mShootWay = "edit_post";
        C1440930nbH c1440930nbH = new C1440930nbH();
        c1440930nbH.LIZ = aweme.getAid();
        c1440930nbH.LIZIZ = AwemeExtKt.getAuthorUid(aweme);
        c1440930nbH.LIZJ = str;
        c1440930nbH.LIZLLL = Integer.valueOf(aweme.getAwemeType());
        C857150Xjt.LIZIZ = c1440930nbH;
        String str6 = EditPostedVideoPublishActivity._pnsPageId;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//tools/editpost");
        smartRouteBuildRoute.withParam("args", (Serializable) videoPublishEditModel);
        smartRouteBuildRoute.withParam("creative_model", videoPublishEditModel.creativeModel);
        smartRouteBuildRoute.withParam("enter_from_inbox", z);
        smartRouteBuildRoute.open(i);
    }
}
