package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingNodeBuild;
import com.ss.android.ugc.aweme.music.understanding.PipelineNodeConfig;
import com.ss.android.ugc.aweme.services.music.IMusicBridgeService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.0o1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1457450o1v {
    public static final C1457450o1v LIZ = new C1457450o1v();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.ArrayList] */
    public static ContentUnderstandingRequest LIZ(C1457450o1v c1457450o1v, VideoPublishEditModel videoPublishEditModel, List list, C2256608sm c2256608sm, int i) {
        boolean zLJIL;
        int size;
        int i2;
        int i3;
        List<EditVideoSegment> videoList;
        long length;
        int i4;
        List<PipelineNodeConfig> listLIZJ;
        String musicId;
        List<EditVideoSegment> videoList2;
        int iImgAiMusicExtractCount;
        ArrayList arrayList;
        ArrayList arrayList2;
        int size2;
        List<String> list2;
        List<EditVideoSegment> videoList3;
        ?? r10;
        int i5;
        List<PipelineNodeConfig> listLIZIZ;
        String musicId2;
        List<? extends MediaModel> list3;
        C2256608sm c2256608sm2 = c2256608sm;
        ?? arrayList3 = list;
        if ((i & 2) != 0) {
            arrayList3 = C13BV.INSTANCE;
        }
        Integer numValueOf = null;
        if ((i & 4) != 0) {
            c2256608sm2 = null;
        }
        c1457450o1v.getClass();
        int i6 = 1;
        if (!arrayList3.isEmpty()) {
            if (!arrayList3.isEmpty()) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (!C2286708xd.LJIILL((String) it2.next())) {
                        zLJIL = false;
                        break;
                    }
                }
                zLJIL = true;
            } else {
                zLJIL = true;
            }
        } else {
            C1458370o3P.LIZ.getClass();
            zLJIL = C1458370o3P.LJIL(videoPublishEditModel);
        }
        LivePhotoModel livePhotoModel = videoPublishEditModel.creativeModel.livePhotoModel;
        if (livePhotoModel != null && (list3 = livePhotoModel.importedLivePhotoList) != null) {
            size = list3.size();
        } else {
            size = 0;
        }
        String str = "";
        if (zLJIL) {
            if (!arrayList3.isEmpty()) {
                size2 = arrayList3.size();
                r10 = arrayList3;
            } else {
                C1457430o1t c1457430o1t = C1457430o1t.LIZ;
                C2256608sm c2256608sm3 = new C2256608sm(0);
                c1457430o1t.getClass();
                AbstractC1457480o1y abstractC1457480o1yLIZJ = C1457430o1t.LIZJ(videoPublishEditModel, 0, c2256608sm3);
                if (abstractC1457480o1yLIZJ == null) {
                    return new ContentUnderstandingRequest(C13BV.INSTANCE, null, null, null, null, null, null, null, null, null, 0L, 2046, null);
                }
                IMusicBridgeService iMusicBridgeService = (IMusicBridgeService) PluggableExtentionKt.pluggableSpi$default(IMusicBridgeService.class, false, false, false, 14, null);
                if (iMusicBridgeService != null) {
                    iImgAiMusicExtractCount = iMusicBridgeService.imgAiMusicExtractCount();
                } else {
                    iImgAiMusicExtractCount = 5;
                }
                if ((abstractC1457480o1yLIZJ instanceof C573450MeN) || (abstractC1457480o1yLIZJ instanceof C1457520o22)) {
                    arrayList = new ArrayList(((C1457520o22) abstractC1457480o1yLIZJ).LIZIZ);
                } else if (abstractC1457480o1yLIZJ instanceof C1457500o20) {
                    arrayList = new ArrayList(((C1457500o20) abstractC1457480o1yLIZJ).LIZIZ);
                } else if (abstractC1457480o1yLIZJ instanceof C1457470o1x) {
                    arrayList = new ArrayList(((C1457470o1x) abstractC1457480o1yLIZJ).LJFF);
                } else {
                    arrayList = new ArrayList();
                }
                if (arrayList.isEmpty()) {
                    EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                    if (previewInfo != null && (videoList3 = previewInfo.getVideoList()) != null) {
                        ArrayList arrayList4 = new ArrayList();
                        for (EditVideoSegment editVideoSegment : videoList3) {
                            if (C2286708xd.LJIILL(editVideoSegment.getVideoPath())) {
                                arrayList4.add(editVideoSegment);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(((EditVideoSegment) it3.next()).getVideoPath());
                        }
                        arrayList = new ArrayList(arrayList5);
                    } else {
                        arrayList = new ArrayList();
                    }
                }
                if (arrayList.isEmpty() && C1428470nHB.LJZI(videoPublishEditModel)) {
                    CanvasVideoData canvasVideoData = videoPublishEditModel.creativeModel.canvasVideoData;
                    if (canvasVideoData != null && (list2 = canvasVideoData.sourceInfo) != null) {
                        arrayList = new ArrayList(list2);
                    } else {
                        arrayList = new ArrayList();
                    }
                }
                if (arrayList.size() <= iImgAiMusicExtractCount) {
                    arrayList2 = arrayList;
                } else {
                    ArrayList arrayList6 = new ArrayList();
                    float size3 = ((arrayList.size() - 1) * 1.0f) / (iImgAiMusicExtractCount - 1);
                    int i7 = iImgAiMusicExtractCount - 2;
                    if (i7 >= 0) {
                        int i8 = 0;
                        while (true) {
                            arrayList6.add(ListProtector.get(arrayList, Math.round(i8 * size3)));
                            if (i8 == i7) {
                                break;
                            }
                            i8++;
                        }
                    }
                    arrayList6.add(C13LP.LJJLIIIJJI(arrayList));
                    arrayList2 = arrayList6;
                }
                size2 = arrayList.size();
                r10 = arrayList2;
            }
            String creationId = videoPublishEditModel.getCreationId();
            if (creationId != null) {
                str = creationId;
            }
            String strLIZ = C1458580o3k.LIZ(videoPublishEditModel.getCreationId());
            String strLJIILIIL = C1428470nHB.LJIILIIL(videoPublishEditModel);
            String strLJIILL = C1428470nHB.LJIILL(videoPublishEditModel);
            String str2 = videoPublishEditModel.mShootWay;
            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic != null && (musicId2 = aVMusicExtractAVMusic.getMusicId()) != null && musicId2.length() != 0) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            Integer numValueOf2 = Integer.valueOf(i5 ^ 1);
            Integer numValueOf3 = Integer.valueOf(u4.LJLL(videoPublishEditModel) ? 1 : 0);
            if (c2256608sm2 != null) {
                if (c2256608sm2.LIZ != 6) {
                    i6 = 0;
                }
                numValueOf = Integer.valueOf(i6);
            }
            C2257908sz c2257908sz = new C2257908sz(str2, "video_edit_page", numValueOf2, numValueOf3, "cloud_understanding", size2, 0, size, numValueOf, 576);
            IContentUnderstandingNodeBuild iContentUnderstandingNodeBuild = (IContentUnderstandingNodeBuild) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingNodeBuild.class, false, false, false, 14, null);
            if (iContentUnderstandingNodeBuild == null || (listLIZIZ = iContentUnderstandingNodeBuild.LIZIZ()) == null) {
                listLIZIZ = C13BV.INSTANCE;
            }
            return new ContentUnderstandingRequest(r10, null, new AwS547S0100000_3(videoPublishEditModel, 68), str, strLIZ, strLJIILL, strLJIILIIL, c2257908sz, null, listLIZIZ, 0L, 1282, null);
        }
        if (!arrayList3.isEmpty()) {
            Iterator it4 = arrayList3.iterator();
            i2 = 0;
            i3 = 0;
            while (it4.hasNext()) {
                if (C2286708xd.LJIILL((String) it4.next())) {
                    i3++;
                } else {
                    i2++;
                }
            }
        } else {
            EditPreviewInfo previewInfo2 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo2 != null && (videoList = previewInfo2.getVideoList()) != null) {
                Iterator<EditVideoSegment> it5 = videoList.iterator();
                i2 = 0;
                i3 = 0;
                while (it5.hasNext()) {
                    if (C2286708xd.LJIILL(it5.next().getVideoPath())) {
                        i3++;
                    } else {
                        i2++;
                    }
                }
            } else {
                i2 = 0;
                i3 = 0;
            }
        }
        Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        if (!(!arrayList3.isEmpty())) {
            EditPreviewInfo previewInfo3 = videoPublishEditModel.getPreviewInfo();
            if (previewInfo3 != null && (videoList2 = previewInfo3.getVideoList()) != null) {
                arrayList3 = new ArrayList(C15438062q.LJIJJ(videoList2, 10));
                Iterator<EditVideoSegment> it6 = videoList2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(it6.next().getVideoPath());
                }
            } else {
                arrayList3 = C13BV.INSTANCE;
            }
        }
        String creationId2 = videoPublishEditModel.getCreationId();
        if (creationId2 != null) {
            str = creationId2;
        }
        String str3 = (String) C13LP.LJJJLL(arrayList3);
        if (str3 != null && C2286708xd.LIZJ(str3)) {
            length = new C0VSJ(str3).length();
        } else {
            length = 0;
        }
        String strLIZ2 = C1458580o3k.LIZ(videoPublishEditModel.getCreationId());
        String strLJIILIIL2 = C1428470nHB.LJIILIIL(videoPublishEditModel);
        String strLJIILL2 = C1428470nHB.LJIILL(videoPublishEditModel);
        String str4 = videoPublishEditModel.mShootWay;
        AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic2 != null && (musicId = aVMusicExtractAVMusic2.getMusicId()) != null && musicId.length() != 0) {
            i4 = 0;
        } else {
            i4 = 1;
        }
        Integer numValueOf4 = Integer.valueOf(i4 ^ 1);
        Integer numValueOf5 = Integer.valueOf(u4.LJLL(videoPublishEditModel) ? 1 : 0);
        if (c2256608sm2 != null) {
            if (c2256608sm2.LIZ != 6) {
                i6 = 0;
            }
            numValueOf = Integer.valueOf(i6);
        }
        C2257908sz c2257908sz2 = new C2257908sz(str4, "video_edit_page", numValueOf4, numValueOf5, "cloud_understanding", iIntValue2, iIntValue, size, numValueOf, 512);
        IContentUnderstandingNodeBuild iContentUnderstandingNodeBuild2 = (IContentUnderstandingNodeBuild) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingNodeBuild.class, false, false, false, 14, null);
        if (iContentUnderstandingNodeBuild2 == null || (listLIZJ = iContentUnderstandingNodeBuild2.LIZJ()) == null) {
            listLIZJ = C13BV.INSTANCE;
        }
        return new ContentUnderstandingRequest(arrayList3, null, new AwS547S0100000_3(videoPublishEditModel, 69), str, strLIZ2, strLJIILL2, strLJIILIIL2, c2257908sz2, null, listLIZJ, length, 258, null);
    }
}
