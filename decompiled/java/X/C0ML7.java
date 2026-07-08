package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.forward.OnThisDayPostData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ML7, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ML7 {
    public static final C0ML7 LIZ = new C0ML7();
    public static String LIZIZ = "has_post";

    public static void LJIIJ(VideoPublishEditModel videoPublishEditModel) {
        C0LAB c0lab = new C0LAB();
        LIZ.getClass();
        LIZIZ(videoPublishEditModel, c0lab);
        LIZJ(videoPublishEditModel.creativeModel, c0lab);
        C0ML9.LIZIZ(videoPublishEditModel.creativeModel, c0lab);
        c0lab.LJ("enter_method", LIZIZ);
        LIZLLL(videoPublishEditModel, c0lab);
        C20684815ws.LJIILLIIL("enter_on_this_day_page", c0lab.LIZ);
    }

    public static void LJIIZILJ(VideoPublishEditModel videoPublishEditModel) {
        List<EditVideoSegment> videoList;
        HashSet hashSetLLIFFJFJJ;
        List<String> list;
        ArrayList<OnThisDayPostData> postDataList;
        ArrayList<String> resList;
        ArrayList<String> resList2;
        List<SingleImageData> imageList;
        if (videoPublishEditModel.creativeModel.onThisDayData.isFromOnThisDay() && C566780MKu.LIZ(videoPublishEditModel.creativeModel)) {
            CreativeModel creativeModel = videoPublishEditModel.creativeModel;
            int i = 0;
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
                if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                    Iterator<SingleImageData> it2 = imageList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C0VSJ(it2.next().getSrcImageInfo().getPath()).getName());
                    }
                    hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList);
                } else {
                    return;
                }
            } else if (videoPublishEditModel.getCanvasVideoData() != null) {
                CanvasVideoData canvasVideoData = creativeModel.canvasVideoData;
                if (canvasVideoData != null && (list = canvasVideoData.sourceInfo) != null) {
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<String> it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new C0VSJ(it3.next()).getName());
                    }
                    hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList2);
                } else {
                    return;
                }
            } else {
                EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
                if (previewInfo != null && (videoList = previewInfo.getVideoList()) != null) {
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(videoList, 10));
                    Iterator<EditVideoSegment> it4 = videoList.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(new C0VSJ(it4.next().getVideoPath()).getName());
                    }
                    hashSetLLIFFJFJJ = C13LP.LLIFFJFJJ(arrayList3);
                } else {
                    return;
                }
            }
            if (hashSetLLIFFJFJJ != null && (postDataList = videoPublishEditModel.creativeModel.onThisDayData.getPostDataList()) != null) {
                int i2 = 0;
                for (OnThisDayPostData onThisDayPostData : postDataList) {
                    if (onThisDayPostData.getRecallType() == 0 && (resList2 = onThisDayPostData.getResList()) != null) {
                        Iterator<String> it5 = resList2.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                break;
                            }
                            String next = it5.next();
                            if (hashSetLLIFFJFJJ.contains(next)) {
                                if (next != null) {
                                    i2++;
                                }
                            }
                        }
                    }
                    if (onThisDayPostData.getRecallType() == 1 && (resList = onThisDayPostData.getResList()) != null) {
                        Iterator<String> it6 = resList.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                break;
                            }
                            String next2 = it6.next();
                            if (hashSetLLIFFJFJJ.contains(next2)) {
                                if (next2 != null) {
                                    i++;
                                }
                            }
                        }
                    }
                    creativeModel.onThisDayData.setPostCnt(i2);
                    creativeModel.onThisDayData.setStoryCnt(i);
                }
            }
        }
    }

    public static void LIZ(CreativeModel creativeModel, C0LAB c0lab) {
        String celebrationShootWay;
        CelebrationData celebrationData;
        CreativeInfo creativeInfo;
        String creationId = null;
        if (creativeModel != null && (creativeInfo = creativeModel.creativeInfo) != null) {
            creationId = creativeInfo.getCreationId();
        }
        c0lab.LJ("creation_id", creationId);
        if (creativeModel == null || (celebrationData = creativeModel.celebrationData) == null || (celebrationShootWay = celebrationData.getCelebrationShootWay()) == null || celebrationShootWay.length() == 0) {
            celebrationShootWay = "on_this_day";
        }
        c0lab.LJ("shoot_way", celebrationShootWay);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
    }

    public static void LIZJ(CreativeModel creativeModel, C0LAB c0lab) {
        CelebrationData celebrationData;
        if (creativeModel != null && (celebrationData = creativeModel.celebrationData) != null) {
            boolean hasPoster = celebrationData.getHasPoster();
            c0lab.LIZ(celebrationData.getContentCnt(), "content_cnt");
            c0lab.LIZ(celebrationData.getPostCnt(), "post_cnt");
            c0lab.LIZ(celebrationData.getStoryCnt(), "story_cnt");
            c0lab.LIZ(celebrationData.getLocalCnt(), "local_cnt");
            c0lab.LIZ(hasPoster ? 1 : 0, "auto_cnt");
        }
    }

    public static void LIZLLL(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList<OnThisDayPostData> postDataList = videoPublishEditModel.creativeModel.onThisDayData.getPostDataList();
        if (postDataList != null) {
            Iterator<OnThisDayPostData> it2 = postDataList.iterator();
            while (it2.hasNext()) {
                int recallType = it2.next().getRecallType();
                if (recallType != 1) {
                    if (recallType != 2) {
                        linkedHashSet.add("post");
                    } else {
                        linkedHashSet.add("local");
                    }
                } else {
                    linkedHashSet.add("story");
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet.add("no_content");
        }
        c0lab.LJ("on_this_day_content_type_list", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62));
    }

    public static void LJ(C0LAB c0lab, List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ForwardMedia forwardMedia = (ForwardMedia) it2.next();
                if (forwardMedia.isStory()) {
                    linkedHashSet.add("story");
                } else if (forwardMedia.localMedia != null) {
                    linkedHashSet.add("local");
                } else {
                    linkedHashSet.add("post");
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            linkedHashSet.add("no_content");
        }
        c0lab.LJ("on_this_day_content_type_list", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62));
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r13, X.C0LAB r14) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ML7.LJFF(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, X.0LAB):void");
    }

    public static String LJII(int i, String str) {
        if (i == 2 && u.LJJIIJZLJL(str, "content:", false)) {
            return str;
        }
        return new C0VSJ(str).getName();
    }

    public static void LJI(C0LAB c0lab, List list, CreativeModel creativeModel) {
        int i;
        int i2;
        int i3;
        CelebrationData celebrationData;
        if (!C566780MKu.LIZ(creativeModel) || list == null) {
            return;
        }
        c0lab.LIZ(list.size(), "content_cnt");
        int i4 = 1;
        if (list.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                ForwardMedia forwardMedia = (ForwardMedia) it2.next();
                if (!forwardMedia.isStory() && forwardMedia.localMedia == null && (i = i + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c0lab.LIZ(i, "post_cnt");
        if (list.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = list.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                ForwardMedia forwardMedia2 = (ForwardMedia) it3.next();
                if (forwardMedia2.isStory() && forwardMedia2.localMedia == null && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c0lab.LIZ(i2, "story_cnt");
        if (list.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it4 = list.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if (((ForwardMedia) it4.next()).localMedia != null && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        c0lab.LIZ(i3, "local_cnt");
        if (creativeModel == null || (celebrationData = creativeModel.celebrationData) == null || !celebrationData.getHasPoster()) {
            i4 = 0;
        }
        c0lab.LIZ(i4, "auto_cnt");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(CreativeModel creativeModel, List list, Function2 function2) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            OnThisDayTiktokMediaModel onThisDayTiktokMediaModel = (OnThisDayTiktokMediaModel) it2.next();
            if (onThisDayTiktokMediaModel.loadSource != EnumC538220L8y.RECALL_MEDIA) {
                String str2 = ((MediaModel) onThisDayTiktokMediaModel).id;
                Object onThisDayPostData = linkedHashMap.get(str2);
                if (onThisDayPostData == null) {
                    onThisDayPostData = new OnThisDayPostData(((MediaModel) onThisDayTiktokMediaModel).id, 2, new ArrayList());
                    linkedHashMap.put(str2, onThisDayPostData);
                }
                ArrayList<String> resList = ((OnThisDayPostData) onThisDayPostData).getResList();
                if (resList != 0) {
                    resList.add(function2.invoke(onThisDayTiktokMediaModel.LJFF(), 2));
                }
                arrayList.add(onThisDayTiktokMediaModel.mimeType);
            } else {
                ForwardMedia forwardMedia = onThisDayTiktokMediaModel.forwardMedia;
                if (forwardMedia != null) {
                    C0MKJ.LIZ.getClass();
                    int iLJIILLIIL = C0MKJ.LJIILLIIL(forwardMedia);
                    String str3 = forwardMedia.sourceId;
                    Object onThisDayPostData2 = linkedHashMap.get(str3);
                    if (onThisDayPostData2 == null) {
                        MediaModel mediaModel = forwardMedia.localMedia;
                        if (mediaModel != null) {
                            str = mediaModel.id;
                        } else {
                            str = forwardMedia.sourceId;
                        }
                        onThisDayPostData2 = new OnThisDayPostData(str, iLJIILLIIL, new ArrayList());
                        linkedHashMap.put(str3, onThisDayPostData2);
                    }
                    ArrayList<String> resList2 = ((OnThisDayPostData) onThisDayPostData2).getResList();
                    if (resList2 != 0) {
                        resList2.add(function2.invoke(onThisDayTiktokMediaModel.LJFF(), Integer.valueOf(iLJIILLIIL)));
                    }
                }
            }
        }
        ArrayList<OnThisDayPostData> arrayList2 = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (OnThisDayPostData onThisDayPostData3 : linkedHashMap.values()) {
            arrayList2.add(onThisDayPostData3);
            if (onThisDayPostData3.getRecallType() == 0) {
                i++;
            } else if (onThisDayPostData3.getRecallType() == 1) {
                i2++;
            } else {
                i3++;
            }
        }
        creativeModel.onThisDayData.setPostDataList(arrayList2);
        creativeModel.onThisDayData.setPostCnt(i);
        creativeModel.onThisDayData.setStoryCnt(i2);
        creativeModel.onThisDayData.setLocalCnt(i3);
        creativeModel.onThisDayData.setLocalMediaMimeType(arrayList);
    }

    public static void LJIILIIL(String str, String str2, List list) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action_type", str);
        c0lab.LJ("error_msg", str2);
        c0lab.LJ("mime_type", strLJJLIIIJ);
        C20684815ws.LJIILLIIL("tools_performance_on_this_day_local_media_error", c0lab.LIZ);
    }

    public static void LJIIL(int i, String str, String str2, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (str != null) {
            c0lab.LJ("music_id", str);
        }
        if (str2 != null) {
            c0lab.LJ("error_msg", str2);
        }
        c0lab.LJFF("is_local_asset", z);
        C20684815ws.LJIILLIIL("past_memory_auto_music", c0lab.LIZ);
    }

    public static void LJIILLIIL(VideoPublishEditModel videoPublishEditModel, int i, int i2, List list) {
        String str;
        if (list == null) {
            return;
        }
        ForwardMedia forwardMedia = (ForwardMedia) C13LP.LJJJLZIJ(i, list);
        ForwardMedia forwardMedia2 = (ForwardMedia) C13LP.LJJJLZIJ(i2, list);
        C0LAB c0lab = new C0LAB();
        LIZ.getClass();
        LIZIZ(videoPublishEditModel, c0lab);
        c0lab.LIZ(i + 1, "from_pos");
        c0lab.LIZ(i2 + 1, "to_pos");
        String str2 = "post";
        String str3 = "permission";
        if (forwardMedia == null) {
            str = "permission";
        } else if (forwardMedia.isStory()) {
            str = "story";
        } else if (forwardMedia.localMedia == null) {
            str = "post";
        } else {
            str = "local";
        }
        c0lab.LJ("from_content_type", str);
        if (forwardMedia2 != null) {
            if (forwardMedia2.isStory()) {
                str2 = "story";
            } else if (forwardMedia2.localMedia != null) {
                str2 = "local";
            }
            str3 = str2;
        }
        c0lab.LJ("to_content_type", str3);
        C0ML9.LIZIZ(videoPublishEditModel.creativeModel, c0lab);
        c0lab.LJ("on_this_day_enter_method", LIZIZ);
        LJ(c0lab, list);
        C20684815ws.LJIILLIIL("on_this_day_slide", c0lab.LIZ);
    }

    public static void LJIIIZ(VideoPublishEditModel videoPublishEditModel, int i, String str, String str2, List list) {
        C0LAB c0lab = new C0LAB();
        LIZ.getClass();
        LIZIZ(videoPublishEditModel, c0lab);
        c0lab.LJ("type", "photo");
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LJ("photo_status", str);
        c0lab.LJ("on_this_day_permission_popup_type", str2);
        c0lab.LJ("on_this_day_enter_method", LIZIZ);
        LJ(c0lab, list);
        C20684815ws.LJIILLIIL("asking_permission_action", c0lab.LIZ);
    }

    public static void LJIILJJIL(VideoPublishEditModel videoPublishEditModel, String str, String str2, String str3, List list) {
        C0LAB c0lab = new C0LAB();
        LIZ.getClass();
        LIZIZ(videoPublishEditModel, c0lab);
        c0lab.LJ("popup_type", str);
        c0lab.LJ("action_type", str2);
        c0lab.LJ("enter_method", str3);
        LJ(c0lab, list);
        C20684815ws.LJIILLIIL("on_this_day_local_permission", c0lab.LIZ);
    }

    public static void LJIIJJI(int i, int i2, int i3, long j, String str, String str2) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZIZ(j, "duration");
        c0lab.LIZ(i2, "video_cnt");
        c0lab.LIZ(i3, "image_cnt");
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        c0lab.LJ("error_msg", str2);
        C20684815ws.LJIILLIIL("tools_performance_on_this_day_download_post", c0lab.LIZ);
    }

    public static void LJIILL(CreativeModel creativeModel, boolean z, boolean z2, boolean z3, String str, List list) {
        C0LAB c0lab = new C0LAB();
        LIZ.getClass();
        LIZ(creativeModel, c0lab);
        C0ML9.LIZ(creativeModel, c0lab);
        LIZJ(creativeModel, c0lab);
        LJ(c0lab, list);
        c0lab.LIZ(z ? 1 : 0, "is_select_all");
        c0lab.LIZ(z2 ? 1 : 0, "is_default_select");
        c0lab.LIZ(z3 ? 1 : 0, "is_preview");
        c0lab.LJ("select_content_type", str);
        c0lab.LJ("on_this_day_enter_method", LIZIZ);
        C20684815ws.LJIILLIIL("on_this_day_select", c0lab.LIZ);
    }
}
